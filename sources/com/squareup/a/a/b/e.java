package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.a.a.j;
import com.squareup.a.p;
import com.squareup.a.v;
import com.squareup.a.x;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import k.aa;
import k.ab;
import k.g;
import k.h;
import k.m;
import k.q;
import k.y;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final s f57629a;

    /* renamed from: b  reason: collision with root package name */
    public final h f57630b;

    /* renamed from: c  reason: collision with root package name */
    public final g f57631c;

    /* renamed from: d  reason: collision with root package name */
    public int f57632d;

    /* renamed from: e  reason: collision with root package name */
    private h f57633e;

    static {
        Covode.recordClassIndex(35936);
    }

    abstract class a implements aa {

        /* renamed from: a  reason: collision with root package name */
        protected final m f57634a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f57635b;

        static {
            Covode.recordClassIndex(35937);
        }

        @Override // k.aa
        public ab timeout() {
            return this.f57634a;
        }

        /* access modifiers changed from: protected */
        public final void a() {
            if (e.this.f57632d == 5) {
                e.a(this.f57634a);
                e.this.f57632d = 6;
                if (e.this.f57629a != null) {
                    e.this.f57629a.a(e.this);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + e.this.f57632d);
        }

        /* access modifiers changed from: protected */
        public final void b() {
            if (e.this.f57632d != 6) {
                e.this.f57632d = 6;
                if (e.this.f57629a != null) {
                    e.this.f57629a.a(true, false, false);
                    e.this.f57629a.a(e.this);
                }
            }
        }

        private a() {
            this.f57634a = new m(e.this.f57630b.timeout());
        }

        /* synthetic */ a(e eVar, byte b2) {
            this();
        }
    }

    final class b implements y {

        /* renamed from: b  reason: collision with root package name */
        private final m f57638b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f57639c;

        static {
            Covode.recordClassIndex(35938);
        }

        @Override // k.y
        public final ab timeout() {
            return this.f57638b;
        }

        @Override // k.y, java.io.Flushable
        public final synchronized void flush() {
            MethodCollector.i(9652);
            if (this.f57639c) {
                MethodCollector.o(9652);
                return;
            }
            e.this.f57631c.flush();
            MethodCollector.o(9652);
        }

        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            MethodCollector.i(9824);
            if (this.f57639c) {
                MethodCollector.o(9824);
                return;
            }
            this.f57639c = true;
            e.this.f57631c.a("0\r\n\r\n");
            e.a(this.f57638b);
            e.this.f57632d = 3;
            MethodCollector.o(9824);
        }

        private b() {
            this.f57638b = new m(e.this.f57631c.timeout());
        }

        /* synthetic */ b(e eVar, byte b2) {
            this();
        }

        @Override // k.y
        public final void write(k.f fVar, long j2) {
            if (this.f57639c) {
                throw new IllegalStateException("closed");
            } else if (j2 != 0) {
                e.this.f57631c.c(j2);
                e.this.f57631c.a("\r\n");
                e.this.f57631c.write(fVar, j2);
                e.this.f57631c.a("\r\n");
            }
        }
    }

    final class d implements y {

        /* renamed from: b  reason: collision with root package name */
        private final m f57645b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f57646c;

        /* renamed from: d  reason: collision with root package name */
        private long f57647d;

        static {
            Covode.recordClassIndex(35940);
        }

        @Override // k.y
        public final ab timeout() {
            return this.f57645b;
        }

        @Override // k.y, java.io.Flushable
        public final void flush() {
            if (!this.f57646c) {
                e.this.f57631c.flush();
            }
        }

        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f57646c) {
                this.f57646c = true;
                if (this.f57647d <= 0) {
                    e.a(this.f57645b);
                    e.this.f57632d = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        private d(long j2) {
            this.f57645b = new m(e.this.f57631c.timeout());
            this.f57647d = j2;
        }

        @Override // k.y
        public final void write(k.f fVar, long j2) {
            if (!this.f57646c) {
                j.a(fVar.f158864b, j2);
                if (j2 <= this.f57647d) {
                    e.this.f57631c.write(fVar, j2);
                    this.f57647d -= j2;
                    return;
                }
                throw new ProtocolException("expected " + this.f57647d + " bytes but received " + j2);
            }
            throw new IllegalStateException("closed");
        }

        /* synthetic */ d(e eVar, long j2, byte b2) {
            this(j2);
        }
    }

    @Override // com.squareup.a.a.b.j
    public final x.a a() {
        return c();
    }

    @Override // com.squareup.a.a.b.j
    public final void b() {
        this.f57631c.flush();
    }

    class f extends a {

        /* renamed from: e  reason: collision with root package name */
        private boolean f57651e;

        static {
            Covode.recordClassIndex(35942);
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f57635b) {
                if (!this.f57651e) {
                    b();
                }
                this.f57635b = true;
            }
        }

        private f() {
            super(e.this, (byte) 0);
        }

        /* synthetic */ f(e eVar, byte b2) {
            this();
        }

        @Override // k.aa
        public final long read(k.f fVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
            } else if (this.f57635b) {
                throw new IllegalStateException("closed");
            } else if (this.f57651e) {
                return -1;
            } else {
                long read = e.this.f57630b.read(fVar, j2);
                if (read != -1) {
                    return read;
                }
                this.f57651e = true;
                a();
                return -1;
            }
        }
    }

    class c extends a {

        /* renamed from: e  reason: collision with root package name */
        private long f57641e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f57642f = true;

        /* renamed from: g  reason: collision with root package name */
        private final h f57643g;

        static {
            Covode.recordClassIndex(35939);
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f57635b) {
                if (this.f57642f && !j.a((aa) this, TimeUnit.MILLISECONDS)) {
                    b();
                }
                this.f57635b = true;
            }
        }

        c(h hVar) {
            super(e.this, (byte) 0);
            this.f57643g = hVar;
        }

        @Override // k.aa
        public final long read(k.f fVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
            } else if (this.f57635b) {
                throw new IllegalStateException("closed");
            } else if (!this.f57642f) {
                return -1;
            } else {
                long j3 = this.f57641e;
                if (j3 == 0 || j3 == -1) {
                    if (j3 != -1) {
                        e.this.f57630b.s();
                    }
                    try {
                        this.f57641e = e.this.f57630b.p();
                        String trim = e.this.f57630b.s().trim();
                        if (this.f57641e < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f57641e + trim + "\"");
                        }
                        if (this.f57641e == 0) {
                            this.f57642f = false;
                            this.f57643g.a(e.this.d());
                            a();
                        }
                        if (!this.f57642f) {
                            return -1;
                        }
                    } catch (NumberFormatException e2) {
                        throw new ProtocolException(e2.getMessage());
                    }
                }
                long read = e.this.f57630b.read(fVar, Math.min(j2, this.f57641e));
                if (read != -1) {
                    this.f57641e -= read;
                    return read;
                }
                b();
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.b.e$e  reason: collision with other inner class name */
    public class C1276e extends a {

        /* renamed from: e  reason: collision with root package name */
        private long f57649e;

        static {
            Covode.recordClassIndex(35941);
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f57635b) {
                if (this.f57649e != 0 && !j.a((aa) this, TimeUnit.MILLISECONDS)) {
                    b();
                }
                this.f57635b = true;
            }
        }

        public C1276e(long j2) {
            super(e.this, (byte) 0);
            this.f57649e = j2;
            if (j2 == 0) {
                a();
            }
        }

        @Override // k.aa
        public final long read(k.f fVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
            } else if (this.f57635b) {
                throw new IllegalStateException("closed");
            } else if (this.f57649e == 0) {
                return -1;
            } else {
                long read = e.this.f57630b.read(fVar, Math.min(this.f57649e, j2));
                if (read != -1) {
                    long j3 = this.f57649e - read;
                    this.f57649e = j3;
                    if (j3 == 0) {
                        a();
                    }
                    return read;
                }
                b();
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    public final p d() {
        p.a aVar = new p.a();
        while (true) {
            String s = this.f57630b.s();
            if (s.length() == 0) {
                return aVar.a();
            }
            com.squareup.a.a.d.f57739b.a(aVar, s);
        }
    }

    public final x.a c() {
        r a2;
        x.a a3;
        int i2 = this.f57632d;
        if (i2 == 1 || i2 == 3) {
            do {
                try {
                    a2 = r.a(this.f57630b.s());
                    x.a aVar = new x.a();
                    aVar.f57943b = a2.f57713a;
                    aVar.f57944c = a2.f57714b;
                    aVar.f57945d = a2.f57715c;
                    a3 = aVar.a(d());
                } catch (EOFException e2) {
                    IOException iOException = new IOException("unexpected end of stream on " + this.f57629a);
                    iOException.initCause(e2);
                    throw iOException;
                }
            } while (a2.f57714b == 100);
            this.f57632d = 4;
            return a3;
        }
        throw new IllegalStateException("state: " + this.f57632d);
    }

    @Override // com.squareup.a.a.b.j
    public final void a(h hVar) {
        this.f57633e = hVar;
    }

    public static void a(m mVar) {
        ab abVar = mVar.f158879a;
        mVar.a(ab.NONE);
        abVar.clearDeadline();
        abVar.clearTimeout();
    }

    public final aa a(long j2) {
        if (this.f57632d == 4) {
            this.f57632d = 5;
            return new C1276e(j2);
        }
        throw new IllegalStateException("state: " + this.f57632d);
    }

    @Override // com.squareup.a.a.b.j
    public final com.squareup.a.y a(x xVar) {
        aa fVar;
        if (!h.c(xVar)) {
            fVar = a(0);
        } else if ("chunked".equalsIgnoreCase(xVar.a("Transfer-Encoding"))) {
            h hVar = this.f57633e;
            if (this.f57632d == 4) {
                this.f57632d = 5;
                fVar = new c(hVar);
            } else {
                throw new IllegalStateException("state: " + this.f57632d);
            }
        } else {
            long a2 = k.a(xVar.f57936f);
            if (a2 != -1) {
                fVar = a(a2);
            } else if (this.f57632d == 4) {
                s sVar = this.f57629a;
                if (sVar != null) {
                    this.f57632d = 5;
                    sVar.a(true, false, false);
                    fVar = new f(this, (byte) 0);
                } else {
                    throw new IllegalStateException("streamAllocation == null");
                }
            } else {
                throw new IllegalStateException("state: " + this.f57632d);
            }
        }
        return new l(xVar.f57936f, q.a(fVar));
    }

    @Override // com.squareup.a.a.b.j
    public final void a(o oVar) {
        if (this.f57632d == 1) {
            this.f57632d = 3;
            oVar.a(this.f57631c);
            return;
        }
        throw new IllegalStateException("state: " + this.f57632d);
    }

    @Override // com.squareup.a.a.b.j
    public final void a(v vVar) {
        this.f57633e.a();
        Proxy.Type type = this.f57633e.f57672c.a().a().f57953b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(vVar.f57920b);
        sb.append(' ');
        if (vVar.f57919a.c() || type != Proxy.Type.HTTP) {
            sb.append(n.a(vVar.f57919a));
        } else {
            sb.append(vVar.f57919a);
        }
        sb.append(" HTTP/1.1");
        a(vVar.f57921c, sb.toString());
    }

    @Override // com.squareup.a.a.b.j
    public final y a(v vVar, long j2) {
        if ("chunked".equalsIgnoreCase(vVar.a("Transfer-Encoding"))) {
            if (this.f57632d == 1) {
                this.f57632d = 2;
                return new b(this, (byte) 0);
            }
            throw new IllegalStateException("state: " + this.f57632d);
        } else if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f57632d == 1) {
            this.f57632d = 2;
            return new d(this, j2, (byte) 0);
        } else {
            throw new IllegalStateException("state: " + this.f57632d);
        }
    }

    public final void a(p pVar, String str) {
        if (this.f57632d == 0) {
            this.f57631c.a(str).a("\r\n");
            int length = pVar.f57876a.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                this.f57631c.a(pVar.a(i2)).a(": ").a(pVar.b(i2)).a("\r\n");
            }
            this.f57631c.a("\r\n");
            this.f57632d = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f57632d);
    }

    public e(s sVar, h hVar, g gVar) {
        this.f57629a = sVar;
        this.f57630b = hVar;
        this.f57631c = gVar;
    }
}
