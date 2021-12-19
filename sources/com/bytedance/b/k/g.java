package com.bytedance.b.k;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class g {
    static {
        Covode.recordClassIndex(15296);
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static int a(Context context) {
        NetworkInfo a2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a(context, "connectivity");
            if (b.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && (a2 = a(connectivityManager)) != null) {
                if (a2.isAvailable()) {
                    if (a2.getType() == 0) {
                        TelephonyManager telephonyManager = (TelephonyManager) a(context, "phone");
                        if (Build.VERSION.SDK_INT < 29) {
                            return telephonyManager.getNetworkType();
                        }
                        if (!com.ss.android.ugc.aweme.lancet.d.a.f107198a.getAndSet(true)) {
                            com.ss.android.ugc.aweme.lancet.d.a.a().a();
                        }
                        int i2 = com.ss.android.ugc.aweme.lancet.d.a.a().f107202b.get();
                        if (com.ss.android.ugc.aweme.lancet.d.a.f107200c || i2 != -1) {
                            return i2;
                        }
                        return 0;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return -10000;
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
