package com.ss.avframework.utils;

import com.bytedance.covode.number.Covode;

public class EarlyAVLog {
    private static IEarlyLogPrint sEarlyLogPrint;

    public interface IEarlyLogPrint {
        static {
            Covode.recordClassIndex(100586);
        }

        void print(int i2, String str, String str2, Throwable th);
    }

    static {
        Covode.recordClassIndex(100585);
    }

    public static int com_ss_avframework_utils_EarlyAVLog_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
        return 0;
    }

    public static IEarlyLogPrint getEarlyLogPrint() {
        return sEarlyLogPrint;
    }

    public static void setEarlyLogPrint(IEarlyLogPrint iEarlyLogPrint) {
        sEarlyLogPrint = iEarlyLogPrint;
    }

    public static void println(int i2, String str, String str2, Throwable th) {
        IEarlyLogPrint iEarlyLogPrint = sEarlyLogPrint;
        if (iEarlyLogPrint != null) {
            iEarlyLogPrint.print(i2, str + "-EarlyAVLog", str2, th);
        } else {
            com_ss_avframework_utils_EarlyAVLog_com_ss_android_ugc_aweme_lancet_LogLancet_w(str + "-EarlyAVLog", "[" + i2 + "] " + str2, th);
        }
    }
}
