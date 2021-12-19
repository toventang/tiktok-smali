package com.ss.android.ugc.aweme.speedpredictor.api;

import com.bytedance.covode.number.Covode;

public abstract /* synthetic */ class c {
    static {
        Covode.recordClassIndex(87990);
    }

    public static ISpeedPredictorService a(int i2) {
        if (i2 == 1) {
            return (ISpeedPredictorService) com.ss.android.ugc.aweme.cf.a.c.a("com.ss.android.ugc.aweme.speedpredictor.impl.DTSpeedPredictorServiceImpl");
        }
        if (i2 == 2) {
            return (ISpeedPredictorService) com.ss.android.ugc.aweme.cf.a.c.a("com.ss.android.ugc.aweme.speedpredictor.cloudimpl.CloudSpeedPredictorServiceImpl");
        }
        if (i2 != 3) {
            return null;
        }
        return (ISpeedPredictorService) com.ss.android.ugc.aweme.cf.a.c.a("com.ss.android.ugc.aweme.speedpredictor.cloudimpl2.CloudSpeedPredictorServiceImpl");
    }
}
