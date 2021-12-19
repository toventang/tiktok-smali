package com.ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;

public class NativeBitrateSelectConfig {
    public int cacheCheck;
    public boolean useCallback;
    public boolean useNative;

    static {
        Covode.recordClassIndex(97988);
    }

    public NativeBitrateSelectConfig(boolean z, boolean z2, int i2) {
        this.useCallback = z;
        this.useNative = z2;
        this.cacheCheck = i2;
    }
}
