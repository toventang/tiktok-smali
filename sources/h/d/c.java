package h.d;

import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(105146);
    }

    private static final int a(int i2, int i3) {
        int i4 = i2 % i3;
        if (i4 >= 0) {
            return i4;
        }
        return i4 + i3;
    }

    public static final int a(int i2, int i3, int i4) {
        return a(a(i2, i4) - a(i3, i4), i4);
    }
}
