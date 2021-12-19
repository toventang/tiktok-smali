package com.kakao.auth;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.authorization.accesstoken.AccessTokenListener;
import com.kakao.network.ErrorResult;
import com.kakao.network.callback.ResponseCallback;
import com.kakao.util.exception.KakaoException;

public abstract class AccessTokenCallback extends ResponseCallback<AccessToken> implements AccessTokenListener {
    static {
        Covode.recordClassIndex(34223);
    }

    @Override // com.kakao.network.callback.ResponseCallback
    public final void onDidEnd() {
        super.onDidEnd();
    }

    @Override // com.kakao.network.callback.ResponseCallback
    public final void onDidStart() {
        super.onDidStart();
    }

    @Override // com.kakao.network.callback.ResponseCallback
    public final void onFailure(ErrorResult errorResult) {
        onAccessTokenFailure(errorResult);
    }

    @Override // com.kakao.network.callback.ResponseCallback
    public final void onFailureForUiThread(ErrorResult errorResult) {
        super.onFailureForUiThread(errorResult);
    }

    public final void onSuccessForUiThread(AccessToken accessToken) {
        super.onSuccessForUiThread((Object) accessToken);
    }

    public final void onSuccess(AccessToken accessToken) {
        if (accessToken.hasValidAccessToken()) {
            onAccessTokenReceived(accessToken);
        } else {
            onAccessTokenFailure(new ErrorResult(new KakaoException(KakaoException.ErrorType.AUTHORIZATION_FAILED, "the result of access token request is invalid access token.")));
        }
    }
}
