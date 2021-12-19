package com.bytedance.android.live.wallet.base;

import com.bytedance.android.live.wallet.base.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class a<T, R extends Extra> {
    @c(a = "data")
    public T data;
    public transient RequestError error;
    @c(a = "extra")
    public R extra;
    public String logId;
    @c(a = "status_code")
    public int statusCode;

    static {
        Covode.recordClassIndex(7258);
    }
}
