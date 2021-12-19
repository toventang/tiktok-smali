package com.bytedance.sdk.a.j.a;

import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.a.j.a.e;
import java.lang.Thread;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f43362a = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private static volatile f f43363c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f43364d = true;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f43365b;

    /* renamed from: e  reason: collision with root package name */
    private int f43366e;

    /* renamed from: f  reason: collision with root package name */
    private int f43367f;

    /* renamed from: g  reason: collision with root package name */
    private final PriorityBlockingQueue<e> f43368g;

    /* renamed from: h  reason: collision with root package name */
    private final PriorityBlockingQueue<e> f43369h;

    /* renamed from: i  reason: collision with root package name */
    private final PriorityBlockingQueue<e> f43370i;

    /* renamed from: j  reason: collision with root package name */
    private a[] f43371j;

    /* renamed from: k  reason: collision with root package name */
    private d[] f43372k;

    /* renamed from: l  reason: collision with root package name */
    private b f43373l;

    /* renamed from: m  reason: collision with root package name */
    private volatile long f43374m;
    private volatile long n;
    private volatile long o;
    private volatile long p;

    public f() {
        this(4, true);
    }

    static {
        Covode.recordClassIndex(26572);
    }

    public static f a() {
        MethodCollector.i(13208);
        if (f43363c == null) {
            synchronized (f.class) {
                try {
                    if (f43363c == null) {
                        f43363c = new f((byte) 0);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13208);
                    throw th;
                }
            }
        }
        f fVar = f43363c;
        MethodCollector.o(13208);
        return fVar;
    }

    private synchronized void f() {
        MethodCollector.i(10318);
        g();
        b bVar = new b(this.f43368g, this.f43369h);
        this.f43373l = bVar;
        bVar.start();
        for (int i2 = 0; i2 < this.f43366e; i2++) {
            a aVar = new a(this.f43369h, "Account-ApiDispatcher-Thread", "ApiDispatcher");
            this.f43371j[i2] = aVar;
            aVar.start();
        }
        if (this.f43372k != null) {
            for (int i3 = 0; i3 < this.f43367f; i3++) {
                d dVar = new d(this.f43370i, "Account-DownloadDispatcher-Thread", "DownloadDispatcher");
                this.f43372k[i3] = dVar;
                dVar.start();
            }
        }
        this.f43365b = true;
        MethodCollector.o(10318);
    }

    private synchronized void g() {
        MethodCollector.i(10319);
        int i2 = 0;
        this.f43365b = false;
        b bVar = this.f43373l;
        if (bVar != null) {
            bVar.f43351a = true;
            bVar.interrupt();
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.f43371j;
            if (i3 >= aVarArr.length) {
                break;
            }
            if (aVarArr[i3] != null) {
                aVarArr[i3].a();
                this.f43371j[i3] = null;
            }
            i3++;
        }
        if (this.f43372k != null) {
            while (true) {
                d[] dVarArr = this.f43372k;
                if (i2 >= dVarArr.length) {
                    break;
                }
                if (dVarArr[i2] != null) {
                    dVarArr[i2].a();
                    this.f43372k[i2] = null;
                }
                i2++;
            }
        }
        MethodCollector.o(10319);
    }

    public final synchronized void b() {
        MethodCollector.i(10469);
        try {
            if (!f43364d) {
                MethodCollector.o(10469);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f43374m > currentTimeMillis) {
                this.f43374m = currentTimeMillis;
            }
            if (currentTimeMillis - this.f43374m <= 1000) {
                MethodCollector.o(10469);
                return;
            }
            this.f43374m = currentTimeMillis;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                a[] aVarArr = this.f43371j;
                if (i2 >= aVarArr.length) {
                    break;
                }
                if (aVarArr[i2] == null) {
                    i3++;
                    if (i3 > this.f43366e) {
                        break;
                    }
                    a aVar = new a(this.f43369h, "Account-ApiDispatcher-Thread", "ApiDispatcher");
                    this.f43371j[i2] = aVar;
                    aVar.start();
                }
                i2++;
            }
            MethodCollector.o(10469);
        } catch (Throwable unused) {
            MethodCollector.o(10469);
        }
    }

    public final synchronized void c() {
        MethodCollector.i(10626);
        try {
            if (!f43364d) {
                MethodCollector.o(10626);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.n > currentTimeMillis) {
                this.n = currentTimeMillis;
            }
            if (currentTimeMillis - this.n <= 1000) {
                MethodCollector.o(10626);
                return;
            }
            this.n = currentTimeMillis;
            if (this.f43372k == null) {
                MethodCollector.o(10626);
                return;
            }
            int i2 = 0;
            int i3 = 0;
            while (true) {
                d[] dVarArr = this.f43372k;
                if (i2 >= dVarArr.length) {
                    break;
                }
                if (dVarArr[i2] == null) {
                    i3++;
                    if (i3 > this.f43367f) {
                        break;
                    }
                    d dVar = new d(this.f43370i, "Account-DownloadDispatcher-Thread", "DownloadDispatcher");
                    this.f43372k[i2] = dVar;
                    dVar.start();
                }
                i2++;
            }
            MethodCollector.o(10626);
        } catch (Throwable unused) {
            MethodCollector.o(10626);
        }
    }

    public final synchronized void d() {
        MethodCollector.i(10774);
        try {
            if (!f43364d) {
                MethodCollector.o(10774);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.o > currentTimeMillis) {
                this.o = currentTimeMillis;
            }
            if (currentTimeMillis - this.o <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                MethodCollector.o(10774);
                return;
            }
            boolean z = true;
            boolean z2 = true;
            for (int length = this.f43371j.length - 1; length >= this.f43366e; length--) {
                a aVar = this.f43371j[length];
                if (aVar != null) {
                    if (aVar.b()) {
                        z = false;
                    }
                    z2 = false;
                }
            }
            this.o = currentTimeMillis;
            if (!z || z2) {
                MethodCollector.o(10774);
                return;
            }
            for (int length2 = this.f43371j.length - 1; length2 >= this.f43366e; length2--) {
                try {
                    a aVar2 = this.f43371j[length2];
                    if (!(aVar2 == null || aVar2.getState() == Thread.State.RUNNABLE || aVar2.b())) {
                        aVar2.a();
                        this.f43371j[length2] = null;
                    }
                } catch (Throwable unused) {
                }
            }
            MethodCollector.o(10774);
        } catch (Throwable unused2) {
            MethodCollector.o(10774);
        }
    }

    public final synchronized void e() {
        MethodCollector.i(10934);
        try {
            if (!f43364d) {
                MethodCollector.o(10934);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.p > currentTimeMillis) {
                this.p = currentTimeMillis;
            }
            if (currentTimeMillis - this.p <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                MethodCollector.o(10934);
                return;
            }
            d[] dVarArr = this.f43372k;
            if (dVarArr == null) {
                MethodCollector.o(10934);
                return;
            }
            boolean z = true;
            boolean z2 = true;
            for (int length = dVarArr.length - 1; length >= this.f43367f; length--) {
                d dVar = this.f43372k[length];
                if (dVar != null) {
                    if (dVar.b()) {
                        z = false;
                    }
                    z2 = false;
                }
            }
            this.p = currentTimeMillis;
            if (!z || z2) {
                MethodCollector.o(10934);
                return;
            }
            for (int length2 = this.f43372k.length - 1; length2 >= this.f43367f; length2--) {
                try {
                    d dVar2 = this.f43372k[length2];
                    if (!(dVar2 == null || dVar2.getState() == Thread.State.RUNNABLE || dVar2.b())) {
                        dVar2.a();
                        this.f43372k[length2] = null;
                    }
                } catch (Throwable unused) {
                }
            }
            MethodCollector.o(10934);
        } catch (Throwable unused2) {
            MethodCollector.o(10934);
        }
    }

    private f(byte b2) {
        this(0, false);
    }

    public final synchronized void a(c cVar) {
        MethodCollector.i(13282);
        cVar.f43358d = f43362a.incrementAndGet();
        if (!this.f43365b) {
            f();
        }
        if (cVar.d() == e.a.IMMEDIATE) {
            com.bytedance.common.utility.b.e.a(cVar);
            MethodCollector.o(13282);
            return;
        }
        cVar.f();
        this.f43369h.add(cVar);
        MethodCollector.o(13282);
    }

    private f(int i2, boolean z) {
        this.f43368g = new PriorityBlockingQueue<>();
        this.f43369h = new PriorityBlockingQueue<>();
        this.f43370i = new PriorityBlockingQueue<>();
        this.f43374m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.f43366e = 4;
        this.f43371j = new a[16];
        if (z) {
            this.f43367f = i2;
            this.f43372k = new d[(i2 * 4)];
        }
    }
}
