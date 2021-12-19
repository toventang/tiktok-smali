package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

final class es extends eo {

    /* renamed from: a  reason: collision with root package name */
    private final er f50827a = new er();

    static {
        Covode.recordClassIndex(31767);
    }

    es() {
    }

    @Override // com.google.android.gms.internal.measurement.eo
    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f50827a.a(th).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
