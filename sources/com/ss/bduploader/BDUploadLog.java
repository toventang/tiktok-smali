package com.ss.bduploader;

import com.a;
import com.bytedance.covode.number.Covode;

public class BDUploadLog {
    public static int LogTurnOn = 112;

    public static int com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(100658);
    }

    public static final void turnOn(int i2, int i3) {
        int i4 = ((1 << i2) ^ -1) & LogTurnOn;
        LogTurnOn = i4;
        LogTurnOn = (i3 << i2) | i4;
    }

    public static final void d(String str, String str2) {
        if (((LogTurnOn >> 1) & 1) == 1) {
            com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_d("BDUploadLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static void e(String str, String str2) {
        if (((LogTurnOn >> 6) & 1) == 1) {
            com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_e("BDUploadLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static final void i(String str, String str2) {
        if (((LogTurnOn >> 2) & 1) == 1) {
            com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_i("BDUploadLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static final void k(String str, String str2) {
        if (((LogTurnOn >> 4) & 1) == 1) {
            com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_i("BDUploadLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static final void t(String str, String str2) {
        if (((LogTurnOn >> 3) & 1) == 1) {
            com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_i("BDUploadLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }

    public static final void w(String str, String str2) {
        if (((LogTurnOn >> 5) & 1) == 1) {
            com_ss_bduploader_BDUploadLog_com_ss_android_ugc_aweme_lancet_LogLancet_w("BDUploadLog", a.a("<%s>%s", new Object[]{str, str2}));
        }
    }
}
