package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class XXHash64JavaSafe extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JavaSafe();

    XXHash64JavaSafe() {
    }

    static {
        Covode.recordClassIndex(106051);
    }

    @Override // net.jpountz.xxhash.XXHash64
    public final long hash(ByteBuffer byteBuffer, int i2, int i3, long j2) {
        long j3;
        int i4 = i2;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i4 + byteBuffer.arrayOffset(), i3, j2);
        }
        ByteBufferUtils.checkRange(byteBuffer, i4, i3);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i5 = i4 + i3;
        long j4 = -4417276706812531889L;
        if (i3 >= 32) {
            int i6 = i5 - 32;
            long j5 = (j2 - 7046029288634856825L) - 4417276706812531889L;
            long j6 = j2 - 4417276706812531889L;
            long j7 = j2 + 0;
            long j8 = j2 - -7046029288634856825L;
            while (true) {
                j5 = Long.rotateLeft(j5 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i4) * j4), 31) * -7046029288634856825L;
                int i7 = i4 + 8;
                j6 = Long.rotateLeft(j6 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i7) * j4), 31) * -7046029288634856825L;
                int i8 = i7 + 8;
                j7 = Long.rotateLeft(j7 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i8) * j4), 31) * -7046029288634856825L;
                int i9 = i8 + 8;
                j8 = Long.rotateLeft(j8 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i9) * j4), 31) * -7046029288634856825L;
                i4 = i9 + 8;
                if (i4 > i6) {
                    break;
                }
                j4 = -4417276706812531889L;
            }
            j3 = ((((((((((((Long.rotateLeft(j5 * -4417276706812531889L, 31) * -7046029288634856825L) ^ (((Long.rotateLeft(j5, 1) + Long.rotateLeft(j6, 7)) + Long.rotateLeft(j7, 12)) + Long.rotateLeft(j8, 18))) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j6 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j7 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j8 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L;
        } else {
            j3 = j2 + 2870177450012600261L;
        }
        long j9 = j3 + ((long) i3);
        while (i4 <= i5 - 8) {
            j9 = (Long.rotateLeft(j9 ^ (Long.rotateLeft(ByteBufferUtils.readLongLE(inLittleEndianOrder, i4) * -4417276706812531889L, 31) * -7046029288634856825L), 27) * -7046029288634856825L) - 8796714831421723037L;
            i4 += 8;
        }
        if (i4 <= i5 - 4) {
            j9 = (Long.rotateLeft(j9 ^ ((((long) ByteBufferUtils.readIntLE(inLittleEndianOrder, i4)) & 4294967295L) * -7046029288634856825L), 23) * -4417276706812531889L) + 1609587929392839161L;
            i4 += 4;
        }
        while (i4 < i5) {
            j9 = Long.rotateLeft(j9 ^ (((long) (ByteBufferUtils.readByte(inLittleEndianOrder, i4) & 255)) * 2870177450012600261L), 11) * -7046029288634856825L;
            i4++;
        }
        long j10 = ((j9 >>> 33) ^ j9) * -4417276706812531889L;
        long j11 = (j10 ^ (j10 >>> 29)) * 1609587929392839161L;
        return j11 ^ (j11 >>> 32);
    }

    @Override // net.jpountz.xxhash.XXHash64
    public final long hash(byte[] bArr, int i2, int i3, long j2) {
        long j3;
        int i4 = i2;
        SafeUtils.checkRange(bArr, i4, i3);
        int i5 = i4 + i3;
        long j4 = -4417276706812531889L;
        if (i3 >= 32) {
            int i6 = i5 - 32;
            long j5 = (j2 - 7046029288634856825L) - 4417276706812531889L;
            long j6 = j2 - 4417276706812531889L;
            long j7 = j2 + 0;
            long j8 = j2 - -7046029288634856825L;
            while (true) {
                j5 = Long.rotateLeft(j5 + (SafeUtils.readLongLE(bArr, i4) * j4), 31) * -7046029288634856825L;
                int i7 = i4 + 8;
                j6 = Long.rotateLeft(j6 + (SafeUtils.readLongLE(bArr, i7) * j4), 31) * -7046029288634856825L;
                int i8 = i7 + 8;
                j7 = Long.rotateLeft(j7 + (SafeUtils.readLongLE(bArr, i8) * j4), 31) * -7046029288634856825L;
                int i9 = i8 + 8;
                j8 = Long.rotateLeft(j8 + (SafeUtils.readLongLE(bArr, i9) * -4417276706812531889L), 31) * -7046029288634856825L;
                i4 = i9 + 8;
                if (i4 > i6) {
                    break;
                }
                j4 = -4417276706812531889L;
            }
            long rotateLeft = Long.rotateLeft(j5, 1) + Long.rotateLeft(j6, 7) + Long.rotateLeft(j7, 12) + Long.rotateLeft(j8, 18);
            j3 = (((Long.rotateLeft(j8 * -4417276706812531889L, 31) * -7046029288634856825L) ^ ((((((((((Long.rotateLeft(j5 * -4417276706812531889L, 31) * -7046029288634856825L) ^ rotateLeft) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j6 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j7 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L)) * -7046029288634856825L) - 8796714831421723037L;
        } else {
            j3 = j2 + 2870177450012600261L;
        }
        long j9 = j3 + ((long) i3);
        while (i4 <= i5 - 8) {
            j9 = (Long.rotateLeft(j9 ^ (Long.rotateLeft(SafeUtils.readLongLE(bArr, i4) * -4417276706812531889L, 31) * -7046029288634856825L), 27) * -7046029288634856825L) - 8796714831421723037L;
            i4 += 8;
        }
        if (i4 <= i5 - 4) {
            j9 = (Long.rotateLeft(j9 ^ ((((long) SafeUtils.readIntLE(bArr, i4)) & 4294967295L) * -7046029288634856825L), 23) * -4417276706812531889L) + 1609587929392839161L;
            i4 += 4;
        }
        while (i4 < i5) {
            j9 = Long.rotateLeft(j9 ^ (((long) (SafeUtils.readByte(bArr, i4) & 255)) * 2870177450012600261L), 11) * -7046029288634856825L;
            i4++;
        }
        long j10 = (j9 ^ (j9 >>> 33)) * -4417276706812531889L;
        long j11 = (j10 ^ (j10 >>> 29)) * 1609587929392839161L;
        return j11 ^ (j11 >>> 32);
    }
}
