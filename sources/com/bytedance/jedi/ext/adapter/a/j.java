package com.bytedance.jedi.ext.adapter.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.x;
import h.k.d;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final k f39667a = new j();

    static {
        Covode.recordClassIndex(24434);
    }

    j() {
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "isEmpty";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "isEmpty(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(com.bytedance.jedi.arch.ext.list.j.class, "ext_adapter_release");
    }

    @Override // h.k.k
    public final Object get(Object obj) {
        IListState iListState = (IListState) obj;
        l.c(iListState, "");
        return ((ListState) iListState.getSubstate()).isEmpty();
    }
}
