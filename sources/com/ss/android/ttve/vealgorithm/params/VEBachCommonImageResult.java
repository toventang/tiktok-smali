package com.ss.android.ttve.vealgorithm.params;

import com.bytedance.covode.number.Covode;

public class VEBachCommonImageResult extends VEAlgorithmResult {
    public float[] vectorResult;

    static {
        Covode.recordClassIndex(37785);
    }

    public VEBachCommonImageResult() {
        this.type = VEAlgorithmType.VEAlgorithmTypeBachCommonImage;
    }
}
