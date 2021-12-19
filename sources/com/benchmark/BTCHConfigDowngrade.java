package com.benchmark;

import com.bytedance.covode.number.Covode;

public class BTCHConfigDowngrade implements IBTCHConfiguration {
    static {
        Covode.recordClassIndex(2927);
    }

    @Override // com.benchmark.IBTCHConfiguration
    public final a a() {
        return null;
    }
}
