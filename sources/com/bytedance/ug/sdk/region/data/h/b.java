package com.bytedance.ug.sdk.region.data.h;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class b {
    static {
        Covode.recordClassIndex(27904);
    }

    public static String a() {
        try {
            return Resources.getSystem().getConfiguration().locale.getCountry();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(Context context) {
        try {
            return ((TelephonyManager) a(context, "phone")).getSimCountryIso();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(Context context) {
        try {
            return ((TelephonyManager) a(context, "phone")).getNetworkCountryIso();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11167);
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
                    MethodCollector.o(11167);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
