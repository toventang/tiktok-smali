package com.airbnb.lottie.b;

import android.os.Handler;
import android.util.DisplayMetrics;
import com.airbnb.lottie.e.c.b;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final g f5299a;

    /* renamed from: b  reason: collision with root package name */
    public DisplayMetrics f5300b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f5301c;

    /* renamed from: d  reason: collision with root package name */
    public Float f5302d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f5303e = new Runnable() {
        /* class com.airbnb.lottie.b.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(2231);
        }

        public final void run() {
            MethodCollector.i(5293);
            if (a.this.f5301c != null) {
                a.this.f5301c.removeCallbacks(a.this.f5303e);
            }
            Float f2 = a.this.f5302d;
            b bVar = a.this.f5299a.f5566m;
            if (f2 == null || bVar == null) {
                MethodCollector.o(5293);
                return;
            }
            synchronized (a.this.f5299a.s) {
                try {
                    bVar.a(f2.floatValue());
                    try {
                        if (a.this.f5299a.m()) {
                            boolean a2 = com.airbnb.lottie.c.b.a(a.this.f5299a, a.this.f5300b);
                            g gVar = a.this.f5299a;
                            if (com.airbnb.lottie.g.b.f5616c) {
                                if (!(gVar == null || gVar.o == null)) {
                                    gVar.o.b(a2);
                                }
                                if (com.airbnb.lottie.g.b.f5614a != null) {
                                    com.airbnb.lottie.g.b.f5614a.b(a2);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    MethodCollector.o(5293);
                }
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private Runnable f5304f = new Runnable() {
        /* class com.airbnb.lottie.b.a.AnonymousClass3 */

        static {
            Covode.recordClassIndex(2232);
        }

        public final void run() {
            com.airbnb.lottie.c.a.a(a.this.f5299a);
            g gVar = a.this.f5299a;
            l.c(gVar, "");
            com.airbnb.lottie.c.b.f5311a.remove(Integer.valueOf(gVar.hashCode()));
        }
    };

    static {
        Covode.recordClassIndex(2229);
    }

    public final void a() {
        Handler handler = this.f5301c;
        if (handler != null) {
            handler.post(this.f5304f);
        }
    }

    public final void b() {
        this.f5302d = null;
        Handler handler = this.f5301c;
        if (handler != null) {
            handler.removeCallbacks(this.f5303e);
        }
    }

    public a(g gVar, DisplayMetrics displayMetrics) {
        this.f5299a = gVar;
        this.f5300b = displayMetrics;
    }
}
