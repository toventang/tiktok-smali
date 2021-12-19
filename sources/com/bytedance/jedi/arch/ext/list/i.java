package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.x;
import h.k.d;
import h.k.k;

final /* synthetic */ class i extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final k f39453a = new i();

    static {
        Covode.recordClassIndex(24251);
    }

    i() {
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "list";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getList()Ljava/util/List;";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(ListState.class);
    }

    @Override // h.k.k
    public final Object get(Object obj) {
        return ((ListState) obj).getList();
    }
}
