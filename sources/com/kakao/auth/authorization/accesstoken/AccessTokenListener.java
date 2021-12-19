package com.kakao.auth.authorization.accesstoken;

import com.bytedance.covode.number.Covode;
import com.kakao.network.ErrorResult;

public interface AccessTokenListener {
    static {
        Covode.recordClassIndex(34275);
    }

    void onAccessTokenFailure(ErrorResult errorResult);

    void onAccessTokenReceived(AccessToken accessToken);
}
