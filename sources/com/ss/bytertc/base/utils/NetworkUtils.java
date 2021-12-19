package com.ss.bytertc.base.utils;

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
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.playerkit.model.v;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Pattern;

public class NetworkUtils {
    private static NetworkTypeInterceptor sNetworkTypeInterceptor;

    public interface NetworkTypeInterceptor {
        static {
            Covode.recordClassIndex(100728);
        }

        NetworkType getNetworkType();
    }

    static {
        Covode.recordClassIndex(100724);
    }

    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        public final boolean isAvailable() {
            if (this != NONE) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(100727);
        }

        private NetworkType(int i2) {
            this.nativeInt = i2;
        }
    }

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        static {
            Covode.recordClassIndex(100726);
        }

        private CompressType(int i2) {
            this.nativeInt = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.base.utils.NetworkUtils$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 100725(0x18975, float:1.41146E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType[] r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.bytertc.base.utils.NetworkUtils.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType = r2
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.WIFI     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.bytertc.base.utils.NetworkUtils.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.bytertc.base.utils.NetworkUtils.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.bytertc.base.utils.NetworkUtils.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.bytertc.base.utils.NetworkUtils.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.MOBILE_5G     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.ss.bytertc.base.utils.NetworkUtils.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x004f }
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.MOBILE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.base.utils.NetworkUtils.AnonymousClass1.<clinit>():void");
        }
    }

    public static void setNetworkTypeInterceptor(NetworkTypeInterceptor networkTypeInterceptor) {
        sNetworkTypeInterceptor = networkTypeInterceptor;
    }

    public static boolean isIpv4(String str) {
        return Pattern.matches("^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$", str);
    }

    public static boolean isIpv6(String str) {
        return Pattern.matches("^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$", str);
    }

    public static Context com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static NetworkInfo com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context));
    }

    public static boolean is2G(Context context) {
        NetworkType networkType = getNetworkType(context);
        if (networkType == NetworkType.MOBILE || networkType == NetworkType.MOBILE_2G) {
            return true;
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo((ConnectivityManager) com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity"));
            if (com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo == null || !com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public static int com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_telephony_TelephonyManagerLancet_getNetworkType(TelephonyManager telephonyManager) {
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

    public static String getNetworkAccessType(NetworkType networkType) {
        try {
            switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType[networkType.ordinal()]) {
                case 1:
                    return "wifi";
                case 2:
                    return "2g";
                case 3:
                    return "3g";
                case 4:
                    return "4g";
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return "5g";
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return "mobile";
                default:
                    return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean isWifi(Context context) {
        try {
            NetworkInfo com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo((ConnectivityManager) com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity"));
            if (com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo != null) {
                if (com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                    NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
                    if (networkTypeInterceptor == null || networkTypeInterceptor.getNetworkType() == NetworkType.NONE) {
                        if (1 == com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.getType()) {
                            return true;
                        }
                    } else if (sNetworkTypeInterceptor.getNetworkType() == NetworkType.WIFI) {
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

    public static NetworkType getNetworkType(Context context) {
        NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
        if (networkTypeInterceptor != null && networkTypeInterceptor.getNetworkType() != NetworkType.NONE) {
            return sNetworkTypeInterceptor.getNetworkType();
        }
        try {
            NetworkInfo com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo((ConnectivityManager) com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity"));
            if (com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo == null || !com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                return NetworkType.NONE;
            }
            int type = com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.getType();
            if (1 == type) {
                return NetworkType.WIFI;
            }
            if (type != 0) {
                return NetworkType.MOBILE;
            }
            switch (com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_telephony_TelephonyManagerLancet_getNetworkType((TelephonyManager) com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "phone"))) {
                case 0:
                    return NetworkType.UNKNOWN;
                case 1:
                case 2:
                case 4:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                case 16:
                    return NetworkType.MOBILE_2G;
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_SELECT_SCENE:
                case 15:
                case 17:
                    return NetworkType.MOBILE_3G;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    return NetworkType.MOBILE_4G;
                case 19:
                default:
                    return NetworkType.UNKNOWN;
                case v.U:
                    return NetworkType.MOBILE_5G;
            }
        } catch (Throwable unused) {
            return NetworkType.UNKNOWN;
        }
    }

    public static void unregisterReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null && context != null) {
            com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context).unregisterReceiver(broadcastReceiver);
        }
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static void registerReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), broadcastReceiver, intentFilter);
        }
    }

    public static Object com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(7361);
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
                    MethodCollector.o(7361);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String format(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            String encode = encode((String) pair.first, str);
            String str3 = (String) pair.second;
            if (str3 != null) {
                str2 = encode(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(encode);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }

    public static Intent com_ss_bytertc_base_utils_NetworkUtils_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    public static android.content.Intent com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = com_ss_bytertc_base_utils_NetworkUtils_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.base.utils.NetworkUtils.com_ss_bytertc_base_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
