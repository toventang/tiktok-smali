package h.i;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(105262);
    }

    public static final int a(int i2, int i3) {
        return (i2 >>> (32 - i3)) & ((-i3) >> 31);
    }

    public static final c a(long j2) {
        return new e((int) j2, (int) (j2 >> 32));
    }

    public static final String a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }
}
