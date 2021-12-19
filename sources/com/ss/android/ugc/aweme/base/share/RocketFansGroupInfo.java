package com.ss.android.ugc.aweme.base.share;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class RocketFansGroupInfo implements Serializable {
    @c(a = "download_url")
    public String downloadUrl;
    @c(a = "schema")
    public String schema;
    @c(a = "token")
    public String token;

    static {
        Covode.recordClassIndex(42037);
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getToken() {
        return this.token;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
