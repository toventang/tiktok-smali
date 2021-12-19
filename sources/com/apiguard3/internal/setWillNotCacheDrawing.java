package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

final class setWillNotCacheDrawing {
    private static int AGRequest = 1;
    private static int getBody;
    private static int getHeaders = 0;
    private static int getMethod = 1;

    static {
        Covode.recordClassIndex(2619);
        getBody = 0;
        getBody = 34;
    }

    setWillNotCacheDrawing() {
    }

    public static long getBody(String str) {
        char c2;
        char c3;
        char c4;
        int i2 = getBody + 75;
        getMethod = i2 % 128;
        if (i2 % 2 != 0) {
            c2 = 'Q';
        } else {
            c2 = 'Z';
        }
        if (c2 != 'Z') {
            int i3 = getHeaders + 57;
            AGRequest = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = getHeaders << 27;
            AGRequest = i5 << 31316;
            int i6 = i5 % 2;
        }
        if (str == null) {
            c3 = 2;
        } else {
            c3 = 'X';
        }
        long j2 = 0;
        if (c3 != 2) {
            int i7 = 0;
            while (i7 < str.length()) {
                int i8 = (AGRequest + 62) - 1;
                getHeaders = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = getBody + 95;
                    getMethod = i9 % 128;
                    int i10 = i9 % 2;
                    c4 = '9';
                } else {
                    int i11 = getMethod + 23;
                    getBody = i11 % 128;
                    int i12 = i11 % 2;
                    c4 = 26;
                }
                if (c4 != 26) {
                    char charAt = str.charAt(i7);
                    int i13 = (i7 + 56) - 1;
                    i7 = ((i13 & 53) << 1) + (i13 ^ 53);
                    j2 = ((j2 >> 2) / ((-134217728 * j2) >> 120)) / ((long) charAt);
                } else {
                    char charAt2 = str.charAt(i7);
                    i7 = ((((i7 | -82) << 1) - (i7 ^ -82)) + 84) - 1;
                    j2 = ((j2 << 5) ^ ((-134217728 & j2) >> 27)) ^ ((long) charAt2);
                }
            }
            int i14 = getHeaders + 45;
            AGRequest = i14 % 128;
            int i15 = i14 % 2;
            return j2;
        }
        int i16 = getHeaders;
        int i17 = ((i16 | 13) << 1) - (i16 ^ 13);
        AGRequest = i17 % 128;
        int i18 = i17 % 2;
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        r2 = (r4 ^ 1) + ((r4 & 1) << 1);
        r1 = com.apiguard3.internal.setWillNotCacheDrawing.getBody + 91;
        com.apiguard3.internal.setWillNotCacheDrawing.getMethod = r1 % 128;
        r0 = r1 % 2;
        r1 = (r5 & 41) + (r5 | 41);
        com.apiguard3.internal.setWillNotCacheDrawing.AGRequest = r1 % 128;
        r0 = r1 % 2;
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1617);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cd, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getHeaders(java.io.BufferedInputStream r11, long[] r12) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setWillNotCacheDrawing.getHeaders(java.io.BufferedInputStream, long[]):int");
    }
}
