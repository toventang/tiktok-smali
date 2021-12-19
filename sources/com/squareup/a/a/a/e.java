package com.squareup.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Objects;
import k.aa;
import k.ab;
import k.d;
import k.f;
import k.h;
import k.y;

public final class e {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ boolean f57482l = true;

    /* renamed from: a  reason: collision with root package name */
    long f57483a;

    /* renamed from: b  reason: collision with root package name */
    long f57484b;

    /* renamed from: c  reason: collision with root package name */
    public final int f57485c;

    /* renamed from: d  reason: collision with root package name */
    public final d f57486d;

    /* renamed from: e  reason: collision with root package name */
    public final List<f> f57487e;

    /* renamed from: f  reason: collision with root package name */
    List<f> f57488f;

    /* renamed from: g  reason: collision with root package name */
    public final b f57489g;

    /* renamed from: h  reason: collision with root package name */
    final a f57490h;

    /* renamed from: i  reason: collision with root package name */
    public final c f57491i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final c f57492j = new c();

    /* renamed from: k  reason: collision with root package name */
    public a f57493k = null;

    /* access modifiers changed from: package-private */
    public final class a implements y {

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ boolean f57494c = true;

        /* renamed from: a  reason: collision with root package name */
        public boolean f57495a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f57496b;

        /* renamed from: e  reason: collision with root package name */
        private final f f57498e = new f();

        @Override // k.y
        public final ab timeout() {
            return e.this.f57492j;
        }

        static {
            Covode.recordClassIndex(35897);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            if (r13.f57497d.f57490h.f57496b != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
            if (r13.f57498e.f158864b <= 0) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            if (r13.f57498e.f158864b <= 0) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
            r13.f57497d.f57486d.a(r13.f57497d.f57485c, true, (k.f) null, 0L);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
            r1 = r13.f57497d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r13.f57495a = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
            r13.f57497d.f57486d.b();
            r13.f57497d.f();
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13819);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13819);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
            throw r0;
         */
        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
            // Method dump skipped, instructions count: 119
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.a.e.a.close():void");
        }

        @Override // k.y, java.io.Flushable
        public final void flush() {
            MethodCollector.i(13816);
            if (f57494c || !Thread.holdsLock(e.this)) {
                synchronized (e.this) {
                    try {
                        e.this.g();
                    } finally {
                        MethodCollector.o(13816);
                    }
                }
                while (this.f57498e.f158864b > 0) {
                    a(false);
                    e.this.f57486d.b();
                }
                return;
            }
            AssertionError assertionError = new AssertionError();
            MethodCollector.o(13816);
            throw assertionError;
        }

        a() {
        }

        private void a(boolean z) {
            long min;
            boolean z2;
            MethodCollector.i(13766);
            synchronized (e.this) {
                try {
                    e.this.f57492j.enter();
                    while (e.this.f57484b <= 0 && !this.f57496b && !this.f57495a && e.this.f57493k == null) {
                        try {
                            e.this.h();
                        } finally {
                            e.this.f57492j.a();
                            MethodCollector.o(13766);
                        }
                    }
                    e.this.f57492j.a();
                    e.this.g();
                    min = Math.min(e.this.f57484b, this.f57498e.f158864b);
                    e.this.f57484b -= min;
                } catch (Throwable th) {
                    MethodCollector.o(13766);
                    throw th;
                }
            }
            e.this.f57492j.enter();
            try {
                d dVar = e.this.f57486d;
                int i2 = e.this.f57485c;
                if (!z || min != this.f57498e.f158864b) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                dVar.a(i2, z2, this.f57498e, min);
            } finally {
                e.this.f57492j.a();
                MethodCollector.o(13766);
            }
        }

        @Override // k.y
        public final void write(f fVar, long j2) {
            if (f57494c || !Thread.holdsLock(e.this)) {
                this.f57498e.write(fVar, j2);
                while (this.f57498e.f158864b >= 16384) {
                    a(false);
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public final class b implements aa {

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ boolean f57499c = true;

        /* renamed from: a  reason: collision with root package name */
        public boolean f57500a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f57501b;

        /* renamed from: e  reason: collision with root package name */
        private final f f57503e;

        /* renamed from: f  reason: collision with root package name */
        private final f f57504f;

        /* renamed from: g  reason: collision with root package name */
        private final long f57505g;

        @Override // k.aa
        public final ab timeout() {
            return e.this.f57491i;
        }

        static {
            Covode.recordClassIndex(35898);
        }

        private void a() {
            e.this.f57491i.enter();
            while (this.f57504f.f158864b == 0 && !this.f57501b && !this.f57500a && e.this.f57493k == null) {
                try {
                    e.this.h();
                } finally {
                    e.this.f57491i.a();
                }
            }
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            MethodCollector.i(12638);
            synchronized (e.this) {
                try {
                    this.f57500a = true;
                    this.f57504f.v();
                    e.this.notifyAll();
                } catch (Throwable th) {
                    MethodCollector.o(12638);
                    throw th;
                }
            }
            e.this.f();
            MethodCollector.o(12638);
        }

        private b(long j2) {
            this.f57503e = new f();
            this.f57504f = new f();
            this.f57505g = j2;
        }

        /* access modifiers changed from: package-private */
        public final void a(h hVar, long j2) {
            boolean z;
            boolean z2;
            boolean z3;
            MethodCollector.i(12532);
            if (f57499c || !Thread.holdsLock(e.this)) {
                while (j2 > 0) {
                    synchronized (e.this) {
                        try {
                            z = this.f57501b;
                            z2 = true;
                            if (this.f57504f.f158864b + j2 > this.f57505g) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } finally {
                            MethodCollector.o(12532);
                        }
                    }
                    if (z3) {
                        hVar.l(j2);
                        e.this.b(a.FLOW_CONTROL_ERROR);
                        MethodCollector.o(12532);
                        return;
                    } else if (z) {
                        hVar.l(j2);
                        MethodCollector.o(12532);
                        return;
                    } else {
                        long read = hVar.read(this.f57503e, j2);
                        if (read != -1) {
                            j2 -= read;
                            synchronized (e.this) {
                                try {
                                    if (this.f57504f.f158864b != 0) {
                                        z2 = false;
                                    }
                                    this.f57504f.a((aa) this.f57503e);
                                    if (z2) {
                                        e.this.notifyAll();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            EOFException eOFException = new EOFException();
                            MethodCollector.o(12532);
                            throw eOFException;
                        }
                    }
                }
                MethodCollector.o(12532);
                return;
            }
            AssertionError assertionError = new AssertionError();
            MethodCollector.o(12532);
            throw assertionError;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
            r6 = r12.f57502d.f57486d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
            monitor-enter(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r12.f57502d.f57486d.f57438l += r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
            if (r12.f57502d.f57486d.f57438l < ((long) (r12.f57502d.f57486d.n.b() / 2))) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
            r12.f57502d.f57486d.a(0, r12.f57502d.f57486d.f57438l);
            r12.f57502d.f57486d.f57438l = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
            monitor-exit(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
            return r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(12530);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
            throw r0;
         */
        @Override // k.aa
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long read(k.f r13, long r14) {
            /*
            // Method dump skipped, instructions count: 234
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.a.e.b.read(k.f, long):long");
        }

        /* synthetic */ b(e eVar, long j2, byte b2) {
            this(j2);
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends d {
        static {
            Covode.recordClassIndex(35899);
        }

        @Override // k.d
        public final void timedOut() {
            e.this.b(a.CANCEL);
        }

        public final void a() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        c() {
        }

        @Override // k.d
        public final IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    static {
        Covode.recordClassIndex(35896);
    }

    public final boolean b() {
        boolean z;
        if ((this.f57485c & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f57486d.f57429c == z) {
            return true;
        }
        return false;
    }

    public final void h() {
        MethodCollector.i(13504);
        try {
            wait();
            MethodCollector.o(13504);
        } catch (InterruptedException unused) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            MethodCollector.o(13504);
            throw interruptedIOException;
        }
    }

    public final synchronized boolean a() {
        MethodCollector.i(13180);
        if (this.f57493k != null) {
            MethodCollector.o(13180);
            return false;
        } else if ((this.f57489g.f57501b || this.f57489g.f57500a) && ((this.f57490h.f57496b || this.f57490h.f57495a) && this.f57488f != null)) {
            MethodCollector.o(13180);
            return false;
        } else {
            MethodCollector.o(13180);
            return true;
        }
    }

    public final y d() {
        MethodCollector.i(13259);
        synchronized (this) {
            try {
                if (this.f57488f == null && !b()) {
                    IllegalStateException illegalStateException = new IllegalStateException("reply before requesting the sink");
                    MethodCollector.o(13259);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.o(13259);
                throw th;
            }
        }
        a aVar = this.f57490h;
        MethodCollector.o(13259);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        boolean a2;
        MethodCollector.i(13335);
        if (f57482l || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    this.f57489g.f57501b = true;
                    a2 = a();
                    notifyAll();
                } finally {
                    MethodCollector.o(13335);
                }
            }
            if (!a2) {
                this.f57486d.b(this.f57485c);
            }
            return;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.o(13335);
        throw assertionError;
    }

    public final void g() {
        if (this.f57490h.f57495a) {
            throw new IOException("stream closed");
        } else if (this.f57490h.f57496b) {
            throw new IOException("stream finished");
        } else if (this.f57493k != null) {
            throw new IOException("stream was reset: " + this.f57493k);
        }
    }

    public final synchronized List<f> c() {
        List<f> list;
        MethodCollector.i(13257);
        this.f57491i.enter();
        while (this.f57488f == null && this.f57493k == null) {
            try {
                h();
            } catch (Throwable th) {
                this.f57491i.a();
                MethodCollector.o(13257);
                throw th;
            }
        }
        this.f57491i.a();
        list = this.f57488f;
        if (list != null) {
            MethodCollector.o(13257);
        } else {
            IOException iOException = new IOException("stream was reset: " + this.f57493k);
            MethodCollector.o(13257);
            throw iOException;
        }
        return list;
    }

    public final void f() {
        boolean z;
        boolean a2;
        MethodCollector.i(13414);
        if (f57482l || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    if (this.f57489g.f57501b || !this.f57489g.f57500a || (!this.f57490h.f57496b && !this.f57490h.f57495a)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    a2 = a();
                } finally {
                    MethodCollector.o(13414);
                }
            }
            if (z) {
                a(a.CANCEL);
                MethodCollector.o(13414);
                return;
            }
            if (!a2) {
                this.f57486d.b(this.f57485c);
            }
            return;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.o(13414);
        throw assertionError;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        this.f57484b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public final void b(a aVar) {
        if (d(aVar)) {
            this.f57486d.a(this.f57485c, aVar);
        }
    }

    public final void a(a aVar) {
        if (d(aVar)) {
            this.f57486d.b(this.f57485c, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(a aVar) {
        MethodCollector.i(13413);
        if (this.f57493k == null) {
            this.f57493k = aVar;
            notifyAll();
        }
        MethodCollector.o(13413);
    }

    private boolean d(a aVar) {
        MethodCollector.i(13334);
        if (f57482l || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    if (this.f57493k != null) {
                        return false;
                    }
                    if (!this.f57489g.f57501b || !this.f57490h.f57496b) {
                        this.f57493k = aVar;
                        notifyAll();
                        this.f57486d.b(this.f57485c);
                        MethodCollector.o(13334);
                        return true;
                    }
                    MethodCollector.o(13334);
                    return false;
                } finally {
                    MethodCollector.o(13334);
                }
            }
        } else {
            AssertionError assertionError = new AssertionError();
            MethodCollector.o(13334);
            throw assertionError;
        }
    }

    e(int i2, d dVar, boolean z, boolean z2, List<f> list) {
        Objects.requireNonNull(dVar, "connection == null");
        Objects.requireNonNull(list, "requestHeaders == null");
        this.f57485c = i2;
        this.f57486d = dVar;
        this.f57484b = (long) dVar.o.b();
        b bVar = new b(this, (long) dVar.n.b(), (byte) 0);
        this.f57489g = bVar;
        a aVar = new a();
        this.f57490h = aVar;
        bVar.f57501b = z2;
        aVar.f57496b = z;
        this.f57487e = list;
    }
}
