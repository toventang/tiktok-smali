package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class AvatarDecoration implements Serializable, Cloneable {
    @c(a = "id")
    public long id;
    @c(a = StringSet.name)
    public String name;
    @c(a = "source_url")
    public UrlModel sourceUrl;

    static {
        Covode.recordClassIndex(75203);
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public UrlModel getSourceUrl() {
        return this.sourceUrl;
    }
}
