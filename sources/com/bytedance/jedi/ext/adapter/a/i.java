package com.bytedance.jedi.ext.adapter.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.j;
import h.f.b.ab;
import h.f.b.x;
import h.k.d;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final k f39666a = new i();

    static {
        Covode.recordClassIndex(24433);
    }

    i() {
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "list";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "getList(Lcom/bytedance/jedi/arch/ext/list/IListState;)Ljava/util/List;";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(j.class, "ext_adapter_release");
    }

    @Override // h.k.k
    public final Object get(Object obj) {
        return j.a((IListState) obj);
    }
}
