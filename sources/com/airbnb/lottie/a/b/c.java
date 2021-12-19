package com.airbnb.lottie.a.b;

import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class c extends f<Float> {
    static {
        Covode.recordClassIndex(2214);
    }

    public final float g() {
        Float f2;
        a b2 = b();
        float d2 = d();
        if (b2.f5710b == null || b2.f5711c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f5260d != null && (f2 = (Float) this.f5260d.a(b2.f5713e, b2.f5714f.floatValue(), b2.f5710b, b2.f5711c, d2, c(), this.f5259c)) != null) {
            return f2.floatValue();
        } else {
            if (b2.f5715g == -3987645.8f) {
                b2.f5715g = b2.f5710b.floatValue();
            }
            float f3 = b2.f5715g;
            if (b2.f5716h == -3987645.8f) {
                b2.f5716h = b2.f5711c.floatValue();
            }
            return f3 + (d2 * (b2.f5716h - f3));
        }
    }

    public c(List<a<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        if (aVar.f5710b == null || aVar.f5711c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f5260d != null) {
            return this.f5260d.a(aVar.f5713e, aVar.f5714f.floatValue(), aVar.f5710b, aVar.f5711c, f2, c(), this.f5259c);
        } else {
            float floatValue = aVar.f5710b.floatValue();
            return Float.valueOf(floatValue + (f2 * (aVar.f5711c.floatValue() - floatValue)));
        }
    }
}
