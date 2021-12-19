package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;

public interface ISmartPlaytimePredictService {
    static {
        Covode.recordClassIndex(70965);
    }

    void checkAndInit();

    void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig);

    boolean enable(String str);

    void ensureEnvAvailable(String str);

    void predict(String str, h hVar, b bVar, e eVar);
}
