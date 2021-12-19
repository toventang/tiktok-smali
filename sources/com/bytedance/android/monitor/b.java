package com.bytedance.android.monitor;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.monitor.b.e;
import com.bytedance.android.monitor.b.g;
import com.bytedance.android.monitor.d.c;
import com.bytedance.android.monitor.l.d;
import com.bytedance.android.monitor.l.j;
import com.bytedance.android.monitor.webview.a;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import org.json.JSONObject;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    protected a f23420a;

    static {
        Covode.recordClassIndex(13934);
    }

    public b(a aVar) {
        this.f23420a = aVar;
    }

    private static boolean a(String str) {
        if ("jsbPerf".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.monitor.b.e
    public final void a(final g gVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            com.bytedance.android.monitor.f.a.a().submit(new Runnable() {
                /* class com.bytedance.android.monitor.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(13935);
                }

                public final void run() {
                    b.a(gVar, b.this.f23420a);
                }
            });
        } else {
            a(gVar, this.f23420a);
        }
    }

    public static void a(c cVar) {
        String str;
        com.bytedance.android.monitor.h.b.b("DataMonitor", "monitorCustom: ".concat(String.valueOf(cVar)));
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (cVar.f23433d != null) {
                d.a(jSONObject, "client_category", cVar.f23433d);
            }
            if (cVar.f23434e != null) {
                d.a(jSONObject, "client_metric", cVar.f23434e);
            }
            if (cVar.f23435f != null) {
                d.a(cVar.f23435f, "event_name", cVar.f23432c);
                d.a(jSONObject, "client_extra", cVar.f23435f);
            }
            if (cVar.f23436g != null) {
                d.a(jSONObject, "client_timing", cVar.f23436g);
            }
            if (cVar.f23439j) {
                str = "samplecustom";
            } else {
                str = "newcustom";
            }
            String str2 = cVar.f23430a;
            d.a(jSONObject, "url", str2);
            if (str2 != null) {
                d.a(jSONObject, "host", j.b(str2));
                d.a(jSONObject, "path", j.a(str2));
            }
            d.a(jSONObject, "ev_type", "custom");
            d.a(jSONObject, cVar.f23437h);
            if (!TextUtils.isEmpty(cVar.f23438i)) {
                d.a(jSONObject, "virtual_aid", cVar.f23438i);
            }
            a(cVar.f23440k, jSONObject, str, cVar.f23431b);
        }
    }

    public static void a(g gVar, a aVar) {
        boolean z;
        if (gVar == null) {
            throw new NullPointerException("data should not be null");
        } else if (aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                d.a(jSONObject, "event_type", gVar.h());
                if (gVar.b() != null) {
                    d.a(jSONObject, "nativeBase", gVar.b().a());
                }
                if (gVar.e() != null) {
                    d.a(jSONObject, "nativeInfo", gVar.e().a());
                }
                if (gVar.c() != null) {
                    d.a(jSONObject, "jsInfo", gVar.c());
                }
                if (gVar.d() != null) {
                    d.a(jSONObject, "jsBase", gVar.d());
                }
                if (gVar.g() != null) {
                    d.a(jSONObject, "containerBase", gVar.g().a());
                }
                if (gVar.f() != null) {
                    d.a(jSONObject, "containerInfo", gVar.f().a());
                }
                if (!a(gVar.h())) {
                    z = true;
                } else {
                    z = false;
                }
                a(aVar, jSONObject, gVar.h(), gVar.i(), gVar.j(), z);
            } catch (Throwable unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        } else {
            throw new NullPointerException("monitor should not be null");
        }
    }

    private static boolean a(JSONObject jSONObject, String str) {
        String str2 = null;
        if (str != null) {
            try {
                JSONObject c2 = d.c(jSONObject, "extra");
                str2 = d.b(c2, "virtual_aid");
                if (TextUtils.isEmpty(str2)) {
                    str2 = d.b(d.c(c2, "nativeBase"), "virtual_aid");
                }
            } catch (Throwable unused) {
                HybridMonitor.getInstance().getExceptionHandler();
                return true;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        c a2 = c.a();
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str)) {
                Set<String> set = a2.f23425a.get(str2);
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
    }

    private static void a(a aVar, JSONObject jSONObject, String str, String str2) {
        if (aVar != null) {
            try {
                a(aVar, jSONObject, str, "", str2, false);
            } catch (Throwable th) {
                HybridMonitor.getInstance().getExceptionHandler();
                com.bytedance.android.monitor.h.b.c("DataMonitor", "monitorCustom error: " + th.getMessage());
            }
        } else {
            throw new NullPointerException("monitor should not be null");
        }
    }

    private static void a(a aVar, JSONObject jSONObject, String str, String str2, String str3, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        d.a(jSONObject2, "extra", jSONObject);
        String a2 = com.bytedance.android.monitor.l.e.a(str, str2, str3);
        HybridMonitor.getInstance().notifyReportInterceptor(a2, str, str2, jSONObject2);
        if (aVar != null && a(jSONObject2, a2)) {
            aVar.a(a2, 0, null, jSONObject2);
            com.bytedance.android.monitor.h.b.b("DataMonitor", aVar + " do report: " + a2);
        }
        if (z) {
            com.bytedance.android.monitor.h.b.b("BDHybridMonitor", com.a.a("service:%s,data:%s", new Object[]{a2, jSONObject2}));
        }
    }
}
