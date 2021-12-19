package com.ss.android.ugc.aweme.im.sdk.group.b.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import java.util.List;

public final class a implements Serializable {
    @c(a = "invalid_members")
    private List<? extends IMUser> invalidMembers;
    @c(a = "status_code")
    private Integer statusCode;
    @c(a = "status_msg")
    private String statusMsg;

    static {
        Covode.recordClassIndex(65737);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    public final List<IMUser> getInvalidMembers() {
        return this.invalidMembers;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final String toString() {
        return "GroupCheckMsg(statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", invalidMembers=" + this.invalidMembers + ')';
    }

    public final void setInvalidMembers(List<? extends IMUser> list) {
        this.invalidMembers = list;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
