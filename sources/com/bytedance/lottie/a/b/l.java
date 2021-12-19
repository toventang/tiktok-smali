package com.bytedance.lottie.a.b;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.e;
import com.bytedance.lottie.f.f;
import com.bytedance.lottie.g.a;
import java.util.List;

public final class l extends a<com.bytedance.lottie.c.b.l, Path> {

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.lottie.c.b.l f40441e = new com.bytedance.lottie.c.b.l();

    /* renamed from: f  reason: collision with root package name */
    private final Path f40442f = new Path();

    static {
        Covode.recordClassIndex(24863);
    }

    public l(List<a<com.bytedance.lottie.c.b.l>> list) {
        super(list);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.lottie.g.a, float] */
    @Override // com.bytedance.lottie.a.b.a
    public final /* synthetic */ Path a(a<com.bytedance.lottie.c.b.l> aVar, float f2) {
        boolean z;
        T t = aVar.f40720c;
        T t2 = aVar.f40721d;
        com.bytedance.lottie.c.b.l lVar = this.f40441e;
        if (lVar.f40552b == null) {
            lVar.f40552b = new PointF();
        }
        if (t.f40553c || t2.f40553c) {
            z = true;
        } else {
            z = false;
        }
        lVar.f40553c = z;
        if (t.f40551a.size() != t2.f40551a.size()) {
            e.a("Curves must have the same number of control points. Shape 1: " + t.f40551a.size() + "\tShape 2: " + t2.f40551a.size());
        }
        if (lVar.f40551a.isEmpty()) {
            int min = Math.min(t.f40551a.size(), t2.f40551a.size());
            for (int i2 = 0; i2 < min; i2++) {
                lVar.f40551a.add(new com.bytedance.lottie.c.a());
            }
        }
        PointF pointF = t.f40552b;
        PointF pointF2 = t2.f40552b;
        float f3 = pointF.x;
        float f4 = f3 + ((pointF2.x - f3) * f2);
        float f5 = pointF.y;
        float f6 = f5 + ((pointF2.y - f5) * f2);
        if (lVar.f40552b == null) {
            lVar.f40552b = new PointF();
        }
        lVar.f40552b.set(f4, f6);
        for (int size = lVar.f40551a.size() - 1; size >= 0; size--) {
            com.bytedance.lottie.c.a aVar2 = t.f40551a.get(size);
            com.bytedance.lottie.c.a aVar3 = t2.f40551a.get(size);
            PointF pointF3 = aVar2.f40469a;
            PointF pointF4 = aVar2.f40470b;
            PointF pointF5 = aVar2.f40471c;
            PointF pointF6 = aVar3.f40469a;
            PointF pointF7 = aVar3.f40470b;
            PointF pointF8 = aVar3.f40471c;
            float f7 = pointF3.x;
            float f8 = f7 + ((pointF6.x - f7) * f2);
            float f9 = pointF3.y;
            lVar.f40551a.get(size).f40469a.set(f8, f9 + ((pointF6.y - f9) * f2));
            float f10 = pointF4.x;
            float f11 = f10 + ((pointF7.x - f10) * f2);
            float f12 = pointF4.y;
            lVar.f40551a.get(size).f40470b.set(f11, f12 + ((pointF7.y - f12) * f2));
            float f13 = pointF5.x;
            float f14 = f13 + ((pointF8.x - f13) * f2);
            float f15 = pointF5.y;
            lVar.f40551a.get(size).f40471c.set(f14, f15 + ((pointF8.y - f15) * f2));
        }
        f.a(this.f40441e, this.f40442f);
        return this.f40442f;
    }
}
