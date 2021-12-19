package com.bytedance.android.live.network.response;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class b<T, R extends Extra> {
    @c(a = "data")
    public T data;
    public transient RequestError error;
    @c(a = "extra")
    public R extra;
    public int requestType;
    @c(a = "status_code")
    public int statusCode;

    static {
        Covode.recordClassIndex(6660);
    }
}
