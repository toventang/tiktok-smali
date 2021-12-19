package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.x;
import h.k.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final h.k.k f39454a = new k();

    static {
        Covode.recordClassIndex(24261);
    }

    k() {
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "refresh";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getRefresh(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/Async;";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(j.class, "ext_list_release");
    }

    @Override // h.k.k
    public final Object get(Object obj) {
        return j.b((IListState) obj);
    }
}
