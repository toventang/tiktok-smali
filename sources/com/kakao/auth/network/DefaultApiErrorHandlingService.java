package com.kakao.auth.network;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.AuthCodeCallback;
import com.kakao.auth.AuthService;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISession;
import com.kakao.auth.ageauth.AgeAuthService;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.helper.CurrentActivityProvider;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.auth.network.response.InsufficientScopeException;
import com.kakao.network.ErrorResult;
import com.kakao.network.response.ApiResponseStatusError;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.util.helper.log.Logger;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

class DefaultApiErrorHandlingService implements ApiErrorHandlingService {
    private CurrentActivityProvider activityProvider;
    private AgeAuthService ageAuthService;
    private ISession session;

    static {
        Covode.recordClassIndex(34329);
    }

    DefaultApiErrorHandlingService() {
    }

    /* access modifiers changed from: package-private */
    public boolean shouldRetryAfterAgeAuth() {
        int requestAgeAuth = this.ageAuthService.requestAgeAuth(new Bundle(), this.activityProvider.getCurrentActivity());
        if (requestAgeAuth == AuthService.AgeAuthStatus.SUCCESS.getValue() || requestAgeAuth == AuthService.AgeAuthStatus.ALREADY_AGE_AUTHORIZED.getValue()) {
            return true;
        }
        return false;
    }

    @Override // com.kakao.auth.network.ApiErrorHandlingService
    public boolean shouldRetryAfterTryingRefreshToken() {
        if (!this.session.getTokenInfo().hasValidRefreshToken()) {
            return false;
        }
        try {
            AccessToken accessToken = this.session.refreshAccessToken(null).get();
            if (accessToken == null || !accessToken.hasValidAccessToken()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public void setActivityProvider(CurrentActivityProvider currentActivityProvider) {
        this.activityProvider = currentActivityProvider;
    }

    public void setAgeAuthService(AgeAuthService ageAuthService2) {
        this.ageAuthService = ageAuthService2;
    }

    public void setSession(ISession iSession) {
        this.session = iSession;
    }

    /* access modifiers changed from: package-private */
    public static class ScopeAuthCodeCallback extends AuthCodeCallback {
        private final AtomicReference<String> authCodeResult;
        private final AtomicReference<Exception> exception;
        private final CountDownLatch lock;

        static {
            Covode.recordClassIndex(34330);
        }

        @Override // com.kakao.auth.AuthCodeCallback
        public void onAuthCodeFailure(ErrorResult errorResult) {
            this.exception.set(errorResult.getException());
            this.lock.countDown();
        }

        @Override // com.kakao.auth.AuthCodeCallback
        public void onAuthCodeReceived(String str) {
            this.authCodeResult.set(str);
            this.lock.countDown();
        }

        ScopeAuthCodeCallback(AtomicReference<String> atomicReference, CountDownLatch countDownLatch, AtomicReference<Exception> atomicReference2) {
            this.authCodeResult = atomicReference;
            this.lock = countDownLatch;
            this.exception = atomicReference2;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldRetryAfterScopesUpdate(ResponseBody responseBody) {
        List<String> list;
        if (responseBody.has("required_scopes")) {
            try {
                list = ResponseStringConverter.IDENTITY_CONVERTER.convertList(responseBody.getJSONArray("required_scopes"));
            } catch (ResponseBody.ResponseBodyException unused) {
                throw new InsufficientScopeException(responseBody.toString());
            }
        } else {
            list = null;
        }
        try {
            return requestScopesUpdate(AuthType.KAKAO_ACCOUNT, list).get().hasValidAccessToken();
        } catch (InterruptedException | ExecutionException e2) {
            throw new InsufficientScopeException(e2.getMessage());
        }
    }

    @Override // com.kakao.auth.network.ApiErrorHandlingService
    public boolean shouldRetryWithApiError(ApiResponseStatusError apiResponseStatusError) {
        int errorCode = apiResponseStatusError.getErrorCode();
        if (errorCode == -405) {
            return shouldRetryAfterAgeAuth();
        }
        if (errorCode == -402) {
            return shouldRetryAfterScopesUpdate(apiResponseStatusError.getErrorResponse());
        }
        if (errorCode != -401) {
            return false;
        }
        return shouldRetryAfterTryingRefreshToken();
    }

    public Future<AccessToken> requestScopesUpdate(AuthType authType, List<String> list) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.session.getAuthCodeManager().requestAuthCodeWithScopes(authType, new StartActivityWrapper(this.activityProvider.getCurrentActivity()), list, new ScopeAuthCodeCallback(atomicReference, countDownLatch, atomicReference2));
        } catch (Exception e2) {
            Logger.e(e2.toString());
            atomicReference2.set(e2);
            countDownLatch.countDown();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e3) {
            atomicReference2.set(e3);
            Logger.e(e3.toString());
        }
        if (atomicReference2.get() == null) {
            String str = (String) atomicReference.get();
            if (str != null) {
                try {
                    return this.session.getAccessTokenManager().requestAccessTokenByAuthCode(str, this.session.getAccessTokenCallback());
                } catch (Exception e4) {
                    Logger.e(e4);
                    throw new InsufficientScopeException(e4.toString());
                }
            } else {
                Logger.e("auth code null");
                throw new InsufficientScopeException("Failed to get authorization code while requesting dynamic scope update.");
            }
        } else {
            throw new InsufficientScopeException(((Exception) atomicReference2.get()).toString());
        }
    }
}
