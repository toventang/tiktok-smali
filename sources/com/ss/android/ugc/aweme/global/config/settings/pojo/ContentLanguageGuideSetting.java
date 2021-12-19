package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class ContentLanguageGuideSetting {
    @c(a = "code")
    private String code;
    @c(a = "en_name")
    private String enName;
    @c(a = "highlight_color")
    private String highlightColor;
    @c(a = "icon")
    private String icon;
    @c(a = "local_name")
    private String localName;

    static {
        Covode.recordClassIndex(63026);
    }

    public String getCode() {
        String str = this.code;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getEnName() {
        String str = this.enName;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getHighlightColor() {
        String str = this.highlightColor;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getIcon() {
        String str = this.icon;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getLocalName() {
        String str = this.localName;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
