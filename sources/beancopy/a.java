package beancopy;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(1916);
    }

    public static boolean a(Boolean bool, boolean z) {
        return bool == null ? z : bool.booleanValue();
    }

    public static String a(Long l2, String str) {
        return l2 == null ? str : String.valueOf(l2.longValue());
    }

    public static boolean a(Integer num, boolean z) {
        if (num == null) {
            return z;
        }
        return num.intValue() != 0;
    }

    public static long a(Long l2) {
        return a(l2, 0);
    }

    public static double a(Double d2, double d3) {
        if (d2 == null) {
            return d3;
        }
        return d2.doubleValue();
    }

    public static float a(Double d2, float f2) {
        if (d2 == null) {
            return f2;
        }
        return d2.floatValue();
    }

    public static int a(Boolean bool, int i2) {
        if (bool == null) {
            return i2;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 0;
    }

    public static int a(Double d2, int i2) {
        if (d2 == null) {
            return i2;
        }
        return d2.intValue();
    }

    public static int a(Integer num, int i2) {
        if (num == null) {
            return i2;
        }
        return num.intValue();
    }

    public static long a(Double d2, long j2) {
        if (d2 == null) {
            return j2;
        }
        return d2.longValue();
    }

    public static long a(Integer num, long j2) {
        if (num == null) {
            return j2;
        }
        return num.longValue();
    }

    public static long a(Long l2, long j2) {
        if (l2 == null) {
            return j2;
        }
        return l2.longValue();
    }
}
