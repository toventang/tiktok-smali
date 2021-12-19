package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class GradientBgData implements Serializable {
    @c(a = "center_color")
    private String centerColor;
    @c(a = "screens")
    private int screens;
    @c(a = "start_color")
    private String startColor;

    static {
        Covode.recordClassIndex(50900);
    }

    public final String getCenterColor() {
        return this.centerColor;
    }

    public final int getScreens() {
        return this.screens;
    }

    public final String getStartColor() {
        return this.startColor;
    }

    public final void setCenterColor(String str) {
        this.centerColor = str;
    }

    public final void setScreens(int i2) {
        this.screens = i2;
    }

    public final void setStartColor(String str) {
        this.startColor = str;
    }
}
