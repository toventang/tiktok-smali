package com.bytedance.helios.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f30986a;

    static {
        Covode.recordClassIndex(17996);
    }

    g(f fVar) {
        this.f30986a = fVar;
    }

    public final void run() {
        f fVar = this.f30986a;
        fVar.f30955h.set(!fVar.f30951d.get());
        f.a("Helios-Log-Page-State", "mBackgroundInvokeFlag=" + fVar.f30955h);
    }
}
