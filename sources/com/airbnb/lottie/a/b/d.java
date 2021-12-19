package com.airbnb.lottie.a.b;

import com.airbnb.lottie.e.b.c;
import com.airbnb.lottie.i.b;
import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class d extends f<c> {

    /* renamed from: e  reason: collision with root package name */
    private final c f5273e;

    static {
        Covode.recordClassIndex(2215);
    }

    public d(List<a<c>> list) {
        super(list);
        int i2 = 0;
        T t = list.get(0).f5710b;
        i2 = t != null ? t.f5379b.length : i2;
        this.f5273e = new c(new float[i2], new int[i2]);
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        c cVar = this.f5273e;
        T t = aVar.f5710b;
        T t2 = aVar.f5711c;
        if (t.f5379b.length == t2.f5379b.length) {
            for (int i2 = 0; i2 < t.f5379b.length; i2++) {
                float[] fArr = cVar.f5378a;
                float f3 = t.f5378a[i2];
                fArr[i2] = f3 + ((t2.f5378a[i2] - f3) * f2);
                cVar.f5379b[i2] = b.a(f2, t.f5379b[i2], t2.f5379b[i2]);
            }
            return this.f5273e;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + t.f5379b.length + " vs " + t2.f5379b.length + ")");
    }
}
