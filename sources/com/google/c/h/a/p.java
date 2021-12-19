package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public abstract class p<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final Runnable f54237a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f54238b = new a((byte) 0);

    /* access modifiers changed from: package-private */
    public abstract void a(T t, Throwable th);

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    /* access modifiers changed from: package-private */
    public abstract T b();

    /* access modifiers changed from: package-private */
    public abstract String c();

    static final class a implements Runnable {
        static {
            Covode.recordClassIndex(33658);
        }

        public final void run() {
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    p() {
    }

    static {
        Covode.recordClassIndex(33657);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.c.h.a.p<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void run() {
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !a();
            if (z) {
                try {
                    obj = b();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f54237a)) {
                        while (get() == f54238b) {
                            Thread.yield();
                        }
                    }
                    a(null, th);
                    return;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, f54237a)) {
                while (get() == f54238b) {
                    Thread.yield();
                }
            }
            if (z) {
                a(obj, null);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f54237a) {
            str = "running=[DONE]";
        } else if (runnable == f54238b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + c();
    }
}
