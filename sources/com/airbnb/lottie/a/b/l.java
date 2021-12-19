package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.d;
import com.airbnb.lottie.i.f;
import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class l extends a<com.airbnb.lottie.e.b.l, Path> {

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.e.b.l f5285e = new com.airbnb.lottie.e.b.l();

    /* renamed from: f  reason: collision with root package name */
    private final Path f5286f = new Path();

    static {
        Covode.recordClassIndex(2223);
    }

    public l(List<a<com.airbnb.lottie.e.b.l>> list) {
        super(list);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.lottie.j.a, float] */
    @Override // com.airbnb.lottie.a.b.a
    public final /* synthetic */ Path a(a<com.airbnb.lottie.e.b.l> aVar, float f2) {
        boolean z;
        T t = aVar.f5710b;
        T t2 = aVar.f5711c;
        com.airbnb.lottie.e.b.l lVar = this.f5285e;
        if (lVar.f5428b == null) {
            lVar.f5428b = new PointF();
        }
        if (t.f5429c || t2.f5429c) {
            z = true;
        } else {
            z = false;
        }
        lVar.f5429c = z;
        if (t.f5427a.size() != t2.f5427a.size()) {
            d.a("Curves must have the same number of control points. Shape 1: " + t.f5427a.size() + "\tShape 2: " + t2.f5427a.size());
        }
        if (lVar.f5427a.isEmpty()) {
            int min = Math.min(t.f5427a.size(), t2.f5427a.size());
            for (int i2 = 0; i2 < min; i2++) {
                lVar.f5427a.add(new com.airbnb.lottie.e.a());
            }
        }
        PointF pointF = t.f5428b;
        PointF pointF2 = t2.f5428b;
        float f3 = pointF.x;
        float f4 = f3 + ((pointF2.x - f3) * f2);
        float f5 = pointF.y;
        float f6 = f5 + ((pointF2.y - f5) * f2);
        if (lVar.f5428b == null) {
            lVar.f5428b = new PointF();
        }
        lVar.f5428b.set(f4, f6);
        for (int size = lVar.f5427a.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.e.a aVar2 = t.f5427a.get(size);
            com.airbnb.lottie.e.a aVar3 = t2.f5427a.get(size);
            PointF pointF3 = aVar2.f5343a;
            PointF pointF4 = aVar2.f5344b;
            PointF pointF5 = aVar2.f5345c;
            PointF pointF6 = aVar3.f5343a;
            PointF pointF7 = aVar3.f5344b;
            PointF pointF8 = aVar3.f5345c;
            float f7 = pointF3.x;
            float f8 = f7 + ((pointF6.x - f7) * f2);
            float f9 = pointF3.y;
            lVar.f5427a.get(size).f5343a.set(f8, f9 + ((pointF6.y - f9) * f2));
            float f10 = pointF4.x;
            float f11 = f10 + ((pointF7.x - f10) * f2);
            float f12 = pointF4.y;
            lVar.f5427a.get(size).f5344b.set(f11, f12 + ((pointF7.y - f12) * f2));
            float f13 = pointF5.x;
            float f14 = f13 + ((pointF8.x - f13) * f2);
            float f15 = pointF5.y;
            lVar.f5427a.get(size).f5345c.set(f14, f15 + ((pointF8.y - f15) * f2));
        }
        f.a(this.f5285e, this.f5286f);
        return this.f5286f;
    }
}
