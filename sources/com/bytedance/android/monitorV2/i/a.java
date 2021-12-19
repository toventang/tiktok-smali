package com.bytedance.android.monitorV2.i;

import android.util.Pair;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.l.i;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Method> f23996a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f23997b = false;

    private static Object a(Method method, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitorV2_logger_ALogUtil_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(null, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{null, objArr}, "com_bytedance_android_monitorV2_logger_ALogUtil_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(14146);
    }

    private static boolean a() {
        if (f23997b) {
            return true;
        }
        try {
            Method a2 = i.a(Class.forName("com.ss.android.agilelogger.ALog"), "isInitSuccess", (Class<?>[]) null);
            a2.setAccessible(true);
            f23997b = ((Boolean) a(a2, (Object[]) null)).booleanValue();
        } catch (ClassNotFoundException unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        return f23997b;
    }

    private static Method a(String str) {
        HashMap<String, Method> hashMap = f23996a;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str);
        }
        Method b2 = b(str);
        hashMap.put(str, b2);
        return b2;
    }

    private static Method b(String str) {
        try {
            return i.a(Class.forName("com.ss.android.agilelogger.ALog"), str, (Class<?>[]) new Class[]{String.class, String.class});
        } catch (ClassNotFoundException unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    static boolean a(String str, String str2) {
        return a(a("d"), str, str2);
    }

    static boolean b(String str, String str2) {
        return a(a("i"), str, str2);
    }

    static boolean c(String str, String str2) {
        return a(a("e"), str, str2);
    }

    private static boolean a(Method method, String str, String str2) {
        if (a() && method != null) {
            try {
                a(method, new Object[]{str, str2});
                return true;
            } catch (Throwable unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        }
        return false;
    }
}
