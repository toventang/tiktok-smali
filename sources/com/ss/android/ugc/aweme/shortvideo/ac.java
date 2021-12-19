package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.b;
import java.io.Serializable;

public final class ac implements Serializable {
    @c(a = "post_prompts")
    private cj postPrompts;
    @b
    @c(a = "status_code")
    private Integer statusCode;
    @c(a = "status_msg")
    private String statusMessage;

    static {
        Covode.recordClassIndex(82043);
    }

    public final cj getPostPrompts() {
        return this.postPrompts;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final void setPostPrompts(cj cjVar) {
        this.postPrompts = cjVar;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStatusMessage(String str) {
        this.statusMessage = str;
    }
}
