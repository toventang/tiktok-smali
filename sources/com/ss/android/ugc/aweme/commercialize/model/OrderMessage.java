package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class OrderMessage implements Serializable {
    @c(a = "msg_type")
    private Integer msgType;
    @c(a = "status_code")
    private Integer statusCode;
    @c(a = "toast_content")
    private String toastContent = "";
    @c(a = "update_time")
    private long updateime;

    static {
        Covode.recordClassIndex(46143);
    }

    public final Integer getMsgType() {
        return this.msgType;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getToastContent() {
        return this.toastContent;
    }

    public final long getUpdateime() {
        return this.updateime;
    }

    public final void setMsgType(Integer num) {
        this.msgType = num;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setToastContent(String str) {
        this.toastContent = str;
    }

    public final void setUpdateime(long j2) {
        this.updateime = j2;
    }
}
