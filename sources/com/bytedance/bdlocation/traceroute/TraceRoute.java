package com.bytedance.bdlocation.traceroute;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.bdlocation.traceroute.c.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class TraceRoute {

    /* renamed from: d  reason: collision with root package name */
    private static TraceRoute f26345d;

    /* renamed from: a  reason: collision with root package name */
    public b f26346a;

    /* renamed from: b  reason: collision with root package name */
    public int f26347b = 64;

    /* renamed from: c  reason: collision with root package name */
    public int f26348c = 3;

    public native int execute(String[] strArr);

    static {
        Covode.recordClassIndex(15488);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("traceroute-lib", false, (Context) null);
        m.a(uptimeMillis, "traceroute-lib");
    }

    public static TraceRoute a() {
        MethodCollector.i(2053);
        if (f26345d == null) {
            synchronized (TraceRoute.class) {
                try {
                    if (f26345d == null) {
                        f26345d = new TraceRoute();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2053);
                    throw th;
                }
            }
        }
        TraceRoute traceRoute = f26345d;
        MethodCollector.o(2053);
        return traceRoute;
    }

    public void appendResult(String str) {
        b bVar = this.f26346a;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    public final synchronized void a(String str) {
        MethodCollector.i(1942);
        try {
            String[] strArr = {str, String.valueOf(this.f26348c), String.valueOf(this.f26347b)};
            c cVar = new c();
            cVar.f26357a = execute(strArr);
            if (cVar.f26357a == 0) {
                cVar.f26358b = "execute traceroute successed";
                this.f26346a.a(cVar);
                MethodCollector.o(1942);
                return;
            }
            cVar.f26358b = "execute traceroute failed.";
            this.f26346a.a(cVar.f26357a, cVar.f26358b);
            MethodCollector.o(1942);
        } catch (Exception unused) {
            b.e();
            MethodCollector.o(1942);
        }
    }
}
