package com.kakao.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.exception.ResponseStatusError;

public class ApiResponseStatusError extends ResponseStatusError {
    private static final long serialVersionUID = 3702596857996303483L;
    private final int errorCode;
    private final String errorMsg;
    private ResponseBody errorResponse;
    private final int httpStatusCode;

    static {
        Covode.recordClassIndex(34376);
    }

    @Override // com.kakao.network.exception.ResponseStatusError
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override // com.kakao.network.exception.ResponseStatusError
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ResponseBody getErrorResponse() {
        return this.errorResponse;
    }

    @Override // com.kakao.network.exception.ResponseStatusError
    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ApiResponseStatusError(int i2, String str, int i3) {
        super(str);
        this.errorCode = i2;
        this.errorMsg = str;
        this.httpStatusCode = i3;
    }

    public ApiResponseStatusError(int i2, String str, int i3, ResponseBody responseBody) {
        this(i2, str, i3);
        this.errorResponse = responseBody;
    }
}
