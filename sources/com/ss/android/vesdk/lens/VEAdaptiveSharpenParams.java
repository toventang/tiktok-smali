package com.ss.android.vesdk.lens;

import com.bytedance.covode.number.Covode;

public class VEAdaptiveSharpenParams extends VEBaseRecorderLensParams {
    public float amount = -1.0f;
    public int diffImgSmoothEnable = -1;
    public float edgeWeightGamma = -1.0f;
    public int initDelayFrameCnt;
    public float overRatio = -1.0f;
    public int powerLevelPara = 4;
    public int processDelayFrameCnt;
    public int sceneMode = 3;

    static {
        Covode.recordClassIndex(99530);
    }
}
