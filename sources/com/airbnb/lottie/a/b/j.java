package com.airbnb.lottie.a.b;

import android.graphics.PointF;
import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class j extends f<PointF> {

    /* renamed from: e  reason: collision with root package name */
    private final PointF f5283e = new PointF();

    static {
        Covode.recordClassIndex(2221);
    }

    public j(List<a<PointF>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        if (aVar.f5710b == null || aVar.f5711c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t = aVar.f5710b;
        T t2 = aVar.f5711c;
        if (this.f5260d != null) {
            return this.f5260d.a(aVar.f5713e, aVar.f5714f.floatValue(), t, t2, f2, c(), this.f5259c);
        }
        this.f5283e.set(((PointF) t).x + ((((PointF) t2).x - ((PointF) t).x) * f2), ((PointF) t).y + (f2 * (((PointF) t2).y - ((PointF) t).y)));
        return this.f5283e;
    }
}
