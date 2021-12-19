package h.m;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class x extends w {
    static {
        Covode.recordClassIndex(105375);
    }

    public static final Integer e(String str) {
        l.d(str, "");
        return p.f(str);
    }

    public static final Long g(String str) {
        l.d(str, "");
        return p.h(str);
    }

    public static final Integer f(String str) {
        boolean z;
        int i2;
        l.d(str, "");
        a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        int i5 = 1;
        if (l.a(charAt, 48) >= 0) {
            z = false;
            i5 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i6 = -59652323;
        while (i5 < length) {
            int digit = Character.digit((int) str.charAt(i5), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i5++;
        }
        if (z) {
            return Integer.valueOf(i3);
        }
        return Integer.valueOf(-i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long h(java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: h.m.x.h(java.lang.String):java.lang.Long");
    }
}
