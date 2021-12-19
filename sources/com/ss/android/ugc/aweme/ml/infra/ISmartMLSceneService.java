package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;

public interface ISmartMLSceneService {
    static {
        Covode.recordClassIndex(70964);
    }

    void configSceneModel(String str, SmartSceneConfig smartSceneConfig);

    boolean enable(String str);

    void ensureEnvAvailable(String str);

    int lastRunErrorCode(String str);

    k lastSuccessRunResult(String str);

    void runDelay(String str, long j2, h hVar, b bVar, e eVar);

    void setReportRunMonitorInterceptor(String str, c cVar);
}
