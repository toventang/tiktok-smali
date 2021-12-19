package com.ss.android.ugc.aweme.ecommercelive.framework.network;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class BaseResponse<T> {
    @c(a = "code")
    private int code = -1;
    @c(a = "data")
    private T data;
    @c(a = "msg")
    private final String message = "";

    static {
        Covode.recordClassIndex(55341);
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean isSuccess() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public final void setCode(int i2) {
        this.code = i2;
    }

    public final void setData(T t) {
        this.data = t;
    }
}
