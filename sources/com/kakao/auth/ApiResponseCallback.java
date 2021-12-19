package com.kakao.auth;

import com.bytedance.covode.number.Covode;
import com.kakao.network.ErrorResult;
import com.kakao.network.callback.ResponseCallback;

public abstract class ApiResponseCallback<T> extends ResponseCallback<T> {
    static {
        Covode.recordClassIndex(34226);
    }

    @Override // com.kakao.network.callback.ResponseCallback
    public void onFailure(ErrorResult errorResult) {
    }

    public void onNotSignedUp() {
    }

    public abstract void onSessionClosed(ErrorResult errorResult);

    @Override // com.kakao.network.callback.ResponseCallback
    public void onFailureForUiThread(ErrorResult errorResult) {
        int errorCode = errorResult.getErrorCode();
        if (errorCode == -101) {
            onNotSignedUp();
        } else if (errorCode == -401) {
            onSessionClosed(errorResult);
        } else {
            super.onFailureForUiThread(errorResult);
        }
    }
}
