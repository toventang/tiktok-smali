package com.ss.android.socialbase.downloader.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f60547a = k.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final d f60548b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f60549c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<l> f60550d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicReference<l> f60551e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<Object> f60552f;

    /* renamed from: g  reason: collision with root package name */
    private int f60553g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k f60555a = new k((byte) 0);

        static {
            Covode.recordClassIndex(37414);
        }
    }

    static {
        Covode.recordClassIndex(37412);
    }

    private k() {
        this.f60548b = new d();
        this.f60549c = false;
        this.f60550d = new AtomicReference<>(l.UNKNOWN);
        this.f60552f = new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.downloader.g.k$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f60554a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 37413(0x9225, float:5.2427E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.socialbase.downloader.g.l[] r0 = com.ss.android.socialbase.downloader.g.l.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.socialbase.downloader.g.k.AnonymousClass1.f60554a = r2
                com.ss.android.socialbase.downloader.g.l r0 = com.ss.android.socialbase.downloader.g.l.POOR     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.socialbase.downloader.g.k.AnonymousClass1.f60554a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.socialbase.downloader.g.l r0 = com.ss.android.socialbase.downloader.g.l.MODERATE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.socialbase.downloader.g.k.AnonymousClass1.f60554a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.socialbase.downloader.g.l r0 = com.ss.android.socialbase.downloader.g.l.GOOD     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.socialbase.downloader.g.k.AnonymousClass1.f60554a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.socialbase.downloader.g.l r0 = com.ss.android.socialbase.downloader.g.l.EXCELLENT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.g.k.AnonymousClass1.<clinit>():void");
        }
    }

    private boolean b() {
        if (this.f60548b == null) {
            return false;
        }
        try {
            int i2 = AnonymousClass1.f60554a[this.f60550d.get().ordinal()];
            double d2 = 2000.0d;
            double d3 = 550.0d;
            if (i2 == 1) {
                d3 = 0.0d;
                d2 = 150.0d;
            } else if (i2 == 2) {
                d2 = 550.0d;
                d3 = 150.0d;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    return true;
                }
                d2 = 3.4028234663852886E38d;
                d3 = 2000.0d;
            }
            double d4 = this.f60548b.f60545c;
            if (d4 > d2) {
                if (d4 > d2 * 1.25d) {
                    return true;
                }
            } else if (d4 < d3 * 0.8d) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final synchronized l a() {
        MethodCollector.i(13172);
        d dVar = this.f60548b;
        if (dVar == null) {
            l lVar = l.UNKNOWN;
            MethodCollector.o(13172);
            return lVar;
        }
        try {
            double d2 = dVar.f60545c;
            if (d2 < 0.0d) {
                l lVar2 = l.UNKNOWN;
                MethodCollector.o(13172);
                return lVar2;
            } else if (d2 < 150.0d) {
                l lVar3 = l.POOR;
                MethodCollector.o(13172);
                return lVar3;
            } else if (d2 < 550.0d) {
                l lVar4 = l.MODERATE;
                MethodCollector.o(13172);
                return lVar4;
            } else if (d2 < 2000.0d) {
                l lVar5 = l.GOOD;
                MethodCollector.o(13172);
                return lVar5;
            } else {
                l lVar6 = l.EXCELLENT;
                MethodCollector.o(13172);
                return lVar6;
            }
        } catch (Throwable unused) {
            l lVar7 = l.UNKNOWN;
            MethodCollector.o(13172);
            return lVar7;
        }
    }

    /* synthetic */ k(byte b2) {
        this();
    }

    public final synchronized void a(long j2, long j3) {
        MethodCollector.i(13171);
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = (double) j3;
        Double.isNaN(d3);
        double d4 = ((d2 * 1.0d) / d3) * 8.0d;
        if (j3 == 0 || d4 < 3.0d) {
            MethodCollector.o(13171);
            return;
        }
        try {
            d dVar = this.f60548b;
            double d5 = 1.0d - dVar.f60543a;
            if (dVar.f60546d > dVar.f60544b) {
                dVar.f60545c = Math.exp((d5 * Math.log(dVar.f60545c)) + (dVar.f60543a * Math.log(d4)));
            } else if (dVar.f60546d > 0) {
                double d6 = (double) dVar.f60546d;
                Double.isNaN(d6);
                double d7 = d5 * d6;
                double d8 = (double) dVar.f60546d;
                Double.isNaN(d8);
                double d9 = d7 / (d8 + 1.0d);
                dVar.f60545c = Math.exp((d9 * Math.log(dVar.f60545c)) + ((1.0d - d9) * Math.log(d4)));
            } else {
                dVar.f60545c = d4;
            }
            dVar.f60546d++;
            l a2 = a();
            if (this.f60549c) {
                this.f60553g++;
                if (a2 != this.f60551e.get()) {
                    this.f60549c = false;
                    this.f60553g = 1;
                }
                if (((double) this.f60553g) >= 5.0d && b()) {
                    this.f60549c = false;
                    this.f60553g = 1;
                    this.f60550d.set(this.f60551e.get());
                    try {
                        int size = this.f60552f.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            this.f60552f.get(i2);
                            this.f60550d.get();
                        }
                        MethodCollector.o(13171);
                        return;
                    } catch (Throwable unused) {
                    }
                }
                MethodCollector.o(13171);
                return;
            }
            if (this.f60550d.get() != a2) {
                this.f60549c = true;
                this.f60551e = new AtomicReference<>(a2);
            }
            MethodCollector.o(13171);
        } catch (Throwable unused2) {
            MethodCollector.o(13171);
        }
    }
}
