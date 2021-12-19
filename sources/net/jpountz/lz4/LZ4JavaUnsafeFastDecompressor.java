package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

final class LZ4JavaUnsafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaUnsafeFastDecompressor();

    LZ4JavaUnsafeFastDecompressor() {
    }

    static {
        Covode.recordClassIndex(106010);
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public final int decompress(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        byte readByte;
        int i6;
        byte readByte2;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), i2 + byteBuffer.arrayOffset(), byteBuffer2.array(), i3 + byteBuffer2.arrayOffset(), i4);
        }
        ByteBuffer inNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer inNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(inNativeByteOrder, i2);
        ByteBufferUtils.checkRange(inNativeByteOrder2, i3, i4);
        if (i4 != 0) {
            int i7 = i4 + i3;
            int i8 = i2;
            int i9 = i3;
            while (true) {
                int readByte3 = ByteBufferUtils.readByte(inNativeByteOrder, i8) & 255;
                int i10 = i8 + 1;
                int i11 = readByte3 >>> 4;
                if (i11 == 15) {
                    while (true) {
                        i6 = i10 + 1;
                        readByte2 = ByteBufferUtils.readByte(inNativeByteOrder, i10);
                        if (readByte2 != -1) {
                            break;
                        }
                        i11 += 255;
                        i10 = i6;
                    }
                    i11 += readByte2 & 255;
                    i10 = i6;
                }
                int i12 = i9 + i11;
                int i13 = i7 - 8;
                if (i12 <= i13) {
                    LZ4ByteBufferUtils.wildArraycopy(inNativeByteOrder, i10, inNativeByteOrder2, i9, i11);
                    int i14 = i10 + i11;
                    int readShortLE = ByteBufferUtils.readShortLE(inNativeByteOrder, i14);
                    i8 = i14 + 2;
                    int i15 = i12 - readShortLE;
                    if (i15 >= i3) {
                        int i16 = readByte3 & 15;
                        if (i16 == 15) {
                            while (true) {
                                i5 = i8 + 1;
                                readByte = ByteBufferUtils.readByte(inNativeByteOrder, i8);
                                if (readByte != -1) {
                                    break;
                                }
                                i16 += 255;
                                i8 = i5;
                            }
                            i16 += readByte & 255;
                            i8 = i5;
                        }
                        int i17 = i16 + 4;
                        i9 = i12 + i17;
                        if (i9 <= i13) {
                            LZ4ByteBufferUtils.wildIncrementalCopy(inNativeByteOrder2, i15, i12, i9);
                        } else if (i9 <= i7) {
                            LZ4ByteBufferUtils.safeIncrementalCopy(inNativeByteOrder2, i15, i12, i17);
                        } else {
                            throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i8)));
                        }
                    } else {
                        throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i8)));
                    }
                } else if (i12 == i7) {
                    LZ4ByteBufferUtils.safeArraycopy(inNativeByteOrder, i10, inNativeByteOrder2, i9, i11);
                    return (i10 + i11) - i2;
                } else {
                    throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i10)));
                }
            }
        } else if (ByteBufferUtils.readByte(inNativeByteOrder, i2) == 0) {
            return 1;
        } else {
            throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i2)));
        }
    }

    @Override // net.jpountz.lz4.LZ4Decompressor, net.jpountz.lz4.LZ4FastDecompressor
    public final int decompress(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        byte readByte;
        int i6;
        byte readByte2;
        UnsafeUtils.checkRange(bArr, i2);
        UnsafeUtils.checkRange(bArr2, i3, i4);
        if (i4 != 0) {
            int i7 = i4 + i3;
            int i8 = i2;
            int i9 = i3;
            while (true) {
                int readByte3 = UnsafeUtils.readByte(bArr, i8) & 255;
                int i10 = i8 + 1;
                int i11 = readByte3 >>> 4;
                if (i11 == 15) {
                    while (true) {
                        i6 = i10 + 1;
                        readByte2 = UnsafeUtils.readByte(bArr, i10);
                        if (readByte2 != -1) {
                            break;
                        }
                        i11 += 255;
                        i10 = i6;
                    }
                    i11 += readByte2 & 255;
                    i10 = i6;
                }
                int i12 = i9 + i11;
                int i13 = i7 - 8;
                if (i12 <= i13) {
                    LZ4UnsafeUtils.wildArraycopy(bArr, i10, bArr2, i9, i11);
                    int i14 = i10 + i11;
                    int readShortLE = UnsafeUtils.readShortLE(bArr, i14);
                    i8 = i14 + 2;
                    int i15 = i12 - readShortLE;
                    if (i15 >= i3) {
                        int i16 = readByte3 & 15;
                        if (i16 == 15) {
                            while (true) {
                                i5 = i8 + 1;
                                readByte = UnsafeUtils.readByte(bArr, i8);
                                if (readByte != -1) {
                                    break;
                                }
                                i16 += 255;
                                i8 = i5;
                            }
                            i16 += readByte & 255;
                            i8 = i5;
                        }
                        int i17 = i16 + 4;
                        i9 = i12 + i17;
                        if (i9 <= i13) {
                            LZ4UnsafeUtils.wildIncrementalCopy(bArr2, i15, i12, i9);
                        } else if (i9 <= i7) {
                            LZ4UnsafeUtils.safeIncrementalCopy(bArr2, i15, i12, i17);
                        } else {
                            throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i8)));
                        }
                    } else {
                        throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i8)));
                    }
                } else if (i12 == i7) {
                    LZ4UnsafeUtils.safeArraycopy(bArr, i10, bArr2, i9, i11);
                    return (i10 + i11) - i2;
                } else {
                    throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i10)));
                }
            }
        } else if (UnsafeUtils.readByte(bArr, i2) == 0) {
            return 1;
        } else {
            throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i2)));
        }
    }
}
