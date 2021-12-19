package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import com.google.firebase.installations.a;
import com.google.firebase.installations.a.d;

/* access modifiers changed from: package-private */
public final class k implements n {

    /* renamed from: a  reason: collision with root package name */
    private final o f54586a;

    /* renamed from: b  reason: collision with root package name */
    private final i<l> f54587b;

    static {
        Covode.recordClassIndex(33863);
    }

    @Override // com.google.firebase.installations.n
    public final boolean a(d dVar) {
        if (!dVar.i() || o.a(dVar)) {
            return false;
        }
        this.f54587b.a(new a.C1242a().a(dVar.c()).a(dVar.e()).b(dVar.f()).a());
        return true;
    }

    public k(o oVar, i<l> iVar) {
        this.f54586a = oVar;
        this.f54587b = iVar;
    }

    @Override // com.google.firebase.installations.n
    public final boolean a(d dVar, Exception exc) {
        if (!dVar.j() && !dVar.l() && !dVar.k()) {
            return false;
        }
        this.f54587b.b(exc);
        return true;
    }
}
