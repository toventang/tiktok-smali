package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class AdAck {
    @c(a = "message")
    String message;
    @c(a = "status")
    public int status;

    static {
        Covode.recordClassIndex(59287);
    }
}
