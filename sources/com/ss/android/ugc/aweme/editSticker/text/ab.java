package com.ss.android.ugc.aweme.editSticker.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class ab {
    static {
        Covode.recordClassIndex(55534);
    }

    public static final float a() {
        return a(new Paint());
    }

    private static float a(Paint paint) {
        MethodCollector.i(2884);
        l.d(paint, "");
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        l.b(createBitmap, "");
        Canvas canvas = new Canvas(createBitmap);
        float f2 = 1.0f;
        float f3 = 1.0f;
        while (true) {
            if (f2 >= 99999.0f) {
                f2 = 99999.0f;
                break;
            } else if (!a(createBitmap, canvas, paint, f2)) {
                break;
            } else {
                f3 = f2;
                f2 = 2.0f * f2;
            }
        }
        while (f2 - f3 > 1.0f) {
            float f4 = (f2 + f3) / 2.0f;
            if (!a(createBitmap, canvas, paint, f4)) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
        double d2 = (double) f3;
        Double.isNaN(d2);
        float f5 = (float) (d2 / 1.42d);
        MethodCollector.o(2884);
        return f5;
    }

    private static final boolean a(Bitmap bitmap, Canvas canvas, Paint paint, float f2) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        paint.setTextSize(f2);
        float abs = Math.abs(paint.ascent());
        float abs2 = Math.abs(paint.descent());
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("🏻", 0.5f, (((abs + abs2) / 2.0f) + 0.5f) - abs2, paint);
        if (bitmap.getPixel(0, 0) != 0) {
            return true;
        }
        return false;
    }
}
