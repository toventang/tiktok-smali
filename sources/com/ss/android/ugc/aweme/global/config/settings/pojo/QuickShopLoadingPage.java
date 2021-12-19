package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class QuickShopLoadingPage {
    @c(a = "background_url")
    private String backgroundUrl;
    @c(a = "text_pic_url")
    private String textPicUrl;

    static {
        Covode.recordClassIndex(63069);
    }

    public String getBackgroundUrl() {
        String str = this.backgroundUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getTextPicUrl() {
        String str = this.textPicUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
