package com.ss.android.ugc.aweme.base.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68436a = k.class.getSimpleName();

    static {
        Covode.recordClassIndex(42137);
    }

    public static String a() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) b(d.a(), "phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getNetworkOperator();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int a(Context context) {
        String a2 = a(context, "-1");
        if ("46000".equals(a2) || "46002".equals(a2) || "46007".equals(a2)) {
            return 3;
        }
        if ("46001".equals(a2) || "46006".equals(a2) || "46009".equals(a2)) {
            return 2;
        }
        if ("46003".equals(a2) || "46005".equals(a2) || "46011".equals(a2)) {
            return 1;
        }
        return 0;
    }

    private static String a(Context context, String str) {
        if (context == null) {
            return str;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) b(context, "phone");
            if (telephonyManager == null) {
                return str;
            }
            return telephonyManager.getSimOperator();
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    private static Object b(Context context, String str) {
        Object obj;
        MethodCollector.i(2077);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(2077);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
