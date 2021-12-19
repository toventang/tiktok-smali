package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;

public class TTMediaDataReaderBridge {
    static {
        Covode.recordClassIndex(101396);
    }

    public static int com_ss_ttuploader_TTMediaDataReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int close(Object obj, int i2) {
        if (obj != null && i2 >= 0) {
            return ((TTMediaDataReader) obj).close(i2);
        }
        com_ss_ttuploader_TTMediaDataReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to close fail");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int open(Object obj, int i2) {
        if (obj != null) {
            return ((TTMediaDataReader) obj).open(i2);
        }
        com_ss_ttuploader_TTMediaDataReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to open failed");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public long getValue(Object obj, int i2, int i3) {
        if (obj != null) {
            return ((TTMediaDataReader) obj).getValue(i2, i3);
        }
        com_ss_ttuploader_TTMediaDataReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to get value fail");
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int read(Object obj, int i2, long j2, byte[] bArr, int i3) {
        if (obj != null && bArr != null && i3 != 0) {
            return ((TTMediaDataReader) obj).read(i2, j2, bArr, i3);
        }
        com_ss_ttuploader_TTMediaDataReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to read end fail");
        return 0;
    }
}
