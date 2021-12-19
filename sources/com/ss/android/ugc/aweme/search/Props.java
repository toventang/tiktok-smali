package com.ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Props implements Serializable {
    @c(a = "children")
    public ArrayList<String> children;
    @c(a = "desc")
    public String desc;
    @c(a = "effect_type")
    public int effectType;
    @c(a = "icon")
    public UrlModel icon;
    @c(a = "id")
    public String id;
    @c(a = StringSet.name)
    public String name;
    @c(a = "use_count")
    public int useCount;

    static {
        Covode.recordClassIndex(78788);
    }

    public List<String> children() {
        return this.children;
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

    public boolean isCombine() {
        if (this.effectType == 1) {
            return true;
        }
        return false;
    }
}
