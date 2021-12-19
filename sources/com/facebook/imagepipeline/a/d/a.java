package com.facebook.imagepipeline.a.d;

import com.bytedance.covode.number.Covode;

public class a {
    static {
        Covode.recordClassIndex(28908);
    }

    public static int b(int[] iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        return i2;
    }

    public static void a(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 11) {
                iArr[i2] = 100;
            }
        }
    }

    public static int[] c(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr2[i3] = i2;
            i2 += iArr[i3];
        }
        return iArr2;
    }
}
