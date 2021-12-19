package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.h.a.b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class o<V> extends h<V> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f54234a = Logger.getLogger(o.class.getName());

    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public static class b<V> extends o<V> {

        /* renamed from: a  reason: collision with root package name */
        static final b<Object> f54235a = new b<>(null);

        /* renamed from: b  reason: collision with root package name */
        private final V f54236b;

        @Override // java.util.concurrent.Future, com.google.c.h.a.o
        public final V get() {
            return this.f54236b;
        }

        static {
            Covode.recordClassIndex(33656);
        }

        public final String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + ((Object) this.f54236b) + "]]";
        }

        b(V v) {
            this.f54236b = v;
        }
    }

    o() {
    }

    static {
        Covode.recordClassIndex(33654);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> extends b.h<V> {
        static {
            Covode.recordClassIndex(33655);
        }

        a(Throwable th) {
            a(th);
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) {
        k.a(timeUnit);
        return get();
    }

    @Override // com.google.c.h.a.q
    public final void a(Runnable runnable, Executor executor) {
        k.a(runnable, "Runnable was null.");
        k.a(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f54234a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }
}
