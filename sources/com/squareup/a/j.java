package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.a.a.b.s;
import com.squareup.a.a.c.b;
import com.squareup.a.a.d;
import com.squareup.a.a.i;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final j f57846a;

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ boolean f57847g = true;

    /* renamed from: b  reason: collision with root package name */
    final Executor f57848b;

    /* renamed from: c  reason: collision with root package name */
    final int f57849c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f57850d;

    /* renamed from: e  reason: collision with root package name */
    final Deque<b> f57851e;

    /* renamed from: f  reason: collision with root package name */
    final i f57852f;

    /* renamed from: h  reason: collision with root package name */
    private final long f57853h;

    static {
        long j2;
        Covode.recordClassIndex(36003);
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        if (property2 != null) {
            j2 = Long.parseLong(property2);
        } else {
            j2 = 300000;
        }
        if (property != null && !Boolean.parseBoolean(property)) {
            f57846a = new j(0, j2);
        } else if (property3 != null) {
            f57846a = new j(Integer.parseInt(property3), j2);
        } else {
            f57846a = new j(5, j2);
        }
    }

    /* access modifiers changed from: package-private */
    public final long a(long j2) {
        MethodCollector.i(12984);
        synchronized (this) {
            try {
                b bVar = null;
                long j3 = Long.MIN_VALUE;
                int i2 = 0;
                int i3 = 0;
                for (b bVar2 : this.f57851e) {
                    List<Reference<s>> list = bVar2.f57733h;
                    int i4 = 0;
                    while (true) {
                        if (i4 < list.size()) {
                            if (list.get(i4).get() == null) {
                                d.f57738a.warning("A connection to " + bVar2.f57726a.f57952a.f57411a + " was leaked. Did you forget to close a response body?");
                                list.remove(i4);
                                bVar2.f57734i = true;
                                if (list.isEmpty()) {
                                    bVar2.f57735j = j2 - this.f57853h;
                                    break;
                                }
                            } else {
                                i4++;
                            }
                        } else if (list.size() > 0) {
                            i3++;
                        }
                    }
                    i2++;
                    long j4 = j2 - bVar2.f57735j;
                    if (j4 > j3) {
                        bVar = bVar2;
                        j3 = j4;
                    }
                }
                long j5 = this.f57853h;
                if (j3 >= j5 || i2 > this.f57849c) {
                    this.f57851e.remove(bVar);
                    com.squareup.a.a.j.a(bVar.f57727b);
                    MethodCollector.o(12984);
                    return 0;
                } else if (i2 > 0) {
                    return j5 - j3;
                } else if (i3 > 0) {
                    MethodCollector.o(12984);
                    return j5;
                } else {
                    MethodCollector.o(12984);
                    return -1;
                }
            } finally {
                MethodCollector.o(12984);
            }
        }
    }

    private j(int i2, long j2) {
        this(i2, j2, TimeUnit.MILLISECONDS);
    }

    private j(int i2, long j2, TimeUnit timeUnit) {
        this.f57848b = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.squareup.a.a.j.b("OkHttp ConnectionPool"));
        this.f57850d = new Runnable() {
            /* class com.squareup.a.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36004);
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(12340);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
                throw r0;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r8 = this;
                    r7 = 12340(0x3034, float:1.7292E-41)
                    com.bytedance.frameworks.apm.trace.MethodCollector.i(r7)
                L_0x0005:
                    com.squareup.a.j r2 = com.squareup.a.j.this
                    long r0 = java.lang.System.nanoTime()
                    long r5 = r2.a(r0)
                    r1 = -1
                    int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r0 != 0) goto L_0x0019
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
                    return
                L_0x0019:
                    r1 = 0
                    int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0005
                    r0 = 1000000(0xf4240, double:4.940656E-318)
                    long r3 = r5 / r0
                    long r0 = r0 * r3
                    long r5 = r5 - r0
                    com.squareup.a.j r2 = com.squareup.a.j.this
                    monitor-enter(r2)
                    com.squareup.a.j r1 = com.squareup.a.j.this     // Catch:{ InterruptedException -> 0x002f }
                    int r0 = (int) r5     // Catch:{ InterruptedException -> 0x002f }
                    r1.wait(r3, r0)     // Catch:{ InterruptedException -> 0x002f }
                L_0x002f:
                    monitor-exit(r2)     // Catch:{ all -> 0x0031 }
                    goto L_0x0005
                L_0x0031:
                    r0 = move-exception
                    monitor-exit(r2)
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.j.AnonymousClass1.run():void");
            }
        };
        this.f57851e = new ArrayDeque();
        this.f57852f = new i();
        this.f57849c = i2;
        this.f57853h = timeUnit.toNanos(j2);
        if (j2 <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: ".concat(String.valueOf(j2)));
        }
    }
}
