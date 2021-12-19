package com.bytedance.keva.ext.preload;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
public final /* synthetic */ class KevaPreLoaderImpl$$Lambda$2 implements Runnable {
    private final KevaPreLoaderImpl arg$1;
    private final String arg$2;
    private final AtomicLong arg$3;
    private final long arg$4;

    static {
        Covode.recordClassIndex(24539);
    }

    KevaPreLoaderImpl$$Lambda$2(KevaPreLoaderImpl kevaPreLoaderImpl, String str, AtomicLong atomicLong, long j2) {
        this.arg$1 = kevaPreLoaderImpl;
        this.arg$2 = str;
        this.arg$3 = atomicLong;
        this.arg$4 = j2;
    }

    public final void run() {
        this.arg$1.lambda$doPreload$0$KevaPreLoaderImpl(this.arg$2, this.arg$3, this.arg$4);
    }
}
