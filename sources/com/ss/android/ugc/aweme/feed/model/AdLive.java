package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class AdLive implements Serializable {
    @c(a = "button_bg_color")
    private String buttonBgColor;
    @c(a = "button_text")
    private String buttonText;

    static {
        Covode.recordClassIndex(59291);
    }

    public final String getButtonBgColor() {
        return this.buttonBgColor;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final void setButtonBgColor(String str) {
        this.buttonBgColor = str;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }
}
