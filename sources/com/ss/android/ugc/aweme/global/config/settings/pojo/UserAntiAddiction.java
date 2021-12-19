package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UserAntiAddiction {
    @c(a = "aweme_id")
    private String awemeId;
    @c(a = "popup_text")
    private String popupText;

    static {
        Covode.recordClassIndex(63104);
    }

    public String getAwemeId() {
        String str = this.awemeId;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getPopupText() {
        String str = this.popupText;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
