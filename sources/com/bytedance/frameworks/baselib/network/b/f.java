package com.bytedance.frameworks.baselib.network.b;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.b.c;
import com.bytedance.frameworks.baselib.network.b.g;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f28868a = true;

    /* renamed from: b  reason: collision with root package name */
    private static volatile g f28869b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile f f28870c;

    public f() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(16966);
    }

    public static synchronized g a() {
        g gVar;
        synchronized (f.class) {
            MethodCollector.i(1627);
            if (f28869b == null) {
                g.a d2 = new g.a().a().b().c().e().d();
                d2.f28890j = true;
                f28869b = d2.f();
            }
            gVar = f28869b;
            MethodCollector.o(1627);
        }
        return gVar;
    }

    public static f b() {
        MethodCollector.i(1629);
        if (f28870c == null) {
            synchronized (f.class) {
                try {
                    if (f28870c == null) {
                        f28870c = new f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1629);
                    throw th;
                }
            }
        }
        f fVar = f28870c;
        MethodCollector.o(1629);
        return fVar;
    }

    public static synchronized void a(boolean z) {
        synchronized (f.class) {
            MethodCollector.i(1621);
            f28868a = z;
            if (f28869b != null) {
                f28869b.f28880j = f28868a;
            }
            MethodCollector.o(1621);
        }
    }

    private f(byte b2) {
        if (f28869b == null) {
            g.a d2 = new g.a().a().b().c().e().d();
            d2.f28890j = true;
            f28869b = d2.f();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.b.d
    public final synchronized void a(b bVar) {
        MethodCollector.i(1637);
        e eVar = e.f28860c;
        if (bVar.c()) {
            MethodCollector.o(1637);
            return;
        }
        bVar.a(e.f28859b.incrementAndGet());
        if (bVar.a() == c.a.IMMEDIATE) {
            eVar.a().execute(bVar);
            MethodCollector.o(1637);
            return;
        }
        long j2 = (long) bVar.f28856e;
        if (j2 > 0) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = bVar;
            eVar.f28861a.sendMessageDelayed(obtain, j2);
            MethodCollector.o(1637);
            return;
        }
        eVar.c().execute(bVar);
        MethodCollector.o(1637);
    }

    @Override // com.bytedance.frameworks.baselib.network.b.d
    public final synchronized void b(b bVar) {
        MethodCollector.i(1640);
        e eVar = e.f28860c;
        if (bVar.c()) {
            MethodCollector.o(1640);
            return;
        }
        bVar.a(e.f28859b.incrementAndGet());
        if (bVar.a() == c.a.IMMEDIATE) {
            eVar.a().execute(bVar);
            MethodCollector.o(1640);
            return;
        }
        long j2 = (long) bVar.f28856e;
        if (j2 > 0) {
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = bVar;
            eVar.f28861a.sendMessageDelayed(obtain, j2);
            MethodCollector.o(1640);
            return;
        }
        eVar.b().execute(bVar);
        MethodCollector.o(1640);
    }
}
