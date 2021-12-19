package com.ss.videoarch.strategy.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.videoarch.strategy.b.d;
import java.util.concurrent.ThreadPoolExecutor;

public class c {

    /* renamed from: e  reason: collision with root package name */
    private static volatile c f154420e;

    /* renamed from: a  reason: collision with root package name */
    public final f f154421a = new f();

    /* renamed from: b  reason: collision with root package name */
    public a f154422b;

    /* renamed from: c  reason: collision with root package name */
    public e f154423c;

    /* renamed from: d  reason: collision with root package name */
    public ThreadPoolExecutor f154424d;

    /* renamed from: f  reason: collision with root package name */
    private d f154425f;

    static {
        Covode.recordClassIndex(102923);
    }

    public c() {
        a(new d.a().a());
    }

    public static c a() {
        MethodCollector.i(5911);
        if (f154420e == null) {
            synchronized (c.class) {
                try {
                    if (f154420e == null) {
                        f154420e = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5911);
                    throw th;
                }
            }
        }
        c cVar = f154420e;
        MethodCollector.o(5911);
        return cVar;
    }

    public final void a(d dVar) {
        if (dVar != null) {
            this.f154425f = dVar;
            this.f154422b = new a(this.f154425f);
            this.f154423c = new e(this.f154421a, this.f154422b);
            this.f154424d = dVar.f154429d;
        }
    }
}
