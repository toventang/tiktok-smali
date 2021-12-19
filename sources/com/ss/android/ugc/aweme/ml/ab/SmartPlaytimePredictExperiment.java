package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class SmartPlaytimePredictExperiment {
    public static final SmartPlaytimePredictConfig DEFAULT = null;
    public static final SmartPlaytimePredictExperiment INSTANCE = new SmartPlaytimePredictExperiment();
    private static boolean hasInit;
    private static SmartPlaytimePredictConfig serviceConfig;

    private SmartPlaytimePredictExperiment() {
    }

    public final SmartPlaytimePredictConfig getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(70832);
    }

    public final SmartPlaytimePredictConfig getPlaytimePredictServiceConfig() {
        if (!hasInit) {
            b a2 = b.a();
            SmartPlaytimePredictConfig smartPlaytimePredictConfig = DEFAULT;
            SmartPlaytimePredictConfig smartPlaytimePredictConfig2 = (SmartPlaytimePredictConfig) a2.a(true, "smart_playtime_predict_config", SmartPlaytimePredictConfig.class, smartPlaytimePredictConfig);
            if (smartPlaytimePredictConfig2 != null) {
                smartPlaytimePredictConfig = smartPlaytimePredictConfig2;
            }
            serviceConfig = smartPlaytimePredictConfig;
            hasInit = true;
        }
        return serviceConfig;
    }
}
