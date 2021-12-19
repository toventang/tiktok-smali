package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public interface TTMediaDataReader {
    static {
        Covode.recordClassIndex(101395);
    }

    int close(int i2);

    long getValue(int i2, int i3);

    int open(int i2);

    int read(int i2, long j2, byte[] bArr, int i3);
}
