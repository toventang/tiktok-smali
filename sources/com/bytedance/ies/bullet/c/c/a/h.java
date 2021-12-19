package com.bytedance.ies.bullet.c.c.a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.i;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.a.n;
import com.bytedance.ies.bullet.c.c.a.q;
import com.bytedance.ies.bullet.c.c.a.r;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.q;
import h.a.n;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class h implements m, j {

    /* renamed from: e  reason: collision with root package name */
    public static final h.f.a.b<String, List<String>> f32016e = c.f32030a;

    /* renamed from: f  reason: collision with root package name */
    public static final h.f.a.b<List<String>, String> f32017f = b.f32029a;

    /* renamed from: g  reason: collision with root package name */
    public static final a f32018g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Map<String, n> f32019a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    h.f.a.b<? super q, z> f32020b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, List<q>> f32021c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.ies.bullet.c.e.a.b f32022d;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, q> f32023h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    private final h.h f32024i = h.i.a((h.f.a.a) d.f32031a);

    /* renamed from: j  reason: collision with root package name */
    private boolean f32025j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f32026k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f32027l = h.i.a((h.f.a.a) new i(this));

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.ies.bullet.c.e.b.a<c> f32028m;

    private final List<d> f() {
        return (List) this.f32024i.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final q getLoggerWrapper() {
        return (q) this.f32027l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18733);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.m
    public final Map<String, n> b() {
        return this.f32019a;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.m
    public final boolean d() {
        return this.f32025j;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.m
    public final com.bytedance.ies.bullet.c.e.b.a<c> e() {
        return this.f32028m;
    }

    static final class d extends m implements h.f.a.a<List<d>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f32031a = new d();

        static {
            Covode.recordClassIndex(18736);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<d> invoke() {
            return new ArrayList();
        }
    }

    static final class i extends m implements h.f.a.a<q> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(18741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            return new q((com.bytedance.ies.bullet.service.base.m) this.this$0.f32022d.c(com.bytedance.ies.bullet.service.base.m.class), "BridgeRegistry");
        }
    }

    static {
        Covode.recordClassIndex(18732);
    }

    @Override // com.bytedance.ies.bullet.c.e.a
    public final void a() {
        for (Map.Entry<String, n> entry : this.f32019a.entrySet()) {
            entry.getValue().a();
        }
        for (Map.Entry<String, q> entry2 : this.f32023h.entrySet()) {
            entry2.getValue().a();
        }
        this.f32019a.clear();
        this.f32023h.clear();
        this.f32025j = true;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.m
    public final Map<String, q> c() {
        Map<String, q> map = this.f32023h;
        if (!this.f32026k) {
            this.f32026k = true;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (T t : this.f32021c.invoke(this.f32022d)) {
                StringBuilder append = sb.append(t.d());
                l.a((Object) append, "");
                p.b(append);
                q qVar = this.f32023h.get(t.d());
                if (qVar != null) {
                    StringBuilder append2 = sb2.append(qVar.d());
                    l.a((Object) append2, "");
                    p.b(append2);
                    qVar.a();
                }
                this.f32023h.put(t.d(), t);
            }
            j.b.a(this, "start to register bridges: ".concat(String.valueOf(sb)), com.bytedance.ies.bullet.service.base.a.p.D, null, 4);
            j.b.a(this, "these bridges has been registered! use the newer one. replaced list: ".concat(String.valueOf(sb2)), com.bytedance.ies.bullet.service.base.a.p.W, null, 4);
            for (T t2 : f()) {
                a(t2.f32003a, t2.f32004b);
            }
        }
        return map;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.m
    public final void a(h.f.a.b<? super q, z> bVar) {
        l.c(bVar, "");
        this.f32020b = bVar;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.m
    public final q a(String str) {
        l.c(str, "");
        return c().get(str);
    }

    static final class b extends m implements h.f.a.b<List<? extends String>, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f32029a = new b();

        static {
            Covode.recordClassIndex(18734);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            l.c(list2, "");
            return n.a(list2, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
        }
    }

    static final class c extends m implements h.f.a.b<String, List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f32030a = new c();

        static {
            Covode.recordClassIndex(18735);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ List<? extends String> invoke(String str) {
            String str2 = str;
            l.c(str2, "");
            return p.b(str2, new String[]{"/"});
        }
    }

    static final class e extends m implements h.f.a.b<c, z> {
        final /* synthetic */ r $impl;

        static {
            Covode.recordClassIndex(18737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(r rVar) {
            super(1);
            this.$impl = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c cVar) {
            c cVar2 = cVar;
            l.c(cVar2, "");
            this.$impl.a(cVar2.f31999a, cVar2.f32000b, cVar2.f32001c, cVar2.f32002d);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ q.a $callback;
        final /* synthetic */ String $funcName;
        final /* synthetic */ r $impl;
        final /* synthetic */ Object $params;
        final /* synthetic */ h.f.a.b $reject;

        static {
            Covode.recordClassIndex(18738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(r rVar, String str, Object obj, q.a aVar, h.f.a.b bVar) {
            super(1);
            this.$impl = rVar;
            this.$funcName = str;
            this.$params = obj;
            this.$callback = aVar;
            this.$reject = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.c(th, "");
            this.$impl.a(this.$funcName, this.$params, this.$callback, this.$reject);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.m
    public final void a(m mVar) {
        List b2;
        l.c(mVar, "");
        for (Map.Entry<String, n> entry : mVar.b().entrySet()) {
            if (this.f32019a.containsKey(entry.getKey())) {
                n nVar = this.f32019a.get(entry.getKey());
                if (nVar != null) {
                    nVar.a(entry.getValue(), false);
                }
            } else {
                this.f32019a.put(entry.getKey(), entry.getValue());
            }
        }
        f().add(new d(mVar));
        com.bytedance.ies.bullet.c.e.b.a<c> aVar = this.f32028m;
        if (aVar == null) {
            this.f32028m = mVar.e();
            return;
        }
        com.bytedance.ies.bullet.c.e.b.a<c> e2 = mVar.e();
        if (!(e2 == null || (b2 = n.b(aVar, e2)) == null)) {
            this.f32028m = new j(b2);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.m
    public final void a(q qVar) {
        l.c(qVar, "");
        j.b.a(this, "register bridge method named " + qVar.d() + '.', com.bytedance.ies.bullet.service.base.a.p.D, null, 4);
        if (this.f32023h.containsKey(qVar.d())) {
            j.b.a(this, "bridge method named " + qVar.d() + " has been registered! use the newer one.", com.bytedance.ies.bullet.service.base.a.p.W, null, 4);
            q qVar2 = this.f32023h.get(qVar.d());
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        this.f32023h.put(qVar.d(), qVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.m
    public final void a(h.f.a.m<? super String, ? super q, z> mVar) {
        l.c(mVar, "");
        C0673h hVar = new C0673h(mVar);
        l.c(hVar, "");
        for (Map.Entry<String, n> entry : this.f32019a.entrySet()) {
            entry.getValue().a(hVar);
        }
        for (Map.Entry<String, q> entry2 : c().entrySet()) {
            hVar.invoke(h.a.z.INSTANCE, entry2.getValue());
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        j.b.a(this, th, str);
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.h$h  reason: collision with other inner class name */
    static final class C0673h extends m implements h.f.a.m<List<? extends n>, q, z> {
        final /* synthetic */ h.f.a.m $handler;

        static {
            Covode.recordClassIndex(18740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0673h(h.f.a.m mVar) {
            super(2);
            this.$handler = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(List<? extends n> list, q qVar) {
            String invoke;
            List<? extends n> list2 = list;
            q qVar2 = qVar;
            l.c(list2, "");
            l.c(qVar2, "");
            h.f.a.m mVar = this.$handler;
            if (list2.isEmpty()) {
                invoke = qVar2.d();
            } else {
                ArrayList arrayList = new ArrayList(n.a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b());
                }
                List<String> g2 = n.g((Collection) arrayList);
                g2.add(qVar2.d());
                invoke = h.f32017f.invoke(g2);
            }
            mVar.invoke(invoke, qVar2);
            return z.f158842a;
        }
    }

    private final void a(m mVar, boolean z) {
        j.b.a(this, "start to register and merge bridges: ".concat(String.valueOf(mVar.c().keySet())), com.bytedance.ies.bullet.service.base.a.p.D, null, 4);
        for (Map.Entry<String, q> entry : mVar.c().entrySet()) {
            if (!this.f32023h.containsKey(entry.getKey())) {
                this.f32023h.put(entry.getKey(), entry.getValue());
            } else if (z) {
                j.b.a(this, "bridge method named " + entry.getKey() + " has been registered! use the newer one.", com.bytedance.ies.bullet.service.base.a.p.W, null, 4);
                q qVar = this.f32023h.get(entry.getKey());
                if (qVar != null) {
                    qVar.a();
                }
                this.f32023h.put(entry.getKey(), entry.getValue());
            } else {
                j.b.a(this, "bridge method named " + entry.getKey() + " has been registered! use the older one.", com.bytedance.ies.bullet.service.base.a.p.W, null, 4);
                entry.getValue().a();
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printLog(String str, com.bytedance.ies.bullet.service.base.a.p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.m
    public final void a(String str, Object obj, q.a aVar, h.f.a.b<? super Throwable, z> bVar) {
        l.c(str, "");
        l.c(obj, "");
        l.c(aVar, "");
        l.c(bVar, "");
        g gVar = new g(this);
        com.bytedance.ies.bullet.c.e.b.a<c> aVar2 = this.f32028m;
        if (aVar2 == null) {
            gVar.a(str, obj, aVar, bVar);
        } else {
            aVar2.a(new c(str, obj, aVar, bVar), new e(gVar), new f(gVar, str, obj, aVar, bVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super com.bytedance.ies.bullet.c.e.a.b, ? extends java.util.List<? extends com.bytedance.ies.bullet.c.c.a.q>> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends o> list, h.f.a.b<? super com.bytedance.ies.bullet.c.e.a.b, ? extends List<? extends q>> bVar, com.bytedance.ies.bullet.c.e.a.b bVar2, com.bytedance.ies.bullet.c.e.b.a<c> aVar) {
        l.c(list, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        this.f32021c = bVar;
        this.f32022d = bVar2;
        this.f32028m = aVar;
        for (T t : list) {
            this.f32019a.put(t.a(), i.a.a(t, this.f32022d));
        }
    }

    static final class g extends m implements r<String, Object, q.a, h.f.a.b<? super Throwable, ? extends z>, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(18739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar) {
            super(4);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: com.bytedance.ies.bullet.c.c.a.n */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.r
        public final /* synthetic */ z a(String str, Object obj, q.a aVar, h.f.a.b<? super Throwable, ? extends z> bVar) {
            String str2;
            q.a aVar2 = aVar;
            h.f.a.b<? super Throwable, ? extends z> bVar2 = bVar;
            l.c(str, "");
            l.c(obj, "");
            l.c(aVar2, "");
            l.c(bVar2, "");
            h hVar = this.this$0;
            List<String> invoke = h.f32016e.invoke(str);
            if (invoke == null || invoke.isEmpty()) {
                str2 = "";
            } else {
                str2 = invoke.get(0);
            }
            if (str2.isEmpty()) {
                com.ss.android.ugc.tiktok.security.b.h.f149026a.a(hVar, invoke, new JSONObject());
            } else {
                q a2 = hVar.a(str2);
                if (a2 == null) {
                    com.ss.android.ugc.tiktok.security.b.h.f149026a.a(hVar, invoke, new JSONObject());
                } else if (a2 instanceof k) {
                    try {
                        com.ss.android.ugc.tiktok.security.b.h.f149026a.a(hVar, invoke, (JSONObject) obj);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        com.ss.android.ugc.tiktok.security.b.h.f149026a.a(hVar, invoke, new JSONObject());
                    }
                }
            }
            l.c(invoke, "");
            l.c(obj, "");
            l.c(aVar2, "");
            l.c(bVar2, "");
            int size = invoke.size();
            if (size == 0) {
                bVar2.invoke(new n.a("[unknown]"));
            } else if (size != 1) {
                String str3 = (String) h.a.n.g((List) invoke);
                n nVar = hVar.f32019a.get(str3);
                if (nVar == 0) {
                    bVar2.invoke(new n.a(str3));
                } else {
                    hVar.f32020b = hVar.f32020b;
                    nVar.a(invoke.subList(1, invoke.size()), obj, aVar2, bVar2);
                }
            } else {
                String str4 = (String) h.a.n.g((List) invoke);
                q qVar = hVar.c().get(str4);
                j.b.a(hVar, "call Lynx/RN bridge method named " + str4 + " with parameters " + obj, com.bytedance.ies.bullet.service.base.a.p.D, null, 4);
                SystemClock.elapsedRealtime();
                if (qVar == null) {
                    bVar2.invoke(new n.a(str4));
                } else if (qVar instanceof k) {
                    h.f.a.b<? super q, z> bVar3 = hVar.f32020b;
                    if (bVar3 != null) {
                        bVar3.invoke(qVar);
                    }
                    ((k) qVar).a((JSONObject) obj, (k.b) aVar2);
                } else if (qVar instanceof r) {
                    h.f.a.b<? super q, z> bVar4 = hVar.f32020b;
                    if (bVar4 != null) {
                        bVar4.invoke(qVar);
                    }
                    r rVar = (r) qVar;
                    if (rVar != null) {
                        f.a(rVar, obj, (r.a) aVar2);
                    }
                }
            }
            return z.f158842a;
        }
    }
}
