package com.squareup.a.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f57754a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57755b;

    /* renamed from: c  reason: collision with root package name */
    private final Class[] f57756c;

    static {
        Covode.recordClassIndex(35976);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_squareup_okhttp_internal_OptionalMethod_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_squareup_okhttp_internal_OptionalMethod_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private Method a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f57755b;
        if (str == null) {
            return null;
        }
        Method a2 = a(cls, str, this.f57756c);
        if (a2 == null || (cls2 = this.f57754a) == null || cls2.isAssignableFrom(a2.getReturnType())) {
            return a2;
        }
        return null;
    }

    public final boolean a(T t) {
        if (a(t.getClass()) != null) {
            return true;
        }
        return false;
    }

    private Object c(T t, Object... objArr) {
        Method a2 = a(t.getClass());
        if (a2 == null) {
            return null;
        }
        try {
            return a(a2, t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public final Object b(T t, Object... objArr) {
        try {
            return d(t, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw targetException;
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Object d(T t, Object... objArr) {
        Method a2 = a(t.getClass());
        if (a2 != null) {
            try {
                return a(a2, t, objArr);
            } catch (IllegalAccessException e2) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(a2)));
                assertionError.initCause(e2);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f57755b + " not supported for object " + ((Object) t));
        }
    }

    public final Object a(T t, Object... objArr) {
        try {
            return c(t, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw targetException;
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public g(Class<?> cls, String str, Class... clsArr) {
        this.f57754a = cls;
        this.f57755b = str;
        this.f57756c = clsArr;
    }

    private static Method a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }
}
