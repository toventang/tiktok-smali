package com.bytedance.android.live.network.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class RequestError {
    @c(a = "alert")
    public String alert;
    @c(a = "message")
    public String message;
    @c(a = "prompts")
    public String prompts = "Operation failed, please try again later";
    public transient String url;

    static {
        Covode.recordClassIndex(6656);
    }
}
