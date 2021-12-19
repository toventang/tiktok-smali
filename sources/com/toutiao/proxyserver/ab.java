package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;

final class ab extends Exception {
    static {
        Covode.recordClassIndex(103099);
    }

    public ab(Throwable th) {
        super(th);
    }
}
