package com.ss.android.ugc.tools.utils;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;

public final class o {
    static {
        Covode.recordClassIndex(98757);
    }

    public static void a(RectF rectF, float f2) {
        float width = rectF.width();
        float height = rectF.height();
        float f3 = ((f2 * width) - width) / 2.0f;
        float f4 = ((f2 * height) - height) / 2.0f;
        rectF.left -= f3;
        rectF.top -= f4;
        rectF.right += f3;
        rectF.bottom += f4;
    }

    public static void a(Point point, float f2, float f3, float f4) {
        double d2 = (double) f4;
        float sin = (float) Math.sin(Math.toRadians(d2));
        float cos = (float) Math.cos(Math.toRadians(d2));
        point.set((int) ((((((float) point.x) - f2) * cos) + f2) - ((((float) point.y) - f3) * sin)), (int) (f3 + ((((float) point.y) - f3) * cos) + ((((float) point.x) - f2) * sin)));
    }

    public static boolean b(RectF rectF, float f2, float f3, float f4) {
        if (Math.abs(f4) <= 0.0f) {
            return rectF.contains(f2, f3);
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        double d2 = (double) (-f4);
        float sin = (float) Math.sin(Math.toRadians(d2));
        float cos = (float) Math.cos(Math.toRadians(d2));
        float f5 = f2 - centerX;
        float f6 = f3 - centerY;
        return rectF.contains((centerX + (f5 * cos)) - (f6 * sin), centerY + (f6 * cos) + (f5 * sin));
    }

    public static PointF a(PointF pointF, float f2, float f3, float f4) {
        if (Math.abs(f4) <= 0.0f) {
            return pointF;
        }
        double d2 = (double) (pointF.x - f2);
        double d3 = (double) f4;
        double cos = Math.cos(d3);
        Double.isNaN(d2);
        double d4 = d2 * cos;
        double d5 = (double) (pointF.y - f3);
        double sin = Math.sin(d3);
        Double.isNaN(d5);
        double d6 = d4 - (d5 * sin);
        double d7 = (double) f2;
        Double.isNaN(d7);
        double d8 = (double) (pointF.x - f2);
        double sin2 = Math.sin(d3);
        Double.isNaN(d8);
        double d9 = d8 * sin2;
        double d10 = (double) (pointF.y - f3);
        double cos2 = Math.cos(d3);
        Double.isNaN(d10);
        double d11 = (double) f3;
        Double.isNaN(d11);
        float f5 = (float) (d6 + d7);
        float f6 = (float) (d9 + (d10 * cos2) + d11);
        pointF.set(f5, f6);
        return new PointF(f5, f6);
    }

    public static void a(RectF rectF, float f2, float f3, float f4) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        double d2 = (double) f4;
        float sin = (float) Math.sin(Math.toRadians(d2));
        float cos = (float) Math.cos(Math.toRadians(d2));
        float f5 = centerX - f2;
        float f6 = centerY - f3;
        rectF.offset(((f2 + (f5 * cos)) - (f6 * sin)) - centerX, ((f3 + (f6 * cos)) + (f5 * sin)) - centerY);
    }
}
