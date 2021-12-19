package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UgBubble {
    @c(a = "resource_url")
    private UrlModel resourceUrl;
    @c(a = "seconds")
    private Integer seconds;
    @c(a = "text")
    private String text;

    static {
        Covode.recordClassIndex(63089);
    }

    public UrlModel getResourceUrl() {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new a();
    }

    public Integer getSeconds() {
        Integer num = this.seconds;
        if (num != null) {
            return num;
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
