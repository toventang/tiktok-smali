package com.ss.mediakit.net;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
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

public class NetUtils {
    static {
        Covode.recordClassIndex(101173);
    }

    public static NetworkInfo com_ss_mediakit_net_NetUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        try {
            return com_ss_mediakit_net_NetUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo((ConnectivityManager) com_ss_mediakit_net_NetUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long getNetId(Network network) {
        if (network == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return (long) Integer.parseInt(network.toString());
    }

    public static int getNetType(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo != null && networkInfo.isAvailable()) {
                return networkInfo.getType();
            }
        } catch (Throwable unused) {
        }
        return -1;
    }

    public static Object com_ss_mediakit_net_NetUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(5528);
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
                    MethodCollector.o(5528);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
