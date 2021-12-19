package com.kakao.auth;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.authorization.accesstoken.AccessTokenManager;
import com.kakao.auth.authorization.authcode.AuthCodeManager;
import java.util.concurrent.Future;

public interface ISession {
    static {
        Covode.recordClassIndex(34240);
    }

    void addCallback(ISessionCallback iSessionCallback);

    void clearCallbacks();

    void close();

    AccessTokenCallback getAccessTokenCallback();

    AccessTokenManager getAccessTokenManager();

    AuthCodeManager getAuthCodeManager();

    AccessToken getTokenInfo();

    boolean isClosed();

    boolean isOpenable();

    boolean isOpened();

    void open(AuthType authType, Activity activity);

    void open(AuthType authType, Fragment fragment);

    void openWithAuthCode(String str);

    Future<AccessToken> refreshAccessToken(AccessTokenCallback accessTokenCallback);

    void removeCallback(ISessionCallback iSessionCallback);
}
