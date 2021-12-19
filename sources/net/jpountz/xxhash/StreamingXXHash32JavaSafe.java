package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.StreamingXXHash32;

final class StreamingXXHash32JavaSafe extends AbstractStreamingXXHash32Java {
    static {
        Covode.recordClassIndex(106032);
    }

    static class Factory implements StreamingXXHash32.Factory {
        public static final StreamingXXHash32.Factory INSTANCE = new Factory();

        Factory() {
        }

        static {
            Covode.recordClassIndex(106033);
        }

        @Override // net.jpountz.xxhash.StreamingXXHash32.Factory
        public StreamingXXHash32 newStreamingHash(int i2) {
            return new StreamingXXHash32JavaSafe(i2);
        }
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public final int getValue() {
        int i2;
        if (this.totalLen >= 16) {
            i2 = Integer.rotateLeft(this.v1, 1) + Integer.rotateLeft(this.v2, 7) + Integer.rotateLeft(this.v3, 12) + Integer.rotateLeft(this.v4, 18);
        } else {
            i2 = this.seed + 374761393;
        }
        int i3 = (int) (((long) i2) + this.totalLen);
        int i4 = 0;
        while (i4 <= this.memSize - 4) {
            i3 = Integer.rotateLeft(i3 + (SafeUtils.readIntLE(this.memory, i4) * -1028477379), 17) * 668265263;
            i4 += 4;
        }
        while (i4 < this.memSize) {
            i3 = Integer.rotateLeft(i3 + ((SafeUtils.readByte(this.memory, i4) & 255) * 374761393), 11) * -1640531535;
            i4++;
        }
        int i5 = ((i3 >>> 15) ^ i3) * -2048144777;
        int i6 = (i5 ^ (i5 >>> 13)) * -1028477379;
        return i6 ^ (i6 >>> 16);
    }

    StreamingXXHash32JavaSafe(int i2) {
        super(i2);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public final void update(byte[] bArr, int i2, int i3) {
        SafeUtils.checkRange(bArr, i2, i3);
        this.totalLen += (long) i3;
        if (this.memSize + i3 < 16) {
            System.arraycopy(bArr, i2, this.memory, this.memSize, i3);
            this.memSize += i3;
            return;
        }
        int i4 = i3 + i2;
        if (this.memSize > 0) {
            System.arraycopy(bArr, i2, this.memory, this.memSize, 16 - this.memSize);
            this.v1 += SafeUtils.readIntLE(this.memory, 0) * -2048144777;
            this.v1 = Integer.rotateLeft(this.v1, 13);
            this.v1 *= -1640531535;
            this.v2 += SafeUtils.readIntLE(this.memory, 4) * -2048144777;
            this.v2 = Integer.rotateLeft(this.v2, 13);
            this.v2 *= -1640531535;
            this.v3 += SafeUtils.readIntLE(this.memory, 8) * -2048144777;
            this.v3 = Integer.rotateLeft(this.v3, 13);
            this.v3 *= -1640531535;
            this.v4 += SafeUtils.readIntLE(this.memory, 12) * -2048144777;
            this.v4 = Integer.rotateLeft(this.v4, 13);
            this.v4 *= -1640531535;
            i2 += 16 - this.memSize;
            this.memSize = 0;
        }
        int i5 = i4 - 16;
        int i6 = this.v1;
        int i7 = this.v2;
        int i8 = this.v3;
        int i9 = this.v4;
        while (i2 <= i5) {
            i6 = Integer.rotateLeft(i6 + (SafeUtils.readIntLE(bArr, i2) * -2048144777), 13) * -1640531535;
            int i10 = i2 + 4;
            i7 = Integer.rotateLeft(i7 + (SafeUtils.readIntLE(bArr, i10) * -2048144777), 13) * -1640531535;
            int i11 = i10 + 4;
            i8 = Integer.rotateLeft(i8 + (SafeUtils.readIntLE(bArr, i11) * -2048144777), 13) * -1640531535;
            int i12 = i11 + 4;
            i9 = Integer.rotateLeft(i9 + (SafeUtils.readIntLE(bArr, i12) * -2048144777), 13) * -1640531535;
            i2 = i12 + 4;
        }
        this.v1 = i6;
        this.v2 = i7;
        this.v3 = i8;
        this.v4 = i9;
        if (i2 < i4) {
            int i13 = i4 - i2;
            System.arraycopy(bArr, i2, this.memory, 0, i13);
            this.memSize = i13;
        }
    }
}
