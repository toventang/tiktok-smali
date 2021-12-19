package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class LZ4Compressor {
    static {
        Covode.recordClassIndex(105983);
    }

    public abstract int compress(ByteBuffer byteBuffer, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5);

    public abstract int compress(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5);

    public String toString() {
        return getClass().getSimpleName();
    }

    public final int maxCompressedLength(int i2) {
        return LZ4Utils.maxCompressedLength(i2);
    }

    public final byte[] compress(byte[] bArr) {
        return compress(bArr, 0, bArr.length);
    }

    public final int compress(byte[] bArr, byte[] bArr2) {
        return compress(bArr, 0, bArr.length, bArr2, 0);
    }

    public final void compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int compress = compress(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.position(byteBuffer2.position() + compress);
    }

    public final byte[] compress(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[maxCompressedLength(i3)];
        return Arrays.copyOf(bArr2, compress(bArr, i2, i3, bArr2, 0));
    }

    public final int compress(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        return compress(bArr, i2, i3, bArr2, i4, bArr2.length - i4);
    }
}
