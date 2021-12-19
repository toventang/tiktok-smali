package net.jpountz.util;

import com.bytedance.covode.number.Covode;
import java.nio.ByteOrder;

public enum SafeUtils {
    ;

    static {
        Covode.recordClassIndex(106022);
    }

    public static void checkLength(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        }
    }

    public static byte readByte(byte[] bArr, int i2) {
        return bArr[i2];
    }

    public static int readInt(int[] iArr, int i2) {
        return iArr[i2];
    }

    public static int readShort(short[] sArr, int i2) {
        return sArr[i2] & 65535;
    }

    public static void checkRange(byte[] bArr, int i2) {
        if (i2 < 0 || i2 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
    }

    public static int readInt(byte[] bArr, int i2) {
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            return readIntBE(bArr, i2);
        }
        return readIntLE(bArr, i2);
    }

    public static int readShortLE(byte[] bArr, int i2) {
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    public static int readIntBE(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public static int readIntLE(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long readLongLE(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static void writeByte(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) i3;
    }

    public static void writeInt(int[] iArr, int i2, int i3) {
        iArr[i2] = i3;
    }

    public static void writeShort(short[] sArr, int i2, int i3) {
        sArr[i2] = (short) i3;
    }

    public static void writeShortLE(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) i3;
        bArr[i2 + 1] = (byte) (i3 >>> 8);
    }

    public static void checkRange(byte[] bArr, int i2, int i3) {
        checkLength(i3);
        if (i3 > 0) {
            checkRange(bArr, i2);
            checkRange(bArr, (i2 + i3) - 1);
        }
    }
}
