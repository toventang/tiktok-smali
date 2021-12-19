package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.model.VEAlgorithmResult;

public interface VEAlgorithmCallback {
    static {
        Covode.recordClassIndex(37740);
    }

    void onFailed(int i2);

    void onResult(VEAlgorithmResult vEAlgorithmResult);
}
