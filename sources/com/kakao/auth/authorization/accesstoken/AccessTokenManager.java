package com.kakao.auth.authorization.accesstoken;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.AccessTokenCallback;
import com.kakao.auth.ApprovalType;
import com.kakao.common.KakaoContextService;
import com.kakao.network.NetworkService;
import java.util.concurrent.Future;

public interface AccessTokenManager {
    static {
        Covode.recordClassIndex(34276);
    }

    Future<AccessToken> refreshAccessToken(String str, AccessTokenCallback accessTokenCallback);

    Future<AccessToken> requestAccessTokenByAuthCode(String str, AccessTokenCallback accessTokenCallback);

    public static class Factory {
        private static AccessTokenManager accessTokenManager;

        static {
            Covode.recordClassIndex(34277);
        }

        public static AccessTokenManager getInstance() {
            return accessTokenManager;
        }

        public static AccessTokenManager initialize(Context context, ApprovalType approvalType) {
            if (accessTokenManager == null) {
                KakaoContextService.getInstance().initialize(context);
                accessTokenManager = new DefaultAccessTokenManager(KakaoContextService.getInstance(), NetworkService.Factory.getInstance(), approvalType);
            }
            return accessTokenManager;
        }
    }
}
