package com.bytedance.common.wschannel.server;

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
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class h {
    static {
        Covode.recordClassIndex(16100);
    }

    public enum a {
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

        static {
            Covode.recordClassIndex(16101);
        }

        private a(int i2) {
            this.nativeInt = i2;
        }
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
            if (a2 == null || !a2.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
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

    public static a b(Context context) {
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
            if (telephonyManager == null) {
                return a.MOBILE;
            }
            if (a(telephonyManager) == 3 || a(telephonyManager) == 5 || a(telephonyManager) == 6 || a(telephonyManager) == 8 || a(telephonyManager) == 9 || a(telephonyManager) == 10 || a(telephonyManager) == 12 || a(telephonyManager) == 14 || a(telephonyManager) == 15) {
                return a.MOBILE_3G;
            }
            if (a(telephonyManager) == 13) {
                return a.MOBILE_4G;
            }
            return a.MOBILE;
        } catch (Throwable unused) {
            return a.MOBILE;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6191);
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
                    MethodCollector.o(6191);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
