package com.ss.android.ugc.aweme.feed.model.dongchedi;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class DCDVideoExtra implements Serializable {
    @c(a = "desc")
    private String desc;
    @c(a = "schema")
    private String schema;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(59483);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
