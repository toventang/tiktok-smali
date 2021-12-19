package com.bytedance.lottie.f;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.j;
import com.bytedance.lottie.c.b.l;
import com.bytedance.lottie.c.e;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(24981);
    }

    static class a extends g<PointF> {

        /* renamed from: a  reason: collision with root package name */
        static final a f40697a = new a();

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.bytedance.lottie.f.g
        public final /* bridge */ /* synthetic */ PointF[] a() {
            return new PointF[3];
        }

        private a() {
        }

        static {
            Covode.recordClassIndex(24982);
        }
    }

    public static int a(int i2) {
        return Math.max(0, Math.min(255, i2));
    }

    static int a(float f2, float f3) {
        boolean z;
        int i2 = (int) f2;
        int i3 = (int) f3;
        int i4 = i2 / i3;
        if ((i2 ^ i3) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = i2 % i3;
        if (!z && i5 != 0) {
            i4--;
        }
        return i2 - (i3 * i4);
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void a(l lVar, Path path) {
        path.reset();
        PointF pointF = lVar.f40552b;
        path.moveTo(pointF.x, pointF.y);
        float f2 = pointF.x;
        float f3 = pointF.y;
        PointF pointF2 = (PointF) a.f40697a.b();
        if (pointF2 == null) {
            pointF2 = new PointF(f2, f3);
        } else {
            pointF2.x = f2;
            pointF2.y = f3;
        }
        for (int i2 = 0; i2 < lVar.f40551a.size(); i2++) {
            com.bytedance.lottie.c.a aVar = lVar.f40551a.get(i2);
            PointF pointF3 = aVar.f40469a;
            PointF pointF4 = aVar.f40470b;
            PointF pointF5 = aVar.f40471c;
            if (!pointF3.equals(pointF2) || !pointF4.equals(pointF5)) {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            } else {
                path.lineTo(pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
        }
        a.f40697a.a(pointF2);
        if (lVar.f40553c) {
            path.close();
        }
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    public static void a(e eVar, int i2, List<e> list, e eVar2, j jVar) {
        if (eVar.c(jVar.b(), i2)) {
            list.add(eVar2.a(jVar.b()).a(jVar));
        }
    }
}
