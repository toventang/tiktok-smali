package com.ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

public class DownloadFileExistException extends BaseException {
    private String existTargetFileName;
    private String existTargetFilePath;

    static {
        Covode.recordClassIndex(37378);
    }

    public String getExistTargetFileName() {
        return this.existTargetFileName;
    }

    public String getExistTargetFilePath() {
        return this.existTargetFilePath;
    }

    public DownloadFileExistException(String str, String str2) {
        this.existTargetFilePath = str;
        this.existTargetFileName = str2;
    }
}
