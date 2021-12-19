package com.bytedance.frameworks.baselib.network.a;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public AtomicReference<d> f28829a = new AtomicReference<>(d.UNKNOWN);

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<b> f28830b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private f f28831c = new f();

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f28832d = false;

    /* renamed from: e  reason: collision with root package name */
    private AtomicReference<d> f28833e;

    /* renamed from: f  reason: collision with root package name */
    private int f28834f;

    public interface b {
        static {
            Covode.recordClassIndex(16952);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(16950);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f28835a = new c();

        static {
            Covode.recordClassIndex(16951);
        }
    }

    protected c() {
    }

    public final synchronized double b() {
        MethodCollector.i(1683);
        f fVar = this.f28831c;
        if (fVar == null) {
            MethodCollector.o(1683);
            return -1.0d;
        }
        double d2 = fVar.f28848c;
        MethodCollector.o(1683);
        return d2;
    }

    private boolean c() {
        if (this.f28831c == null) {
            return false;
        }
        try {
            d dVar = this.f28829a.get();
            double d2 = 560.0d;
            double d3 = 112.0d;
            if (d.POOR == dVar) {
                d3 = 0.0d;
                d2 = 28.0d;
            } else if (d.MODERATE == dVar) {
                d2 = 112.0d;
                d3 = 28.0d;
            } else if (d.GOOD != dVar) {
                if (d.EXCELLENT == dVar) {
                    d2 = 3.4028234663852886E38d;
                    d3 = 560.0d;
                }
                return true;
            }
            double d4 = this.f28831c.f28848c;
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

    public final synchronized d a() {
        MethodCollector.i(1682);
        f fVar = this.f28831c;
        if (fVar == null) {
            d dVar = d.UNKNOWN;
            MethodCollector.o(1682);
            return dVar;
        }
        try {
            double d2 = fVar.f28848c;
            if (d2 < 0.0d) {
                d dVar2 = d.UNKNOWN;
                MethodCollector.o(1682);
                return dVar2;
            } else if (d2 < 28.0d) {
                d dVar3 = d.POOR;
                MethodCollector.o(1682);
                return dVar3;
            } else if (d2 < 112.0d) {
                d dVar4 = d.MODERATE;
                MethodCollector.o(1682);
                return dVar4;
            } else if (d2 < 560.0d) {
                d dVar5 = d.GOOD;
                MethodCollector.o(1682);
                return dVar5;
            } else {
                d dVar6 = d.EXCELLENT;
                MethodCollector.o(1682);
                return dVar6;
            }
        } catch (Throwable unused) {
            d dVar7 = d.UNKNOWN;
            MethodCollector.o(1682);
            return dVar7;
        }
    }

    public final synchronized void a(long j2, long j3) {
        MethodCollector.i(1681);
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = (double) j3;
        Double.isNaN(d3);
        double d4 = ((d2 * 1.0d) / d3) * 8.0d;
        if (j3 == 0 || d4 < 3.0d) {
            MethodCollector.o(1681);
            return;
        }
        try {
            Logger.debug();
            f fVar = this.f28831c;
            double d5 = 1.0d - fVar.f28846a;
            if (fVar.f28849d > fVar.f28847b) {
                fVar.f28848c = Math.exp((d5 * Math.log(fVar.f28848c)) + (fVar.f28846a * Math.log(d4)));
            } else if (fVar.f28849d > 0) {
                double d6 = (double) fVar.f28849d;
                Double.isNaN(d6);
                double d7 = d5 * d6;
                double d8 = (double) fVar.f28849d;
                Double.isNaN(d8);
                double d9 = d7 / (d8 + 1.0d);
                fVar.f28848c = Math.exp((d9 * Math.log(fVar.f28848c)) + ((1.0d - d9) * Math.log(d4)));
            } else {
                fVar.f28848c = d4;
            }
            fVar.f28849d++;
            if (this.f28832d) {
                this.f28834f++;
                if (a() != this.f28833e.get()) {
                    this.f28832d = false;
                    this.f28834f = 1;
                }
                if (((double) this.f28834f) >= 5.0d && c()) {
                    this.f28832d = false;
                    this.f28834f = 1;
                    this.f28829a.set(this.f28833e.get());
                    try {
                        int size = this.f28830b.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            this.f28829a.get();
                            this.f28830b.get(i2).a();
                        }
                        MethodCollector.o(1681);
                        return;
                    } catch (Throwable unused) {
                    }
                }
                MethodCollector.o(1681);
                return;
            }
            if (this.f28829a.get() != a()) {
                this.f28832d = true;
                this.f28833e = new AtomicReference<>(a());
            }
            MethodCollector.o(1681);
        } catch (Throwable unused2) {
            MethodCollector.o(1681);
        }
    }
}
