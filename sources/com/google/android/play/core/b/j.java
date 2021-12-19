package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;

final class j extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f53153a;

    static {
        Covode.recordClassIndex(32849);
    }

    j(k kVar) {
        this.f53153a = kVar;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        l lVar = this.f53153a.f53154a;
        lVar.f53157b.d("unlinkToDeath", new Object[0]);
        lVar.f53166k.asBinder().unlinkToDeath(lVar.f53164i, 0);
        this.f53153a.f53154a.f53166k = null;
        this.f53153a.f53154a.f53160e = false;
    }
}
