package com.google.android.gms.internal.p000authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.c;

/* renamed from: com.google.android.gms.internal.auth-api.f  reason: invalid package */
final /* synthetic */ class f implements o {

    /* renamed from: a  reason: collision with root package name */
    private final e f50556a;

    static {
        Covode.recordClassIndex(31519);
    }

    f(e eVar) {
        this.f50556a = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void a(Object obj, Object obj2) {
        e eVar = this.f50556a;
        ((c) ((c) obj).q()).a(new i((i) obj2), ((com.google.android.gms.auth.api.identity.f) eVar.f49978c).f49794a);
    }
}
