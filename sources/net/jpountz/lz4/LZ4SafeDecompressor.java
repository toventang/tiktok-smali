package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class LZ4SafeDecompressor implements LZ4UnknownSizeDecompressor {
    static {
        Covode.recordClassIndex(106012);
    }

    public abstract int decompress(ByteBuffer byteBuffer, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5);

    @Override // net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public abstract int decompress(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5);

    public String toString() {
        return getClass().getSimpleName();
    }

    public final int decompress(byte[] bArr, byte[] bArr2) {
        return decompress(bArr, 0, bArr.length, bArr2, 0);
    }

    public final void decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int decompress = decompress(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.position(byteBuffer2.position() + decompress);
    }

    public final byte[] decompress(byte[] bArr, int i2) {
        return decompress(bArr, 0, bArr.length, i2);
    }

    public final byte[] decompress(byte[] bArr, int i2, int i3, int i4) {
        byte[] bArr2 = new byte[i4];
        int decompress = decompress(bArr, i2, i3, bArr2, 0, i4);
        if (decompress != i4) {
            return Arrays.copyOf(bArr2, decompress);
        }
        return bArr2;
    }

    @Override // net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public final int decompress(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        return decompress(bArr, i2, i3, bArr2, i4, bArr2.length - i4);
    }
}
