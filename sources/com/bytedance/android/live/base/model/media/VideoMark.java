package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class VideoMark {
    @c(a = "id")
    private int id;

    static {
        Covode.recordClassIndex(3614);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i2) {
        this.id = i2;
    }
}
