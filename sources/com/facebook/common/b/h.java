package com.facebook.common.b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class h<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicInteger f47067a = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(28620);
    }

    /* access modifiers changed from: protected */
    public void a(Exception exc) {
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
    }

    /* access modifiers changed from: protected */
    public abstract T c();

    public final void a() {
        if (this.f47067a.compareAndSet(0, 2)) {
            b();
        }
    }

    public final void run() {
        if (this.f47067a.compareAndSet(0, 1)) {
            try {
                T c2 = c();
                this.f47067a.set(3);
                try {
                    a((Object) c2);
                } finally {
                    b(c2);
                }
            } catch (Exception e2) {
                this.f47067a.set(4);
                a(e2);
            }
        }
    }
}
