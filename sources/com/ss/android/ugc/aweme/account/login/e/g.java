package com.ss.android.ugc.aweme.account.login.e;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.c;
import com.google.android.gms.c.h;
import com.ss.android.ugc.aweme.account.n.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final f f63441a;

    static {
        Covode.recordClassIndex(39085);
    }

    g(f fVar) {
        this.f63441a = fVar;
    }

    @Override // com.google.android.gms.c.c
    public final void a(h hVar) {
        f fVar = this.f63441a;
        if (!hVar.b()) {
            f.a("Failed to start SMS Retriever, exception: " + (hVar.e() != null ? d.a(hVar.e()) : ""), fVar.f63435c, fVar.f63436d);
        } else if (!f.f63433a) {
        }
    }
}
