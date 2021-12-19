package com.bytedance.sdk.b.f;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.b.a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f43607a;

    static {
        Covode.recordClassIndex(26695);
    }

    public static int a(Context context) {
        int b2 = b(context);
        if (!a.e() || b2 != 6) {
            return b2;
        }
        return 1;
    }

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    private static int a(TelephonyManager telephonyManager) {
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

    private static int b(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            com.bytedance.sdk.b.c.a.d("getNetworkType(Context context, boolean moreInfo):context == null");
            return 0;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a(c(context), "connectivity");
            if (!(Build.VERSION.SDK_INT < 23 || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null)) {
                if (networkCapabilities.hasTransport(0)) {
                    int d2 = d(context);
                    f43607a = d2;
                    return d2;
                } else if (networkCapabilities.hasTransport(1)) {
                    f43607a = 6;
                    return 6;
                }
            }
            NetworkInfo a2 = a(connectivityManager);
            if (a2 != null) {
                if (a2.getType() == 1) {
                    f43607a = 6;
                    return 6;
                } else if (a2.getType() == 0) {
                    int d3 = d(context);
                    f43607a = d3;
                    return d3;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.b.c.a.d(th.getMessage());
        }
        f43607a = -1;
        return -1;
    }

    private static int d(Context context) {
        switch (a((TelephonyManager) a(c(context), "phone"))) {
            case 1:
            case 2:
            case 4:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
            case 16:
                return 2;
            case 3:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
            case 15:
            case 17:
                return 3;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                return 4;
            default:
                return 1;
        }
    }

    public static boolean a(int i2) {
        if (a.e() && i2 == 6) {
            return true;
        }
        if (-1 == i2 || 6 == i2 || i2 == 0) {
            return false;
        }
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2446);
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
                    MethodCollector.o(2446);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
