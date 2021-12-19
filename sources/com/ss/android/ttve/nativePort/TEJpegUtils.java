package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.camera.ImageFrame;

public class TEJpegUtils {
    public static native void compressToJPEG(Bitmap bitmap, int i2, String str);

    public static native void compressToJPEG2(byte[] bArr, int i2, int i3, int i4, String str);

    public static native ImageFrame decompressJPEG(String str, int i2);

    static {
        Covode.recordClassIndex(37725);
        d.a();
    }

    public static int calBestSampleSize(int i2, int i3, int i4, int i5) {
        if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            return -1;
        }
        if (i4 > i5) {
            i5 = i4;
            i4 = i5;
        }
        if (i2 > i3) {
            i5 = i4;
            i4 = i5;
        }
        return Math.max((int) Math.ceil((double) (((float) i2) / ((float) i4))), (int) Math.ceil((double) (((float) i3) / ((float) i5))));
    }

    public static int calBestSampleSize2(int i2, int i3, int i4, int i5) {
        if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            return -1;
        }
        if (i4 > i5) {
            i5 = i4;
            i4 = i5;
        }
        if (i2 > i3) {
            i5 = i4;
            i4 = i5;
        }
        int max = Math.max((int) Math.floor((double) (((float) i2) / ((float) i4))), (int) Math.floor((double) (((float) i3) / ((float) i5))));
        if (max < 2) {
            return -1;
        }
        return (int) Math.pow(2.0d, (double) ((int) Math.floor(Math.log((double) max) / Math.log(2.0d))));
    }
}
