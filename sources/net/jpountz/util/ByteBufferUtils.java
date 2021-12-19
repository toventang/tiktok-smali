package net.jpountz.util;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public enum ByteBufferUtils {
    ;
    
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static {
        Covode.recordClassIndex(106019);
    }

    public static void checkNotReadOnly(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
    }

    public static ByteBuffer inLittleEndianOrder(ByteBuffer byteBuffer) {
        if (byteBuffer.order().equals(ByteOrder.LITTLE_ENDIAN)) {
            return byteBuffer;
        }
        return byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    }

    public static ByteBuffer inNativeByteOrder(ByteBuffer byteBuffer) {
        if (byteBuffer.order().equals(Utils.NATIVE_BYTE_ORDER)) {
            return byteBuffer;
        }
        return byteBuffer.duplicate().order(Utils.NATIVE_BYTE_ORDER);
    }

    public static byte readByte(ByteBuffer byteBuffer, int i2) {
        return byteBuffer.get(i2);
    }

    public static int readInt(ByteBuffer byteBuffer, int i2) {
        return byteBuffer.getInt(i2);
    }

    public static int readIntLE(ByteBuffer byteBuffer, int i2) {
        return byteBuffer.getInt(i2);
    }

    public static long readLong(ByteBuffer byteBuffer, int i2) {
        return byteBuffer.getLong(i2);
    }

    public static long readLongLE(ByteBuffer byteBuffer, int i2) {
        return byteBuffer.getLong(i2);
    }

    public static void checkRange(ByteBuffer byteBuffer, int i2) {
        if (i2 < 0 || i2 >= byteBuffer.capacity()) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
    }

    public static int readShortLE(ByteBuffer byteBuffer, int i2) {
        return ((byteBuffer.get(i2 + 1) & 255) << 8) | (byteBuffer.get(i2) & 255);
    }

    public static void writeInt(ByteBuffer byteBuffer, int i2, int i3) {
        byteBuffer.putInt(i2, i3);
    }

    public static void writeLong(ByteBuffer byteBuffer, int i2, long j2) {
        byteBuffer.putLong(i2, j2);
    }

    public static void writeByte(ByteBuffer byteBuffer, int i2, int i3) {
        byteBuffer.put(i2, (byte) i3);
    }

    public static void writeShortLE(ByteBuffer byteBuffer, int i2, int i3) {
        byteBuffer.put(i2, (byte) i3);
        byteBuffer.put(i2 + 1, (byte) (i3 >>> 8));
    }

    public static void checkRange(ByteBuffer byteBuffer, int i2, int i3) {
        SafeUtils.checkLength(i3);
        if (i3 > 0) {
            checkRange(byteBuffer, i2);
            checkRange(byteBuffer, (i2 + i3) - 1);
        }
    }
}
