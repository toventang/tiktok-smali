package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;

public final /* synthetic */ class y {
    static {
        Covode.recordClassIndex(105677);
    }

    public static final boolean a(String str) {
        String a2 = x.a(str);
        if (a2 != null) {
            return Boolean.parseBoolean(a2);
        }
        return true;
    }

    public static final int a(String str, int i2, int i3, int i4) {
        return (int) w.a(str, (long) i2, (long) i3, (long) i4);
    }
}
