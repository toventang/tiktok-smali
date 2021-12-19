package com.ss.android.ugc.aweme.tools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.h;
import h.f.b.l;
import h.p;
import h.v;

public final class d {
    static {
        Covode.recordClassIndex(91063);
    }

    public static final p<Integer, Integer> a(String str) {
        boolean z = false;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            return new p<>(0, 0);
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            h.a(str, options);
            ExifInterface c2 = h.c(str);
            int i2 = -1;
            if (c2 != null) {
                i2 = c2.getAttributeInt("Orientation", -1);
            }
            if (i2 == 6 || i2 == 8) {
                return new p<>(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
            }
            return new p<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        } catch (Exception unused) {
            return new p<>(0, 0);
        }
    }

    private static int a(BitmapFactory.Options options, int i2, int i3) {
        l.d(options, "");
        p a2 = v.a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) a2.component1()).intValue();
        int intValue2 = ((Number) a2.component2()).intValue();
        int i4 = 1;
        if (intValue > i3 || intValue2 > i2) {
            int i5 = intValue / 2;
            int i6 = intValue2 / 2;
            while (i5 / i4 >= i3 && i6 / i4 >= i2) {
                i4 *= 2;
            }
        }
        return i4;
    }

    public static final Bitmap a(String str, int i2, int i3) {
        Bitmap bitmap;
        MethodCollector.i(2666);
        l.d(str, "");
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = a(options, i2, i3);
            options.inJustDecodeBounds = false;
            bitmap = BitmapFactory.decodeFile(str, options);
        } catch (Exception unused) {
            bitmap = null;
        }
        MethodCollector.o(2666);
        return bitmap;
    }
}
