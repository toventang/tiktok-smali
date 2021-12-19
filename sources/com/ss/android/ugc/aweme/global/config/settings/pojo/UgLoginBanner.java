package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UgLoginBanner {
    @c(a = "resource_url")
    private UrlModel resourceUrl;
    @c(a = "text")
    private String text;

    static {
        Covode.recordClassIndex(63093);
    }

    public UrlModel getResourceUrl() {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new a();
    }

    public String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
