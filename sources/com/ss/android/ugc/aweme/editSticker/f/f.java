package com.ss.android.ugc.aweme.editSticker.f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.tools.utils.c;

public final class f {
    static {
        Covode.recordClassIndex(55416);
    }

    public static Bitmap a(View view, int i2, int i3, int i4, int i5) {
        Bitmap bitmap;
        MethodCollector.i(4337);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(d.a().getResources().getDisplayMetrics().densityDpi);
            if (view.getDrawingCacheBackgroundColor() != 0) {
                createBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
            }
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate((float) (-view.getScrollX()), (float) (-view.getScrollY()));
            view.draw(canvas);
            int width = createBitmap.getWidth();
            int height = createBitmap.getHeight();
            if (width == i2 && height == i3) {
                bitmap = createBitmap;
            } else if (i4 <= 0 || i5 <= 0 || (width <= i4 && height <= i5)) {
                Matrix matrix = new Matrix();
                matrix.postScale(((float) i2) / ((float) width), ((float) i3) / ((float) height));
                createBitmap = createBitmap;
                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, width, height, matrix, true);
            } else {
                Matrix matrix2 = new Matrix();
                matrix2.setTranslate(((float) (width - i4)) * 0.5f, ((float) (height - i5)) * 0.5f);
                matrix2.postScale(((float) i2) / ((float) i4), ((float) i3) / ((float) i5));
                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, i4, i5, matrix2, true);
            }
            if (bitmap != createBitmap) {
                c.a(createBitmap);
            }
            MethodCollector.o(4337);
            return bitmap;
        } catch (OutOfMemoryError e2) {
            if (d.d() != null) {
                d.d().a(e2);
            }
            MethodCollector.o(4337);
            return null;
        }
    }
}
