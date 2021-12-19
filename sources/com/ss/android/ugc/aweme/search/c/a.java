package com.ss.android.ugc.aweme.search.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "icon")
    public UrlModel icon;
    @c(a = "keyword")
    public String keyword = "";
    @c(a = "link")
    public String link = "";

    static {
        Covode.recordClassIndex(78813);
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLink() {
        return this.link;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }
}
