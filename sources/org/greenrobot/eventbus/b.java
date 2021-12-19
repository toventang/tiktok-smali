package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.logging.Level;

/* access modifiers changed from: package-private */
public final class b implements Runnable, q {

    /* renamed from: a  reason: collision with root package name */
    private final p f159789a = new p();

    /* renamed from: b  reason: collision with root package name */
    private final EventBus f159790b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f159791c;

    static {
        Covode.recordClassIndex(106469);
    }

    public final void run() {
        MethodCollector.i(4552);
        while (true) {
            try {
                o b2 = this.f159789a.b();
                if (b2 == null) {
                    synchronized (this) {
                        try {
                            b2 = this.f159789a.a();
                            if (b2 == null) {
                                this.f159791c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(4552);
                            throw th;
                        }
                    }
                }
                this.f159790b.a(b2);
            } catch (InterruptedException e2) {
                this.f159790b.f159775i.a(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e2);
                return;
            } finally {
                this.f159791c = false;
                MethodCollector.o(4552);
            }
        }
    }

    b(EventBus eventBus) {
        this.f159790b = eventBus;
    }

    @Override // org.greenrobot.eventbus.q
    public final void a(v vVar, Object obj) {
        MethodCollector.i(4543);
        o a2 = o.a(vVar, obj);
        synchronized (this) {
            try {
                this.f159789a.a(a2);
                if (!this.f159791c) {
                    this.f159791c = true;
                    this.f159790b.f159773g.execute(this);
                }
            } finally {
                MethodCollector.o(4543);
            }
        }
    }
}
