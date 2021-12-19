package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.b.a;
import com.bytedance.jedi.a.i.a;
import com.bytedance.jedi.a.j.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.a.q;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import f.a.t;
import f.a.x;
import h.a.ag;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class g extends com.bytedance.jedi.a.j.b implements o {

    /* renamed from: b  reason: collision with root package name */
    public final f.a.l.b<com.ss.android.ugc.aweme.filter.repository.a.c> f95659b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.jedi.a.d.a<Integer, com.ss.android.ugc.aweme.filter.repository.a.d> f95660c = new com.bytedance.jedi.a.d.a<>((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public final f.a.l.b<Map<Integer, com.ss.android.ugc.aweme.filter.repository.a.d>> f95661d;

    /* renamed from: e  reason: collision with root package name */
    public AtomicReference<p<t<com.ss.android.ugc.aweme.filter.repository.internal.a>, f.a.l.g<com.ss.android.ugc.aweme.filter.repository.internal.a>>> f95662e;

    /* renamed from: f  reason: collision with root package name */
    f.a.b.a f95663f;

    /* renamed from: g  reason: collision with root package name */
    final com.ss.android.ugc.aweme.filter.repository.internal.n f95664g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.filter.repository.internal.i f95665h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f95666i;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.jedi.a.h.f<com.ss.android.ugc.aweme.filter.repository.internal.a> f95667j;

    /* renamed from: k  reason: collision with root package name */
    private final f.a.l.c<com.ss.android.ugc.aweme.filter.repository.a.e> f95668k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f95669l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.filter.repository.internal.l f95670m;
    private final com.ss.android.ugc.aweme.filter.repository.internal.k n;
    private final com.ss.android.ugc.aweme.filter.repository.internal.e o;
    private final com.ss.android.ugc.aweme.filter.repository.internal.h p;

    static {
        Covode.recordClassIndex(60621);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final com.ss.android.ugc.aweme.filter.repository.a.l g() {
        return this.f95670m;
    }

    static final class i implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f95682a;

        static {
            Covode.recordClassIndex(60634);
        }

        i(g gVar) {
            this.f95682a = gVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f95682a.f95662e.set(null);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.filter.repository.internal.i> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(60636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.repository.internal.i invoke() {
            com.ss.android.ugc.aweme.filter.repository.internal.i iVar = this.this$0.f95665h;
            iVar.a(this.this$0);
            return iVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final t<Map<Integer, com.ss.android.ugc.aweme.filter.repository.a.d>> d() {
        t<Map<Integer, com.ss.android.ugc.aweme.filter.repository.a.d>> c2 = this.f95661d.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final t<com.ss.android.ugc.aweme.filter.repository.a.e> e() {
        t<com.ss.android.ugc.aweme.filter.repository.a.e> c2 = this.f95668k.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final q f() {
        return (q) this.f95669l.getValue();
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f95687a;

        static {
            Covode.recordClassIndex(60639);
        }

        n(g gVar) {
            this.f95687a = gVar;
        }

        public final void run() {
            this.f95687a.f95660c.c();
            this.f95687a.f95661d.onNext(ag.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final t<com.ss.android.ugc.aweme.filter.repository.a.c> c() {
        t<com.ss.android.ugc.aweme.filter.repository.a.c> c2 = this.f95659b.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final void b() {
        f.a.b.a aVar = this.f95663f;
        aVar.dispose();
        aVar.a();
        this.f95663f = new f.a.b.a();
        this.o.b();
        this.n.b();
        this.f95667j.c();
        this.f95659b.onNext(com.ss.android.ugc.aweme.filter.repository.a.a.a.f95532a);
        f.a.a.b.a.a().a(new n(this));
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final void a() {
        t<com.ss.android.ugc.aweme.filter.repository.internal.a> b2;
        f.a.l.g<com.ss.android.ugc.aweme.filter.repository.internal.a> second;
        t c2 = com.bytedance.jedi.a.b.b.a(this.p, this.f95667j, f.f95676a).a(new C2309g(this)).c(z.f158842a);
        f.a.l.b bVar = new f.a.l.b();
        h.f.b.l.b(bVar, "");
        if (this.f95662e.compareAndSet(null, v.a(c2, bVar))) {
            c2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(new h(this)).b((f.a.d.a) new i(this)).b((f.a.z) bVar);
            b2 = bVar.c();
            h.f.b.l.b(b2, "");
        } else {
            p<t<com.ss.android.ugc.aweme.filter.repository.internal.a>, f.a.l.g<com.ss.android.ugc.aweme.filter.repository.internal.a>> pVar = this.f95662e.get();
            if (pVar == null || (second = pVar.getSecond()) == null || (b2 = second.c()) == null) {
                b2 = t.b(new com.ss.android.ugc.aweme.filter.repository.internal.a(com.ss.android.ugc.aweme.filter.repository.a.a.a.f95532a, true));
                h.f.b.l.b(b2, "");
            }
        }
        h.f.b.l.b(b2.b(d.f95674a).d(e.f95675a), "");
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final com.ss.android.ugc.aweme.filter.repository.a.g b(int i2) {
        return d(i2);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, R> implements f.a.d.g<com.ss.android.ugc.aweme.filter.repository.internal.b, com.ss.android.ugc.aweme.filter.repository.a.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f95673a;

        static {
            Covode.recordClassIndex(60624);
        }

        c(g gVar) {
            this.f95673a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.repository.a.d apply(com.ss.android.ugc.aweme.filter.repository.internal.b bVar) {
            com.ss.android.ugc.aweme.filter.repository.internal.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return this.f95673a.a(bVar2);
        }
    }

    static final class e<T, R> implements f.a.d.g<com.ss.android.ugc.aweme.filter.repository.internal.a, com.ss.android.ugc.aweme.filter.repository.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f95675a = new e();

        static {
            Covode.recordClassIndex(60626);
        }

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ com.ss.android.ugc.aweme.filter.repository.a.c apply(com.ss.android.ugc.aweme.filter.repository.internal.a aVar) {
            com.ss.android.ugc.aweme.filter.repository.internal.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            return aVar2.f95560a;
        }
    }

    static final class h<T> implements f.a.d.f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f95681a;

        static {
            Covode.recordClassIndex(60633);
        }

        h(g gVar) {
            this.f95681a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f95681a.f95662e.set(null);
        }
    }

    static final class m<T> implements f.a.d.f<List<? extends com.ss.android.ugc.aweme.filter.repository.a.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f95686a;

        static {
            Covode.recordClassIndex(60638);
        }

        m(g gVar) {
            this.f95686a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.filter.repository.internal.main.g */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(List<? extends com.ss.android.ugc.aweme.filter.repository.a.d> list) {
            List<? extends com.ss.android.ugc.aweme.filter.repository.a.d> list2 = list;
            g gVar = this.f95686a;
            h.f.b.l.b(list2, "");
            gVar.a((List<com.ss.android.ugc.aweme.filter.repository.a.d>) list2);
        }
    }

    private t<com.ss.android.ugc.aweme.filter.repository.a.d> b(com.ss.android.ugc.aweme.filter.repository.a.f fVar) {
        h.f.b.l.d(fVar, "");
        return c(fVar);
    }

    private com.ss.android.ugc.aweme.filter.repository.a.d c(int i2) {
        return this.f95660c.b(Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final t<com.ss.android.ugc.aweme.filter.repository.a.d> a(FilterBean filterBean) {
        h.f.b.l.d(filterBean, "");
        return b(com.ss.android.ugc.aweme.filter.repository.internal.utils.b.a(filterBean));
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$g  reason: collision with other inner class name */
    static final class C2309g extends h.f.b.m implements h.f.a.m<t<com.ss.android.ugc.aweme.filter.repository.internal.a>, t<com.ss.android.ugc.aweme.filter.repository.internal.a>, t<com.ss.android.ugc.aweme.filter.repository.internal.a>> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(60630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2309g(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$g$a */
        static final class a<T, R> implements f.a.d.g<com.ss.android.ugc.aweme.filter.repository.internal.a, x<? extends com.ss.android.ugc.aweme.filter.repository.internal.a>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f95679a = new a();

            static {
                Covode.recordClassIndex(60631);
            }

            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.g
            public final /* synthetic */ x<? extends com.ss.android.ugc.aweme.filter.repository.internal.a> apply(com.ss.android.ugc.aweme.filter.repository.internal.a aVar) {
                com.ss.android.ugc.aweme.filter.repository.internal.a aVar2 = aVar;
                h.f.b.l.d(aVar2, "");
                if (aVar2.f95561b) {
                    return f.a.h.a.a(f.a.e.e.e.v.f157740a);
                }
                return t.b(aVar2);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$g$b */
        static final class b<T> implements f.a.d.f<com.ss.android.ugc.aweme.filter.repository.internal.a> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2309g f95680a;

            static {
                Covode.recordClassIndex(60632);
            }

            b(C2309g gVar) {
                this.f95680a = gVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(com.ss.android.ugc.aweme.filter.repository.internal.a aVar) {
                g gVar = this.f95680a.this$0;
                List<com.ss.android.ugc.aweme.filter.repository.a.f> list = aVar.f95560a.f95542a;
                gVar.f95663f.a(gVar.f95664g.c(list).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).a(new j(gVar, list), com.ss.android.ugc.tools.utils.p.f150012a));
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ t<com.ss.android.ugc.aweme.filter.repository.internal.a> invoke(t<com.ss.android.ugc.aweme.filter.repository.internal.a> tVar, t<com.ss.android.ugc.aweme.filter.repository.internal.a> tVar2) {
            t<com.ss.android.ugc.aweme.filter.repository.internal.a> tVar3 = tVar;
            t<com.ss.android.ugc.aweme.filter.repository.internal.a> tVar4 = tVar2;
            h.f.b.l.d(tVar3, "");
            h.f.b.l.d(tVar4, "");
            t<R> d2 = tVar4.a((f.a.d.g<? super com.ss.android.ugc.aweme.filter.repository.internal.a, ? extends x<? extends R>>) a.f95679a, false).c(f.a.h.a.a(f.a.e.e.e.v.f157740a)).d(tVar3.b(new b(this)));
            h.f.b.l.b(d2, "");
            return d2;
        }
    }

    static final class d<T> implements f.a.d.f<com.ss.android.ugc.aweme.filter.repository.internal.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f95674a = new d();

        static {
            Covode.recordClassIndex(60625);
        }

        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.filter.repository.internal.a aVar) {
            com.ss.android.ugc.aweme.filter.repository.internal.a aVar2 = aVar;
            if (aVar2.f95561b && aVar2.f95560a.f95542a.isEmpty()) {
                throw new RuntimeException("Failed to fetch filter data.");
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<a.b<z, com.ss.android.ugc.aweme.filter.repository.internal.a, z, com.ss.android.ugc.aweme.filter.repository.internal.a>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f95676a = new f();

        static {
            Covode.recordClassIndex(60627);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a.b<z, com.ss.android.ugc.aweme.filter.repository.internal.a, z, com.ss.android.ugc.aweme.filter.repository.internal.a> bVar) {
            a.b<z, com.ss.android.ugc.aweme.filter.repository.internal.a, z, com.ss.android.ugc.aweme.filter.repository.internal.a> bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            AnonymousClass1 r0 = AnonymousClass1.f95677a;
            h.f.b.l.c(r0, "");
            bVar2.f39088a = r0;
            AnonymousClass2 r02 = AnonymousClass2.f95678a;
            h.f.b.l.c(r02, "");
            bVar2.f39089b = r02;
            return z.f158842a;
        }
    }

    static final class l<T, R> implements f.a.d.g<com.ss.android.ugc.aweme.filter.repository.internal.b, List<? extends com.ss.android.ugc.aweme.filter.repository.a.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f95685a;

        static {
            Covode.recordClassIndex(60637);
        }

        l(g gVar) {
            this.f95685a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ List<? extends com.ss.android.ugc.aweme.filter.repository.a.d> apply(com.ss.android.ugc.aweme.filter.repository.internal.b bVar) {
            com.ss.android.ugc.aweme.filter.repository.internal.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return h.a.n.a(this.f95685a.a(bVar2));
        }
    }

    private final com.ss.android.ugc.aweme.filter.repository.a.g d(int i2) {
        com.ss.android.ugc.aweme.filter.repository.a.g gVar;
        com.ss.android.ugc.aweme.filter.repository.a.d b2 = this.f95660c.b(Integer.valueOf(i2));
        if (b2 == null || (gVar = b2.f95545b) == null) {
            return com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_UNKNOWN;
        }
        return gVar;
    }

    static final class b<T> implements f.a.d.f<List<? extends p<? extends z, ? extends com.ss.android.ugc.aweme.filter.repository.internal.a>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f95672a;

        static {
            Covode.recordClassIndex(60623);
        }

        b(g gVar) {
            this.f95672a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(List<? extends p<? extends z, ? extends com.ss.android.ugc.aweme.filter.repository.internal.a>> list) {
            com.ss.android.ugc.aweme.filter.repository.internal.a aVar;
            List<? extends p<? extends z, ? extends com.ss.android.ugc.aweme.filter.repository.internal.a>> list2 = list;
            h.f.b.l.b(list2, "");
            p pVar = (p) h.a.n.b((List) list2, 0);
            if (pVar != null && (aVar = (com.ss.android.ugc.aweme.filter.repository.internal.a) pVar.getSecond()) != null) {
                this.f95672a.f95659b.onNext(aVar.f95560a);
            }
        }
    }

    private final t<com.ss.android.ugc.aweme.filter.repository.a.d> c(com.ss.android.ugc.aweme.filter.repository.a.f fVar) {
        com.ss.android.ugc.aweme.filter.repository.a.g gVar;
        com.ss.android.ugc.aweme.filter.repository.a.d c2 = c(fVar.f95550a);
        if (c2 != null) {
            gVar = c2.f95545b;
        } else {
            gVar = null;
        }
        if (gVar == com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_DOWNLOAD_SUCCESS) {
            t<com.ss.android.ugc.aweme.filter.repository.a.d> b2 = t.b(c2);
            h.f.b.l.b(b2, "");
            return b2;
        }
        t<R> d2 = this.n.a(fVar).d(new c(this));
        h.f.b.l.b(d2, "");
        return d2;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final com.ss.android.ugc.aweme.filter.repository.a.f a(int i2) {
        com.ss.android.ugc.aweme.filter.repository.a.c cVar;
        List<com.ss.android.ugc.aweme.filter.repository.a.f> list;
        com.ss.android.ugc.aweme.filter.repository.internal.a b2 = this.f95667j.b(z.f158842a);
        T t = null;
        if (b2 == null || (cVar = b2.f95560a) == null || (list = cVar.f95542a) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.f95550a == i2) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    public final void b(List<com.ss.android.ugc.aweme.filter.repository.a.f> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (d(t.f95550a) != com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                arrayList.add(t);
            }
        }
        ArrayList<com.ss.android.ugc.aweme.filter.repository.a.f> arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            for (com.ss.android.ugc.aweme.filter.repository.a.f fVar : arrayList2) {
                this.n.b(fVar);
            }
        }
    }

    static final class j<T> implements f.a.d.f<List<? extends com.ss.android.ugc.aweme.filter.repository.a.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f95683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f95684b;

        static {
            Covode.recordClassIndex(60635);
        }

        j(g gVar, List list) {
            this.f95683a = gVar;
            this.f95684b = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(List<? extends com.ss.android.ugc.aweme.filter.repository.a.d> list) {
            T t;
            List<? extends com.ss.android.ugc.aweme.filter.repository.a.d> list2 = list;
            g gVar = this.f95683a;
            List list3 = this.f95684b;
            h.f.b.l.b(list2, "");
            ArrayList arrayList = new ArrayList();
            for (T t2 : list2) {
                com.ss.android.ugc.aweme.filter.repository.a.d b2 = gVar.f95660c.b(Integer.valueOf(t2.f95544a));
                if (b2 == null || b2.f95545b == com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_UNKNOWN) {
                    arrayList.add(t2);
                }
            }
            gVar.a(arrayList);
            if (gVar.f95666i) {
                ArrayList arrayList2 = new ArrayList();
                for (T t3 : list3) {
                    T t4 = t3;
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (t.f95544a == t4.f95550a) {
                            break;
                        }
                    }
                    T t5 = t;
                    if (t5 == null || t5.f95545b != com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                        arrayList2.add(t3);
                    }
                }
                gVar.b(arrayList2);
            }
        }
    }

    public final com.ss.android.ugc.aweme.filter.repository.a.d a(com.ss.android.ugc.aweme.filter.repository.internal.b bVar) {
        if (bVar.f95583a == com.ss.android.ugc.aweme.filter.repository.internal.c.PENDING || bVar.f95583a == com.ss.android.ugc.aweme.filter.repository.internal.c.START) {
            return new com.ss.android.ugc.aweme.filter.repository.a.d(bVar.f95584b.f95550a, com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_DOWNLOADING, "", "");
        }
        if (bVar.f95583a == com.ss.android.ugc.aweme.filter.repository.internal.c.SUCCESS) {
            com.ss.android.ugc.aweme.filter.repository.internal.d dVar = bVar.f95585c;
            if (dVar == null) {
                if (this.o.a(bVar.f95584b)) {
                    dVar = this.o.a(bVar.f95584b.f95550a);
                } else {
                    dVar = this.f95670m.d(bVar.f95584b.f95550a);
                }
            }
            return new com.ss.android.ugc.aweme.filter.repository.a.d(bVar.f95584b.f95550a, com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_DOWNLOAD_SUCCESS, dVar.f95588a, dVar.f95589b);
        } else if (bVar.f95583a == com.ss.android.ugc.aweme.filter.repository.internal.c.FAILED) {
            return new com.ss.android.ugc.aweme.filter.repository.a.d(bVar.f95584b.f95550a, com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_DOWNLOAD_FAILED, "", "");
        } else {
            return new com.ss.android.ugc.aweme.filter.repository.a.d(bVar.f95584b.f95550a, com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_UNKNOWN, "", "");
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final void a(com.ss.android.ugc.aweme.filter.repository.a.f fVar) {
        com.ss.android.ugc.aweme.filter.repository.a.c cVar;
        List<com.ss.android.ugc.aweme.filter.repository.a.f> list;
        h.f.b.l.d(fVar, "");
        com.ss.android.ugc.aweme.filter.repository.internal.a b2 = this.f95667j.b(z.f158842a);
        if (!(b2 == null || (cVar = b2.f95560a) == null || (list = cVar.f95542a) == null)) {
            for (T t : list) {
                if (t.f95550a == fVar.f95550a) {
                    if (t != null) {
                        List<com.ss.android.ugc.aweme.filter.repository.a.f> list2 = b2.f95560a.f95542a;
                        ArrayList arrayList = new ArrayList();
                        for (T t2 : list2) {
                            if (t2.f95550a != fVar.f95550a) {
                                arrayList.add(t2);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        List<p<EffectCategoryResponse, List<com.ss.android.ugc.aweme.filter.repository.a.f>>> list3 = b2.f95560a.f95543b;
                        ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) list3, 10));
                        for (T t3 : list3) {
                            Object first = t3.getFirst();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : (Iterable) t3.getSecond()) {
                                if (((com.ss.android.ugc.aweme.filter.repository.a.f) obj).f95550a != fVar.f95550a) {
                                    arrayList4.add(obj);
                                }
                            }
                            arrayList3.add(v.a(first, arrayList4));
                        }
                        this.f95667j.c(new com.ss.android.ugc.aweme.filter.repository.internal.a(new com.ss.android.ugc.aweme.filter.repository.a.c(arrayList2, arrayList3), b2.f95561b));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: f.a.l.c<com.ss.android.ugc.aweme.filter.repository.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(List<com.ss.android.ugc.aweme.filter.repository.a.d> list) {
        ArrayList<Object> arrayList = new ArrayList();
        for (T t : list) {
            com.ss.android.ugc.aweme.filter.repository.a.d b2 = this.f95660c.b(Integer.valueOf(t.f95544a));
            if (b2 == null) {
                b2 = com.ss.android.ugc.aweme.filter.repository.internal.utils.b.a(t.f95544a);
            }
            if (true ^ h.f.b.l.a((Object) b2, (Object) t)) {
                this.f95660c.a(Integer.valueOf(t.f95544a), t);
                arrayList.add(new com.ss.android.ugc.aweme.filter.repository.a.e(b2, t));
            }
        }
        if (!arrayList.isEmpty()) {
            f.a.l.b<Map<Integer, com.ss.android.ugc.aweme.filter.repository.a.d>> bVar = this.f95661d;
            List<p<Integer, com.ss.android.ugc.aweme.filter.repository.a.d>> d2 = this.f95660c.d();
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : d2) {
                if (t2.getSecond() != null) {
                    arrayList2.add(t2);
                }
            }
            ArrayList<p> arrayList3 = arrayList2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(h.j.h.b(ag.a(h.a.n.a((Iterable) arrayList3, 10)), 16));
            for (p pVar : arrayList3) {
                Object first = pVar.getFirst();
                Object second = pVar.getSecond();
                if (second == null) {
                    h.f.b.l.b();
                }
                p pVar2 = new p(first, second);
                linkedHashMap.put(pVar2.getFirst(), pVar2.getSecond());
            }
            bVar.onNext(linkedHashMap);
            for (Object obj : arrayList) {
                this.f95668k.onNext(obj);
            }
        }
    }

    public static final class a<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f95671a;

        static {
            Covode.recordClassIndex(60622);
        }

        public a(List list) {
            this.f95671a = list;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            T t3 = t;
            Iterator it = this.f95671a.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (((com.ss.android.ugc.aweme.filter.repository.a.f) it.next()).f95550a == t3.f95550a) {
                    break;
                } else {
                    i2++;
                }
            }
            int i3 = Integer.MAX_VALUE;
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            Integer valueOf = Integer.valueOf(i2);
            T t4 = t2;
            Iterator it2 = this.f95671a.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((com.ss.android.ugc.aweme.filter.repository.a.f) it2.next()).f95550a != t4.f95550a) {
                    i4++;
                } else if (i4 >= 0) {
                    i3 = i4;
                }
            }
            return h.b.a.a(valueOf, Integer.valueOf(i3));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        if (r5 == null) goto L_0x00a2;
     */
    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.a.t<com.ss.android.ugc.aweme.filter.repository.a.d> a(com.ss.android.ugc.aweme.filter.repository.a.f r19, java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f>>> r20) {
        /*
        // Method dump skipped, instructions count: 709
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.repository.internal.main.g.a(com.ss.android.ugc.aweme.filter.repository.a.f, java.util.List):f.a.t");
    }

    private static List<com.ss.android.ugc.aweme.filter.repository.a.f> a(com.ss.android.ugc.aweme.filter.repository.a.f fVar, List<com.ss.android.ugc.aweme.filter.repository.a.f> list, List<? extends p<EffectCategoryResponse, ? extends List<com.ss.android.ugc.aweme.filter.repository.a.f>>> list2) {
        Iterator<com.ss.android.ugc.aweme.filter.repository.a.f> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f95550a != fVar.f95550a) {
                i2++;
            } else if (i2 >= 0) {
                return list;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.add(fVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            h.a.n.a((Collection) arrayList2, (Iterable) ((List) it2.next().getSecond()));
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList.size() > 1) {
            h.a.n.a((List) arrayList, (Comparator) new a(arrayList3));
        }
        return arrayList;
    }

    public g(com.ss.android.ugc.aweme.filter.repository.internal.l lVar, com.ss.android.ugc.aweme.filter.repository.internal.k kVar, com.ss.android.ugc.aweme.filter.repository.internal.e eVar, com.ss.android.ugc.aweme.filter.repository.internal.h hVar, com.ss.android.ugc.aweme.filter.repository.internal.n nVar, com.ss.android.ugc.aweme.filter.repository.internal.i iVar, boolean z) {
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(nVar, "");
        h.f.b.l.d(iVar, "");
        this.f95670m = lVar;
        this.n = kVar;
        this.o = eVar;
        this.p = hVar;
        this.f95664g = nVar;
        this.f95665h = iVar;
        this.f95666i = z;
        com.bytedance.jedi.a.h.f<com.ss.android.ugc.aweme.filter.repository.internal.a> fVar = new com.bytedance.jedi.a.h.f<>();
        this.f95667j = fVar;
        f.a.l.b<com.ss.android.ugc.aweme.filter.repository.a.c> bVar = new f.a.l.b<>();
        h.f.b.l.b(bVar, "");
        this.f95659b = bVar;
        f.a.l.b<Map<Integer, com.ss.android.ugc.aweme.filter.repository.a.d>> bVar2 = new f.a.l.b<>();
        h.f.b.l.b(bVar2, "");
        this.f95661d = bVar2;
        f.a.l.c<com.ss.android.ugc.aweme.filter.repository.a.e> cVar = new f.a.l.c<>();
        h.f.b.l.b(cVar, "");
        this.f95668k = cVar;
        this.f95662e = new AtomicReference<>(null);
        this.f95669l = h.i.a((h.f.a.a) new k(this));
        this.f95663f = new f.a.b.a();
        com.bytedance.jedi.a.k.c unused = a(com.bytedance.jedi.a.c.b.a(hVar), com.bytedance.jedi.a.c.b.a(fVar), a.b.a(a.b.C0952a.f39257a, a.C0953a.C0954a.f39266a));
        com.bytedance.jedi.a.c.b.a(fVar).a(true, new com.bytedance.jedi.a.c.e[0]).a(new b(this), com.ss.android.ugc.tools.utils.p.f150012a);
        kVar.a().b(f.a.h.a.b(f.a.k.a.f158006c)).d(new l(this)).a(f.a.a.b.a.a()).a(new m(this), com.ss.android.ugc.tools.utils.p.f150012a);
    }
}
