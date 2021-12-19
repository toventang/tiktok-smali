package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class VisionSearchPrivacyLink {
    @c(a = "link_text")
    private String linkText;
    @c(a = "link_url")
    private String linkUrl;

    static {
        Covode.recordClassIndex(63112);
    }

    public String getLinkText() {
        String str = this.linkText;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getLinkUrl() {
        String str = this.linkUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
