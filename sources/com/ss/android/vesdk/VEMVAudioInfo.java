package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public class VEMVAudioInfo {
    public String path;
    public int trimIn;
    public int trimOut;

    static {
        Covode.recordClassIndex(99189);
    }
}
