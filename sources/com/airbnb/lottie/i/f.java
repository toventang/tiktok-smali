package com.airbnb.lottie.i;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.a.a.k;
import com.airbnb.lottie.e.a;
import com.airbnb.lottie.e.b.l;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.g.d;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<PointF> f5694a = new ThreadLocal<PointF>() {
        /* class com.airbnb.lottie.i.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(2388);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ PointF initialValue() {
            return new PointF();
        }
    };

    public static int a(int i2, int i3, float f2) {
        return (int) (((float) i2) + (f2 * ((float) (i3 - i2))));
    }

    static {
        Covode.recordClassIndex(2387);
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
        PointF pointF;
        path.reset();
        PointF pointF2 = lVar.f5428b;
        path.moveTo(pointF2.x, pointF2.y);
        if (d.a.f5625a) {
            pointF = f5694a.get();
            pointF.set(pointF2.x, pointF2.y);
        } else {
            pointF = new PointF(pointF2.x, pointF2.y);
        }
        for (int i2 = 0; i2 < lVar.f5427a.size(); i2++) {
            a aVar = lVar.f5427a.get(i2);
            PointF pointF3 = aVar.f5343a;
            PointF pointF4 = aVar.f5344b;
            PointF pointF5 = aVar.f5345c;
            if (!pointF3.equals(pointF) || !pointF4.equals(pointF5)) {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            } else {
                path.lineTo(pointF5.x, pointF5.y);
            }
            pointF.set(pointF5.x, pointF5.y);
        }
        if (lVar.f5429c) {
            path.close();
        }
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    public static void a(e eVar, int i2, List<e> list, e eVar2, k kVar) {
        if (eVar.c(kVar.b(), i2)) {
            list.add(eVar2.a(kVar.b()).a(kVar));
        }
    }
}
