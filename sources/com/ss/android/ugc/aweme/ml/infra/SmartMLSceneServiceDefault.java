package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;

public final class SmartMLSceneServiceDefault extends SmartMLSceneService {
    static {
        Covode.recordClassIndex(70989);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void configSceneModel(String str, SmartSceneConfig smartSceneConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void ensureEnvAvailable(String str) {
    }

    public final boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final int lastRunErrorCode(String str) {
        return -100;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final k lastSuccessRunResult(String str) {
        return null;
    }

    public final void run(String str, h hVar, b bVar, e eVar) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void runDelay(String str, long j2, h hVar, b bVar, e eVar) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void setReportRunMonitorInterceptor(String str, c cVar) {
    }
}
