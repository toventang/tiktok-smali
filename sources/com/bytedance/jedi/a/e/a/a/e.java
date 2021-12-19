package com.bytedance.jedi.a.e.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.a.b;
import h.a.n;
import h.f.b.l;
import h.p;
import h.z;
import java.util.List;

public class e<V> extends b<z, V> {

    /* renamed from: c  reason: collision with root package name */
    private List<? extends V> f39115c;

    static {
        Covode.recordClassIndex(23967);
    }

    @Override // com.bytedance.jedi.a.a.b
    public final List<p<z, List<V>>> c() {
        List<p<z, List<V>>> a2;
        List<? extends V> list = this.f39115c;
        if (list == null || (a2 = n.a(new p(z.f158842a, list))) == null) {
            return h.a.z.INSTANCE;
        }
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.a.b
    public final /* synthetic */ List b(z zVar) {
        l.c(zVar, "");
        return this.f39115c;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.jedi.a.a.b
    public final /* synthetic */ void b(z zVar, List list) {
        l.c(zVar, "");
        this.f39115c = list;
    }
}
