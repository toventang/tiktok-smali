package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public class VESafeAreaParams {
    public float bottom;
    public float left;
    public float right;
    public int safeType;
    public float top;

    static {
        Covode.recordClassIndex(99203);
    }
}
