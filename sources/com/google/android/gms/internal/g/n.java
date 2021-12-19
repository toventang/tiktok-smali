package com.google.android.gms.internal.g;

import com.bytedance.covode.number.Covode;

final class n extends k {
    static {
        Covode.recordClassIndex(31590);
    }

    n() {
    }

    @Override // com.google.android.gms.internal.g.k
    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
