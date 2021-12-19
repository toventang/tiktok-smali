package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class WikipediaInfo implements Serializable {
    public String anchorId = "";
    public WikipediaExtra extra;
    @c(a = "keyword")
    public String keyword;
    @c(a = "lang")
    public String lang;

    static {
        Covode.recordClassIndex(59476);
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final WikipediaExtra getExtra() {
        return this.extra;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLang() {
        return this.lang;
    }

    public final int hashCode() {
        String str = this.keyword;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setExtra(WikipediaExtra wikipediaExtra) {
        this.extra = wikipediaExtra;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLang(String str) {
        this.lang = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WikipediaInfo) {
            WikipediaInfo wikipediaInfo = (WikipediaInfo) obj;
            if (!l.a((Object) wikipediaInfo.keyword, (Object) this.keyword) || !l.a((Object) wikipediaInfo.lang, (Object) this.lang)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
