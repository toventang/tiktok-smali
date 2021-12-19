package com.ss.android.common.applog;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.LinkedList;

public class t extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    private static volatile t f59335a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f59336b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f59337c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f59338d = false;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedList<Runnable> f59339e = new LinkedList<>();

    static {
        Covode.recordClassIndex(36638);
    }

    private t() {
        super("TeaThread");
    }

    public static t a() {
        MethodCollector.i(6249);
        if (f59335a == null) {
            synchronized (t.class) {
                try {
                    if (f59335a == null) {
                        t tVar = new t();
                        f59335a = tVar;
                        tVar.start();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6249);
                    throw th;
                }
            }
        }
        t tVar2 = f59335a;
        MethodCollector.o(6249);
        return tVar2;
    }

    private Handler b() {
        MethodCollector.i(6283);
        if (this.f59336b == null) {
            synchronized (this) {
                try {
                    if (this.f59336b == null) {
                        this.f59336b = new Handler(getLooper());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6283);
                    throw th;
                }
            }
        }
        Handler handler = this.f59336b;
        MethodCollector.o(6283);
        return handler;
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        MethodCollector.i(6255);
        super.onLooperPrepared();
        synchronized (this.f59337c) {
            try {
                this.f59338d = true;
                ArrayList<Runnable> arrayList = new ArrayList(this.f59339e);
                this.f59339e.clear();
                if (!arrayList.isEmpty()) {
                    for (Runnable runnable : arrayList) {
                        b(runnable);
                    }
                }
            } finally {
                MethodCollector.o(6255);
            }
        }
    }

    public final void c(Runnable runnable) {
        b().removeCallbacks(runnable);
    }

    public final void b(Runnable runnable) {
        if (runnable != null) {
            b().post(runnable);
        }
    }

    public final void a(Runnable runnable) {
        MethodCollector.i(6260);
        if (this.f59338d) {
            b(runnable, 0);
            MethodCollector.o(6260);
            return;
        }
        synchronized (this.f59337c) {
            try {
                if (this.f59338d) {
                    b(runnable, 0);
                } else {
                    if (this.f59339e.size() > 1000) {
                        this.f59339e.poll();
                    }
                    this.f59339e.add(runnable);
                }
            } finally {
                MethodCollector.o(6260);
            }
        }
    }

    public final void a(Runnable runnable, long j2) {
        if (runnable != null) {
            c(runnable);
            b(runnable, j2);
        }
    }

    public final void b(Runnable runnable, long j2) {
        if (runnable != null) {
            b().postDelayed(runnable, j2);
        }
    }
}
