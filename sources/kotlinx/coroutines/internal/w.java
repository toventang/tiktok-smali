package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.m.p;

public final class w {
    static {
        Covode.recordClassIndex(105675);
    }

    public static /* synthetic */ int a(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return y.a(str, i2, i3, i4);
    }

    public static final long a(String str, long j2, long j3, long j4) {
        String a2 = x.a(str);
        if (a2 == null) {
            return j2;
        }
        Long g2 = p.g(a2);
        if (g2 != null) {
            long longValue = g2.longValue();
            if (j3 <= longValue && j4 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + a2 + '\'').toString());
    }
}
