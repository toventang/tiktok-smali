package com.ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

public class DownloadPauseReserveWifiException extends DownloadRetryNeedlessException {
    static {
        Covode.recordClassIndex(37382);
    }

    public DownloadPauseReserveWifiException() {
        super(1013, "download reserve wifi");
    }
}
