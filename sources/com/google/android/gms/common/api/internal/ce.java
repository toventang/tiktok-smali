package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.k;

public final class ce extends cc<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private final k.a<?> f50146b;

    static {
        Covode.recordClassIndex(31276);
    }

    @Override // com.google.android.gms.common.api.internal.cc, com.google.android.gms.common.api.internal.bn
    public final /* bridge */ /* synthetic */ void a(cv cvVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.cc, com.google.android.gms.common.api.internal.bn
    public final /* bridge */ /* synthetic */ void a(Status status) {
        super.a(status);
    }

    @Override // com.google.android.gms.common.api.internal.cc, com.google.android.gms.common.api.internal.bn
    public final /* bridge */ /* synthetic */ void a(RuntimeException runtimeException) {
        super.a(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.as
    public final Feature[] a(f.a<?> aVar) {
        bm bmVar = aVar.f50237c.get(this.f50146b);
        if (bmVar == null) {
            return null;
        }
        return bmVar.f50102a.f50268b;
    }

    @Override // com.google.android.gms.common.api.internal.as
    public final boolean b(f.a<?> aVar) {
        bm bmVar = aVar.f50237c.get(this.f50146b);
        if (bmVar == null || !bmVar.f50102a.f50269c) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.cc
    public final void d(f.a<?> aVar) {
        bm remove = aVar.f50237c.remove(this.f50146b);
        if (remove != null) {
            remove.f50102a.f50267a.f50263a = null;
        } else {
            this.f50142a.b((Object) false);
        }
    }

    public ce(k.a<?> aVar, i<Boolean> iVar) {
        super(iVar);
        this.f50146b = aVar;
    }
}
