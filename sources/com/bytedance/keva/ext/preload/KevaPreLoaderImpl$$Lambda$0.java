package com.bytedance.keva.ext.preload;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class KevaPreLoaderImpl$$Lambda$0 implements Runnable {
    private final KevaPreLoaderImpl arg$1;

    static {
        Covode.recordClassIndex(24537);
    }

    KevaPreLoaderImpl$$Lambda$0(KevaPreLoaderImpl kevaPreLoaderImpl) {
        this.arg$1 = kevaPreLoaderImpl;
    }

    public final void run() {
        this.arg$1.bridge$lambda$0$KevaPreLoaderImpl();
    }
}
