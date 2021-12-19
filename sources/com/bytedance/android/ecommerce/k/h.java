package com.bytedance.android.ecommerce.k;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f7141a;

    /* renamed from: b  reason: collision with root package name */
    private static b f7142b;

    /* renamed from: c  reason: collision with root package name */
    private static a f7143c = a.UNKNOWN;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f7144d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile long f7145e = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: f  reason: collision with root package name */
    private static long f7146f;

    public interface b {
        static {
            Covode.recordClassIndex(3439);
        }

        a a();
    }

    public enum a {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        
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

        public final boolean is4GOrHigher() {
            if (this == MOBILE_4G || this == MOBILE_5G) {
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

        public final boolean is3GOrHigher() {
            if (this == MOBILE_3G || this == MOBILE_3G_H || this == MOBILE_3G_HP || this == MOBILE_4G || this == MOBILE_5G) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(3438);
        }

        private a(int i2) {
            this.nativeInt = i2;
        }
    }

    static {
        Covode.recordClassIndex(3437);
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static a b(Context context) {
        if (f7141a) {
            return c(context);
        }
        return d(context);
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

    private static a c(Context context) {
        b bVar = f7142b;
        if (bVar == null || bVar.a() == a.NONE) {
            if (!f7144d && context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                b(applicationContext, new k(), intentFilter);
                f7144d = true;
            }
            if (f7143c == a.UNKNOWN) {
                f7143c = d(context);
            }
        } else {
            f7143c = f7142b.a();
        }
        if (System.currentTimeMillis() - f7146f > f7145e) {
            f7143c = d(context);
            f7146f = System.currentTimeMillis();
        }
        return f7143c;
    }

    private static a d(Context context) {
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
            if (androidx.core.app.a.a(context, "android.permission.READ_PHONE_STATE") != 0) {
                return a.UNKNOWN;
            }
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
            if (i2 != 3) {
                if (i2 == 20) {
                    return a.MOBILE_5G;
                }
                if (!(i2 == 5 || i2 == 6)) {
                    switch (i2) {
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            break;
                        default:
                            switch (i2) {
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                case 15:
                                    break;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                    return a.MOBILE_4G;
                                default:
                                    return a.MOBILE;
                            }
                    }
                }
            }
            return a.MOBILE_3G;
        } catch (Throwable unused) {
            return a.MOBILE;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6141);
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
                    MethodCollector.o(6141);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.k.h.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
