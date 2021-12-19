package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.x;
import h.k.d;
import h.k.k;

final /* synthetic */ class g extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final k f39451a = new g();

    static {
        Covode.recordClassIndex(24249);
    }

    g() {
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "refresh";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getRefresh()Lcom/bytedance/jedi/arch/Async;";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(ListState.class);
    }

    @Override // h.k.k
    public final Object get(Object obj) {
        return ((ListState) obj).getRefresh();
    }
}
