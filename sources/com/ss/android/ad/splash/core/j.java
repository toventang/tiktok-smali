package com.ss.android.ad.splash.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.b.b;
import com.ss.android.ad.splash.d.c;
import com.ss.android.ad.splash.r;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f58622a;

    static {
        Covode.recordClassIndex(36352);
    }

    private j() {
    }

    private static ExecutorService a() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    private static void a(long j2) {
        String str;
        com.ss.android.ad.splash.f.g.b("SDK init duration: ".concat(String.valueOf(j2)));
        JSONObject jSONObject = new JSONObject();
        try {
            if (h.ag) {
                str = "dur_use_file";
            } else {
                str = "dur_use_sp";
            }
            jSONObject.put(str, j2);
        } catch (Exception unused) {
        }
        com.ss.android.ad.splash.b.a.a().a("service_sdk_init_duration", jSONObject);
    }

    public static void a(Context context, r rVar) {
        MethodCollector.i(2512);
        if (!f58622a) {
            synchronized (j.class) {
                try {
                    if (!f58622a) {
                        long currentTimeMillis = System.currentTimeMillis();
                        b(a(context), rVar);
                        f58622a = true;
                        a(System.currentTimeMillis() - currentTimeMillis);
                    }
                } finally {
                    MethodCollector.o(2512);
                }
            }
            return;
        }
        MethodCollector.o(2512);
    }

    private static void b(Context context, r rVar) {
        ExecutorService a2;
        ExecutorService a3;
        ExecutorService a4;
        h.a(context);
        if (rVar != null) {
            h.a(rVar.n);
            h.at = w.a(rVar.r);
            h.p = rVar.f59037g;
            if (rVar.f59031a != null) {
                a2 = rVar.f59031a;
            } else {
                a2 = a();
            }
            h.f58577f = a2;
            if (rVar.f59032b != null) {
                a3 = rVar.f59032b;
            } else {
                a3 = a();
            }
            h.f58579h = a3;
            if (rVar.f59033c != null) {
                a4 = rVar.f59033c;
            } else {
                a4 = a();
            }
            h.f58580i = a4;
            com.ss.android.ad.splash.core.h.a.a().a(rVar.f59034d);
            h.P = rVar.f59035e;
            h.R = rVar.f59036f;
            h.U = rVar.f59038h;
            h.Y = rVar.f59039i;
            h.ad = rVar.f59040j;
            h.ae = rVar.f59041k;
            h.af = rVar.f59042l;
            h.ag = rVar.f59043m;
            if (rVar.o) {
                h.a(8);
            }
            h.ai = rVar.p;
            h.aj = rVar.q;
        } else {
            h.f58577f = a();
            h.f58579h = a();
            h.f58580i = a();
        }
        if (h.ae) {
            a.a();
            a.b();
            c.a().b();
            b.a().b();
        }
    }
}
