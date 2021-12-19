package com.bytedance.lobby.google;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;

final /* synthetic */ class b implements q {

    /* renamed from: a  reason: collision with root package name */
    private final q f40210a;

    static {
        Covode.recordClassIndex(24788);
    }

    b(q qVar) {
        this.f40210a = qVar;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(p pVar) {
        q qVar = this.f40210a;
        Status status = (Status) pVar;
        if (GoogleAuth.f40188b) {
            status.c();
        }
        if (qVar != null) {
            qVar.a(status);
        }
    }
}
