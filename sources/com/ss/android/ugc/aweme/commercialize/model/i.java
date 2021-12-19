package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class i implements Serializable {
    @c(a = "hint_text")
    private String hintText;

    static {
        Covode.recordClassIndex(46173);
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final void setHintText(String str) {
        this.hintText = str;
    }
}
