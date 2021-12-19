package com.ss.android.ttve.vealgorithm.params;

import com.bytedance.covode.number.Covode;

public class VEBachCommonImageParam extends VEAlgorithmParam {
    public int algorithmType = VEBachCommonImageType.VEBachAlgorithmTypeNone;
    public String path;

    static {
        Covode.recordClassIndex(37784);
    }

    public VEBachCommonImageParam() {
        this.type = VEAlgorithmType.VEAlgorithmTypeBachCommonImage;
    }
}
