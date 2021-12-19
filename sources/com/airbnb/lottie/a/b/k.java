package com.airbnb.lottie.a.b;

import com.airbnb.lottie.g.d;
import com.airbnb.lottie.j.a;
import com.airbnb.lottie.j.d;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class k extends f<d> {

    /* renamed from: e  reason: collision with root package name */
    private final d f5284e;

    static {
        Covode.recordClassIndex(2222);
    }

    public k(List<a<d>> list) {
        super(list);
        if (d.a.f5625a) {
            this.f5284e = new com.airbnb.lottie.j.d();
        } else {
            this.f5284e = null;
        }
    }

    @Override // com.airbnb.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        com.airbnb.lottie.j.d dVar;
        if (aVar.f5710b == null || aVar.f5711c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t = aVar.f5710b;
        T t2 = aVar.f5711c;
        if (this.f5260d != null) {
            return this.f5260d.a(aVar.f5713e, aVar.f5714f.floatValue(), t, t2, f2, c(), this.f5259c);
        }
        if (!d.a.f5625a || (dVar = this.f5284e) == null) {
            float f3 = t.f5733a;
            float f4 = t.f5734b;
            return new com.airbnb.lottie.j.d(f3 + ((t2.f5733a - f3) * f2), f4 + (f2 * (t2.f5734b - f4)));
        }
        float f5 = t.f5733a;
        float f6 = f5 + ((t2.f5733a - f5) * f2);
        float f7 = t.f5734b;
        dVar.f5733a = f6;
        dVar.f5734b = f7 + (f2 * (t2.f5734b - f7));
        return this.f5284e;
    }
}
