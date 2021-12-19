package com.bytedance.lottie.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.b.c;
import com.bytedance.lottie.g.a;
import java.util.List;

public final class d extends f<c> {

    /* renamed from: e  reason: collision with root package name */
    private final c f40431e;

    static {
        Covode.recordClassIndex(24855);
    }

    public d(List<a<c>> list) {
        super(list);
        int i2 = 0;
        T t = list.get(0).f40720c;
        i2 = t != null ? t.f40503b.length : i2;
        this.f40431e = new c(new float[i2], new int[i2]);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        c cVar = this.f40431e;
        T t = aVar.f40720c;
        T t2 = aVar.f40721d;
        if (t.f40503b.length == t2.f40503b.length) {
            for (int i2 = 0; i2 < t.f40503b.length; i2++) {
                float[] fArr = cVar.f40502a;
                float f3 = t.f40502a[i2];
                fArr[i2] = f3 + ((t2.f40502a[i2] - f3) * f2);
                cVar.f40503b[i2] = com.bytedance.lottie.f.c.a(f2, t.f40503b[i2], t2.f40503b[i2]);
            }
            return this.f40431e;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + t.f40503b.length + " vs " + t2.f40503b.length + ")");
    }
}
