package com.bytedance.lottie.a.b;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g;
import com.bytedance.lottie.g.a;

public final class h extends a<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public Path f40435a;

    static {
        Covode.recordClassIndex(24859);
    }

    public h(g gVar, a<PointF> aVar) {
        super(gVar, aVar.f40720c, aVar.f40721d, aVar.f40722e, aVar.f40723f, aVar.f40724g);
        boolean z;
        if (this.f40721d == null || this.f40720c == null || !((PointF) this.f40720c).equals(((PointF) this.f40721d).x, ((PointF) this.f40721d).y)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f40721d != null && !z) {
            PointF pointF = (PointF) this.f40720c;
            PointF pointF2 = (PointF) this.f40721d;
            PointF pointF3 = aVar.f40725h;
            PointF pointF4 = aVar.f40726i;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
                path.lineTo(pointF2.x, pointF2.y);
            } else {
                path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            }
            this.f40435a = path;
        }
    }
}
