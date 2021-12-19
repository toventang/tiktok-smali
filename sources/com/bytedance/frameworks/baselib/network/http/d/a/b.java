package com.bytedance.frameworks.baselib.network.http.d.a;

import com.bytedance.covode.number.Covode;

enum b {
    CONNECTION_INFO_UNKNOWN(0),
    CONNECTION_INFO_HTTP1_1(1),
    CONNECTION_INFO_DEPRECATED_SPDY3(3),
    CONNECTION_INFO_HTTP2(4),
    CONNECTION_INFO_QUIC_UNKNOWN_VERSION(5),
    CONNECTION_INFO_HTTP1_0(9);
    
    final int mValue;

    static {
        Covode.recordClassIndex(17057);
    }

    private b(int i2) {
        this.mValue = i2;
    }
}
