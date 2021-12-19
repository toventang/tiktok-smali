package com.ss.android.ugc.aweme.common.a;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f76376a;

    /* renamed from: b  reason: collision with root package name */
    private final Exception f76377b;

    static {
        Covode.recordClassIndex(47133);
    }

    i(h hVar, Exception exc) {
        this.f76376a = hVar;
        this.f76377b = exc;
    }

    public final void run() {
        this.f76376a.a(this.f76377b);
    }
}
