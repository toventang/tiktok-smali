package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import net.jpountz.util.SafeUtils;
import net.jpountz.util.UnsafeUtils;
import net.jpountz.xxhash.StreamingXXHash64;

final class StreamingXXHash64JavaUnsafe extends AbstractStreamingXXHash64Java {
    static {
        Covode.recordClassIndex(106043);
    }

    static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        Factory() {
        }

        static {
            Covode.recordClassIndex(106044);
        }

        @Override // net.jpountz.xxhash.StreamingXXHash64.Factory
        public StreamingXXHash64 newStreamingHash(long j2) {
            return new StreamingXXHash64JavaUnsafe(j2);
        }
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public final long getValue() {
        long j2;
        if (this.totalLen >= 32) {
            long j3 = this.v1;
            long j4 = this.v2;
            long j5 = this.v3;
            long j6 = this.v4;
            j2 = ((((((((((((Long.rotateLeft(j3 * -4417276706812531889L, 31) * -7046029288634856825L) ^ (((Long.rotateLeft(j3, 1) + Long.rotateLeft(j4, 7)) + Long.rotateLeft(j5, 12)) + Long.rotateLeft(j6, 18))) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j4 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j5 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j6 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L;
        } else {
            j2 = this.seed + 2870177450012600261L;
        }
        long j7 = j2 + this.totalLen;
        int i2 = 0;
        while (i2 <= this.memSize - 8) {
            j7 = (Long.rotateLeft(j7 ^ (Long.rotateLeft(UnsafeUtils.readLongLE(this.memory, i2) * -4417276706812531889L, 31) * -7046029288634856825L), 27) * -7046029288634856825L) - 8796714831421723037L;
            i2 += 8;
        }
        if (i2 <= this.memSize - 4) {
            j7 = (Long.rotateLeft(j7 ^ ((((long) UnsafeUtils.readIntLE(this.memory, i2)) & 4294967295L) * -7046029288634856825L), 23) * -4417276706812531889L) + 1609587929392839161L;
            i2 += 4;
        }
        while (i2 < this.memSize) {
            j7 = Long.rotateLeft(j7 ^ (((long) (this.memory[i2] & 255)) * 2870177450012600261L), 11) * -7046029288634856825L;
            i2++;
        }
        long j8 = (j7 ^ (j7 >>> 33)) * -4417276706812531889L;
        long j9 = (j8 ^ (j8 >>> 29)) * 1609587929392839161L;
        return j9 ^ (j9 >>> 32);
    }

    StreamingXXHash64JavaUnsafe(long j2) {
        super(j2);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public final void update(byte[] bArr, int i2, int i3) {
        int i4 = i2;
        SafeUtils.checkRange(bArr, i4, i3);
        this.totalLen += (long) i3;
        if (this.memSize + i3 < 32) {
            System.arraycopy(bArr, i4, this.memory, this.memSize, i3);
            this.memSize += i3;
            return;
        }
        int i5 = i3 + i4;
        long j2 = -4417276706812531889L;
        if (this.memSize > 0) {
            System.arraycopy(bArr, i4, this.memory, this.memSize, 32 - this.memSize);
            this.v1 += UnsafeUtils.readLongLE(this.memory, 0) * -4417276706812531889L;
            this.v1 = Long.rotateLeft(this.v1, 31);
            this.v1 *= -7046029288634856825L;
            this.v2 += UnsafeUtils.readLongLE(this.memory, 8) * -4417276706812531889L;
            this.v2 = Long.rotateLeft(this.v2, 31);
            this.v2 *= -7046029288634856825L;
            this.v3 += UnsafeUtils.readLongLE(this.memory, 16) * -4417276706812531889L;
            this.v3 = Long.rotateLeft(this.v3, 31);
            this.v3 *= -7046029288634856825L;
            this.v4 += UnsafeUtils.readLongLE(this.memory, 24) * -4417276706812531889L;
            this.v4 = Long.rotateLeft(this.v4, 31);
            this.v4 *= -7046029288634856825L;
            i4 += 32 - this.memSize;
            this.memSize = 0;
        }
        int i6 = i5 - 32;
        long j3 = this.v1;
        long j4 = this.v2;
        long j5 = this.v3;
        long j6 = this.v4;
        while (i4 <= i6) {
            j3 = Long.rotateLeft(j3 + (UnsafeUtils.readLongLE(bArr, i4) * j2), 31) * -7046029288634856825L;
            int i7 = i4 + 8;
            j4 = Long.rotateLeft(j4 + (UnsafeUtils.readLongLE(bArr, i7) * -4417276706812531889L), 31) * -7046029288634856825L;
            int i8 = i7 + 8;
            j5 = Long.rotateLeft(j5 + (UnsafeUtils.readLongLE(bArr, i8) * -4417276706812531889L), 31) * -7046029288634856825L;
            int i9 = i8 + 8;
            j6 = Long.rotateLeft(j6 + (UnsafeUtils.readLongLE(bArr, i9) * -4417276706812531889L), 31) * -7046029288634856825L;
            i4 = i9 + 8;
            j2 = -4417276706812531889L;
        }
        this.v1 = j3;
        this.v2 = j4;
        this.v3 = j5;
        this.v4 = j6;
        if (i4 < i5) {
            int i10 = i5 - i4;
            System.arraycopy(bArr, i4, this.memory, 0, i10);
            this.memSize = i10;
        }
    }
}
