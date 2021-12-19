package com.ttnet.org.chromium.net.impl;

import android.net.TrafficStats;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.net.aa;
import com.ttnet.org.chromium.net.ab;
import com.ttnet.org.chromium.net.ac;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import com.ttnet.org.chromium.net.j;
import com.ttnet.org.chromium.net.y;
import com.ttnet.org.chromium.net.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class h extends p {

    /* renamed from: a  reason: collision with root package name */
    public static final String f155690a = h.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final a f155691b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f155692c;

    /* renamed from: d  reason: collision with root package name */
    public final String f155693d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f155694e = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f155695f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<Integer> f155696g = new AtomicReference<>(0);

    /* renamed from: h  reason: collision with root package name */
    public final boolean f155697h;

    /* renamed from: i  reason: collision with root package name */
    public String f155698i;

    /* renamed from: j  reason: collision with root package name */
    public VersionSafeCallbacks.e f155699j;

    /* renamed from: k  reason: collision with root package name */
    public Executor f155700k;

    /* renamed from: l  reason: collision with root package name */
    public volatile int f155701l = -1;

    /* renamed from: m  reason: collision with root package name */
    public String f155702m;
    public ReadableByteChannel n;
    public r o;
    public String p;
    public HttpURLConnection q;
    public d r;
    private final AtomicBoolean t = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    public interface b {
        static {
            Covode.recordClassIndex(103519);
        }

        void a();
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void a(long j2) {
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void a(String str, String str2) {
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void b(int i2) {
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void c(int i2) {
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void d(int i2) {
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final String e() {
        return "";
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void e(int i2) {
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void f() {
    }

    /* access modifiers changed from: package-private */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        final VersionSafeCallbacks.f f155729a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f155730b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f155731c;

        static {
            Covode.recordClassIndex(103512);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            a(new b() {
                /* class com.ttnet.org.chromium.net.impl.h.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(103514);
                }

                @Override // com.ttnet.org.chromium.net.impl.h.b
                public final void a() {
                    if (h.this.f155696g.compareAndSet(1, 4)) {
                        a.this.f155729a.b(h.this, h.this.o, "");
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public final void a(b bVar) {
            try {
                this.f155730b.execute(new Runnable(bVar) {
                    /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass13 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f155716a;

                    static {
                        Covode.recordClassIndex(103502);
                    }

                    public final void run() {
                        try {
                            this.f155716a.a();
                        } catch (Throwable th) {
                            h.this.a((com.ttnet.org.chromium.net.d) new b("Exception received from UrlRequest.Callback", th));
                        }
                    }

                    {
                        this.f155716a = r2;
                    }
                });
            } catch (RejectedExecutionException e2) {
                h.this.a((com.ttnet.org.chromium.net.d) new d("Exception posting task to executor", e2));
            }
        }

        a(ab.b bVar, Executor executor) {
            this.f155729a = new VersionSafeCallbacks.f(bVar);
            if (h.this.f155697h) {
                this.f155730b = executor;
                this.f155731c = null;
                return;
            }
            this.f155730b = new c(executor);
            this.f155731c = executor;
        }
    }

    final class d extends aa {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReference<Integer> f155751a = new AtomicReference<>(3);

        /* renamed from: b  reason: collision with root package name */
        final Executor f155752b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f155753c;

        /* renamed from: d  reason: collision with root package name */
        final HttpURLConnection f155754d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicBoolean f155755e = new AtomicBoolean(false);

        /* renamed from: f  reason: collision with root package name */
        WritableByteChannel f155756f;

        /* renamed from: g  reason: collision with root package name */
        OutputStream f155757g;

        /* renamed from: h  reason: collision with root package name */
        final VersionSafeCallbacks.e f155758h;

        /* renamed from: i  reason: collision with root package name */
        ByteBuffer f155759i;

        /* renamed from: j  reason: collision with root package name */
        long f155760j;

        /* renamed from: k  reason: collision with root package name */
        long f155761k;

        static {
            Covode.recordClassIndex(103522);
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            c();
            h.this.g();
        }

        @Override // com.ttnet.org.chromium.net.aa
        public final void a() {
            if (this.f155751a.compareAndSet(1, 2)) {
                b();
                return;
            }
            throw new IllegalStateException("Not expecting a read result");
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            this.f155753c.execute(h.this.a(new b() {
                /* class com.ttnet.org.chromium.net.impl.h.d.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(103526);
                }

                @Override // com.ttnet.org.chromium.net.impl.h.b
                public final void a() {
                    if (d.this.f155756f == null) {
                        h.this.f155701l = 10;
                        d.this.f155754d.setDoOutput(true);
                        d.this.f155754d.connect();
                        h.this.f155701l = 12;
                        d dVar = d.this;
                        dVar.f155757g = dVar.f155754d.getOutputStream();
                        d dVar2 = d.this;
                        dVar2.f155756f = Channels.newChannel(dVar2.f155757g);
                    }
                    d.this.f155751a.set(0);
                    d.this.a(new b() {
                        /* class com.ttnet.org.chromium.net.impl.h.d.AnonymousClass3.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(103527);
                        }

                        @Override // com.ttnet.org.chromium.net.impl.h.b
                        public final void a() {
                            d.this.f155758h.a(d.this, d.this.f155759i);
                        }
                    });
                }
            }));
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            if (this.f155756f != null && this.f155755e.compareAndSet(false, true)) {
                this.f155756f.close();
            }
        }

        @Override // com.ttnet.org.chromium.net.aa
        public final void a(Exception exc) {
            h.this.a(exc);
        }

        public final void a(b bVar) {
            try {
                this.f155752b.execute(h.this.b(bVar));
            } catch (RejectedExecutionException e2) {
                h.this.a(e2);
            }
        }

        @Override // com.ttnet.org.chromium.net.aa
        public final void a(final boolean z) {
            if (this.f155751a.compareAndSet(0, 2)) {
                this.f155753c.execute(h.this.a(new b() {
                    /* class com.ttnet.org.chromium.net.impl.h.d.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(103524);
                    }

                    @Override // com.ttnet.org.chromium.net.impl.h.b
                    public final void a() {
                        d.this.f155759i.flip();
                        if (d.this.f155760j == -1 || d.this.f155760j - d.this.f155761k >= ((long) d.this.f155759i.remaining())) {
                            while (d.this.f155759i.hasRemaining()) {
                                d.this.f155761k += (long) d.this.f155756f.write(d.this.f155759i);
                            }
                            d.this.f155757g.flush();
                            if (d.this.f155761k < d.this.f155760j || (d.this.f155760j == -1 && !z)) {
                                d.this.f155759i.clear();
                                d.this.f155751a.set(0);
                                d.this.a(new b() {
                                    /* class com.ttnet.org.chromium.net.impl.h.d.AnonymousClass2.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(103525);
                                    }

                                    @Override // com.ttnet.org.chromium.net.impl.h.b
                                    public final void a() {
                                        d.this.f155758h.a(d.this, d.this.f155759i);
                                    }
                                });
                            } else if (d.this.f155760j == -1) {
                                d.this.d();
                            } else if (d.this.f155760j == d.this.f155761k) {
                                d.this.d();
                            } else {
                                h.this.a(new IllegalArgumentException(com.a.a("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(d.this.f155761k), Long.valueOf(d.this.f155760j)})));
                            }
                        } else {
                            h.this.a(new IllegalArgumentException(com.a.a("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(d.this.f155761k + ((long) d.this.f155759i.remaining())), Long.valueOf(d.this.f155760j)})));
                        }
                    }
                }));
                return;
            }
            throw new IllegalStateException("Not expecting a read result, expecting: " + this.f155751a.get());
        }

        d(final Executor executor, Executor executor2, HttpURLConnection httpURLConnection, VersionSafeCallbacks.e eVar) {
            this.f155752b = new Executor(h.this) {
                /* class com.ttnet.org.chromium.net.impl.h.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(103523);
                }

                public final void execute(Runnable runnable) {
                    try {
                        executor.execute(runnable);
                    } catch (RejectedExecutionException e2) {
                        h.this.a(e2);
                    }
                }
            };
            this.f155753c = executor2;
            this.f155754d = httpURLConnection;
            this.f155758h = eVar;
        }
    }

    static {
        Covode.recordClassIndex(103495);
    }

    private void l() {
        this.f155692c.execute(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass5 */

            static {
                Covode.recordClassIndex(103507);
            }

            public final void run() {
                if (h.this.n != null) {
                    try {
                        h.this.n.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    h.this.n = null;
                }
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void a() {
        this.f155701l = 10;
        a(0, 1, new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass6 */

            static {
                Covode.recordClassIndex(103508);
            }

            public final void run() {
                h.this.f155695f.add(h.this.f155702m);
                h.this.i();
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void b() {
        a(3, 1, new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass7 */

            static {
                Covode.recordClassIndex(103509);
            }

            public final void run() {
                h hVar = h.this;
                hVar.f155702m = hVar.p;
                h.this.p = null;
                h.this.i();
            }
        });
    }

    public final void i() {
        this.f155692c.execute(a(new b() {
            /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass11 */

            static {
                Covode.recordClassIndex(103500);
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x008c A[LOOP:0: B:18:0x0086->B:20:0x008c, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x00df  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0128  */
            @Override // com.ttnet.org.chromium.net.impl.h.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a() {
                /*
                // Method dump skipped, instructions count: 318
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.h.AnonymousClass11.a():void");
            }
        }));
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        this.f155692c.execute(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass4 */

            static {
                Covode.recordClassIndex(103506);
            }

            public final void run() {
                if (h.this.r != null) {
                    try {
                        h.this.r.c();
                    } catch (IOException unused) {
                    }
                }
                if (h.this.q != null) {
                    h.this.q.disconnect();
                    h.this.q = null;
                }
            }
        });
    }

    static final class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f155747a;

        static {
            Covode.recordClassIndex(103520);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public Thread f155748a;

            /* renamed from: b  reason: collision with root package name */
            public j f155749b;

            /* renamed from: c  reason: collision with root package name */
            private final Runnable f155750c;

            static {
                Covode.recordClassIndex(103521);
            }

            public final void run() {
                if (Thread.currentThread() == this.f155748a) {
                    this.f155749b = new j();
                } else {
                    this.f155750c.run();
                }
            }

            private a(Runnable runnable, Thread thread) {
                this.f155750c = runnable;
                this.f155748a = thread;
            }

            /* synthetic */ a(Runnable runnable, Thread thread, byte b2) {
                this(runnable, thread);
            }
        }

        c(Executor executor) {
            this.f155747a = executor;
        }

        public final void execute(Runnable runnable) {
            a aVar = new a(runnable, Thread.currentThread(), (byte) 0);
            this.f155747a.execute(aVar);
            if (aVar.f155749b == null) {
                aVar.f155748a = null;
                return;
            }
            throw aVar.f155749b;
        }
    }

    private void k() {
        int intValue = this.f155696g.get().intValue();
        if (intValue != 0) {
            throw new IllegalStateException("Request is already started. State is: ".concat(String.valueOf(intValue)));
        }
    }

    public final void g() {
        this.f155701l = 13;
        this.f155692c.execute(a(new b() {
            /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass8 */

            static {
                Covode.recordClassIndex(103510);
            }

            @Override // com.ttnet.org.chromium.net.impl.h.b
            public final void a() {
                ReadableByteChannel a2;
                if (h.this.q != null) {
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    String str = "http/1.1";
                    while (true) {
                        String headerFieldKey = h.this.q.getHeaderFieldKey(i2);
                        if (headerFieldKey == null) {
                            break;
                        }
                        if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                            str = h.this.q.getHeaderField(i2);
                        }
                        if (!headerFieldKey.startsWith("X-Android")) {
                            arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, h.this.q.getHeaderField(i2)));
                        }
                        i2++;
                    }
                    int responseCode = h.this.q.getResponseCode();
                    h.this.o = new r(new ArrayList(h.this.f155695f), responseCode, h.this.q.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "", 0);
                    if (responseCode < 300 || responseCode >= 400) {
                        h.this.h();
                        if (responseCode >= 400) {
                            InputStream errorStream = h.this.q.getErrorStream();
                            h hVar = h.this;
                            if (errorStream == null) {
                                a2 = null;
                            } else {
                                a2 = g.a(errorStream);
                            }
                            hVar.n = a2;
                            h.this.f155691b.a();
                            return;
                        }
                        h hVar2 = h.this;
                        hVar2.n = g.a(hVar2.q.getInputStream());
                        h.this.f155691b.a();
                        return;
                    }
                    h hVar3 = h.this;
                    hVar3.a(1, 2, new Runnable(hVar3.o.f155818a.a()) {
                        /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass10 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ Map f155710a;

                        static {
                            Covode.recordClassIndex(103498);
                        }

                        public final void run() {
                            h hVar = h.this;
                            hVar.p = URI.create(hVar.f155702m).resolve((String) ((List) this.f155710a.get("location")).get(0)).toString();
                            h.this.f155695f.add(h.this.p);
                            h.this.a(2, 3, new Runnable() {
                                /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass10.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(103499);
                                }

                                public final void run() {
                                    a aVar = h.this.f155691b;
                                    aVar.a(new b(h.this.o, h.this.p) {
                                        /* class com.ttnet.org.chromium.net.impl.h.a.AnonymousClass1 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ ac f155733a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ String f155734b;

                                        static {
                                            Covode.recordClassIndex(103513);
                                        }

                                        @Override // com.ttnet.org.chromium.net.impl.h.b
                                        public final void a() {
                                            a.this.f155729a.a(h.this, this.f155733a, this.f155734b);
                                        }

                                        {
                                            this.f155733a = r2;
                                            this.f155734b = r3;
                                        }
                                    });
                                }
                            });
                        }

                        {
                            this.f155710a = r2;
                        }
                    });
                }
            }
        }));
    }

    public final void h() {
        if (this.f155699j != null && this.t.compareAndSet(false, true)) {
            try {
                this.f155700k.execute(b(new b() {
                    /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(103511);
                    }

                    @Override // com.ttnet.org.chromium.net.impl.h.b
                    public final void a() {
                        h.this.f155699j.close();
                    }
                }));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void c() {
        int intValue = this.f155696g.getAndSet(8).intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4 || intValue == 5) {
            j();
            h();
            a aVar = this.f155691b;
            r rVar = this.o;
            h.this.l();
            aVar.f155730b.execute(new Runnable(rVar) {
                /* class com.ttnet.org.chromium.net.impl.h.a.AnonymousClass4 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ac f155740a;

                static {
                    Covode.recordClassIndex(103516);
                }

                public final void run() {
                    try {
                        a.this.f155729a.b(h.this, this.f155740a);
                    } catch (Exception unused) {
                    }
                }

                {
                    this.f155740a = r2;
                }
            });
        }
    }

    public final Runnable a(final b bVar) {
        return new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass12 */

            static {
                Covode.recordClassIndex(103501);
            }

            public final void run() {
                try {
                    bVar.a();
                } catch (Throwable th) {
                    h.this.a((com.ttnet.org.chromium.net.d) new d("System error", th));
                }
            }
        };
    }

    public final Runnable b(final b bVar) {
        return new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass2 */

            static {
                Covode.recordClassIndex(103503);
            }

            public final void run() {
                try {
                    bVar.a();
                } catch (Throwable th) {
                    h.this.a(th);
                }
            }
        };
    }

    static final class e implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f155773a;

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f155774b = new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.h.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103530);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
                if (r3 == null) goto L_0x0070;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
                r3.run();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
                r2 = r6.f155777a.f155775c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
                monitor-enter(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
                r3 = r6.f155777a.f155775c.pollFirst();
                r1 = r6.f155777a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
                if (r3 == null) goto L_0x0045;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
                r0 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
                r0 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
                r1.f155776d = r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
                monitor-exit(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(13812);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
                r3 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
                monitor-enter(r6.f155777a.f155775c);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
                r6.f155777a.f155776d = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
                r6.f155777a.f155773a.execute(r6.f155777a.f155774b);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0066, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(13812);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x0069, code lost:
                throw r3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x006a, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x006c, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(13812);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x006f, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x0070, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(13812);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x0073, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 122
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.h.e.AnonymousClass1.run():void");
            }
        };

        /* renamed from: c  reason: collision with root package name */
        public final ArrayDeque<Runnable> f155775c = new ArrayDeque<>();

        /* renamed from: d  reason: collision with root package name */
        public boolean f155776d;

        static {
            Covode.recordClassIndex(103529);
        }

        e(Executor executor) {
            this.f155773a = executor;
        }

        public final void execute(Runnable runnable) {
            MethodCollector.i(12480);
            synchronized (this.f155775c) {
                try {
                    this.f155775c.addLast(runnable);
                    try {
                        this.f155773a.execute(this.f155774b);
                    } catch (RejectedExecutionException unused) {
                        this.f155775c.removeLast();
                    }
                } finally {
                    MethodCollector.o(12480);
                }
            }
        }
    }

    public final void a(com.ttnet.org.chromium.net.d dVar) {
        int intValue;
        do {
            intValue = this.f155696g.get().intValue();
            if (intValue == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            } else if (intValue == 6 || intValue == 7 || intValue == 8) {
                return;
            }
        } while (!this.f155696g.compareAndSet(Integer.valueOf(intValue), 6));
        j();
        h();
        a aVar = this.f155691b;
        r rVar = this.o;
        h.this.l();
        a.AnonymousClass6 r1 = new Runnable(rVar, dVar) {
            /* class com.ttnet.org.chromium.net.impl.h.a.AnonymousClass6 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ac f155744a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ttnet.org.chromium.net.d f155745b;

            static {
                Covode.recordClassIndex(103518);
            }

            public final void run() {
                try {
                    a.this.f155729a.a(h.this, this.f155744a, this.f155745b);
                } catch (Exception unused) {
                }
            }

            {
                this.f155744a = r2;
                this.f155745b = r3;
            }
        };
        try {
            aVar.f155730b.execute(r1);
        } catch (j unused) {
            if (aVar.f155731c != null) {
                aVar.f155731c.execute(r1);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void a(String str) {
        k();
        Objects.requireNonNull(str, "Method is required.");
        if (com.bytedance.d.a.a.a.a.a.f28515e.equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || com.bytedance.d.a.a.a.a.a.f28513c.equalsIgnoreCase(str) || com.bytedance.d.a.a.a.a.a.f28514d.equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            this.f155698i = str;
            return;
        }
        throw new IllegalArgumentException("Invalid http method ".concat(String.valueOf(str)));
    }

    public final void a(Throwable th) {
        a((com.ttnet.org.chromium.net.d) new b("Exception received from UploadDataProvider", th));
    }

    @Override // com.ttnet.org.chromium.net.ab
    public final void a(final ByteBuffer byteBuffer) {
        k.a(byteBuffer);
        k.b(byteBuffer);
        a(4, 5, new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass3 */

            static {
                Covode.recordClassIndex(103504);
            }

            public final void run() {
                h.this.f155692c.execute(h.this.a(new b() {
                    /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(103505);
                    }

                    @Override // com.ttnet.org.chromium.net.impl.h.b
                    public final void a() {
                        int read;
                        if (h.this.n == null) {
                            read = -1;
                        } else {
                            read = h.this.n.read(byteBuffer);
                        }
                        h hVar = h.this;
                        ByteBuffer byteBuffer = byteBuffer;
                        if (read != -1) {
                            a aVar = hVar.f155691b;
                            aVar.a(new b(hVar.o, byteBuffer) {
                                /* class com.ttnet.org.chromium.net.impl.h.a.AnonymousClass3 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ ac f155737a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ ByteBuffer f155738b;

                                static {
                                    Covode.recordClassIndex(103515);
                                }

                                @Override // com.ttnet.org.chromium.net.impl.h.b
                                public final void a() {
                                    if (h.this.f155696g.compareAndSet(5, 4)) {
                                        a.this.f155729a.a(h.this, this.f155737a, this.f155738b);
                                    }
                                }

                                {
                                    this.f155737a = r2;
                                    this.f155738b = r3;
                                }
                            });
                            return;
                        }
                        if (hVar.n != null) {
                            hVar.n.close();
                        }
                        if (hVar.f155696g.compareAndSet(5, 7)) {
                            hVar.j();
                            a aVar2 = hVar.f155691b;
                            aVar2.f155730b.execute(new Runnable(hVar.o) {
                                /* class com.ttnet.org.chromium.net.impl.h.a.AnonymousClass5 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ ac f155742a;

                                static {
                                    Covode.recordClassIndex(103517);
                                }

                                public final void run() {
                                    try {
                                        a.this.f155729a.a(h.this, this.f155742a);
                                    } catch (Exception unused) {
                                    }
                                }

                                {
                                    this.f155742a = r2;
                                }
                            });
                        }
                    }
                }));
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void a(z zVar, Executor executor) {
        Objects.requireNonNull(zVar, "Invalid UploadDataProvider.");
        if (this.f155694e.containsKey("Content-Type")) {
            k();
            if (this.f155698i == null) {
                this.f155698i = "POST";
            }
            this.f155699j = new VersionSafeCallbacks.e(zVar);
            if (this.f155697h) {
                this.f155700k = executor;
            } else {
                this.f155700k = new c(executor);
            }
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.p
    public final void b(String str, String str2) {
        k();
        int i2 = 0;
        while (true) {
            if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (!(charAt == ',' || charAt == '/' || charAt == '{' || charAt == '}')) {
                    switch (charAt) {
                        case '\'':
                        case '(':
                        case ')':
                            break;
                        default:
                            switch (charAt) {
                                case ':':
                                case ';':
                                case AudiencePingIntervalSetting.DEFAULT:
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (charAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            if (!Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                                                i2++;
                                            }
                                    }
                            }
                    }
                }
            } else if (!str2.contains("\r\n")) {
                if (this.f155694e.containsKey(str)) {
                    this.f155694e.remove(str);
                }
                this.f155694e.put(str, str2);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
    }

    public final void a(int i2, int i3, Runnable runnable) {
        if (!this.f155696g.compareAndSet(Integer.valueOf(i2), Integer.valueOf(i3))) {
            int intValue = this.f155696g.get().intValue();
            if (intValue != 8 && intValue != 6) {
                throw new IllegalStateException("Invalid state transition - expected " + i2 + " but was " + intValue);
            }
            return;
        }
        runnable.run();
    }

    h(ab.b bVar, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i2, final boolean z3, final int i3) {
        final int i4 = i2;
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(bVar, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        Objects.requireNonNull(executor2, "userExecutor is required");
        this.f155697h = z;
        this.f155691b = new a(bVar, executor2);
        i4 = !z2 ? TrafficStats.getThreadStatsTag() : i4;
        this.f155692c = new e(new Executor() {
            /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103496);
            }

            public final void execute(final Runnable runnable) {
                executor.execute(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.h.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(103497);
                    }

                    public final void run() {
                        int threadStatsTag = TrafficStats.getThreadStatsTag();
                        TrafficStats.setThreadStatsTag(i4);
                        if (z3) {
                            y.a(i3);
                        }
                        try {
                            runnable.run();
                        } finally {
                            if (z3) {
                                y.a();
                            }
                            TrafficStats.setThreadStatsTag(threadStatsTag);
                        }
                    }
                });
            }
        });
        this.f155702m = str;
        this.f155693d = str2;
    }
}
