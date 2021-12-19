package com.bytedance.keva.ext.preload;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class KevaPreLoaderImpl$$Lambda$4 implements Runnable {
    private final KevaPreLoaderImpl arg$1;
    private final File arg$2;
    private final Map arg$3;

    static {
        Covode.recordClassIndex(24541);
    }

    KevaPreLoaderImpl$$Lambda$4(KevaPreLoaderImpl kevaPreLoaderImpl, File file, Map map) {
        this.arg$1 = kevaPreLoaderImpl;
        this.arg$2 = file;
        this.arg$3 = map;
    }

    public final void run() {
        this.arg$1.lambda$doRealWrite$2$KevaPreLoaderImpl(this.arg$2, this.arg$3);
    }
}
