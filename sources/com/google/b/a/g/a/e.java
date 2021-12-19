package com.google.b.a.g.a;

import com.bytedance.covode.number.Covode;

public abstract class e extends b {
    static {
        Covode.recordClassIndex(33174);
    }

    /* access modifiers changed from: protected */
    public abstract int a(CharSequence charSequence, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract char[] a(int i2);

    /* access modifiers changed from: protected */
    public final String a(String str, int i2) {
        int length = str.length();
        char[] cArr = d.f53612a.get();
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            if (i2 < length) {
                int i5 = i2 + 1;
                char charAt = str.charAt(i2);
                int i6 = 1;
                int i7 = charAt;
                if (charAt >= 55296) {
                    i7 = charAt;
                    if (charAt <= 57343) {
                        if (charAt > 56319) {
                            throw new IllegalArgumentException(new StringBuilder(82).append("Unexpected low surrogate character '").append(charAt).append("' with value ").append((int) charAt).append(" at index ").append(i5 - 1).toString());
                        } else if (i5 == length) {
                            i7 = -charAt;
                        } else {
                            char charAt2 = str.charAt(i5);
                            if (Character.isLowSurrogate(charAt2)) {
                                i7 = Character.toCodePoint(charAt, charAt2);
                            } else {
                                throw new IllegalArgumentException(new StringBuilder(83).append("Expected low surrogate but got char '").append(charAt2).append("' with value ").append((int) charAt2).append(" at index ").append(i5).toString());
                            }
                        }
                    }
                }
                if (i7 >= 0) {
                    char[] a2 = a(i7 == 1 ? 1 : 0);
                    if (Character.isSupplementaryCodePoint(i7)) {
                        i6 = 2;
                    }
                    int i8 = i6 + i2;
                    if (a2 != null) {
                        int i9 = i2 - i3;
                        int i10 = i4 + i9;
                        int length2 = a2.length + i10;
                        if (cArr.length < length2) {
                            cArr = a(cArr, i4, ((length2 + length) - i2) + 32);
                        }
                        if (i9 > 0) {
                            str.getChars(i3, i2, cArr, i4);
                            i4 = i10;
                        }
                        if (a2.length > 0) {
                            System.arraycopy(a2, 0, cArr, i4, a2.length);
                            i4 += a2.length;
                        }
                        i3 = i8;
                    }
                    i2 = a(str, i8, length);
                } else {
                    throw new IllegalArgumentException("Trailing high surrogate at end of input");
                }
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i11 = length - i3;
        if (i11 > 0) {
            int i12 = i11 + i4;
            if (cArr.length < i12) {
                cArr = a(cArr, i4, i12);
            }
            str.getChars(i3, length, cArr, i4);
            i4 = i12;
        }
        return new String(cArr, 0, i4);
    }

    private static char[] a(char[] cArr, int i2, int i3) {
        char[] cArr2 = new char[i3];
        if (i2 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i2);
        }
        return cArr2;
    }
}
