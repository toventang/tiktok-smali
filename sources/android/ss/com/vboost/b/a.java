package android.ss.com.vboost.b;

import android.os.Build;
import android.ss.com.vboost.e.b;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

class a {

    /* renamed from: a  reason: collision with root package name */
    static boolean f402a;

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f403b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f404c;

    /* renamed from: d  reason: collision with root package name */
    private static Object f405d;

    static {
        Covode.recordClassIndex(13);
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "android_ss_com_vboost_hardware_CHRYBoostFramework_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "android_ss_com_vboost_hardware_CHRYBoostFramework_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    a() {
        synchronized (a.class) {
            if (!f402a) {
                try {
                    if (Build.VERSION.SDK_INT == 29) {
                        f403b = b.a("android.scrollerboostmanager.ScrollerBoostManager");
                        f404c = b.a(f403b, "listFling", Integer.TYPE);
                    } else if (Build.VERSION.SDK_INT == 28 || Build.VERSION.SDK_INT == 27 || Build.VERSION.SDK_INT == 26) {
                        Class<?> a2 = b.a("android.iawareperf.UniPerf");
                        f403b = a2;
                        f404c = b.a(a2, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                    }
                } catch (Exception unused) {
                }
            }
        }
        try {
            if (f403b == null) {
                return;
            }
            if (Build.VERSION.SDK_INT == 29) {
                f405d = a(b.a(f403b, "getInstance", new Class[0]), f403b, new Object[0]);
                a(b.a(f403b, "init", new Class[0]), f405d, new Object[0]);
                f402a = true;
            } else if (Build.VERSION.SDK_INT == 28 || Build.VERSION.SDK_INT == 27 || Build.VERSION.SDK_INT == 26) {
                f405d = a(b.a(f403b, "getInstance", new Class[0]), null, new Object[0]);
                f402a = true;
            }
        } catch (Exception unused2) {
        }
    }

    static int a(long j2) {
        try {
            if (Build.VERSION.SDK_INT == 29) {
                a(f404c, f405d, new Object[]{Integer.valueOf((int) j2)});
                return -1;
            } else if (Build.VERSION.SDK_INT != 28 && Build.VERSION.SDK_INT != 27 && Build.VERSION.SDK_INT != 26) {
                return -1;
            } else {
                return ((Integer) a(f404c, f405d, new Object[]{4099, "canBoost=true|screenOn=1", new int[0]})).intValue();
            }
        } catch (Throwable th) {
            th.getMessage();
            return -1;
        }
    }
}
