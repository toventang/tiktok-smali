package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PreventServerSideCrashes implements w {

    /* renamed from: a  reason: collision with root package name */
    public static Activity f142570a;

    /* renamed from: b  reason: collision with root package name */
    static Field f142571b;

    /* renamed from: c  reason: collision with root package name */
    static Object f142572c;

    /* renamed from: d  reason: collision with root package name */
    static Object f142573d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f142574e;

    /* renamed from: f  reason: collision with root package name */
    private static CopyOnWriteArrayList<cl> f142575f = new CopyOnWriteArrayList<>();

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_utils_PreventServerSideCrashes_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_utils_PreventServerSideCrashes_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(93256);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static synchronized void c() {
        Field declaredField;
        synchronized (PreventServerSideCrashes.class) {
            MethodCollector.i(7444);
            if (f142574e) {
                MethodCollector.o(7444);
                return;
            }
            f142574e = true;
            if (!dh.f142821a) {
                try {
                    dh.a((Object) di.class, "target object must not be null");
                    Field a2 = dh.a(di.class.getClass(), "classLoader");
                    if (a2 != null) {
                        dh.a(a2, "The field must not be null");
                        if (!a2.isAccessible()) {
                            a2.setAccessible(true);
                        }
                        a2.set(di.class, null);
                    }
                } catch (Exception unused) {
                }
                dh.f142821a = true;
            }
            if (Build.VERSION.SDK_INT > 28) {
                MethodCollector.o(7444);
                return;
            }
            try {
                if (Build.VERSION.SDK_INT < 26) {
                    declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
                } else {
                    declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
                }
                declaredField.setAccessible(true);
                f142572c = declaredField.get(null);
                Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
                f142571b = declaredField2;
                declaredField2.setAccessible(true);
                Object obj = f142571b.get(f142572c);
                if (obj == null) {
                    MethodCollector.o(7444);
                    return;
                }
                Class<?> cls = Class.forName("android.app.IActivityManager");
                if (cls == null) {
                    MethodCollector.o(7444);
                    return;
                }
                f142573d = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new ga(obj));
                MethodCollector.o(7444);
            } catch (ClassNotFoundException unused2) {
                MethodCollector.o(7444);
            } catch (NoSuchFieldException unused3) {
                MethodCollector.o(7444);
            } catch (IllegalAccessException unused4) {
                MethodCollector.o(7444);
            }
        }
    }

    public static class a implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(93257);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public final void onActivityDestroyed(Activity activity) {
            if (Build.VERSION.SDK_INT <= 28) {
                PreventServerSideCrashes.f142570a = null;
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (Build.VERSION.SDK_INT <= 28) {
                PreventServerSideCrashes.f142570a = null;
            }
        }

        public final void onActivityResumed(Activity activity) {
            if (Build.VERSION.SDK_INT <= 28) {
                PreventServerSideCrashes.f142570a = activity;
                if (!(activity == null || TextUtils.isEmpty("mStartedActivity"))) {
                    for (Class<?> cls = activity.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                        Field a2 = dh.a(cls, "mStartedActivity");
                        if (a2 != null) {
                            try {
                                a2.setAccessible(true);
                                a2.set(activity, true);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT <= 28) {
                a.b.f109011a.a("method_hook_ams_duration", false);
                PreventServerSideCrashes.f142570a = activity;
                PreventServerSideCrashes.c();
                if (PreventServerSideCrashes.f142571b != null) {
                    try {
                        PreventServerSideCrashes.f142571b.set(PreventServerSideCrashes.f142572c, PreventServerSideCrashes.f142573d);
                        PreventServerSideCrashes.f142571b = null;
                        PreventServerSideCrashes.f142572c = null;
                        PreventServerSideCrashes.f142573d = null;
                    } catch (IllegalAccessException unused) {
                    }
                }
                a.b.f109011a.b("method_hook_ams_duration", false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (Build.VERSION.SDK_INT <= 28) {
            c();
        }
    }

    private static Throwable a(Throwable th) {
        RuntimeException runtimeException;
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (th instanceof InvocationTargetException) {
                InvocationTargetException invocationTargetException = (InvocationTargetException) th;
                if (invocationTargetException.getTargetException() != null) {
                    th = invocationTargetException.getTargetException();
                    stackTrace = th.getStackTrace();
                } else {
                    runtimeException = new RuntimeException();
                    th = runtimeException;
                }
            } else if (th instanceof UndeclaredThrowableException) {
                UndeclaredThrowableException undeclaredThrowableException = (UndeclaredThrowableException) th;
                if (undeclaredThrowableException.getUndeclaredThrowable() != null) {
                    th = undeclaredThrowableException.getUndeclaredThrowable();
                    stackTrace = th.getStackTrace();
                } else {
                    runtimeException = new RuntimeException();
                    th = runtimeException;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.contains("com.ss.android.ugc.aweme.utils.PreventServerSideCrashes") && !className.equals(Proxy.class.getName()) && !className.equals(Method.class.getName()))) {
                        arrayList.add(stackTraceElement);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return th;
            }
            int size = arrayList.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
            for (int i2 = 0; i2 < size; i2++) {
                stackTraceElementArr[i2] = (StackTraceElement) arrayList.get(i2);
            }
            th.setStackTrace(stackTraceElementArr);
            return th;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object a(java.lang.Object r4, java.lang.reflect.Method r5, java.lang.Object[] r6) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.PreventServerSideCrashes.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
