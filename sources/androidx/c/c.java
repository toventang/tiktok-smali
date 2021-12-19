package androidx.c;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f1803a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    static final long[] f1804b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    static final Object[] f1805c = new Object[0];

    private static int c(int i2) {
        int i3 = 4;
        do {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                return i4;
            }
            i3++;
        } while (i3 < 32);
        return i2;
    }

    static {
        Covode.recordClassIndex(554);
    }

    public static int a(int i2) {
        return c(i2 * 4) / 4;
    }

    public static int b(int i2) {
        return c(i2 * 8) / 8;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    static int a(int[] iArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 <= i3) {
                return i6;
            } else {
                i4 = i6 - 1;
            }
        }
        return i5 ^ -1;
    }

    static int a(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else if (j3 <= j2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }
}
