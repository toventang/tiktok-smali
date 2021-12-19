package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class UserPreferVideo {
    @c(a = "cover")
    public UrlModel cover;
    @c(a = "dynamic_cover")
    public UrlModel dynamicCover;
    @c(a = "gid")
    public String gid;
    @c(a = "play_addr")
    public UrlModel video;

    static {
        Covode.recordClassIndex(59462);
    }

    public String toString() {
        return "UserPreferVideo{gid='" + this.gid + '\'' + ", video=" + this.video + ", cover=" + this.cover + ", dynamicCover=" + this.dynamicCover + '}';
    }
}
