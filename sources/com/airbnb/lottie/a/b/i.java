package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class i extends f<PointF> {

    /* renamed from: e  reason: collision with root package name */
    private final PointF f5279e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private final float[] f5280f = new float[2];

    /* renamed from: g  reason: collision with root package name */
    private h f5281g;

    /* renamed from: h  reason: collision with root package name */
    private PathMeasure f5282h;

    static {
        Covode.recordClassIndex(2220);
    }

    public i(List<? extends a<PointF>> list) {
        super(list);
        if (d.a.f5625a) {
            this.f5282h = new PathMeasure();
        }
    }

    @Override // com.airbnb.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        PathMeasure pathMeasure;
        h hVar = (h) aVar;
        Path path = hVar.f5277a;
        if (path == null) {
            return aVar.f5710b;
        }
        if (this.f5260d != null) {
            return this.f5260d.a(hVar.f5713e, hVar.f5714f.floatValue(), hVar.f5710b, hVar.f5711c, c(), f2, this.f5259c);
        }
        if (this.f5281g != hVar) {
            if (!d.a.f5625a || (pathMeasure = this.f5282h) == null) {
                this.f5282h = new PathMeasure(path, false);
            } else {
                pathMeasure.setPath(path, false);
            }
            this.f5281g = hVar;
        }
        PathMeasure pathMeasure2 = this.f5282h;
        pathMeasure2.getPosTan(f2 * pathMeasure2.getLength(), this.f5280f, null);
        PointF pointF = this.f5279e;
        float[] fArr = this.f5280f;
        pointF.set(fArr[0], fArr[1]);
        return this.f5279e;
    }
}
