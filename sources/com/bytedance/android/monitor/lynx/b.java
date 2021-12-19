package com.bytedance.android.monitor.lynx;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.d.j;
import com.bytedance.android.monitor.lynx.b.a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class b implements com.bytedance.android.monitor.k.b {

    /* renamed from: f  reason: collision with root package name */
    public static final b f23580f = C0511b.f23604a;

    /* renamed from: g  reason: collision with root package name */
    public static final long f23581g = ((System.currentTimeMillis() * 1000) - (System.nanoTime() / 1000));

    /* renamed from: h  reason: collision with root package name */
    public static final a f23582h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a f23583a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.monitor.lynx.c.b.c f23584b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.monitor.lynx.c.b.d f23585c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.monitor.lynx.c.b.e f23586d;

    /* renamed from: e  reason: collision with root package name */
    public final a f23587e;

    /* renamed from: i  reason: collision with root package name */
    private int f23588i;

    /* renamed from: j  reason: collision with root package name */
    private int f23589j;

    /* renamed from: k  reason: collision with root package name */
    private long f23590k;

    /* renamed from: l  reason: collision with root package name */
    private Executor f23591l;

    public static final class a {
        static {
            Covode.recordClassIndex(13999);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.monitor.lynx.b$b  reason: collision with other inner class name */
    static final class C0511b {

        /* renamed from: a  reason: collision with root package name */
        static final b f23604a = new b((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final C0511b f23605b = new C0511b();

        private C0511b() {
        }

        static {
            Covode.recordClassIndex(14000);
        }
    }

    public final boolean a(LynxView lynxView) {
        l.c(lynxView, "");
        com.bytedance.android.monitor.lynx.b.b a2 = this.f23583a.a(lynxView);
        if (a2 == null || !a2.f23594b || !a().f23524a) {
            return false;
        }
        return true;
    }

    public final boolean a(String str, String str2) {
        l.c(str2, "");
        return this.f23586d.b(str, str2);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor] */
    public final void a(ExecutorService executorService, h.f.a.a<z> aVar) {
        if (executorService == 0) {
            executorService = b();
        }
        try {
            executorService.execute(new i(aVar));
        } catch (Exception unused) {
        }
    }

    public final void a(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        a(lynxView, str, str2, jSONObject, jSONObject2, jSONObject3, null, jSONObject4, z);
    }

    public final void a(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, boolean z) {
        com.bytedance.android.monitor.f.a.a(new d(this, jSONObject5, lynxView, str2, str, jSONObject, jSONObject2, jSONObject3, jSONObject4, z));
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f23606a;

        static {
            Covode.recordClassIndex(14007);
        }

        i(h.f.a.a aVar) {
            this.f23606a = aVar;
        }

        public final void run() {
            this.f23606a.invoke();
        }
    }

    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.monitor.lynx.c.a.b $commonData;
        final /* synthetic */ com.bytedance.android.monitor.lynx.b.b $config;
        final /* synthetic */ com.bytedance.android.monitor.d.a $containerCommonData;
        final /* synthetic */ com.bytedance.android.monitor.lynx.c.a.a $lynxBlankData;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(14001);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, com.bytedance.android.monitor.lynx.c.a.b bVar2, com.bytedance.android.monitor.d.a aVar, com.bytedance.android.monitor.lynx.c.a.a aVar2, com.bytedance.android.monitor.lynx.b.b bVar3) {
            super(0);
            this.this$0 = bVar;
            this.$commonData = bVar2;
            this.$containerCommonData = aVar;
            this.$lynxBlankData = aVar2;
            this.$config = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a((b) this.$commonData, (com.bytedance.android.monitor.lynx.c.a.b) this.$containerCommonData, (com.bytedance.android.monitor.d.a) this.$lynxBlankData, (com.bytedance.android.monitor.b.b) this.$config, (com.bytedance.android.monitor.lynx.b.b) null);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.monitor.lynx.c.a.b $commonData;
        final /* synthetic */ com.bytedance.android.monitor.lynx.b.b $config;
        final /* synthetic */ com.bytedance.android.monitor.d.a $containerCommonData;
        final /* synthetic */ com.bytedance.android.monitor.lynx.c.a.f $lynxNativeErrorData;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(14003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, com.bytedance.android.monitor.lynx.c.a.b bVar2, com.bytedance.android.monitor.d.a aVar, com.bytedance.android.monitor.lynx.c.a.f fVar, com.bytedance.android.monitor.lynx.b.b bVar3) {
            super(0);
            this.this$0 = bVar;
            this.$commonData = bVar2;
            this.$containerCommonData = aVar;
            this.$lynxNativeErrorData = fVar;
            this.$config = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a((b) this.$commonData, (com.bytedance.android.monitor.lynx.c.a.b) this.$containerCommonData, (com.bytedance.android.monitor.d.a) this.$lynxNativeErrorData, (com.bytedance.android.monitor.b.b) this.$config, (com.bytedance.android.monitor.lynx.b.b) null);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.monitor.lynx.c.a.b $commonData;
        final /* synthetic */ com.bytedance.android.monitor.lynx.b.b $config;
        final /* synthetic */ com.bytedance.android.monitor.d.a $containerCommonData;
        final /* synthetic */ com.bytedance.android.monitor.lynx.c.a.c $errorData;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(14004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, com.bytedance.android.monitor.lynx.c.a.b bVar2, com.bytedance.android.monitor.d.a aVar, com.bytedance.android.monitor.lynx.c.a.c cVar, com.bytedance.android.monitor.lynx.b.b bVar3) {
            super(0);
            this.this$0 = bVar;
            this.$commonData = bVar2;
            this.$containerCommonData = aVar;
            this.$errorData = cVar;
            this.$config = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a((b) this.$commonData, (com.bytedance.android.monitor.lynx.c.a.b) this.$containerCommonData, (com.bytedance.android.monitor.d.a) this.$errorData, (com.bytedance.android.monitor.b.b) this.$config, (com.bytedance.android.monitor.lynx.b.b) null);
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.monitor.lynx.c.a.b $commonData;
        final /* synthetic */ com.bytedance.android.monitor.lynx.b.b $config;
        final /* synthetic */ com.bytedance.android.monitor.d.a $containerCommonData;
        final /* synthetic */ j $pvData;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(14005);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, com.bytedance.android.monitor.lynx.c.a.b bVar2, com.bytedance.android.monitor.d.a aVar, j jVar, com.bytedance.android.monitor.lynx.b.b bVar3) {
            super(0);
            this.this$0 = bVar;
            this.$commonData = bVar2;
            this.$containerCommonData = aVar;
            this.$pvData = jVar;
            this.$config = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a((b) this.$commonData, (com.bytedance.android.monitor.lynx.c.a.b) this.$containerCommonData, (com.bytedance.android.monitor.d.a) this.$pvData, (com.bytedance.android.monitor.b.b) this.$config, (com.bytedance.android.monitor.lynx.b.b) null);
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.monitor.lynx.c.a.b $commonData;
        final /* synthetic */ com.bytedance.android.monitor.lynx.b.b $config;
        final /* synthetic */ com.bytedance.android.monitor.d.a $containerCommonData;
        final /* synthetic */ com.bytedance.android.monitor.d.b $containerInfoData;
        final /* synthetic */ com.bytedance.android.monitor.lynx.c.a.d $lifecycleData;
        final /* synthetic */ com.bytedance.android.monitor.lynx.c.a.g $lynxPerfData;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(14006);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, com.bytedance.android.monitor.lynx.c.a.b bVar2, com.bytedance.android.monitor.d.a aVar, com.bytedance.android.monitor.d.b bVar3, com.bytedance.android.monitor.lynx.c.a.g gVar, com.bytedance.android.monitor.lynx.c.a.d dVar, com.bytedance.android.monitor.lynx.b.b bVar4) {
            super(0);
            this.this$0 = bVar;
            this.$commonData = bVar2;
            this.$containerCommonData = aVar;
            this.$containerInfoData = bVar3;
            this.$lynxPerfData = gVar;
            this.$lifecycleData = dVar;
            this.$config = bVar4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = this.this$0;
            com.bytedance.android.monitor.lynx.c.a.b bVar2 = this.$commonData;
            com.bytedance.android.monitor.d.a aVar = this.$containerCommonData;
            com.bytedance.android.monitor.d.b bVar3 = this.$containerInfoData;
            com.bytedance.android.monitor.lynx.c.a.g gVar = this.$lynxPerfData;
            if (gVar == null) {
                gVar = new com.bytedance.android.monitor.lynx.c.a.g();
            }
            com.bytedance.android.monitor.lynx.c.a.d dVar = this.$lifecycleData;
            com.bytedance.android.monitor.lynx.b.b bVar4 = this.$config;
            gVar.f23659l = dVar;
            bVar.a(bVar2, aVar, gVar, bVar4, bVar3);
            return z.f158842a;
        }
    }

    private static com.bytedance.android.monitor.j.c a() {
        HybridMonitor instance = HybridMonitor.getInstance();
        l.a((Object) instance, "");
        com.bytedance.android.monitor.j.b settingManager = instance.getSettingManager();
        l.a((Object) settingManager, "");
        com.bytedance.android.monitor.j.c c2 = settingManager.c();
        l.a((Object) c2, "");
        return c2;
    }

    static {
        Covode.recordClassIndex(13998);
    }

    private b() {
        com.bytedance.android.monitor.k.c.a("lynx", this);
        this.f23583a = new a();
        this.f23584b = new com.bytedance.android.monitor.lynx.c.b.c();
        this.f23585c = new com.bytedance.android.monitor.lynx.c.b.d();
        this.f23586d = new com.bytedance.android.monitor.lynx.c.b.e();
        this.f23588i = 4;
        this.f23589j = 8;
        this.f23590k = 15;
        this.f23587e = new c();
    }

    private final Executor b() {
        if (this.f23591l == null) {
            this.f23591l = new ThreadPoolExecutor(this.f23588i, this.f23589j, this.f23590k, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
        }
        Executor executor = this.f23591l;
        if (executor == null) {
            l.a();
        }
        return executor;
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ boolean $canSample;
        final /* synthetic */ JSONObject $category;
        final /* synthetic */ JSONObject $common;
        final /* synthetic */ String $eventType;
        final /* synthetic */ JSONObject $extra;
        final /* synthetic */ JSONObject $metric;
        final /* synthetic */ JSONObject $timing;
        final /* synthetic */ String $url;
        final /* synthetic */ LynxView $view;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(14002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, JSONObject jSONObject, LynxView lynxView, String str, String str2, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, boolean z) {
            super(0);
            this.this$0 = bVar;
            this.$common = jSONObject;
            this.$view = lynxView;
            this.$url = str;
            this.$eventType = str2;
            this.$category = jSONObject2;
            this.$metric = jSONObject3;
            this.$extra = jSONObject4;
            this.$timing = jSONObject5;
            this.$canSample = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke() {
            /*
            // Method dump skipped, instructions count: 173
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitor.lynx.b.d.invoke():java.lang.Object");
        }
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public final void b(String str, String str2) {
        l.c(str2, "");
        this.f23586d.a(str, str2);
    }

    public final void a(LynxView lynxView, com.bytedance.android.monitor.d.g gVar) {
        com.bytedance.android.monitor.lynx.c.a.b c2;
        l.c(lynxView, "");
        l.c(gVar, "");
        com.bytedance.android.monitor.lynx.b.b a2 = this.f23583a.a(lynxView);
        if (a2 != null && a2.f23598f && a().f23527d && (c2 = this.f23584b.b(lynxView)) != null) {
            a((b) c2, (com.bytedance.android.monitor.lynx.c.a.b) com.bytedance.android.monitor.k.a.a(lynxView), (com.bytedance.android.monitor.d.a) gVar, (com.bytedance.android.monitor.b.b) a2, (com.bytedance.android.monitor.lynx.b.b) null);
        }
    }

    public final void a(LynxView lynxView, com.bytedance.android.monitor.d.h hVar) {
        com.bytedance.android.monitor.lynx.c.a.b c2;
        l.c(lynxView, "");
        l.c(hVar, "");
        com.bytedance.android.monitor.lynx.b.b a2 = this.f23583a.a(lynxView);
        if (a2 != null && a2.f23598f && a().f23527d && (c2 = this.f23584b.b(lynxView)) != null) {
            a((b) c2, (com.bytedance.android.monitor.lynx.c.a.b) com.bytedance.android.monitor.k.a.a(lynxView), (com.bytedance.android.monitor.d.a) hVar, (com.bytedance.android.monitor.b.b) a2, (com.bytedance.android.monitor.lynx.b.b) null);
        }
    }

    public final void a(LynxView lynxView, com.bytedance.android.monitor.lynx.c.a.c cVar) {
        com.bytedance.android.monitor.lynx.c.a.b c2;
        l.c(lynxView, "");
        l.c(cVar, "");
        com.bytedance.android.monitor.lynx.b.b a2 = this.f23583a.a(lynxView);
        if (a2 != null && a2.f23599g && a().f23526c && (c2 = this.f23584b.b(lynxView)) != null) {
            a(com.bytedance.android.monitor.f.a.a(), new f(this, c2, com.bytedance.android.monitor.k.a.a(lynxView), cVar, a2));
        }
    }

    public final void a(LynxView lynxView, com.bytedance.android.monitor.lynx.c.a.f fVar) {
        com.bytedance.android.monitor.lynx.c.a.b c2;
        l.c(lynxView, "");
        l.c(fVar, "");
        com.bytedance.android.monitor.lynx.b.b a2 = this.f23583a.a(lynxView);
        if (a2 != null && (c2 = this.f23584b.b(lynxView)) != null) {
            a(com.bytedance.android.monitor.f.a.a(), new e(this, c2, com.bytedance.android.monitor.k.a.a(lynxView), fVar, a2));
        }
    }

    public final void a(LynxView lynxView, com.bytedance.android.monitor.lynx.c.a.g gVar) {
        com.bytedance.android.monitor.lynx.c.a.b c2;
        l.c(lynxView, "");
        com.bytedance.android.monitor.lynx.b.b a2 = this.f23583a.a(lynxView);
        if (a2 != null && a2.f23595c && (c2 = this.f23584b.b(lynxView)) != null) {
            String str = c2.f23491b;
            if (!a(str, "perf")) {
                b(str, "perf");
                a(com.bytedance.android.monitor.f.a.a(), new h(this, c2, com.bytedance.android.monitor.k.a.a(lynxView), com.bytedance.android.monitor.k.a.b(lynxView), gVar, (com.bytedance.android.monitor.lynx.c.a.d) this.f23585c.b(lynxView), a2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.bytedance.android.monitor.lynx.c.a.b bVar, com.bytedance.android.monitor.d.a aVar, com.bytedance.android.monitor.b.b bVar2, com.bytedance.android.monitor.lynx.b.b bVar3, com.bytedance.android.monitor.d.b bVar4) {
        com.bytedance.android.monitor.lynx.c.a.e eVar = new com.bytedance.android.monitor.lynx.c.a.e(bVar, bVar2, aVar, bVar4);
        if (bVar3.f23594b) {
            eVar.f23640a = bVar3.f23593a;
            com.bytedance.android.monitor.webview.a aVar2 = bVar3.f23600h;
            if (aVar2 != null) {
                com.bytedance.android.monitor.b.a(eVar, aVar2);
            }
        }
    }
}
