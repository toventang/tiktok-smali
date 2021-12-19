package com.benchmark.strategy;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.benchmark.b.b;
import com.benchmark.b.c;
import com.benchmark.b.e;
import com.benchmark.b.h;
import com.benchmark.netUtils.BytebenchAPI;
import com.benchmark.port.c;
import com.benchmark.tools.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.TTNetInit;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public com.benchmark.settings.a f6349a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f6350b = false;

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f6351c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f6352d = false;

    /* renamed from: e  reason: collision with root package name */
    private com.benchmark.d.c f6353e;

    /* renamed from: f  reason: collision with root package name */
    private a f6354f;

    /* renamed from: g  reason: collision with root package name */
    private o f6355g;

    /* renamed from: h  reason: collision with root package name */
    private f f6356h = new f();

    /* renamed from: i  reason: collision with root package name */
    private com.benchmark.d.a f6357i = new com.benchmark.d.a() {
        /* class com.benchmark.strategy.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(3049);
        }

        @Override // com.benchmark.d.a
        public final void a() {
            u<e<com.benchmark.b.a>> uVar;
            MethodCollector.i(1261);
            o a2 = b.this.a();
            a2.a("ak", b.this.f6349a.f6339e);
            a2.a("sk", b.this.f6349a.f6340f);
            a2.a("appid", Integer.valueOf(b.this.f6349a.f6338d));
            o oVar = new o();
            oVar.a("extra_info", (l) new g().b().a(a2.toString(), o.class));
            String oVar2 = oVar.toString();
            RequestBody create = RequestBody.create(MediaType.parse("application/json"), oVar2);
            String a3 = j.a(oVar2 + b.this.f6349a.f6340f);
            BytebenchAPI bytebenchAPI = (BytebenchAPI) com.benchmark.netUtils.a.a().a(BytebenchAPI.class);
            Map<String, String> b2 = b.this.b();
            synchronized (com.benchmark.b.a.class) {
                try {
                    com.bytedance.retrofit2.b<e<com.benchmark.b.a>> deviceScore = bytebenchAPI.getDeviceScore(a3, b2, create);
                    deviceScore.request().getUrl();
                    deviceScore.request().getHeaders();
                    try {
                        uVar = deviceScore.execute();
                    } catch (Exception e2) {
                        e2.getMessage();
                        e2.printStackTrace();
                        uVar = null;
                    }
                } finally {
                    MethodCollector.o(1261);
                }
            }
            if (uVar == null || !uVar.f42629a.a()) {
                MethodCollector.o(1261);
                return;
            }
            T t = uVar.f42630b;
            if (t != null && t.f6068a == 0) {
                T t2 = t.f6070c;
                a.f6346b.a(b.this.f6349a.f6338d, com.benchmark.port.a.f6318h.f6320j, t2.f6040i);
                a.f6346b.a(b.this.f6349a.f6338d, com.benchmark.port.a.f6312b.f6320j, t2.f6033b);
                a.f6346b.a(b.this.f6349a.f6338d, com.benchmark.port.a.f6313c.f6320j, t2.f6034c);
                a.f6346b.a(b.this.f6349a.f6338d, com.benchmark.port.a.f6316f.f6320j, t2.f6037f);
                a.f6346b.a(b.this.f6349a.f6338d, com.benchmark.port.a.f6314d.f6320j, t2.f6035d);
                a.f6346b.a(b.this.f6349a.f6338d, com.benchmark.port.a.f6311a.f6320j, t2.f6032a);
                a.f6346b.a(b.this.f6349a.f6338d, com.benchmark.port.a.f6317g.f6320j, t2.f6038g);
                a.f6346b.a(b.this.f6349a.f6338d, com.benchmark.port.a.f6319i.f6320j, t2.f6039h);
                a.f6346b.a(b.this.f6349a.f6338d, com.benchmark.port.a.f6315e.f6320j, t2.f6036e);
            }
        }
    };

    static {
        Covode.recordClassIndex(3048);
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(com.benchmark.netUtils.a.a().b());
        if (this.f6349a.f6338d > 0) {
            hashMap.put("aid", String.valueOf(this.f6349a.f6338d));
        }
        hashMap.put("access_key", this.f6349a.f6339e);
        hashMap.put("secret_key", this.f6349a.f6340f);
        return hashMap;
    }

    public class a implements com.benchmark.d.a {

        /* renamed from: b  reason: collision with root package name */
        private int f6360b;

        /* renamed from: c  reason: collision with root package name */
        private int f6361c;

        /* renamed from: d  reason: collision with root package name */
        private BytebenchAPI f6362d = ((BytebenchAPI) com.benchmark.netUtils.a.a().a(BytebenchAPI.class));

        static {
            Covode.recordClassIndex(3050);
        }

        @Override // com.benchmark.d.a
        public final void a() {
            int i2;
            int i3;
            boolean z;
            int i4;
            int i5;
            MethodCollector.i(1271);
            if (!b.this.f6350b) {
                MethodCollector.o(1271);
                return;
            }
            do {
                long currentTimeMillis = System.currentTimeMillis();
                String str = "";
                long j2 = -1;
                o a2 = b.this.a();
                o oVar = new o();
                oVar.a("extra_info", (l) new g().b().a(a2.toString(), o.class));
                String oVar2 = oVar.toString();
                RequestBody create = RequestBody.create(MediaType.parse("application/json"), oVar2);
                String a3 = j.a(oVar2 + b.this.f6349a.f6340f);
                Map<String, String> b2 = b.this.b();
                b2.put("offset", String.valueOf(this.f6360b));
                u<e<com.benchmark.b.f>> uVar = null;
                synchronized (com.benchmark.b.f.class) {
                    try {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        com.bytedance.retrofit2.b<e<com.benchmark.b.f>> strategyComprise = this.f6362d.getStrategyComprise(a3, b2, create);
                        strategyComprise.request().getUrl();
                        strategyComprise.request().getHeaders();
                        i2 = -1;
                        try {
                            uVar = strategyComprise.execute();
                            j2 = System.currentTimeMillis() - currentTimeMillis2;
                            z = false;
                            i4 = 0;
                            i3 = -1;
                        } catch (Exception e2) {
                            z = true;
                            str = e2.getMessage();
                            e2.getMessage();
                            if (e2 instanceof com.bytedance.frameworks.baselib.network.http.b.c) {
                                com.bytedance.frameworks.baselib.network.http.b.c cVar = (com.bytedance.frameworks.baselib.network.http.b.c) e2;
                                cVar.getStatusCode();
                                cVar.getMessage();
                                i3 = cVar.getStatusCode();
                            } else {
                                i3 = -1;
                            }
                            e2.printStackTrace();
                            i4 = -1;
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(1271);
                        throw th;
                    }
                }
                if (uVar == null || !uVar.f42629a.a()) {
                    if (!z) {
                        str = "the request occur error";
                        if (uVar != null) {
                            i3 = uVar.f42629a.f42474b;
                        }
                    } else {
                        i2 = i4;
                    }
                    i5 = -1;
                } else {
                    T t = uVar.f42630b;
                    if (t == null || t.f6068a != 0) {
                        str = "the server occur error";
                        if (t != null) {
                            i5 = t.f6068a;
                            str = t.f6069b;
                        } else {
                            i5 = -1;
                        }
                    } else {
                        T t2 = t.f6070c;
                        this.f6361c = t2.f6074d;
                        this.f6360b = t2.f6073c;
                        b.this.a((com.benchmark.b.f) t2);
                        i5 = 0;
                        i2 = 0;
                    }
                    i3 = uVar.f42629a.f42474b;
                }
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                try {
                    int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ret", i2);
                    jSONObject.put("message", str);
                    jSONObject.put("code_time", currentTimeMillis3);
                    jSONObject.put("net_cost_time", j2);
                    jSONObject.put("status_code", i5);
                    jSONObject.put("response_code", i3);
                    jSONObject.put("net_status", effectiveConnectionType);
                    jSONObject.put("sdk_version", "2.6.0-mt_2");
                    com.benchmark.a.a.a("bytebench_strategy_request", jSONObject);
                } catch (Exception unused) {
                }
                if (this.f6361c <= this.f6360b) {
                    break;
                }
            } while (b.this.f6350b);
            this.f6360b = 0;
            this.f6361c = 0;
            MethodCollector.o(1271);
        }

        public a() {
        }
    }

    public final o a() {
        long j2;
        long j3;
        File file;
        MethodCollector.i(6563);
        if (this.f6355g == null) {
            synchronized (b.class) {
                try {
                    if (this.f6355g == null) {
                        this.f6355g = new o();
                        Context context = com.benchmark.c.b.f6095l.f6096a;
                        o oVar = this.f6355g;
                        ActivityManager activityManager = (ActivityManager) j.a(context, "activity");
                        if (activityManager != null) {
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            activityManager.getMemoryInfo(memoryInfo);
                            j2 = memoryInfo.totalMem;
                        } else {
                            j2 = 0;
                        }
                        oVar.a("memory_total_size", Long.valueOf(j2));
                        this.f6355g.a("cpu_core_nums", Integer.valueOf(j.a()));
                        this.f6355g.a("cpu_freq", Long.valueOf(j.b()));
                        o oVar2 = this.f6355g;
                        long j4 = -1;
                        if (Environment.getDataDirectory() != null) {
                            if (d.f107195c == null || !d.f107197e) {
                                d.f107195c = context.getFilesDir();
                            }
                            j3 = com.benchmark.tools.b.b(d.f107195c.getParent());
                        } else {
                            j3 = -1;
                        }
                        oVar2.a("storage_total_internal_size", Long.valueOf(j3));
                        o oVar3 = this.f6355g;
                        String str = null;
                        if (!TextUtils.isEmpty(null)) {
                            file = context.getExternalFilesDir(null);
                        } else {
                            if (d.f107196d == null || !d.f107197e) {
                                d.f107196d = context.getExternalFilesDir(null);
                            }
                            file = d.f107196d;
                        }
                        if (file != null) {
                            str = file.getParent();
                        }
                        if (!(str == null || Environment.getDataDirectory() == null)) {
                            j4 = com.benchmark.tools.b.b(str);
                        }
                        oVar3.a("storage_total_external_size", Long.valueOf(j4));
                        if (this.f6349a.f6337c != null) {
                            for (Map.Entry<String, String> entry : this.f6349a.f6337c.entrySet()) {
                                this.f6355g.a(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6563);
                    throw th;
                }
            }
        }
        o oVar4 = this.f6355g;
        MethodCollector.o(6563);
        return oVar4;
    }

    @Override // com.benchmark.port.c
    public final int a(com.benchmark.settings.a aVar) {
        int i2;
        MethodCollector.i(6483);
        if (!com.benchmark.c.b.f6095l.a()) {
            MethodCollector.o(6483);
            return -105;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f6349a = aVar;
        if (!this.f6352d) {
            synchronized (this) {
                try {
                    if (!this.f6352d) {
                        a aVar2 = a.f6346b;
                        if (!this.f6350b || (i2 = this.f6349a.f6338d) <= 0) {
                            i2 = com.benchmark.c.b.f6095l.f6099d;
                        }
                        aVar2.f6347a.openRepo(i2);
                        this.f6352d = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6483);
                    throw th;
                }
            }
        }
        this.f6354f = new a();
        com.benchmark.d.d b2 = new com.benchmark.d.d().b();
        b2.f6204c = this.f6349a.f6335a;
        b2.f6202a = this.f6354f;
        if (this.f6349a.f6335a <= 0) {
            b2.f6203b = 1;
        } else {
            b2.f6203b = Integer.MAX_VALUE;
        }
        this.f6353e = b2.a();
        com.benchmark.d.b.f6186a.a(this.f6353e);
        com.benchmark.d.d b3 = new com.benchmark.d.d().b();
        b3.f6203b = 1;
        b3.f6202a = this.f6357i;
        com.benchmark.d.b.f6186a.a(b3.a());
        this.f6350b = true;
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis2);
            jSONObject.put("sdk_version", "2.6.0-mt_2");
            com.benchmark.a.a.a("bytebench_strategy_init", jSONObject);
        } catch (JSONException unused) {
        }
        MethodCollector.o(6483);
        return 0;
    }

    public final void a(com.benchmark.b.f fVar) {
        List<h> list = fVar.f6072b;
        List<com.benchmark.b.d> list2 = fVar.f6071a;
        for (h hVar : list) {
            if (hVar.f6081b) {
                int i2 = hVar.f6083d;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            a aVar = a.f6346b;
                            aVar.f6347a.storeBoolean(this.f6349a.f6338d, hVar.f6080a, false, ((Boolean) hVar.a()).booleanValue());
                        } else if (i2 != 4) {
                        }
                    }
                    a.f6346b.a(this.f6349a.f6338d, hVar.f6080a, false, (String) hVar.a());
                } else {
                    a.f6346b.a(this.f6349a.f6338d, hVar.f6080a, ((Float) hVar.a()).floatValue());
                }
            }
        }
        for (com.benchmark.b.d dVar : list2) {
            com.benchmark.b.c cVar = new com.benchmark.b.c();
            cVar.f6051a = dVar.f6066a;
            List<com.benchmark.b.b> list3 = dVar.f6067b;
            if (list3 != null) {
                for (com.benchmark.b.b bVar : list3) {
                    c.C0080c cVar2 = new c.C0080c();
                    cVar2.f6061a = bVar.f6045d;
                    cVar2.f6062b = bVar.f6046e;
                    cVar2.f6063c = bVar.f6043b ? 1 : 0;
                    cVar2.f6064d = new ArrayList();
                    List<b.a> list4 = bVar.f6042a;
                    if (list4 == null) {
                        break;
                    }
                    for (b.a aVar2 : list4) {
                        c.b bVar2 = new c.b();
                        com.benchmark.b.c.a(bVar2.f6058b, aVar2.f6048a);
                        com.benchmark.b.c.a(bVar2.f6057a, aVar2.f6050c);
                        com.benchmark.b.c.a(bVar2.f6059c, aVar2.f6049b);
                        cVar2.f6064d.add(bVar2);
                    }
                    cVar.f6052b.add(cVar2);
                }
            }
            a.f6346b.a(this.f6349a.f6338d, dVar.f6066a, true, this.f6356h.b(cVar));
        }
    }
}
