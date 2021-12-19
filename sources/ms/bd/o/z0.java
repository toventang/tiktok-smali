package ms.bd.o;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class z0 extends b.a {
    static {
        Covode.recordClassIndex(105977);
    }

    z0() {
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "ms_bd_o_z0_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "ms_bd_o_z0_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8108);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                    MethodCollector.o(8108);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        Boolean bool;
        MethodCollector.i(8106);
        Context context = a.f159493a.f159494b;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) a(context, (String) h.a(16777217, 0, 0, "8eac93", new byte[]{42, 104, 28, 25, 3, 39, 47, 77, 38, 58, 61, 126}));
                Method declaredMethod = connectivityManager.getClass().getDeclaredMethod((String) h.a(16777217, 0, 0, "5f1994", new byte[]{35, 97, 86, 108, 5, 55, 63, 81, 101, 71, 33, 112, 85, 66, 20, 40, 31, 73, 102, 102}), new Class[0]);
                declaredMethod.setAccessible(true);
                NetworkInfo networkInfo = (NetworkInfo) a(declaredMethod, connectivityManager, new Object[0]);
                if (networkInfo != null) {
                    Method declaredMethod2 = networkInfo.getClass().getDeclaredMethod((String) h.a(16777217, 0, 0, "726998", new byte[]{47, 35, 100, 91, 7, 38, 56, 18, 101, 101, 35}), new Class[0]);
                    declaredMethod2.setAccessible(true);
                    bool = Boolean.valueOf(((Boolean) a(declaredMethod2, networkInfo, new Object[0])).booleanValue());
                    MethodCollector.o(8106);
                    return bool;
                }
            } catch (Throwable unused) {
            }
        }
        bool = Boolean.FALSE;
        MethodCollector.o(8106);
        return bool;
    }
}
