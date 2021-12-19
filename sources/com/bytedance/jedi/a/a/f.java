package com.bytedance.jedi.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.e;
import com.bytedance.jedi.a.l.a;
import h.p;
import h.w;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(23933);
    }

    public static final <K, V> e<K, V> a(e<K, List<V>> eVar) {
        a<p<K, List<V>>> c2 = eVar.c();
        if (c2 != null) {
            return (e) c2;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
