package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class GlobalDoodleConfig implements Serializable {
    @c(a = "display_filter_bar")
    private int displayFilterBar = 1;

    static {
        Covode.recordClassIndex(71660);
    }

    public final int getDisplayFilterBar() {
        return this.displayFilterBar;
    }

    public final void setDisplayFilterBar(int i2) {
        this.displayFilterBar = i2;
    }
}
