package com.kakao.auth.callback;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.AuthService;
import com.kakao.network.ErrorResult;
import com.kakao.network.callback.ResponseCallback;

public abstract class AccountResponseCallback extends ResponseCallback<Integer> {
    static {
        Covode.recordClassIndex(34307);
    }

    public abstract void onAgeAuthFailure(AccountErrorResult accountErrorResult);

    @Override // com.kakao.network.callback.ResponseCallback
    public void onFailure(ErrorResult errorResult) {
        onAgeAuthFailure(new AccountErrorResult(errorResult.getErrorCode(), errorResult.getException()));
    }

    public void onSuccessForUiThread(Integer num) {
        AuthService.AgeAuthStatus valueOf = AuthService.AgeAuthStatus.valueOf(num.intValue());
        if (valueOf == AuthService.AgeAuthStatus.SUCCESS || valueOf == AuthService.AgeAuthStatus.ALREADY_AGE_AUTHORIZED) {
            onSuccess(num);
        } else {
            onAgeAuthFailure(new AccountErrorResult(num.intValue()));
        }
    }
}
