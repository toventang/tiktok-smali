package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.gm;
import java.util.List;
import java.util.Map;

final class fv implements jw {

    /* renamed from: a  reason: collision with root package name */
    private final ft f50890a;

    static {
        Covode.recordClassIndex(31801);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final int a() {
        return gm.e.f50950j;
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, boolean z) {
        this.f50890a.a(i2, z);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, String str) {
        this.f50890a.a(i2, str);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += ft.l(list.get(i5).intValue());
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.a(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.b(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, List<String> list) {
        int i3 = 0;
        if (list instanceof he) {
            he heVar = (he) list;
            while (i3 < list.size()) {
                Object b2 = heVar.b(i3);
                if (b2 instanceof String) {
                    this.f50890a.a(i2, (String) b2);
                } else {
                    this.f50890a.a(i2, (fe) b2);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.a(i2, list.get(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, List<?> list, in inVar) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            a(i2, list.get(i3), inVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2) {
        this.f50890a.a(i2, 3);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void b(int i2) {
        this.f50890a.a(i2, 4);
    }

    fv(ft ftVar) {
        ft ftVar2 = (ft) gp.a((Object) ftVar, "output");
        this.f50890a = ftVar2;
        ftVar2.f50884a = this;
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void c(int i2, int i3) {
        this.f50890a.b(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void d(int i2, int i3) {
        this.f50890a.e(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void e(int i2, int i3) {
        this.f50890a.c(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void f(int i2, int i3) {
        this.f50890a.d(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, double d2) {
        this.f50890a.a(i2, d2);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void b(int i2, int i3) {
        this.f50890a.b(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void c(int i2, long j2) {
        this.f50890a.a(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void d(int i2, long j2) {
        this.f50890a.c(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void e(int i2, long j2) {
        this.f50890a.b(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, float f2) {
        this.f50890a.a(i2, f2);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void b(int i2, long j2) {
        this.f50890a.c(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, int i3) {
        this.f50890a.e(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, long j2) {
        this.f50890a.a(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void b(int i2, List<fe> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f50890a.a(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, fe feVar) {
        this.f50890a.a(i2, feVar);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, Object obj) {
        if (obj instanceof fe) {
            this.f50890a.b(i2, (fe) obj);
        } else {
            this.f50890a.a(i2, (ht) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void b(int i2, Object obj, in inVar) {
        ft ftVar = this.f50890a;
        ftVar.a(i2, 3);
        inVar.a(obj, (jw) ftVar.f50884a);
        ftVar.a(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void c(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += ft.d(list.get(i5).longValue());
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.a(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.a(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void d(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += ft.d(list.get(i5).longValue());
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.a(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.a(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void e(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).longValue();
                i4 += 8;
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.c(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.c(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void f(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).floatValue();
                i4 += 4;
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.a(list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.a(i2, list.get(i3).floatValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void g(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).doubleValue();
                i4 += 8;
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.a(list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.a(i2, list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void h(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += ft.l(list.get(i5).intValue());
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.a(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.b(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void i(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).booleanValue();
                i4++;
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.a(list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.a(i2, list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void j(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += ft.m(list.get(i5).intValue());
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.b(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.c(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void k(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).intValue();
                i4 += 4;
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.d(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.e(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void l(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).longValue();
                i4 += 8;
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.c(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.c(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void m(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += ft.m(ft.n(list.get(i5).intValue()));
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.c(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.d(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void n(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += ft.d(ft.e(list.get(i5).longValue()));
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.b(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.b(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void b(int i2, List<?> list, in inVar) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            b(i2, list.get(i3), inVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final <K, V> void a(int i2, ho<K, V> hoVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f50890a.a(i2, 2);
            this.f50890a.b(hl.a(hoVar, entry.getKey(), entry.getValue()));
            hl.a(this.f50890a, hoVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void b(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.f50890a.a(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                list.get(i5).intValue();
                i4 += 4;
            }
            this.f50890a.b(i4);
            while (i3 < list.size()) {
                this.f50890a.d(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f50890a.e(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.jw
    public final void a(int i2, Object obj, in inVar) {
        this.f50890a.a(i2, (ht) obj, inVar);
    }
}
