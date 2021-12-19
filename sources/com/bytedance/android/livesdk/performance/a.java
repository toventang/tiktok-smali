package com.bytedance.android.livesdk.performance;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static BatteryManager f20196a;

    /* renamed from: b  reason: collision with root package name */
    private static IntentFilter f20197b = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static {
        Covode.recordClassIndex(11921);
    }

    public static double b(Context context) {
        if (!c(context)) {
            return -1.0d;
        }
        double longProperty = (double) a(context).getLongProperty(5);
        Double.isNaN(longProperty);
        return (longProperty * 1.0d) / 1000000.0d;
    }

    static boolean c(Context context) {
        if (Build.VERSION.SDK_INT < 21 || context == null || a(context) == null) {
            return false;
        }
        return true;
    }

    static BatteryManager a(Context context) {
        MethodCollector.i(10710);
        if (f20196a == null) {
            synchronized (a.class) {
                try {
                    if (f20196a == null) {
                        if (Build.VERSION.SDK_INT < 21) {
                            return null;
                        }
                        f20196a = (BatteryManager) a(context, "batterymanager");
                    }
                } finally {
                    MethodCollector.o(10710);
                }
            }
        }
        BatteryManager batteryManager = f20196a;
        MethodCollector.o(10710);
        return batteryManager;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10712);
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
                    MethodCollector.o(10712);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
