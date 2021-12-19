package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import java.util.Map;

public final class SmartPlaytimePredictServiceDefault extends SmartPlaytimePredictService {
    static {
        Covode.recordClassIndex(70997);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void ensureEnvAvailable(String str) {
    }

    public final boolean isEnvReady(String str) {
        return false;
    }

    public final float lastPredictFloatResult(String str, float f2) {
        return f2;
    }

    public final String lastPredictResultLabel(String str, String str2) {
        return str2;
    }

    public final Map<String, Float> lastPredictResultScoreMap(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void predict(String str, h hVar, b bVar, e eVar) {
    }

    public final void predictWithAweme(String str, Aweme aweme, b bVar, e eVar) {
    }

    public final void predictWithAweme(String str, Aweme aweme, e eVar) {
    }
}
