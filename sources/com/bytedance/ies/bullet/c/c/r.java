package com.bytedance.ies.bullet.c.c;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.m;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.as;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.f.a.b.q;
import h.a.n;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class r implements i, o {

    /* renamed from: a  reason: collision with root package name */
    public j f32049a;

    /* renamed from: b  reason: collision with root package name */
    public final List<j> f32050b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public m f32051c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f32052d = true;

    /* renamed from: e  reason: collision with root package name */
    public final List<h.f.a.b<Throwable, z>> f32053e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.ies.bullet.service.base.e.d f32054f;

    /* renamed from: g  reason: collision with root package name */
    public final List<com.bytedance.ies.bullet.c.b.b> f32055g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final z f32056h;

    /* renamed from: i  reason: collision with root package name */
    public final com.bytedance.ies.bullet.c.e.a.b f32057i;

    /* renamed from: j  reason: collision with root package name */
    private final List<String> f32058j;

    /* renamed from: k  reason: collision with root package name */
    private Uri f32059k;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.ies.bullet.c.f f32060l;

    /* renamed from: m  reason: collision with root package name */
    private m f32061m;
    private e n;
    private final List<m> o = new ArrayList();
    private final List<e> p = new ArrayList();
    private q q;
    private final List<q> r = new ArrayList();
    private boolean s;
    private final h t = i.a(h.m.SYNCHRONIZED, new e(this));
    private final h u = i.a((h.f.a.a) new b(this));
    private final h v;
    private final d<?, ?, ?, ?> w;

    static {
        Covode.recordClassIndex(18786);
    }

    public abstract void a(Uri uri, boolean z);

    public abstract boolean a(Uri uri, h.f.a.b<? super Throwable, z> bVar);

    public void b(Throwable th) {
    }

    public abstract void c(Uri uri, h.f.a.b<? super Uri, z> bVar, h.f.a.b<? super Throwable, z> bVar2);

    public abstract void c(List<String> list, com.bytedance.ies.bullet.c.f fVar);

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final String f() {
        return (String) this.u.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final com.bytedance.ies.bullet.service.base.a.m g() {
        return (com.bytedance.ies.bullet.service.base.a.m) this.t.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public com.bytedance.ies.bullet.service.base.a.q getLoggerWrapper() {
        return (com.bytedance.ies.bullet.service.base.a.q) this.v.getValue();
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public void j() {
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public void k() {
    }

    public abstract void q();

    public abstract void r();

    public static final class a implements View.OnAttachStateChangeListener {
        static {
            Covode.recordClassIndex(18787);
        }

        public final void onViewAttachedToWindow(View view) {
            l.c(view, "");
        }

        a() {
        }

        public final void onViewDetachedFromWindow(View view) {
            l.c(view, "");
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final z a() {
        return this.f32056h;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final com.bytedance.ies.bullet.c.e.a.b c() {
        return this.f32057i;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final List<String> d() {
        return this.f32058j;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final Uri e() {
        return this.f32059k;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final boolean h() {
        return this.s;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public void l() {
        i.a.a(this);
    }

    public final List<m> o() {
        return this.o;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final q o_() {
        return this.q;
    }

    public final List<e> p() {
        return this.p;
    }

    public final m r_() {
        return this.f32061m;
    }

    public final d<?, ?, ?, ?> s() {
        return this.w;
    }

    public final e s_() {
        return this.n;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final com.bytedance.ies.bullet.service.f.a.b.b b() {
        return this.w.a();
    }

    static final class b extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(18788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String str;
            com.bytedance.ies.bullet.c.a.a aVar = (com.bytedance.ies.bullet.c.a.a) this.this$0.f32057i.c(com.bytedance.ies.bullet.c.a.a.class);
            if (aVar == null || (str = aVar.f31975a) == null) {
                return "default_bid";
            }
            return str;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.service.base.a.q> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(18789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.service.base.a.q invoke() {
            return new com.bytedance.ies.bullet.service.base.a.q((com.bytedance.ies.bullet.service.base.m) this.this$0.f32057i.c(com.bytedance.ies.bullet.service.base.m.class), "InstanceKit");
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.service.base.a.a> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(18791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.service.base.a.a invoke() {
            boolean z;
            com.bytedance.ies.bullet.c.a.b bVar;
            Context context = (Context) this.this$0.f32057i.c(Context.class);
            com.bytedance.ies.bullet.c.a.a aVar = (com.bytedance.ies.bullet.c.a.a) this.this$0.f32057i.c(com.bytedance.ies.bullet.c.a.a.class);
            if (aVar == null || (bVar = aVar.f31976b) == null) {
                z = false;
            } else {
                z = bVar.f31978a;
            }
            return new com.bytedance.ies.bullet.service.base.a.a(context, z);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void i() {
        this.s = true;
        b(this.f32058j, this.f32060l);
        r();
        Iterator<T> it = this.f32050b.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(this);
            } catch (as unused) {
            }
        }
        j jVar = this.f32049a;
        if (jVar != null) {
            try {
                jVar.a(this);
            } catch (as unused2) {
            }
        }
    }

    public static void a(View view) {
        l.c(view, "");
        view.addOnAttachStateChangeListener(new a());
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final <T> T a_(Class<T> cls) {
        l.c(cls, "");
        return (T) o.a.b(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final <T extends com.bytedance.ies.bullet.service.base.a.c> T b_(Class<T> cls) {
        l.c(cls, "");
        return (T) o.a.a(this, cls);
    }

    static final class d extends h.f.b.m implements h.f.a.b<Uri, z> {
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(18790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(r rVar, h.f.a.b bVar, h.f.a.b bVar2) {
            super(1);
            this.this$0 = rVar;
            this.$resolve = bVar;
            this.$reject = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Uri uri) {
            Uri uri2 = uri;
            l.c(uri2, "");
            this.this$0.b(uri2, this.$resolve, this.$reject);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final <T extends com.bytedance.ies.bullet.service.base.a.c> T b(Class<T> cls) {
        l.c(cls, "");
        return (T) e.a.a().a(f(), cls);
    }

    public final void c(Throwable th) {
        Iterator<T> it = this.f32053e.iterator();
        while (it.hasNext()) {
            it.next().invoke(th);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<Uri, z> {
        final /* synthetic */ h.f.a.b $resolve;
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(18792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(r rVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = rVar;
            this.$resolve = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Uri uri) {
            Uri uri2 = uri;
            l.c(uri2, "");
            this.$resolve.invoke(uri2);
            r rVar = this.this$0;
            rVar.a(uri2, false);
            Iterator<T> it = rVar.f32050b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(rVar, uri2);
                } catch (as unused) {
                }
            }
            j jVar = rVar.f32049a;
            if (jVar != null) {
                try {
                    jVar.a(rVar, uri2);
                } catch (as unused2) {
                }
            }
            return z.f158842a;
        }
    }

    private void a(com.bytedance.ies.bullet.c.c.a.l lVar) {
        com.bytedance.ies.bullet.c.e.b.a<com.bytedance.ies.bullet.c.c.a.c> aVar;
        l.c(lVar, "");
        List<com.bytedance.ies.bullet.c.c.a.o> invoke = lVar.a().invoke(this.f32057i);
        h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, List<com.bytedance.ies.bullet.c.c.a.q>> b2 = lVar.b();
        com.bytedance.ies.bullet.c.e.a.b bVar = this.f32057i;
        try {
            aVar = lVar.c().invoke(this.f32057i);
        } catch (as unused) {
            aVar = null;
        }
        com.bytedance.ies.bullet.c.c.a.h hVar = new com.bytedance.ies.bullet.c.c.a.h(invoke, b2, bVar, aVar);
        m mVar = this.f32051c;
        if (mVar == null) {
            this.f32051c = hVar;
        } else {
            mVar.a(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<Uri, com.bytedance.ies.bullet.service.f.a.b.g<Map<?, ?>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f32062a = new g();

        static {
            Covode.recordClassIndex(18793);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.service.f.a.b.g<Map<?, ?>> invoke(Uri uri) {
            Set<String> queryParameterNames;
            String queryParameter;
            Uri uri2 = uri;
            l.c(uri2, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("__AUTHORITY__", uri2.getAuthority());
            linkedHashMap.put("__PATH__", uri2.getPath());
            if (uri2.isHierarchical() && (queryParameterNames = uri2.getQueryParameterNames()) != null) {
                for (T t : queryParameterNames) {
                    if (!(t == null || (queryParameter = uri2.getQueryParameter(t)) == null)) {
                        linkedHashMap.put(t, queryParameter);
                    }
                }
            }
            return new com.bytedance.ies.bullet.service.f.a.b.g(Map.class, linkedHashMap);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final <T extends q> T a(Class<T> cls) {
        Object obj;
        l.c(cls, "");
        Iterator it = n.k(this.r).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cls.isAssignableFrom(obj.getClass())) {
                break;
            }
        }
        T t2 = (T) ((q) obj);
        if (t2 == null || !(t2 instanceof q)) {
            return null;
        }
        return t2;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public void a(Throwable th) {
        this.s = false;
        com.bytedance.ies.bullet.c.b.a aVar = com.bytedance.ies.bullet.c.b.a.Closed;
        List<com.bytedance.ies.bullet.c.b.b> list = this.f32055g;
        ArrayList<com.bytedance.ies.bullet.c.b.b> arrayList = new ArrayList();
        for (T t2 : list) {
            if (l.a((Object) t2.f31984b, (Object) aVar.getActionType())) {
                arrayList.add(t2);
            }
        }
        for (com.bytedance.ies.bullet.c.b.b bVar : arrayList) {
            bVar.onEvent(this.f32051c);
        }
        this.f32055g.clear();
        m mVar = this.f32051c;
        if (mVar != null) {
            mVar.a();
        }
        b(th);
        Iterator<T> it = this.f32050b.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(this, th);
            } catch (as unused) {
            }
        }
        j jVar = this.f32049a;
        if (jVar != null) {
            try {
                jVar.a(this, th);
            } catch (as unused2) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        i.a.a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void a(List<String> list, com.bytedance.ies.bullet.c.f fVar) {
        l.c(list, "");
        l.c(fVar, "");
        this.f32052d = false;
        this.f32058j.clear();
        this.f32058j.addAll(list);
        c(list, fVar);
        b(list, fVar);
    }

    public void b(List<String> list, com.bytedance.ies.bullet.c.f fVar) {
        l.c(list, "");
        l.c(fVar, "");
        this.f32058j.clear();
        this.f32058j.addAll(list);
        this.f32061m = null;
        this.n = null;
        this.f32049a = null;
        l<?, ?> a2 = fVar.a();
        if (a2 != null) {
            m a3 = a2.a(this.f32057i);
            if (a3 != null) {
                this.f32061m = a3;
            }
            e b2 = a2.b(this.f32057i);
            if (b2 != null) {
                this.n = b2;
                j a4 = b2.a(this.f32057i);
                if (a4 != null) {
                    this.f32049a = a4;
                }
            }
        }
        this.f32055g.clear();
        this.o.clear();
        this.p.clear();
        this.f32050b.clear();
        for (T t2 : fVar.b()) {
            m a5 = t2.a(this.f32057i);
            if (a5 != null) {
                this.o.add(a5);
            }
            e b3 = t2.b(this.f32057i);
            if (b3 != null) {
                this.p.add(b3);
                j a6 = b3.a(this.f32057i);
                if (a6 != null) {
                    this.f32050b.add(a6);
                }
            }
        }
        q();
        m mVar = this.f32051c;
        if (mVar != null) {
            mVar.a();
        }
        this.f32051c = null;
        Iterator<T> it = fVar.d().iterator();
        while (it.hasNext()) {
            a((com.bytedance.ies.bullet.c.c.a.l) it.next());
        }
        com.bytedance.ies.bullet.c.c.a.l c2 = fVar.c();
        if (c2 != null) {
            a(c2);
        }
        this.f32060l = fVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printLog(String str, p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        i.a.a(this, str, pVar, str2);
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void a(Uri uri, h.f.a.b<? super Uri, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        l.c(uri, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        this.f32059k = uri;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f32050b);
        j jVar = this.f32049a;
        if (jVar != null) {
            arrayList.add(jVar);
        }
        if (arrayList.isEmpty()) {
            b(uri, bVar, bVar2);
            return;
        }
        s sVar = new s(this, arrayList);
        d dVar = new d(this, bVar, bVar2);
        l.c(uri, "");
        l.c(dVar, "");
        l.c(bVar2, "");
        Iterator<j> it = sVar.f32063a.iterator();
        if (!it.hasNext()) {
            bVar2.invoke(new Throwable("None of IKitInstanceApiLifecycleDelegate processor for uri ".concat(String.valueOf(uri))));
        } else {
            sVar.a(it, uri, dVar, bVar2);
        }
    }

    public final void b(Uri uri, h.f.a.b<? super Uri, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
        q qVar;
        Object a2;
        c cVar;
        Uri uri2;
        com.bytedance.ies.bullet.service.base.e.a aVar = new com.bytedance.ies.bullet.service.base.e.a(uri);
        String str = this.f32056h.f32074a;
        l.c(str, "");
        aVar.f32600a = str;
        this.f32054f = aVar;
        com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) this.f32057i.c(com.bytedance.ies.bullet.c.i.class);
        Object obj = null;
        if (!(iVar == null || (cVar = iVar.f32091c) == null || (uri2 = cVar.f32041a) == null)) {
            this.f32054f = new com.bytedance.ies.bullet.service.base.e.a(uri2);
        }
        g().a(com.bytedance.ies.bullet.service.base.e.d.class, this.f32054f);
        this.f32057i.b(com.bytedance.ies.bullet.service.base.e.d.class, this.f32054f);
        this.f32057i.b(com.bytedance.ies.bullet.service.base.o.class, b_(com.bytedance.ies.bullet.service.base.o.class));
        com.bytedance.ies.bullet.c.f.a aVar2 = (com.bytedance.ies.bullet.c.f.a) this.f32057i.c(com.bytedance.ies.bullet.c.f.a.class);
        m mVar = (m) n.h((List) this.o);
        if (mVar == null && (mVar = this.f32061m) == null) {
            qVar = null;
        } else {
            qVar = mVar.a(this.f32057i);
            g gVar = g.f32062a;
            l.c(Uri.class, "");
            l.c(gVar, "");
            qVar.as.put(Uri.class, gVar);
        }
        this.q = qVar;
        this.r.clear();
        Iterator<T> it = this.f32060l.e().iterator();
        while (it.hasNext()) {
            this.r.addAll((Collection) it.next().invoke(this.f32057i));
        }
        if (!(aVar2 == null || (a2 = aVar2.a()) == null || !(a2 instanceof Bundle))) {
            obj = a2;
        }
        com.bytedance.ies.bullet.service.f.a.b.f fVar = (com.bytedance.ies.bullet.service.f.a.b.f) this.f32057i.c(com.bytedance.ies.bullet.service.f.a.b.f.class);
        q qVar2 = this.q;
        if (qVar2 != null) {
            if (obj != null) {
                qVar2.a(Bundle.class, obj, fVar);
            }
            qVar2.a(Uri.class, uri, fVar);
        }
        for (T t2 : this.r) {
            if (obj != null) {
                t2.a(Bundle.class, obj, fVar);
            }
            t2.a(Uri.class, uri, fVar);
        }
        if (this.q == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("params not found");
            j.b.a(this, illegalArgumentException);
            bVar2.invoke(illegalArgumentException);
        } else if (a(uri, bVar2)) {
            q qVar3 = this.q;
            if (!(qVar3 == null || aVar2 == null)) {
                aVar2.a(this, uri, qVar3);
            }
            c(uri, new f(this, bVar), bVar2);
        }
    }

    public r(d<?, ?, ?, ?> dVar, z zVar, List<String> list, com.bytedance.ies.bullet.c.f fVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.c(dVar, "");
        l.c(zVar, "");
        l.c(list, "");
        l.c(fVar, "");
        l.c(bVar, "");
        this.w = dVar;
        this.f32056h = zVar;
        this.f32057i = bVar;
        ArrayList arrayList = new ArrayList();
        this.f32058j = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
        this.f32060l = fVar;
        bVar.a(i.class, this);
        bVar.b(com.bytedance.ies.bullet.service.base.o.class, b_(com.bytedance.ies.bullet.service.base.o.class));
        this.v = h.i.a(h.m.SYNCHRONIZED, new c(this));
    }
}
