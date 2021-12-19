package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class df implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final SafeHandler f126456a;

    static {
        Covode.recordClassIndex(82951);
    }

    df(SafeHandler safeHandler) {
        this.f126456a = safeHandler;
    }

    public final void run() {
        SafeHandler safeHandler = this.f126456a;
        if (safeHandler.f124754a != null) {
            safeHandler.f124754a.getLifecycle().b(safeHandler);
        }
    }
}
