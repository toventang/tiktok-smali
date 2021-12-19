package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4HCJNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4HCJNICompressor INSTANCE = new LZ4HCJNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;
    private final int compressionLevel;

    LZ4HCJNICompressor() {
        this(9);
    }

    static {
        Covode.recordClassIndex(105997);
    }

    LZ4HCJNICompressor(int i2) {
        this.compressionLevel = i2;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public final int compress(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        MethodCollector.i(5502);
        SafeUtils.checkRange(bArr, i2, i3);
        SafeUtils.checkRange(bArr2, i4, i5);
        int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, null, i2, i3, bArr2, null, i4, i5, this.compressionLevel);
        if (LZ4_compressHC > 0) {
            MethodCollector.o(5502);
            return LZ4_compressHC;
        }
        LZ4Exception lZ4Exception = new LZ4Exception();
        MethodCollector.o(5502);
        throw lZ4Exception;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public final int compress(ByteBuffer byteBuffer, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5) {
        byte[] bArr;
        byte[] bArr2;
        int i6 = i2;
        ByteBuffer byteBuffer3 = byteBuffer;
        int i7 = i4;
        ByteBuffer byteBuffer4 = byteBuffer2;
        MethodCollector.i(5514);
        ByteBufferUtils.checkNotReadOnly(byteBuffer4);
        ByteBufferUtils.checkRange(byteBuffer3, i6, i3);
        ByteBufferUtils.checkRange(byteBuffer4, i7, i5);
        if ((byteBuffer3.hasArray() || byteBuffer3.isDirect()) && (byteBuffer4.hasArray() || byteBuffer4.isDirect())) {
            if (byteBuffer3.hasArray()) {
                bArr = byteBuffer3.array();
                i6 += byteBuffer3.arrayOffset();
                byteBuffer3 = null;
            } else {
                bArr = null;
            }
            if (byteBuffer4.hasArray()) {
                bArr2 = byteBuffer4.array();
                i7 += byteBuffer4.arrayOffset();
                byteBuffer4 = null;
            } else {
                bArr2 = null;
            }
            int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, byteBuffer3, i6, i3, bArr2, byteBuffer4, i7, i5, this.compressionLevel);
            if (LZ4_compressHC > 0) {
                MethodCollector.o(5514);
                return LZ4_compressHC;
            }
            LZ4Exception lZ4Exception = new LZ4Exception();
            MethodCollector.o(5514);
            throw lZ4Exception;
        }
        LZ4Compressor lZ4Compressor = SAFE_INSTANCE;
        if (lZ4Compressor == null) {
            lZ4Compressor = LZ4Factory.safeInstance().highCompressor(this.compressionLevel);
            SAFE_INSTANCE = lZ4Compressor;
        }
        int compress = lZ4Compressor.compress(byteBuffer3, i6, i3, byteBuffer4, i7, i5);
        MethodCollector.o(5514);
        return compress;
    }
}
