package com.bytedance.crash.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.entity.g;
import com.bytedance.crash.j.e;
import com.bytedance.crash.k;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.p;
import com.bytedance.crash.util.v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.List;
import java.util.Map;

public class a {

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f27406e;

    /* renamed from: a  reason: collision with root package name */
    public volatile String f27407a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f27408b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f27409c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f27410d;

    static {
        Covode.recordClassIndex(16134);
    }

    private a() {
    }

    public final boolean b() {
        if (this.f27407a != null || (k.f27721c != null && k.f27721c.a())) {
            return true;
        }
        return false;
    }

    public static a a() {
        MethodCollector.i(10770);
        if (f27406e == null) {
            synchronized (a.class) {
                try {
                    if (f27406e == null) {
                        f27406e = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10770);
                    throw th;
                }
            }
        }
        a aVar = f27406e;
        MethodCollector.o(10770);
        return aVar;
    }

    public final void c() {
        if (k.f27719a != null) {
            v.a("npth", "use AlogApi: flushAlogSync");
            try {
                if (k.f27719a != null) {
                    k.f27719a.run();
                }
            } catch (Throwable unused) {
            }
        } else if (this.f27408b != null) {
            try {
                this.f27408b.a();
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
        }
    }

    public static String a(List<String> list, String str) {
        String str2;
        v.a("npth", "upload alog " + str + ": " + list);
        try {
            g gVar = new g();
            Map<String, Object> a2 = m.a().a();
            if (a2 != null) {
                gVar.f27582f = String.valueOf(a2.get("aid"));
            }
            gVar.f27581e = m.b().a();
            gVar.f27583g = str;
            gVar.f27584h = list;
            if (TextUtils.isEmpty(gVar.f27582f)) {
                str2 = "no_aid";
            } else if (TextUtils.isEmpty(gVar.f27581e)) {
                str2 = "no_did";
            } else if (TextUtils.isEmpty(gVar.f27583g)) {
                str2 = "no_process";
            } else if (gVar.f27584h == null || gVar.f27584h.size() == 0) {
                str2 = "no_files";
            } else {
                str2 = "normal";
            }
            if (!str2.equals("normal")) {
                return str2;
            }
            e.a();
            return e.a(gVar.f27582f, gVar.f27581e, gVar.f27583g, gVar.f27584h) ? "unknown" : "unknown";
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
        }
    }

    public final List<String> a(long j2, String str) {
        boolean z;
        d dVar;
        if (k.f27720b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            v.a("npth", "use AlogApi: getAlogFiles");
            try {
                if (k.f27720b == null) {
                    return null;
                }
                return k.f27720b.a(j2, str);
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(this.f27407a) || !new File(this.f27407a).exists()) {
            return null;
        }
        String str2 = this.f27407a;
        if (this.f27409c instanceof b) {
            dVar = new b(str);
        } else {
            dVar = this.f27409c;
        }
        return a(str2, j2, str, dVar);
    }

    private static List<String> a(String str, long j2, String str2, d dVar) {
        if (TextUtils.isEmpty(str) || !new File(str).exists() || dVar == null) {
            return null;
        }
        List<String> a2 = dVar.a(str, j2);
        if (!a2.isEmpty() && str2 != null) {
            for (String str3 : a2) {
                v.a("collect alog: ", str3);
                p.a("collectAlog", str3);
            }
        }
        return a2;
    }
}
