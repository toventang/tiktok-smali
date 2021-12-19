package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.io.Serializable;

public final class ProfileBadgeStruct implements Serializable {
    @c(a = "description")
    public String description = "";
    @c(a = "id")
    public long id;
    @c(a = StringSet.name)
    public String name = "";
    @c(a = "should_show")
    public boolean shouldShow;
    @c(a = "url")
    public String url = "";

    static {
        Covode.recordClassIndex(75249);
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setShouldShow(boolean z) {
        this.shouldShow = z;
    }

    public final void setDescription(String str) {
        l.d(str, "");
        this.description = str;
    }

    public final void setName(String str) {
        l.d(str, "");
        this.name = str;
    }

    public final void setUrl(String str) {
        l.d(str, "");
        this.url = str;
    }
}
