package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class StreamUrlModel implements Serializable {
    @c(a = "id")
    public String id;
    @c(a = "rtmp_pull_url")
    public String rtmpPullUrl;

    static {
        Covode.recordClassIndex(59455);
    }

    public String getId() {
        return this.id;
    }

    public String getRtmpPullUrl() {
        return this.rtmpPullUrl;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmpPullUrl = str;
    }
}
