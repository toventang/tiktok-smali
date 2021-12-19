package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class PromoteEntryCheck implements Serializable {
    @c(a = "promote_status")
    private Integer promoteStatus = 0;
    @c(a = "status_code")
    private int statusCode;
    @c(a = "status_msg")
    private String statusMsg;
    @c(a = "url")
    private String url = "";

    static {
        Covode.recordClassIndex(59445);
    }

    public final Integer getPromoteStatus() {
        return this.promoteStatus;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setPromoteStatus(Integer num) {
        this.promoteStatus = num;
    }

    public final void setStatusCode(int i2) {
        this.statusCode = i2;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
