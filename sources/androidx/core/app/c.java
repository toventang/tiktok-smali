package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class c {
    static {
        Covode.recordClassIndex(656);
    }

    public static IBinder a(Bundle bundle, String str) {
        int i2 = Build.VERSION.SDK_INT;
        return bundle.getBinder(str);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Method f2134a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f2135b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f2136c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2137d;

        static {
            Covode.recordClassIndex(657);
        }

        public static IBinder a(Bundle bundle, String str) {
            if (!f2135b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f2134a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2135b = true;
            }
            Method method2 = f2134a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f2134a = null;
                }
            }
            return null;
        }

        public static void a(Bundle bundle, String str, IBinder iBinder) {
            if (!f2137d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f2136c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2137d = true;
            }
            Method method2 = f2136c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f2136c = null;
                }
            }
        }
    }

    public static void a(Bundle bundle, String str, IBinder iBinder) {
        int i2 = Build.VERSION.SDK_INT;
        bundle.putBinder(str, iBinder);
    }
}
