package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.net.d;
import com.ttnet.org.chromium.net.f;
import com.ttnet.org.chromium.net.impl.r;
import com.ttnet.org.chromium.net.t;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class CronetBidirectionalStream extends f {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ boolean f155472h = true;

    /* renamed from: a  reason: collision with root package name */
    public final String f155473a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f155474b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f155475c;

    /* renamed from: d  reason: collision with root package name */
    public int f155476d;

    /* renamed from: e  reason: collision with root package name */
    public int f155477e;

    /* renamed from: f  reason: collision with root package name */
    public r f155478f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f155479g;

    /* renamed from: i  reason: collision with root package name */
    private final CronetUrlRequestContext f155480i;

    /* renamed from: j  reason: collision with root package name */
    private final Executor f155481j;

    /* renamed from: k  reason: collision with root package name */
    private final String f155482k;

    /* renamed from: l  reason: collision with root package name */
    private final Collection<Object> f155483l;

    /* renamed from: m  reason: collision with root package name */
    private d f155484m;
    private LinkedList<ByteBuffer> n;
    private LinkedList<ByteBuffer> o;
    private boolean p;
    private t.b q;
    private long r;
    private a s;

    private native long nativeCreateBidirectionalStream(long j2, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3);

    private native void nativeDestroy(long j2, boolean z);

    private native boolean nativeReadData(long j2, ByteBuffer byteBuffer, int i2, int i3);

    private native void nativeSendRequestHeaders(long j2);

    private native int nativeStart(long j2, String str, int i2, String str2, String[] strArr, boolean z);

    private native boolean nativeWritevData(long j2, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);

    static {
        Covode.recordClassIndex(103429);
    }

    private void onCanceled() {
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.AnonymousClass4 */

            static {
                Covode.recordClassIndex(103433);
            }

            public final void run() {
            }
        });
    }

    public final boolean a() {
        if (this.f155476d == 0 || this.r != 0) {
            return false;
        }
        return true;
    }

    public final void b() {
        MethodCollector.i(13680);
        synchronized (this.f155474b) {
            try {
                if (!a()) {
                    if (this.f155477e == 10 && this.f155476d == 4) {
                        this.f155477e = 7;
                        this.f155476d = 7;
                        d();
                        MethodCollector.o(13680);
                        return;
                    }
                    MethodCollector.o(13680);
                }
            } finally {
                MethodCollector.o(13680);
            }
        }
    }

    final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        ByteBuffer f155493a;

        /* renamed from: b  reason: collision with root package name */
        boolean f155494b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CronetBidirectionalStream f155495c;

        static {
            Covode.recordClassIndex(103435);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
            if (r2 == false) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            r5.f155495c.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(13466);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                r4 = 13466(0x349a, float:1.887E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
                r0 = 0
                r5.f155493a = r0     // Catch:{ Exception -> 0x0046 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = r5.f155495c     // Catch:{ Exception -> 0x0046 }
                java.lang.Object r3 = r0.f155474b     // Catch:{ Exception -> 0x0046 }
                monitor-enter(r3)     // Catch:{ Exception -> 0x0046 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = r5.f155495c     // Catch:{ all -> 0x0040 }
                boolean r0 = r0.a()     // Catch:{ all -> 0x0040 }
                if (r0 == 0) goto L_0x001a
                monitor-exit(r3)     // Catch:{ all -> 0x0040 }
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                return
            L_0x001a:
                boolean r0 = r5.f155494b
                r2 = 0
                if (r0 == 0) goto L_0x002f
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = r5.f155495c
                r0 = 4
                r1.f155476d = r0
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = r5.f155495c
                int r1 = r0.f155477e
                r0 = 10
                if (r1 != r0) goto L_0x0034
                r0 = 1
                r2 = 1
                goto L_0x0034
            L_0x002f:
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = r5.f155495c
                r0 = 2
                r1.f155476d = r0
            L_0x0034:
                monitor-exit(r3)
                if (r2 == 0) goto L_0x003c
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = r5.f155495c
                r0.b()
            L_0x003c:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                return
            L_0x0040:
                r0 = move-exception
                monitor-exit(r3)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                throw r0
            L_0x0046:
                r1 = move-exception
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = r5.f155495c
                r0.a(r1)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.a.run():void");
        }
    }

    final class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private ByteBuffer f155497b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f155498c;

        static {
            Covode.recordClassIndex(103436);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
            if (r2 == false) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
            r5.f155496a.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(12341);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                r4 = 12341(0x3035, float:1.7293E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
                r0 = 0
                r5.f155497b = r0     // Catch:{ Exception -> 0x0040 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0040 }
                java.lang.Object r3 = r0.f155474b     // Catch:{ Exception -> 0x0040 }
                monitor-enter(r3)     // Catch:{ Exception -> 0x0040 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x003a }
                boolean r0 = r0.a()     // Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x001a
                monitor-exit(r3)     // Catch:{ all -> 0x003a }
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                return
            L_0x001a:
                boolean r0 = r5.f155498c
                r2 = 0
                if (r0 == 0) goto L_0x002e
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r0 = 10
                r1.f155477e = r0
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                int r1 = r0.f155476d
                r0 = 4
                if (r1 != r0) goto L_0x002e
                r0 = 1
                r2 = 1
            L_0x002e:
                monitor-exit(r3)
                if (r2 == 0) goto L_0x0036
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r0.b()
            L_0x0036:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                return
            L_0x003a:
                r0 = move-exception
                monitor-exit(r3)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                throw r0
            L_0x0040:
                r1 = move-exception
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r0.a(r1)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.b.run():void");
        }

        b(ByteBuffer byteBuffer, boolean z) {
            this.f155497b = byteBuffer;
            this.f155498c = z;
        }
    }

    private void d() {
        MethodCollector.i(13841);
        com.ttnet.org.chromium.base.f.a(CronetUrlRequestContext.f155580b, "destroyNativeStreamLocked " + toString(), new Object[0]);
        long j2 = this.r;
        if (j2 == 0) {
            MethodCollector.o(13841);
            return;
        }
        nativeDestroy(j2, false);
        this.f155480i.i();
        this.r = 0;
        Runnable runnable = this.f155479g;
        if (runnable != null) {
            runnable.run();
        }
        MethodCollector.o(13841);
    }

    private void c() {
        boolean z;
        MethodCollector.i(13678);
        if (f155472h || this.f155477e == 8) {
            int size = this.o.size();
            ByteBuffer[] byteBufferArr = new ByteBuffer[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                ByteBuffer poll = this.o.poll();
                byteBufferArr[i2] = poll;
                iArr[i2] = poll.position();
                iArr2[i2] = poll.limit();
            }
            if (!f155472h) {
                if (!this.o.isEmpty()) {
                    AssertionError assertionError = new AssertionError();
                    MethodCollector.o(13678);
                    throw assertionError;
                } else if (size <= 0) {
                    AssertionError assertionError2 = new AssertionError();
                    MethodCollector.o(13678);
                    throw assertionError2;
                }
            }
            this.f155477e = 9;
            this.f155475c = true;
            long j2 = this.r;
            if (!this.p || !this.n.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (nativeWritevData(j2, byteBufferArr, iArr, iArr2, z)) {
                MethodCollector.o(13678);
                return;
            }
            this.f155477e = 8;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to call native writev.");
            MethodCollector.o(13678);
            throw illegalArgumentException;
        }
        AssertionError assertionError3 = new AssertionError();
        MethodCollector.o(13678);
        throw assertionError3;
    }

    private void b(final d dVar) {
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.AnonymousClass5 */

            static {
                Covode.recordClassIndex(103434);
            }

            public final void run() {
                CronetBidirectionalStream.this.a(dVar);
            }
        });
    }

    private void onStreamReady(final boolean z) {
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103430);
            }

            public final void run() {
                MethodCollector.i(13759);
                synchronized (CronetBidirectionalStream.this.f155474b) {
                    try {
                        if (!CronetBidirectionalStream.this.a()) {
                            CronetBidirectionalStream.this.f155475c = z;
                            CronetBidirectionalStream.this.f155476d = 2;
                            String str = CronetBidirectionalStream.this.f155473a;
                            if ((str.equals("GET") || str.equals("HEAD")) && CronetBidirectionalStream.this.f155475c) {
                                CronetBidirectionalStream.this.f155477e = 10;
                            } else {
                                CronetBidirectionalStream.this.f155477e = 8;
                            }
                            MethodCollector.o(13759);
                        }
                    } finally {
                        MethodCollector.o(13759);
                    }
                }
            }
        });
    }

    private static ArrayList<Map.Entry<String, String>> a(String[] strArr) {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<>(strArr.length / 2);
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return arrayList;
    }

    private void onResponseTrailersReceived(String[] strArr) {
        final r.a aVar = new r.a(a(strArr));
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.AnonymousClass3 */

            static {
                Covode.recordClassIndex(103432);
            }

            public final void run() {
                MethodCollector.i(13468);
                synchronized (CronetBidirectionalStream.this.f155474b) {
                    try {
                        if (!CronetBidirectionalStream.this.a()) {
                            MethodCollector.o(13468);
                        }
                    } finally {
                        MethodCollector.o(13468);
                    }
                }
            }
        });
    }

    private void a(Runnable runnable) {
        MethodCollector.i(13794);
        try {
            this.f155481j.execute(runnable);
            MethodCollector.o(13794);
        } catch (RejectedExecutionException e2) {
            com.ttnet.org.chromium.base.f.c(CronetUrlRequestContext.f155580b, "Exception posting task to executor", e2);
            synchronized (this.f155474b) {
                this.f155477e = 6;
                this.f155476d = 6;
                d();
                MethodCollector.o(13794);
            }
        } catch (Throwable th) {
            MethodCollector.o(13794);
            throw th;
        }
    }

    public final void a(d dVar) {
        MethodCollector.i(13843);
        this.f155484m = dVar;
        synchronized (this.f155474b) {
            try {
                if (!a()) {
                    this.f155477e = 6;
                    this.f155476d = 6;
                    d();
                    MethodCollector.o(13843);
                }
            } finally {
                MethodCollector.o(13843);
            }
        }
    }

    public final void a(Exception exc) {
        b bVar = new b("CalledByNative method has thrown an exception", exc);
        com.ttnet.org.chromium.base.f.c(CronetUrlRequestContext.f155580b, "Exception in CalledByNative method", exc);
        a((d) bVar);
    }

    private void onResponseHeadersReceived(int i2, String str, String[] strArr, long j2) {
        try {
            this.f155478f = new r(Arrays.asList(this.f155482k), i2, "", a(strArr), false, str, null, j2);
            a(new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(103431);
                }

                public final void run() {
                    MethodCollector.i(13217);
                    synchronized (CronetBidirectionalStream.this.f155474b) {
                        try {
                            if (!CronetBidirectionalStream.this.a()) {
                                CronetBidirectionalStream.this.f155476d = 2;
                                MethodCollector.o(13217);
                            }
                        } finally {
                            MethodCollector.o(13217);
                        }
                    }
                }
            });
        } catch (Exception unused) {
            b(new d("Cannot prepare ResponseInfo", null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r4 >= r7.length) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        r3 = r7[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r3.position() != r8[r4]) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r3.limit() == r9[r4]) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        b(new com.ttnet.org.chromium.net.impl.d("ByteBuffer modified externally during write", null));
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13744);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        r3.position(r3.limit());
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r10 == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r4 != (r7.length - 1)) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        a(new com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.b(r6, r3, r1));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13744);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onWritevCompleted(java.nio.ByteBuffer[] r7, int[] r8, int[] r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.onWritevCompleted(java.nio.ByteBuffer[], int[], int[], boolean):void");
    }

    private void onError(int i2, int i3, int i4, String str, long j2) {
        r rVar = this.f155478f;
        if (rVar != null) {
            rVar.a(j2);
        }
        if (i2 == 10 || i2 == 3) {
            b(new l("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i2, i3, i4));
        } else {
            b(new a("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i2, i3));
        }
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        int i5;
        boolean z;
        this.f155478f.a(j2);
        if (byteBuffer.position() != i3 || byteBuffer.limit() != i4) {
            b(new d("ByteBuffer modified externally during read", null));
        } else if (i2 < 0 || (i5 = i3 + i2) > i4) {
            b(new d("Invalid number of bytes read", null));
        } else {
            byteBuffer.position(i5);
            if (f155472h || this.s.f155493a == null) {
                this.s.f155493a = byteBuffer;
                a aVar = this.s;
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.f155494b = z;
                a(this.s);
                return;
            }
            throw new AssertionError();
        }
    }

    private void onMetricsCollected(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z, long j15, long j16, String str, long j17) {
        int i2;
        int i3;
        MethodCollector.i(13746);
        synchronized (this.f155474b) {
            try {
                if (this.q == null) {
                    this.q = new e(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, z, j15, j16, -1, str, j17, 0, "", "");
                    boolean z2 = f155472h;
                    if (!z2) {
                        if (this.f155476d != this.f155477e) {
                            AssertionError assertionError = new AssertionError();
                            MethodCollector.o(13746);
                            throw assertionError;
                        }
                    }
                    if (!(z2 || (i3 = this.f155476d) == 7 || i3 == 6)) {
                        if (i3 != 5) {
                            AssertionError assertionError2 = new AssertionError();
                            MethodCollector.o(13746);
                            throw assertionError2;
                        }
                    }
                    int i4 = this.f155476d;
                    if (i4 == 7) {
                        i2 = 0;
                    } else if (i4 == 5) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    this.f155480i.a(new m(this.f155482k, this.f155483l, this.q, i2, this.f155478f, this.f155484m));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Metrics collection should only happen once.");
                    MethodCollector.o(13746);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.o(13746);
            }
        }
    }
}
