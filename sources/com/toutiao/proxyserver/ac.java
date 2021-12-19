package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;

interface ac extends Runnable {
    static {
        Covode.recordClassIndex(103100);
    }
}
