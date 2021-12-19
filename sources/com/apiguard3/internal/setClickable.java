package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public class setClickable {
    private static int getBody = 0;
    private static int getHeaders = 1;
    private static int getMethod = 0;
    private static int getUrl;
    private final int AGRequest;

    static {
        Covode.recordClassIndex(2581);
        getUrl = 1;
        getUrl = 75;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        if ((r1 >>> 3) == 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if ((r1 % 2) != 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getMethod() {
        /*
            r4 = this;
            int r3 = com.apiguard3.internal.setClickable.getUrl
            int r1 = r3 + 25
            int r0 = r1 % 128
            com.apiguard3.internal.setClickable.getMethod = r0
            int r1 = r1 % 2
            r0 = 0
            r2 = 1
            if (r1 != 0) goto L_0x004c
            int r0 = com.apiguard3.internal.setClickable.getBody
            r1 = r0 ^ 123(0x7b, float:1.72E-43)
            r0 = r0 & 123(0x7b, float:1.72E-43)
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.apiguard3.internal.setClickable.getHeaders = r0
            int r0 = r1 % 2
        L_0x001c:
            int r2 = r4.AGRequest
            int r1 = r3 + 83
            int r0 = r1 % 128
            com.apiguard3.internal.setClickable.getMethod = r0
            int r0 = r1 % 2
            if (r0 != 0) goto L_0x003d
            int r0 = com.apiguard3.internal.setClickable.getHeaders
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.apiguard3.internal.setClickable.getBody = r0
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x003c
        L_0x0034:
            int r1 = r3 + 33
            int r0 = r1 % 128
            com.apiguard3.internal.setClickable.getMethod = r0
            int r0 = r1 % 2
        L_0x003c:
            return r2
        L_0x003d:
            int r0 = com.apiguard3.internal.setClickable.getHeaders
            int r1 = r0 >>> 50
            r0 = 2142(0x85e, float:3.002E-42)
            int r0 = r1 << r0
            com.apiguard3.internal.setClickable.getBody = r0
            int r0 = r1 >>> 3
            if (r0 != 0) goto L_0x0034
            goto L_0x003c
        L_0x004c:
            int r0 = com.apiguard3.internal.setClickable.getBody
            r1 = r0 | 32
            r0 = r0 & 32
            int r0 = r0 >>> r2
            int r1 = r1 >>> r0
            r0 = 10329(0x2859, float:1.4474E-41)
            int r0 = r1 >> r0
            com.apiguard3.internal.setClickable.getHeaders = r0
            int r0 = r1 << 5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setClickable.getMethod():int");
    }

    public setClickable(int i2) {
        this.AGRequest = i2;
    }
}
