package com.ss.android.ugc.aweme.editSticker.f;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(55411);
    }

    public static RectF a(PointF[] pointFArr) {
        float f2 = pointFArr[0].x;
        float f3 = pointFArr[0].y;
        float f4 = f3;
        float f5 = f2;
        for (PointF pointF : pointFArr) {
            if (pointF.x < f2) {
                f2 = pointF.x;
            }
            if (pointF.x > f5) {
                f5 = pointF.x;
            }
            if (pointF.y < f3) {
                f3 = pointF.y;
            }
            if (pointF.y > f4) {
                f4 = pointF.y;
            }
        }
        return new RectF(f2, f3, f5, f4);
    }

    public static boolean a(Rect rect, PointF[] pointFArr) {
        boolean z = false;
        if (pointFArr == null || rect == null) {
            return false;
        }
        RectF a2 = a(pointFArr);
        if (a2.right < ((float) rect.left)) {
            z = true;
        }
        if (a2.left > ((float) rect.right)) {
            z = true;
        }
        if (a2.bottom < ((float) rect.top)) {
            z = true;
        }
        if (a2.top > ((float) rect.bottom)) {
            return true;
        }
        return z;
    }
}
