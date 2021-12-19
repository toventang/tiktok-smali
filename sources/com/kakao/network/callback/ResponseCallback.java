package com.kakao.network.callback;

import com.bytedance.covode.number.Covode;
import com.kakao.network.ErrorResult;

public abstract class ResponseCallback<T> {
    static {
        Covode.recordClassIndex(34370);
    }

    public void onDidEnd() {
    }

    public void onDidStart() {
    }

    public abstract void onFailure(ErrorResult errorResult);

    public abstract void onSuccess(T t);

    public void onFailureForUiThread(ErrorResult errorResult) {
        onFailure(errorResult);
    }

    public void onSuccessForUiThread(T t) {
        onSuccess(t);
    }
}
