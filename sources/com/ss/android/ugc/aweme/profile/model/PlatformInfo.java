package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class PlatformInfo implements Serializable {
    @c(a = "full_synced")
    public boolean fullSynced;
    @c(a = "nickname")
    public String nickName;
    @c(a = "platform_name")
    public String patformName;

    static {
        Covode.recordClassIndex(75245);
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getPatformName() {
        return this.patformName;
    }

    public boolean isFullSynced() {
        return this.fullSynced;
    }

    public void setFullSynced(boolean z) {
        this.fullSynced = z;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPatformName(String str) {
        this.patformName = str;
    }
}
