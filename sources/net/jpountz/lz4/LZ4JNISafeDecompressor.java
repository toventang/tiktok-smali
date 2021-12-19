package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    private static LZ4SafeDecompressor SAFE_INSTANCE;

    LZ4JNISafeDecompressor() {
    }

    static {
        Covode.recordClassIndex(106005);
    }

    @Override // net.jpountz.lz4.LZ4UnknownSizeDecompressor, net.jpountz.lz4.LZ4SafeDecompressor
    public final int decompress(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        MethodCollector.i(3938);
        SafeUtils.checkRange(bArr, i2, i3);
        SafeUtils.checkRange(bArr2, i4, i5);
        int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, null, i2, i3, bArr2, null, i4, i5);
        if (LZ4_decompress_safe >= 0) {
            MethodCollector.o(3938);
            return LZ4_decompress_safe;
        }
        LZ4Exception lZ4Exception = new LZ4Exception("Error decoding offset " + (i2 - LZ4_decompress_safe) + " of input buffer");
        MethodCollector.o(3938);
        throw lZ4Exception;
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public final int decompress(ByteBuffer byteBuffer, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5) {
        int i6;
        byte[] bArr;
        byte[] bArr2;
        ByteBuffer byteBuffer3 = byteBuffer;
        int i7 = i4;
        ByteBuffer byteBuffer4 = byteBuffer2;
        MethodCollector.i(3944);
        ByteBufferUtils.checkNotReadOnly(byteBuffer4);
        ByteBufferUtils.checkRange(byteBuffer3, i2, i3);
        ByteBufferUtils.checkRange(byteBuffer4, i7, i5);
        if ((byteBuffer3.hasArray() || byteBuffer3.isDirect()) && (byteBuffer4.hasArray() || byteBuffer4.isDirect())) {
            if (byteBuffer3.hasArray()) {
                bArr = byteBuffer3.array();
                i6 = byteBuffer3.arrayOffset() + i2;
                byteBuffer3 = null;
            } else {
                i6 = i2;
                bArr = null;
            }
            if (byteBuffer4.hasArray()) {
                bArr2 = byteBuffer4.array();
                i7 += byteBuffer4.arrayOffset();
                byteBuffer4 = null;
            } else {
                bArr2 = null;
            }
            int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, byteBuffer3, i6, i3, bArr2, byteBuffer4, i7, i5);
            if (LZ4_decompress_safe >= 0) {
                MethodCollector.o(3944);
                return LZ4_decompress_safe;
            }
            LZ4Exception lZ4Exception = new LZ4Exception("Error decoding offset " + (i6 - LZ4_decompress_safe) + " of input buffer");
            MethodCollector.o(3944);
            throw lZ4Exception;
        }
        LZ4SafeDecompressor lZ4SafeDecompressor = SAFE_INSTANCE;
        if (lZ4SafeDecompressor == null) {
            lZ4SafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
            SAFE_INSTANCE = lZ4SafeDecompressor;
        }
        int decompress = lZ4SafeDecompressor.decompress(byteBuffer3, i2, i3, byteBuffer4, i7, i5);
        MethodCollector.o(3944);
        return decompress;
    }
}
