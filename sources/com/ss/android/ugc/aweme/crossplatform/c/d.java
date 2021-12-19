package com.ss.android.ugc.aweme.crossplatform.c;

import android.net.Uri;
import com.bytedance.android.monitor.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.ax.a.ab;
import com.ss.android.ugc.aweme.ax.a.ac;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.ax.a.s;
import com.ss.android.ugc.aweme.ax.a.z;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.p;
import com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.b.m;
import h.h;
import h.i;
import h.m.l;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final h f78696h = i.a((h.f.a.a) b.f78708a);

    /* renamed from: i  reason: collision with root package name */
    public static final a f78697i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f78698a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f78699b;

    /* renamed from: c  reason: collision with root package name */
    public String f78700c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, k> f78701d;

    /* renamed from: e  reason: collision with root package name */
    public final l f78702e;

    /* renamed from: f  reason: collision with root package name */
    public final z f78703f;

    /* renamed from: g  reason: collision with root package name */
    public final ab f78704g;

    /* renamed from: j  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f78705j;

    /* renamed from: k  reason: collision with root package name */
    private final ConcurrentHashMap<String, Long> f78706k;

    /* renamed from: l  reason: collision with root package name */
    private final h f78707l;

    public static final class a {
        static {
            Covode.recordClassIndex(48860);
        }

        public static d a() {
            return (d) d.f78696h.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.d$d  reason: collision with other inner class name */
    public static final class C1828d implements z {
        static {
            Covode.recordClassIndex(48863);
        }

        C1828d() {
        }

        @Override // com.ss.android.ugc.aweme.ax.a.z
        public final void a(String str, JSONObject jSONObject) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(jSONObject, "");
            o.b("service_monitor", str, jSONObject);
        }

        private static void a(JSONObject jSONObject, String str, Object obj) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }

        @Override // com.ss.android.ugc.aweme.ax.a.z
        public final void a(Exception exc, String str, Map<String, String> map) {
            h.f.b.l.d(exc, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(map, "");
            com.bytedance.c.a.a.a.b.a(exc, str, map);
        }

        @Override // com.ss.android.ugc.aweme.ax.a.z
        public final void a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            JSONObject jSONObject3;
            int i2;
            if (jSONObject2 == null) {
                jSONObject3 = null;
            } else if (z) {
                jSONObject3 = jSONObject2;
            } else {
                jSONObject3 = new JSONObject();
                a(jSONObject2, "tag", "ttlive_sdk");
                a(jSONObject3, "aid", String.valueOf(com.bytedance.ies.ugc.appcontext.d.n));
                a(jSONObject3, "extra", jSONObject2);
            }
            c.a(jSONObject2);
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 1;
            }
            n.a(str, i2, jSONObject, jSONObject3);
        }
    }

    static final class b extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78708a = new b();

        static {
            Covode.recordClassIndex(48861);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d((byte) 0);
        }
    }

    public static final class e implements ab {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f78709a;

        /* renamed from: b  reason: collision with root package name */
        private String f78710b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f78711c = "";

        /* renamed from: d  reason: collision with root package name */
        private String f78712d = "";

        /* renamed from: e  reason: collision with root package name */
        private Boolean f78713e;

        static {
            Covode.recordClassIndex(48864);
        }

        @Override // com.ss.android.ugc.aweme.ax.a.ab
        public final boolean c() {
            return com.bytedance.ies.abmock.b.a().a(true, "webview_monitor_enable", false);
        }

        @Override // com.ss.android.ugc.aweme.ax.a.ab
        public final List<String> d() {
            List<String> a2 = p.a.a();
            h.f.b.l.b(a2, "");
            return a2;
        }

        @Override // com.ss.android.ugc.aweme.ax.a.ab
        public final String a() {
            if (this.f78712d.length() == 0) {
                h.f.b.l.b("SystemWebView", "");
                this.f78712d = "SystemWebView";
            }
            return this.f78712d;
        }

        @Override // com.ss.android.ugc.aweme.ax.a.ab
        public final boolean b() {
            if (this.f78713e == null) {
                this.f78713e = false;
            }
            Boolean bool = this.f78713e;
            Objects.requireNonNull(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            if (r0 != null) goto L_0x0025;
         */
        @Override // com.ss.android.ugc.aweme.ax.a.ab
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String e() {
            /*
                r1 = this;
                java.lang.String r0 = r1.f78710b
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x000e
                r0 = 1
            L_0x0009:
                if (r0 == 0) goto L_0x0010
                java.lang.String r0 = r1.f78710b
                return r0
            L_0x000e:
                r0 = 0
                goto L_0x0009
            L_0x0010:
                com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig r0 = com.ss.android.ugc.aweme.crossplatform.c.d.a()
                if (r0 == 0) goto L_0x0021
                java.lang.String r0 = r0.getSlardarSdkConfig()     // Catch:{ a -> 0x001b }
                goto L_0x001f
            L_0x001b:
                java.lang.String r0 = f()
            L_0x001f:
                if (r0 != 0) goto L_0x0025
            L_0x0021:
                java.lang.String r0 = f()
            L_0x0025:
                r1.f78710b = r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.c.d.e.e():java.lang.String");
        }

        private static String f() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("webview_is_need_monitor", true);
            jSONObject.put("webview_classes", new JSONArray());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bid", "ies");
            jSONObject.put("commonReportConfig", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("interval", 8000L);
            jSONObject3.put("FPSMonitor", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("interval", 8000L);
            jSONObject3.put("MemoryMonitor", jSONObject5);
            jSONObject.put("apmReportConfig", jSONObject3);
            JSONObject jSONObject6 = new JSONObject();
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("interval", 10L);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("DOMContentLoaded");
            jSONObject7.put("checkPoint", jSONArray);
            jSONObject6.put("PerformanceMonitor", jSONObject7);
            jSONObject.put("performanceReportConfig", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("ignore", new JSONArray());
            jSONObject8.put("StaticErrorMonitor", jSONObject9);
            jSONObject.put("errorMsgReportConfig", jSONObject8);
            JSONObject jSONObject10 = new JSONObject();
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("slowSession", 8000L);
            jSONObject11.put("sampleRate", 0.1d);
            jSONObject10.put("StaticPerformanceMonitor", jSONObject11);
            jSONObject.put("resourceTimingReportConfig", jSONObject10);
            String jSONObject12 = jSONObject.toString();
            h.f.b.l.b(jSONObject12, "");
            return jSONObject12;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(d dVar) {
            this.f78709a = dVar;
        }
    }

    static final class c extends m implements h.f.a.a<List<String>> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(48862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<String> invoke() {
            List<String> perfMonitorRegexList;
            HybridMonitorConfig a2 = d.a();
            if (a2 == null || (perfMonitorRegexList = a2.getPerfMonitorRegexList()) == null) {
                return new ArrayList();
            }
            return perfMonitorRegexList;
        }
    }

    static {
        Covode.recordClassIndex(48859);
    }

    public static HybridMonitorConfig a() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            h.f.b.l.b(iESSettingsProxy, "");
            return iESSettingsProxy.getHybridMonitorConfig();
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private d() {
        f fVar = new f(this);
        this.f78705j = fVar;
        this.f78698a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(fVar);
        this.f78699b = new ArrayList();
        this.f78701d = new LinkedHashMap();
        this.f78706k = new ConcurrentHashMap<>();
        this.f78702e = new l("Chrome/(\\d+.\\d+.\\d+.\\d+)");
        this.f78707l = i.a(h.m.NONE, new c(this));
        this.f78703f = new C1828d();
        this.f78704g = new e(this);
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    public final boolean b(String str) {
        h.f.b.l.d(str, "");
        if (!this.f78701d.containsKey(str)) {
            return false;
        }
        k remove = this.f78701d.remove(str);
        if (remove != null) {
            remove.b();
        }
        this.f78699b.remove(str);
        return true;
    }

    private boolean a(Uri uri) {
        h.f.b.l.d(uri, "");
        try {
            if (!uri.getBooleanQueryParameter("monitor_enabled", false)) {
                String uri2 = uri.toString();
                h.f.b.l.b(uri2, "");
                for (String str : (List) this.f78707l.getValue()) {
                    if (new l(str).containsMatchIn(uri2)) {
                    }
                }
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final k a(boolean z) {
        k kVar = new k(this.f78703f, this.f78704g);
        String uuid = UUID.randomUUID().toString();
        h.f.b.l.b(uuid, "");
        kVar.a(uuid, z);
        this.f78701d.put(kVar.bz_(), kVar);
        this.f78699b.add(kVar.bz_());
        return kVar;
    }

    public final boolean a(String str) {
        h.f.b.l.d(str, "");
        try {
            Uri parse = Uri.parse(str);
            h.f.b.l.b(parse, "");
            return a(parse);
        } catch (Exception unused) {
            return false;
        }
    }

    static final class f implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f78714a;

        static {
            Covode.recordClassIndex(48865);
        }

        f(d dVar) {
            this.f78714a = dVar;
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            h.f.b.l.d(thread, "");
            h.f.b.l.d(th, "");
            th.getCause();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f78714a.f78698a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject2;
        JSONObject jSONObject4 = jSONObject;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        ac.f67690a.getValue();
        String valueOf = String.valueOf(com.bytedance.ies.ugc.appcontext.d.n);
        z zVar = this.f78703f;
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        jSONObject4.put("trigger", str2);
        h.f.b.l.d(valueOf, "");
        h.f.b.l.d(zVar, "");
        h.f.b.l.d(str, "");
        try {
            com.bytedance.android.monitor.a.c b2 = com.bytedance.android.monitor.g.d.b();
            b.a aVar = new b.a();
            com.bytedance.android.monitor.a.d b3 = com.bytedance.android.monitor.g.e.b();
            b3.a("mt");
            aVar.f23419b = b3;
            com.ss.android.ugc.aweme.ax.a.h hVar = com.ss.android.ugc.aweme.ax.a.h.f67729c;
            ((com.bytedance.android.monitor.g.c) hVar).f23511a = valueOf;
            hVar.f67731b = zVar;
            aVar.f23418a = hVar;
            b2.a(aVar);
            com.bytedance.android.monitor.a.c b4 = com.bytedance.android.monitor.g.d.b();
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            b4.a("", str, jSONObject4, jSONObject3, new JSONObject());
        } catch (Exception e2) {
            e2.printStackTrace();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("stateless", "true");
            linkedHashMap.put("eventName", str);
            zVar.a(e2, "hybrid report failed", linkedHashMap);
        }
    }

    public static void a(s sVar, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if (sVar != null) {
            sVar.a(str, str2, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
