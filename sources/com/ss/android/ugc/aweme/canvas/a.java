package com.ss.android.ugc.aweme.canvas;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(42949);
    }

    private static final void a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    private static int a(String str) {
        if (!i.a(str)) {
            return 0;
        }
        try {
            ExifInterface c2 = h.c(str);
            if (c2 == null) {
                return 0;
            }
            Integer valueOf = Integer.valueOf(c2.getAttributeInt("Orientation", 1));
            if (valueOf == null) {
                return 0;
            }
            if (valueOf.intValue() == 6) {
                return 90;
            }
            if (valueOf.intValue() == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (valueOf.intValue() == 8) {
                return 270;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static int a(int i2, int i3) {
        int i4 = 1;
        if (i3 > 0 && i2 > 0) {
            while (i2 / (i4 * i4) > i3) {
                i4 <<= 1;
            }
        }
        return i4;
    }

    private static final Bitmap a(Bitmap bitmap, int i2) {
        MethodCollector.i(3482);
        if (i2 == 0) {
            MethodCollector.o(3482);
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        a(bitmap);
        MethodCollector.o(3482);
        return createBitmap;
    }

    private static Bitmap a(String str, int i2, int i3, Bitmap.Config config) {
        MethodCollector.i(3460);
        l.d(config, "");
        Bitmap bitmap = null;
        if (!i.a(str)) {
            MethodCollector.o(3460);
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        h.a(str, options);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = config;
        options.inSampleSize = 1;
        try {
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            Bitmap a2 = h.a(str, options);
            if (a2 == null) {
                MethodCollector.o(3460);
                return null;
            }
            int a3 = a(str);
            if (a3 % LiveFeedRefreshTimeSetting.DEFAULT == 90) {
                i3 = i2;
                i2 = i3;
            }
            if (options.outWidth > i2 || options.outHeight > i3) {
                float f2 = (float) i2;
                float f3 = (float) i3;
                if (((float) options.outWidth) / f2 > ((float) options.outHeight) / f3) {
                    i3 = (int) ((f2 * ((float) options.outHeight)) / ((float) options.outWidth));
                } else {
                    i2 = (int) ((f3 * ((float) options.outWidth)) / ((float) options.outHeight));
                }
                a2 = Bitmap.createScaledBitmap(a2, i2, i3, true);
                l.b(a2, "");
            }
            bitmap = a(a2, a3);
            MethodCollector.o(3460);
            return bitmap;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap a(java.lang.String r4, int r5, int r6, boolean r7, android.graphics.Bitmap.Config r8) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.canvas.a.a(java.lang.String, int, int, boolean, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }
}
