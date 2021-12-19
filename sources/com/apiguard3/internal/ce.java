package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import java.util.Random;

public final class ce implements de {
    private static int AGRequest = 0;
    private static int getHeaders;
    private static Random getMethod = new Random();
    private rm getBody = new am();
    private final byte[] getUrl;

    static {
        Covode.recordClassIndex(2536);
        getHeaders = 1;
        int i2 = AGRequest + 67;
        getHeaders = i2 % 128;
        int i3 = i2 % 2;
    }

    public ce() {
        byte[] bArr = new byte[32];
        this.getUrl = bArr;
        getMethod.nextBytes(bArr);
    }

    @Override // com.apiguard3.internal.de
    public final byte[] AGRequest(byte[] bArr) {
        int i2 = getHeaders + 65;
        AGRequest = i2 % 128;
        int i3 = i2 % 2;
        byte[] headers = this.getBody.getHeaders(bArr, this.getUrl);
        int i4 = getHeaders + 49;
        AGRequest = i4 % 128;
        int i5 = i4 % 2;
        return headers;
    }

    @Override // com.apiguard3.internal.de
    public final byte[] getHeaders(byte[] bArr) {
        char c2;
        char c3;
        int i2 = getHeaders + 65;
        AGRequest = i2 % 128;
        if (i2 % 2 == 0) {
            c2 = 4;
        } else {
            c2 = '.';
        }
        if (c2 != '.') {
            byte[] AGRequest2 = this.getBody.AGRequest(bArr, this.getUrl);
            int i3 = getHeaders + 11;
            AGRequest = i3 % 128;
            if (i3 % 2 == 0) {
                c3 = '5';
            } else {
                c3 = 24;
            }
            if (c3 == '5') {
                return AGRequest2;
            }
            throw new NullPointerException("hashCode");
        }
        this.getBody.AGRequest(bArr, this.getUrl);
        throw new NullPointerException("hashCode");
    }
}
