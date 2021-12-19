package com.ss.optimizer.live.sdk.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.optimizer.live.sdk.a.c;
import java.util.concurrent.ThreadPoolExecutor;

public class d {

    /* renamed from: f  reason: collision with root package name */
    private static volatile d f151667f;

    /* renamed from: a  reason: collision with root package name */
    public final f f151668a = new f();

    /* renamed from: b  reason: collision with root package name */
    public a f151669b;

    /* renamed from: c  reason: collision with root package name */
    public e f151670c;

    /* renamed from: d  reason: collision with root package name */
    public ThreadPoolExecutor f151671d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f151672e;

    /* renamed from: g  reason: collision with root package name */
    private c f151673g;

    static {
        Covode.recordClassIndex(101182);
    }

    public d() {
        a(new c.a().a());
    }

    public static d a() {
        MethodCollector.i(3652);
        if (f151667f == null) {
            synchronized (d.class) {
                try {
                    if (f151667f == null) {
                        f151667f = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3652);
                    throw th;
                }
            }
        }
        d dVar = f151667f;
        MethodCollector.o(3652);
        return dVar;
    }

    public final void a(c cVar) {
        if (cVar != null) {
            this.f151673g = cVar;
            this.f151669b = new a(this.f151673g);
            this.f151670c = new e(this.f151668a, this.f151669b, cVar.f151657h, cVar.f151658i);
            this.f151671d = cVar.f151654e;
            this.f151672e = cVar.f151655f;
        }
    }
}
