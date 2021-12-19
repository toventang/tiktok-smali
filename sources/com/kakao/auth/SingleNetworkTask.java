package com.kakao.auth;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.auth.AuthService;
import com.kakao.auth.ageauth.DefaultAgeAuthService;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.authorization.accesstoken.AccessTokenManager;
import com.kakao.auth.authorization.authcode.AuthCodeManager;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.auth.network.response.AuthorizedApiResponse;
import com.kakao.auth.network.response.InsufficientScopeException;
import com.kakao.network.ErrorResult;
import com.kakao.network.INetwork;
import com.kakao.network.IRequest;
import com.kakao.network.KakaoNetworkImpl;
import com.kakao.network.NetworkTask;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseData;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.util.helper.log.Logger;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class SingleNetworkTask extends NetworkTask {
    static {
        Covode.recordClassIndex(34258);
    }

    /* access modifiers changed from: package-private */
    public AuthType getAuthType() {
        return AuthType.KAKAO_ACCOUNT;
    }

    public SingleNetworkTask() {
        super(new KakaoNetworkImpl());
    }

    /* access modifiers changed from: package-private */
    public Activity getTopActivity() {
        MethodCollector.i(7794);
        Activity currentActivity = KakaoSDK.getCurrentActivity();
        if (currentActivity == null) {
            int i2 = 0;
            while (currentActivity == null && i2 < 3) {
                i2++;
                try {
                    Thread.sleep(500);
                    currentActivity = KakaoSDK.getCurrentActivity();
                } catch (InterruptedException unused) {
                }
            }
        }
        MethodCollector.o(7794);
        return currentActivity;
    }

    private static boolean checkApiSession() {
        Session currentSession = Session.getCurrentSession();
        if (currentSession.isOpened()) {
            return true;
        }
        Logger.i("access token expired... trying to refresh access token...", new Object[0]);
        if (currentSession.getTokenInfo().hasRefreshToken()) {
            try {
                AccessTokenManager.Factory.getInstance().refreshAccessToken(currentSession.getTokenInfo().getRefreshToken(), currentSession.getAccessTokenCallback()).get();
                return true;
            } catch (Exception e2) {
                Logger.e("exception: " + e2.toString());
            }
        }
        return false;
    }

    public SingleNetworkTask(INetwork iNetwork) {
        super(iNetwork);
    }

    private static int getErrorCode(ResponseBody responseBody) {
        try {
            if (responseBody.has("code")) {
                return responseBody.getInt("code");
            }
            return -888;
        } catch (ResponseBody.ResponseBodyException e2) {
            Logger.e("exception while getting error code: " + e2.toString());
            return -888;
        }
    }

    public synchronized ResponseBody requestAuth(IRequest iRequest) {
        ResponseBody responseBody;
        MethodCollector.i(7904);
        ResponseData request = request(iRequest);
        Logger.d("++ [%s]response : %s", Integer.valueOf(request.getHttpStatusCode()), request.getStringData());
        responseBody = new ResponseBody(request.getHttpStatusCode(), request.getData());
        MethodCollector.o(7904);
        return responseBody;
    }

    public synchronized ResponseData requestApi(IRequest iRequest) {
        MethodCollector.i(7827);
        if (checkApiSession()) {
            ResponseData request = request(iRequest);
            Logger.d("++ [%s]response : %s", Integer.valueOf(request.getHttpStatusCode()), request.getStringData());
            if (request.getHttpStatusCode() == 200 || !handleApiError(request)) {
                MethodCollector.o(7827);
                return request;
            }
            ResponseData requestApi = requestApi(iRequest);
            MethodCollector.o(7827);
            return requestApi;
        }
        AuthorizedApiResponse.SessionClosedException sessionClosedException = new AuthorizedApiResponse.SessionClosedException("Application Session is Closed.");
        MethodCollector.o(7827);
        throw sessionClosedException;
    }

    private boolean handleApiError(ResponseData responseData) {
        AccessToken accessToken;
        ResponseBody responseBody = new ResponseBody(responseData.getHttpStatusCode(), responseData.getData());
        if (getErrorCode(responseBody) == -401) {
            Session currentSession = Session.getCurrentSession();
            currentSession.getTokenInfo().clearAccessToken();
            if (!currentSession.getTokenInfo().hasRefreshToken() || (accessToken = AccessTokenManager.Factory.getInstance().refreshAccessToken(currentSession.getTokenInfo().getRefreshToken(), currentSession.getAccessTokenCallback()).get()) == null) {
                return false;
            }
            return accessToken.hasValidAccessToken();
        } else if (getErrorCode(responseBody) == -402) {
            return requestScopesUpdateBlocking(getAuthType(), getTopActivity(), responseBody).hasValidAccessToken();
        } else {
            if (getErrorCode(responseBody) != -405) {
                return false;
            }
            int requestAgeAuth = DefaultAgeAuthService.getInstance().requestAgeAuth(null, getTopActivity());
            if (requestAgeAuth == AuthService.AgeAuthStatus.SUCCESS.getValue() || requestAgeAuth == AuthService.AgeAuthStatus.ALREADY_AGE_AUTHORIZED.getValue()) {
                return true;
            }
            return false;
        }
    }

    private AccessToken requestScopesUpdateBlocking(AuthType authType, Activity activity, ResponseBody responseBody) {
        List<String> list;
        if (responseBody.has("required_scopes")) {
            try {
                list = ResponseStringConverter.IDENTITY_CONVERTER.convertList(responseBody.getJson().optJSONArray("required_scopes"));
            } catch (ResponseBody.ResponseBodyException unused) {
                throw new InsufficientScopeException(responseBody);
            }
        } else {
            list = null;
        }
        return requestScopesUpdate(authType, activity, list);
    }

    private AccessToken requestScopesUpdate(final AuthType authType, final Activity activity, final List<String> list) {
        final AuthCodeManager instance = AuthCodeManager.Factory.getInstance();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AnonymousClass1 r9 = new AuthCodeCallback() {
            /* class com.kakao.auth.SingleNetworkTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34259);
            }

            @Override // com.kakao.auth.AuthCodeCallback
            public void onAuthCodeFailure(ErrorResult errorResult) {
                atomicReference2.set(errorResult.getException());
                countDownLatch.countDown();
            }

            @Override // com.kakao.auth.AuthCodeCallback
            public void onAuthCodeReceived(String str) {
                atomicReference.set(str);
                countDownLatch.countDown();
            }
        };
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.kakao.auth.SingleNetworkTask.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34260);
            }

            public void run() {
                try {
                    instance.requestAuthCodeWithScopes(authType, new StartActivityWrapper(activity), list, r9);
                } catch (Exception e2) {
                    atomicReference2.set(e2);
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            atomicReference2.set(e2);
        }
        if (atomicReference2.get() == null) {
            String str = (String) atomicReference.get();
            if (str != null) {
                try {
                    return AccessTokenManager.Factory.getInstance().requestAccessTokenByAuthCode(str, Session.getCurrentSession().getAccessTokenCallback()).get();
                } catch (Exception e3) {
                    Logger.e(e3);
                    throw new InsufficientScopeException(e3.toString());
                }
            } else {
                throw new InsufficientScopeException("Failed to get authorization code while requesting dynamic scope update.");
            }
        } else {
            throw new InsufficientScopeException(atomicReference2.toString());
        }
    }
}
