package com.ss.android.ugc.tools.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class c {
    static {
        Covode.recordClassIndex(98740);
    }

    public static void a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static int[] a(String str) {
        if (!i.a(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        h.a(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    public static Bitmap a(String str, int[] iArr) {
        return a(str, iArr, Bitmap.Config.RGB_565);
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
        MethodCollector.i(5118);
        if (bitmap == null || bitmap.isRecycled()) {
            MethodCollector.o(5118);
            return bitmap2;
        } else if (bitmap2 == null || bitmap2.isRecycled()) {
            MethodCollector.o(5118);
            return bitmap;
        } else {
            Paint paint = new Paint(2);
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            new Canvas(copy).drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), paint);
            MethodCollector.o(5118);
            return copy;
        }
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r3 <= 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(java.lang.String r6, int[] r7, android.graphics.Bitmap.Config r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r4 = 1
            r5.inJustDecodeBounds = r4
            r5.inPreferredConfig = r8
            com.ss.android.ugc.tools.utils.h.a(r6, r5)
            r0 = 0
            r5.inJustDecodeBounds = r0
            int r3 = r5.outWidth
            int r2 = r5.outHeight
            r1 = r7[r0]
            r0 = r7[r4]
            if (r3 < r2) goto L_0x002e
            if (r3 <= r1) goto L_0x002e
            int r3 = r3 / r1
        L_0x0025:
            if (r3 > 0) goto L_0x0036
        L_0x0027:
            r5.inSampleSize = r4
            android.graphics.Bitmap r0 = com.ss.android.ugc.tools.utils.h.a(r6, r5)
            return r0
        L_0x002e:
            if (r3 >= r2) goto L_0x0035
            if (r2 <= r0) goto L_0x0035
            int r3 = r2 / r0
            goto L_0x0025
        L_0x0035:
            r3 = 1
        L_0x0036:
            r4 = r3
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.utils.c.a(java.lang.String, int[], android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public static boolean a(Bitmap bitmap, File file, int i2, Bitmap.CompressFormat compressFormat) {
        Throwable th;
        Exception e2;
        MethodCollector.i(5106);
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                a((OutputStream) null);
                MethodCollector.o(5106);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, i2, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                a(bufferedOutputStream2);
            } catch (Exception e3) {
                e2 = e3;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    e2.printStackTrace();
                    a(bufferedOutputStream);
                    MethodCollector.o(5106);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    a(bufferedOutputStream);
                    MethodCollector.o(5106);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                a(bufferedOutputStream);
                MethodCollector.o(5106);
                throw th;
            }
            MethodCollector.o(5106);
            return z;
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            a(bufferedOutputStream);
            MethodCollector.o(5106);
            return z;
        }
    }
}
