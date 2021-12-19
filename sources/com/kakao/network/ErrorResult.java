package com.kakao.network;

import com.bytedance.covode.number.Covode;
import com.kakao.network.exception.ResponseStatusError;

public class ErrorResult {
    private final int CLIENT_ERROR_CODE;
    private final int errorCode;
    protected final String errorMessage;
    protected final Exception exception;
    private final int httpStatus;

    static {
        Covode.recordClassIndex(34360);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Exception getException() {
        return this.exception;
    }

    public int getHttpStatus() {
        return this.httpStatus;
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder("ErrorResult{errorCode=").append(this.errorCode).append(", errorMessage='").append(this.errorMessage).append('\'').append(", exception='");
        Exception exc = this.exception;
        if (exc != null) {
            str = exc.toString();
        } else {
            str = null;
        }
        return append.append(str).append('\'').append('}').toString();
    }

    public ErrorResult(ResponseStatusError responseStatusError) {
        this.CLIENT_ERROR_CODE = -777;
        this.errorCode = responseStatusError.getErrorCode();
        this.errorMessage = responseStatusError.getErrorMsg();
        this.httpStatus = responseStatusError.getHttpStatusCode();
        this.exception = responseStatusError;
    }

    public ErrorResult(Exception exc) {
        this.CLIENT_ERROR_CODE = -777;
        this.errorCode = -777;
        this.errorMessage = exc.getMessage();
        this.httpStatus = 500;
        this.exception = exc;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) obj;
        if (getErrorCode() == errorResult.getErrorCode() && getHttpStatus() == errorResult.getHttpStatus()) {
            return getErrorMessage().equals(errorResult.getErrorMessage());
        }
        return false;
    }
}
