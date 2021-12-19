package com.ss.android.ttve.vealgorithm.params;

import com.bytedance.covode.number.Covode;

public class VEBorderDetectParam extends VEAlgorithmParam {
    public String path;

    static {
        Covode.recordClassIndex(37787);
    }

    public VEBorderDetectParam() {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_BORDER_DETECT;
    }
}
