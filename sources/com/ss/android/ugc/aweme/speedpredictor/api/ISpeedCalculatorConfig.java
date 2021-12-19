package com.ss.android.ugc.aweme.speedpredictor.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.speedpredictor.api.d;

public interface ISpeedCalculatorConfig {
    static {
        Covode.recordClassIndex(87985);
    }

    int getCalculatorType();

    double getDefaultSpeedInBPS();

    a getIntelligentAlgoConfig();

    d.a getSpeedAlgorithmType();

    int getSpeedQueueSize();
}
