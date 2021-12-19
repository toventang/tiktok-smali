package com.bytedance.lottie.a.b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g.a;
import java.util.List;

public final class j extends f<PointF> {

    /* renamed from: e  reason: collision with root package name */
    private final PointF f40440e = new PointF();

    static {
        Covode.recordClassIndex(24861);
    }

    public j(List<a<PointF>> list) {
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
        this.f40440e.set(((PointF) t).x + ((((PointF) t2).x - ((PointF) t).x) * f2), ((PointF) t).y + (f2 * (((PointF) t2).y - ((PointF) t).y)));
        return this.f40440e;
    }
}
