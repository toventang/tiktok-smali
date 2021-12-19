package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class MediaDebugInfo {
    @c(a = "info")
    private String info;

    static {
        Covode.recordClassIndex(3609);
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String str) {
        this.info = str;
    }
}
