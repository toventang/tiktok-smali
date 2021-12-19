package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;

public interface LZ4UnknownSizeDecompressor {
    static {
        Covode.recordClassIndex(106015);
    }

    int decompress(byte[] bArr, int i2, int i3, byte[] bArr2, int i4);

    int decompress(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5);
}
