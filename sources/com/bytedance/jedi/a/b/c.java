package com.bytedance.jedi.a.b;

import com.bytedance.covode.number.Covode;
import f.a.e.e.e.v;
import f.a.t;
import h.f.b.l;
import h.f.b.m;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f39097a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(23946);
    }

    public static final class a extends m implements h.f.a.m<t<V>, t<V>, t<V>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39098a = new a();

        static {
            Covode.recordClassIndex(23947);
        }

        a() {
            super(2);
        }

        @Override // h.f.a.m
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            t tVar = (t) obj;
            t tVar2 = (t) obj2;
            l.c(tVar, "");
            l.c(tVar2, "");
            t d2 = tVar2.c(f.a.h.a.a(v.f157740a)).d(tVar);
            l.a((Object) d2, "");
            return d2;
        }
    }

    public static final class b extends m implements h.f.a.m<t<V>, t<V>, t<V>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39099a = new b();

        static {
            Covode.recordClassIndex(23948);
        }

        b() {
            super(2);
        }

        @Override // h.f.a.m
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            t tVar = (t) obj;
            t tVar2 = (t) obj2;
            l.c(tVar, "");
            l.c(tVar2, "");
            t c2 = tVar2.c(f.a.h.a.a(v.f157740a));
            f.a.e.b.b.a((Object) tVar, "other is null");
            f.a.e.b.b.a((Object) c2, "source1 is null");
            f.a.e.b.b.a((Object) tVar, "source2 is null");
            t a2 = t.a(c2, tVar);
            l.a((Object) a2, "");
            return a2;
        }
    }
}
