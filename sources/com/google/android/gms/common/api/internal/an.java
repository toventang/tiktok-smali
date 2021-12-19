package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;
import java.util.Collections;

public final class an implements at {

    /* renamed from: a  reason: collision with root package name */
    private final aw f50050a;

    static {
        Covode.recordClassIndex(31230);
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a(int i2) {
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a(ConnectionResult connectionResult, a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void a() {
        for (a.f fVar : this.f50050a.f50073f.values()) {
            fVar.f();
        }
        this.f50050a.f50080m.f50056e = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final void c() {
        aw awVar = this.f50050a;
        awVar.f50068a.lock();
        try {
            awVar.f50078k = new ae(awVar, awVar.f50075h, awVar.f50076i, awVar.f50071d, awVar.f50077j, awVar.f50068a, awVar.f50070c);
            awVar.f50078k.a();
            awVar.f50069b.signalAll();
        } finally {
            awVar.f50068a.unlock();
        }
    }

    public an(aw awVar) {
        this.f50050a = awVar;
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final <A extends a.b, T extends d.a<? extends p, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.at
    public final <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t) {
        this.f50050a.f50080m.f50054c.add(t);
        return t;
    }
}
