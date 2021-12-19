package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import java.nio.ByteOrder;
import net.jpountz.util.UnsafeUtils;
import net.jpountz.util.Utils;

enum LZ4UnsafeUtils {
    ;
    
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static {
        Covode.recordClassIndex(106016);
    }

    static int readShortLittleEndian(byte[] bArr, int i2) {
        short readShort = UnsafeUtils.readShort(bArr, i2);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            readShort = Short.reverseBytes(readShort);
        }
        return readShort & 65535;
    }

    static boolean readIntEquals(byte[] bArr, int i2, int i3) {
        if (UnsafeUtils.readInt(bArr, i2) == UnsafeUtils.readInt(bArr, i3)) {
            return true;
        }
        return false;
    }

    static void writeShortLittleEndian(byte[] bArr, int i2, int i3) {
        short s = (short) i3;
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            s = Short.reverseBytes(s);
        }
        UnsafeUtils.writeShort(bArr, i2, s);
    }

    static int writeLen(int i2, byte[] bArr, int i3) {
        while (i2 >= 255) {
            UnsafeUtils.writeByte(bArr, i3, 255);
            i2 -= 255;
            i3++;
        }
        int i4 = i3 + 1;
        UnsafeUtils.writeByte(bArr, i3, i2);
        return i4;
    }

    static void safeIncrementalCopy(byte[] bArr, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i3 + i5;
            int i7 = i2 + i5;
            bArr[i6] = bArr[i7];
            UnsafeUtils.writeByte(bArr, i6, UnsafeUtils.readByte(bArr, i7));
        }
    }

    static int commonBytes(byte[] bArr, int i2, int i3, int i4) {
        int numberOfTrailingZeros;
        int i5 = 0;
        while (i3 <= i4 - 8) {
            if (UnsafeUtils.readLong(bArr, i3) == UnsafeUtils.readLong(bArr, i2)) {
                i5 += 8;
                i2 += 8;
                i3 += 8;
            } else {
                if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
                    numberOfTrailingZeros = Long.numberOfLeadingZeros(UnsafeUtils.readLong(bArr, i2) ^ UnsafeUtils.readLong(bArr, i3));
                } else {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(UnsafeUtils.readLong(bArr, i2) ^ UnsafeUtils.readLong(bArr, i3));
                }
                return i5 + (numberOfTrailingZeros >>> 3);
            }
        }
        while (i3 < i4) {
            int i6 = i2 + 1;
            int i7 = i3 + 1;
            if (UnsafeUtils.readByte(bArr, i2) != UnsafeUtils.readByte(bArr, i3)) {
                break;
            }
            i5++;
            i2 = i6;
            i3 = i7;
        }
        return i5;
    }

    static void wildIncrementalCopy(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if (i5 < 4) {
            int i6 = 0;
            int i7 = 0;
            do {
                UnsafeUtils.writeByte(bArr, i3 + i7, UnsafeUtils.readByte(bArr, i2 + i7));
                i7++;
            } while (i7 < 4);
            int i8 = i3 + 4;
            int i9 = i2 + 4;
            int i10 = i8 - i9;
            if (i10 == 1) {
                i9 -= 3;
            } else if (i10 == 2) {
                i9 -= 2;
            } else if (i10 == 3) {
                i9 -= 3;
                i6 = -1;
            } else if (i10 == 5) {
                i6 = 1;
            } else if (i10 == 6) {
                i6 = 2;
            } else if (i10 == 7) {
                i6 = 3;
            }
            UnsafeUtils.writeInt(bArr, i8, UnsafeUtils.readInt(bArr, i9));
            i3 = i8 + 4;
            i2 = i9 - i6;
        } else if (i5 < 8) {
            UnsafeUtils.writeLong(bArr, i3, UnsafeUtils.readLong(bArr, i2));
            i3 += i5;
        }
        while (i3 < i4) {
            UnsafeUtils.writeLong(bArr, i3, UnsafeUtils.readLong(bArr, i2));
            i3 += 8;
            i2 += 8;
        }
    }

    static int commonBytesBackward(byte[] bArr, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        while (i2 > i4 && i3 > i5) {
            i2--;
            i3--;
            if (UnsafeUtils.readByte(bArr, i2) != UnsafeUtils.readByte(bArr, i3)) {
                break;
            }
            i6++;
        }
        return i6;
    }

    static void safeArraycopy(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = i4 & -8;
        wildArraycopy(bArr, i2, bArr2, i3, i5);
        int i6 = i4 & 7;
        for (int i7 = 0; i7 < i6; i7++) {
            UnsafeUtils.writeByte(bArr2, i3 + i5 + i7, UnsafeUtils.readByte(bArr, i2 + i5 + i7));
        }
    }

    static void wildArraycopy(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5 += 8) {
            UnsafeUtils.writeLong(bArr2, i3 + i5, UnsafeUtils.readLong(bArr, i2 + i5));
        }
    }

    static int lastLiterals(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        return LZ4SafeUtils.lastLiterals(bArr, i2, i3, bArr2, i4, i5);
    }

    static int encodeSequence(byte[] bArr, int i2, int i3, int i4, int i5, byte[] bArr2, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i3 - i2;
        int i11 = i6 + 1;
        if (i10 >= 15) {
            i8 = -16;
            i11 = writeLen(i10 - 15, bArr2, i11);
        } else {
            i8 = i10 << 4;
        }
        wildArraycopy(bArr, i2, bArr2, i11, i10);
        int i12 = i11 + i10;
        int i13 = i3 - i4;
        int i14 = i12 + 1;
        bArr2[i12] = (byte) i13;
        int i15 = i14 + 1;
        bArr2[i14] = (byte) (i13 >>> 8);
        int i16 = i5 - 4;
        if (i15 + 6 + (i16 >>> 8) <= i7) {
            if (i16 >= 15) {
                i9 = i8 | 15;
                i15 = writeLen(i16 - 15, bArr2, i15);
            } else {
                i9 = i8 | i16;
            }
            bArr2[i6] = (byte) i9;
            return i15;
        }
        throw new LZ4Exception("maxDestLen is too small");
    }
}
