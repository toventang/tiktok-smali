package com.facebook.j.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private e f48725a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f48726b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicReference<c> f48727c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicReference<c> f48728d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Object> f48729e;

    /* renamed from: f  reason: collision with root package name */
    private int f48730f;

    static {
        Covode.recordClassIndex(29374);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f48731a = new b((byte) 0);

        static {
            Covode.recordClassIndex(29375);
        }
    }

    private b() {
        this.f48725a = new e();
        this.f48726b = false;
        this.f48727c = new AtomicReference<>(c.UNKNOWN);
        this.f48729e = new ArrayList<>();
    }

    public final synchronized double b() {
        MethodCollector.i(1482);
        e eVar = this.f48725a;
        if (eVar == null) {
            MethodCollector.o(1482);
            return -1.0d;
        }
        double d2 = eVar.f48742c;
        MethodCollector.o(1482);
        return d2;
    }

    public final synchronized c a() {
        MethodCollector.i(1481);
        e eVar = this.f48725a;
        if (eVar == null) {
            c cVar = c.UNKNOWN;
            MethodCollector.o(1481);
            return cVar;
        }
        double d2 = eVar.f48742c;
        if (d2 < 0.0d) {
            c cVar2 = c.UNKNOWN;
            MethodCollector.o(1481);
            return cVar2;
        } else if (d2 < 150.0d) {
            c cVar3 = c.POOR;
            MethodCollector.o(1481);
            return cVar3;
        } else if (d2 < 550.0d) {
            c cVar4 = c.MODERATE;
            MethodCollector.o(1481);
            return cVar4;
        } else if (d2 < 2000.0d) {
            c cVar5 = c.GOOD;
            MethodCollector.o(1481);
            return cVar5;
        } else {
            c cVar6 = c.EXCELLENT;
            MethodCollector.o(1481);
            return cVar6;
        }
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final synchronized void a(long j2, long j3) {
        MethodCollector.i(1480);
        if (j3 != 0) {
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = (double) j3;
            Double.isNaN(d3);
            double d4 = ((d2 * 1.0d) / d3) * 8.0d;
            if (d4 >= 10.0d) {
                e eVar = this.f48725a;
                double d5 = 1.0d - eVar.f48740a;
                if (eVar.f48743d > eVar.f48741b) {
                    eVar.f48742c = Math.exp((d5 * Math.log(eVar.f48742c)) + (eVar.f48740a * Math.log(d4)));
                } else if (eVar.f48743d > 0) {
                    double d6 = (double) eVar.f48743d;
                    Double.isNaN(d6);
                    double d7 = d5 * d6;
                    double d8 = (double) eVar.f48743d;
                    Double.isNaN(d8);
                    double d9 = d7 / (d8 + 1.0d);
                    eVar.f48742c = Math.exp((d9 * Math.log(eVar.f48742c)) + ((1.0d - d9) * Math.log(d4)));
                } else {
                    eVar.f48742c = d4;
                }
                eVar.f48743d++;
                if (this.f48726b) {
                    this.f48730f++;
                    if (a() != this.f48728d.get()) {
                        this.f48726b = false;
                        this.f48730f = 1;
                    }
                    if (((double) this.f48730f) >= 5.0d) {
                        this.f48726b = false;
                        this.f48730f = 1;
                        this.f48727c.set(this.f48728d.get());
                        int size = this.f48729e.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            this.f48729e.get(i2);
                            this.f48727c.get();
                        }
                    }
                    MethodCollector.o(1480);
                    return;
                }
                if (this.f48727c.get() != a()) {
                    this.f48726b = true;
                    this.f48728d = new AtomicReference<>(a());
                }
                MethodCollector.o(1480);
                return;
            }
        }
        MethodCollector.o(1480);
    }
}
