package com.ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

public class DownloadOnlyWifiException extends DownloadRetryNeedlessException {
    static {
        Covode.recordClassIndex(37380);
    }

    public DownloadOnlyWifiException() {
        super(1013, "download only wifi");
    }
}
