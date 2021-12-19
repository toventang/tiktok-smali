package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import net.jpountz.util.SafeUtils;

enum LZ4SafeUtils {
    ;

    static class Match {
        int len;
        int ref;
        int start;

        static {
            Covode.recordClassIndex(106014);
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
        Covode.recordClassIndex(106013);
    }

    static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    static int hash(byte[] bArr, int i2) {
        return LZ4Utils.hash(SafeUtils.readInt(bArr, i2));
    }

    static int hash64k(byte[] bArr, int i2) {
        return LZ4Utils.hash64k(SafeUtils.readInt(bArr, i2));
    }

    static int writeLen(int i2, byte[] bArr, int i3) {
        while (i2 >= 255) {
            bArr[i3] = -1;
            i2 -= 255;
            i3++;
        }
        int i4 = i3 + 1;
        bArr[i3] = (byte) i2;
        return i4;
    }

    static boolean readIntEquals(byte[] bArr, int i2, int i3) {
        if (bArr[i2] == bArr[i3] && bArr[i2 + 1] == bArr[i3 + 1] && bArr[i2 + 2] == bArr[i3 + 2] && bArr[i2 + 3] == bArr[i3 + 3]) {
            return true;
        }
        return false;
    }

    static void safeIncrementalCopy(byte[] bArr, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i3 + i5] = bArr[i2 + i5];
        }
    }

    static void wildIncrementalCopy(byte[] bArr, int i2, int i3, int i4) {
        do {
            copy8Bytes(bArr, i2, bArr, i3);
            i2 += 8;
            i3 += 8;
        } while (i3 < i4);
    }

    static int commonBytes(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 0;
        while (i3 < i4) {
            int i6 = i2 + 1;
            int i7 = i3 + 1;
            if (bArr[i2] != bArr[i3]) {
                break;
            }
            i5++;
            i2 = i6;
            i3 = i7;
        }
        return i5;
    }

    static void copy8Bytes(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        do {
            bArr2[i3 + i4] = bArr[i2 + i4];
            i4++;
        } while (i4 < 8);
    }

    static void safeArraycopy(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        System.arraycopy(bArr, i2, bArr2, i3, i4);
    }

    static int commonBytesBackward(byte[] bArr, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        while (i2 > i4 && i3 > i5) {
            i2--;
            i3--;
            if (bArr[i2] != bArr[i3]) {
                break;
            }
            i6++;
        }
        return i6;
    }

    static void wildArraycopy(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5 += 8) {
            try {
                copy8Bytes(bArr, i2 + i5, bArr2, i3 + i5);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new LZ4Exception("Malformed input at offset ".concat(String.valueOf(i2)));
            }
        }
    }

    static int lastLiterals(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        int i6;
        if (i4 + i3 + 1 + (((i3 + 255) - 15) / 255) <= i5) {
            if (i3 >= 15) {
                bArr2[i4] = -16;
                i6 = writeLen(i3 - 15, bArr2, i4 + 1);
            } else {
                i6 = i4 + 1;
                bArr2[i4] = (byte) (i3 << 4);
            }
            System.arraycopy(bArr, i2, bArr2, i6, i3);
            return i6 + i3;
        }
        throw new LZ4Exception();
    }

    static int encodeSequence(byte[] bArr, int i2, int i3, int i4, int i5, byte[] bArr2, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i3 - i2;
        int i11 = i6 + 1;
        if (i11 + i10 + 8 + (i10 >>> 8) <= i7) {
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
        throw new LZ4Exception("maxDestLen is too small");
    }
}
