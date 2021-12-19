package com.google.android.gms.internal.b;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import com.google.android.gms.common.api.internal.s;

/* access modifiers changed from: package-private */
public abstract class k extends s<g, Void> {

    /* renamed from: c  reason: collision with root package name */
    i<Void> f50585c;

    static {
        Covode.recordClassIndex(31551);
    }

    private k() {
    }

    /* synthetic */ k(byte b2) {
        this();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b, com.google.android.gms.c.i] */
    @Override // com.google.android.gms.common.api.internal.s
    public final /* synthetic */ void a(g gVar, i<Void> iVar) {
        this.f50585c = iVar;
        a((c) gVar.q());
    }

    /* access modifiers changed from: protected */
    public abstract void a(c cVar);
}
