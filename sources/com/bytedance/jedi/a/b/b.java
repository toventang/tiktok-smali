package com.bytedance.jedi.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.a.c;
import com.bytedance.jedi.a.b.a;
import com.bytedance.jedi.a.c.e;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b {

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<a.b<K, RESP, K1, V1>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39096a = new a();

        static {
            Covode.recordClassIndex(23945);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            l.c(obj, "");
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(23944);
    }

    public static final <K, V, REQ, RESP, K1, V1> a<K, V, REQ, RESP, K1, V1> a(com.bytedance.jedi.a.f.b<K, V, REQ, RESP> bVar, c<K1, V1> cVar, h.f.a.b<? super a.b<K, RESP, K1, V1>, z> bVar2) {
        l.c(bVar, "");
        l.c(cVar, "");
        l.c(bVar2, "");
        e a2 = com.bytedance.jedi.a.c.b.a(cVar);
        l.c(bVar, "");
        l.c(a2, "");
        l.c(bVar2, "");
        a.b bVar3 = new a.b();
        bVar2.invoke(bVar3);
        return new a<>(bVar, a2, bVar3, (byte) 0);
    }
}
