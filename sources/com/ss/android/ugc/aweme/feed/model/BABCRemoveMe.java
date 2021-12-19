package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class BABCRemoveMe implements Serializable {
    @c(a = "status_code")
    private final int statusCode;
    @c(a = "status_msg")
    private String statusMsg;

    static {
        Covode.recordClassIndex(59343);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
