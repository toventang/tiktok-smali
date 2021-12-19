package com.ss.android.ugc.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Queue;

public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public static int f148505a = 10;

    /* renamed from: d  reason: collision with root package name */
    private static volatile g f148506d;

    /* renamed from: b  reason: collision with root package name */
    public c f148507b;

    /* renamed from: c  reason: collision with root package name */
    public c f148508c;

    public interface a {
        static {
            Covode.recordClassIndex(97899);
        }

        double a(Queue<i> queue, i[] iVarArr);

        double b(Queue<i> queue, i[] iVarArr);
    }

    @Override // com.ss.android.ugc.h.c
    public final double a() {
        return this.f148508c.a();
    }

    @Override // com.ss.android.ugc.h.c
    public final i[] b() {
        return this.f148508c.b();
    }

    @Override // com.ss.android.ugc.h.c
    public final void c() {
        this.f148508c.c();
    }

    @Override // com.ss.android.ugc.h.d
    public final double d() {
        return this.f148508c.d();
    }

    static {
        Covode.recordClassIndex(97898);
    }

    private g() {
        h hVar = new h();
        this.f148507b = hVar;
        this.f148508c = hVar;
    }

    public static int f() {
        double d2 = e().d();
        if (d2 == -1.0d) {
            return -1;
        }
        return (int) ((d2 / 8.0d) / 1000.0d);
    }

    public static g e() {
        MethodCollector.i(3292);
        if (f148506d == null) {
            synchronized (g.class) {
                try {
                    if (f148506d == null) {
                        f148506d = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3292);
                    throw th;
                }
            }
        }
        g gVar = f148506d;
        MethodCollector.o(3292);
        return gVar;
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(double d2) {
        this.f148508c.a(d2);
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(int i2) {
        this.f148508c.a(i2);
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(a aVar) {
        this.f148508c.a(aVar);
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(double d2, double d3, long j2) {
        this.f148508c.a(d2, d3, j2);
    }
}
