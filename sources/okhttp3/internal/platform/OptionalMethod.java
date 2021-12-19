package okhttp3.internal.platform;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class OptionalMethod<T> {
    private final String methodName;
    private final Class[] methodParams;
    private final Class<?> returnType;

    static {
        Covode.recordClassIndex(106309);
    }

    private static Object okhttp3_internal_platform_OptionalMethod_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_OptionalMethod_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "okhttp3_internal_platform_OptionalMethod_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public boolean isSupported(T t) {
        if (getMethod(t.getClass()) != null) {
            return true;
        }
        return false;
    }

    private Method getMethod(Class<?> cls) {
        Class<?> cls2;
        String str = this.methodName;
        if (str == null) {
            return null;
        }
        Method publicMethod = getPublicMethod(cls, str, this.methodParams);
        if (publicMethod == null || (cls2 = this.returnType) == null || cls2.isAssignableFrom(publicMethod.getReturnType())) {
            return publicMethod;
        }
        return null;
    }

    public Object invokeOptional(T t, Object... objArr) {
        Method method = getMethod(t.getClass());
        if (method == null) {
            return null;
        }
        try {
            return okhttp3_internal_platform_OptionalMethod_java_lang_reflect_Method_invoke(method, t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object invokeOptionalWithoutCheckedException(T t, Object... objArr) {
        try {
            return invokeOptional(t, objArr);
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

    public Object invokeWithoutCheckedException(T t, Object... objArr) {
        try {
            return invoke(t, objArr);
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

    public Object invoke(T t, Object... objArr) {
        Method method = getMethod(t.getClass());
        if (method != null) {
            try {
                return okhttp3_internal_platform_OptionalMethod_java_lang_reflect_Method_invoke(method, t, objArr);
            } catch (IllegalAccessException e2) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(method)));
                assertionError.initCause(e2);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.methodName + " not supported for object " + ((Object) t));
        }
    }

    OptionalMethod(Class<?> cls, String str, Class... clsArr) {
        this.returnType = cls;
        this.methodName = str;
        this.methodParams = clsArr;
    }

    private static Method getPublicMethod(Class<?> cls, String str, Class[] clsArr) {
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
