package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class e extends b implements Serializable {
    @c(a = "text")
    private String content = "";
    @c(a = "extra_str")
    private String extraStr = "";
    @c(a = "group_id")
    private long gid;
    @c(a = "image_url")
    private String imageUrl = "";
    @c(a = "open_url")
    private String openUrl = "";
    @c(a = "push_show_type")
    private int pushShowType;
    @c(a = "id")
    private long rid;
    @c(a = "title")
    private String title = "";

    static {
        Covode.recordClassIndex(72420);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getExtraStr() {
        return this.extraStr;
    }

    public final long getGid() {
        return this.gid;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final int getPushShowType() {
        return this.pushShowType;
    }

    public final long getRid() {
        return this.rid;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.bean.b
    public final f getType() {
        return f.LIVE;
    }

    public final void setExtraStr(String str) {
        this.extraStr = str;
    }

    public final void setGid(long j2) {
        this.gid = j2;
    }

    public final void setPushShowType(int i2) {
        this.pushShowType = i2;
    }

    public final void setRid(long j2) {
        this.rid = j2;
    }

    public final void setContent(String str) {
        l.d(str, "");
        this.content = str;
    }

    public final void setImageUrl(String str) {
        l.d(str, "");
        this.imageUrl = str;
    }

    public final void setOpenUrl(String str) {
        l.d(str, "");
        this.openUrl = str;
    }

    public final void setTitle(String str) {
        l.d(str, "");
        this.title = str;
    }
}
