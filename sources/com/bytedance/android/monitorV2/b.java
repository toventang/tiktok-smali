package com.bytedance.android.monitorV2;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.monitorV2.a.e;
import com.bytedance.android.monitorV2.a.g;
import com.bytedance.android.monitorV2.d.d;
import com.bytedance.android.monitorV2.f.a;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.android.monitorV2.l.k;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class b implements e {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f23825b = new HashSet(Arrays.asList("jsbError", "fetchError", "nativeError", "jsbPerf", "custom"));

    /* renamed from: c  reason: collision with root package name */
    private static AtomicInteger f23826c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    private static com.bytedance.android.monitorV2.webview.b f23827d;

    /* renamed from: e  reason: collision with root package name */
    private static JSONObject f23828e = new JSONObject();

    /* renamed from: f  reason: collision with root package name */
    private static String f23829f = "";

    /* renamed from: g  reason: collision with root package name */
    private static String f23830g = "";

    /* renamed from: a  reason: collision with root package name */
    protected com.bytedance.android.monitorV2.webview.b f23831a;

    static {
        Covode.recordClassIndex(14106);
    }

    public b(com.bytedance.android.monitorV2.webview.b bVar) {
        this.f23831a = bVar;
    }

    private static String a(String str) {
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500);
    }

    private static boolean b(String str) {
        if ("jsbPerf".equals(str) || "custom".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.monitorV2.a.e
    public final void a(final g gVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            a.a().submit(new Runnable() {
                /* class com.bytedance.android.monitorV2.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14107);
                }

                public final void run() {
                    b.a(gVar, b.this.f23831a);
                }
            });
        } else {
            a(gVar, this.f23831a);
        }
    }

    public static void a(d dVar) {
        com.bytedance.android.monitorV2.i.b.b("DataMonitor", "monitorCustom: ".concat(String.valueOf(dVar)));
        if (dVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (dVar.f23850d != null) {
                f.a(jSONObject, "client_category", dVar.f23850d);
            }
            if (dVar.f23851e != null) {
                f.a(jSONObject, "client_metric", dVar.f23851e);
            }
            if (dVar.f23852f != null) {
                f.a(dVar.f23852f, "event_name", dVar.f23849c);
                f.a(dVar.f23852f, "sdk_version", "1.2.0-alpha.4");
                f.a(jSONObject, "client_extra", dVar.f23852f);
            }
            if (dVar.f23854h != null) {
                f.a(jSONObject, "client_timing", dVar.f23854h);
            }
            if (dVar.f23856j != null) {
                f.a(jSONObject, "nativeBase", dVar.f23856j);
            }
            if (dVar.f23857k != null) {
                f.a(jSONObject, "containerBase", dVar.f23857k);
            }
            if (dVar.f23858l != null) {
                f.a(jSONObject, "jsBase", dVar.f23858l);
            }
            f.a(jSONObject, "bid_info", dVar.f23853g);
            String str = dVar.f23847a;
            f.a(jSONObject, "url", str);
            if (str != null) {
                f.a(jSONObject, "host", k.b(str));
                f.a(jSONObject, "path", k.a(str));
            }
            f.a(jSONObject, "ev_type", "custom");
            f.a(jSONObject, dVar.f23855i);
            if (!TextUtils.isEmpty(dVar.f23859m)) {
                f.a(jSONObject, "virtual_aid", dVar.f23859m);
            }
            a(dVar.o, jSONObject, "custom");
        }
    }

    private static boolean a(JSONObject jSONObject, String str) {
        try {
            JSONObject d2 = f.d(jSONObject, "extra");
            String c2 = f.c(d2, "virtual_aid");
            if (TextUtils.isEmpty(c2)) {
                c2 = f.c(f.d(d2, "nativeBase"), "virtual_aid");
            }
            if (TextUtils.isEmpty(c2)) {
                c2 = "default";
            }
            c a2 = c.a();
            if (!TextUtils.isEmpty(c2)) {
                if (!TextUtils.isEmpty(str)) {
                    Set<String> set = a2.f23838a.get(c2);
                    if (set != null) {
                        if (!set.contains("all")) {
                            if (!set.contains(str)) {
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return true;
        }
    }

    public static void a(g gVar, com.bytedance.android.monitorV2.webview.b bVar) {
        if (gVar == null) {
            throw new NullPointerException("data should not be null");
        } else if (bVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                f.a(jSONObject, "event_type", gVar.h());
                if (gVar.b() != null) {
                    f.a(jSONObject, "nativeBase", gVar.b().a());
                }
                if (gVar.e() != null) {
                    f.a(jSONObject, "nativeInfo", gVar.e().a());
                }
                if (gVar.c() != null) {
                    f.a(jSONObject, "jsInfo", gVar.c());
                }
                if (gVar.d() != null) {
                    f.a(jSONObject, "jsBase", gVar.d());
                }
                if (gVar.g() != null) {
                    f.a(jSONObject, "containerBase", gVar.g().a());
                }
                if (gVar.f() != null) {
                    f.a(jSONObject, "containerInfo", gVar.f().a());
                }
                a(bVar, jSONObject, gVar.h(), gVar.i());
            } catch (Throwable unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        } else {
            throw new NullPointerException("monitor should not be null");
        }
    }

    private static void a(com.bytedance.android.monitorV2.webview.b bVar, JSONObject jSONObject, String str) {
        if (bVar != null) {
            try {
                a(bVar, jSONObject, str, "");
            } catch (Throwable th) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
                com.bytedance.android.monitorV2.i.b.c("DataMonitor", "monitorCustom error: " + th.getMessage());
            }
        } else {
            throw new NullPointerException("monitor should not be null");
        }
    }

    private static void c(com.bytedance.android.monitorV2.webview.b bVar, JSONObject jSONObject, String str, String str2) {
        f23827d = bVar;
        f23828e = jSONObject;
        f23830g = str;
        f23829f = str2;
    }

    private static void b(com.bytedance.android.monitorV2.webview.b bVar, JSONObject jSONObject, String str, String str2) {
        c(bVar, jSONObject, str, str2);
        JSONObject jSONObject2 = new JSONObject();
        f.a(jSONObject2, "extra", jSONObject);
        HybridMultiMonitor.getInstance().notifyReportInterceptor("bd_hybrid_monitor_service_all_in_one", str, str2, jSONObject2);
        if (bVar != null && a(jSONObject2, "bd_hybrid_monitor_service_all_in_one")) {
            bVar.a("bd_hybrid_monitor_service_all_in_one", jSONObject2);
            if (!b(str)) {
                com.bytedance.android.monitorV2.i.b.b("DataMonitor", bVar.hashCode() + com.a.a(" do report: event:%s container:%s data:%s", new Object[]{str, str2, a(jSONObject2.toString())}));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        if (r21.toString().equals(r0.toString()) != false) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.bytedance.android.monitorV2.webview.b r20, org.json.JSONObject r21, java.lang.String r22, java.lang.String r23) {
        /*
        // Method dump skipped, instructions count: 511
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.b.a(com.bytedance.android.monitorV2.webview.b, org.json.JSONObject, java.lang.String, java.lang.String):void");
    }
}
