package com.google.c.a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class k {
    static {
        Covode.recordClassIndex(33249);
    }

    public static void a(boolean z, String str, int i2) {
        if (!z) {
            throw new IllegalArgumentException(a(str, Integer.valueOf(i2)));
        }
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(a(str, obj));
        }
    }

    public static void a(boolean z, String str, long j2, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(a(str, Long.valueOf(j2), obj));
        }
    }

    public static void a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(a(str, obj, obj2));
        }
    }

    public static void a(boolean z, String str, long j2) {
        if (!z) {
            throw new IllegalStateException(a(str, Long.valueOf(j2)));
        }
    }

    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int b(int i2, int i3) {
        if (i2 >= 0 && i2 <= i3) {
            return i2;
        }
        throw new IndexOutOfBoundsException(a(i2, i3, "index"));
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int a(int i2, int i3) {
        String str;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            str = a("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else if (i3 < 0) {
            throw new IllegalArgumentException("negative size: ".concat(String.valueOf(i3)));
        } else {
            str = a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static String a(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i2 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i2 < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) valueOf, i3, indexOf);
            sb.append(objArr[i2]);
            i3 = indexOf + 2;
            i2++;
        }
        sb.append((CharSequence) valueOf, i3, valueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i4 = i2 + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static <T> T a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(a(str, objArr));
    }

    private static String a(int i2, int i3, String str) {
        if (i2 < 0) {
            return a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        } else if (i3 >= 0) {
            return a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            throw new IllegalArgumentException("negative size: ".concat(String.valueOf(i3)));
        }
    }

    public static void b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(a(str, obj));
        }
    }

    public static void a(int i2, int i3, int i4) {
        String a2;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                a2 = a(i2, i4, "start index");
            } else if (i3 < 0 || i3 > i4) {
                a2 = a(i3, i4, "end index");
            } else {
                a2 = a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(a2);
        }
    }
}
