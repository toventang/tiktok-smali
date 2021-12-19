package com.ss.android.ugc.aweme.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import java.lang.reflect.Field;

public final class fe {

    /* renamed from: a  reason: collision with root package name */
    public static final fe f142904a = new fe();

    public enum a {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(93513);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    private fe() {
    }

    static {
        Covode.recordClassIndex(93512);
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static final boolean d(Context context) {
        l.d(context, "");
        a b2 = b(context);
        if (a.MOBILE_2G == b2 || a.MOBILE_3G == b2 || a.MOBILE_4G == b2 || a.MOBILE == b2) {
            return true;
        }
        return false;
    }

    public static final boolean a(Context context) {
        l.d(context, "");
        try {
            Object a2 = a(context, "connectivity");
            if (a2 != null) {
                NetworkInfo a3 = a((ConnectivityManager) a2);
                if (a3 == null || !a3.isAvailable()) {
                    return false;
                }
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean c(Context context) {
        l.d(context, "");
        try {
            Object a2 = a(context, "connectivity");
            if (a2 != null) {
                NetworkInfo a3 = a((ConnectivityManager) a2);
                if (a3 != null) {
                    if (a3.isAvailable()) {
                        if (1 == a3.getType()) {
                            return true;
                        }
                    }
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }

    public static final a b(Context context) {
        int i2;
        l.d(context, "");
        try {
            Object a2 = a(context, "connectivity");
            if (a2 != null) {
                NetworkInfo a3 = a((ConnectivityManager) a2);
                if (a3 == null || !a3.isAvailable()) {
                    return a.NONE;
                }
                int type = a3.getType();
                if (1 == type) {
                    return a.WIFI;
                }
                if (type != 0) {
                    return a.MOBILE;
                }
                Object a4 = a(context, "phone");
                if (a4 != null) {
                    TelephonyManager telephonyManager = (TelephonyManager) a4;
                    if (Build.VERSION.SDK_INT >= 29) {
                        if (!com.ss.android.ugc.aweme.lancet.d.a.f107198a.getAndSet(true)) {
                            com.ss.android.ugc.aweme.lancet.d.a.a().a();
                        }
                        i2 = com.ss.android.ugc.aweme.lancet.d.a.a().f107202b.get();
                        if (!com.ss.android.ugc.aweme.lancet.d.a.f107200c && i2 == -1) {
                            return a.MOBILE;
                        }
                    } else {
                        i2 = telephonyManager.getNetworkType();
                    }
                    switch (i2) {
                        case 1:
                        case 2:
                        case 4:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            return a.MOBILE_2G;
                        case 3:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        case ABRConfig.ABR_SELECT_SCENE:
                        case 15:
                            return a.MOBILE_3G;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            return a.MOBILE_4G;
                    }
                    return a.MOBILE;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Throwable unused) {
            return a.MOBILE;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(601);
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
                    MethodCollector.o(601);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
