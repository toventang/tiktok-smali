package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;

public interface LZ4Decompressor {
    static {
        Covode.recordClassIndex(105985);
    }

    int decompress(byte[] bArr, int i2, byte[] bArr2, int i3, int i4);
}
