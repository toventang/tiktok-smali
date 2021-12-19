package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.jpountz.util.ByteBufferUtils;

enum LZ4ByteBufferUtils {
    ;
    
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static class Match {
        int len;
        int ref;
        int start;

        static {
            Covode.recordClassIndex(105982);
        }

        Match() {
        }

        /* access modifiers changed from: package-private */
        public int end() {
            return this.start + this.len;
        }

        /* access modifiers changed from: package-private */
        public void fix(int i2) {
            this.start += i2;
            this.ref += i2;
            this.len -= i2;
        }
    }

    static {
        Covode.recordClassIndex(105981);
    }

    static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    static int hash(ByteBuffer byteBuffer, int i2) {
        return LZ4Utils.hash(ByteBufferUtils.readInt(byteBuffer, i2));
    }

    static int hash64k(ByteBuffer byteBuffer, int i2) {
        return LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i2));
    }

    static boolean readIntEquals(ByteBuffer byteBuffer, int i2, int i3) {
        if (byteBuffer.getInt(i2) == byteBuffer.getInt(i3)) {
            return true;
        }
        return false;
    }

    static int writeLen(int i2, ByteBuffer byteBuffer, int i3) {
        while (i2 >= 255) {
            byteBuffer.put(i3, (byte) -1);
            i2 -= 255;
            i3++;
        }
        int i4 = i3 + 1;
        byteBuffer.put(i3, (byte) i2);
        return i4;
    }

    static void safeIncrementalCopy(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            byteBuffer.put(i3 + i5, byteBuffer.get(i2 + i5));
        }
    }

    static int commonBytes(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        int numberOfTrailingZeros;
        int i5 = 0;
        while (i3 <= i4 - 8) {
            if (ByteBufferUtils.readLong(byteBuffer, i3) == ByteBufferUtils.readLong(byteBuffer, i2)) {
                i5 += 8;
                i2 += 8;
                i3 += 8;
            } else {
                if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                    numberOfTrailingZeros = Long.numberOfLeadingZeros(ByteBufferUtils.readLong(byteBuffer, i2) ^ ByteBufferUtils.readLong(byteBuffer, i3));
                } else {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(ByteBufferUtils.readLong(byteBuffer, i2) ^ ByteBufferUtils.readLong(byteBuffer, i3));
                }
                return i5 + (numberOfTrailingZeros >>> 3);
            }
        }
        while (i3 < i4) {
            int i6 = i2 + 1;
            int i7 = i3 + 1;
            if (ByteBufferUtils.readByte(byteBuffer, i2) != ByteBufferUtils.readByte(byteBuffer, i3)) {
                break;
            }
            i5++;
            i2 = i6;
            i3 = i7;
        }
        return i5;
    }

    static void wildIncrementalCopy(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if (i5 < 4) {
            int i6 = 0;
            int i7 = 0;
            do {
                ByteBufferUtils.writeByte(byteBuffer, i3 + i7, ByteBufferUtils.readByte(byteBuffer, i2 + i7));
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
            ByteBufferUtils.writeInt(byteBuffer, i8, ByteBufferUtils.readInt(byteBuffer, i9));
            i3 = i8 + 4;
            i2 = i9 - i6;
        } else if (i5 < 8) {
            ByteBufferUtils.writeLong(byteBuffer, i3, ByteBufferUtils.readLong(byteBuffer, i2));
            i3 += i5;
        }
        while (i3 < i4) {
            ByteBufferUtils.writeLong(byteBuffer, i3, ByteBufferUtils.readLong(byteBuffer, i2));
            i3 += 8;
            i2 += 8;
        }
    }

    static int commonBytesBackward(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        while (i2 > i4 && i3 > i5) {
            i2--;
            i3--;
            if (byteBuffer.get(i2) != byteBuffer.get(i3)) {
                break;
            }
            i6++;
        }
        return i6;
    }

    static void safeArraycopy(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            byteBuffer2.put(i3 + i5, byteBuffer.get(i2 + i5));
        }
    }

    static void wildArraycopy(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5 += 8) {
            try {
                byteBuffer2.putLong(i3 + i5, byteBuffer.getLong(i2 + i5));
            } catch (IndexOutOfBoundsException unused) {
                throw new LZ4Exception("Malformed input at offset ".concat(String.valueOf(i2)));
            }
        }
    }

    static int lastLiterals(ByteBuffer byteBuffer, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5) {
        int i6;
        if (i4 + i3 + 1 + (((i3 + 255) - 15) / 255) <= i5) {
            if (i3 >= 15) {
                byteBuffer2.put(i4, (byte) -16);
                i6 = writeLen(i3 - 15, byteBuffer2, i4 + 1);
            } else {
                i6 = i4 + 1;
                byteBuffer2.put(i4, (byte) (i3 << 4));
            }
            safeArraycopy(byteBuffer, i2, byteBuffer2, i6, i3);
            return i6 + i3;
        }
        throw new LZ4Exception();
    }

    static int encodeSequence(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer2, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i3 - i2;
        int i11 = i6 + 1;
        if (i11 + i10 + 8 + (i10 >>> 8) <= i7) {
            if (i10 >= 15) {
                i8 = -16;
                i11 = writeLen(i10 - 15, byteBuffer2, i11);
            } else {
                i8 = i10 << 4;
            }
            wildArraycopy(byteBuffer, i2, byteBuffer2, i11, i10);
            int i12 = i11 + i10;
            int i13 = i3 - i4;
            int i14 = i12 + 1;
            byteBuffer2.put(i12, (byte) i13);
            int i15 = i14 + 1;
            byteBuffer2.put(i14, (byte) (i13 >>> 8));
            int i16 = i5 - 4;
            if (i15 + 6 + (i16 >>> 8) <= i7) {
                if (i16 >= 15) {
                    i9 = i8 | 15;
                    i15 = writeLen(i16 - 15, byteBuffer2, i15);
                } else {
                    i9 = i8 | i16;
                }
                byteBuffer2.put(i6, (byte) i9);
                return i15;
            }
            throw new LZ4Exception("maxDestLen is too small");
        }
        throw new LZ4Exception("maxDestLen is too small");
    }
}
