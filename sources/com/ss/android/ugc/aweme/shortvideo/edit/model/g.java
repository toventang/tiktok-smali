package com.ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class g implements Serializable {
    private String aid = "";
    private String cover = "";
    private String mid = "";
    private String vid = "";

    static {
        Covode.recordClassIndex(83803);
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getMid() {
        return this.mid;
    }

    public final String getVid() {
        return this.vid;
    }

    public final void setAid(String str) {
        l.d(str, "");
        this.aid = str;
    }

    public final void setCover(String str) {
        l.d(str, "");
        this.cover = str;
    }

    public final void setMid(String str) {
        l.d(str, "");
        this.mid = str;
    }

    public final void setVid(String str) {
        l.d(str, "");
        this.vid = str;
    }
}
