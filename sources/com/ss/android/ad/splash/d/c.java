package com.ss.android.ad.splash.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.b.a;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.core.l;
import com.ss.android.ad.splash.f.j;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f58941a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f58942b;

    static {
        Covode.recordClassIndex(36461);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(1751);
        if (f58941a == null) {
            synchronized (c.class) {
                try {
                    if (f58941a == null) {
                        f58941a = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1751);
                    throw th;
                }
            }
        }
        c cVar = f58941a;
        MethodCollector.o(1751);
        return cVar;
    }

    public final void b() {
        if (h.ae && h.P && h.R != null && com.ss.android.ad.splash.f.h.b(h.r) && !this.f58942b) {
            this.f58942b = true;
            j.d();
            j.c();
            new l() {
                /* class com.ss.android.ad.splash.d.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36462);
                }

                @Override // com.ss.android.ad.splash.core.l
                public final void a() {
                }

                @Override // com.ss.android.ad.splash.core.l
                public final void b() {
                    a.a().a("service_real_time_request_result", 0, (JSONObject) null);
                }
            };
            this.f58942b = false;
        }
    }
}
