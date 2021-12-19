package com.facebook.fresco.animation.a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.time.b;
import com.facebook.fresco.animation.a.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class c<T extends a> extends b<T> {

    /* renamed from: b  reason: collision with root package name */
    final b f47510b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f47511c;

    /* renamed from: d  reason: collision with root package name */
    long f47512d;

    /* renamed from: e  reason: collision with root package name */
    public long f47513e = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: f  reason: collision with root package name */
    public long f47514f = 1000;

    /* renamed from: g  reason: collision with root package name */
    public a f47515g;

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledExecutorService f47516h;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f47517i = new Runnable() {
        /* class com.facebook.fresco.animation.a.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28825);
        }

        public final void run() {
            MethodCollector.i(12002);
            synchronized (c.this) {
                try {
                    c.this.f47511c = false;
                    c cVar = c.this;
                    if (cVar.f47510b.now() - cVar.f47512d <= cVar.f47513e) {
                        c.this.f();
                    } else if (c.this.f47515g != null) {
                        c.this.f47515g.f();
                    }
                } finally {
                    MethodCollector.o(12002);
                }
            }
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(28826);
        }

        void f();
    }

    static {
        Covode.recordClassIndex(28824);
    }

    public final synchronized void f() {
        MethodCollector.i(12294);
        if (!this.f47511c) {
            this.f47511c = true;
            this.f47516h.schedule(this.f47517i, this.f47514f, TimeUnit.MILLISECONDS);
        }
        MethodCollector.o(12294);
    }

    @Override // com.facebook.fresco.animation.a.a, com.facebook.fresco.animation.a.b
    public final boolean a(Drawable drawable, Canvas canvas, int i2) {
        this.f47512d = this.f47510b.now();
        boolean a2 = super.a(drawable, canvas, i2);
        f();
        return a2;
    }

    public c(T t, a aVar, b bVar, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f47515g = aVar;
        this.f47510b = bVar;
        this.f47516h = scheduledExecutorService;
    }
}
