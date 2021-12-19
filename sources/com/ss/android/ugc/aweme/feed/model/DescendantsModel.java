package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class DescendantsModel implements Serializable {
    @c(a = "notify_msg")
    public String notifyMsg;
    @c(a = "platforms")
    public List<String> platforms;

    static {
        Covode.recordClassIndex(59366);
    }

    public String getNotifyMsg() {
        return this.notifyMsg;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public void setNotifyMsg(String str) {
        this.notifyMsg = str;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
    }
}
