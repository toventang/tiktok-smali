package com.bytedance.android.livesdk.browser.d;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f14349a;

    static {
        Covode.recordClassIndex(7947);
    }

    c(a aVar) {
        this.f14349a = aVar;
    }

    public final void run() {
        a aVar = this.f14349a;
        if (aVar.f14336k != 0) {
            aVar.a(aVar.f14336k);
        } else {
            aVar.a(aVar.f14337l, aVar.f14338m, aVar.o, aVar.n);
        }
    }
}
