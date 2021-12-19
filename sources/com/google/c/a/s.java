package com.google.c.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f53704a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f53705b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f53706c;

    private static Object a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Method a2;
        Covode.recordClassIndex(33262);
        Object a3 = a();
        f53704a = a3;
        Method method = null;
        if (a3 == null) {
            a2 = null;
        } else {
            a2 = a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f53705b = a2;
        if (a3 != null) {
            method = b();
        }
        f53706c = method;
    }

    private static Method b() {
        try {
            Method a2 = a("getStackTraceDepth", Throwable.class);
            if (a2 == null) {
                return null;
            }
            Object a3 = a();
            Object[] objArr = {new Throwable()};
            Pair<Boolean, Object> a4 = a.a(a2, new Object[]{a3, objArr}, 110000, "java.lang.Object", true, "com_google_common_base_Throwables_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a4.first).booleanValue()) {
                Object obj = a4.second;
            } else {
                a.a(a2.invoke(a3, objArr), a2, new Object[]{a3, objArr}, "com_google_common_base_Throwables_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            return a2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void a(Throwable th) {
        k.a(th);
        if (th instanceof RuntimeException) {
            throw th;
        } else if (th instanceof Error) {
            throw th;
        }
    }

    private static Method a(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <X extends Throwable> void a(Throwable th, Class<X> cls) {
        if (th != null) {
            k.a(th);
            if (!cls.isInstance(th)) {
                a(th);
                return;
            }
            throw cls.cast(th);
        }
    }
}
