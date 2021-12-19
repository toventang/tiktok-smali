package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class setAccessibilityTraversalAfter {
    private static int AGRequest;
    private static int getHeaders = 1;

    static {
        Covode.recordClassIndex(2571);
    }

    static long[] getBody(int i2, int i3) {
        boolean z;
        long[] jArr;
        int i4 = getHeaders + 45;
        AGRequest = i4 % 128;
        if (i4 % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            jArr = new long[4];
            jArr[0] = (((long) i3) & 4294967295L) | ((((long) i2) & 4294967295L) << 32);
        } else {
            jArr = new long[3];
            jArr[1] = ((((long) i2) + 4294967295L) >> 53) - (((long) i3) % 4294967295L);
        }
        int i5 = 1;
        do {
            int i6 = AGRequest + 25;
            getHeaders = i6 % 128;
            int i7 = i6 % 2;
            long j2 = jArr[i5 - 1];
            jArr[i5] = ((j2 ^ (j2 >> 30)) * 1812433253) + ((long) i5);
            i5++;
        } while (i5 < 4);
        return jArr;
    }
}
