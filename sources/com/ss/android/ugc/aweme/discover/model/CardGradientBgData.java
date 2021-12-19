package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class CardGradientBgData implements Serializable {
    @c(a = "dark_mode_bg_color")
    private String darkModeBgColor;
    @c(a = "dark_mode_bg_max_index")
    private Integer darkModeItemSize;

    static {
        Covode.recordClassIndex(50873);
    }

    public final String getDarkModeBgColor() {
        return this.darkModeBgColor;
    }

    public final Integer getDarkModeItemSize() {
        return this.darkModeItemSize;
    }

    public final void setDarkModeBgColor(String str) {
        this.darkModeBgColor = str;
    }

    public final void setDarkModeItemSize(Integer num) {
        this.darkModeItemSize = num;
    }
}
