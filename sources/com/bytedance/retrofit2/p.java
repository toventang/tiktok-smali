package com.bytedance.retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import l.m;

/* access modifiers changed from: package-private */
public class p {

    /* renamed from: a  reason: collision with root package name */
    static final p f42560a = b();

    /* renamed from: b  reason: collision with root package name */
    static final boolean f42561b = c();

    /* access modifiers changed from: package-private */
    public static class b extends p {
        static {
            Covode.recordClassIndex(26084);
        }

        static class a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            private static Object f42563a;

            /* renamed from: b  reason: collision with root package name */
            private static Method f42564b;

            a() {
            }

            static {
                Covode.recordClassIndex(26085);
                try {
                    Class<?> cls = Class.forName("org.robovm.apple.foundation.NSOperationQueue");
                    f42563a = cls.getDeclaredMethod("getMainQueue", new Class[0]).invoke(null, new Object[0]);
                    f42564b = cls.getDeclaredMethod("addOperation", Runnable.class);
                } catch (Exception e2) {
                    throw new AssertionError(e2);
                }
            }

            public final void execute(Runnable runnable) {
                try {
                    Method method = f42564b;
                    Object obj = f42563a;
                    Object[] objArr = {runnable};
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_retrofit2_Platform$IOS$MainThreadExecutor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        Object obj2 = a2.second;
                        return;
                    }
                    com.bytedance.helios.sdk.a.a(method.invoke(obj, objArr), method, new Object[]{obj, objArr}, "com_bytedance_retrofit2_Platform$IOS$MainThreadExecutor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                } catch (IllegalAccessException | IllegalArgumentException e2) {
                    throw new AssertionError(e2);
                } catch (InvocationTargetException e3) {
                    Throwable cause = e3.getCause();
                    if (cause instanceof RuntimeException) {
                        throw cause;
                    } else if (cause instanceof Error) {
                        throw cause;
                    } else {
                        throw new RuntimeException(cause);
                    }
                }
            }
        }

        b() {
        }

        @Override // com.bytedance.retrofit2.p
        public final Executor a() {
            return new a();
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.p
        public final c.a a(Executor executor) {
            return new i(executor);
        }
    }

    /* access modifiers changed from: package-private */
    public Executor a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public static class a extends p {
        static {
            Covode.recordClassIndex(26082);
        }

        a() {
        }

        /* renamed from: com.bytedance.retrofit2.p$a$a  reason: collision with other inner class name */
        static class ExecutorC1040a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            private final Handler f42562a = new Handler(Looper.getMainLooper());

            static {
                Covode.recordClassIndex(26083);
            }

            ExecutorC1040a() {
            }

            public final void execute(Runnable runnable) {
                this.f42562a.post(runnable);
            }
        }

        @Override // com.bytedance.retrofit2.p
        public final Executor a() {
            return new ExecutorC1040a();
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.p
        public final c.a a(Executor executor) {
            return new i(executor);
        }
    }

    p() {
    }

    private static boolean c() {
        try {
            new m.a();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(26081);
    }

    private static p b() {
        try {
            Class.forName("android.os.Build");
            int i2 = Build.VERSION.SDK_INT;
            return new a();
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("org.robovm.apple.foundation.NSObject");
                return new b();
            } catch (ClassNotFoundException unused2) {
                return new p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public c.a a(Executor executor) {
        if (executor != null) {
            return new i(executor);
        }
        return f.f42504a;
    }
}
