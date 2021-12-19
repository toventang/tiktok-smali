package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class h extends Handler implements q {

    /* renamed from: a  reason: collision with root package name */
    private final p f159809a = new p();

    /* renamed from: b  reason: collision with root package name */
    private final int f159810b = 10;

    /* renamed from: c  reason: collision with root package name */
    private final EventBus f159811c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f159812d;

    static {
        Covode.recordClassIndex(106477);
    }

    public final void handleMessage(Message message) {
        MethodCollector.i(5602);
        boolean z = false;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                o a2 = this.f159809a.a();
                if (a2 == null) {
                    synchronized (this) {
                        try {
                            a2 = this.f159809a.a();
                            if (a2 == null) {
                                this.f159812d = z;
                                this.f159812d = z;
                                MethodCollector.o(5602);
                                return;
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(5602);
                            throw th;
                        }
                    }
                }
                this.f159811c.a(a2);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f159810b));
            if (sendMessage(obtainMessage())) {
                z = true;
                return;
            }
            d dVar = new d("Could not send handler message");
            MethodCollector.o(5602);
            throw dVar;
        } finally {
            this.f159812d = z;
            MethodCollector.o(5602);
        }
    }

    protected h(EventBus eventBus, Looper looper) {
        super(looper);
        this.f159811c = eventBus;
    }

    @Override // org.greenrobot.eventbus.q
    public final void a(v vVar, Object obj) {
        MethodCollector.i(5487);
        o a2 = o.a(vVar, obj);
        synchronized (this) {
            try {
                this.f159809a.a(a2);
                if (!this.f159812d) {
                    this.f159812d = true;
                    if (!sendMessage(obtainMessage())) {
                        d dVar = new d("Could not send handler message");
                        MethodCollector.o(5487);
                        throw dVar;
                    }
                }
            } finally {
                MethodCollector.o(5487);
            }
        }
    }
}
