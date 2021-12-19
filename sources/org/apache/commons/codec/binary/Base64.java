package org.apache.commons.codec.binary;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.a.e;
import org.apache.commons.codec.binary.BaseNCodec;

public class Base64 extends BaseNCodec {
    static final byte[] CHUNK_SEPARATOR = {e.f153515b, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, e.f153515b, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public Base64() {
        this(0);
    }

    static {
        Covode.recordClassIndex(106346);
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public Base64(int i2) {
        this(i2, CHUNK_SEPARATOR);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    /* access modifiers changed from: protected */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b2) {
        if (b2 < 0) {
            return false;
        }
        byte[] bArr = this.decodeTable;
        if (b2 >= bArr.length || bArr[b2] == -1) {
            return false;
        }
        return true;
    }

    public Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public Base64(int i2, byte[] bArr) {
        this(i2, bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Base64(int r5, byte[] r6, boolean r7) {
        /*
            r4 = this;
            r3 = 0
            if (r6 != 0) goto L_0x003f
            r1 = 0
        L_0x0004:
            r0 = 3
            r2 = 4
            r4.<init>(r0, r2, r5, r1)
            byte[] r0 = org.apache.commons.codec.binary.Base64.DECODE_TABLE
            r4.decodeTable = r0
            r1 = 0
            if (r6 == 0) goto L_0x003a
            boolean r0 = r4.containsAlphabetOrPad(r6)
            if (r0 != 0) goto L_0x0041
            if (r5 <= 0) goto L_0x0035
            int r0 = r6.length
            int r0 = r0 + r2
            r4.encodeSize = r0
            int r0 = r6.length
            byte[] r1 = new byte[r0]
            r4.lineSeparator = r1
            int r0 = r6.length
            java.lang.System.arraycopy(r6, r3, r1, r3, r0)
        L_0x0025:
            int r0 = r4.encodeSize
            int r0 = r0 + -1
            r4.decodeSize = r0
            if (r7 == 0) goto L_0x0032
            byte[] r0 = org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE
        L_0x002f:
            r4.encodeTable = r0
            return
        L_0x0032:
            byte[] r0 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE
            goto L_0x002f
        L_0x0035:
            r4.encodeSize = r2
            r4.lineSeparator = r1
            goto L_0x0025
        L_0x003a:
            r4.encodeSize = r2
            r4.lineSeparator = r1
            goto L_0x0025
        L_0x003f:
            int r1 = r6.length
            goto L_0x0004
        L_0x0041:
            java.lang.String r3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(r6)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "lineSeparator must not contain base64 characters: ["
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r0 = "]"
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.binary.Base64.<init>(int, byte[], boolean):void");
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i2) {
        Base64 base64;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (z) {
            base64 = new Base64(z2);
        } else {
            base64 = new Base64(0, CHUNK_SEPARATOR, z2);
        }
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= ((long) i2)) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i2);
    }

    /* access modifiers changed from: package-private */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void decode(byte[] bArr, int i2, int i3, BaseNCodec.Context context) {
        byte b2;
        if (!context.eof) {
            if (i3 >= 0) {
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        break;
                    }
                    byte[] ensureBufferSize = ensureBufferSize(this.decodeSize, context);
                    int i5 = i2 + 1;
                    byte b3 = bArr[i2];
                    if (b3 == 61) {
                        context.eof = true;
                        break;
                    }
                    if (b3 >= 0) {
                        byte[] bArr2 = DECODE_TABLE;
                        if (b3 < bArr2.length && (b2 = bArr2[b3]) >= 0) {
                            context.modulus = (context.modulus + 1) % 4;
                            context.ibitWorkArea = (context.ibitWorkArea << 6) + b2;
                            if (context.modulus == 0) {
                                int i6 = context.pos;
                                context.pos = i6 + 1;
                                ensureBufferSize[i6] = (byte) ((context.ibitWorkArea >> 16) & 255);
                                int i7 = context.pos;
                                context.pos = i7 + 1;
                                ensureBufferSize[i7] = (byte) ((context.ibitWorkArea >> 8) & 255);
                                int i8 = context.pos;
                                context.pos = i8 + 1;
                                ensureBufferSize[i8] = (byte) (context.ibitWorkArea & 255);
                            }
                        }
                    }
                    i4++;
                    i2 = i5;
                }
            } else {
                context.eof = true;
            }
            if (context.eof && context.modulus != 0) {
                byte[] ensureBufferSize2 = ensureBufferSize(this.decodeSize, context);
                int i9 = context.modulus;
                if (i9 == 1) {
                    return;
                }
                if (i9 == 2) {
                    context.ibitWorkArea >>= 4;
                    int i10 = context.pos;
                    context.pos = i10 + 1;
                    ensureBufferSize2[i10] = (byte) (context.ibitWorkArea & 255);
                } else if (i9 == 3) {
                    context.ibitWorkArea >>= 2;
                    int i11 = context.pos;
                    context.pos = i11 + 1;
                    ensureBufferSize2[i11] = (byte) ((context.ibitWorkArea >> 8) & 255);
                    int i12 = context.pos;
                    context.pos = i12 + 1;
                    ensureBufferSize2[i12] = (byte) (context.ibitWorkArea & 255);
                } else {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i2, int i3, BaseNCodec.Context context) {
        if (!context.eof) {
            if (i3 < 0) {
                context.eof = true;
                if (context.modulus != 0 || this.lineLength != 0) {
                    byte[] ensureBufferSize = ensureBufferSize(this.encodeSize, context);
                    int i4 = context.pos;
                    int i5 = context.modulus;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            int i6 = context.pos;
                            context.pos = i6 + 1;
                            ensureBufferSize[i6] = this.encodeTable[(context.ibitWorkArea >> 2) & 63];
                            int i7 = context.pos;
                            context.pos = i7 + 1;
                            ensureBufferSize[i7] = this.encodeTable[(context.ibitWorkArea << 4) & 63];
                            if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                                int i8 = context.pos;
                                context.pos = i8 + 1;
                                ensureBufferSize[i8] = 61;
                                int i9 = context.pos;
                                context.pos = i9 + 1;
                                ensureBufferSize[i9] = 61;
                            }
                        } else if (i5 == 2) {
                            int i10 = context.pos;
                            context.pos = i10 + 1;
                            ensureBufferSize[i10] = this.encodeTable[(context.ibitWorkArea >> 10) & 63];
                            int i11 = context.pos;
                            context.pos = i11 + 1;
                            ensureBufferSize[i11] = this.encodeTable[(context.ibitWorkArea >> 4) & 63];
                            int i12 = context.pos;
                            context.pos = i12 + 1;
                            ensureBufferSize[i12] = this.encodeTable[(context.ibitWorkArea << 2) & 63];
                            if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                                int i13 = context.pos;
                                context.pos = i13 + 1;
                                ensureBufferSize[i13] = 61;
                            }
                        } else {
                            throw new IllegalStateException("Impossible modulus " + context.modulus);
                        }
                    }
                    context.currentLinePos += context.pos - i4;
                    if (this.lineLength > 0 && context.currentLinePos > 0) {
                        System.arraycopy(this.lineSeparator, 0, ensureBufferSize, context.pos, this.lineSeparator.length);
                        context.pos += this.lineSeparator.length;
                        return;
                    }
                    return;
                }
                return;
            }
            int i14 = 0;
            while (i14 < i3) {
                byte[] ensureBufferSize2 = ensureBufferSize(this.encodeSize, context);
                context.modulus = (context.modulus + 1) % 3;
                int i15 = i2 + 1;
                byte b2 = bArr[i2];
                int i16 = b2;
                if (b2 < 0) {
                    i16 = b2 + 256;
                }
                context.ibitWorkArea = (context.ibitWorkArea << 8) + (i16 == 1 ? 1 : 0);
                if (context.modulus == 0) {
                    int i17 = context.pos;
                    context.pos = i17 + 1;
                    ensureBufferSize2[i17] = this.encodeTable[(context.ibitWorkArea >> 18) & 63];
                    int i18 = context.pos;
                    context.pos = i18 + 1;
                    ensureBufferSize2[i18] = this.encodeTable[(context.ibitWorkArea >> 12) & 63];
                    int i19 = context.pos;
                    context.pos = i19 + 1;
                    ensureBufferSize2[i19] = this.encodeTable[(context.ibitWorkArea >> 6) & 63];
                    int i20 = context.pos;
                    context.pos = i20 + 1;
                    ensureBufferSize2[i20] = this.encodeTable[context.ibitWorkArea & 63];
                    context.currentLinePos += 4;
                    if (this.lineLength > 0 && this.lineLength <= context.currentLinePos) {
                        System.arraycopy(this.lineSeparator, 0, ensureBufferSize2, context.pos, this.lineSeparator.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i14++;
                i2 = i15;
            }
        }
    }
}
