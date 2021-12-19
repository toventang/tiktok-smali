package com.bytedance.lottie.a.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g.a;
import java.util.List;

public final class i extends f<PointF> {

    /* renamed from: e  reason: collision with root package name */
    private final PointF f40436e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private final float[] f40437f = new float[2];

    /* renamed from: g  reason: collision with root package name */
    private h f40438g;

    /* renamed from: h  reason: collision with root package name */
    private PathMeasure f40439h;

    static {
        Covode.recordClassIndex(24860);
    }

    public i(List<? extends a<PointF>> list) {
        super(list);
    }

    @Override // com.bytedance.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        Object a2;
        h hVar = (h) aVar;
        Path path = hVar.f40435a;
        if (path == null) {
            return aVar.f40720c;
        }
        if (this.f40419d != null && (a2 = this.f40419d.a(hVar.f40723f, hVar.f40724g.floatValue(), hVar.f40720c, hVar.f40721d, b(), f2, this.f40418c)) != null) {
            return a2;
        }
        if (this.f40438g != hVar) {
            this.f40439h = new PathMeasure(path, false);
            this.f40438g = hVar;
        }
        PathMeasure pathMeasure = this.f40439h;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), this.f40437f, null);
        PointF pointF = this.f40436e;
        float[] fArr = this.f40437f;
        pointF.set(fArr[0], fArr[1]);
        return this.f40436e;
    }
}
