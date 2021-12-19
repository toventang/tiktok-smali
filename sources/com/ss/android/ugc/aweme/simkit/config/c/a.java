package com.ss.android.ugc.aweme.simkit.config.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.d;

public class a implements ISpeedCalculatorConfig {
    static {
        Covode.recordClassIndex(87322);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getCalculatorType() {
        return 1;
    }

    public d getCustomSpeedAlgorithm() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public double getDefaultSpeedInBPS() {
        return -1.0d;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public com.ss.android.ugc.aweme.speedpredictor.api.a getIntelligentAlgoConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getSpeedQueueSize() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public d.a getSpeedAlgorithmType() {
        return d.a.DEFAULT;
    }
}
