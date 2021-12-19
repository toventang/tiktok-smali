package com.bytedance.jedi.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.e;
import com.bytedance.jedi.a.l.a;
import h.p;
import h.w;

public final class d {
    static {
        Covode.recordClassIndex(23925);
    }

    public static final <K, V> c<K, V> a(e<K, V> eVar) {
        a<p<K, V>> c2 = eVar.c();
        if (c2 != null) {
            return (c) c2;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
