package com.squareup.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.a.a.a.b;
import com.squareup.a.a.f;
import com.squareup.a.a.j;
import com.squareup.a.u;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.g;
import k.h;
import k.i;

public final class d implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f57427a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), j.b("OkHttp FramedConnection"));
    static final /* synthetic */ boolean v = true;

    /* renamed from: b  reason: collision with root package name */
    public final u f57428b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f57429c;

    /* renamed from: d  reason: collision with root package name */
    public final b f57430d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Integer, e> f57431e;

    /* renamed from: f  reason: collision with root package name */
    public final String f57432f;

    /* renamed from: g  reason: collision with root package name */
    public int f57433g;

    /* renamed from: h  reason: collision with root package name */
    public int f57434h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f57435i;

    /* renamed from: j  reason: collision with root package name */
    final ExecutorService f57436j;

    /* renamed from: k  reason: collision with root package name */
    public final m f57437k;

    /* renamed from: l  reason: collision with root package name */
    long f57438l;

    /* renamed from: m  reason: collision with root package name */
    long f57439m;
    public n n;
    final n o;
    public boolean p;
    final p q;
    final Socket r;
    public final c s;
    final c t;
    public final Set<Integer> u;
    private long w;
    private Map<Integer, l> x;
    private int y;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Socket f57466a;

        /* renamed from: b  reason: collision with root package name */
        public String f57467b;

        /* renamed from: c  reason: collision with root package name */
        public h f57468c;

        /* renamed from: d  reason: collision with root package name */
        public g f57469d;

        /* renamed from: e  reason: collision with root package name */
        public b f57470e = b.f57474a;

        /* renamed from: f  reason: collision with root package name */
        public u f57471f = u.SPDY_3;

        /* renamed from: g  reason: collision with root package name */
        public m f57472g = m.f57565a;

        /* renamed from: h  reason: collision with root package name */
        public boolean f57473h = true;

        static {
            Covode.recordClassIndex(35889);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = java.lang.Math.min((int) java.lang.Math.min(r12, r0), r8.s.c());
        r0 = (long) r4;
        r8.f57439m -= r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r9, boolean r10, k.f r11, long r12) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.a.d.a(int, boolean, k.f, long):void");
    }

    public final void a(boolean z, int i2, int i3, l lVar) {
        MethodCollector.i(13494);
        synchronized (this.s) {
            if (lVar != null) {
                try {
                    if (lVar.f57563b == -1) {
                        lVar.f57563b = System.nanoTime();
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.o(13494);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13494);
                    throw th;
                }
            }
            this.s.a(z, i2, i3);
        }
        MethodCollector.o(13494);
    }

    public final void a(a aVar, a aVar2) {
        IOException e2;
        int i2;
        e[] eVarArr;
        MethodCollector.i(13704);
        if (v || !Thread.holdsLock(this)) {
            l[] lVarArr = null;
            try {
                a(aVar);
                e2 = null;
            } catch (IOException e3) {
                e2 = e3;
            }
            synchronized (this) {
                try {
                    if (!this.f57431e.isEmpty()) {
                        eVarArr = (e[]) this.f57431e.values().toArray(new e[this.f57431e.size()]);
                        this.f57431e.clear();
                        a(false);
                    } else {
                        eVarArr = null;
                    }
                    Map<Integer, l> map = this.x;
                    if (map != null) {
                        l[] lVarArr2 = (l[]) map.values().toArray(new l[this.x.size()]);
                        this.x = null;
                        lVarArr = lVarArr2;
                    }
                } finally {
                    MethodCollector.o(13704);
                }
            }
            if (eVarArr != null) {
                for (e eVar : eVarArr) {
                    try {
                        eVar.a(aVar2);
                    } catch (IOException e4) {
                        if (e2 != null) {
                            e2 = e4;
                        }
                    }
                }
            }
            if (lVarArr != null) {
                for (l lVar : lVarArr) {
                    lVar.a();
                }
            }
            try {
                this.s.close();
            } catch (IOException e5) {
                if (e2 == null) {
                    e2 = e5;
                }
            }
            try {
                this.r.close();
                if (e2 == null) {
                    MethodCollector.o(13704);
                    return;
                }
            } catch (IOException e6) {
                e2 = e6;
            }
            throw e2;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.o(13704);
        throw assertionError;
    }

    class c extends f implements b.a {

        /* renamed from: b  reason: collision with root package name */
        final b f57475b;

        static {
            Covode.recordClassIndex(35892);
        }

        @Override // com.squareup.a.a.a.b.a
        public final void a(boolean z, int i2, h hVar, int i3) {
            if (d.this.d(i2)) {
                d dVar = d.this;
                k.f fVar = new k.f();
                long j2 = (long) i3;
                hVar.d(j2);
                hVar.read(fVar, j2);
                if (fVar.f158864b == j2) {
                    dVar.f57436j.execute(new f("OkHttp %s Push Data[%s]", new Object[]{dVar.f57432f, Integer.valueOf(i2)}, i2, fVar, i3, z) {
                        /* class com.squareup.a.a.a.d.AnonymousClass6 */

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ int f57458b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ k.f f57459c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ int f57460d;

                        /* renamed from: e  reason: collision with root package name */
                        final /* synthetic */ boolean f57461e;

                        static {
                            Covode.recordClassIndex(35887);
                        }

                        @Override // com.squareup.a.a.f
                        public final void a() {
                            MethodCollector.i(13922);
                            try {
                                d.this.f57437k.a(this.f57459c, this.f57460d);
                                d.this.s.a(this.f57458b, a.CANCEL);
                                synchronized (d.this) {
                                    try {
                                        d.this.u.remove(Integer.valueOf(this.f57458b));
                                    } finally {
                                        MethodCollector.o(13922);
                                    }
                                }
                            } catch (IOException unused) {
                                MethodCollector.o(13922);
                            }
                        }

                        {
                            this.f57458b = r4;
                            this.f57459c = r5;
                            this.f57460d = r6;
                            this.f57461e = r7;
                        }
                    });
                    return;
                }
                throw new IOException(fVar.f158864b + " != " + i3);
            }
            e a2 = d.this.a(i2);
            if (a2 == null) {
                d.this.a(i2, a.INVALID_STREAM);
                hVar.l((long) i3);
            } else if (e.f57482l || !Thread.holdsLock(a2)) {
                a2.f57489g.a(hVar, (long) i3);
                if (z) {
                    a2.e();
                }
            } else {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c1, code lost:
            if (r25.failIfStreamPresent() == false) goto L_0x00d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
            r3.b(com.squareup.a.a.a.a.PROTOCOL_ERROR);
            r20.f57476c.b(r23);
            com.bytedance.frameworks.apm.trace.MethodCollector.o(14287);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d3, code lost:
            if (com.squareup.a.a.a.e.f57482l != false) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
            if (java.lang.Thread.holdsLock(r3) != false) goto L_0x012c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00db, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
            if (r3.f57488f != null) goto L_0x00f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e5, code lost:
            if (r25.failIfHeadersAbsent() == false) goto L_0x00eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e7, code lost:
            r2 = com.squareup.a.a.a.a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
            r3.f57488f = r24;
            r10 = r3.a();
            r3.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f9, code lost:
            if (r25.failIfHeadersPresent() == false) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
            r2 = com.squareup.a.a.a.a.STREAM_IN_USE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
            r1 = new java.util.ArrayList();
            r1.addAll(r3.f57488f);
            r1.addAll(r24);
            r3.f57488f = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
            if (r2 == null) goto L_0x011c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0110, code lost:
            r3.b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0113, code lost:
            if (r22 == false) goto L_0x0118;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0115, code lost:
            r3.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x011b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x011c, code lost:
            if (r10 != false) goto L_0x0113;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x011e, code lost:
            r3.f57486d.b(r3.f57485c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0126, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0128, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(14287);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x012b, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x012c, code lost:
            r0 = new java.lang.AssertionError();
            com.bytedance.frameworks.apm.trace.MethodCollector.o(14287);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0134, code lost:
            throw r0;
         */
        @Override // com.squareup.a.a.a.b.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r21, boolean r22, int r23, java.util.List<com.squareup.a.a.a.f> r24, com.squareup.a.a.a.g r25) {
            /*
            // Method dump skipped, instructions count: 315
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.a.d.c.a(boolean, boolean, int, java.util.List, com.squareup.a.a.a.g):void");
        }

        @Override // com.squareup.a.a.a.b.a
        public final void a(boolean z, final n nVar) {
            int i2;
            e[] eVarArr;
            long j2;
            MethodCollector.i(14323);
            synchronized (d.this) {
                try {
                    int b2 = d.this.o.b();
                    if (z) {
                        n nVar2 = d.this.o;
                        nVar2.f57568c = 0;
                        nVar2.f57567b = 0;
                        nVar2.f57566a = 0;
                        Arrays.fill(nVar2.f57569d, 0);
                    }
                    n nVar3 = d.this.o;
                    int i3 = 0;
                    while (true) {
                        if (nVar.a(i3)) {
                            nVar3.a(i3, nVar.b(i3), nVar.f57569d[i3]);
                        }
                        i3++;
                        if (i3 >= 10) {
                            break;
                        }
                    }
                    if (d.this.f57428b == u.HTTP_2) {
                        d.f57427a.execute(new f("OkHttp %s ACK Settings", new Object[]{d.this.f57432f}) {
                            /* class com.squareup.a.a.a.d.c.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(35895);
                            }

                            @Override // com.squareup.a.a.f
                            public final void a() {
                                try {
                                    d.this.s.a(nVar);
                                } catch (IOException unused) {
                                }
                            }
                        });
                    }
                    int b3 = d.this.o.b();
                    eVarArr = null;
                    if (b3 == -1 || b3 == b2) {
                        j2 = 0;
                    } else {
                        j2 = (long) (b3 - b2);
                        if (!d.this.p) {
                            d dVar = d.this;
                            dVar.f57439m += j2;
                            if (j2 > 0) {
                                dVar.notifyAll();
                            }
                            d.this.p = true;
                        }
                        if (!d.this.f57431e.isEmpty()) {
                            eVarArr = (e[]) d.this.f57431e.values().toArray(new e[d.this.f57431e.size()]);
                        }
                    }
                    d.f57427a.execute(new f("OkHttp %s settings", d.this.f57432f) {
                        /* class com.squareup.a.a.a.d.c.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(35894);
                        }

                        @Override // com.squareup.a.a.f
                        public final void a() {
                        }
                    });
                } finally {
                    MethodCollector.o(14323);
                }
            }
            if (!(eVarArr == null || j2 == 0)) {
                for (e eVar : eVarArr) {
                    synchronized (eVar) {
                        try {
                            eVar.a(j2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            MethodCollector.o(14323);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r3 = com.squareup.a.a.a.a.PROTOCOL_ERROR;
            r1 = com.squareup.a.a.a.a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r0 = r4.f57476c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r4.f57476c.a(r3, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
            com.squareup.a.a.j.a(r4.f57475b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
            throw r1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001e */
        @Override // com.squareup.a.a.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r4 = this;
                com.squareup.a.a.a.a r3 = com.squareup.a.a.a.a.INTERNAL_ERROR
                com.squareup.a.a.a.a r2 = com.squareup.a.a.a.a.INTERNAL_ERROR
                com.squareup.a.a.a.d r0 = com.squareup.a.a.a.d.this     // Catch:{ IOException -> 0x001e }
                boolean r0 = r0.f57429c     // Catch:{ IOException -> 0x001e }
                if (r0 != 0) goto L_0x000f
                com.squareup.a.a.a.b r0 = r4.f57475b     // Catch:{ IOException -> 0x001e }
                r0.a()     // Catch:{ IOException -> 0x001e }
            L_0x000f:
                com.squareup.a.a.a.b r0 = r4.f57475b     // Catch:{ IOException -> 0x001e }
                boolean r0 = r0.a(r4)     // Catch:{ IOException -> 0x001e }
                if (r0 != 0) goto L_0x000f
                com.squareup.a.a.a.a r3 = com.squareup.a.a.a.a.NO_ERROR     // Catch:{ IOException -> 0x001e }
                com.squareup.a.a.a.a r1 = com.squareup.a.a.a.a.CANCEL     // Catch:{ IOException -> 0x001e }
                com.squareup.a.a.a.d r0 = com.squareup.a.a.a.d.this     // Catch:{ IOException -> 0x0027 }
                goto L_0x0024
            L_0x001e:
                com.squareup.a.a.a.a r3 = com.squareup.a.a.a.a.PROTOCOL_ERROR     // Catch:{ all -> 0x002d }
                com.squareup.a.a.a.a r1 = com.squareup.a.a.a.a.PROTOCOL_ERROR     // Catch:{ all -> 0x002d }
                com.squareup.a.a.a.d r0 = com.squareup.a.a.a.d.this
            L_0x0024:
                r0.a(r3, r1)
            L_0x0027:
                com.squareup.a.a.a.b r0 = r4.f57475b
                com.squareup.a.a.j.a(r0)
                return
            L_0x002d:
                r1 = move-exception
                com.squareup.a.a.a.d r0 = com.squareup.a.a.a.d.this     // Catch:{ IOException -> 0x0033 }
                r0.a(r3, r2)     // Catch:{ IOException -> 0x0033 }
            L_0x0033:
                com.squareup.a.a.a.b r0 = r4.f57475b
                com.squareup.a.a.j.a(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.a.d.c.a():void");
        }

        private c(b bVar) {
            super("OkHttp %s", d.this.f57432f);
            this.f57475b = bVar;
        }

        @Override // com.squareup.a.a.a.b.a
        public final void a(int i2, long j2) {
            MethodCollector.i(14473);
            if (i2 == 0) {
                synchronized (d.this) {
                    try {
                        d.this.f57439m += j2;
                        d.this.notifyAll();
                    } finally {
                        MethodCollector.o(14473);
                    }
                }
                return;
            }
            e a2 = d.this.a(i2);
            if (a2 != null) {
                synchronized (a2) {
                    try {
                        a2.a(j2);
                    } finally {
                        MethodCollector.o(14473);
                    }
                }
                return;
            }
            MethodCollector.o(14473);
        }

        @Override // com.squareup.a.a.a.b.a
        public final void a(int i2, a aVar) {
            if (d.this.d(i2)) {
                d dVar = d.this;
                dVar.f57436j.execute(new f("OkHttp %s Push Reset[%s]", new Object[]{dVar.f57432f, Integer.valueOf(i2)}, i2, aVar) {
                    /* class com.squareup.a.a.a.d.AnonymousClass7 */

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ int f57463b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ a f57464c;

                    static {
                        Covode.recordClassIndex(35888);
                    }

                    @Override // com.squareup.a.a.f
                    public final void a() {
                        MethodCollector.i(12198);
                        synchronized (d.this) {
                            try {
                                d.this.u.remove(Integer.valueOf(this.f57463b));
                            } finally {
                                MethodCollector.o(12198);
                            }
                        }
                    }

                    {
                        this.f57463b = r4;
                        this.f57464c = r5;
                    }
                });
                return;
            }
            e b2 = d.this.b(i2);
            if (b2 != null) {
                b2.c(aVar);
            }
        }

        @Override // com.squareup.a.a.a.b.a
        public final void a(int i2, List<f> list) {
            MethodCollector.i(14496);
            d dVar = d.this;
            synchronized (dVar) {
                try {
                    if (dVar.u.contains(Integer.valueOf(i2))) {
                        dVar.a(i2, a.PROTOCOL_ERROR);
                        return;
                    }
                    dVar.u.add(Integer.valueOf(i2));
                    dVar.f57436j.execute(new f("OkHttp %s Push Request[%s]", new Object[]{dVar.f57432f, Integer.valueOf(i2)}, i2, list) {
                        /* class com.squareup.a.a.a.d.AnonymousClass4 */

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ int f57451b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ List f57452c;

                        static {
                            Covode.recordClassIndex(35885);
                        }

                        @Override // com.squareup.a.a.f
                        public final void a() {
                            MethodCollector.i(13924);
                            try {
                                d.this.s.a(this.f57451b, a.CANCEL);
                                synchronized (d.this) {
                                    try {
                                        d.this.u.remove(Integer.valueOf(this.f57451b));
                                    } finally {
                                        MethodCollector.o(13924);
                                    }
                                }
                            } catch (IOException unused) {
                                MethodCollector.o(13924);
                            }
                        }

                        {
                            this.f57451b = r4;
                            this.f57452c = r5;
                        }
                    });
                    MethodCollector.o(14496);
                } finally {
                    MethodCollector.o(14496);
                }
            }
        }

        @Override // com.squareup.a.a.a.b.a
        public final void a(int i2, i iVar) {
            e[] eVarArr;
            MethodCollector.i(14351);
            iVar.size();
            synchronized (d.this) {
                try {
                    eVarArr = (e[]) d.this.f57431e.values().toArray(new e[d.this.f57431e.size()]);
                    d.this.f57435i = true;
                } finally {
                    MethodCollector.o(14351);
                }
            }
            for (e eVar : eVarArr) {
                if (eVar.f57485c > i2 && eVar.b()) {
                    eVar.c(a.REFUSED_STREAM);
                    d.this.b(eVar.f57485c);
                }
            }
        }

        /* synthetic */ c(d dVar, b bVar, byte b2) {
            this(bVar);
        }

        @Override // com.squareup.a.a.a.b.a
        public final void a(boolean z, int i2, int i3) {
            if (z) {
                l c2 = d.this.c(i2);
                if (c2 == null) {
                    return;
                }
                if (c2.f57564c != -1 || c2.f57563b == -1) {
                    throw new IllegalStateException();
                }
                c2.f57564c = System.nanoTime();
                c2.f57562a.countDown();
                return;
            }
            d dVar = d.this;
            d.f57427a.execute(new f("OkHttp %s ping %08x%08x", new Object[]{dVar.f57432f, Integer.valueOf(i2), Integer.valueOf(i3)}, i2, i3) {
                /* class com.squareup.a.a.a.d.AnonymousClass3 */

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ boolean f57446b = true;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f57447c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ int f57448d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ l f57449e;

                static {
                    Covode.recordClassIndex(35884);
                }

                @Override // com.squareup.a.a.f
                public final void a() {
                    try {
                        d.this.a(this.f57446b, this.f57447c, this.f57448d, this.f57449e);
                    } catch (IOException unused) {
                    }
                }

                {
                    this.f57447c = r5;
                    this.f57448d = r6;
                    this.f57449e = null;
                }
            });
        }
    }

    public final void b() {
        this.s.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(a.NO_ERROR, a.CANCEL);
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f57474a = new b() {
            /* class com.squareup.a.a.a.d.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35891);
            }

            @Override // com.squareup.a.a.a.d.b
            public final void a(e eVar) {
                eVar.a(a.REFUSED_STREAM);
            }
        };

        public abstract void a(e eVar);

        static {
            Covode.recordClassIndex(35890);
        }
    }

    static {
        Covode.recordClassIndex(35881);
    }

    public final synchronized int a() {
        MethodCollector.i(13317);
        n nVar = this.o;
        if ((nVar.f57566a & 16) != 0) {
            int i2 = nVar.f57569d[4];
            MethodCollector.o(13317);
            return i2;
        }
        MethodCollector.o(13317);
        return Integer.MAX_VALUE;
    }

    public final boolean d(int i2) {
        if (this.f57428b == u.HTTP_2 && i2 != 0 && (i2 & 1) == 0) {
            return true;
        }
        return false;
    }

    private synchronized void a(boolean z) {
        long j2;
        MethodCollector.i(13247);
        if (z) {
            j2 = System.nanoTime();
        } else {
            j2 = Long.MAX_VALUE;
        }
        this.w = j2;
        MethodCollector.o(13247);
    }

    private void a(a aVar) {
        MethodCollector.i(13637);
        synchronized (this.s) {
            try {
                synchronized (this) {
                    try {
                        if (!this.f57435i) {
                            this.f57435i = true;
                            this.s.a(this.f57433g, aVar, j.f57775a);
                            MethodCollector.o(13637);
                        }
                    } finally {
                        MethodCollector.o(13637);
                    }
                }
            } finally {
                MethodCollector.o(13637);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized e b(int i2) {
        e remove;
        MethodCollector.i(13245);
        remove = this.f57431e.remove(Integer.valueOf(i2));
        if (remove != null && this.f57431e.isEmpty()) {
            a(true);
        }
        notifyAll();
        MethodCollector.o(13245);
        return remove;
    }

    public final synchronized l c(int i2) {
        MethodCollector.i(13495);
        Map<Integer, l> map = this.x;
        if (map != null) {
            l remove = map.remove(Integer.valueOf(i2));
            MethodCollector.o(13495);
            return remove;
        }
        MethodCollector.o(13495);
        return null;
    }

    private d(a aVar) {
        int i2;
        this.f57431e = new HashMap();
        this.w = System.nanoTime();
        this.f57438l = 0;
        this.n = new n();
        n nVar = new n();
        this.o = nVar;
        this.p = false;
        this.u = new LinkedHashSet();
        u uVar = aVar.f57471f;
        this.f57428b = uVar;
        this.f57437k = aVar.f57472g;
        boolean z = aVar.f57473h;
        this.f57429c = z;
        this.f57430d = aVar.f57470e;
        int i3 = 2;
        if (aVar.f57473h) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f57434h = i2;
        if (aVar.f57473h && uVar == u.HTTP_2) {
            this.f57434h += 2;
        }
        this.y = aVar.f57473h ? 1 : i3;
        if (aVar.f57473h) {
            this.n.a(7, 0, 16777216);
        }
        String str = aVar.f57467b;
        this.f57432f = str;
        if (uVar == u.HTTP_2) {
            this.q = new i();
            this.f57436j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), j.b(com.a.a("OkHttp %s Push Observer", new Object[]{str})));
            nVar.a(7, 0, 65535);
            nVar.a(5, 0, 16384);
        } else if (uVar == u.SPDY_3) {
            this.q = new o();
            this.f57436j = null;
        } else {
            throw new AssertionError(uVar);
        }
        this.f57439m = (long) nVar.b();
        this.r = aVar.f57466a;
        this.s = this.q.a(aVar.f57469d, z);
        c cVar = new c(this, this.q.a(aVar.f57468c, z), (byte) 0);
        this.t = cVar;
        new Thread(cVar).start();
    }

    /* access modifiers changed from: package-private */
    public final synchronized e a(int i2) {
        e eVar;
        MethodCollector.i(13071);
        eVar = this.f57431e.get(Integer.valueOf(i2));
        MethodCollector.o(13071);
        return eVar;
    }

    public /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, a aVar) {
        this.s.a(i2, aVar);
    }

    public final e a(List<f> list, boolean z) {
        int i2;
        e eVar;
        MethodCollector.i(13399);
        boolean z2 = !z;
        synchronized (this.s) {
            try {
                synchronized (this) {
                    try {
                        if (!this.f57435i) {
                            i2 = this.f57434h;
                            this.f57434h = i2 + 2;
                            eVar = new e(i2, this, z2, false, list);
                            if (eVar.a()) {
                                this.f57431e.put(Integer.valueOf(i2), eVar);
                                a(false);
                            }
                        } else {
                            IOException iOException = new IOException("shutdown");
                            MethodCollector.o(13399);
                            throw iOException;
                        }
                    } finally {
                        MethodCollector.o(13399);
                    }
                }
                this.s.a(z2, false, i2, list);
            } finally {
                MethodCollector.o(13399);
            }
        }
        if (!z) {
            this.s.b();
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(final int i2, final long j2) {
        f57427a.execute(new f("OkHttp Window Update %s stream %d", new Object[]{this.f57432f, Integer.valueOf(i2)}) {
            /* class com.squareup.a.a.a.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35883);
            }

            @Override // com.squareup.a.a.f
            public final void a() {
                try {
                    d.this.s.a(i2, j2);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void a(final int i2, final a aVar) {
        f57427a.submit(new f("OkHttp %s stream %d", new Object[]{this.f57432f, Integer.valueOf(i2)}) {
            /* class com.squareup.a.a.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35882);
            }

            @Override // com.squareup.a.a.f
            public final void a() {
                try {
                    d.this.b(i2, aVar);
                } catch (IOException unused) {
                }
            }
        });
    }
}
