package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class Search {
    @c(a = "display_keyword")
    private String displayKeyword;
    @c(a = "keyword")
    private String keyword;

    static {
        Covode.recordClassIndex(72541);
    }

    public Search() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Search copy$default(Search search, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = search.keyword;
        }
        if ((i2 & 2) != 0) {
            str2 = search.displayKeyword;
        }
        return search.copy(str, str2);
    }

    public final String component1() {
        return this.keyword;
    }

    public final String component2() {
        return this.displayKeyword;
    }

    public final Search copy(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new Search(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Search)) {
            return false;
        }
        Search search = (Search) obj;
        return l.a(this.keyword, search.keyword) && l.a(this.displayKeyword, search.displayKeyword);
    }

    public final int hashCode() {
        String str = this.keyword;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.displayKeyword;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Search(keyword=" + this.keyword + ", displayKeyword=" + this.displayKeyword + ")";
    }

    public final String getDisplayKeyword() {
        return this.displayKeyword;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final void setDisplayKeyword(String str) {
        l.d(str, "");
        this.displayKeyword = str;
    }

    public final void setKeyword(String str) {
        l.d(str, "");
        this.keyword = str;
    }

    public Search(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.keyword = str;
        this.displayKeyword = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Search(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2);
    }
}
