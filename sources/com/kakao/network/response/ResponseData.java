package com.kakao.network.response;

import com.bytedance.covode.number.Covode;

public class ResponseData {
    private final byte[] data;
    private final int httpStatusCode;

    static {
        Covode.recordClassIndex(34387);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String getStringData() {
        if (this.data == null) {
            return null;
        }
        return new String(this.data);
    }

    public ResponseData(int i2, byte[] bArr) {
        this.httpStatusCode = i2;
        this.data = bArr;
    }
}
