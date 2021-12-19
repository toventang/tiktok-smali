package com.bytedance.lottie.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g.a;
import java.util.List;

public final class e extends f<Integer> {
    static {
        Covode.recordClassIndex(24856);
    }

    public e(List<a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        Object a2;
        if (aVar.f40720c == null || aVar.f40721d == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f40419d != null && (a2 = this.f40419d.a(aVar.f40723f, aVar.f40724g.floatValue(), aVar.f40720c, aVar.f40721d, f2, b(), this.f40418c)) != null) {
            return a2;
        } else {
            int intValue = aVar.f40720c.intValue();
            return Integer.valueOf((int) (((float) intValue) + (f2 * ((float) (aVar.f40721d.intValue() - intValue)))));
        }
    }
}
