package h.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.i.b;
import h.i.c;
import java.lang.reflect.Method;

public class a {
    static {
        Covode.recordClassIndex(105141);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h.d.a$a  reason: collision with other inner class name */
    public static final class C4186a {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f158677a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f158678b;

        /* renamed from: c  reason: collision with root package name */
        public static final C4186a f158679c = new C4186a();

        private C4186a() {
        }

        static {
            Method method;
            Method method2;
            Class<?> cls;
            Covode.recordClassIndex(105142);
            Method[] methods = Throwable.class.getMethods();
            l.b(methods, "");
            int length = methods.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                method = null;
                if (i3 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i3];
                l.b(method2, "");
                if (l.a((Object) method2.getName(), (Object) "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    l.b(parameterTypes, "");
                    l.d(parameterTypes, "");
                    if (parameterTypes.length == 1) {
                        cls = parameterTypes[0];
                    } else {
                        cls = null;
                    }
                    if (l.a(cls, Throwable.class)) {
                        break;
                    }
                }
                i3++;
            }
            f158677a = method2;
            int length2 = methods.length;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Method method3 = methods[i2];
                l.b(method3, "");
                if (l.a((Object) method3.getName(), (Object) "getSuppressed")) {
                    method = method3;
                    break;
                }
                i2++;
            }
            f158678b = method;
        }
    }

    public c a() {
        return new b();
    }

    public void a(Throwable th, Throwable th2) {
        l.d(th, "");
        l.d(th2, "");
        Method method = C4186a.f158677a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
