package androidx.core.b;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(700);
    }

    public static float a(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    public static int a(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }
}
