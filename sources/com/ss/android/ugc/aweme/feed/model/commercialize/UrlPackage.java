package com.ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class UrlPackage implements Serializable {
    @c(a = "Android")
    private String androidUrl;
    @c(a = "iOS")
    private String iosUrl;

    static {
        Covode.recordClassIndex(59482);
    }

    public final String getAndroidUrl() {
        return this.androidUrl;
    }

    public final String getIosUrl() {
        return this.iosUrl;
    }

    public final void setAndroidUrl(String str) {
        this.androidUrl = str;
    }

    public final void setIosUrl(String str) {
        this.iosUrl = str;
    }
}
