package com.bytedance.helios.sdk.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.c.b;
import com.bytedance.helios.sdk.b.a;
import com.bytedance.helios.sdk.utils.i;
import h.f.b.l;

public final class o extends b {

    /* renamed from: b  reason: collision with root package name */
    public static final o f30915b;

    /* renamed from: c  reason: collision with root package name */
    private static int[] f30916c;

    private o() {
    }

    @Override // com.bytedance.helios.sdk.d.b
    public final int[] a() {
        if (f30916c == null) {
            int size = this.f30855a.size();
            f30916c = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                int[] iArr = f30916c;
                if (iArr == null) {
                    l.a();
                }
                iArr[i2] = this.f30855a.keyAt(i2);
            }
        }
        int[] iArr2 = f30916c;
        if (iArr2 == null) {
            return new int[0];
        }
        return iArr2;
    }

    static {
        Covode.recordClassIndex(17939);
        o oVar = new o();
        f30915b = oVar;
        try {
            int size = i.f31018b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a valueAt = i.f31018b.valueAt(i2);
                if (valueAt.f30799k) {
                    super.a(valueAt.f30789a, new p(valueAt.f30798j, valueAt.f30797i, valueAt.f30789a, valueAt.f30796h));
                }
            }
        } catch (Throwable th) {
            com.bytedance.helios.api.b.o.a(new b(null, th, "label_custom_detector_init", null, 9));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.d.b
    public final void a(d dVar, Throwable th) {
        l.c(dVar, "");
        l.c(th, "");
        com.bytedance.helios.api.b.o.a(dVar.a(th), false);
    }
}
