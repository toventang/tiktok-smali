package com.bytedance.android.live.wallet.base;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class RequestError {
    @c(a = "alert")
    public String alert;
    @c(a = "message")
    public String message;
    @c(a = "prompts")
    public String prompts = "";
    public transient String url;

    static {
        Covode.recordClassIndex(7254);
    }
}
