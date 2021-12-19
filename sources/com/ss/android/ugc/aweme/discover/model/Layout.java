package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class Layout implements Serializable {
    @c(a = "height")
    private int height = -1;
    @c(a = "width")
    private int width = -1;

    static {
        Covode.recordClassIndex(50909);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i2) {
        this.height = i2;
    }

    public final void setWidth(int i2) {
        this.width = i2;
    }
}
