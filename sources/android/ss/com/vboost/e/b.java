package android.ss.com.vboost.e;

import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f568a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f569b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f570c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f571d;

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "android_ss_com_vboost_utils_DoubleReflector_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "android_ss_com_vboost_utils_DoubleReflector_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(64);
        try {
            f568a = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            f569b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f570c = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            f571d = Class.class.getDeclaredMethod("forName", String.class);
        } catch (Throwable unused) {
        }
    }

    public static Class<?> a(String str) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29 && (method = f571d) != null) {
            Class<?> cls = (Class) a(method, (Object) null, new Object[]{str});
            if (cls != null) {
                return cls;
            }
        }
        return Class.forName(str);
    }

    public static Constructor a(Class<?> cls, Class<?>... clsArr) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29 && (method = f570c) != null) {
            Constructor constructor = (Constructor) a(method, cls, new Object[]{clsArr});
            if (constructor != null) {
                return constructor;
            }
        }
        return cls.getDeclaredConstructor(clsArr);
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29 && (method = f569b) != null) {
            Method method2 = (Method) a(method, cls, new Object[]{str, clsArr});
            if (method2 != null) {
                return method2;
            }
        }
        return cls.getDeclaredMethod(str, clsArr);
    }
}
