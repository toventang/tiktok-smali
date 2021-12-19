package com.benchmark;

import com.bytedance.covode.number.Covode;

public class BHSlardarDowngrade implements IBTCHSlardar {
    static {
        Covode.recordClassIndex(2926);
    }

    @Override // com.benchmark.IBTCHSlardar
    public void onException(Throwable th) {
    }
}
