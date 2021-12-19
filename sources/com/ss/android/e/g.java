package com.ss.android.e;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.collection.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

public final class g implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static g f59497a = new g();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLong f59498c = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public long f59499b;

    /* renamed from: d  reason: collision with root package name */
    final Object f59500d = new Object();

    /* renamed from: e  reason: collision with root package name */
    int f59501e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f59502f = 0;

    /* renamed from: g  reason: collision with root package name */
    WeakReference<a> f59503g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicLong f59504h = new AtomicLong(0);

    /* renamed from: i  reason: collision with root package name */
    public boolean f59505i = false;

    /* renamed from: j  reason: collision with root package name */
    public WeakHandler f59506j = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: k  reason: collision with root package name */
    final d<Object> f59507k = new d<>();

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f59508l = new Runnable() {
        /* class com.ss.android.e.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(36738);
        }

        public final void run() {
            a aVar;
            MethodCollector.i(3461);
            g gVar = g.this;
            gVar.f59504h.get();
            g.f59498c.get();
            Iterator<Object> it = gVar.f59507k.iterator();
            while (it.hasNext()) {
                it.next();
            }
            synchronized (gVar.f59500d) {
                try {
                    if (gVar.f59501e != gVar.f59502f) {
                        gVar.f59502f = gVar.f59501e;
                        if (gVar.f59503g != null && (aVar = gVar.f59503g.get()) != null) {
                            new a(aVar).start();
                        } else {
                            return;
                        }
                    }
                    MethodCollector.o(3461);
                } finally {
                    MethodCollector.o(3461);
                }
            }
        }
    };

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    static {
        Covode.recordClassIndex(36737);
    }

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final a f59510a;

        static {
            Covode.recordClassIndex(36739);
        }

        public final void run() {
            System.currentTimeMillis();
            long d2 = a.d();
            System.currentTimeMillis();
            g.this.f59505i = true;
            g.this.f59504h.set(d2);
            g.f59498c.set(0);
            g.this.f59506j.post(g.this.f59508l);
        }

        public a(a aVar) {
            super("CacheSizeThread");
            this.f59510a = aVar;
        }
    }

    private g() {
    }

    public final int a(a aVar) {
        int i2;
        MethodCollector.i(3084);
        boolean z = false;
        if (aVar == null) {
            MethodCollector.o(3084);
            return 0;
        }
        synchronized (this.f59500d) {
            try {
                int i3 = this.f59501e;
                if (i3 > this.f59502f) {
                    z = true;
                }
                this.f59501e = i3 + 1;
                this.f59503g = new WeakReference<>(aVar);
                if (!z) {
                    this.f59502f = this.f59501e;
                    new a(aVar).start();
                }
                i2 = this.f59501e;
            } finally {
                MethodCollector.o(3084);
            }
        }
        return i2;
    }
}
