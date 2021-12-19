package com.ss.android.vesdk.model;

import com.bytedance.covode.number.Covode;

public class VERecordPerformanceData {
    public float fps = -1.0f;
    public int lagCount = -1;
    public long lagMaxDuration = -1;
    public long lagTotalDuration = -1;

    static {
        Covode.recordClassIndex(99544);
    }
}
