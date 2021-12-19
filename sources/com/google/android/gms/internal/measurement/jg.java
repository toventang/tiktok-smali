package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.gm;
import java.util.Arrays;

final class jg extends je<jd, jd> {
    static {
        Covode.recordClassIndex(31900);
    }

    jg() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ jd a() {
        return new jd();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ jd b(Object obj) {
        return ((gm) obj).zzb;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final void d(Object obj) {
        ((gm) obj).zzb.f51060f = false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ int f(jd jdVar) {
        return jdVar.a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ jd a(jd jdVar) {
        jd jdVar2 = jdVar;
        jdVar2.f51060f = false;
        return jdVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ jd c(Object obj) {
        jd jdVar = ((gm) obj).zzb;
        if (jdVar != jd.f51055a) {
            return jdVar;
        }
        jd jdVar2 = new jd();
        a(obj, jdVar2);
        return jdVar2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ int e(jd jdVar) {
        jd jdVar2 = jdVar;
        int i2 = jdVar2.f51059e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < jdVar2.f51056b; i4++) {
            i3 += (ft.m(8) << 1) + ft.g(2, jdVar2.f51057c[i4] >>> 3) + ft.c(3, (fe) jdVar2.f51058d[i4]);
        }
        jdVar2.f51059e = i3;
        return i3;
    }

    private static void a(Object obj, jd jdVar) {
        ((gm) obj).zzb = jdVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ void b(Object obj, jd jdVar) {
        a(obj, jdVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.measurement.jw] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ void b(jd jdVar, jw jwVar) {
        jd jdVar2 = jdVar;
        if (jwVar.a() == gm.e.f50951k) {
            for (int i2 = jdVar2.f51056b - 1; i2 >= 0; i2--) {
                jwVar.a(jdVar2.f51057c[i2] >>> 3, jdVar2.f51058d[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < jdVar2.f51056b; i3++) {
            jwVar.a(jdVar2.f51057c[i3] >>> 3, jdVar2.f51058d[i3]);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ jd c(jd jdVar, jd jdVar2) {
        jd jdVar3 = jdVar;
        jd jdVar4 = jdVar2;
        if (jdVar4.equals(jd.f51055a)) {
            return jdVar3;
        }
        int i2 = jdVar3.f51056b + jdVar4.f51056b;
        int[] copyOf = Arrays.copyOf(jdVar3.f51057c, i2);
        System.arraycopy(jdVar4.f51057c, 0, copyOf, jdVar3.f51056b, jdVar4.f51056b);
        Object[] copyOf2 = Arrays.copyOf(jdVar3.f51058d, i2);
        System.arraycopy(jdVar4.f51058d, 0, copyOf2, jdVar3.f51056b, jdVar4.f51056b);
        return new jd(i2, copyOf, copyOf2, true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.google.android.gms.internal.measurement.jw] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ void a(jd jdVar, jw jwVar) {
        jdVar.a(jwVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* bridge */ /* synthetic */ void a(Object obj, jd jdVar) {
        a(obj, jdVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ void b(jd jdVar, int i2, long j2) {
        jdVar.a((i2 << 3) | 1, Long.valueOf(j2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ void a(jd jdVar, int i2, int i3) {
        jdVar.a((i2 << 3) | 5, Integer.valueOf(i3));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, long] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ void a(jd jdVar, int i2, long j2) {
        jdVar.a(i2 << 3, Long.valueOf(j2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, com.google.android.gms.internal.measurement.fe] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ void a(jd jdVar, int i2, fe feVar) {
        jdVar.a((i2 << 3) | 2, feVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.je
    public final /* synthetic */ void a(jd jdVar, int i2, jd jdVar2) {
        jdVar.a((i2 << 3) | 3, jdVar2);
    }
}
