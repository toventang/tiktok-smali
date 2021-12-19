package com.airbnb.lottie.a.b;

import com.airbnb.lottie.i.f;
import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class e extends f<Integer> {
    static {
        Covode.recordClassIndex(2216);
    }

    public final int g() {
        Integer num;
        a b2 = b();
        float d2 = d();
        if (b2.f5710b == null || b2.f5711c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f5260d != null && (num = (Integer) this.f5260d.a(b2.f5713e, b2.f5714f.floatValue(), b2.f5710b, b2.f5711c, d2, c(), this.f5259c)) != null) {
            return num.intValue();
        } else {
            if (b2.f5717i == 784923401) {
                b2.f5717i = b2.f5710b.intValue();
            }
            int i2 = b2.f5717i;
            if (b2.f5718j == 784923401) {
                b2.f5718j = b2.f5711c.intValue();
            }
            return f.a(i2, b2.f5718j, d2);
        }
    }

    public e(List<a<Integer>> list) {
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
            return Integer.valueOf(f.a(aVar.f5710b.intValue(), aVar.f5711c.intValue(), f2));
        }
    }
}
