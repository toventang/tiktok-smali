package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4JNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;

    LZ4JNICompressor() {
    }

    static {
        Covode.recordClassIndex(106003);
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public final int compress(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        MethodCollector.i(3940);
        SafeUtils.checkRange(bArr, i2, i3);
        SafeUtils.checkRange(bArr2, i4, i5);
        int LZ4_compress_limitedOutput = LZ4JNI.LZ4_compress_limitedOutput(bArr, null, i2, i3, bArr2, null, i4, i5);
        if (LZ4_compress_limitedOutput > 0) {
            MethodCollector.o(3940);
            return LZ4_compress_limitedOutput;
        }
        LZ4Exception lZ4Exception = new LZ4Exception("maxDestLen is too small");
        MethodCollector.o(3940);
        throw lZ4Exception;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public final int compress(ByteBuffer byteBuffer, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5) {
        int i6;
        byte[] bArr;
        byte[] bArr2;
        ByteBuffer byteBuffer3 = byteBuffer;
        int i7 = i4;
        ByteBuffer byteBuffer4 = byteBuffer2;
        MethodCollector.i(3954);
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
            int LZ4_compress_limitedOutput = LZ4JNI.LZ4_compress_limitedOutput(bArr, byteBuffer3, i6, i3, bArr2, byteBuffer4, i7, i5);
            if (LZ4_compress_limitedOutput > 0) {
                MethodCollector.o(3954);
                return LZ4_compress_limitedOutput;
            }
            LZ4Exception lZ4Exception = new LZ4Exception("maxDestLen is too small");
            MethodCollector.o(3954);
            throw lZ4Exception;
        }
        LZ4Compressor lZ4Compressor = SAFE_INSTANCE;
        if (lZ4Compressor == null) {
            lZ4Compressor = LZ4Factory.safeInstance().fastCompressor();
            SAFE_INSTANCE = lZ4Compressor;
        }
        int compress = lZ4Compressor.compress(byteBuffer3, i2, i3, byteBuffer4, i7, i5);
        MethodCollector.o(3954);
        return compress;
    }
}
