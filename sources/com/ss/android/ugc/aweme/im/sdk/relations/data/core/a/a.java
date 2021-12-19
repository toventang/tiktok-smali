package com.ss.android.ugc.aweme.im.sdk.relations.data.core.a;

import com.bytedance.covode.number.Covode;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class a<R> extends e<R> {

    /* renamed from: f  reason: collision with root package name */
    public static final b f103007f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public g<R> f103008a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.a<Boolean> f103009b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.b<? super c<R>, Boolean> f103010c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.b<? super List<R>, ? extends List<R>> f103011d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f103012e;

    /* renamed from: h  reason: collision with root package name */
    private final h f103013h;

    static {
        Covode.recordClassIndex(66033);
    }

    private final f.a.b.a f() {
        return (f.a.b.a) this.f103013h.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(66035);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final boolean bI_() {
        return this.f103012e;
    }

    static final class d extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f103018a = new d();

        static {
            Covode.recordClassIndex(66037);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f103020b;

        static {
            Covode.recordClassIndex(66038);
        }

        e(a aVar, boolean z) {
            this.f103019a = aVar;
            this.f103020b = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$e$a  reason: collision with other inner class name */
        static final /* synthetic */ class C2609a extends j implements h.f.a.a<List<R>> {
            static {
                Covode.recordClassIndex(66039);
            }

            C2609a(f fVar) {
                super(0, fVar, f.class, "loadMoreDirectly", "loadMoreDirectly()Ljava/util/List;", 0);
            }

            @Override // h.f.a.a
            public final /* synthetic */ Object invoke() {
                return ((f) this.receiver).h();
            }
        }

        static final /* synthetic */ class b extends j implements h.f.a.a<List<R>> {
            static {
                Covode.recordClassIndex(66040);
            }

            b(f fVar) {
                super(0, fVar, f.class, "loadMoreDirectly", "loadMoreDirectly()Ljava/util/List;", 0);
            }

            @Override // h.f.a.a
            public final /* synthetic */ Object invoke() {
                return ((f) this.receiver).h();
            }
        }

        static final /* synthetic */ class c extends j implements h.f.a.a<List<R>> {
            static {
                Covode.recordClassIndex(66041);
            }

            c(f fVar) {
                super(0, fVar, f.class, "loadDirectly", "loadDirectly()Ljava/util/List;", 0);
            }

            @Override // h.f.a.a
            public final /* synthetic */ Object invoke() {
                return ((f) this.receiver).g();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.w
        public final void subscribe(v<List<R>> vVar) {
            h.f.a.a cVar;
            Boolean invoke;
            Object invoke2;
            Boolean invoke3;
            l.d(vVar, "");
            h.f.a.a<Boolean> aVar = this.f103019a.f103009b;
            if (aVar == null || (invoke3 = aVar.invoke()) == null || invoke3.booleanValue()) {
                if (!this.f103020b) {
                    g<R> gVar = this.f103019a.f103008a;
                    if (gVar == null) {
                        l.b();
                    }
                    gVar.b();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                f<?, R> fVar = null;
                while (true) {
                    g<R> gVar2 = this.f103019a.f103008a;
                    if (gVar2 == null) {
                        l.b();
                    }
                    f<?, R> c2 = gVar2.c();
                    if (c2 == null) {
                        break;
                    }
                    if (fVar == null && this.f103020b) {
                        cVar = new C2609a(c2);
                    } else if (l.a(c2, fVar)) {
                        cVar = new b(c2);
                    } else {
                        cVar = new c(c2);
                    }
                    a aVar2 = this.f103019a;
                    c cVar2 = new c(linkedHashMap, (List) cVar.invoke(), c2);
                    h.f.a.b<? super c<R>, Boolean> bVar = aVar2.f103010c;
                    if (bVar == null || (invoke = bVar.invoke(cVar2)) == null || !invoke.booleanValue()) {
                        break;
                    }
                    fVar = c2;
                }
                a aVar3 = this.f103019a;
                List<R> a2 = b.a(linkedHashMap);
                h.f.a.b<? super List<R>, ? extends List<R>> bVar2 = aVar3.f103011d;
                if (!(bVar2 == null || (invoke2 = bVar2.invoke(a2)) == 0)) {
                    a2 = invoke2;
                }
                vVar.a(a2);
                return;
            }
            vVar.a(new ArrayList());
        }
    }

    private a() {
        this.f103013h = i.a((h.f.a.a) d.f103018a);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final void bG_() {
        if (b()) {
            a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final void bH_() {
        if (b()) {
            a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final boolean e() {
        g<R> gVar = this.f103008a;
        if (gVar == null || gVar.c() == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final boolean b() {
        g<R> gVar;
        List<f<?, R>> a2;
        if (this.f103012e || (gVar = this.f103008a) == null || (a2 = gVar.a()) == null || a2.isEmpty() || !super.b()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.a$a  reason: collision with other inner class name */
    public static final class C2608a<R> {

        /* renamed from: a  reason: collision with root package name */
        public final a<R> f103014a = new a<>((byte) 0);

        static {
            Covode.recordClassIndex(66034);
        }

        public final C2608a<R> a(d<R> dVar) {
            l.d(dVar, "");
            this.f103014a.a(dVar);
            return this;
        }

        public final C2608a<R> b(h.f.a.b<? super List<R>, ? extends List<R>> bVar) {
            l.d(bVar, "");
            this.f103014a.f103011d = bVar;
            return this;
        }

        public final C2608a<R> a(g<R> gVar) {
            l.d(gVar, "");
            this.f103014a.f103008a = gVar;
            return this;
        }

        public final C2608a<R> a(h.f.a.b<? super c<R>, Boolean> bVar) {
            l.d(bVar, "");
            this.f103014a.f103010c = bVar;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f103022b;

        static {
            Covode.recordClassIndex(66042);
        }

        f(a aVar, boolean z) {
            this.f103021a = aVar;
            this.f103022b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<R> list = (List) obj;
            this.f103021a.f103012e = false;
            a aVar = this.f103021a;
            l.b(list, "");
            aVar.a(list, this.f103022b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103023a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f103024b;

        static {
            Covode.recordClassIndex(66043);
        }

        g(a aVar, boolean z) {
            this.f103023a = aVar;
            this.f103024b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f103023a.f103012e = false;
            a aVar = this.f103023a;
            l.b(th, "");
            aVar.a(th, this.f103024b);
        }
    }

    private final void a(boolean z) {
        this.f103012e = true;
        f.a.b.b a2 = t.a(new e(this, z)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this, z), new g(this, z));
        f().a();
        f().a(a2);
    }

    public static final class c<R> {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap<e<R>, List<R>> f103015a;

        /* renamed from: b  reason: collision with root package name */
        public final List<R> f103016b;

        /* renamed from: c  reason: collision with root package name */
        public final e<R> f103017c;

        static {
            Covode.recordClassIndex(66036);
        }

        public c(LinkedHashMap<e<R>, List<R>> linkedHashMap, List<R> list, e<R> eVar) {
            l.d(linkedHashMap, "");
            l.d(list, "");
            l.d(eVar, "");
            this.f103015a = linkedHashMap;
            this.f103016b = list;
            this.f103017c = eVar;
        }
    }
}
