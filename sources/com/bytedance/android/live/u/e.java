package com.bytedance.android.live.u;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f12823a;

    static {
        Covode.recordClassIndex(7130);
    }

    e(b bVar) {
        this.f12823a = bVar;
    }

    public final void run() {
        b bVar = this.f12823a;
        if (bVar.f12805c) {
            bVar.f();
            bVar.f12815m = -1;
            bVar.n = false;
        }
    }
}
