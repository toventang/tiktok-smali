package com.google.android.gms.internal.g;

import com.bytedance.covode.number.Covode;

final class l extends k {

    /* renamed from: a  reason: collision with root package name */
    private final j f50613a = new j();

    static {
        Covode.recordClassIndex(31588);
    }

    l() {
    }

    @Override // com.google.android.gms.internal.g.k
    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f50613a.a(th).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
