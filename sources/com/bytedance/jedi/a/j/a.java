package com.bytedance.jedi.a.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.e;
import com.bytedance.jedi.a.k.c;
import h.f.a.q;
import h.f.b.m;

public interface a {
    static {
        Covode.recordClassIndex(24073);
    }

    <K, V, K1, V1> c a(e<K, V> eVar, e<K1, V1> eVar2, com.bytedance.jedi.a.i.a<K, V, K1, V1> aVar);

    /* renamed from: com.bytedance.jedi.a.j.a$a  reason: collision with other inner class name */
    public static final class C0953a {
        static {
            Covode.recordClassIndex(24074);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.a.j.a$a$a  reason: collision with other inner class name */
        public static final class C0954a extends m implements q<K, V, V1, V1> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0954a f39266a = new C0954a();

            static {
                Covode.recordClassIndex(24075);
            }

            C0954a() {
                super(3);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: V */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // h.f.a.q
            public final V1 invoke(K k2, V v, V1 v1) {
                return ((v instanceof Object) && v != 0) ? v : v1;
            }
        }
    }
}
