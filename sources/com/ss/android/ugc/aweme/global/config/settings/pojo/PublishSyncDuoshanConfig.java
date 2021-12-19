package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class PublishSyncDuoshanConfig {
    @c(a = "content")
    private String content;
    @c(a = "h5_str")
    private String h5Str;
    @c(a = "h5_url")
    private String h5Url;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(63067);
    }

    public String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getH5Str() {
        String str = this.h5Str;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getH5Url() {
        String str = this.h5Url;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
