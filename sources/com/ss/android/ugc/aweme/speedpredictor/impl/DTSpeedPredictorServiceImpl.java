package com.ss.android.ugc.aweme.speedpredictor.impl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService;

public class DTSpeedPredictorServiceImpl implements ISpeedPredictorService {
    static {
        Covode.recordClassIndex(87994);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService
    public final ISpeedCalculator a() {
        return new b();
    }
}
