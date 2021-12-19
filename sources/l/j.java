package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import l.c;

/* access modifiers changed from: package-private */
public class j {

    /* renamed from: a  reason: collision with root package name */
    static final j f159290a = b();

    /* access modifiers changed from: package-private */
    public Executor a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean a(Method method) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public static class a extends j {
        static {
            Covode.recordClassIndex(105792);
        }

        a() {
        }

        @Override // l.j
        public final Executor a() {
            return new ExecutorC4196a();
        }

        /* renamed from: l.j$a$a  reason: collision with other inner class name */
        static class ExecutorC4196a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            private final Handler f159291a = new Handler(Looper.getMainLooper());

            static {
                Covode.recordClassIndex(105793);
            }

            ExecutorC4196a() {
            }

            public final void execute(Runnable runnable) {
                this.f159291a.post(runnable);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // l.j
        public final c.a a(Executor executor) {
            if (executor != null) {
                return new g(executor);
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends j {
        static {
            Covode.recordClassIndex(105794);
        }

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // l.j
        public final boolean a(Method method) {
            return method.isDefault();
        }

        /* access modifiers changed from: package-private */
        @Override // l.j
        public final Object a(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    j() {
    }

    static {
        Covode.recordClassIndex(105791);
    }

    private static j b() {
        try {
            Class.forName("android.os.Build");
            int i2 = Build.VERSION.SDK_INT;
            return new a();
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("java.util.Optional");
                return new b();
            } catch (ClassNotFoundException unused2) {
                return new j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public c.a a(Executor executor) {
        if (executor != null) {
            return new g(executor);
        }
        return f.f159237a;
    }

    /* access modifiers changed from: package-private */
    public Object a(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }
}
