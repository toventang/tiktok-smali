package com.facebook.common.d;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class i {
    static {
        Covode.recordClassIndex(28639);
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
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append(valueOf.substring(i3, indexOf));
            sb.append(objArr[i2]);
            i3 = indexOf + 2;
            i2++;
        }
        sb.append(valueOf.substring(i3));
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
}
