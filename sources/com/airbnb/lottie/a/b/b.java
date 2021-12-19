package com.airbnb.lottie.a.b;

import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class b extends f<Integer> {
    static {
        Covode.recordClassIndex(2213);
    }

    public b(List<a<Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        if (aVar.f5710b == null || aVar.f5711c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = aVar.f5710b.intValue();
        int intValue2 = aVar.f5711c.intValue();
        if (this.f5260d != null) {
            return this.f5260d.a(aVar.f5713e, aVar.f5714f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f2, c(), this.f5259c);
        }
        return Integer.valueOf(com.airbnb.lottie.i.b.a(f2, intValue, intValue2));
    }
}
