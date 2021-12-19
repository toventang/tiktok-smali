package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class MediaAdInfo {
    @c(a = "schema_url")
    private String schemaUrl;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(3608);
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
