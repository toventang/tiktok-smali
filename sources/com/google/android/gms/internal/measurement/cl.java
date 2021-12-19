package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class cl {
    static {
        Covode.recordClassIndex(31705);
    }

    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int b(int i2, int i3) {
        if (i2 >= 0 && i2 <= i3) {
            return i2;
        }
        throw new IndexOutOfBoundsException(a(i2, i3, "index"));
    }

    public static int a(int i2, int i3) {
        String str;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            str = cn.a("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else if (i3 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i3).toString());
        } else {
            str = cn.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static void a(int i2, int i3, int i4) {
        String a2;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                a2 = a(i2, i4, "start index");
            } else if (i3 < 0 || i3 > i4) {
                a2 = a(i3, i4, "end index");
            } else {
                a2 = cn.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(a2);
        }
    }

    private static String a(int i2, int i3, String str) {
        if (i2 < 0) {
            return cn.a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        } else if (i3 >= 0) {
            return cn.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i3).toString());
        }
    }
}
