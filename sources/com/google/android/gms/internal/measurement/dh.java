package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class dh {
    static {
        Covode.recordClassIndex(31728);
    }

    static int a(int i2, int i3, int i4) {
        return (i2 & (i4 ^ -1)) | (i3 & i4);
    }

    static int b(int i2) {
        return (i2 < 32 ? 4 : 2) * (i2 + 1);
    }

    static Object a(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            throw new IllegalArgumentException(new StringBuilder(52).append("must be power of 2 between 2^1 and 2^30: ").append(i2).toString());
        } else if (i2 <= 256) {
            return new byte[i2];
        } else {
            if (i2 <= 65536) {
                return new short[i2];
            }
            return new int[i2];
        }
    }

    static int a(Object obj, int i2) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i2] & 65535;
        }
        return ((int[]) obj)[i2];
    }

    static void a(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    static int a(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int a2 = dj.a(obj);
        int i5 = a2 & i2;
        int a3 = a(obj3, i5);
        if (a3 == 0) {
            return -1;
        }
        int i6 = i2 ^ -1;
        int i7 = a2 & i6;
        int i8 = -1;
        while (true) {
            i3 = a3 - 1;
            i4 = iArr[i3];
            if ((i4 & i6) != i7 || !ck.a(obj, objArr[i3]) || (objArr2 != null && !ck.a(obj2, objArr2[i3]))) {
                a3 = i4 & i2;
                if (a3 == 0) {
                    return -1;
                }
                i8 = i3;
            }
        }
        int i9 = i4 & i2;
        if (i8 == -1) {
            a(obj3, i5, i9);
        } else {
            iArr[i8] = a(iArr[i8], i9, i2);
        }
        return i3;
    }
}
