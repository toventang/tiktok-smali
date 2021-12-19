package com.ss.android.vesdk.runtime.cloudconfig;

import com.bytedance.covode.number.Covode;

public class Config<T> {
    public final T defaultValue;
    public final String key;
    public final int type;

    static {
        Covode.recordClassIndex(99578);
    }

    public Config(String str, int i2, T t) {
        this.key = str;
        this.type = i2;
        this.defaultValue = t;
    }
}
