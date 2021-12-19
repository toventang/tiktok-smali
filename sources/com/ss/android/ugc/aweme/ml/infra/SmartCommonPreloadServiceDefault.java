package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class SmartCommonPreloadServiceDefault extends SmartCommonPreloadService {
    static {
        Covode.recordClassIndex(70979);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService
    public final void checkAndInit() {
    }

    public final void configOneNewService(SmartClassifySceneConfig smartClassifySceneConfig) {
    }

    public final boolean enable(String str) {
        return false;
    }

    public final void ensureEnvAvailable(String str) {
    }

    public final boolean isEnvReady(String str) {
        return false;
    }

    public final boolean lastResult(String str, boolean z) {
        return z;
    }

    public final float lastResultScore(String str, float f2) {
        return f2;
    }

    public final void smartJudge(String str, h hVar, b bVar, d dVar) {
    }

    public final void smartJudgeWithAweme(String str, Aweme aweme, b bVar, d dVar) {
    }

    public final void smartJudgeWithAweme(String str, Aweme aweme, d dVar) {
    }
}
