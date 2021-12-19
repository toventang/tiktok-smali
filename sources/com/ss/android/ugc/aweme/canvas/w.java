package com.ss.android.ugc.aweme.canvas;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class w {
    static {
        Covode.recordClassIndex(43008);
    }

    private static float a(PointF pointF, PointF pointF2) {
        float f2 = pointF.y / pointF.x;
        float f3 = pointF2.y / pointF2.x;
        if (f2 > f3) {
            return f2 / f3;
        }
        return 1.0f;
    }

    public static float a(PointF pointF, PointF pointF2, boolean z) {
        l.d(pointF, "");
        l.d(pointF2, "");
        if (z) {
            return a(pointF, pointF2);
        }
        return a(pointF, pointF2);
    }
}
