package com.bytedance.assem.arch.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import h.f.a.a;

public final class l {
    static {
        Covode.recordClassIndex(14785);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ASSEM extends com.bytedance.assem.arch.b.v<? extends com.bytedance.tiktok.proxy.d> & com.bytedance.assem.arch.b.i<ITEM> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <ITEM, ASSEM extends v<? extends d> & i<ITEM>> ITEM a(ASSEM assem) {
        h.f.b.l.c(assem, "");
        j jVar = assem.n;
        if (jVar != null) {
            return (ITEM) jVar.a();
        }
        return null;
    }

    public static final int b(v<? extends d> vVar) {
        a<Integer> c2;
        Integer invoke;
        h.f.b.l.c(vVar, "");
        j jVar = vVar.n;
        if (jVar == null || (c2 = jVar.c()) == null || (invoke = c2.invoke()) == null) {
            return -1;
        }
        return invoke.intValue();
    }
}
