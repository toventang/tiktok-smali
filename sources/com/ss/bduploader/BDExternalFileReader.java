package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public interface BDExternalFileReader {
    static {
        Covode.recordClassIndex(100635);
    }

    void cancel();

    long getCrc32ByOffset(long j2, int i2);

    long getValue(int i2);

    int readSlice(int i2, byte[] bArr, int i3);

    int readSliceByOffset(long j2, byte[] bArr, int i2, int i3);
}
