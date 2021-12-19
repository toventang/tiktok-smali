package com.ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class ag {
    static {
        Covode.recordClassIndex(93301);
    }

    private static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static Bitmap a(Drawable drawable) {
        Bitmap.Config config;
        MethodCollector.i(2134);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        MethodCollector.o(2134);
        return createBitmap;
    }

    public static boolean a(Bitmap bitmap, File file, int i2, Bitmap.CompressFormat compressFormat) {
        Throwable th;
        Exception e2;
        MethodCollector.i(2130);
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                a((OutputStream) null);
                MethodCollector.o(2130);
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
                    MethodCollector.o(2130);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    a(bufferedOutputStream);
                    MethodCollector.o(2130);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                a(bufferedOutputStream);
                MethodCollector.o(2130);
                throw th;
            }
            MethodCollector.o(2130);
            return z;
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            a(bufferedOutputStream);
            MethodCollector.o(2130);
            return z;
        }
    }
}
