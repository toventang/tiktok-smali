package com.bytedance.android.livesdk.wishlist.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a {
    static {
        Covode.recordClassIndex(13477);
    }

    public static Bitmap a(Bitmap bitmap, int i2) {
        MethodCollector.i(9016);
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-16777216);
            float f2 = (float) i2;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), f2, f2, paint);
            int i3 = width - i2;
            canvas.drawRect(new Rect(i3, 0, width, i2), paint);
            int i4 = height - i2;
            canvas.drawRect(new Rect(0, i4, i2, height), paint);
            canvas.drawRect(new Rect(i3, i4, width, height), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            Rect rect = new Rect(0, 0, width, height);
            canvas.drawBitmap(bitmap, rect, rect, paint);
            MethodCollector.o(9016);
            return createBitmap;
        } catch (Exception unused) {
            MethodCollector.o(9016);
            return bitmap;
        }
    }
}
