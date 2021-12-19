package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class de implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final SafeHandler f126455a;

    static {
        Covode.recordClassIndex(82950);
    }

    de(SafeHandler safeHandler) {
        this.f126455a = safeHandler;
    }

    public final void run() {
        SafeHandler safeHandler = this.f126455a;
        if (safeHandler.f124754a != null) {
            safeHandler.f124754a.getLifecycle().a(safeHandler);
        }
    }
}
