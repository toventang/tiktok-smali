package com.facebook.fresco.animation.b.b;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.fresco.animation.b.b;
import com.facebook.imagepipeline.c.f;
import java.util.concurrent.ExecutorService;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f47539a = c.class;

    /* renamed from: b  reason: collision with root package name */
    public final f f47540b;

    /* renamed from: c  reason: collision with root package name */
    public final com.facebook.fresco.animation.b.c f47541c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap.Config f47542d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<Runnable> f47543e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private final ExecutorService f47544f;

    static {
        Covode.recordClassIndex(28835);
    }

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final b f47546b;

        /* renamed from: c  reason: collision with root package name */
        private final com.facebook.fresco.animation.a.a f47547c;

        /* renamed from: d  reason: collision with root package name */
        private final int f47548d;

        /* renamed from: e  reason: collision with root package name */
        private final int f47549e;

        static {
            Covode.recordClassIndex(28836);
        }

        public final void run() {
            MethodCollector.i(11750);
            try {
                if (this.f47546b.b(this.f47548d)) {
                    com.facebook.common.e.a.a(c.f47539a, "Frame %d is cached already.", Integer.valueOf(this.f47548d));
                    synchronized (c.this.f47543e) {
                        try {
                            c.this.f47543e.remove(this.f47549e);
                        } finally {
                            MethodCollector.o(11750);
                        }
                    }
                    return;
                }
                if (a(this.f47548d, 1)) {
                    com.facebook.common.e.a.a(c.f47539a, "Prepared frame frame %d.", Integer.valueOf(this.f47548d));
                } else {
                    com.facebook.common.e.a.c(c.f47539a, "Could not prepare frame %d.", Integer.valueOf(this.f47548d));
                }
                synchronized (c.this.f47543e) {
                    try {
                        c.this.f47543e.remove(this.f47549e);
                    } finally {
                        MethodCollector.o(11750);
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(11750);
                throw th;
            }
        }

        private boolean a(int i2, int i3) {
            char c2;
            boolean a2;
            while (true) {
                com.facebook.common.h.a<Bitmap> aVar = null;
                if (i3 != 1) {
                    try {
                        aVar = c.this.f47540b.a(this.f47547c.b(), this.f47547c.c(), c.this.f47542d);
                        c2 = 65535;
                    } catch (RuntimeException e2) {
                        com.facebook.common.e.a.a(c.f47539a, "Failed to create frame bitmap", (Throwable) e2);
                        com.facebook.common.h.a.c(aVar);
                        return false;
                    }
                } else {
                    try {
                        b bVar = this.f47546b;
                        this.f47547c.b();
                        this.f47547c.c();
                        aVar = bVar.b();
                        c2 = 2;
                    } catch (Throwable th) {
                        com.facebook.common.h.a.c(null);
                        throw th;
                    }
                }
                a2 = a(i2, aVar);
                com.facebook.common.h.a.c(aVar);
                if (a2 || c2 == 65535) {
                    return a2;
                }
                i3 = 2;
            }
            return a2;
        }

        private boolean a(int i2, com.facebook.common.h.a<Bitmap> aVar) {
            MethodCollector.i(11916);
            if (!com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar)) {
                MethodCollector.o(11916);
                return false;
            } else if (!c.this.f47541c.a(i2, aVar.a())) {
                MethodCollector.o(11916);
                return false;
            } else {
                com.facebook.common.e.a.a(c.f47539a, "Frame %d ready.", Integer.valueOf(this.f47548d));
                synchronized (c.this.f47543e) {
                    try {
                        this.f47546b.b(this.f47548d, aVar);
                    } catch (Throwable th) {
                        MethodCollector.o(11916);
                        throw th;
                    }
                }
                MethodCollector.o(11916);
                return true;
            }
        }

        public a(com.facebook.fresco.animation.a.a aVar, b bVar, int i2, int i3) {
            this.f47547c = aVar;
            this.f47546b = bVar;
            this.f47548d = i2;
            this.f47549e = i3;
        }
    }

    @Override // com.facebook.fresco.animation.b.b.b
    public final boolean a(b bVar, com.facebook.fresco.animation.a.a aVar, int i2) {
        MethodCollector.i(13888);
        int hashCode = (aVar.hashCode() * 31) + i2;
        synchronized (this.f47543e) {
            try {
                if (this.f47543e.get(hashCode) != null) {
                    com.facebook.common.e.a.a(f47539a, "Already scheduled decode job for frame %d", Integer.valueOf(i2));
                    return true;
                } else if (bVar.b(i2)) {
                    com.facebook.common.e.a.a(f47539a, "Frame %d is cached already.", Integer.valueOf(i2));
                    MethodCollector.o(13888);
                    return true;
                } else {
                    a aVar2 = new a(aVar, bVar, i2, hashCode);
                    this.f47543e.put(hashCode, aVar2);
                    this.f47544f.execute(aVar2);
                    MethodCollector.o(13888);
                    return true;
                }
            } finally {
                MethodCollector.o(13888);
            }
        }
    }

    public c(f fVar, com.facebook.fresco.animation.b.c cVar, Bitmap.Config config, ExecutorService executorService) {
        this.f47540b = fVar;
        this.f47541c = cVar;
        this.f47542d = config;
        this.f47544f = executorService;
    }
}
