package com.bytedance.keva.ext.preload;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class KevaPreLoaderImpl$$Lambda$1 implements Runnable {
    private final KevaPreLoaderImpl arg$1;

    static {
        Covode.recordClassIndex(24538);
    }

    KevaPreLoaderImpl$$Lambda$1(KevaPreLoaderImpl kevaPreLoaderImpl) {
        this.arg$1 = kevaPreLoaderImpl;
    }

    public final void run() {
        this.arg$1.bridge$lambda$1$KevaPreLoaderImpl();
    }
}
