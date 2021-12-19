package com.bytedance.vcloud.networkpredictor;

import com.a;
import com.bytedance.covode.number.Covode;

public class SpeedPredictorLog {
    public static int LogTurnOn = 112;

    public static int com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public static void d(Throwable th) {
    }

    static {
        Covode.recordClassIndex(28046);
    }

    public static final void d(String str, String str2) {
        if (((LogTurnOn >> 1) & 1) == 1) {
            com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_d("SpeedPredictorLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static void e(String str, String str2) {
        if (((LogTurnOn >> 6) & 1) == 1) {
            com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_e("SpeedPredictorLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static final void i(String str, String str2) {
        if (((LogTurnOn >> 2) & 1) == 1) {
            com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_i("SpeedPredictorLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static final void k(String str, String str2) {
        if (((LogTurnOn >> 4) & 1) == 1) {
            com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_i("SpeedPredictorLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static final void t(String str, String str2) {
        if (((LogTurnOn >> 3) & 1) == 1) {
            com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_i("SpeedPredictorLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static final void turnOn(int i2, int i3) {
        int i4 = ((1 << i2) ^ -1) & LogTurnOn;
        LogTurnOn = i4;
        int i5 = i4 | (i3 << i2);
        LogTurnOn = i5;
        if (i2 == 1 && i3 == 1) {
            int i6 = i5 & -5;
            LogTurnOn = i6;
            LogTurnOn = i6 | 4;
        }
    }

    public static final void w(String str, String str2) {
        if (((LogTurnOn >> 5) & 1) == 1) {
            com_bytedance_vcloud_networkpredictor_SpeedPredictorLog_com_ss_android_ugc_aweme_lancet_LogLancet_w("SpeedPredictorLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }
}
