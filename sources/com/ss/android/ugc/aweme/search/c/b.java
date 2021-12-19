package com.ss.android.ugc.aweme.search.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class b implements Serializable {
    @c(a = "keyword")
    public String keyword = "";
    @c(a = "link")
    public String link = "";

    static {
        Covode.recordClassIndex(78814);
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLink() {
        return this.link;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }
}
