package com.ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "schema_url")
    private String schemaUrl;
    @com.google.gson.a.c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(78812);
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
