package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.a.a;
import com.squareup.a.a.c.b;
import com.squareup.a.a.d;
import com.squareup.a.a.i;
import com.squareup.a.j;
import com.squareup.a.z;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final a f57716a;

    /* renamed from: b  reason: collision with root package name */
    public q f57717b;

    /* renamed from: c  reason: collision with root package name */
    public b f57718c;

    /* renamed from: d  reason: collision with root package name */
    private final j f57719d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f57720e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f57721f;

    /* renamed from: g  reason: collision with root package name */
    private j f57722g;

    static {
        Covode.recordClassIndex(35962);
    }

    public final String toString() {
        return this.f57716a.toString();
    }

    private i b() {
        return d.f57739b.a(this.f57719d);
    }

    public final synchronized b a() {
        b bVar;
        MethodCollector.i(10645);
        bVar = this.f57718c;
        MethodCollector.o(10645);
        return bVar;
    }

    public final void a(b bVar) {
        bVar.f57733h.add(new WeakReference(this));
    }

    private void b(b bVar) {
        int size = bVar.f57733h.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (bVar.f57733h.get(i2).get() == this) {
                bVar.f57733h.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void a(j jVar) {
        MethodCollector.i(10488);
        synchronized (this.f57719d) {
            if (jVar != null) {
                try {
                    if (jVar == this.f57722g) {
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10488);
                    throw th;
                }
            }
            IllegalStateException illegalStateException = new IllegalStateException("expected " + this.f57722g + " but was " + jVar);
            MethodCollector.o(10488);
            throw illegalStateException;
        }
        a(false, false, true);
        MethodCollector.o(10488);
    }

    public final void a(IOException iOException) {
        MethodCollector.i(11272);
        synchronized (this.f57719d) {
            try {
                if (this.f57717b != null) {
                    if (this.f57718c.f57730e == 0) {
                        z zVar = this.f57718c.f57726a;
                        q qVar = this.f57717b;
                        if (!(zVar.f57953b.type() == Proxy.Type.DIRECT || qVar.f57704a.f57417g == null)) {
                            qVar.f57704a.f57417g.connectFailed(qVar.f57704a.f57411a.b(), zVar.f57953b.address(), iOException);
                        }
                        qVar.f57705b.a(zVar);
                    } else {
                        this.f57717b = null;
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(11272);
                throw th;
            }
        }
        a(true, false, true);
        MethodCollector.o(11272);
    }

    public s(j jVar, a aVar) {
        this.f57719d = jVar;
        this.f57716a = aVar;
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        b bVar;
        b bVar2;
        MethodCollector.i(10963);
        synchronized (this.f57719d) {
            bVar = null;
            if (z3) {
                try {
                    this.f57722g = null;
                } catch (Throwable th) {
                    MethodCollector.o(10963);
                    throw th;
                }
            }
            if (z2) {
                this.f57720e = true;
            }
            b bVar3 = this.f57718c;
            if (bVar3 != null) {
                if (z) {
                    bVar3.f57734i = true;
                }
                if (this.f57722g == null && (this.f57720e || this.f57718c.f57734i)) {
                    b(this.f57718c);
                    if (this.f57718c.f57730e > 0) {
                        this.f57717b = null;
                    }
                    if (this.f57718c.f57733h.isEmpty()) {
                        this.f57718c.f57735j = System.nanoTime();
                        if (d.f57739b.a(this.f57719d, this.f57718c)) {
                            bVar2 = this.f57718c;
                            this.f57718c = null;
                            bVar = bVar2;
                        }
                    }
                    bVar2 = null;
                    this.f57718c = null;
                    bVar = bVar2;
                }
            }
        }
        if (bVar != null) {
            com.squareup.a.a.j.a(bVar.f57727b);
        }
        MethodCollector.o(10963);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        r5 = new com.squareup.a.a.c.b(r11.f57717b.b());
        a(r5);
        r2 = r11.f57719d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        com.squareup.a.a.d.f57739b.b(r11.f57719d, r5);
        r11.f57718c = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r11.f57721f != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        r5.a(r12, r13, r14, r11.f57716a.f57416f, r15);
        b().b(r5.f57726a);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10486);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        r1 = new java.io.IOException("Canceled");
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10486);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10486);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.squareup.a.a.c.b a(int r12, int r13, int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.b.s.a(int, int, int, boolean):com.squareup.a.a.c.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r2.a(r9) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.squareup.a.a.c.b b(int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            r3 = 10165(0x27b5, float:1.4244E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
        L_0x0005:
            com.squareup.a.a.c.b r2 = r4.a(r5, r6, r7, r8)
            com.squareup.a.j r1 = r4.f57719d
            monitor-enter(r1)
            int r0 = r2.f57730e     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0012
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            goto L_0x0023
        L_0x0012:
            monitor-exit(r1)
            boolean r0 = r2.a(r9)
            if (r0 == 0) goto L_0x001d
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r2
        L_0x001d:
            r1 = 0
            r0 = 1
            r4.a(r0, r1, r0)
            goto L_0x0005
        L_0x0023:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r2
        L_0x0027:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.b.s.b(int, int, int, boolean, boolean):com.squareup.a.a.c.b");
    }

    public final j a(int i2, int i3, int i4, boolean z, boolean z2) {
        j eVar;
        MethodCollector.i(10005);
        try {
            b b2 = b(i2, i3, i4, z, z2);
            if (b2.f57729d != null) {
                eVar = new f(this, b2.f57729d);
            } else {
                b2.f57727b.setSoTimeout(i3);
                b2.f57731f.timeout().timeout((long) i3, TimeUnit.MILLISECONDS);
                b2.f57732g.timeout().timeout((long) i4, TimeUnit.MILLISECONDS);
                eVar = new e(this, b2.f57731f, b2.f57732g);
            }
            synchronized (this.f57719d) {
                try {
                    b2.f57730e++;
                    this.f57722g = eVar;
                } finally {
                    MethodCollector.o(10005);
                }
            }
            return eVar;
        } catch (IOException e2) {
            p pVar = new p(e2);
            MethodCollector.o(10005);
            throw pVar;
        }
    }
}
