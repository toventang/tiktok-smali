package com.ss.android.ugc.aweme.mediachoose.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.b.b;
import com.bytedance.jedi.a.i.a;
import com.bytedance.jedi.a.j.a;
import com.ss.android.ugc.aweme.mediachoose.d;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.n;

public final class c extends com.bytedance.jedi.a.j.b {

    /* renamed from: c  reason: collision with root package name */
    public static final h f109341c = i.a((h.f.a.a) b.f109349a);

    /* renamed from: d  reason: collision with root package name */
    public static final a f109342d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final b f109343b;

    /* renamed from: e  reason: collision with root package name */
    private final a f109344e;

    /* renamed from: f  reason: collision with root package name */
    private final a f109345f;

    /* renamed from: g  reason: collision with root package name */
    private final a f109346g;

    public static final class a {
        static {
            Covode.recordClassIndex(70037);
        }

        public static c a() {
            return (c) c.f109341c.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f109349a = new b();

        static {
            Covode.recordClassIndex(70038);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(70034);
    }

    private c() {
        a aVar = new a();
        this.f109344e = aVar;
        a aVar2 = new a();
        this.f109345f = aVar2;
        this.f109346g = new a();
        b bVar = new b();
        this.f109343b = bVar;
        com.bytedance.jedi.a.k.c unused = a(com.bytedance.jedi.a.c.b.a(aVar), com.bytedance.jedi.a.c.b.a(bVar), a.b.a(a.b.C0952a.f39257a, a.C0953a.C0954a.f39266a));
        a(com.bytedance.jedi.a.c.b.a(aVar2), com.bytedance.jedi.a.c.b.a(bVar), a.b.a(AnonymousClass1.f109347a, AnonymousClass2.f109348a));
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a.c$c  reason: collision with other inner class name */
    public static final class C2804c extends m implements h.f.a.m<t<d>, t<d>, t<d>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2804c f109350a = new C2804c();

        static {
            Covode.recordClassIndex(70039);
        }

        C2804c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ t<d> invoke(t<d> tVar, t<d> tVar2) {
            t<d> tVar3 = tVar;
            t<d> tVar4 = tVar2;
            l.d(tVar3, "");
            l.d(tVar4, "");
            t<d> d2 = tVar4.d(tVar3);
            l.b(d2, "");
            return d2;
        }
    }

    public final t<d> a(e eVar, d dVar) {
        com.bytedance.jedi.a.f.b bVar;
        l.d(eVar, "");
        l.d(dVar, "");
        if (l.a(dVar, d.a.f109380a)) {
            bVar = com.bytedance.jedi.a.b.b.a(this.f109344e, this.f109343b, b.a.f39096a).a(C2804c.f109350a);
        } else if (l.a(dVar, d.b.f109381a)) {
            bVar = this.f109345f;
        } else if (l.a(dVar, d.c.f109382a)) {
            bVar = this.f109346g;
        } else {
            throw new n();
        }
        return bVar.c(eVar);
    }
}
