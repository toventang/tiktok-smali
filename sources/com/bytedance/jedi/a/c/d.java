package com.bytedance.jedi.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.l.a;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(23956);
    }

    public static final void a(a<?> aVar, e<?, ?> eVar) {
        l.c(aVar, "");
        l.c(eVar, "");
        c.f39105a.a(a(aVar), eVar);
    }

    private static String a(a<?> aVar) {
        l.c(aVar, "");
        return new StringBuilder().append(aVar.getClass()).append('_').append(aVar.hashCode()).toString();
    }
}
