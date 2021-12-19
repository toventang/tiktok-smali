package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.e.a;
import java.io.IOException;
import java.io.InputStream;

public final class HeifExifUtil {
    static {
        Covode.recordClassIndex(29226);
    }

    /* access modifiers changed from: package-private */
    public static class HeifExifUtilAndroidN {
        static {
            Covode.recordClassIndex(29227);
        }

        private HeifExifUtilAndroidN() {
        }

        static int getOrientation(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e2) {
                a.a("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e2);
                return 0;
            }
        }
    }

    public static int a(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.getOrientation(inputStream);
        }
        a.a("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
