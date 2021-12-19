package com.ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

public class PhotoTemplate implements Serializable {
    @c(a = "desc")
    public String desc;
    @c(a = "icon")
    public UrlModel icon;
    @c(a = "id")
    public String id;
    @c(a = StringSet.name)
    public String name;
    @c(a = "use_count")
    public int useCount;

    static {
        Covode.recordClassIndex(78787);
    }

    public List<String> children() {
        return null;
    }

    public boolean isCombine() {
        return false;
    }

    public String desc() {
        return this.desc;
    }

    public UrlModel icon() {
        return this.icon;
    }

    public String id() {
        return this.id;
    }

    public String name() {
        return this.name;
    }

    public int useCount() {
        return this.useCount;
    }
}
