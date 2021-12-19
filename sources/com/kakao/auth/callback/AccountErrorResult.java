package com.kakao.auth.callback;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.AuthService;
import com.kakao.network.ErrorResult;
import com.kakao.util.exception.KakaoException;

public class AccountErrorResult extends ErrorResult {
    private final AuthService.AgeAuthStatus status;

    static {
        Covode.recordClassIndex(34306);
    }

    @Override // com.kakao.network.ErrorResult
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.kakao.network.ErrorResult
    public Exception getException() {
        return this.exception;
    }

    public AuthService.AgeAuthStatus getStatus() {
        return this.status;
    }

    @Override // com.kakao.network.ErrorResult
    public String toString() {
        return "AccountErrorResult{status=" + this.status + ", errorMessage='" + this.errorMessage + '\'' + '}';
    }

    public AccountErrorResult(int i2) {
        super(new KakaoException(KakaoException.ErrorType.UNSPECIFIED_ERROR, "Age Authentication failure"));
        this.status = AuthService.AgeAuthStatus.valueOf(i2);
    }

    public AccountErrorResult(int i2, Exception exc) {
        super(exc);
        if (exc == null || !(exc instanceof KakaoException) || ((KakaoException) exc).getErrorType() != KakaoException.ErrorType.CANCELED_OPERATION) {
            this.status = AuthService.AgeAuthStatus.valueOf(i2);
        } else {
            this.status = AuthService.AgeAuthStatus.CANCELED_OPERATION;
        }
    }
}
