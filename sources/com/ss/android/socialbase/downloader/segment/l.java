package com.ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.g.i;
import com.ss.android.socialbase.downloader.i.a;
import com.ss.android.socialbase.downloader.k.f;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public final class l implements Runnable {
    private final a A;
    private i B;
    private b C;
    private final List<i> D = new ArrayList();
    private volatile boolean E;
    private volatile boolean F;
    private volatile boolean G;
    private Thread H;
    private int I;
    private long J;
    private boolean K;
    private f L;

    /* renamed from: a  reason: collision with root package name */
    final f f60954a;

    /* renamed from: b  reason: collision with root package name */
    volatile i f60955b;

    /* renamed from: c  reason: collision with root package name */
    o f60956c;

    /* renamed from: d  reason: collision with root package name */
    public long f60957d;

    /* renamed from: e  reason: collision with root package name */
    volatile long f60958e;

    /* renamed from: f  reason: collision with root package name */
    volatile long f60959f;

    /* renamed from: g  reason: collision with root package name */
    public volatile long f60960g = -1;

    /* renamed from: h  reason: collision with root package name */
    volatile long f60961h;

    /* renamed from: i  reason: collision with root package name */
    public Future f60962i;

    /* renamed from: j  reason: collision with root package name */
    final int f60963j;

    /* renamed from: k  reason: collision with root package name */
    volatile boolean f60964k;

    /* renamed from: l  reason: collision with root package name */
    public int f60965l;

    /* renamed from: m  reason: collision with root package name */
    public int f60966m;
    int n;
    public BaseException o;
    public boolean p;
    public boolean q;
    volatile long r;
    volatile long s;
    volatile long t;
    volatile long u;
    String v;
    String w;
    String x;
    private final c y;
    private final DownloadInfo z;

    static {
        Covode.recordClassIndex(37569);
    }

    private void e() {
        this.J = this.r;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        f();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int backUpUrlRetryCount;
        if (this.f60956c.f60972d) {
            backUpUrlRetryCount = this.z.getRetryCount();
        } else {
            backUpUrlRetryCount = this.z.getBackUpUrlRetryCount();
        }
        this.f60965l = backUpUrlRetryCount;
        this.f60966m = 0;
    }

    public final long b() {
        long c2;
        MethodCollector.i(13914);
        synchronized (this.f60954a) {
            try {
                c2 = this.f60961h + c();
            } finally {
                MethodCollector.o(13914);
            }
        }
        return c2;
    }

    private void f() {
        i iVar = this.B;
        if (iVar != null) {
            try {
                com.ss.android.socialbase.downloader.e.a.c("SegmentReader", "closeConnection: thread = " + this.f60963j);
                iVar.d();
                iVar.b();
            } catch (Throwable unused) {
            }
        }
    }

    public final long c() {
        MethodCollector.i(13915);
        synchronized (this.f60954a) {
            try {
                long j2 = this.f60960g;
                long j3 = this.f60957d;
                if (j3 < 0 || j2 <= j3) {
                    MethodCollector.o(13915);
                    return 0;
                }
                return j2 - j3;
            } finally {
                MethodCollector.o(13915);
            }
        }
    }

    public final void d() {
        MethodCollector.i(13916);
        com.ss.android.socialbase.downloader.e.a.c("SegmentReader", "close: threadIndex = " + this.f60963j);
        synchronized (this) {
            try {
                this.E = true;
                this.f60964k = true;
            } finally {
                MethodCollector.o(13916);
            }
        }
        f();
        Future future = this.f60962i;
        if (future != null) {
            this.f60962i = null;
            try {
                future.cancel(true);
                MethodCollector.o(13916);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:36|37|38|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r5.f60956c.b(r5);
        r5.f60954a.c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e2, code lost:
        r5.H = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00d8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.l.run():void");
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        long j3 = this.f60960g;
        f fVar = this.L;
        if (j3 >= 0 && fVar != null) {
            fVar.a(j3, j2);
        }
    }

    public final void a(boolean z2) {
        MethodCollector.i(13917);
        com.ss.android.socialbase.downloader.e.a.c("SegmentReader", "reconnect: threadIndex = " + this.f60963j);
        synchronized (this) {
            try {
                this.G = z2;
                this.F = true;
                this.f60964k = true;
            } finally {
                MethodCollector.o(13917);
            }
        }
        f();
        Thread thread = this.H;
        if (thread != null) {
            try {
                thread.interrupt();
                MethodCollector.o(13917);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0274, code lost:
        r11 = r28.f60954a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0276, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x027d, code lost:
        if (r28.f60958e == 0) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x027f, code lost:
        com.ss.android.socialbase.downloader.e.a.c("SegmentReader", "loopAndRead:  change readEnd = " + r3 + ", segmentNewEndOffset = " + r28.f60958e + ", segment = " + r13);
        r3 = r28.f60958e;
        r28.f60958e = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02b1, code lost:
        if (r3 > 0) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02b3, code lost:
        r3 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ba, code lost:
        if (r1 <= r3) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02bc, code lost:
        r9 = r3 + 1;
        r18 = r1 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c2, code lost:
        if (r18 <= 0) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        com.ss.android.socialbase.downloader.e.a.e("SegmentReader", "loopAndRead: redundant = ".concat(java.lang.String.valueOf(r18)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0304, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r28.f60960g = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0308, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0309, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x030b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x030e, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030f, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0310, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13867);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0315, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03e8, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03ea, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0597, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0598, code lost:
        r13 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x059b, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x05a1, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05a2, code lost:
        r4 = 13867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05f5, code lost:
        if (r28.F != false) goto L_0x05f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05f7, code lost:
        r28.F = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05fe, code lost:
        if (r28.G == false) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0604, code lost:
        if ((r3 instanceof com.ss.android.socialbase.downloader.exception.BaseException) != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0606, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0608, code lost:
        if (r3 == null) goto L_0x06c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x060a, code lost:
        com.ss.android.socialbase.downloader.e.a.e("SegmentReader", "handleDownloadFailed:  e = " + r3 + ", curRetryCount = " + r28.f60966m + ", retryCount = " + r28.f60965l);
        r28.o = r3;
        r28.f60956c.b();
        r28.f60954a.a(r28, r3, r28.f60966m, r28.f60965l);
        r2 = r28.f60966m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x064a, code lost:
        if (r2 < r28.f60965l) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x064c, code lost:
        r28.f60966m = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        com.ss.android.socialbase.downloader.k.g.a(r3, "download");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0657, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x066f, code lost:
        r2 = r28.f60956c.f60969a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0681, code lost:
        r28.f60954a.a(r28, r13, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0695, code lost:
        r28.K = true;
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06ad, code lost:
        e();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13867);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06b6, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06b7, code lost:
        r28.G = false;
        r3 = new com.ss.android.socialbase.downloader.segment.SegmentApplyException(5, "download");
        r2 = 13867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13867);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06c7, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06c8, code lost:
        e();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13867);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06d1, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x06d6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        r28.o = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x06db, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13867);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06de, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06df, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06e1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x06e2, code lost:
        r2 = 13867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x015b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        com.ss.android.socialbase.downloader.k.g.a(r4, "createConn");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0161, code lost:
        r3 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x054e A[SYNTHETIC, Splitter:B:284:0x054e] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05f2 A[Catch:{ all -> 0x06d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x06d6 A[ExcHandler: SegmentApplyException (r1v1 'e' com.ss.android.socialbase.downloader.segment.SegmentApplyException A[CUSTOM_DECLARE]), Splitter:B:29:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x05f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015b A[ExcHandler: all (r4v49 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.ss.android.socialbase.downloader.segment.i r29) {
        /*
        // Method dump skipped, instructions count: 1771
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.l.a(com.ss.android.socialbase.downloader.segment.i):boolean");
    }

    /* access modifiers changed from: package-private */
    public final long a(long j2, long j3) {
        f fVar = this.L;
        if (fVar == null) {
            return -1;
        }
        return fVar.b(j2, j3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r3 != -1) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.socialbase.downloader.segment.a a(com.ss.android.socialbase.downloader.segment.c r7, java.io.InputStream r8) {
        /*
            r6 = 13913(0x3659, float:1.9496E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            com.ss.android.socialbase.downloader.segment.a r5 = r7.b()
            r4 = -1
            byte[] r0 = r5.f60897a     // Catch:{ all -> 0x002e }
            int r3 = r8.read(r0)     // Catch:{ all -> 0x002e }
            if (r3 == r4) goto L_0x001d
            r5.f60899c = r3     // Catch:{ all -> 0x002a }
            if (r3 != r4) goto L_0x0019
            r7.a(r5)
        L_0x0019:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        L_0x001d:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException
            r1 = 1073(0x431, float:1.504E-42)
            java.lang.String r0 = "probe"
            r2.<init>(r1, r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r2
        L_0x002a:
            r1 = move-exception
            if (r3 != r4) goto L_0x0033
            goto L_0x0030
        L_0x002e:
            r1 = move-exception
            r0 = -1
        L_0x0030:
            r7.a(r5)
        L_0x0033:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.l.a(com.ss.android.socialbase.downloader.segment.c, java.io.InputStream):com.ss.android.socialbase.downloader.segment.a");
    }

    l(DownloadInfo downloadInfo, j jVar, c cVar, o oVar, int i2) {
        this.z = downloadInfo;
        this.f60954a = jVar;
        this.y = cVar;
        this.A = a.a(downloadInfo.getId(), (DownloadInfo) null);
        this.f60956c = oVar;
        this.f60963j = i2;
    }
}
