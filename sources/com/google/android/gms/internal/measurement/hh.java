package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.List;

final class hh extends hd {
    static {
        Covode.recordClassIndex(31847);
    }

    private hh() {
        super((byte) 0);
    }

    /* synthetic */ hh(byte b2) {
        this();
    }

    private static <E> gv<E> c(Object obj, long j2) {
        return (gv) jk.f(obj, j2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.hd
    public final void b(Object obj, long j2) {
        c(obj, j2).b();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.hd
    public final <L> List<L> a(Object obj, long j2) {
        int i2;
        gv c2 = c(obj, j2);
        if (c2.a()) {
            return c2;
        }
        int size = c2.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size << 1;
        }
        gv a2 = c2.a(i2);
        jk.a(obj, j2, a2);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.measurement.gv] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.hd
    public final <E> void a(Object obj, Object obj2, long j2) {
        gv<E> c2 = c(obj, j2);
        gv<E> c3 = c(obj2, j2);
        int size = c2.size();
        int size2 = c3.size();
        gv<E> gvVar = c2;
        if (size > 0) {
            if (size2 > 0) {
                boolean a2 = c2.a();
                gv<E> gvVar2 = c2;
                if (!a2) {
                    gvVar2 = c2.a(size2 + size);
                }
                gvVar2.addAll(c3);
                gvVar = gvVar2;
            }
            c3 = gvVar;
        }
        jk.a(obj, j2, c3);
    }
}
