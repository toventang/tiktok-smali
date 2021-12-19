package com.google.c.b;

import com.bytedance.covode.number.Covode;
import java.util.Random;
import sun.misc.Unsafe;

public abstract class o extends Number {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadLocal<int[]> f53844a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final Random f53845b = new Random();

    /* renamed from: c  reason: collision with root package name */
    static final int f53846c = Runtime.getRuntime().availableProcessors();

    /* renamed from: g  reason: collision with root package name */
    private static final Unsafe f53847g;

    /* renamed from: h  reason: collision with root package name */
    private static final long f53848h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f53849i;

    /* renamed from: d  reason: collision with root package name */
    volatile transient a[] f53850d;

    /* renamed from: e  reason: collision with root package name */
    volatile transient long f53851e;

    /* renamed from: f  reason: collision with root package name */
    volatile transient int f53852f;

    /* access modifiers changed from: package-private */
    public abstract long a(long j2, long j3);

    o() {
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return f53847g.compareAndSwapInt(this, f53849i, 0, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.c.b.o.AnonymousClass1());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe c() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.c.b.o$1 r0 = new com.google.c.b.o$1     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.Throwable r1 = r0.getCause()
            java.lang.String r0 = "Could not initialize intrinsics"
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c.b.o.c():sun.misc.Unsafe");
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        private static final Unsafe f53853b;

        /* renamed from: c  reason: collision with root package name */
        private static final long f53854c;

        /* renamed from: a  reason: collision with root package name */
        volatile long f53855a;

        static {
            Covode.recordClassIndex(33348);
            try {
                Unsafe c2 = o.c();
                f53853b = c2;
                f53854c = c2.objectFieldOffset(a.class.getDeclaredField("value"));
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }

        a(long j2) {
            this.f53855a = j2;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(long j2, long j3) {
            return f53853b.compareAndSwapLong(this, f53854c, j2, j3);
        }
    }

    static {
        Covode.recordClassIndex(33346);
        try {
            Unsafe c2 = c();
            f53847g = c2;
            f53848h = c2.objectFieldOffset(o.class.getDeclaredField("base"));
            f53849i = c2.objectFieldOffset(o.class.getDeclaredField("busy"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(long j2, long j3) {
        return f53847g.compareAndSwapLong(this, f53848h, j2, j3);
    }
}
