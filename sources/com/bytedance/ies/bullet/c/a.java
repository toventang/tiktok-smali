package com.bytedance.ies.bullet.c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.h;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.k;
import com.bytedance.ies.bullet.c.c.n;
import com.bytedance.ies.bullet.c.c.p;
import com.bytedance.ies.bullet.c.c.r;
import com.bytedance.ies.bullet.c.c.u;
import com.bytedance.ies.bullet.c.c.v;
import com.bytedance.ies.bullet.c.c.w;
import com.bytedance.ies.bullet.c.c.z;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.a.q;
import com.bytedance.ies.bullet.service.base.b.e;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a implements d, j {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f31953a;

    /* renamed from: b  reason: collision with root package name */
    public Object f31954b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.ies.bullet.c.e.a.b f31955c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.ies.bullet.c.a.a f31956d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.ies.bullet.c.d.b f31957e;

    /* renamed from: f  reason: collision with root package name */
    public final List<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>> f31958f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<Class<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>>, h<?>> f31959g;

    /* renamed from: h  reason: collision with root package name */
    public final g f31960h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, g> f31961i;

    /* renamed from: j  reason: collision with root package name */
    public final com.bytedance.ies.bullet.c.c.f f31962j;

    /* renamed from: k  reason: collision with root package name */
    public final List<u> f31963k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f31964l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<k> f31965m;

    static {
        Covode.recordClassIndex(18703);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final q getLoggerWrapper() {
        return (q) this.f31964l.getValue();
    }

    @Override // com.bytedance.ies.bullet.c.d
    public final com.bytedance.ies.bullet.c.e.a.b b() {
        return this.f31955c;
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final i a(String str) {
        l.c(str, "");
        Iterator<T> it = this.f31965m.iterator();
        while (it.hasNext()) {
            i a2 = it.next().a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.d
    public final void a(n nVar, z zVar, Uri uri, List<String> list, com.bytedance.ies.bullet.c.e.a.b bVar, h.f.a.q<? super i, ? super Uri, ? super Boolean, h.z> qVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        l.c(nVar, "");
        l.c(zVar, "");
        l.c(uri, "");
        l.c(list, "");
        l.c(bVar, "");
        l.c(qVar, "");
        l.c(bVar2, "");
        c();
        if (!this.f31963k.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f31963k) {
                a(t, new g(t, this, arrayList));
            }
            this.f31963k.removeAll(arrayList);
        }
        if (this.f31958f.size() == 0) {
            bVar2.invoke(new IllegalStateException("No kitApi found for uri ".concat(String.valueOf(uri))));
        } else {
            b(nVar, zVar, uri, list, bVar, qVar, bVar2);
        }
    }

    public final void a(Throwable th, Uri uri, com.bytedance.ies.bullet.c.e.a.b bVar, n nVar, z zVar, List<String> list, h.f.a.q<? super i, ? super Uri, ? super Boolean, h.z> qVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        i iVar = (i) bVar.c(i.class);
        if (iVar != null) {
            iVar.f32096h = th.getMessage();
        }
        Uri a2 = a(uri, bVar);
        if (a2 != null) {
            j.b.a(this, "Fallback now, from " + uri + " to " + a2, null, null, 6);
            a(uri, a2, bVar, th.toString());
            if (bVar.c(com.bytedance.ies.bullet.c.c.b.class) != null) {
                com.bytedance.ies.bullet.c.c.b.a(uri, a2);
            }
            b(nVar, zVar, a2, list, bVar, qVar, bVar2);
            return;
        }
        bVar2.invoke(th);
    }

    @Override // com.bytedance.ies.bullet.c.d
    public final List<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>> a() {
        return h.a.n.k(this.f31958f);
    }

    static final class f extends m implements h.f.a.a<q> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(18710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            return new q((com.bytedance.ies.bullet.service.base.m) this.this$0.f31955c.c(com.bytedance.ies.bullet.service.base.m.class), "Core");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.a$a  reason: collision with other inner class name */
    public static final class C0669a {

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.ies.bullet.c.e.a.b f31966a = new com.bytedance.ies.bullet.c.e.a.b();

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.ies.bullet.c.a.a f31967b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<Class<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>>, h<?>> f31968c = new LinkedHashMap();

        /* renamed from: d  reason: collision with root package name */
        public com.bytedance.ies.bullet.c.c.f f31969d;

        /* renamed from: e  reason: collision with root package name */
        public final List<u> f31970e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private com.bytedance.ies.bullet.c.d.b f31971f;

        /* renamed from: g  reason: collision with root package name */
        private final List<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>> f31972g = new ArrayList();

        /* renamed from: h  reason: collision with root package name */
        private g f31973h;

        /* renamed from: i  reason: collision with root package name */
        private final Map<String, g> f31974i = new LinkedHashMap();

        static {
            Covode.recordClassIndex(18704);
        }

        public final a a() {
            return new a(this.f31966a, this.f31967b, this.f31971f, this.f31972g, this.f31968c, this.f31973h, this.f31974i, this.f31969d, this.f31970e, (byte) 0);
        }

        public final C0669a a(g gVar) {
            l.c(gVar, "");
            this.f31973h = gVar;
            return this;
        }

        public final <U extends com.bytedance.ies.bullet.c.c.m, V extends com.bytedance.ies.bullet.c.c.e, W extends i, X extends com.bytedance.ies.bullet.c.c.g> C0669a a(com.bytedance.ies.bullet.c.c.d<U, V, W, X> dVar) {
            l.c(dVar, "");
            this.f31972g.add(dVar);
            return this;
        }

        public final C0669a a(String str, g gVar) {
            l.c(str, "");
            l.c(gVar, "");
            this.f31974i.put(str, gVar);
            return this;
        }
    }

    private final void c() {
        com.bytedance.ies.bullet.c.c.f fVar = this.f31962j;
        if (fVar != null && !fVar.b()) {
            this.f31962j.a();
        }
        com.bytedance.ies.bullet.c.c.f fVar2 = this.f31962j;
        if (fVar2 != null) {
            Iterator<T> it = this.f31963k.iterator();
            while (it.hasNext()) {
                fVar2.a(it.next().f32066a);
                fVar2.a();
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.d
    public final void a(k kVar) {
        l.c(kVar, "");
        this.f31965m.add(kVar);
    }

    @Override // com.bytedance.ies.bullet.c.d
    public final void b(k kVar) {
        l.c(kVar, "");
        this.f31965m.remove(kVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ i $instance;
        final /* synthetic */ n $instancesHolder$inlined;
        final /* synthetic */ boolean $isNewInstance$inlined;
        final /* synthetic */ com.bytedance.ies.bullet.c.c.d $kitApi$inlined;
        final /* synthetic */ w $kitProcessUnit$inlined;
        final /* synthetic */ List $packageNames$inlined;
        final /* synthetic */ h.f.a.b $reject$inlined;
        final /* synthetic */ h.f.a.b $resolve$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(18706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, a aVar, w wVar, boolean z, n nVar, com.bytedance.ies.bullet.c.c.d dVar, List list, h.f.a.b bVar, h.f.a.b bVar2) {
            super(1);
            this.$instance = iVar;
            this.this$0 = aVar;
            this.$kitProcessUnit$inlined = wVar;
            this.$isNewInstance$inlined = z;
            this.$instancesHolder$inlined = nVar;
            this.$kitApi$inlined = dVar;
            this.$packageNames$inlined = list;
            this.$resolve$inlined = bVar;
            this.$reject$inlined = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            this.$instance.a(th2);
            this.$reject$inlined.invoke(th2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ n $instancesHolder;
        final /* synthetic */ List $packageNames;
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $providerFactory;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ h.f.a.q $resolve;
        final /* synthetic */ z $sessionInfo;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(18709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, Uri uri, com.bytedance.ies.bullet.c.e.a.b bVar, n nVar, z zVar, List list, h.f.a.q qVar, h.f.a.b bVar2) {
            super(1);
            this.this$0 = aVar;
            this.$uri = uri;
            this.$providerFactory = bVar;
            this.$instancesHolder = nVar;
            this.$sessionInfo = zVar;
            this.$packageNames = list;
            this.$resolve = qVar;
            this.$reject = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            this.this$0.a(th2, this.$uri, this.$providerFactory, this.$instancesHolder, this.$sessionInfo, this.$packageNames, this.$resolve, this.$reject);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<w, h.z> {
        final /* synthetic */ n $instancesHolder;
        final /* synthetic */ List $packageNames;
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $providerFactory;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ h.f.a.q $resolve;
        final /* synthetic */ z $sessionInfo;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(18707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, Uri uri, com.bytedance.ies.bullet.c.e.a.b bVar, n nVar, z zVar, List list, h.f.a.q qVar, h.f.a.b bVar2) {
            super(1);
            this.this$0 = aVar;
            this.$uri = uri;
            this.$providerFactory = bVar;
            this.$instancesHolder = nVar;
            this.$sessionInfo = zVar;
            this.$packageNames = list;
            this.$resolve = qVar;
            this.$reject = bVar2;
        }

        /* renamed from: com.bytedance.ies.bullet.c.a$d$a  reason: collision with other inner class name */
        static final class C0670a extends m implements h.f.a.b<Throwable, h.z> {
            final /* synthetic */ w $unit$inlined;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(18708);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0670a(d dVar, w wVar) {
                super(1);
                this.this$0 = dVar;
                this.$unit$inlined = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(Throwable th) {
                Throwable th2 = th;
                a aVar = this.this$0.this$0;
                if (th2 == null) {
                    th2 = new Throwable("Bullet load failed!");
                }
                aVar.a(th2, this.this$0.$uri, this.this$0.$providerFactory, this.this$0.$instancesHolder, this.this$0.$sessionInfo, this.this$0.$packageNames, this.this$0.$resolve, this.this$0.$reject);
                return h.z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(w wVar) {
            r rVar;
            w wVar2 = wVar;
            l.c(wVar2, "");
            v vVar = (v) wVar2.f32073b.c(v.class);
            if (vVar != null) {
                i iVar = vVar.f32070a;
                if (!(!(iVar instanceof r) || iVar == null || (rVar = (r) iVar) == null)) {
                    C0670a aVar = new C0670a(this, wVar2);
                    l.c(aVar, "");
                    rVar.f32053e.add(aVar);
                }
                this.$resolve.invoke(vVar.f32070a, wVar2.f32072a, Boolean.valueOf(vVar.f32071b));
            } else {
                this.$reject.invoke(new IllegalStateException("No result resolved for uri " + this.$uri));
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Uri, h.z> {
        final /* synthetic */ i $instance;
        final /* synthetic */ n $instancesHolder$inlined;
        final /* synthetic */ boolean $isNewInstance$inlined;
        final /* synthetic */ com.bytedance.ies.bullet.c.c.d $kitApi$inlined;
        final /* synthetic */ w $kitProcessUnit$inlined;
        final /* synthetic */ List $packageNames$inlined;
        final /* synthetic */ h.f.a.b $reject$inlined;
        final /* synthetic */ h.f.a.b $resolve$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(18705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, a aVar, w wVar, boolean z, n nVar, com.bytedance.ies.bullet.c.c.d dVar, List list, h.f.a.b bVar, h.f.a.b bVar2) {
            super(1);
            this.$instance = iVar;
            this.this$0 = aVar;
            this.$kitProcessUnit$inlined = wVar;
            this.$isNewInstance$inlined = z;
            this.$instancesHolder$inlined = nVar;
            this.$kitApi$inlined = dVar;
            this.$packageNames$inlined = list;
            this.$resolve$inlined = bVar;
            this.$reject$inlined = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Uri uri) {
            Uri uri2 = uri;
            l.c(uri2, "");
            com.bytedance.ies.bullet.c.e.a.b bVar = this.$kitProcessUnit$inlined.f32073b;
            bVar.a(v.class, new v(this.$instance, this.$isNewInstance$inlined));
            this.$resolve$inlined.invoke(new w(uri2, bVar));
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.c.d
    public final com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?> a(com.bytedance.ies.bullet.service.f.a.b.b bVar) {
        T t;
        l.c(bVar, "");
        Iterator<T> it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.a() == bVar) {
                break;
            }
        }
        return t;
    }

    static final class g extends m implements h.f.a.b<Integer, h.z> {
        final /* synthetic */ u $kitMockInfo;
        final /* synthetic */ List $toRemove$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(18711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(u uVar, a aVar, List list) {
            super(1);
            this.$kitMockInfo = uVar;
            this.this$0 = aVar;
            this.$toRemove$inlined = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Integer num) {
            if (num.intValue() == 1) {
                j.b.a(this.this$0, "load dynamic feature [" + this.$kitMockInfo.f32066a + "] success with [" + this.$kitMockInfo.f32069d + ']', null, null, 6);
                this.$toRemove$inlined.add(this.$kitMockInfo);
            }
            return h.z.f158842a;
        }
    }

    private static com.bytedance.ies.bullet.service.f.a.b.b a(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            switch (scheme.hashCode()) {
                case -1772600516:
                    if (scheme.equals("lynxview")) {
                        return com.bytedance.ies.bullet.service.f.a.b.b.LYNX;
                    }
                    break;
                case 3213448:
                    if (scheme.equals("http")) {
                        return com.bytedance.ies.bullet.service.f.a.b.b.WEB;
                    }
                    break;
                case 99617003:
                    if (scheme.equals("https")) {
                        return com.bytedance.ies.bullet.service.f.a.b.b.WEB;
                    }
                    break;
                case 828638245:
                    if (scheme.equals("react-native")) {
                        return com.bytedance.ies.bullet.service.f.a.b.b.RN;
                    }
                    break;
            }
        }
        return com.bytedance.ies.bullet.service.f.a.b.b.NONE;
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final <T extends com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>> i a(Class<? extends T> cls) {
        l.c(cls, "");
        Iterator<T> it = this.f31965m.iterator();
        while (it.hasNext()) {
            i a2 = it.next().a(cls);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        j.b.a(this, th, str);
    }

    private static Uri a(Uri uri, com.bytedance.ies.bullet.c.e.a.b bVar) {
        boolean z;
        com.bytedance.ies.bullet.service.f.a.b.b bVar2;
        i iVar;
        if (a(uri) != com.bytedance.ies.bullet.service.f.a.b.b.WEB) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.bytedance.ies.bullet.service.f.a.c cVar = new com.bytedance.ies.bullet.service.f.a.c();
            cVar.a(Uri.class, uri, null);
            Uri b2 = cVar.P.b();
            if (b2 != null) {
                if (bVar == null || (iVar = (i) bVar.c(i.class)) == null || (bVar2 = iVar.b()) == null) {
                    bVar2 = com.bytedance.ies.bullet.service.f.a.b.b.NONE;
                }
                Uri.Builder buildUpon = b2.buildUpon();
                l.a((Object) buildUpon, "");
                com.bytedance.ies.bullet.service.f.a.a.b bVar3 = new com.bytedance.ies.bullet.service.f.a.a.b(buildUpon);
                Uri build = uri.buildUpon().clearQuery().build();
                l.a((Object) build, "");
                return bVar3.a(build).a(bVar2).b().build();
            }
        }
        return null;
    }

    private final f a(com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?> dVar, List<String> list) {
        com.bytedance.ies.bullet.c.c.a.l lVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        g gVar = this.f31960h;
        com.bytedance.ies.bullet.c.c.l lVar2 = null;
        if (gVar != null) {
            lVar2 = gVar.a(dVar.getClass());
            lVar = gVar.a();
            arrayList3.add(gVar.b());
        } else {
            lVar = null;
        }
        ArrayList<g> arrayList4 = new ArrayList(h.a.n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList4.add(this.f31961i.get(it.next()));
        }
        for (g gVar2 : arrayList4) {
            if (gVar2 != null) {
                com.bytedance.ies.bullet.c.c.l a2 = gVar2.a(dVar.getClass());
                if (a2 != null) {
                    arrayList.add(a2);
                }
                arrayList2.add(gVar2.a());
                arrayList3.add(gVar2.b());
            }
        }
        if (dVar != null) {
            return new h(dVar, lVar2, arrayList, lVar, arrayList2, arrayList3);
        }
        throw new h.w("null cannot be cast to non-null type");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: java.util.Map<java.lang.Class<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>>, com.bytedance.ies.bullet.c.c.h<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    private final void a(u uVar, h.f.a.b<? super Integer, h.z> bVar) {
        T t;
        T t2;
        com.bytedance.ies.bullet.c.c.d<com.bytedance.ies.bullet.c.c.m, com.bytedance.ies.bullet.c.c.e, i, com.bytedance.ies.bullet.c.c.g> a2;
        h<com.bytedance.ies.bullet.c.c.g> b2;
        com.bytedance.ies.bullet.service.f.a.b.b bVar2 = uVar.f32066a;
        Class<? extends com.bytedance.ies.bullet.c.c.a> cls = uVar.f32067b;
        String str = uVar.f32068c;
        String str2 = uVar.f32069d;
        Iterator<T> it = this.f31958f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (l.a((Object) t.getClass().getName(), (Object) str2)) {
                break;
            }
        }
        Iterator<T> it2 = this.f31958f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (cls.isInstance(t2)) {
                break;
            }
        }
        if (t == null && t2 == null) {
            bVar.invoke(-1);
            return;
        }
        try {
            com.bytedance.ies.bullet.c.c.f fVar = this.f31962j;
            if (fVar != null) {
                fVar.a(bVar2);
                if (fVar.b() && t == null && (a2 = p.a(str)) != null) {
                    Object obj = this.f31954b;
                    if (!(obj == null || (b2 = a2.b(obj)) == null)) {
                        a2.a(b2.a(this.f31955c), this.f31955c);
                        Map<Class<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>>, h<?>> map = this.f31959g;
                        Class<?> cls2 = a2.getClass();
                        if (cls2 != null) {
                            map.put(cls2, b2);
                        } else {
                            throw new h.w("null cannot be cast to non-null type");
                        }
                    }
                    Map<String, Object> map2 = this.f31953a;
                    if (map2 != null) {
                        for (Map.Entry<String, Object> entry : map2.entrySet()) {
                            com.bytedance.ies.bullet.c.c.l<com.bytedance.ies.bullet.c.c.m, com.bytedance.ies.bullet.c.c.e> a3 = a2.a(entry.getValue());
                            if (a3 != null) {
                                if (l.a((Object) entry.getKey(), (Object) "defaultPackageBundle")) {
                                    g gVar = this.f31960h;
                                    if (gVar != null) {
                                        gVar.a(a2.getClass(), a3);
                                    }
                                } else {
                                    g gVar2 = this.f31961i.get(entry.getKey());
                                    if (gVar2 != null) {
                                        gVar2.a(a2.getClass(), a3);
                                    }
                                }
                            }
                        }
                    }
                    if (t2 != null) {
                        this.f31958f.remove(t2);
                    }
                    this.f31958f.add(0, a2);
                    bVar.invoke(1);
                }
            }
        } catch (Throwable th) {
            j.b.a(this, "replaceMockToRnKitApi failed, error: " + th.getMessage(), null, null, 6);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printLog(String str, com.bytedance.ies.bullet.service.base.a.p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }

    private static void a(Uri uri, Uri uri2, com.bytedance.ies.bullet.c.e.a.b bVar, String str) {
        i iVar;
        if (bVar != null && (iVar = (i) bVar.c(i.class)) != null) {
            com.bytedance.ies.bullet.c.c.c cVar = new com.bytedance.ies.bullet.c.c.c();
            cVar.f32041a = uri;
            cVar.f32042b = uri2;
            cVar.f32043c = str;
            iVar.f32091c = cVar;
        }
    }

    private final void b(n nVar, z zVar, Uri uri, List<String> list, com.bytedance.ies.bullet.c.e.a.b bVar, h.f.a.q<? super i, ? super Uri, ? super Boolean, h.z> qVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        com.bytedance.ies.bullet.service.f.a.b.b a2 = a(uri);
        if (a2 == com.bytedance.ies.bullet.service.f.a.b.b.NONE) {
            bVar2.invoke(new IllegalStateException("No kitApi matches the uri ".concat(String.valueOf(uri))));
            return;
        }
        com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?> a3 = a(a2);
        if (a3 != null && !(a3 instanceof com.bytedance.ies.bullet.c.c.a)) {
            j.b.a(this, "Found KitType(" + a2 + ") and KitApi(" + a3 + ") for the uri " + uri, null, null, 6);
            bVar.a(this.f31955c);
            a(nVar, a3, zVar, list, new w(uri, bVar), new d(this, uri, bVar, nVar, zVar, list, qVar, bVar2), new e(this, uri, bVar, nVar, zVar, list, qVar, bVar2));
        } else if (b.f31981a[a2.ordinal()] != 1) {
            a(new Throwable("KitType " + a2 + " is disable for the uri " + uri), uri, bVar, nVar, zVar, list, qVar, bVar2);
        } else {
            bVar2.invoke(new IllegalStateException("KitType " + a2 + " not found for the uri " + uri));
        }
    }

    private final void a(n nVar, com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?> dVar, z zVar, List<String> list, w wVar, h.f.a.b<? super w, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        boolean z;
        r rVar;
        o oVar;
        String queryParameter;
        i a2 = nVar.a(dVar.getClass());
        if (!dVar.e() && a2 != null && a2.h() && !a2.h()) {
            z = false;
        } else {
            z = true;
        }
        j.b.a(this, "create new instance api, isNewInstance: ".concat(String.valueOf(z)), null, null, 6);
        if (z) {
            com.bytedance.ies.bullet.c.e.a.b bVar3 = wVar.f32073b;
            f a3 = a(dVar, list);
            if (dVar != null) {
                a2 = dVar.a(zVar, list, a3, bVar3);
            } else {
                throw new h.w("null cannot be cast to non-null type");
            }
        }
        if (a2 != null) {
            if ((a2 instanceof o) && (oVar = (o) a2) != null) {
                Uri uri = wVar.f32072a;
                if (uri.isHierarchical() && (queryParameter = uri.getQueryParameter("prefix")) != null && (!TextUtils.isEmpty(queryParameter))) {
                    com.bytedance.ies.bullet.service.base.a.m g2 = oVar.g();
                    l.a((Object) queryParameter, "");
                    g2.a(com.bytedance.ies.bullet.service.base.resourceloader.config.b.class, new com.bytedance.ies.bullet.service.base.resourceloader.config.b(queryParameter));
                }
            }
            if (z) {
                nVar.a();
                nVar.a(dVar.getClass(), a2);
                if (dVar != null) {
                    dVar.a((Object) a2);
                    a2.i();
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else {
                a2.c().a(wVar.f32073b);
                if ((a2 instanceof r) && (rVar = (r) a2) != null) {
                    rVar.f32053e.clear();
                }
                if (!l.a(a2.d(), list)) {
                    a2.a(list, a(dVar, list));
                }
            }
            a2.a(wVar.f32072a, new b(a2, this, wVar, z, nVar, dVar, list, bVar, bVar2), new c(a2, this, wVar, z, nVar, dVar, list, bVar, bVar2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.Map<java.lang.String, ? extends com.bytedance.ies.bullet.c.g> */
    /* JADX WARN: Multi-variable type inference failed */
    private a(com.bytedance.ies.bullet.c.e.a.b bVar, com.bytedance.ies.bullet.c.a.a aVar, com.bytedance.ies.bullet.c.d.b bVar2, List<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>> list, Map<Class<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>>, h<?>> map, g gVar, Map<String, ? extends g> map2, com.bytedance.ies.bullet.c.c.f fVar, List<u> list2) {
        String str;
        this.f31955c = bVar;
        this.f31956d = aVar;
        this.f31957e = bVar2;
        this.f31958f = list;
        this.f31959g = map;
        this.f31960h = gVar;
        this.f31961i = map2;
        this.f31962j = fVar;
        this.f31963k = list2;
        bVar.a(d.class, this);
        bVar.a(com.bytedance.ies.bullet.c.a.a.class, aVar);
        bVar.a(com.bytedance.ies.bullet.c.d.b.class, bVar2);
        com.bytedance.ies.bullet.service.base.a.c a2 = e.a.a().a((aVar == null || (str = aVar.f31975a) == null) ? "default_bid" : str, com.bytedance.ies.bullet.service.base.m.class);
        if (a2 != null) {
            bVar.b(com.bytedance.ies.bullet.service.base.m.class, a2);
        }
        c();
        for (T t : list) {
            if (t != null) {
                try {
                    h<?> hVar = this.f31959g.get(t.getClass());
                    t.a(hVar != null ? hVar.a(this.f31955c) : null, this.f31955c);
                } catch (Throwable th) {
                    j.b.a(this, "RNKit Error: " + th.getMessage(), null, null, 6);
                }
            } else {
                throw new h.w("null cannot be cast to non-null type");
            }
        }
        this.f31964l = h.i.a((h.f.a.a) new f(this));
        this.f31965m = new LinkedHashSet();
    }

    public /* synthetic */ a(com.bytedance.ies.bullet.c.e.a.b bVar, com.bytedance.ies.bullet.c.a.a aVar, com.bytedance.ies.bullet.c.d.b bVar2, List list, Map map, g gVar, Map map2, com.bytedance.ies.bullet.c.c.f fVar, List list2, byte b2) {
        this(bVar, aVar, bVar2, list, map, gVar, map2, fVar, list2);
    }
}
