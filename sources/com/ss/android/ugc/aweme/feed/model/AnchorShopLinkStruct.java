package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class AnchorShopLinkStruct implements Serializable {
    @c(a = "keyword")
    public String keyword;
    @c(a = "url")
    public String url;

    static {
        Covode.recordClassIndex(59302);
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
