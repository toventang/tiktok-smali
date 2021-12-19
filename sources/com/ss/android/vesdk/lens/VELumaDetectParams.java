package com.ss.android.vesdk.lens;

import com.bytedance.covode.number.Covode;

public class VELumaDetectParams extends VEBaseRecorderLensParams {
    public int detectFrames = 3;
    public float ecStep;
    public int exposureTime = 1;
    public int iso = 100;
    public int maxExposureTime = 1;
    public int maxIso = 6400;
    public int minExposureTime = 1;
    public int minIso = 100;

    static {
        Covode.recordClassIndex(99532);
    }
}
