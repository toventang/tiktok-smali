package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public class BDExternalFileReaderBridge {
    static {
        Covode.recordClassIndex(100636);
    }

    public static int com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void cancel(Object obj) {
        com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to cancel");
        if (obj == null) {
            com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to cancel end fail");
            return;
        }
        ((BDExternalFileReader) obj).cancel();
        com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to cancel end");
    }

    /* access modifiers changed from: package-private */
    public long getValue(Object obj, int i2) {
        com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to get value");
        if (obj == null) {
            com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to get value fail");
            return -1;
        }
        long value = ((BDExternalFileReader) obj).getValue(i2);
        com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to get value end");
        return value;
    }

    /* access modifiers changed from: package-private */
    public long getCrc32ByOffset(Object obj, long j2, int i2) {
        com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to read end");
        if (obj == null) {
            com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to read end fail");
            return 0;
        }
        long crc32ByOffset = ((BDExternalFileReader) obj).getCrc32ByOffset(j2, i2);
        com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to read end");
        return crc32ByOffset;
    }

    /* access modifiers changed from: package-private */
    public int readSlice(Object obj, int i2, byte[] bArr, int i3) {
        com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to read end");
        if (obj == null || bArr == null || i3 == 0) {
            com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to read end fail");
            return 0;
        }
        int readSlice = ((BDExternalFileReader) obj).readSlice(i2, bArr, i3);
        com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to read end");
        return readSlice;
    }

    /* access modifiers changed from: package-private */
    public int readSliceByOffset(Object obj, long j2, byte[] bArr, int i2, int i3) {
        com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to read end");
        if (obj == null || bArr == null || i2 == 0) {
            com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to read end fail");
            return 0;
        }
        int readSliceByOffset = ((BDExternalFileReader) obj).readSliceByOffset(j2, bArr, i2, i3);
        com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to read end");
        return readSliceByOffset;
    }
}
