package com.bytedance.jedi.ext.adapter.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.j;
import h.f.b.ab;
import h.f.b.x;
import h.k.d;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final k f39669a = new l();

    static {
        Covode.recordClassIndex(24436);
    }

    l() {
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "loadMore";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getLoadMore(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/Async;";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(j.class, "ext_adapter_release");
    }

    @Override // h.k.k
    public final Object get(Object obj) {
        return j.c((IListState) obj);
    }
}
