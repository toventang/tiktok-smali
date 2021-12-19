package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

final class XXHash32JavaUnsafe extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JavaUnsafe();

    XXHash32JavaUnsafe() {
    }

    static {
        Covode.recordClassIndex(106048);
    }

    @Override // net.jpountz.xxhash.XXHash32
    public final int hash(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        int i5;
        int i6 = i2;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i6 + byteBuffer.arrayOffset(), i3, i4);
        }
        ByteBufferUtils.checkRange(byteBuffer, i6, i3);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i7 = i6 + i3;
        if (i3 >= 16) {
            int i8 = i7 - 16;
            int i9 = (i4 - 1640531535) - 2048144777;
            int i10 = i4 - 2048144777;
            int i11 = i4 + 0;
            int i12 = i4 - -1640531535;
            do {
                i9 = Integer.rotateLeft(i9 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i6) * -2048144777), 13) * -1640531535;
                int i13 = i6 + 4;
                i10 = Integer.rotateLeft(i10 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i13) * -2048144777), 13) * -1640531535;
                int i14 = i13 + 4;
                i11 = Integer.rotateLeft(i11 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i14) * -2048144777), 13) * -1640531535;
                int i15 = i14 + 4;
                i12 = Integer.rotateLeft(i12 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i15) * -2048144777), 13) * -1640531535;
                i6 = i15 + 4;
            } while (i6 <= i8);
            i5 = Integer.rotateLeft(i9, 1) + Integer.rotateLeft(i10, 7) + Integer.rotateLeft(i11, 12) + Integer.rotateLeft(i12, 18);
        } else {
            i5 = i4 + 374761393;
        }
        int i16 = i5 + i3;
        while (i6 <= i7 - 4) {
            i16 = Integer.rotateLeft(i16 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i6) * -1028477379), 17) * 668265263;
            i6 += 4;
        }
        while (i6 < i7) {
            i16 = Integer.rotateLeft(i16 + ((ByteBufferUtils.readByte(inLittleEndianOrder, i6) & 255) * 374761393), 11) * -1640531535;
            i6++;
        }
        int i17 = ((i16 >>> 15) ^ i16) * -2048144777;
        int i18 = (i17 ^ (i17 >>> 13)) * -1028477379;
        return i18 ^ (i18 >>> 16);
    }

    @Override // net.jpountz.xxhash.XXHash32
    public final int hash(byte[] bArr, int i2, int i3, int i4) {
        int i5;
        UnsafeUtils.checkRange(bArr, i2, i3);
        int i6 = i2 + i3;
        if (i3 >= 16) {
            int i7 = i6 - 16;
            int i8 = (i4 - 1640531535) - 2048144777;
            int i9 = i4 - 2048144777;
            int i10 = i4 + 0;
            int i11 = i4 - -1640531535;
            do {
                i8 = Integer.rotateLeft(i8 + (UnsafeUtils.readIntLE(bArr, i2) * -2048144777), 13) * -1640531535;
                int i12 = i2 + 4;
                i9 = Integer.rotateLeft(i9 + (UnsafeUtils.readIntLE(bArr, i12) * -2048144777), 13) * -1640531535;
                int i13 = i12 + 4;
                i10 = Integer.rotateLeft(i10 + (UnsafeUtils.readIntLE(bArr, i13) * -2048144777), 13) * -1640531535;
                int i14 = i13 + 4;
                i11 = Integer.rotateLeft(i11 + (UnsafeUtils.readIntLE(bArr, i14) * -2048144777), 13) * -1640531535;
                i2 = i14 + 4;
            } while (i2 <= i7);
            i5 = Integer.rotateLeft(i8, 1) + Integer.rotateLeft(i9, 7) + Integer.rotateLeft(i10, 12) + Integer.rotateLeft(i11, 18);
        } else {
            i5 = i4 + 374761393;
        }
        int i15 = i5 + i3;
        while (i2 <= i6 - 4) {
            i15 = Integer.rotateLeft(i15 + (UnsafeUtils.readIntLE(bArr, i2) * -1028477379), 17) * 668265263;
            i2 += 4;
        }
        while (i2 < i6) {
            i15 = Integer.rotateLeft(i15 + ((UnsafeUtils.readByte(bArr, i2) & 255) * 374761393), 11) * -1640531535;
            i2++;
        }
        int i16 = ((i15 >>> 15) ^ i15) * -2048144777;
        int i17 = (i16 ^ (i16 >>> 13)) * -1028477379;
        return i17 ^ (i17 >>> 16);
    }
}
