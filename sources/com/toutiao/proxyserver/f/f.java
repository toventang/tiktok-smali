package com.toutiao.proxyserver.f;

import android.net.TrafficStats;
import com.bytedance.covode.number.Covode;

public final class f implements g {
    static {
        Covode.recordClassIndex(103135);
    }

    @Override // com.toutiao.proxyserver.f.g
    public final long a() {
        return TrafficStats.getTotalRxBytes();
    }
}
