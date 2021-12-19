package com.ss.android.ugc.effectmanager.common.logger;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class EPLog {
    public static final EPLog INSTANCE = new EPLog();
    private static boolean sEnableLog = true;
    private static ILogger sLogger = DefaultLogger.INSTANCE;
    private static String sdkTag = "EffectPlatform";

    private EPLog() {
    }

    public final boolean getSEnableLog() {
        return sEnableLog;
    }

    static {
        Covode.recordClassIndex(95300);
    }

    public static final void setEnableLog(boolean z) {
        sEnableLog = z;
    }

    public final void setSEnableLog(boolean z) {
        sEnableLog = z;
    }

    public static final void setLogger(ILogger iLogger) {
        l.c(iLogger, "");
        sLogger = iLogger;
    }

    public static final void addSDKTagString(String str) {
        sdkTag += '-' + str;
    }

    private final String getSDKTag(String str) {
        return "[" + sdkTag + '#' + str + "]:";
    }

    public static final void d(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        sLogger.d(INSTANCE.getSDKTag(str) + "  " + str2);
    }

    public static final void e(String str, String str2) {
        l.c(str, "");
        sLogger.e(INSTANCE.getSDKTag(str) + "  " + str2, null);
    }

    public static final void i(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        sLogger.i(INSTANCE.getSDKTag(str) + "  " + str2);
    }

    public static final void w(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        sLogger.w(INSTANCE.getSDKTag(str) + "  " + str2);
    }

    public static final void e(String str, String str2, Throwable th) {
        l.c(str, "");
        sLogger.e(INSTANCE.getSDKTag(str) + "  " + str2, th);
    }
}
