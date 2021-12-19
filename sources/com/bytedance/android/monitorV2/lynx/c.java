package com.bytedance.android.monitorV2.lynx;

import android.view.View;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.d.d;
import com.bytedance.android.monitorV2.d.j;
import com.bytedance.android.monitorV2.h.a.a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class c implements com.bytedance.android.monitorV2.k.c {

    /* renamed from: j  reason: collision with root package name */
    public static final c f24075j = b.f24089a;

    /* renamed from: k  reason: collision with root package name */
    public static final long f24076k = ((System.currentTimeMillis() * 1000) - (System.nanoTime() / 1000));

    /* renamed from: l  reason: collision with root package name */
    public static final a f24077l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.monitorV2.lynx.b.c f24078a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.monitorV2.lynx.b.d f24079b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.monitorV2.lynx.b.a f24080c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.monitorV2.lynx.c.c.c f24081d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.monitorV2.lynx.c.c.d f24082e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.monitorV2.g.a f24083f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.monitorV2.lynx.c.c.e f24084g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.android.monitorV2.lynx.c.a.a f24085h;

    /* renamed from: i  reason: collision with root package name */
    public final a f24086i;

    /* renamed from: m  reason: collision with root package name */
    private int f24087m;
    private int n;
    private long o;
    private Executor p;

    @Override // com.bytedance.android.monitorV2.k.c
    public final void a(String str, Object obj) {
        l.c(str, "");
        l.c(obj, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14188);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final c f24089a = new c((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f24090b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(14189);
        }
    }

    public final void a(LynxView lynxView, String str) {
        l.c(lynxView, "");
        l.c(str, "");
        com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "addUrlBid: bid: ".concat(String.valueOf(str)));
        if (lynxView.getTemplateUrl() != null) {
            this.f24078a.a(lynxView.getTemplateUrl(), str);
        }
    }

    public final void a(LynxView lynxView, com.bytedance.android.monitorV2.lynx.c.b.f fVar) {
        com.bytedance.android.monitorV2.lynx.c.b.b c2;
        l.c(lynxView, "");
        com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "reportPerf");
        com.bytedance.android.monitorV2.lynx.b.b a2 = this.f24080c.a(lynxView);
        if (a2 != null && a().g() && (c2 = this.f24081d.b(lynxView)) != null) {
            com.bytedance.android.monitorV2.d.a a3 = com.bytedance.android.monitorV2.k.a.a(lynxView);
            com.bytedance.android.monitorV2.d.b b2 = com.bytedance.android.monitorV2.k.a.b(lynxView);
            String str = c2.f23903b;
            if (!a(str, "perf")) {
                b(str, "perf");
                c2.a(b(lynxView), a(lynxView));
                a(com.bytedance.android.monitorV2.f.a.a(), new g(this, lynxView, c2, a3, b2, fVar, (com.bytedance.android.monitorV2.lynx.c.b.c) this.f24082e.b(lynxView), a2));
            }
        }
    }

    public final boolean a(String str, String str2) {
        l.c(str2, "");
        return this.f24083f.b(str, str2);
    }

    public final void a(LynxView lynxView, com.bytedance.android.monitorV2.lynx.c.b.e eVar) {
        com.bytedance.android.monitorV2.lynx.c.b.b c2;
        l.c(lynxView, "");
        l.c(eVar, "");
        com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "reportError");
        com.bytedance.android.monitorV2.lynx.b.b a2 = this.f24080c.a(lynxView);
        if (a2 != null && (c2 = this.f24081d.b(lynxView)) != null) {
            c2.a(b(lynxView), a(lynxView));
            com.bytedance.android.monitorV2.d.a a3 = com.bytedance.android.monitorV2.k.a.a(lynxView);
            a(eVar);
            a(com.bytedance.android.monitorV2.f.a.a(), new e(this, lynxView, c2, a3, eVar, a2));
        }
    }

    public final void a(LynxView lynxView, com.bytedance.android.monitorV2.d.h hVar) {
        com.bytedance.android.monitorV2.lynx.b.b a2;
        com.bytedance.android.monitorV2.lynx.c.b.b c2;
        l.c(lynxView, "");
        l.c(hVar, "");
        com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "reportJsbInfo");
        if (a().i() && (a2 = this.f24080c.a(lynxView)) != null && (c2 = this.f24081d.b(lynxView)) != null) {
            c2.a(b(lynxView), a(lynxView));
            a((c) lynxView, (LynxView) c2, (com.bytedance.android.monitorV2.lynx.c.b.b) com.bytedance.android.monitorV2.k.a.a(lynxView), (com.bytedance.android.monitorV2.d.a) hVar, (com.bytedance.android.monitorV2.a.b) a2, (com.bytedance.android.monitorV2.lynx.b.b) null);
        }
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
            executorService.execute(new h(aVar));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(LynxView lynxView, com.bytedance.android.monitorV2.lynx.c.b.b bVar, com.bytedance.android.monitorV2.d.a aVar, com.bytedance.android.monitorV2.a.b bVar2, com.bytedance.android.monitorV2.lynx.b.b bVar3, com.bytedance.android.monitorV2.d.b bVar4) {
        String str = bVar.f23903b;
        if (!a(str, "has_report_perf_before")) {
            this.f24085h.a(str, bVar2);
            if (bVar2 != null && l.a((Object) "performance", (Object) bVar2.f23824a)) {
                b(str, "has_report_perf_before");
            }
        }
        if (a(str, "has_report_perf_before")) {
            List<com.bytedance.android.monitorV2.a.b> a2 = this.f24085h.a(str);
            if (a2 == null || a2.isEmpty()) {
                a(lynxView, new com.bytedance.android.monitorV2.lynx.c.b.d(bVar, bVar2, aVar, bVar4), bVar3);
                return;
            }
            for (com.bytedance.android.monitorV2.a.b bVar5 : a2) {
                a(lynxView, new com.bytedance.android.monitorV2.lynx.c.b.d(bVar, bVar5, aVar, bVar4), bVar3);
            }
        }
    }

    public final void a(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i2) {
        com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "reportCustom: eventType: ".concat(String.valueOf(str)));
        com.bytedance.android.monitorV2.d.d a2 = new d.a(str).a(str2).a(jSONObject).b(jSONObject2).c(jSONObject3).d(jSONObject4).e(null).a(i2).a();
        l.a((Object) a2, "");
        a(lynxView, a2);
    }

    @Override // com.bytedance.android.monitorV2.k.c
    public final void a(View view, com.bytedance.android.monitorV2.d.a aVar, com.bytedance.android.monitorV2.k.b bVar) {
        l.c(aVar, "");
        l.c(bVar, "");
        com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "reportContainerError: errorCode: " + bVar.f24009a);
        try {
            com.bytedance.android.monitorV2.lynx.b.b bVar2 = new com.bytedance.android.monitorV2.lynx.b.b(bVar.f24012d, new com.bytedance.android.monitorV2.webview.a());
            com.bytedance.android.monitorV2.lynx.c.b.b bVar3 = new com.bytedance.android.monitorV2.lynx.c.b.b();
            bVar3.f23906e = bVar.f24011c;
            bVar3.f24102k = 999;
            com.bytedance.android.monitorV2.d.c cVar = new com.bytedance.android.monitorV2.d.c();
            com.bytedance.android.monitorV2.d.b a2 = bVar.a();
            if (l.a((Object) "containerError", (Object) cVar.f23824a)) {
                a((LynxView) null, new com.bytedance.android.monitorV2.lynx.c.b.d(bVar3, cVar, aVar, a2), bVar2);
            }
        } catch (Throwable unused) {
            com.bytedance.android.monitorV2.l.c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f24136a;

        static {
            Covode.recordClassIndex(14195);
        }

        h(h.f.a.a aVar) {
            this.f24136a = aVar;
        }

        public final void run() {
            this.f24136a.invoke();
        }
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.c$c  reason: collision with other inner class name */
    public static final class C0518c extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.c.b.b $commonData;
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.b.b $config;
        final /* synthetic */ com.bytedance.android.monitorV2.d.a $containerCommonData;
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.c.b.a $lynxBlankData;
        final /* synthetic */ LynxView $view;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(14190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0518c(c cVar, LynxView lynxView, com.bytedance.android.monitorV2.lynx.c.b.b bVar, com.bytedance.android.monitorV2.d.a aVar, com.bytedance.android.monitorV2.lynx.c.b.a aVar2, com.bytedance.android.monitorV2.lynx.b.b bVar2) {
            super(0);
            this.this$0 = cVar;
            this.$view = lynxView;
            this.$commonData = bVar;
            this.$containerCommonData = aVar;
            this.$lynxBlankData = aVar2;
            this.$config = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a((c) this.$view, (LynxView) this.$commonData, (com.bytedance.android.monitorV2.lynx.c.b.b) this.$containerCommonData, (com.bytedance.android.monitorV2.d.a) this.$lynxBlankData, (com.bytedance.android.monitorV2.a.b) this.$config, (com.bytedance.android.monitorV2.lynx.b.b) null);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.c.b.b $commonData;
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.b.b $config;
        final /* synthetic */ com.bytedance.android.monitorV2.d.a $containerCommonData;
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.c.b.e $lynxNativeErrorData;
        final /* synthetic */ LynxView $view;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(14192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, LynxView lynxView, com.bytedance.android.monitorV2.lynx.c.b.b bVar, com.bytedance.android.monitorV2.d.a aVar, com.bytedance.android.monitorV2.lynx.c.b.e eVar, com.bytedance.android.monitorV2.lynx.b.b bVar2) {
            super(0);
            this.this$0 = cVar;
            this.$view = lynxView;
            this.$commonData = bVar;
            this.$containerCommonData = aVar;
            this.$lynxNativeErrorData = eVar;
            this.$config = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a((c) this.$view, (LynxView) this.$commonData, (com.bytedance.android.monitorV2.lynx.c.b.b) this.$containerCommonData, (com.bytedance.android.monitorV2.d.a) this.$lynxNativeErrorData, (com.bytedance.android.monitorV2.a.b) this.$config, (com.bytedance.android.monitorV2.lynx.b.b) null);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.c.b.b $commonData;
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.b.b $config;
        final /* synthetic */ com.bytedance.android.monitorV2.d.a $containerCommonData;
        final /* synthetic */ j $pvData;
        final /* synthetic */ LynxView $view;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(14193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, LynxView lynxView, com.bytedance.android.monitorV2.lynx.c.b.b bVar, com.bytedance.android.monitorV2.d.a aVar, j jVar, com.bytedance.android.monitorV2.lynx.b.b bVar2) {
            super(0);
            this.this$0 = cVar;
            this.$view = lynxView;
            this.$commonData = bVar;
            this.$containerCommonData = aVar;
            this.$pvData = jVar;
            this.$config = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a((c) this.$view, (LynxView) this.$commonData, (com.bytedance.android.monitorV2.lynx.c.b.b) this.$containerCommonData, (com.bytedance.android.monitorV2.d.a) this.$pvData, (com.bytedance.android.monitorV2.a.b) this.$config, (com.bytedance.android.monitorV2.lynx.b.b) null);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.c.b.b $commonData;
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.b.b $config;
        final /* synthetic */ com.bytedance.android.monitorV2.d.a $containerCommonData;
        final /* synthetic */ com.bytedance.android.monitorV2.d.b $containerInfoData;
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.c.b.c $lifecycleData;
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.c.b.f $lynxPerfData;
        final /* synthetic */ LynxView $view;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(14194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, LynxView lynxView, com.bytedance.android.monitorV2.lynx.c.b.b bVar, com.bytedance.android.monitorV2.d.a aVar, com.bytedance.android.monitorV2.d.b bVar2, com.bytedance.android.monitorV2.lynx.c.b.f fVar, com.bytedance.android.monitorV2.lynx.c.b.c cVar2, com.bytedance.android.monitorV2.lynx.b.b bVar3) {
            super(0);
            this.this$0 = cVar;
            this.$view = lynxView;
            this.$commonData = bVar;
            this.$containerCommonData = aVar;
            this.$containerInfoData = bVar2;
            this.$lynxPerfData = fVar;
            this.$lifecycleData = cVar2;
            this.$config = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            c cVar = this.this$0;
            LynxView lynxView = this.$view;
            com.bytedance.android.monitorV2.lynx.c.b.b bVar = this.$commonData;
            com.bytedance.android.monitorV2.d.a aVar = this.$containerCommonData;
            com.bytedance.android.monitorV2.d.b bVar2 = this.$containerInfoData;
            com.bytedance.android.monitorV2.lynx.c.b.f fVar = this.$lynxPerfData;
            if (fVar == null) {
                fVar = new com.bytedance.android.monitorV2.lynx.c.b.f();
            }
            com.bytedance.android.monitorV2.lynx.c.b.c cVar2 = this.$lifecycleData;
            com.bytedance.android.monitorV2.lynx.b.b bVar3 = this.$config;
            fVar.f24132l = cVar2;
            cVar.a(lynxView, bVar, aVar, fVar, bVar3, bVar2);
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(14187);
    }

    public static com.bytedance.android.monitorV2.h.a.e a() {
        HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
        l.a((Object) instance, "");
        com.bytedance.android.monitorV2.h.f hybridSettingManager = instance.getHybridSettingManager();
        l.a((Object) hybridSettingManager, "");
        com.bytedance.android.monitorV2.h.a.e c2 = hybridSettingManager.c();
        l.a((Object) c2, "");
        return c2;
    }

    private final Executor b() {
        if (this.p == null) {
            this.p = new ThreadPoolExecutor(this.f24087m, this.n, this.o, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
        }
        Executor executor = this.p;
        if (executor == null) {
            l.a();
        }
        return executor;
    }

    private c() {
        com.bytedance.android.monitorV2.k.d.a("lynx", this);
        this.f24078a = new com.bytedance.android.monitorV2.lynx.b.c();
        this.f24079b = new com.bytedance.android.monitorV2.lynx.b.d();
        this.f24080c = new com.bytedance.android.monitorV2.lynx.b.a();
        this.f24081d = new com.bytedance.android.monitorV2.lynx.c.c.c();
        this.f24082e = new com.bytedance.android.monitorV2.lynx.c.c.d();
        this.f24083f = new com.bytedance.android.monitorV2.g.a();
        this.f24084g = new com.bytedance.android.monitorV2.lynx.c.c.e();
        this.f24085h = new com.bytedance.android.monitorV2.lynx.c.a.a();
        this.f24087m = 4;
        this.n = 8;
        this.o = 15;
        this.f24086i = new b();
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.monitorV2.d.d $customInfo;
        final /* synthetic */ LynxView $view;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(14191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, LynxView lynxView, com.bytedance.android.monitorV2.d.d dVar) {
            super(0);
            this.this$0 = cVar;
            this.$view = lynxView;
            this.$customInfo = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0127  */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke() {
            /*
            // Method dump skipped, instructions count: 304
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.lynx.c.d.invoke():java.lang.Object");
        }
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public final a.C0514a b(LynxView lynxView) {
        return a(a(lynxView));
    }

    public static a.C0514a a(String str) {
        HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
        l.a((Object) instance, "");
        com.bytedance.android.monitorV2.h.f hybridSettingManager = instance.getHybridSettingManager();
        l.a((Object) hybridSettingManager, "");
        a.C0514a a2 = hybridSettingManager.b().a(str);
        l.a((Object) a2, "");
        return a2;
    }

    public final boolean c(LynxView lynxView) {
        l.c(lynxView, "");
        com.bytedance.android.monitorV2.lynx.b.b a2 = this.f24080c.a(lynxView);
        if ((a2 == null || a2.f24067b) && a().a() && a().f()) {
            return true;
        }
        return false;
    }

    private static void a(com.bytedance.android.monitorV2.lynx.c.b.e eVar) {
        if (eVar.f24120c == 201) {
            eVar.f23824a = "js_exception";
        } else if (eVar.f24120c == 301) {
            eVar.f23824a = "static";
        }
    }

    public final String a(LynxView lynxView) {
        String str;
        if (lynxView == null) {
            return "";
        }
        com.bytedance.android.monitorV2.lynx.b.b a2 = this.f24080c.a(lynxView);
        if (a2 != null) {
            str = a2.f24066a;
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        String a3 = this.f24078a.a(lynxView.getTemplateUrl());
        return a3 != null ? a3 : valueOf;
    }

    public final void b(String str, String str2) {
        l.c(str2, "");
        this.f24083f.a(str, str2);
    }

    private void a(LynxView lynxView, com.bytedance.android.monitorV2.d.d dVar) {
        l.c(dVar, "");
        com.bytedance.android.monitorV2.f.a.a(new d(this, lynxView, dVar));
    }

    private static void a(com.bytedance.android.monitorV2.lynx.c.b.d dVar, com.bytedance.android.monitorV2.lynx.b.b bVar, String str) {
        if (bVar.f24067b) {
            dVar.f24113a = str;
            com.bytedance.android.monitorV2.webview.b bVar2 = bVar.f24069d;
            if (bVar2 != null) {
                com.bytedance.android.monitorV2.b.a(dVar, bVar2);
            }
        }
    }

    private final void a(LynxView lynxView, com.bytedance.android.monitorV2.lynx.c.b.d dVar, com.bytedance.android.monitorV2.lynx.b.b bVar) {
        if (com.bytedance.android.monitorV2.l.b.a(dVar.h(), b(lynxView))) {
            a(dVar, bVar, a(lynxView));
            com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", l.a(dVar.h(), (Object) "_lynx hit"));
            return;
        }
        com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", l.a(dVar.h(), (Object) "_lynx not hit"));
    }
}
