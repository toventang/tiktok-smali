package com.bytedance.common.utility;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.playerkit.model.v;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static b f26949a;

    /* renamed from: b  reason: collision with root package name */
    static a f26950b = a.UNKNOWN;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f26951c;

    /* renamed from: d  reason: collision with root package name */
    private static long f26952d;

    public interface b {
        static {
            Covode.recordClassIndex(15915);
        }

        a a();
    }

    public static boolean a(int i2) {
        return i2 > 4900 && i2 < 5900;
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
            Covode.recordClassIndex(15914);
        }

        private a(int i2) {
            this.nativeInt = i2;
        }
    }

    static {
        Covode.recordClassIndex(15913);
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static a c(Context context) {
        g(context);
        h(context);
        return f26950b;
    }

    public static String f(Context context) {
        return a(a(context));
    }

    private static Context j(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private static void h(Context context) {
        if (System.currentTimeMillis() - f26952d > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            f26950b = a(context);
            f26952d = System.currentTimeMillis();
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

    private static void g(Context context) {
        b bVar = f26949a;
        if (bVar == null || bVar.a() == a.NONE) {
            i(context);
            if (f26950b == a.UNKNOWN) {
                f26950b = a(context);
                return;
            }
            return;
        }
        f26950b = f26949a.a();
    }

    private static void i(Context context) {
        if (!f26951c && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            b(j(context), new k(), intentFilter);
            f26951c = true;
        }
    }

    public static a a(Context context) {
        if (j.f107224c != a.UNKNOWN && j.b() && !j.c()) {
            return j.f107224c;
        }
        a d2 = d(context);
        j.f107224c = d2;
        return d2;
    }

    public static boolean b(Context context) {
        try {
            NetworkInfo a2 = a((ConnectivityManager) a(context, "connectivity"));
            if (a2 != null) {
                if (a2.isAvailable()) {
                    b bVar = f26949a;
                    if (bVar == null || bVar.a() == a.NONE) {
                        if (1 == a2.getType()) {
                            return true;
                        }
                    } else if (f26949a.a() == a.WIFI) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static a d(Context context) {
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
            int a3 = a((TelephonyManager) a(context, "phone"));
            if (a3 != 3) {
                if (a3 == 20) {
                    return a.MOBILE_5G;
                }
                if (!(a3 == 5 || a3 == 6)) {
                    switch (a3) {
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            break;
                        default:
                            switch (a3) {
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

    public static String e(Context context) {
        boolean z;
        try {
            NetworkInfo a2 = a((ConnectivityManager) a(context, "connectivity"));
            if (a2 == null || !a2.isAvailable()) {
                return "none";
            }
            int type = a2.getType();
            if (1 == type) {
                if (Build.VERSION.SDK_INT >= 21) {
                    z = a(((WifiManager) a(j(context), "wifi")).getConnectionInfo().getFrequency());
                } else {
                    z = false;
                }
                if (z) {
                    return "wifi5g";
                }
                return "wifi";
            } else if (type != 0) {
                return "unknown";
            } else {
                TelephonyManager telephonyManager = (TelephonyManager) a(context, "phone");
                switch (a(telephonyManager)) {
                    case 1:
                        return "gprs";
                    case 2:
                        return "edge";
                    case 3:
                        return "umts";
                    case 4:
                        return "cdma";
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        return "evdo_0";
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        return "evdo_a";
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        return "1xrtt";
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        return "hsdpa";
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        return "hsupa";
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        return "hspa";
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        return "iden";
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        return "evdo_b";
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        return "lte";
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        return "ehrpd";
                    case 15:
                        return "hspap";
                    case 16:
                        return "gsm";
                    case 17:
                        return "td_scdma";
                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                    default:
                        return String.valueOf(a(telephonyManager));
                    case 19:
                        return "lte_ca";
                    case v.U /*{ENCODED_INT: 20}*/:
                        return "nr";
                }
            }
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String a(a aVar) {
        if (aVar == a.WIFI) {
            return "wifi";
        }
        if (aVar == a.WIFI_24GHZ) {
            return "wifi24ghz";
        }
        if (aVar == a.WIFI_5GHZ) {
            return "wifi5ghz";
        }
        if (aVar == a.MOBILE_2G) {
            return "2g";
        }
        if (aVar == a.MOBILE_3G) {
            return "3g";
        }
        if (aVar == a.MOBILE_3G_H) {
            return "3gh";
        }
        if (aVar == a.MOBILE_3G_HP) {
            return "3ghp";
        }
        if (aVar == a.MOBILE_4G) {
            return "4g";
        }
        if (aVar == a.MOBILE_5G) {
            return "5g";
        }
        if (aVar == a.MOBILE) {
            return "mobile";
        }
        return "";
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2063);
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
                    MethodCollector.o(2063);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static String a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String a(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            String a2 = a((String) pair.first, str);
            String str3 = (String) pair.second;
            if (str3 != null) {
                str2 = a(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a2);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.l.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
