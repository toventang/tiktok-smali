package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;
import java.io.Serializable;
import java.util.List;

public final class BAInfos implements Serializable {
    @c(a = "ba_infos")
    private final List<TagBAUser> baInfos;
    @c(a = "status_code")
    private final int statusCode;
    @c(a = "status_msg")
    private String statusMsg;

    static {
        Covode.recordClassIndex(59344);
    }

    public final List<TagBAUser> getBaInfos() {
        return this.baInfos;
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
