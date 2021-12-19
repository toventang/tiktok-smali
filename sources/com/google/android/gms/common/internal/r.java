package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class r {
    static {
        Covode.recordClassIndex(31422);
    }

    public static <T> T a(T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    public static void b(String str) {
        if (!com.google.android.gms.common.util.r.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static void c(String str) {
        if (com.google.android.gms.common.util.r.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(Handler handler) {
        String str;
        if (Looper.myLooper() != null) {
            str = Looper.myLooper().getThread().getName();
        } else {
            str = "null current looper";
        }
        String name = handler.getLooper().getThread().getName();
        a(handler, new StringBuilder(String.valueOf(name).length() + 36 + String.valueOf(str).length()).append("Must be called on ").append(name).append(" thread, but got ").append(str).append(".").toString());
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(a.a(str, objArr));
        }
    }
}
