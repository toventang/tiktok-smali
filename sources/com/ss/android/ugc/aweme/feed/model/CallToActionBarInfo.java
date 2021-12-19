package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class CallToActionBarInfo implements Serializable {
    @c(a = "button_text")
    private String buttonText = "";
    @c(a = "text")
    private String text = "";

    static {
        Covode.recordClassIndex(59354);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getText() {
        return this.text;
    }

    public final void setButtonText(String str) {
        l.d(str, "");
        this.buttonText = str;
    }

    public final void setText(String str) {
        l.d(str, "");
        this.text = str;
    }
}
