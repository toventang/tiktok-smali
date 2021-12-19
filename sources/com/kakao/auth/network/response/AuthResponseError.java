package com.kakao.auth.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.exception.ResponseStatusError;
import com.kakao.network.response.CustomErrorConverter;
import com.kakao.network.response.ResponseBody;

public class AuthResponseError extends ResponseStatusError {
    public static final CustomErrorConverter<AuthResponseError> CONVERTER = new CustomErrorConverter<AuthResponseError>() {
        /* class com.kakao.auth.network.response.AuthResponseError.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34339);
        }

        @Override // com.kakao.network.response.CustomErrorConverter
        public final AuthResponseError convert(int i2, String str) {
            return new AuthResponseError(i2, new ResponseBody(str));
        }
    };
    private static final long serialVersionUID = 3702596857996303483L;
    private final String error;
    private final String errorDescription;
    private final ResponseBody errorResponse;
    private final int httpStatusCode;

    @Override // com.kakao.network.exception.ResponseStatusError
    public int getErrorCode() {
        return -776;
    }

    public String getError() {
        return this.error;
    }

    @Override // com.kakao.network.exception.ResponseStatusError
    public String getErrorMsg() {
        return this.errorDescription;
    }

    public ResponseBody getErrorResponse() {
        return this.errorResponse;
    }

    @Override // com.kakao.network.exception.ResponseStatusError
    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    static {
        Covode.recordClassIndex(34338);
    }

    public AuthResponseError(int i2, ResponseBody responseBody) {
        super(responseBody.toString());
        this.httpStatusCode = i2;
        this.errorResponse = responseBody;
        this.error = responseBody.getString("error");
        this.errorDescription = responseBody.optString("error_description", "");
    }
}
