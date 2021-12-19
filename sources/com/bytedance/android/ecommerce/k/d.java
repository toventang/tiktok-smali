package com.bytedance.android.ecommerce.k;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7133a = d.class.getName();

    static {
        Covode.recordClassIndex(3431);
    }

    public static byte[] a(Bitmap bitmap) {
        MethodCollector.i(7600);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        MethodCollector.o(7600);
        return byteArray;
    }

    public static Bitmap a(Bitmap bitmap, float f2) {
        MethodCollector.i(7597);
        Matrix matrix = new Matrix();
        matrix.postRotate(f2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        MethodCollector.o(7597);
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i2) {
        Bitmap bitmap2 = bitmap;
        MethodCollector.i(7605);
        while (true) {
            int byteCount = bitmap2.getByteCount();
            if (i2 >= byteCount) {
                break;
            }
            double d2 = (double) i2;
            Double.isNaN(d2);
            double d3 = (double) byteCount;
            Double.isNaN(d3);
            float sqrt = (float) Math.sqrt((d2 + 0.0d) / d3);
            Matrix matrix = new Matrix();
            matrix.setScale(sqrt, sqrt);
            bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            if (bitmap2.getByteCount() <= i2) {
                break;
            }
            i2 -= 2;
        }
        MethodCollector.o(7605);
        return bitmap2;
    }
}
