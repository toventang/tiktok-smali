package com.bytedance.framwork.core.b.e;

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
import java.lang.reflect.Field;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static a f29474a = a.UNKNOWN;

    public enum a {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        public final boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }

        public final boolean is2G() {
            if (this == MOBILE || this == MOBILE_2G) {
                return true;
            }
            return false;
        }

        public final boolean isAvailable() {
            if (this == UNKNOWN || this == NONE) {
                return false;
            }
            return true;
        }

        static {
            Covode.recordClassIndex(17170);
        }

        private a(int i2) {
            this.nativeInt = i2;
        }
    }

    static {
        Covode.recordClassIndex(17169);
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static boolean a(Context context) {
        try {
            NetworkInfo a2 = a((ConnectivityManager) a(context, "connectivity"));
            if (a2 == null || !a2.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public static a b(Context context) {
        int i2;
        try {
            NetworkInfo a2 = a((ConnectivityManager) a(context, "connectivity"));
            if (a2 == null || !a2.isAvailable()) {
                return a.NONE;
            }
            int type = a2.getType();
            if (1 == type) {
                return a.WIFI;
            }
            if (type != 0) {
                return a.MOBILE;
            }
            TelephonyManager telephonyManager = (TelephonyManager) a(context, "phone");
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
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                case 15:
                    return a.MOBILE_3G;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                    return a.MOBILE_4G;
            }
            return a.MOBILE;
        } catch (Throwable unused) {
            return a.MOBILE;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(12070);
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
                    MethodCollector.o(12070);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
