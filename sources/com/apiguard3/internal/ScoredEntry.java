package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class ScoredEntry {
    private static int getMethod;
    private static int getUrl = 1;

    static {
        Covode.recordClassIndex(2533);
    }

    public static FraudScore AGRequest(byte... bArr) {
        de ceVar;
        int i2 = getMethod + 121;
        getUrl = i2 % 128;
        if (i2 % 2 != 0 ? bArr != null : bArr != null) {
            if (bArr.length != 0) {
                ceVar = new ce();
                return new FraudScore(bArr, ceVar);
            }
        }
        ceVar = send.getHeaders();
        int i3 = getUrl + 25;
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        return new FraudScore(bArr, ceVar);
    }
}
