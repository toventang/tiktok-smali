package com.google.android.gms.auth.api.signin.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.p;

public final class k extends m<Status> {
    static {
        Covode.recordClassIndex(31125);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ p a(Status status) {
        return status;
    }

    public k(i iVar) {
        super(iVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    @Override // com.google.android.gms.common.api.internal.d.a
    public final /* synthetic */ void a(g gVar) {
        g gVar2 = gVar;
        ((s) gVar2.q()).b(new n(this), gVar2.f49867a);
    }
}
