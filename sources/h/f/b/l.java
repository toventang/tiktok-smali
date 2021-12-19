package h.f.b;

import com.bytedance.covode.number.Covode;
import h.f;
import h.y;
import java.util.Arrays;

public class l {
    static {
        Covode.recordClassIndex(105223);
    }

    public static int a(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    private l() {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean a(Float f2, Float f3) {
        return f2 == null ? f3 == null : f3 != null && f2.floatValue() == f3.floatValue();
    }

    public static boolean a(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static void c() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void b() {
        throw a((Throwable) new NullPointerException());
    }

    public static void a() {
        throw a((Throwable) new f());
    }

    public static void a(Object obj) {
        if (obj == null) {
            b();
        }
    }

    private static void d(String str) {
        throw a((Throwable) new NullPointerException(e(str)));
    }

    private static void c(String str) {
        throw a((Throwable) new IllegalArgumentException(e(str)));
    }

    private static <T extends Throwable> T a(T t) {
        return (T) a((Throwable) t, l.class.getName());
    }

    private static void b(String str) {
        throw a((Throwable) new y(str));
    }

    private static String e(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        return "Parameter specified as non-null is null: method " + className + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void a(String str) {
        b("lateinit property " + str + " has not been initialized");
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            d(str);
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            c(str);
        }
    }

    public static String a(String str, Object obj) {
        return str + obj;
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw a((Throwable) new NullPointerException(str + " must not be null"));
        }
    }

    static <T extends Throwable> T a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw a((Throwable) new IllegalStateException(str + " must not be null"));
        }
    }

    public static boolean a(float f2, Float f3) {
        if (f3 == null || f2 != f3.floatValue()) {
            return false;
        }
        return true;
    }
}
