package com.bytedance.android.livesdk.gift.c.a.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {
    static {
        Covode.recordClassIndex(9912);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.gift.c.a.a.a$a  reason: collision with other inner class name */
    public enum EnumC0372a {
        VERTICAL,
        HORIZONTAL;

        static {
            Covode.recordClassIndex(9913);
        }
    }

    public static Bitmap b(Bitmap bitmap) {
        MethodCollector.i(9184);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap);
            MethodCollector.o(9184);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            MethodCollector.o(9184);
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap) {
        EnumC0372a aVar;
        Rect rect;
        MethodCollector.i(9183);
        try {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
            Point point = new Point(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            if (bitmap.getWidth() > bitmap.getHeight()) {
                aVar = EnumC0372a.HORIZONTAL;
            } else {
                aVar = EnumC0372a.VERTICAL;
            }
            int i2 = min * 2;
            Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect2 = new Rect(0, 0, i2, i2);
            RectF rectF = new RectF(new Rect(0, 0, i2, i2));
            float min2 = (float) (Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, min2, min2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            if (aVar == EnumC0372a.HORIZONTAL) {
                rect = new Rect(point.x - min, 0, point.x + min, i2);
            } else {
                rect = new Rect(0, point.y - min, i2, point.y + min);
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            MethodCollector.o(9183);
            return createBitmap;
        } catch (Exception unused) {
            MethodCollector.o(9183);
            return bitmap;
        } catch (OutOfMemoryError unused2) {
            MethodCollector.o(9183);
            return null;
        }
    }
}
