package com.ss.android.ugc.aweme.crossplatform.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.d.a.a.a;
import com.bytedance.ies.d.a.i;
import com.bytedance.ies.d.a.k;
import com.bytedance.ies.d.a.y;
import com.bytedance.ies.d.a.z;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.utils.dc;
import h.a.n;
import h.e.q;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final ExecutorService f78823a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f78824b;

    /* renamed from: c  reason: collision with root package name */
    static i f78825c;

    /* renamed from: d  reason: collision with root package name */
    static com.bytedance.ies.d.a.a.a f78826d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f78827e = new b();

    /* renamed from: f  reason: collision with root package name */
    private static String f78828f;

    public static final class c implements k {
        static {
            Covode.recordClassIndex(48899);
        }

        @Override // com.bytedance.ies.d.a.k
        public final void a(String str) {
            l.d(str, "");
        }

        @Override // com.bytedance.ies.d.a.k
        public final void a(String str, Throwable th) {
            l.d(str, "");
            l.d(th, "");
        }

        c() {
        }
    }

    public static final class d implements com.bytedance.ies.d.a.h {
        static {
            Covode.recordClassIndex(48900);
        }

        @Override // com.bytedance.ies.d.a.h
        public final void a(z zVar, y.b bVar) {
            l.d(zVar, "");
            l.d(bVar, "");
        }

        d() {
        }
    }

    public static final class e implements i {
        static {
            Covode.recordClassIndex(48901);
        }

        e() {
        }

        @Override // com.bytedance.ies.d.a.i
        public final void b(String str, Map<String, String> map, i.a aVar) {
            l.d(str, "");
            l.d(map, "");
            l.d(aVar, "");
            i.b.a(this, str, map, aVar);
        }

        @Override // com.bytedance.ies.d.a.i
        public final void a(String str, Map<String, String> map, i.a aVar) {
            l.d(str, "");
            l.d(map, "");
            l.d(aVar, "");
            i iVar = b.f78825c;
            if (iVar != null) {
                iVar.a(str, map, aVar);
            }
        }

        @Override // com.bytedance.ies.d.a.i
        public final void b(String str, Map<String, String> map, String str2, JSONObject jSONObject, i.a aVar) {
            l.d(str, "");
            l.d(map, "");
            l.d(str2, "");
            l.d(jSONObject, "");
            l.d(aVar, "");
            i.b.a(this, str, map, str2, jSONObject, aVar);
        }

        @Override // com.bytedance.ies.d.a.i
        public final void a(String str, Map<String, String> map, String str2, JSONObject jSONObject, i.a aVar) {
            l.d(str, "");
            l.d(map, "");
            l.d(str2, "");
            l.d(jSONObject, "");
            l.d(aVar, "");
            i iVar = b.f78825c;
            if (iVar != null) {
                iVar.a(str, map, str2, jSONObject, aVar);
            }
        }
    }

    private b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.b$b  reason: collision with other inner class name */
    public static final class C1832b implements com.bytedance.ies.d.a.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f78830a;

        static {
            Covode.recordClassIndex(48898);
        }

        @Override // com.bytedance.ies.d.a.f
        public final List<String> a() {
            return n.a(this.f78830a);
        }

        C1832b(String str) {
            this.f78830a = str;
        }
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f78831a = new f();

        static {
            Covode.recordClassIndex(48902);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            IAccountUserService e2 = AccountService.a().e();
            l.b(e2, "");
            return Boolean.valueOf(e2.isLogin());
        }
    }

    public static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final g f78832a = new g();

        static {
            Covode.recordClassIndex(48903);
        }

        g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String a2 = b.f78827e.a();
            if (a2 == null || a2.length() == 0) {
                return "";
            }
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(48896);
        l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.FIXED);
        a2.f79174c = 1;
        f78823a = com.ss.android.ugc.aweme.cw.g.a(a2.a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String a() {
        /*
            r2 = this;
            monitor-enter(r2)
            r1 = 12068(0x2f24, float:1.6911E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r1)     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = com.ss.android.ugc.aweme.crossplatform.e.b.f78828f     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0013
            int r0 = r0.length()     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = com.ss.android.ugc.aweme.crossplatform.e.b.f78828f     // Catch:{ all -> 0x0026 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r1)     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)
            return r0
        L_0x001d:
            java.lang.String r0 = b()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r1)
            monitor-exit(r2)
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.e.b.a():java.lang.String");
    }

    private static String b() {
        boolean z;
        MethodCollector.i(12067);
        String b2 = dc.b(com.ss.android.ugc.aweme.web.k.f145061a.c(), "gecko_hybrid_prefetch_config");
        if (TextUtils.isEmpty(b2)) {
            MethodCollector.o(12067);
            return null;
        }
        File file = new File(b2);
        if (file.exists() && file.listFiles() != null) {
            File[] listFiles = file.listFiles();
            h.f.b.l.b(listFiles, "");
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                File[] listFiles2 = file.listFiles();
                for (File file2 : listFiles2) {
                    h.f.b.l.b(file2, "");
                    if (p.a("prefetch.json", file2.getName(), true)) {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2.getAbsolutePath()), h.m.d.f158808a), 8192);
                            try {
                                String a2 = q.a((Reader) bufferedReader);
                                h.e.c.a(bufferedReader, null);
                                f78828f = a2;
                                String.valueOf(a2);
                                String str = f78828f;
                                MethodCollector.o(12067);
                                return str;
                            } catch (Throwable th) {
                                h.e.c.a(bufferedReader, th);
                                MethodCollector.o(12067);
                                throw th;
                            }
                        } catch (Exception e2) {
                            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                        }
                    }
                }
                MethodCollector.o(12067);
                return null;
            }
        }
        MethodCollector.o(12067);
        return null;
    }

    public static final class a implements com.bytedance.ies.d.a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Keva f78829a;

        static {
            Covode.recordClassIndex(48897);
        }

        @Override // com.bytedance.ies.d.a.g
        public final void a() {
        }

        a(Keva keva) {
            this.f78829a = keva;
        }

        @Override // com.bytedance.ies.d.a.g
        public final String a(String str) {
            h.f.b.l.d(str, "");
            return this.f78829a.getString(str, null);
        }

        @Override // com.bytedance.ies.d.a.g
        public final Collection<String> b(String str) {
            h.f.b.l.d(str, "");
            return this.f78829a.getStringSet(str, null);
        }

        @Override // com.bytedance.ies.d.a.g
        public final void c(String str) {
            h.f.b.l.d(str, "");
            this.f78829a.erase(str);
        }

        @Override // com.bytedance.ies.d.a.g
        public final void a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            this.f78829a.storeString(str, str2);
        }

        @Override // com.bytedance.ies.d.a.g
        public final void a(String str, Collection<String> collection) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(collection, "");
            this.f78829a.storeStringSet(str, (Set) collection);
        }
    }

    public static final class h<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f78833a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f78834b;

        static {
            Covode.recordClassIndex(48904);
        }

        public h(x xVar, String str) {
            this.f78833a = xVar;
            this.f78834b = str;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            b bVar = b.f78827e;
            h.f.b.l.b(iVar, "");
            Object d2 = iVar.d();
            h.f.b.l.b(d2, "");
            String str = (String) d2;
            h.f.b.l.d(str, "");
            Keva repo = Keva.getRepo("KEY_PREFETCH_CACHE");
            a.b a2 = a.C0726a.a();
            a2.f33158i = 32;
            a2.f33157h = false;
            com.bytedance.ies.d.a.a a3 = a2.a(new a(repo)).a(new C1832b(str)).a(new c()).a(new d());
            h.a.z zVar = h.a.z.INSTANCE;
            h.f.b.l.c(zVar, "");
            a3.f33154e = zVar;
            com.bytedance.ies.d.a.a a4 = a3.a(new e());
            ExecutorService executorService = b.f78823a;
            h.f.b.l.b(executorService, "");
            com.bytedance.ies.d.a.a a5 = a4.a(executorService);
            f fVar = f.f78831a;
            h.f.b.l.c("login", "");
            h.f.b.l.c(fVar, "");
            if (a5.f33160k == null) {
                a5.f33160k = new LinkedHashMap();
            } else {
                Map<String, h.f.a.a<Boolean>> map = a5.f33160k;
                if (map == null) {
                    h.f.b.l.a();
                }
                map.put("login", fVar);
            }
            b.f78826d = (com.bytedance.ies.d.a.a.a) a5.a();
            if (!p.a((CharSequence) str) && bVar != null) {
                b.f78824b = true;
            }
            b.a(this.f78833a, this.f78834b);
            return null;
        }
    }

    public static void a(x xVar, String str) {
        try {
            f78825c = a.f78814c;
            com.bytedance.ies.d.a.a.a aVar = f78826d;
            if (aVar != null) {
                h.f.b.l.c(xVar, "");
                xVar.a(aVar.f33164e, (e.b) new a.c(aVar));
            }
            com.bytedance.ies.d.a.a.a aVar2 = f78826d;
            if (aVar2 != null) {
                aVar2.a(str);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }
}
