package com.bytedance.sysoptimizer;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchActivityOptimizer {
    private static boolean initialized;
    public static Activity mActivity;
    public static CopyOnWriteArrayList<ExceptionCatcher> sExceptionCatchers = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(26989);
    }

    public static class LaunchActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(26992);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivityDestroyed(Activity activity) {
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT <= 28) {
                LaunchActivityOptimizer.mActivity = null;
            }
        }

        public void onActivityPaused(Activity activity) {
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT <= 28) {
                LaunchActivityOptimizer.mActivity = null;
            }
        }

        public void onActivityResumed(Activity activity) {
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT <= 28) {
                LaunchActivityOptimizer.mActivity = activity;
                LaunchActivityOptimizer.setStartedActivity(activity);
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT <= 28) {
                LaunchActivityOptimizer.mActivity = activity;
                LaunchActivityOptimizer.hookAMS(true);
            }
        }
    }

    public static void unRegisterExceptionCatcher(ExceptionCatcher exceptionCatcher) {
        if (exceptionCatcher != null) {
            sExceptionCatchers.remove(exceptionCatcher);
        }
    }

    public static class DeadException implements ExceptionCatcher {
        static {
            Covode.recordClassIndex(26991);
        }

        @Override // com.bytedance.sysoptimizer.ExceptionCatcher
        public boolean registerCondition() {
            return true;
        }

        @Override // com.bytedance.sysoptimizer.ExceptionCatcher
        public boolean analysis(Throwable th) {
            if (!(th instanceof InvocationTargetException)) {
                return false;
            }
            InvocationTargetException invocationTargetException = (InvocationTargetException) th;
            if ((invocationTargetException.getTargetException() instanceof DeadObjectException) || (invocationTargetException.getTargetException() instanceof DeadSystemException)) {
                return true;
            }
            return false;
        }
    }

    public static void registerExceptionCatcher(ExceptionCatcher exceptionCatcher) {
        if (exceptionCatcher != null && exceptionCatcher.registerCondition() && !sExceptionCatchers.contains(exceptionCatcher)) {
            sExceptionCatchers.add(exceptionCatcher);
        }
    }

    public static void setStartedActivity(Activity activity) {
        Field declaredField = getDeclaredField(activity, "mStartedActivity");
        if (declaredField != null) {
            try {
                declaredField.setAccessible(true);
                declaredField.set(activity, true);
            } catch (Exception unused) {
            }
        }
    }

    public static void hookAMS(boolean z) {
        Field declaredField;
        if (!initialized) {
            initialized = true;
            HackHelper.init();
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT <= 28) {
                try {
                    if (Build.VERSION.SDK_INT < 26) {
                        declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
                    } else {
                        declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
                    }
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(null);
                    Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
                    declaredField2.setAccessible(true);
                    final Object obj2 = declaredField2.get(obj);
                    if (obj2 != null) {
                        if (z) {
                            Class<?> cls = Class.forName("android.app.IActivityManager");
                            if (cls != null) {
                                declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new InvocationHandler() {
                                    /* class com.bytedance.sysoptimizer.LaunchActivityOptimizer.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(26990);
                                    }

                                    private static Object com_bytedance_sysoptimizer_LaunchActivityOptimizer$1_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
                                        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_sysoptimizer_LaunchActivityOptimizer$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                        if (((Boolean) a2.first).booleanValue()) {
                                            return a2.second;
                                        }
                                        Object invoke = method.invoke(obj, objArr);
                                        a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_sysoptimizer_LaunchActivityOptimizer$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                        return invoke;
                                    }

                                    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0069 */
                                    @Override // java.lang.reflect.InvocationHandler
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final java.lang.Object invoke(java.lang.Object r5, java.lang.reflect.Method r6, java.lang.Object[] r7) {
                                        /*
                                        // Method dump skipped, instructions count: 143
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sysoptimizer.LaunchActivityOptimizer.AnonymousClass1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
                                    }
                                }));
                                return;
                            }
                            return;
                        }
                        declaredField2.set(obj, obj);
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                }
            }
        }
    }

    public static Throwable getSafeThrowable(Throwable th) {
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

    public static Field getDeclaredField(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                Field field = HackHelper.getField(cls, str);
                if (field != null) {
                    return field;
                }
            }
        }
        return null;
    }
}
