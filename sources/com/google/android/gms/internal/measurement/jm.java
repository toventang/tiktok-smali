package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

final class jm {

    /* renamed from: a  reason: collision with root package name */
    static final jo f51081a;

    static int a(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    static int a(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    static int a(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    static {
        jo jnVar;
        Covode.recordClassIndex(31910);
        if (!jk.f51068b || !jk.f51067a || ex.a()) {
            jnVar = new jn();
        } else {
            jnVar = new jp();
        }
        f51081a = jnVar;
    }

    static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) >= 65536) {
                                i3++;
                            } else {
                                throw new jq(i3, length2);
                            }
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        throw new IllegalArgumentException(new StringBuilder(54).append("UTF-8 length does not fit in int: ").append(((long) i4) + 4294967296L).toString());
    }

    static String b(byte[] bArr, int i2, int i3) {
        return f51081a.b(bArr, i2, i3);
    }

    static /* synthetic */ int c(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return a(b2);
        }
        if (i4 == 1) {
            return a(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return a(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean a(byte[] bArr, int i2, int i3) {
        return f51081a.c(bArr, i2, i3);
    }

    static int a(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return f51081a.a(charSequence, bArr, i2, i3);
    }
}
