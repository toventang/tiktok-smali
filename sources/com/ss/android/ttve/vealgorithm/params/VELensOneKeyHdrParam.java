package com.ss.android.ttve.vealgorithm.params;

import com.bytedance.covode.number.Covode;

public class VELensOneKeyHdrParam extends VEAlgorithmParam {
    public boolean bUseHardwareDecoder;
    public int frameCount;
    public int frameSize;
    public String path;
    public int threadNum;

    static {
        Covode.recordClassIndex(37790);
    }

    public VELensOneKeyHdrParam() {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_ONE_KEY_HDR;
    }
}
