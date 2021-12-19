package f.a.e.j;

import com.bytedance.covode.number.Covode;

public final class m {
    static {
        Covode.recordClassIndex(104876);
    }

    public static int a(int i2) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1));
    }
}
