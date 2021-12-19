package com.bytedance.router.util;

import com.bytedance.covode.number.Covode;

public final class Logger {
    private static boolean sDebug;

    static {
        Covode.recordClassIndex(26204);
    }

    public static int com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_v(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public static boolean isDebug() {
        return sDebug;
    }

    public static void setDebug(boolean z) {
        sDebug = z;
    }

    public static void d(String str) {
        d("SmartRouter", str);
    }

    public static void e(String str) {
        e("SmartRouter", str);
    }

    public static void i(String str) {
        i("SmartRouter", str);
    }

    public static void v(String str) {
        v("SmartRouter", str);
    }

    public static void w(String str) {
        w("SmartRouter", str);
    }

    public static void e(String str, String str2) {
        com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_e(str, str2);
    }

    public static void w(String str, String str2) {
        com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_w(str, str2);
    }

    public static void d(String str, String str2) {
        if (sDebug) {
            com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_d(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (sDebug) {
            com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_i(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (sDebug) {
            com_bytedance_router_util_Logger_com_ss_android_ugc_aweme_lancet_LogLancet_v(str, str2);
        }
    }
}
