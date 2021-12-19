package com.kakao.auth;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.authorization.accesstoken.AccessTokenManager;
import com.kakao.auth.authorization.authcode.AuthCodeManager;
import com.kakao.auth.authorization.authcode.AuthorizationCode;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.common.KakaoContextService;
import com.kakao.network.ErrorResult;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.SharedPreferencesCache;
import com.kakao.util.helper.log.Logger;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class Session implements ISession {
    private static Session currentSession;
    public final Object INSTANCE_LOCK;
    private AccessToken accessToken;
    private AccessTokenCallback accessTokenCallback;
    public AccessTokenManager accessTokenManager;
    private final PendingIntent alarmIntent;
    private final SharedPreferencesCache appCache;
    private AuthCodeCallback authCodeCallback;
    private AuthCodeManager authCodeManager;
    private AuthService authService;
    public AuthorizationCode authorizationCode;
    private final List<ISessionCallback> callbacks;
    private final Context context;
    private final KakaoContextService contextService;
    public volatile RequestType requestType;
    private final AlarmManager tokenAlarmManager;

    static {
        Covode.recordClassIndex(34250);
    }

    public SharedPreferencesCache getAppCache() {
        return this.appCache;
    }

    /* access modifiers changed from: package-private */
    public List<ISessionCallback> getCallbacks() {
        return this.callbacks;
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return this.context;
    }

    @Override // com.kakao.auth.ISession
    public void close() {
        internalClose(null);
    }

    public void deregisterTokenManager() {
        this.tokenAlarmManager.cancel(this.alarmIntent);
    }

    public boolean checkAndImplicitOpen() {
        if (isClosed() || !implicitOpen()) {
            return false;
        }
        return true;
    }

    @Override // com.kakao.auth.ISession
    public synchronized AccessTokenManager getAccessTokenManager() {
        AccessTokenManager accessTokenManager2;
        MethodCollector.i(10191);
        accessTokenManager2 = this.accessTokenManager;
        MethodCollector.o(10191);
        return accessTokenManager2;
    }

    public final String getAppKey() {
        return this.contextService.phaseInfo().appKey();
    }

    @Override // com.kakao.auth.ISession
    public synchronized AuthCodeManager getAuthCodeManager() {
        AuthCodeManager authCodeManager2;
        MethodCollector.i(10034);
        authCodeManager2 = this.authCodeManager;
        MethodCollector.o(10034);
        return authCodeManager2;
    }

    public static synchronized Session getCurrentSession() {
        Session session;
        synchronized (Session.class) {
            MethodCollector.i(10033);
            session = currentSession;
            if (session != null) {
                MethodCollector.o(10033);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Session is not initialized. Call KakaoSDK#init first.");
                MethodCollector.o(10033);
                throw illegalStateException;
            }
        }
        return session;
    }

    /* access modifiers changed from: package-private */
    public void checkAccessTokenInfo() {
        if (isClosed()) {
            deregisterTokenManager();
        } else if (isOpenable()) {
            implicitOpen();
        } else {
            this.authService.requestAccessTokenInfo(new ApiResponseCallback<AccessTokenInfoResponse>() {
                /* class com.kakao.auth.Session.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(34254);
                }

                @Override // com.kakao.auth.ApiResponseCallback
                public void onNotSignedUp() {
                }

                @Override // com.kakao.auth.ApiResponseCallback
                public void onSessionClosed(ErrorResult errorResult) {
                    Session.this.deregisterTokenManager();
                }

                @Override // com.kakao.network.callback.ResponseCallback, com.kakao.auth.ApiResponseCallback
                public void onFailure(ErrorResult errorResult) {
                    Session.this.registerTokenManager(300000);
                }

                public void onSuccess(AccessTokenInfoResponse accessTokenInfoResponse) {
                    Session.this.registerTokenManager(Math.min(10800000L, accessTokenInfoResponse.getExpiresInMillis()));
                }
            });
        }
    }

    @Override // com.kakao.auth.ISession
    public void clearCallbacks() {
        MethodCollector.i(11166);
        synchronized (this.callbacks) {
            try {
                this.callbacks.clear();
            } finally {
                MethodCollector.o(11166);
            }
        }
    }

    public final String getAccessToken() {
        String str;
        MethodCollector.i(12270);
        synchronized (this.INSTANCE_LOCK) {
            try {
                AccessToken accessToken2 = this.accessToken;
                if (accessToken2 == null) {
                    str = null;
                } else {
                    str = accessToken2.getAccessToken();
                }
            } finally {
                MethodCollector.o(12270);
            }
        }
        return str;
    }

    public final String getRefreshToken() {
        String str;
        MethodCollector.i(12271);
        synchronized (this.INSTANCE_LOCK) {
            try {
                AccessToken accessToken2 = this.accessToken;
                if (accessToken2 == null) {
                    str = null;
                } else {
                    str = accessToken2.getRefreshToken();
                }
            } finally {
                MethodCollector.o(12271);
            }
        }
        return str;
    }

    public RequestType getRequestType() {
        RequestType requestType2;
        MethodCollector.i(10828);
        synchronized (this.INSTANCE_LOCK) {
            try {
                requestType2 = this.requestType;
            } finally {
                MethodCollector.o(10828);
            }
        }
        return requestType2;
    }

    @Override // com.kakao.auth.ISession
    public final AccessToken getTokenInfo() {
        AccessToken accessToken2;
        MethodCollector.i(10829);
        synchronized (this.INSTANCE_LOCK) {
            try {
                accessToken2 = this.accessToken;
            } finally {
                MethodCollector.o(10829);
            }
        }
        return accessToken2;
    }

    public final boolean hasValidAccessToken() {
        boolean z;
        MethodCollector.i(12420);
        synchronized (this.INSTANCE_LOCK) {
            try {
                AccessToken accessToken2 = this.accessToken;
                if (accessToken2 == null || !accessToken2.hasValidAccessToken()) {
                    z = false;
                } else {
                    z = true;
                }
            } finally {
                MethodCollector.o(12420);
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean implicitOpen() {
        if (!getTokenInfo().hasValidRefreshToken()) {
            return false;
        }
        internalOpen(null, null, null, null, null, null);
        return true;
    }

    public void invalidateAccessToken() {
        MethodCollector.i(12422);
        synchronized (this.INSTANCE_LOCK) {
            try {
                this.accessToken.clearAccessToken();
                this.accessToken.clearRefreshToken();
            } finally {
                MethodCollector.o(12422);
            }
        }
    }

    public boolean isAvailableOpenByRefreshToken() {
        if (isOpened() || getTokenInfo().hasValidRefreshToken()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean isRefreshingAccessToken() {
        MethodCollector.i(10827);
        if (this.requestType == RequestType.REFRESHING_ACCESS_TOKEN) {
            MethodCollector.o(10827);
            return true;
        }
        MethodCollector.o(10827);
        return false;
    }

    public void removeAccessToken() {
        MethodCollector.i(12421);
        synchronized (this.INSTANCE_LOCK) {
            try {
                AccessToken accessToken2 = this.accessToken;
                if (accessToken2 != null) {
                    accessToken2.clearAccessToken();
                }
            } finally {
                MethodCollector.o(12421);
            }
        }
    }

    public void removeRefreshToken() {
        MethodCollector.i(12423);
        synchronized (this.INSTANCE_LOCK) {
            try {
                AccessToken accessToken2 = this.accessToken;
                if (accessToken2 != null) {
                    accessToken2.clearRefreshToken();
                }
            } finally {
                MethodCollector.o(12423);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public enum RequestType {
        GETTING_AUTHORIZATION_CODE,
        GETTING_ACCESS_TOKEN,
        REFRESHING_ACCESS_TOKEN;

        static {
            Covode.recordClassIndex(34257);
        }
    }

    @Override // com.kakao.auth.ISession
    public AccessTokenCallback getAccessTokenCallback() {
        MethodCollector.i(11481);
        if (this.accessTokenCallback == null) {
            synchronized (Session.class) {
                try {
                    if (this.accessTokenCallback == null) {
                        this.accessTokenCallback = new AccessTokenCallback() {
                            /* class com.kakao.auth.Session.AnonymousClass5 */

                            static {
                                Covode.recordClassIndex(34256);
                            }

                            @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
                            public void onAccessTokenFailure(ErrorResult errorResult) {
                                Session.this.onAccessTokenFailure(errorResult);
                            }

                            @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
                            public void onAccessTokenReceived(AccessToken accessToken) {
                                Session.this.onAccessTokenReceived(accessToken);
                            }
                        };
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11481);
                    throw th;
                }
            }
        }
        AccessTokenCallback accessTokenCallback2 = this.accessTokenCallback;
        MethodCollector.o(11481);
        return accessTokenCallback2;
    }

    public AuthCodeCallback getAuthCodeCallback() {
        MethodCollector.i(11323);
        if (this.authCodeCallback == null) {
            synchronized (Session.class) {
                try {
                    if (this.authCodeCallback == null) {
                        this.authCodeCallback = new AuthCodeCallback() {
                            /* class com.kakao.auth.Session.AnonymousClass4 */

                            static {
                                Covode.recordClassIndex(34255);
                            }

                            @Override // com.kakao.auth.AuthCodeCallback
                            public void onAuthCodeFailure(ErrorResult errorResult) {
                                Session.this.onAuthCodeFailure(errorResult);
                            }

                            @Override // com.kakao.auth.AuthCodeCallback
                            public void onAuthCodeReceived(String str) {
                                Session.this.onAuthCodeReceived(str);
                            }
                        };
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11323);
                    throw th;
                }
            }
        }
        AuthCodeCallback authCodeCallback2 = this.authCodeCallback;
        MethodCollector.o(11323);
        return authCodeCallback2;
    }

    @Override // com.kakao.auth.ISession
    public final synchronized boolean isClosed() {
        MethodCollector.i(10826);
        if (isOpened() || isOpenable()) {
            MethodCollector.o(10826);
            return false;
        }
        MethodCollector.o(10826);
        return true;
    }

    @Override // com.kakao.auth.ISession
    public synchronized boolean isOpenable() {
        MethodCollector.i(10825);
        if (getTokenInfo() == null || isOpened() || (!this.authorizationCode.hasAuthorizationCode() && !getTokenInfo().hasValidRefreshToken())) {
            MethodCollector.o(10825);
            return false;
        }
        MethodCollector.o(10825);
        return true;
    }

    @Override // com.kakao.auth.ISession
    public final synchronized boolean isOpened() {
        MethodCollector.i(10824);
        if (getTokenInfo() == null || !getTokenInfo().hasValidAccessToken()) {
            MethodCollector.o(10824);
            return false;
        }
        MethodCollector.o(10824);
        return true;
    }

    @Override // com.kakao.auth.ISession
    public void openWithAuthCode(String str) {
        onAuthCodeReceived(str);
    }

    /* access modifiers changed from: package-private */
    public void setAuthService(AuthService authService2) {
        this.authService = authService2;
    }

    public static Context com_kakao_auth_Session_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Application application) {
        Context applicationContext = application.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public void onAuthCodeFailure(ErrorResult errorResult) {
        internalClose(wrapAsKakaoException(errorResult.getException()));
    }

    private boolean shouldCloseSession(ErrorResult errorResult) {
        if (errorResult.getHttpStatus() == 401 || errorResult.getHttpStatus() == 400) {
            return true;
        }
        return false;
    }

    private void updateAccessToken(AccessToken accessToken2) {
        MethodCollector.i(10830);
        synchronized (this.INSTANCE_LOCK) {
            try {
                getTokenInfo().updateAccessToken(accessToken2);
            } finally {
                MethodCollector.o(10830);
            }
        }
    }

    private KakaoException wrapAsKakaoException(Exception exc) {
        if (exc == null) {
            return null;
        }
        if (exc instanceof KakaoException) {
            return (KakaoException) exc;
        }
        return new KakaoException(exc);
    }

    public void onAccessTokenReceived(AccessToken accessToken2) {
        postProcessAccessToken(accessToken2);
        for (ISessionCallback iSessionCallback : new ArrayList(this.callbacks)) {
            iSessionCallback.onSessionOpened();
        }
    }

    public void registerTokenManager(long j2) {
        this.tokenAlarmManager.cancel(this.alarmIntent);
        try {
            this.tokenAlarmManager.setInexactRepeating(3, SystemClock.elapsedRealtime() + j2, j2, this.alarmIntent);
        } catch (Exception e2) {
            Logger.w("Failed to register automatic token refresh.", e2);
        }
    }

    @Override // com.kakao.auth.ISession
    public void removeCallback(ISessionCallback iSessionCallback) {
        MethodCollector.i(11001);
        synchronized (this.callbacks) {
            if (iSessionCallback != null) {
                try {
                    this.callbacks.remove(iSessionCallback);
                } catch (Throwable th) {
                    MethodCollector.o(11001);
                    throw th;
                }
            }
        }
        MethodCollector.o(11001);
    }

    @Override // com.kakao.auth.ISession
    public void addCallback(ISessionCallback iSessionCallback) {
        MethodCollector.i(11000);
        synchronized (this.callbacks) {
            if (iSessionCallback != null) {
                try {
                    if (!this.callbacks.contains(iSessionCallback)) {
                        this.callbacks.add(iSessionCallback);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11000);
                    throw th;
                }
            }
        }
        MethodCollector.o(11000);
    }

    public void onAuthCodeReceived(String str) {
        MethodCollector.i(11821);
        if (str != null) {
            synchronized (this.INSTANCE_LOCK) {
                try {
                    this.requestType = null;
                    this.authorizationCode = new AuthorizationCode(str);
                } finally {
                    MethodCollector.o(11821);
                }
            }
            internalOpen(null, null, str, null, null, null);
        }
    }

    public void postProcessAccessToken(AccessToken accessToken2) {
        MethodCollector.i(11982);
        synchronized (this.INSTANCE_LOCK) {
            try {
                this.authorizationCode = AuthorizationCode.createEmptyCode();
                updateAccessToken(accessToken2);
                this.requestType = null;
            } catch (Throwable th) {
                MethodCollector.o(11982);
                throw th;
            }
        }
        registerTokenManager((long) Math.min(10800000, getTokenInfo().getRemainingExpireTime()));
        MethodCollector.o(11982);
    }

    public boolean shouldClearSessionState(ErrorResult errorResult) {
        KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.AUTHORIZATION_FAILED, errorResult.getErrorMessage());
        if (this.requestType != null && this.requestType == RequestType.GETTING_ACCESS_TOKEN) {
            internalClose(kakaoException);
            return false;
        } else if (this.requestType != RequestType.REFRESHING_ACCESS_TOKEN || !shouldCloseSession(errorResult)) {
            return true;
        } else {
            internalClose(kakaoException);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void internalClose(KakaoException kakaoException) {
        MethodCollector.i(11656);
        synchronized (this.INSTANCE_LOCK) {
            try {
                this.requestType = null;
                this.authorizationCode = AuthorizationCode.createEmptyCode();
                getTokenInfo().clearAccessToken();
                getTokenInfo().clearRefreshToken();
            } finally {
                MethodCollector.o(11656);
            }
        }
        SharedPreferencesCache sharedPreferencesCache = this.appCache;
        if (sharedPreferencesCache != null) {
            sharedPreferencesCache.clearAll();
        }
        try {
            deregisterTokenManager();
        } catch (Throwable th) {
            Logger.e(th);
        }
        if (kakaoException != null) {
            for (ISessionCallback iSessionCallback : new ArrayList(this.callbacks)) {
                iSessionCallback.onSessionOpenFailed(kakaoException);
            }
        }
    }

    public void onAccessTokenFailure(ErrorResult errorResult) {
        MethodCollector.i(12126);
        if (shouldClearSessionState(errorResult)) {
            synchronized (this.INSTANCE_LOCK) {
                try {
                    this.requestType = null;
                } finally {
                    MethodCollector.o(12126);
                }
            }
            for (ISessionCallback iSessionCallback : new ArrayList(this.callbacks)) {
                iSessionCallback.onSessionOpenFailed(new KakaoException(KakaoException.ErrorType.AUTHORIZATION_FAILED, errorResult.getErrorMessage()));
            }
        }
    }

    @Override // com.kakao.auth.ISession
    public Future<AccessToken> refreshAccessToken(final AccessTokenCallback accessTokenCallback2) {
        MethodCollector.i(10518);
        if (getTokenInfo() == null || !getTokenInfo().hasValidRefreshToken()) {
            KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.ILLEGAL_STATE, "Refresh token has already expired. Logging user out.");
            internalClose(kakaoException);
            if (accessTokenCallback2 != null) {
                accessTokenCallback2.onAccessTokenFailure(new ErrorResult(kakaoException));
            }
            MethodCollector.o(10518);
            return null;
        }
        synchronized (this.INSTANCE_LOCK) {
            try {
                this.requestType = RequestType.REFRESHING_ACCESS_TOKEN;
            } catch (Throwable th) {
                MethodCollector.o(10518);
                throw th;
            }
        }
        Future<AccessToken> refreshAccessToken = this.accessTokenManager.refreshAccessToken(getTokenInfo().getRefreshToken(), new AccessTokenCallback() {
            /* class com.kakao.auth.Session.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34251);
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
            public void onAccessTokenReceived(AccessToken accessToken) {
                Session.this.postProcessAccessToken(accessToken);
                AccessTokenCallback accessTokenCallback = accessTokenCallback2;
                if (accessTokenCallback != null) {
                    accessTokenCallback.onAccessTokenReceived(accessToken);
                }
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
            public void onAccessTokenFailure(ErrorResult errorResult) {
                MethodCollector.i(8243);
                if (Session.this.shouldClearSessionState(errorResult)) {
                    synchronized (Session.this.INSTANCE_LOCK) {
                        try {
                            Session.this.requestType = null;
                        } catch (Throwable th) {
                            MethodCollector.o(8243);
                            throw th;
                        }
                    }
                }
                AccessTokenCallback accessTokenCallback = accessTokenCallback2;
                if (accessTokenCallback != null) {
                    accessTokenCallback.onAccessTokenFailure(errorResult);
                }
                MethodCollector.o(8243);
            }
        });
        MethodCollector.o(10518);
        return refreshAccessToken;
    }

    @Override // com.kakao.auth.ISession
    public void open(AuthType authType, Activity activity) {
        internalOpen(authType, new StartActivityWrapper(activity), null, null, null, null);
    }

    @Override // com.kakao.auth.ISession
    public void open(AuthType authType, Fragment fragment) {
        internalOpen(authType, new StartActivityWrapper(fragment), null, null, null, null);
    }

    public static Object com_kakao_auth_Session_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context2, String str) {
        Object obj;
        MethodCollector.i(10516);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context2.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context2.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context2.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(10516);
                }
            }
        } else {
            obj = context2.getSystemService(str);
        }
        return obj;
    }

    static synchronized void initialize(Application application, ApprovalType approvalType) {
        synchronized (Session.class) {
            MethodCollector.i(10032);
            Session session = currentSession;
            if (session != null) {
                session.clearCallbacks();
                currentSession.close();
            }
            KakaoContextService instance = KakaoContextService.getInstance();
            ISessionConfig sessionConfig = KakaoSDK.getAdapter().getSessionConfig();
            Session session2 = new Session(com_kakao_auth_Session_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(application), instance, sessionConfig, AuthCodeManager.Factory.initialize(application, sessionConfig), AccessTokenManager.Factory.initialize(com_kakao_auth_Session_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(application), approvalType));
            currentSession = session2;
            session2.setAuthService(AuthService.getInstance());
            MethodCollector.o(10032);
        }
    }

    public boolean handleActivityResult(int i2, int i3, Intent intent) {
        AuthCodeManager authCodeManager2 = this.authCodeManager;
        if (authCodeManager2 == null || !authCodeManager2.handleActivityResult(i2, i3, intent)) {
            return false;
        }
        return true;
    }

    public void updateScopes(Activity activity, List<String> list, AccessTokenCallback accessTokenCallback2) {
        updateScopes(new StartActivityWrapper(activity), list, accessTokenCallback2);
    }

    public void open(AuthType authType, Activity activity, Map<String, String> map) {
        internalOpen(authType, new StartActivityWrapper(activity), null, map, null, null);
    }

    public void updateScopes(Fragment fragment, List<String> list, AccessTokenCallback accessTokenCallback2) {
        updateScopes(new StartActivityWrapper(fragment), list, accessTokenCallback2);
    }

    private void updateScopes(StartActivityWrapper startActivityWrapper, List<String> list, final AccessTokenCallback accessTokenCallback2) {
        MethodCollector.i(10673);
        if (getTokenInfo() == null || !getTokenInfo().hasValidRefreshToken()) {
            KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.ILLEGAL_STATE, "Refresh token has already expired. Logging user out.");
            internalClose(kakaoException);
            if (accessTokenCallback2 != null) {
                accessTokenCallback2.onAccessTokenFailure(new ErrorResult(kakaoException));
            }
            MethodCollector.o(10673);
            return;
        }
        synchronized (this.INSTANCE_LOCK) {
            try {
                this.requestType = RequestType.GETTING_AUTHORIZATION_CODE;
            } catch (Throwable th) {
                MethodCollector.o(10673);
                throw th;
            }
        }
        this.authCodeManager.requestAuthCodeWithScopes(AuthType.KAKAO_ACCOUNT, startActivityWrapper, list, new AuthCodeCallback() {
            /* class com.kakao.auth.Session.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34252);
            }

            @Override // com.kakao.auth.AuthCodeCallback
            public void onAuthCodeFailure(ErrorResult errorResult) {
                MethodCollector.i(7659);
                synchronized (Session.this.INSTANCE_LOCK) {
                    try {
                        Session.this.authorizationCode = AuthorizationCode.createEmptyCode();
                        Session.this.requestType = null;
                    } finally {
                        MethodCollector.o(7659);
                    }
                }
                AccessTokenCallback accessTokenCallback = accessTokenCallback2;
                if (accessTokenCallback != null) {
                    accessTokenCallback.onAccessTokenFailure(errorResult);
                }
            }

            @Override // com.kakao.auth.AuthCodeCallback
            public void onAuthCodeReceived(String str) {
                MethodCollector.i(7383);
                synchronized (Session.this.INSTANCE_LOCK) {
                    try {
                        Session.this.authorizationCode = new AuthorizationCode(str);
                        Session.this.requestType = RequestType.GETTING_ACCESS_TOKEN;
                    } catch (Throwable th) {
                        MethodCollector.o(7383);
                        throw th;
                    }
                }
                Session.this.accessTokenManager.requestAccessTokenByAuthCode(str, new AccessTokenCallback() {
                    /* class com.kakao.auth.Session.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34253);
                    }

                    @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
                    public void onAccessTokenReceived(AccessToken accessToken) {
                        Session.this.postProcessAccessToken(accessToken);
                        if (accessTokenCallback2 != null) {
                            accessTokenCallback2.onAccessTokenReceived(accessToken);
                        }
                    }

                    @Override // com.kakao.auth.authorization.accesstoken.AccessTokenListener
                    public void onAccessTokenFailure(ErrorResult errorResult) {
                        MethodCollector.i(8237);
                        synchronized (Session.this.INSTANCE_LOCK) {
                            try {
                                Session.this.authorizationCode = AuthorizationCode.createEmptyCode();
                                Session.this.requestType = null;
                            } finally {
                                MethodCollector.o(8237);
                            }
                        }
                        if (accessTokenCallback2 != null) {
                            accessTokenCallback2.onAccessTokenFailure(errorResult);
                        }
                    }
                });
                MethodCollector.o(7383);
            }
        });
        MethodCollector.o(10673);
    }

    public void open(AuthType authType, Fragment fragment, Map<String, String> map) {
        internalOpen(authType, new StartActivityWrapper(fragment), null, map, null, null);
    }

    public void openWithCustomAccountsUrl(Activity activity, Map<String, String> map, String str, Map<String, String> map2) {
        internalOpen(AuthType.KAKAO_ACCOUNT, new StartActivityWrapper(activity), null, map, str, map2);
    }

    private void requestAuthCode(AuthType authType, StartActivityWrapper startActivityWrapper, Map<String, String> map, String str, Map<String, String> map2) {
        if (str != null) {
            this.authCodeManager.requestAuthCodeWithCustomAccountsUrl(startActivityWrapper, map, str, map2, getAuthCodeCallback());
        } else {
            this.authCodeManager.requestAuthCode(authType, startActivityWrapper, map, getAuthCodeCallback());
        }
    }

    Session(Context context2, KakaoContextService kakaoContextService, ISessionConfig iSessionConfig, AuthCodeManager authCodeManager2, AccessTokenManager accessTokenManager2) {
        MethodCollector.i(10355);
        Object obj = new Object();
        this.INSTANCE_LOCK = obj;
        if (context2 != null) {
            this.context = context2;
            this.contextService = kakaoContextService;
            SharedPreferencesCache sharedPreferencesCache = new SharedPreferencesCache(context2, kakaoContextService.phaseInfo().appKey());
            this.appCache = sharedPreferencesCache;
            synchronized (obj) {
                try {
                    this.authorizationCode = AuthorizationCode.createEmptyCode();
                    this.accessToken = AccessToken.Factory.createFromCache(iSessionConfig, sharedPreferencesCache);
                } catch (Throwable th) {
                    MethodCollector.o(10355);
                    throw th;
                }
            }
            this.authCodeManager = authCodeManager2;
            this.accessTokenManager = accessTokenManager2;
            this.callbacks = new ArrayList();
            this.tokenAlarmManager = (AlarmManager) com_kakao_auth_Session_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context2, "alarm");
            this.alarmIntent = PendingIntent.getBroadcast(context2, 0, new Intent(context2, TokenAlarmReceiver.class), 134217728);
            MethodCollector.o(10355);
            return;
        }
        KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.ILLEGAL_ARGUMENT, "cannot create Session without Context.");
        MethodCollector.o(10355);
        throw kakaoException;
    }

    private void internalOpen(AuthType authType, StartActivityWrapper startActivityWrapper, String str, Map<String, String> map, String str2, Map<String, String> map2) {
        MethodCollector.i(10999);
        if (isOpened()) {
            for (ISessionCallback iSessionCallback : new ArrayList(this.callbacks)) {
                iSessionCallback.onSessionOpened();
            }
            MethodCollector.o(10999);
        } else if (getRequestType() != null) {
            Logger.w(getRequestType() + " is still not finished. Just return.");
            MethodCollector.o(10999);
        } else {
            try {
                synchronized (this.INSTANCE_LOCK) {
                    try {
                        if (isClosed()) {
                            this.requestType = RequestType.GETTING_AUTHORIZATION_CODE;
                            requestAuthCode(authType, startActivityWrapper, map, str2, map2);
                        } else if (!isOpenable()) {
                            KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.AUTHORIZATION_FAILED, "current session state is not possible to open.");
                            MethodCollector.o(10999);
                            throw kakaoException;
                        } else if (str != null) {
                            this.requestType = RequestType.GETTING_ACCESS_TOKEN;
                            this.accessTokenManager.requestAccessTokenByAuthCode(str, getAccessTokenCallback());
                        } else {
                            this.requestType = RequestType.REFRESHING_ACCESS_TOKEN;
                            this.accessTokenManager.refreshAccessToken(getTokenInfo().getRefreshToken(), getAccessTokenCallback());
                        }
                    } finally {
                        MethodCollector.o(10999);
                    }
                }
            } catch (KakaoException e2) {
                internalClose(e2);
                MethodCollector.o(10999);
            }
        }
    }
}
