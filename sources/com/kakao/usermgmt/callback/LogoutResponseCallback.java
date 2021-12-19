package com.kakao.usermgmt.callback;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.ApiResponseCallback;
import com.kakao.network.ErrorResult;

public abstract class LogoutResponseCallback extends ApiResponseCallback<Long> {
    static {
        Covode.recordClassIndex(34430);
    }

    public abstract void onCompleteLogout();

    @Override // com.kakao.auth.ApiResponseCallback
    public void onNotSignedUp() {
    }

    @Override // com.kakao.auth.ApiResponseCallback
    public void onSessionClosed(ErrorResult errorResult) {
    }

    public void onSuccess(Long l2) {
    }

    @Override // com.kakao.network.callback.ResponseCallback
    public void onDidEnd() {
        onCompleteLogout();
    }
}
