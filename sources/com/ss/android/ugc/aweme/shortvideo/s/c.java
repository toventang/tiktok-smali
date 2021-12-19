package com.ss.android.ugc.aweme.shortvideo.s;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class c {
    static {
        Covode.recordClassIndex(85402);
    }

    public static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    private static NetworkInfo b(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getNetworkInfo(1);
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static boolean b(Context context) {
        NetworkInfo a2;
        if (context == null || (a2 = a((ConnectivityManager) a(context, "connectivity"))) == null || !a2.isConnected()) {
            return false;
        }
        return true;
    }

    public static boolean c(Context context) {
        NetworkInfo b2;
        if (context == null || (b2 = b((ConnectivityManager) a(context, "connectivity"))) == null) {
            return false;
        }
        return b2.isAvailable();
    }

    public static boolean a(Context context) {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) a(context, "connectivity")).getAllNetworkInfo();
        if (allNetworkInfo != null) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7211);
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
                    MethodCollector.o(7211);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
