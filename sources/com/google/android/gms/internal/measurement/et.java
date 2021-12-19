package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

final class et extends eo {
    static {
        Covode.recordClassIndex(31768);
    }

    et() {
    }

    @Override // com.google.android.gms.internal.measurement.eo
    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
