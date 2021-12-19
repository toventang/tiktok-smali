package com.ss.android.ugc.aweme.ci;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class a {
    static {
        Covode.recordClassIndex(43755);
    }

    private static Paint a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        return paint;
    }

    private static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static Canvas b(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        return canvas;
    }

    public static void a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
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

    public static int b(String str) {
        if (!i.a(str)) {
            return 0;
        }
        try {
            int attributeInt = h.c(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static Bitmap a(Bitmap bitmap, int i2, int i3) {
        float f2;
        MethodCollector.i(11648);
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float f3 = 0.0f;
        if (i2 > i3) {
            float f4 = (((float) i2) * 1.0f) / ((float) i3);
            float f5 = width / f4;
            if (height > f5) {
                f2 = (height - f5) / 2.0f;
                height = f5;
            } else {
                float f6 = f4 * height;
                f3 = (width - f6) / 2.0f;
                width = f6;
                f2 = 0.0f;
            }
        } else if (i2 < i3) {
            float f7 = (((float) i3) * 1.0f) / ((float) i2);
            float f8 = height / f7;
            if (width > f8) {
                f3 = (width - f8) / 2.0f;
                width = f8;
                f2 = 0.0f;
            } else {
                float f9 = f7 * width;
                f2 = (height - f9) / 2.0f;
                height = f9;
            }
        } else if (width > height) {
            f3 = (width - height) / 2.0f;
            width = height;
            f2 = 0.0f;
        } else {
            f2 = (height - width) / 2.0f;
            height = width;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        b(createBitmap).drawBitmap(bitmap, new Rect((int) f3, (int) f2, (int) (f3 + width), (int) (f2 + height)), new Rect(0, 0, i2, i3), a());
        a(bitmap);
        MethodCollector.o(11648);
        return createBitmap;
    }

    public static boolean a(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        Throwable th;
        Exception e2;
        MethodCollector.i(11650);
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                a((OutputStream) null);
                MethodCollector.o(11650);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                a(bufferedOutputStream2);
            } catch (Exception e3) {
                e2 = e3;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    e2.printStackTrace();
                    a(bufferedOutputStream);
                    MethodCollector.o(11650);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    a(bufferedOutputStream);
                    MethodCollector.o(11650);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                a(bufferedOutputStream);
                MethodCollector.o(11650);
                throw th;
            }
            MethodCollector.o(11650);
            return z;
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            a(bufferedOutputStream);
            MethodCollector.o(11650);
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        if (r14 < r10) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        if (r14 < r10) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(java.lang.String r15, int r16, int r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 519
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ci.a.a(java.lang.String, int, int, int, int):android.graphics.Bitmap");
    }
}
