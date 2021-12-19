package com.ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

public class DownloadTTNetException extends BaseException {
    static {
        Covode.recordClassIndex(37384);
    }

    public String getRequestLog() {
        return getExtraInfo();
    }

    public DownloadTTNetException setRequestLog(String str) {
        setExtraInfo(str);
        return this;
    }

    public DownloadTTNetException(int i2, String str) {
        super(i2, str);
    }

    public DownloadTTNetException(int i2, Throwable th) {
        super(i2, th);
    }
}
