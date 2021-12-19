package com.bytedance.apm;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.c.a.d;
import com.bytedance.apm.config.b;
import com.bytedance.apm.d.b;
import com.bytedance.apm.h;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.internal.b;
import com.bytedance.apm.p.b;
import com.bytedance.apm.p.c;
import com.bytedance.apm.q.h;
import com.bytedance.apm.q.v;
import com.bytedance.b.b.a.d.c;
import com.bytedance.b.g.b;
import com.bytedance.b.g.c;
import com.bytedance.c.a.a.a.f;
import com.bytedance.c.a.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.l;
import com.bytedance.monitor.a.b.a;
import com.bytedance.monitor.a.b.d;
import com.bytedance.services.apm.api.IHttpService;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(14294);
    }

    private a() {
    }

    /* renamed from: com.bytedance.apm.a$a  reason: collision with other inner class name */
    public static class C0521a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24346a = new a((byte) 0);

        static {
            Covode.recordClassIndex(14298);
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(Context context) {
        ApmDelegate apmDelegate = ApmDelegate.a.f25042a;
        b.a a2 = b.a();
        a2.f24785e = apmDelegate.f25008b;
        if (apmDelegate.f25009c != null) {
            a2.f24782b = apmDelegate.f25009c.f25363b;
            a2.f24783c = apmDelegate.f25009c.f25362a;
            a2.f24786f = apmDelegate.f25009c.f25365d;
            a2.f24787g = (long) apmDelegate.f25009c.f25364c;
        }
        apmDelegate.a(context, a2.a());
        if (c.f24687c) {
            c.a().a(new Runnable() {
                /* class com.bytedance.apm.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14295);
                }

                public final void run() {
                    b.a("Apm#init", "Apm init");
                }
            });
        }
    }

    public final void a(com.bytedance.apm.config.c cVar) {
        ApmDelegate apmDelegate = ApmDelegate.a.f25042a;
        if (!apmDelegate.f25015i) {
            throw new IllegalArgumentException("You must call Apm.getInstance().init() on Application.onCreate from version 5.x.x, pls call init() before start(). If you have any questions, pls lark wangkai.android");
        } else if (cVar != null) {
            if (!apmDelegate.f25016j) {
                com.bytedance.apm.p.b bVar = b.a.f25210a;
                bVar.f25201b = true;
                if (!bVar.f25205h.isEmpty()) {
                    bVar.a(bVar.f25203f);
                    bVar.a(bVar.f25203f, com.bytedance.apm.p.b.f25198c);
                }
                if (!bVar.f25206i.isEmpty()) {
                    bVar.a(bVar.f25204g);
                    bVar.a(bVar.f25204g, com.bytedance.apm.p.b.f25199d);
                }
                apmDelegate.f25016j = true;
                apmDelegate.f25010d = cVar;
                b.a.f25210a.a(new Runnable() {
                    /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass10 */

                    static {
                        Covode.recordClassIndex(14614);
                    }

                    public final void run() {
                        ApmDelegate apmDelegate = ApmDelegate.this;
                        try {
                            long nanoTime = System.nanoTime();
                            com.bytedance.apm.c.f24696l = System.currentTimeMillis();
                            if (h.a(apmDelegate.f25010d.f24794a) && !h.a(apmDelegate.o)) {
                                apmDelegate.f25010d.f24794a = apmDelegate.o;
                            }
                            if (h.a(apmDelegate.f25010d.f24795b) && !h.a(apmDelegate.p)) {
                                apmDelegate.f25010d.f24795b = apmDelegate.p;
                            }
                            if (h.a(apmDelegate.f25010d.f24796c) && !h.a(apmDelegate.q)) {
                                apmDelegate.f25010d.f24796c = apmDelegate.q;
                            }
                            com.bytedance.apm.n.c.f25187a = new com.bytedance.apm.m.a();
                            com.bytedance.apm.h hVar = h.b.f24998a;
                            hVar.f24991a = new h.a() {
                                /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass11 */

                                static {
                                    Covode.recordClassIndex(14615);
                                }

                                @Override // com.bytedance.apm.h.a
                                public final void a(String str) {
                                    com.bytedance.c.a.a.a.b.a(str);
                                }

                                @Override // com.bytedance.apm.h.a
                                public final void a(Throwable th, String str) {
                                    com.bytedance.c.a.a.a.b.a(th, str);
                                }

                                @Override // com.bytedance.apm.h.a
                                public final void b(Throwable th, String str) {
                                    com.bytedance.c.a.a.a.c a2 = com.bytedance.c.a.a.a.c.a();
                                    try {
                                        StackTraceElement[] stackTrace = th.getStackTrace();
                                        String className = stackTrace[0].getClassName();
                                        String methodName = stackTrace[0].getMethodName();
                                        int lineNumber = stackTrace[0].getLineNumber();
                                        String a3 = g.a(th);
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("event_type", "exception");
                                        jSONObject.put("timestamp", System.currentTimeMillis());
                                        jSONObject.put("class_ref", className);
                                        jSONObject.put("method", methodName);
                                        jSONObject.put("line_num", lineNumber);
                                        jSONObject.put("stack", a3);
                                        jSONObject.put("exception_type", 1);
                                        jSONObject.put("is_core", 1);
                                        jSONObject.put("message", str);
                                        JSONObject jSONObject2 = new JSONObject();
                                        JSONArray jSONArray = new JSONArray();
                                        jSONArray.put(jSONObject);
                                        jSONObject2.put("data", jSONArray);
                                        if (a2.f26678c == null) {
                                            a2.f26678c = com.bytedance.apm.c.f24690f;
                                        }
                                        jSONObject2.put("header", a2.f26678c);
                                        f.a(v.a(com.bytedance.c.a.a.a.c.f26674a, com.bytedance.apm.c.h()), jSONObject2.toString().getBytes(), f.a.GZIP, "application/json; charset=utf-8");
                                    } catch (Throwable unused) {
                                    }
                                }
                            };
                            a.C1013a.f41371a.a(new d.a() {
                                /* class com.bytedance.apm.h.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(14592);
                                }

                                @Override // com.bytedance.monitor.a.b.d.a
                                public final void a(Throwable th, String str) {
                                    if (h.this.f24991a != null) {
                                        h.this.f24991a.b(th, str);
                                    }
                                }
                            });
                            com.bytedance.apm.c.a(apmDelegate.f25010d.q);
                            com.bytedance.apm.c.a(apmDelegate.f25010d.r);
                            IHttpService iHttpService = apmDelegate.f25010d.s;
                            if (iHttpService != null) {
                                com.bytedance.apm.c.f24692h = iHttpService;
                            }
                            com.bytedance.apm.c.q = apmDelegate.f25010d.f24794a;
                            com.bytedance.apm.c.r = apmDelegate.f25010d.A;
                            apmDelegate.f25012f = apmDelegate.f25010d.z;
                            apmDelegate.f25018l = apmDelegate.f25010d.t;
                            com.bytedance.b.g.c cVar = c.a.f26290a;
                            cVar.a();
                            cVar.b();
                            cVar.c();
                            cVar.d();
                            if (apmDelegate.f25017k) {
                                com.bytedance.apm.k.h hVar2 = new com.bytedance.apm.k.h();
                                hVar2.f25114c = apmDelegate.f25010d.x;
                                hVar2.h();
                            }
                            com.bytedance.b.d.c.f26146a.f26156k = apmDelegate.f25010d.x;
                            b.a.f26271a.f26261a = apmDelegate.f25010d.f24797d;
                            if (apmDelegate.f25010d.f24801h && !apmDelegate.f25010d.f24802i) {
                                apmDelegate.a();
                            }
                            com.bytedance.apm.j.a a2 = com.bytedance.apm.j.a.a();
                            com.bytedance.apm.g.a aVar = apmDelegate.f25010d.w;
                            if (aVar != null) {
                                try {
                                    a2.f25051a.add(aVar);
                                } catch (Throwable unused) {
                                }
                            }
                            com.bytedance.apm.c.a.a.b().a();
                            d.a.f24718a.a();
                            d.a.f24718a.f24712f = apmDelegate.f25010d.p;
                            com.bytedance.apm.a.f fVar = apmDelegate.f25007a.s;
                            if (com.bytedance.apm.a.a.f24347a == null) {
                                com.bytedance.apm.a.a.f24347a = fVar;
                            }
                            try {
                                String b2 = l.b();
                                if (!TextUtils.isEmpty(b2)) {
                                    com.bytedance.apm.c.f24690f.put("bytrace_id", b2);
                                    com.bytedance.apm.c.f24690f.put("pid", String.valueOf(Process.myPid()));
                                }
                            } catch (Throwable unused2) {
                            }
                            long j2 = apmDelegate.f25010d.u;
                            AnonymousClass12 r10 = new Runnable() {
                                /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass12 */

                                static {
                                    Covode.recordClassIndex(14616);
                                }

                                public final void run() {
                                    ApmDelegate.this.f25013g.initParams(ApmDelegate.this.f25010d.o, new com.bytedance.apm.core.c() {
                                        /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass12.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(14617);
                                        }

                                        @Override // com.bytedance.apm.core.c
                                        public final Map<String, String> a() {
                                            return com.bytedance.apm.c.h();
                                        }
                                    }, ApmDelegate.this.f25010d.f24794a);
                                    if (!ApmDelegate.this.f25010d.n || !com.bytedance.apm.c.b()) {
                                        ApmDelegate.this.f25013g.fetchConfig();
                                    } else {
                                        ApmDelegate.this.f25013g.forceUpdateFromRemote(null, null);
                                    }
                                }
                            };
                            if (j2 <= 0) {
                                b.a.f25210a.a(r10);
                            } else {
                                b.a.f25210a.a(r10, j2 * 1000);
                            }
                            if (apmDelegate.f25017k) {
                                String a3 = b.a.f25049a.a("update_version_code");
                                String optString = com.bytedance.apm.c.f24690f.optString("update_version_code");
                                if (!TextUtils.equals(a3, optString)) {
                                    com.bytedance.apm.c.f24693i = 1;
                                    b.a.f25049a.a("update_version_code", optString);
                                } else {
                                    com.bytedance.apm.c.f24693i = 2;
                                }
                            }
                            if (apmDelegate.f25018l != null) {
                                Iterator<Object> it = apmDelegate.f25018l.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                            if (apmDelegate.f25018l != null) {
                                Iterator<Object> it2 = apmDelegate.f25018l.iterator();
                                while (it2.hasNext()) {
                                    it2.next();
                                }
                            }
                            if (apmDelegate.f25018l != null) {
                                Iterator<Object> it3 = apmDelegate.f25018l.iterator();
                                while (it3.hasNext()) {
                                    it3.next();
                                }
                            }
                            com.bytedance.apm.p.b bVar = b.a.f25210a;
                            ExecutorService executorService = apmDelegate.f25010d.y;
                            bVar.f25200a = executorService;
                            if (bVar.f25202e != null) {
                                bVar.f25202e.a(executorService);
                            }
                            com.bytedance.apm.config.c cVar2 = apmDelegate.f25010d;
                            List<String> list = cVar2.f24795b;
                            if (!com.bytedance.apm.q.h.a(list)) {
                                try {
                                    String host = new URL(list.get(0)).getHost();
                                    com.bytedance.apm.l.a.f25168a = "https://" + host + "/monitor/collect/c/logcollect";
                                    com.bytedance.apm.l.a.f25170c = host;
                                    com.bytedance.apm.l.a.a(host);
                                    com.bytedance.apm.a.a.a.f24350a = "https://" + host + "/monitor/collect/c/logcollect";
                                } catch (MalformedURLException unused3) {
                                }
                                com.bytedance.b.b.a.d.c cVar3 = c.a.f25941a;
                                if (!com.bytedance.b.k.f.a(list)) {
                                    cVar3.f25933f.clear();
                                    cVar3.f25933f.addAll(list);
                                }
                            }
                            com.bytedance.b.b.a.d.c cVar4 = c.a.f25941a;
                            List<String> list2 = com.bytedance.apm.b.a.f24426d;
                            if (!com.bytedance.b.k.f.a(list2)) {
                                cVar4.f25934g.clear();
                                cVar4.f25934g.addAll(list2);
                            }
                            c.a.f25941a.a(com.bytedance.apm.b.a.f24428f);
                            List<String> list3 = cVar2.f24796c;
                            c.a.f25941a.a(list3);
                            if (!com.bytedance.apm.q.h.a(list)) {
                                String str = list3.get(0);
                                if (!TextUtils.isEmpty(str)) {
                                    com.bytedance.c.a.a.a.c.f26674a = str;
                                }
                            }
                            apmDelegate.f25011e = apmDelegate.f25010d.v;
                            AutoLaunchTraceHelper.reportStats();
                            com.bytedance.news.common.service.manager.c.a(IHttpService.class, new IHttpService() {
                                /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass7 */

                                static {
                                    Covode.recordClassIndex(14623);
                                }

                                @Override // com.bytedance.services.apm.api.IHttpService
                                public com.bytedance.services.apm.api.c doGet(String str, Map<String, String> map) {
                                    return com.bytedance.apm.c.a(str, map);
                                }

                                @Override // com.bytedance.services.apm.api.IHttpService
                                public com.bytedance.services.apm.api.c doPost(String str, byte[] bArr, Map<String, String> map) {
                                    return com.bytedance.apm.c.f24692h.doPost(str, bArr, map);
                                }

                                @Override // com.bytedance.services.apm.api.IHttpService
                                public com.bytedance.services.apm.api.c uploadFiles(String str, List<File> list, Map<String, String> map) {
                                    return com.bytedance.apm.c.f24692h.uploadFiles(str, list, map);
                                }
                            });
                            if (com.bytedance.apm.c.e()) {
                                if (apmDelegate.f25017k) {
                                    b.a.f24903a.a("APM_START", (String) null);
                                } else {
                                    b.a.f24903a.a("APM_START_OTHER_PROCESS", (String) null);
                                }
                            }
                            if (apmDelegate.f25017k) {
                                com.bytedance.apm.c.f24689e = System.nanoTime() - nanoTime;
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("init", com.bytedance.apm.c.f24688d);
                                    jSONObject.put("start", com.bytedance.apm.c.f24689e);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("is_main_process", apmDelegate.f25017k);
                                    com.bytedance.apm.b.a("apm_cost", jSONObject2, jSONObject, (JSONObject) null);
                                } catch (JSONException unused4) {
                                }
                            }
                        } catch (Throwable unused5) {
                        }
                    }
                });
            }
            if (c.f24687c) {
                com.bytedance.apm.p.c.a().a(new Runnable() {
                    /* class com.bytedance.apm.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(14297);
                    }

                    public final void run() {
                        b.a("Apm#start", "Apm start");
                    }
                });
            }
        } else {
            throw new IllegalArgumentException("startConfig must not be allowed");
        }
    }
}
