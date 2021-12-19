package com.ss.android.ugc.effectmanager.common.logger;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class DefaultLogger implements ILogger {
    public static final DefaultLogger INSTANCE = new DefaultLogger();

    public static int com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    private DefaultLogger() {
    }

    static {
        Covode.recordClassIndex(95299);
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public final void d(String str) {
        l.c(str, "");
        if (EPLog.INSTANCE.getSEnableLog()) {
            com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_d("DefaultEPLog", str);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public final void i(String str) {
        l.c(str, "");
        if (EPLog.INSTANCE.getSEnableLog()) {
            com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_i("DefaultEPLog", str);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public final void w(String str) {
        l.c(str, "");
        if (EPLog.INSTANCE.getSEnableLog()) {
            com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_w("DefaultEPLog", str);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public final void e(String str, Throwable th) {
        com_ss_android_ugc_effectmanager_common_logger_DefaultLogger_com_ss_android_ugc_aweme_lancet_LogLancet_e("DefaultEPLog", str, th);
    }
}
