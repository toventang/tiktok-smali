package com.bytedance.zoin.zstd;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicIntegerFieldUpdater<a> f46314a = AtomicIntegerFieldUpdater.newUpdater(a.class, "b");

    /* renamed from: b  reason: collision with root package name */
    volatile int f46315b;

    /* access modifiers changed from: package-private */
    public abstract void b();

    a() {
    }

    static {
        Covode.recordClassIndex(28283);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int i2;
        do {
            i2 = this.f46315b;
            if (i2 < 0) {
                throw new IllegalStateException("Closed");
            } else if (i2 == 0) {
                throw new IllegalStateException("Shared lock underflow");
            }
        } while (!f46314a.compareAndSet(this, i2, i2 - 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f46315b != -1) {
                if (f46314a.compareAndSet(this, 0, -1)) {
                    b();
                    return;
                }
                throw new IllegalStateException("Attempt to close while in use");
            }
        }
    }
}
