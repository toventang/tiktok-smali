package ms.bd.o;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class e1 extends b.a {
    static {
        Covode.recordClassIndex(105901);
    }

    e1() {
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9691);
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
                    MethodCollector.o(9691);
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
        String str2;
        Object trim;
        Object invoke;
        MethodCollector.i(9359);
        try {
            Context applicationContext = a.f159493a.f159494b.getApplicationContext();
            if (a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = a.f107166a;
                }
            }
            WifiInfo connectionInfo = ((WifiManager) a(applicationContext, (String) h.a(16777217, 0, 0, "6fdb41", new byte[]{48, 109, 17, 31}))).getConnectionInfo();
            Method declaredMethod = connectionInfo.getClass().getDeclaredMethod(new String(c0.a((String) h.a(16777217, 0, 0, "67166b", new byte[]{113, 98, 20, 23, 94, 33, 97, 79, 55, 54, 115, 100, 20, 22, 95, 33, 98, 68, 54, 51, 112, 102, 21, 17}))), new Class[0]);
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(declaredMethod, new Object[]{connectionInfo, objArr}, 110000, "java.lang.Object", true, "ms_bd_o_e1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                invoke = a2.second;
            } else {
                invoke = declaredMethod.invoke(connectionInfo, objArr);
                com.bytedance.helios.sdk.a.a(invoke, declaredMethod, new Object[]{connectionInfo, objArr}, "ms_bd_o_e1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            }
            str2 = Integer.toString(((Integer) invoke).intValue());
        } catch (Throwable unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            trim = h.a(16777217, 0, 0, "3813bd", new byte[]{114});
        } else {
            trim = str2.trim();
        }
        MethodCollector.o(9359);
        return trim;
    }
}
