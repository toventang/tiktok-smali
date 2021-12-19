package com.bytedance.sysoptimizer.java;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public final class BinderServiceWrapperProtector {
    public static final AdminResult VOID_ADMIN_RESULT = new VoidAdminResult();
    public static boolean sDebug;

    public interface AdminResult {
        static {
            Covode.recordClassIndex(27019);
        }

        Object getDefaultResult(Object obj, Method method, Object[] objArr);
    }

    public static int com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(27017);
    }

    public static void setDebug(boolean z) {
        sDebug = z;
    }

    public static Object com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(12232);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(12232);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static final class VoidAdminResult implements AdminResult {
        static {
            Covode.recordClassIndex(27020);
        }

        @Override // com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.AdminResult
        public final Object getDefaultResult(Object obj, Method method, Object[] objArr) {
            return 1;
        }
    }

    private static void setProxy(Object obj, Object obj2, Field field, String str) {
        try {
            field.set(obj2, obj);
        } catch (Throwable th) {
            com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_LogLancet_e(str, "setProxy error: " + Log.getStackTraceString(th));
        }
    }

    public static boolean install(Context context, String str, final List<String> list, final String str2, final AdminResult adminResult) {
        try {
            Object com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService = com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, str);
            if (com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService == null) {
                return false;
            }
            Field declaredField = com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService.getClass().getDeclaredField("mService");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService);
            if (obj == null) {
                return false;
            }
            com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_LogLancet_d(str2, "before ".concat(String.valueOf(obj)));
            setProxy(Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
                /* class com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(27018);
                }

                public static int com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
                    return 0;
                }

                public static int com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
                    return 0;
                }

                private static Object com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
                    Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        return a2.second;
                    }
                    Object invoke = method.invoke(obj, objArr);
                    a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                }

                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    String name = method.getName();
                    if (list.contains(name)) {
                        try {
                            if (BinderServiceWrapperProtector.sDebug) {
                                com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_com_ss_android_ugc_aweme_lancet_LogLancet_d(str2, "protect ".concat(String.valueOf(name)));
                            }
                            return com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke(method, obj, objArr);
                        } catch (Throwable th) {
                            com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_com_ss_android_ugc_aweme_lancet_LogLancet_e(str2, "get result failed: " + Log.getStackTraceString(th));
                            AdminResult adminResult = adminResult;
                            if (adminResult != null) {
                                return adminResult.getDefaultResult(obj, method, objArr);
                            }
                        }
                    }
                    return com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke(method, obj, objArr);
                }
            }), com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService, declaredField, str2);
            com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_LogLancet_d(str2, "install done " + declaredField.get(com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService));
            return true;
        } catch (Throwable th) {
            com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector_com_ss_android_ugc_aweme_lancet_LogLancet_e(str2, "install error: " + Log.getStackTraceString(th));
            return false;
        }
    }
}
