package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;

public final class SmartClassifySceneConfig extends SmartSceneConfig {
    static {
        Covode.recordClassIndex(70970);
    }

    public SmartClassifySceneConfig() {
        this.outType = "classify";
    }
}
