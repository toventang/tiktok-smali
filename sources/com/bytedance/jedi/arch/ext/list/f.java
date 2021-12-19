package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.x;
import h.k.d;
import h.k.k;

final /* synthetic */ class f extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final k f39450a = new f();

    static {
        Covode.recordClassIndex(24248);
    }

    f() {
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "isEmpty";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "isEmpty()Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(ListState.class);
    }

    @Override // h.k.k
    public final Object get(Object obj) {
        return ((ListState) obj).isEmpty();
    }
}
