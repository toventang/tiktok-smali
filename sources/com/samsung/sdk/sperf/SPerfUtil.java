package com.samsung.sdk.sperf;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class SPerfUtil {
    private static boolean DEBUG;

    static {
        Covode.recordClassIndex(35508);
    }

    SPerfUtil() {
    }

    public static int com_samsung_sdk_sperf_SPerfUtil_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static void log(String str) {
        if (DEBUG) {
            com_samsung_sdk_sperf_SPerfUtil_com_ss_android_ugc_aweme_lancet_LogLancet_i("PERFSDK", str);
        }
    }

    public static void logAlways(String str) {
        com_samsung_sdk_sperf_SPerfUtil_com_ss_android_ugc_aweme_lancet_LogLancet_i("PERFSDK", str);
    }

    public static void setDebug(boolean z) {
        DEBUG = z;
    }
}
