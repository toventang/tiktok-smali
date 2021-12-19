package com.google.android.gms.internal.measurement;

import com.a;
import com.bytedance.covode.number.Covode;

final class jn extends jo {
    static {
        Covode.recordClassIndex(31911);
    }

    jn() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.jo
    public final int a(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (b2 < -16) {
                    if (i4 >= i3 - 1) {
                        return jm.c(bArr, i4, i3);
                    }
                    int i5 = i4 + 1;
                    byte b3 = bArr[i4];
                    if (b3 <= -65) {
                        if (b2 == -32) {
                            if (b3 < -96) {
                            }
                        } else if (b2 == -19 && b3 >= -96) {
                        }
                        i2 = i5 + 1;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                } else if (i4 >= i3 - 2) {
                    return jm.c(bArr, i4, i3);
                } else {
                    int i6 = i4 + 1;
                    byte b4 = bArr[i4];
                    if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                        int i7 = i6 + 1;
                        if (bArr[i6] <= -65) {
                            i4 = i7 + 1;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i2 = i4;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.jo
    public final String b(byte[] bArr, int i2, int i3) {
        if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                if (b2 < 0) {
                    break;
                }
                i2++;
                jl.a(b2, cArr, i5);
                i5++;
            }
            while (i2 < i4) {
                int i6 = i2 + 1;
                byte b3 = bArr[i2];
                if (b3 >= 0) {
                    int i7 = i5 + 1;
                    jl.a(b3, cArr, i5);
                    while (i6 < i4) {
                        byte b4 = bArr[i6];
                        if (b4 < 0) {
                            break;
                        }
                        i6++;
                        jl.a(b4, cArr, i7);
                        i7++;
                    }
                    i2 = i6;
                    i5 = i7;
                } else if (jl.a(b3)) {
                    if (i6 < i4) {
                        i2 = i6 + 1;
                        jl.a(b3, bArr[i6], cArr, i5);
                        i5++;
                    } else {
                        throw gu.h();
                    }
                } else if (jl.b(b3)) {
                    if (i6 < i4 - 1) {
                        int i8 = i6 + 1;
                        i2 = i8 + 1;
                        jl.a(b3, bArr[i6], bArr[i8], cArr, i5);
                        i5++;
                    } else {
                        throw gu.h();
                    }
                } else if (i6 < i4 - 2) {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    i2 = i10 + 1;
                    jl.a(b3, bArr[i6], bArr[i9], bArr[i10], cArr, i5);
                    i5 = i5 + 1 + 1;
                } else {
                    throw gu.h();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(a.a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.jo
    public final int a(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char charAt;
        int length = charSequence.length();
        int i7 = i3 + i2;
        int i8 = 0;
        while (i8 < length && (i6 = i8 + i2) < i7 && (charAt = charSequence.charAt(i8)) < 128) {
            bArr[i6] = (byte) charAt;
            i8++;
        }
        if (i8 == length) {
            return i2 + length;
        }
        int i9 = i2 + i8;
        while (i8 < length) {
            char charAt2 = charSequence.charAt(i8);
            if (charAt2 < 128 && i9 < i7) {
                i5 = i9 + 1;
                bArr[i9] = (byte) charAt2;
            } else if (charAt2 < 2048 && i9 <= i7 - 2) {
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 >>> 6) | 960);
                i9 = i10 + 1;
                bArr[i10] = (byte) ((charAt2 & '?') | 128);
                i8++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i9 <= i7 - 3) {
                int i11 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 >>> '\f') | 480);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i5 = i12 + 1;
                bArr[i12] = (byte) ((charAt2 & '?') | 128);
            } else if (i9 <= i7 - 4) {
                int i13 = i8 + 1;
                if (i13 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i13);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i14 = i9 + 1;
                        bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i9 = i16 + 1;
                        bArr[i16] = (byte) ((codePoint & 63) | 128);
                        i8 = i13;
                        i8++;
                    } else {
                        i8 = i13;
                    }
                }
                throw new jq(i8 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i4 = i8 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charAt2).append(" at index ").append(i9).toString());
            } else {
                throw new jq(i8, length);
            }
            i9 = i5;
            i8++;
        }
        return i9;
    }
}
