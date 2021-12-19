package com.bytedance.lottie.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.f.c;
import com.bytedance.lottie.g.a;
import java.util.List;

public final class b extends f<Integer> {
    static {
        Covode.recordClassIndex(24853);
    }

    public b(List<a<Integer>> list) {
        super(list);
    }

    @Override // com.bytedance.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        Object a2;
        if (aVar.f40720c == null || aVar.f40721d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = aVar.f40720c.intValue();
        int intValue2 = aVar.f40721d.intValue();
        if (this.f40419d == null || (a2 = this.f40419d.a(aVar.f40723f, aVar.f40724g.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f2, b(), this.f40418c)) == null) {
            return Integer.valueOf(c.a(f2, intValue, intValue2));
        }
        return a2;
    }
}
