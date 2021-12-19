package com.bytedance.ttnet.diagnosis;

import com.bytedance.covode.number.Covode;

public interface IDiagnosisCallback {
    static {
        Covode.recordClassIndex(27274);
    }

    void onDiagnosisComplete(String str);
}
