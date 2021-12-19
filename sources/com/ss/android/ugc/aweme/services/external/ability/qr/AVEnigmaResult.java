package com.ss.android.ugc.aweme.services.external.ability.qr;

import com.bytedance.covode.number.Covode;

public class AVEnigmaResult {
    AVEnigma[] result;
    public float zoomFactor;

    static {
        Covode.recordClassIndex(79680);
    }

    public AVEnigma[] getResult() {
        return this.result;
    }

    public void setResult(AVEnigma[] aVEnigmaArr) {
        this.result = aVEnigmaArr;
    }
}
