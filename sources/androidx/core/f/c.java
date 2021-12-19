package androidx.core.f;

import android.icu.util.ULocale;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2366a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2367b;

    static {
        Covode.recordClassIndex(754);
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f2366a = cls.getMethod("getScript", String.class);
                    f2367b = cls.getMethod("addLikelySubtags", String.class);
                }
            } catch (Exception unused) {
                f2366a = null;
                f2367b = null;
            }
        } else if (Build.VERSION.SDK_INT < 24) {
            try {
                f2367b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    private static String a(String str) {
        try {
            Method method = f2366a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    private static String b(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f2367b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f2367b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        } else {
            String b2 = b(locale);
            if (b2 != null) {
                return a(b2);
            }
            return null;
        }
    }
}
