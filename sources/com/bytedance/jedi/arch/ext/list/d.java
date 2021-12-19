package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.x;
import h.k.k;

final /* synthetic */ class d extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final k f39448a = new d();

    static {
        Covode.recordClassIndex(24246);
    }

    d() {
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "payload";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getPayload()Lcom/bytedance/jedi/arch/ext/list/Payload;";
    }

    @Override // h.f.b.c
    public final h.k.d getOwner() {
        return ab.a(ListState.class);
    }

    @Override // h.k.k
    public final Object get(Object obj) {
        return ((ListState) obj).getPayload();
    }
}
