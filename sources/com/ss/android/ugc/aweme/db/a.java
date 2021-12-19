package com.ss.android.ugc.aweme.db;

import android.util.Pair;
import android.view.Choreographer;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.cv;
import h.f.b.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79357a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static int f79358b = 4;

    /* renamed from: c  reason: collision with root package name */
    private static Choreographer f79359c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f79360d;

    /* renamed from: e  reason: collision with root package name */
    private static final Runnable f79361e = RunnableC1846a.f79366a;

    /* renamed from: f  reason: collision with root package name */
    private static Field f79362f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f79363g;

    /* renamed from: h  reason: collision with root package name */
    private static Method f79364h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f79365i;

    /* renamed from: com.ss.android.ugc.aweme.db.a$a  reason: collision with other inner class name */
    static final class RunnableC1846a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final RunnableC1846a f79366a = new RunnableC1846a();

        static {
            Covode.recordClassIndex(49273);
        }

        RunnableC1846a() {
        }

        public final void run() {
        }
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_ui_ChoreographerOptService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_ui_ChoreographerOptService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(49272);
    }

    public static boolean b() {
        Field field;
        Choreographer choreographer = f79359c;
        if (choreographer == null || (field = f79362f) == null) {
            return false;
        }
        try {
            Object obj = field.get(choreographer);
            if (obj != null) {
                return ((Boolean) obj).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception unused) {
            return false;
        }
    }

    private static void c() {
        if (cv.f89733c) {
            Field d2 = d();
            if (d2 == null) {
                d2 = e();
            }
            f79362f = d2;
        }
    }

    private static Field d() {
        try {
            Field field = Choreographer.class.getField("mCallbacksRunning");
            l.b(field, "");
            field.setAccessible(true);
            return field;
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method f() {
        try {
            Method declaredMethod = Class.forName("android.view.Choreographer").getDeclaredMethod("postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            l.b(declaredMethod, "");
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field e() {
        try {
            if (f79363g == null) {
                f79363g = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            }
            Method method = f79363g;
            if (method == null) {
                return null;
            }
            Object a2 = a(method, Choreographer.class, new Object[]{"mCallbacksRunning"});
            if (a2 != null) {
                Field field = (Field) a2;
                if (f79364h == null) {
                    f79364h = AccessibleObject.class.getDeclaredMethod("setAccessible", Boolean.TYPE);
                }
                Method method2 = f79364h;
                if (method2 == null) {
                    return null;
                }
                a(method2, field, new Object[]{true});
                return field;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Field");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        if (!f79365i) {
            f79365i = true;
            f79359c = Choreographer.getInstance();
            f79360d = f();
            while (true) {
                if (f79358b < 0) {
                    break;
                }
                try {
                    Method method = f79360d;
                    if (method == null) {
                        l.b();
                    }
                    a(method, f79359c, new Object[]{Integer.valueOf(f79358b), f79361e, null, 0});
                } catch (Exception unused) {
                    int i2 = f79358b;
                    if (i2 == 0) {
                        f79360d = null;
                    }
                    f79358b = i2 - 1;
                }
            }
            c();
        }
    }

    public static boolean a(Runnable runnable) {
        Method method;
        l.d(runnable, "");
        boolean z = false;
        if (!f79365i || (method = f79360d) == null) {
            return false;
        }
        try {
            a(method, f79359c, new Object[]{Integer.valueOf(f79358b), runnable, null, 0});
            z = true;
            return true;
        } catch (Throwable unused) {
            return z;
        }
    }
}
