package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class EffectFileInfo {
    String path;
    int type;

    static {
        Covode.recordClassIndex(36899);
    }

    public String getPath() {
        return this.path;
    }

    public int getType() {
        return this.type;
    }

    public EffectFileInfo(int i2, String str) {
        this.type = i2;
        this.path = str;
    }
}
