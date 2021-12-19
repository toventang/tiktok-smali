package com.ss.android.ugc.tools.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {
    static {
        Covode.recordClassIndex(98739);
    }

    public static Bitmap a(Bitmap bitmap, float f2) {
        MethodCollector.i(11573);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        MethodCollector.o(11573);
        return createBitmap;
    }

    public static int a(BitmapFactory.Options options, int i2, int i3) {
        int i4 = 1;
        if (!(i2 == 0 || i3 == 0)) {
            int i5 = options.outWidth;
            int i6 = options.outHeight;
            if (i5 > i2 || i6 > i3) {
                int i7 = i5 >> 1;
                int i8 = i6 >> 1;
                while (i7 / i4 > i2 && i8 / i4 > i3) {
                    i4 <<= 1;
                }
            }
        }
        return i4;
    }
}
