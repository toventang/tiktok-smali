package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    private static LZ4FastDecompressor SAFE_INSTANCE;

    LZ4JNIFastDecompressor() {
    }

    static {
        Covode.recordClassIndex(106004);
    }

    @Override // net.jpountz.lz4.LZ4Decompressor, net.jpountz.lz4.LZ4FastDecompressor
    public final int decompress(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        MethodCollector.i(3933);
        SafeUtils.checkRange(bArr, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, null, i2, bArr2, null, i3, i4);
        if (LZ4_decompress_fast >= 0) {
            MethodCollector.o(3933);
            return LZ4_decompress_fast;
        }
        LZ4Exception lZ4Exception = new LZ4Exception("Error decoding offset " + (i2 - LZ4_decompress_fast) + " of input buffer");
        MethodCollector.o(3933);
        throw lZ4Exception;
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public final int decompress(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        byte[] bArr;
        byte[] bArr2;
        int i5 = i2;
        ByteBuffer byteBuffer3 = byteBuffer;
        int i6 = i3;
        ByteBuffer byteBuffer4 = byteBuffer2;
        MethodCollector.i(3934);
        ByteBufferUtils.checkNotReadOnly(byteBuffer4);
        ByteBufferUtils.checkRange(byteBuffer3, i5);
        ByteBufferUtils.checkRange(byteBuffer4, i6, i4);
        if ((byteBuffer3.hasArray() || byteBuffer3.isDirect()) && (byteBuffer4.hasArray() || byteBuffer4.isDirect())) {
            if (byteBuffer3.hasArray()) {
                bArr = byteBuffer3.array();
                i5 += byteBuffer3.arrayOffset();
                byteBuffer3 = null;
            } else {
                bArr = null;
            }
            if (byteBuffer4.hasArray()) {
                bArr2 = byteBuffer4.array();
                i6 += byteBuffer4.arrayOffset();
                byteBuffer4 = null;
            } else {
                bArr2 = null;
            }
            int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, byteBuffer3, i5, bArr2, byteBuffer4, i6, i4);
            if (LZ4_decompress_fast >= 0) {
                MethodCollector.o(3934);
                return LZ4_decompress_fast;
            }
            LZ4Exception lZ4Exception = new LZ4Exception("Error decoding offset " + (i5 - LZ4_decompress_fast) + " of input buffer");
            MethodCollector.o(3934);
            throw lZ4Exception;
        }
        LZ4FastDecompressor lZ4FastDecompressor = SAFE_INSTANCE;
        if (lZ4FastDecompressor == null) {
            lZ4FastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
            SAFE_INSTANCE = lZ4FastDecompressor;
        }
        int decompress = lZ4FastDecompressor.decompress(byteBuffer3, i5, byteBuffer4, i6, i4);
        MethodCollector.o(3934);
        return decompress;
    }
}
