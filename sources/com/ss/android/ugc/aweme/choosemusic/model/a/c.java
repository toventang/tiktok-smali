package com.ss.android.ugc.aweme.choosemusic.model.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.b.b;
import com.bytedance.jedi.a.i.a;
import com.bytedance.jedi.a.j.a;
import com.ss.android.ugc.aweme.choosemusic.model.a.f;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.n;

public final class c extends com.bytedance.jedi.a.j.b {

    /* renamed from: c  reason: collision with root package name */
    public static final h f70590c = i.a((h.f.a.a) b.f70595a);

    /* renamed from: d  reason: collision with root package name */
    public static final a f70591d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final a f70592b;

    /* renamed from: e  reason: collision with root package name */
    private final b f70593e;

    public static final class a {
        static {
            Covode.recordClassIndex(43535);
        }

        public static c a() {
            return (c) c.f70590c.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f70595a = new b();

        static {
            Covode.recordClassIndex(43536);
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
        Covode.recordClassIndex(43534);
    }

    private c() {
        b bVar = new b();
        this.f70593e = bVar;
        a aVar = new a();
        this.f70592b = aVar;
        com.bytedance.jedi.a.k.c unused = a(com.bytedance.jedi.a.c.b.a(bVar), com.bytedance.jedi.a.c.b.a(aVar), a.b.a(a.b.C0952a.f39257a, a.C0953a.C0954a.f39266a));
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public final t<d> a(e eVar, f fVar) {
        l.d(eVar, "");
        l.d(fVar, "");
        return com.bytedance.jedi.a.b.b.a(this.f70593e, this.f70592b, b.a.f39096a).a(new C1597c(fVar)).c(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.model.a.c$c  reason: collision with other inner class name */
    public static final class C1597c extends m implements h.f.a.m<t<d>, t<d>, t<d>> {
        final /* synthetic */ f $musicRequestType;

        static {
            Covode.recordClassIndex(43537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1597c(f fVar) {
            super(2);
            this.$musicRequestType = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ t<d> invoke(t<d> tVar, t<d> tVar2) {
            t<d> tVar3 = tVar;
            t<d> tVar4 = tVar2;
            l.d(tVar3, "");
            l.d(tVar4, "");
            f fVar = this.$musicRequestType;
            if (l.a(fVar, f.a.f70602a)) {
                t<d> d2 = tVar4.d(tVar3);
                l.b(d2, "");
                return d2;
            } else if (l.a(fVar, f.b.f70603a)) {
                return tVar3;
            } else {
                throw new n();
            }
        }
    }
}
