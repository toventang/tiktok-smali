package com.bytedance.lottie.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g.a;
import com.bytedance.lottie.g.d;
import java.util.List;

public final class k extends f<d> {
    static {
        Covode.recordClassIndex(24862);
    }

    public k(List<a<d>> list) {
        super(list);
    }

    @Override // com.bytedance.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        Object a2;
        if (aVar.f40720c == null || aVar.f40721d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t = aVar.f40720c;
        T t2 = aVar.f40721d;
        if (this.f40419d != null && (a2 = this.f40419d.a(aVar.f40723f, aVar.f40724g.floatValue(), t, t2, f2, b(), this.f40418c)) != null) {
            return a2;
        }
        float f3 = t.f40738a;
        float f4 = f3 + ((t2.f40738a - f3) * f2);
        float f5 = t.f40739b;
        float f6 = f5 + (f2 * (t2.f40739b - f5));
        d dVar = (d) d.a.f40740a.b();
        if (dVar == null) {
            return new d(f4, f6);
        }
        dVar.f40738a = f4;
        dVar.f40739b = f6;
        return dVar;
    }
}
