package com.toutiao.proxyserver.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private e f154830a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f154831b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicReference<b> f154832c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicReference<b> f154833d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Object> f154834e;

    /* renamed from: f  reason: collision with root package name */
    private int f154835f;

    static {
        Covode.recordClassIndex(103126);
    }

    /* renamed from: com.toutiao.proxyserver.f.a$a  reason: collision with other inner class name */
    static class C4114a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f154837a = new a((byte) 0);

        static {
            Covode.recordClassIndex(103128);
        }
    }

    private a() {
        this.f154830a = new e();
        this.f154831b = false;
        this.f154832c = new AtomicReference<>(b.UNKNOWN);
        this.f154834e = new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.toutiao.proxyserver.f.a$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f154836a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 103127(0x192d7, float:1.44512E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.toutiao.proxyserver.f.b[] r0 = com.toutiao.proxyserver.f.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.toutiao.proxyserver.f.a.AnonymousClass1.f154836a = r2
                com.toutiao.proxyserver.f.b r0 = com.toutiao.proxyserver.f.b.POOR     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.toutiao.proxyserver.f.a.AnonymousClass1.f154836a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.toutiao.proxyserver.f.b r0 = com.toutiao.proxyserver.f.b.MODERATE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.toutiao.proxyserver.f.a.AnonymousClass1.f154836a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.toutiao.proxyserver.f.b r0 = com.toutiao.proxyserver.f.b.GOOD     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.toutiao.proxyserver.f.a.AnonymousClass1.f154836a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.toutiao.proxyserver.f.b r0 = com.toutiao.proxyserver.f.b.EXCELLENT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.f.a.AnonymousClass1.<clinit>():void");
        }
    }

    private synchronized b a() {
        MethodCollector.i(9891);
        e eVar = this.f154830a;
        if (eVar == null) {
            b bVar = b.UNKNOWN;
            MethodCollector.o(9891);
            return bVar;
        }
        double d2 = eVar.f154853c;
        if (d2 < 0.0d) {
            b bVar2 = b.UNKNOWN;
            MethodCollector.o(9891);
            return bVar2;
        } else if (d2 < 150.0d) {
            b bVar3 = b.POOR;
            MethodCollector.o(9891);
            return bVar3;
        } else if (d2 < 550.0d) {
            b bVar4 = b.MODERATE;
            MethodCollector.o(9891);
            return bVar4;
        } else if (d2 < 2000.0d) {
            b bVar5 = b.GOOD;
            MethodCollector.o(9891);
            return bVar5;
        } else {
            b bVar6 = b.EXCELLENT;
            MethodCollector.o(9891);
            return bVar6;
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final synchronized void a(long j2, long j3) {
        MethodCollector.i(9730);
        if (j3 != 0) {
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = (double) j3;
            Double.isNaN(d3);
            double d4 = ((d2 * 1.0d) / d3) * 8.0d;
            if (d4 >= 10.0d) {
                e eVar = this.f154830a;
                double d5 = 1.0d - eVar.f154851a;
                if (eVar.f154854d > eVar.f154852b) {
                    eVar.f154853c = Math.exp((d5 * Math.log(eVar.f154853c)) + (eVar.f154851a * Math.log(d4)));
                } else if (eVar.f154854d > 0) {
                    double d6 = (double) eVar.f154854d;
                    Double.isNaN(d6);
                    double d7 = d5 * d6;
                    double d8 = (double) eVar.f154854d;
                    Double.isNaN(d8);
                    double d9 = d7 / (d8 + 1.0d);
                    eVar.f154853c = Math.exp((d9 * Math.log(eVar.f154853c)) + ((1.0d - d9) * Math.log(d4)));
                } else {
                    eVar.f154853c = d4;
                }
                eVar.f154854d++;
                if (this.f154831b) {
                    this.f154835f++;
                    if (a() != this.f154833d.get()) {
                        this.f154831b = false;
                        this.f154835f = 1;
                    }
                    if (((double) this.f154835f) >= 5.0d && this.f154830a != null) {
                        int i2 = AnonymousClass1.f154836a[this.f154832c.get().ordinal()];
                        double d10 = 2000.0d;
                        double d11 = 550.0d;
                        if (i2 == 1) {
                            d11 = 0.0d;
                            d10 = 150.0d;
                        } else if (i2 == 2) {
                            d10 = 550.0d;
                            d11 = 150.0d;
                        } else if (i2 != 3) {
                            if (i2 == 4) {
                                d10 = 3.4028234663852886E38d;
                                d11 = 2000.0d;
                            }
                            this.f154831b = false;
                            this.f154835f = 1;
                            this.f154832c.set(this.f154833d.get());
                            int size = this.f154834e.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                this.f154834e.get(i3);
                                this.f154832c.get();
                            }
                        }
                        double d12 = this.f154830a.f154853c;
                        if (d12 <= d10) {
                        }
                    }
                    MethodCollector.o(9730);
                    return;
                }
                if (this.f154832c.get() != a()) {
                    this.f154831b = true;
                    this.f154833d = new AtomicReference<>(a());
                }
                MethodCollector.o(9730);
                return;
            }
        }
        MethodCollector.o(9730);
    }
}
