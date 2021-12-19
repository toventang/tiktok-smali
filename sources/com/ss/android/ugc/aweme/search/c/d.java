package com.ss.android.ugc.aweme.search.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class d implements Serializable {
    @c(a = "begin")
    public int begin;
    @c(a = "end")
    public int end;
    @c(a = "link")
    public String link;
    @c(a = "query")
    public String query;

    static {
        Covode.recordClassIndex(78816);
    }

    public final int getBegin() {
        return this.begin;
    }

    public final int getEnd() {
        return this.end;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getQuery() {
        return this.query;
    }

    public final void setBegin(int i2) {
        this.begin = i2;
    }

    public final void setEnd(int i2) {
        this.end = i2;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setQuery(String str) {
        this.query = str;
    }
}
