package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;

public final class SmartRegressionSceneConfig extends SmartSceneConfig {
    static {
        Covode.recordClassIndex(71004);
    }

    public SmartRegressionSceneConfig() {
        this.outType = "regression";
    }
}
