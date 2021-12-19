package com.bytedance.ies.xbridge.j.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.j.c.c;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.n;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.q;
import h.r;
import h.v;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36143a = "x.request";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36144b = b.a.PROTECT;

    public interface a {

        /* renamed from: com.bytedance.ies.xbridge.j.a.b$a$a  reason: collision with other inner class name */
        public static final class C0847a {
            static {
                Covode.recordClassIndex(21612);
            }
        }

        static {
            Covode.recordClassIndex(21611);
        }

        void a(int i2, String str, com.bytedance.ies.xbridge.j.c.c cVar);

        void a(com.bytedance.ies.xbridge.j.c.c cVar, String str);
    }

    static {
        Covode.recordClassIndex(21610);
    }

    public abstract void a(com.bytedance.ies.xbridge.j.c.b bVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36143a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36144b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.j.c.b> d() {
        return com.bytedance.ies.xbridge.j.c.b.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.j.c.c> e() {
        return com.bytedance.ies.xbridge.j.c.c.class;
    }

    private final ExecutorService a() {
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        if (((bVar2 != null && (iHostThreadPoolExecutorDepend = bVar2.f35882k) != null) || ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) != null && (iHostThreadPoolExecutorDepend = bVar.f35882k) != null)) && (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) != null) {
            return normalThreadExecutor;
        }
        ExecutorService a2 = com.bytedance.common.utility.b.c.a();
        l.a((Object) a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36149a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36150b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36151c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f36152d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f36153e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f36154f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f36155g;

        static {
            Covode.recordClassIndex(21614);
        }

        c(b bVar, String str, String str2, Integer num, int i2, String str3, String str4) {
            this.f36149a = bVar;
            this.f36150b = str;
            this.f36151c = str2;
            this.f36152d = num;
            this.f36153e = i2;
            this.f36154f = str3;
            this.f36155g = str4;
        }

        public final void run() {
            int i2;
            IHostLogDepend iHostLogDepend;
            com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
            try {
                p[] pVarArr = new p[6];
                pVarArr[0] = v.a("method", this.f36150b);
                pVarArr[1] = v.a("url", this.f36151c);
                Integer num = this.f36152d;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = -1;
                }
                pVarArr[2] = v.a("statusCode", Integer.valueOf(i2));
                pVarArr[3] = v.a("requestErrorCode", Integer.valueOf(this.f36153e));
                pVarArr[4] = v.a("requestErrorMsg", this.f36154f);
                pVarArr[5] = v.a("platform", this.f36155g);
                Map<String, ? extends Object> b2 = ag.b(pVarArr);
                com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) this.f36149a.a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
                z zVar = null;
                if (!((bVar2 == null || (iHostLogDepend = bVar2.f35873b) == null) && ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostLogDepend = bVar.f35873b) == null))) {
                    zVar = iHostLogDepend.reportJSBFetchError(this.f36149a.f35883d, b2);
                }
                q.m223constructorimpl(zVar);
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.j.a.b$b  reason: collision with other inner class name */
    public static final class C0848b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36145a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xbridge.j.c.b f36146b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f36147c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36148d;

        static {
            Covode.recordClassIndex(21613);
        }

        @Override // com.bytedance.ies.xbridge.j.a.b.a
        public final void a(com.bytedance.ies.xbridge.j.c.c cVar, String str) {
            l.c(cVar, "");
            l.c(str, "");
            Map<String, Object> a2 = c.a.a(cVar);
            if (a2 == null) {
                this.f36145a.a(this.f36146b.b(), this.f36146b.a(), -1, -5, "Invalid results", this.f36147c.name());
                com.bytedance.ies.xbridge.c.a.a(this.f36148d, -5, null, null, 12);
                return;
            }
            b.a(this.f36148d, a2, str);
        }

        @Override // com.bytedance.ies.xbridge.j.a.b.a
        public final void a(int i2, String str, com.bytedance.ies.xbridge.j.c.c cVar) {
            Map map;
            l.c(str, "");
            if (cVar != null) {
                map = c.a.a(cVar);
                if (map == null) {
                    com.bytedance.ies.xbridge.c.a.a(this.f36148d, i2, str, null, 8);
                    return;
                }
            } else {
                map = new LinkedHashMap();
            }
            b.a(this.f36148d, i2, str, map);
        }

        C0848b(b bVar, com.bytedance.ies.xbridge.j.c.b bVar2, e eVar, b.AbstractC0814b bVar3) {
            this.f36145a = bVar;
            this.f36146b = bVar2;
            this.f36147c = eVar;
            this.f36148d = bVar3;
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "url", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = i.a(nVar, "method", "");
            if (str2.length() != 0) {
                k i2 = nVar.i("body");
                n b2 = i.b(nVar, "params");
                n b3 = i.b(nVar, "header");
                String str3 = i.a(nVar, "bodyType", "");
                com.bytedance.ies.xbridge.j.c.b bVar2 = new com.bytedance.ies.xbridge.j.c.b();
                l.c(str, "");
                bVar2.f36192a = str;
                l.c(str2, "");
                bVar2.f36193b = str2;
                bVar2.f36194c = i2;
                bVar2.f36196e = b2;
                bVar2.f36197f = b3;
                bVar2.f36195d = str3;
                a(bVar2, new C0848b(this, bVar2, eVar, bVar), eVar);
                return;
            }
        }
        a(i.a(nVar, "method", ""), i.a(nVar, "url", ""), -1, -3, "Invalid params", eVar.name());
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }

    public final void a(String str, String str2, Integer num, int i2, String str3, String str4) {
        a().execute(new c(this, str, str2, num, i2, str3, str4));
    }
}
