package com.ss.avframework.utils;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

public class MiscUtils {
    private static AtomicInteger mUUIDSuffix = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(100593);
    }

    public static String getUUID(String str) {
        String str2 = System.currentTimeMillis() + "-" + mUUIDSuffix.incrementAndGet();
        if (str != null) {
            return str + "-" + str2;
        }
        return str2;
    }

    public static boolean chooseBestResolution(int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        boolean z;
        char c2;
        int i7;
        int i8;
        boolean z2;
        char c3;
        int i9 = iArr[0];
        int i10 = iArr[1];
        if (iArr.length < 2) {
            return false;
        }
        if (i10 <= 1 || i9 <= 1) {
            if (i2 > 0 && i3 > 0) {
                if (i4 <= 0) {
                    z2 = true;
                    c3 = 0;
                } else if (i5 <= 0) {
                    c3 = 0;
                    z2 = true;
                }
                iArr[c3] = i2;
                char c4 = z2 ? 1 : 0;
                char c5 = z2 ? 1 : 0;
                char c6 = z2 ? 1 : 0;
                iArr[c4] = i3;
                AVLog.iod("MiscUtils", "Using source resolution as adapted resolution(" + i2 + "x" + i3 + ")");
                return z2;
            } else if (i4 <= 0 || i5 <= 0) {
                return false;
            }
            if (i2 <= 0 || i3 <= 0) {
                iArr[0] = i4;
                iArr[1] = i5;
                AVLog.iod("MiscUtils", "Using reference resolution as adapted resolution(" + i4 + "x" + i5 + ")");
                return true;
            }
            int max = Math.max(i2, i3);
            int min = Math.min(i2, i3);
            while (true) {
                max = min;
                if (max == 0) {
                    break;
                }
                min = max % max;
            }
            int i11 = i2 / max;
            int i12 = i3 / max;
            int i13 = i5 * i4;
            float f2 = ((((float) i4) * 1.0f) / ((float) i5)) / ((((float) i2) * 1.0f) / ((float) i3));
            if (f2 >= 1.0f) {
                i6 = i4 / i11;
            } else {
                i6 = i5 / i12;
            }
            while (true) {
                if (i6 <= max) {
                    i7 = i11 * i6;
                    i8 = i12 * i6;
                    if (i7 * i8 < i13 || ((f2 < 1.0f || i7 < i4) && (f2 > 1.0f || i8 < i5))) {
                        i6++;
                    }
                } else {
                    z = false;
                    if (i6 >= max) {
                        i7 = i2;
                        i8 = i3;
                        z = true;
                    } else {
                        c2 = 2;
                    }
                }
            }
            z = true;
            c2 = 2;
            i9 = ((i7 + 1) / 2) * 2;
            i10 = ((i8 + 1) / 2) * 2;
            Object[] objArr = new Object[8];
            objArr[0] = Integer.valueOf(i9);
            objArr[1] = Integer.valueOf(i10);
            objArr[c2] = Integer.valueOf(i11);
            objArr[3] = Integer.valueOf(i12);
            objArr[4] = Integer.valueOf(i2);
            objArr[5] = Integer.valueOf(i3);
            objArr[6] = Integer.valueOf(i4);
            objArr[7] = Integer.valueOf(i5);
            String a2 = a.a("adapted resolution(%dx%d) aspect(%dx%d) cap(%dx%d) ref(%dx%d)", objArr);
            if (!z) {
                return z;
            }
            iArr[0] = i9;
            iArr[1] = i10;
            AVLog.iod("MiscUtils", "Find best ".concat(String.valueOf(a2)));
            return true;
        }
        AVLog.iod("MiscUtils", "Using default adapted resolution(" + i9 + "x" + i10 + ")");
        return true;
    }

    public static boolean cropAndScaleResolution(int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2, int[] iArr3) {
        if (i2 <= 0 || i3 <= 0 || i5 <= 0 || i4 <= 0) {
            return false;
        }
        float f2 = (float) i2;
        float f3 = (float) i3;
        float f4 = (f2 * 1.0f) / f3;
        float f5 = (((float) i4) * 1.0f) / ((float) i5);
        iArr3[0] = i4;
        iArr3[1] = i5;
        if (f4 == f5) {
            iArr[1] = 0;
            iArr[0] = 0;
            iArr2[0] = i2;
            iArr2[1] = i3;
            return true;
        }
        if (f4 > f5) {
            iArr2[0] = (int) (f5 * f3);
            iArr2[1] = i3;
            iArr[0] = (i2 - iArr2[0]) / 2;
            iArr[1] = 0;
        } else {
            iArr2[0] = i2;
            iArr2[1] = (int) (f2 / f5);
            iArr[0] = 0;
            iArr[1] = (i3 - iArr2[1]) / 2;
        }
        return true;
    }
}
