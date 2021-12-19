package com.bytedance.zoin.zstd;

import com.bytedance.covode.number.Covode;
import com.bytedance.zoin.zstd.a.a;

public class Zstd {
    public static native long getErrorCode(long j2);

    public static native String getErrorName(long j2);

    public static native boolean isError(long j2);

    public static native int loadDictDecompress(long j2, byte[] bArr, int i2);

    public static native int loadFastDictDecompress(long j2, ZstdDictDecompress zstdDictDecompress);

    static {
        Covode.recordClassIndex(28280);
        a.a();
    }
}
