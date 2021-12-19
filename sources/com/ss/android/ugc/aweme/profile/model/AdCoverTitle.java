package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class AdCoverTitle implements Serializable, Cloneable {
    @c(a = "title")
    public String title;
    @c(a = "web_url")
    public String webUrl;

    static {
        Covode.recordClassIndex(75199);
    }

    public String getTitle() {
        return this.title;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
