package com.kakao.util.exception;

import com.bytedance.covode.number.Covode;

public class KakaoException extends RuntimeException {
    private static final long serialVersionUID = 3738785191273730776L;
    private ErrorType errorType;

    static {
        Covode.recordClassIndex(34476);
    }

    public ErrorType getErrorType() {
        return this.errorType;
    }

    public boolean isCancledOperation() {
        if (this.errorType == ErrorType.CANCELED_OPERATION) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (getErrorType() == null) {
            return super.getMessage();
        }
        return getErrorType() + ": " + super.getMessage();
    }

    public enum ErrorType {
        ILLEGAL_ARGUMENT,
        ILLEGAL_STATE,
        MISS_CONFIGURATION,
        CANCELED_OPERATION,
        AUTHORIZATION_FAILED,
        UNSPECIFIED_ERROR,
        JSON_PARSING_ERROR,
        URI_LENGTH_EXCEEDED,
        KAKAOTALK_NOT_INSTALLED;

        static {
            Covode.recordClassIndex(34477);
        }
    }

    public KakaoException(String str) {
        super(str);
    }

    public KakaoException(ErrorType errorType2) {
        this.errorType = errorType2;
    }

    public KakaoException(Throwable th) {
        super(th);
    }

    public KakaoException(ErrorType errorType2, String str) {
        super(str);
        this.errorType = errorType2;
    }

    public KakaoException(String str, Throwable th) {
        super(str, th);
    }
}
