package com.ss.android.socialbase.downloader.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private a f60740a;

    /* renamed from: b  reason: collision with root package name */
    private a f60741b;

    /* renamed from: c  reason: collision with root package name */
    private int f60742c;

    /* renamed from: d  reason: collision with root package name */
    private int f60743d = 10;

    static {
        Covode.recordClassIndex(37482);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f60744a;

        /* renamed from: b  reason: collision with root package name */
        long f60745b;

        /* renamed from: c  reason: collision with root package name */
        a f60746c;

        /* renamed from: d  reason: collision with root package name */
        a f60747d;

        static {
            Covode.recordClassIndex(37483);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a(long j2, long j3) {
        a aVar;
        MethodCollector.i(10335);
        synchronized (this) {
            try {
                a aVar2 = this.f60740a;
                if (aVar2 != null) {
                    if (j2 < aVar2.f60744a || j3 < aVar2.f60745b) {
                        return false;
                    }
                    a aVar3 = aVar2.f60746c;
                    if (aVar3 != null && j3 - aVar3.f60745b < 1000) {
                        aVar2.f60744a = j2;
                        aVar2.f60745b = j3;
                        MethodCollector.o(10335);
                        return true;
                    }
                }
                int i2 = this.f60742c;
                if (i2 < this.f60743d || (aVar = this.f60741b) == null) {
                    this.f60742c = i2 + 1;
                    aVar = new a((byte) 0);
                } else {
                    a aVar4 = aVar.f60747d;
                    aVar.f60747d = null;
                    this.f60741b = aVar4;
                    if (aVar4 != null) {
                        aVar4.f60746c = null;
                    }
                }
                aVar.f60744a = j2;
                aVar.f60745b = j3;
                if (aVar2 != null) {
                    aVar.f60746c = aVar2;
                    aVar2.f60747d = aVar;
                }
                this.f60740a = aVar;
                MethodCollector.o(10335);
                return true;
            } finally {
                MethodCollector.o(10335);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r5 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r3 = r4.f60744a - r5.f60744a;
        r14 = r14 - r5.f60745b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r3 < 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r14 <= 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r3 = r3 / r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(11602);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(11602);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(11602);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r12, long r14) {
        /*
            r11 = this;
            r10 = 11602(0x2d52, float:1.6258E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r10)
            monitor-enter(r11)
            com.ss.android.socialbase.downloader.k.f$a r4 = r11.f60740a     // Catch:{ all -> 0x0056 }
            r8 = -1
            if (r4 != 0) goto L_0x0011
            monitor-exit(r11)     // Catch:{ all -> 0x0056 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r10)
            return r8
        L_0x0011:
            r3 = 0
            r5 = r4
        L_0x0013:
            long r0 = r5.f60745b
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0020
            com.ss.android.socialbase.downloader.k.f$a r0 = r5.f60746c
            r3 = r5
            r5 = r0
            if (r5 == 0) goto L_0x0025
            goto L_0x0013
        L_0x0020:
            if (r3 == 0) goto L_0x0051
            if (r5 == r3) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            r5 = r3
            if (r5 != 0) goto L_0x0034
            goto L_0x0051
        L_0x0029:
            long r0 = r5.f60745b
            long r6 = r12 - r0
            long r1 = r3.f60745b
            long r1 = r1 - r12
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0025
        L_0x0034:
            long r3 = r4.f60744a
            long r0 = r5.f60744a
            long r3 = r3 - r0
            long r0 = r5.f60745b
            long r14 = r14 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004c
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            long r3 = r3 / r14
            monitor-exit(r11)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r10)
            return r3
        L_0x004c:
            monitor-exit(r11)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r10)
            return r8
        L_0x0051:
            monitor-exit(r11)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r10)
            return r8
        L_0x0056:
            r0 = move-exception
            monitor-exit(r11)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.k.f.b(long, long):long");
    }
}
