package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class AwemeStatusBean implements Serializable {
    @c(a = "item_id")
    private String awemeId;
    @c(a = "status")
    private Integer status;
    @c(a = "status_text")
    private String statusText;

    static {
        Covode.recordClassIndex(64020);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setStatusText(String str) {
        this.statusText = str;
    }
}
