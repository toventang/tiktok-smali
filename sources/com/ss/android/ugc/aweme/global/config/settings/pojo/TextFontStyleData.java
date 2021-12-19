package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class TextFontStyleData {
    @c(a = "enable_bg_color")
    private Integer enableBgColor;
    @c(a = "enable_maskblur_light_color")
    private Integer enableMaskblurLightColor;
    @c(a = "extra_type")
    private Integer extraType;
    @c(a = "font_name")
    private String fontName;
    @c(a = "title")
    private String title;
    @c(a = "url")
    private String url;

    static {
        Covode.recordClassIndex(63085);
    }

    public Integer getEnableBgColor() {
        Integer num = this.enableBgColor;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getEnableMaskblurLightColor() {
        Integer num = this.enableMaskblurLightColor;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getExtraType() {
        Integer num = this.extraType;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getFontName() {
        String str = this.fontName;
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

    public String getUrl() {
        String str = this.url;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
