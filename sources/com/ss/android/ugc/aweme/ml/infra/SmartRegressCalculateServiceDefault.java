package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class SmartRegressCalculateServiceDefault extends SmartRegressCalculateService {
    static {
        Covode.recordClassIndex(71002);
    }

    public final void calculate(String str, h hVar, b bVar, f fVar) {
    }

    public final void calculateWithAweme(String str, Aweme aweme, b bVar, f fVar) {
    }

    public final void calculateWithAweme(String str, Aweme aweme, f fVar) {
    }

    public final void configSceneModel(String str, SmartRegressionSceneConfig smartRegressionSceneConfig) {
    }

    public final boolean enable(String str) {
        return false;
    }

    public final void ensureEnvAvailable(String str) {
    }

    public final boolean isEnvReady(String str) {
        return false;
    }

    public final float lastCalculateResult(String str, float f2) {
        return f2;
    }
}
