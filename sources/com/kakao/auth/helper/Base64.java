package com.kakao.auth.helper;

import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.a.e;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Base64 {
    private static final byte[] CHUNK_SEPARATOR = {e.f153515b, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, e.f153515b, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final byte PAD;
    private final int chunkSeparatorLength;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final int encodedBlockSize;
    private final int lineLength;
    private final byte[] lineSeparator;
    private final int unencodedBlockSize;

    /* access modifiers changed from: package-private */
    public int getDefaultBufferSize() {
        return 8192;
    }

    /* access modifiers changed from: package-private */
    public static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        static {
            Covode.recordClassIndex(34315);
        }

        Context() {
        }

        public String toString() {
            return a.a("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{getClass().getSimpleName(), Arrays.toString(this.buffer), Integer.valueOf(this.currentLinePos), Boolean.valueOf(this.eof), Integer.valueOf(this.ibitWorkArea), Long.valueOf(this.lbitWorkArea), Integer.valueOf(this.modulus), Integer.valueOf(this.pos), Integer.valueOf(this.readPos)});
        }
    }

    static {
        Covode.recordClassIndex(34314);
    }

    private Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    private static String newStringUtf8(byte[] bArr) {
        return newString(bArr, UTF_8);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, false, true));
    }

    /* access modifiers changed from: package-private */
    public int available(Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
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

    /* access modifiers changed from: package-private */
    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b2 : bArr) {
            if (61 == b2 || isInAlphabet(b2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, 0, bArr.length, context);
        encode(bArr, 0, -1, context);
        int i2 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i2];
        readResults(bArr2, 0, i2, context);
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.unencodedBlockSize;
        long j2 = ((long) (((length + i2) - 1) / i2)) * ((long) this.encodedBlockSize);
        int i3 = this.lineLength;
        if (i3 > 0) {
            return j2 + ((((((long) i3) + j2) - 1) / ((long) i3)) * ((long) this.chunkSeparatorLength));
        }
        return j2;
    }

    private byte[] resizeBuffer(Context context) {
        if (context.buffer == null) {
            context.buffer = new byte[getDefaultBufferSize()];
            context.pos = 0;
            context.readPos = 0;
        } else {
            byte[] bArr = new byte[(context.buffer.length * 2)];
            System.arraycopy(context.buffer, 0, bArr, 0, context.buffer.length);
            context.buffer = bArr;
        }
        return context.buffer;
    }

    private static String newString(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, charset.name());
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] ensureBufferSize(int i2, Context context) {
        if (context.buffer == null || context.buffer.length < context.pos + i2) {
            return resizeBuffer(context);
        }
        return context.buffer;
    }

    private static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    private Base64(int i2, byte[] bArr, boolean z) {
        int length;
        int i3;
        byte[] bArr2;
        this.PAD = 61;
        this.decodeTable = DECODE_TABLE;
        this.unencodedBlockSize = 3;
        this.encodedBlockSize = 4;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        this.chunkSeparatorLength = length;
        if (i2 <= 0 || length <= 0) {
            i3 = 0;
        } else {
            i3 = (i2 / 4) * 4;
        }
        this.lineLength = i3;
        if (bArr == null) {
            this.encodeSize = 4;
            this.lineSeparator = null;
        } else if (containsAlphabetOrPad(bArr)) {
            throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + newStringUtf8(bArr) + "]");
        } else if (i2 > 0) {
            this.encodeSize = bArr.length + 4;
            byte[] bArr3 = new byte[bArr.length];
            this.lineSeparator = bArr3;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        if (z) {
            bArr2 = URL_SAFE_ENCODE_TABLE;
        } else {
            bArr2 = STANDARD_ENCODE_TABLE;
        }
        this.encodeTable = bArr2;
    }

    /* access modifiers changed from: package-private */
    public int readResults(byte[] bArr, int i2, int i3, Context context) {
        if (context.buffer != null) {
            int min = Math.min(available(context), i3);
            System.arraycopy(context.buffer, context.readPos, bArr, i2, min);
            context.readPos += min;
            if (context.readPos >= context.pos) {
                context.buffer = null;
            }
            return min;
        } else if (context.eof) {
            return -1;
        } else {
            return 0;
        }
    }

    private static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i2) {
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
    public void encode(byte[] bArr, int i2, int i3, Context context) {
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
                    int i21 = this.lineLength;
                    if (i21 > 0 && i21 <= context.currentLinePos) {
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
