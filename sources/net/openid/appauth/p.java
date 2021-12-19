package net.openid.appauth;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class p {
    static {
        Covode.recordClassIndex(106102);
    }

    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static String b(String str, Object obj) {
        if (str != null) {
            a(str, obj);
        }
        return str;
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String a(String str, Object obj) {
        a((Object) str, obj);
        a(!TextUtils.isEmpty(str), obj);
        return str;
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
