package com.kakao.auth.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.ApiResponseStatusError;
import com.kakao.network.response.ResponseBody;

public class InsufficientScopeException extends ApiResponseStatusError {
    static {
        Covode.recordClassIndex(34342);
    }

    public InsufficientScopeException(String str) {
        super(-402, str, 403);
    }

    public InsufficientScopeException(ResponseBody responseBody) {
        this(responseBody.getInt("code"), responseBody.optString("msg", ""), 403, responseBody);
    }

    public InsufficientScopeException(int i2, String str, int i3, ResponseBody responseBody) {
        super(i2, str, i3, responseBody);
    }
}
