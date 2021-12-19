package com.ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

public class DownloadHttpException extends BaseException {
    private final int httpStatusCode;

    static {
        Covode.recordClassIndex(37379);
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadHttpException(int i2, int i3, String str) {
        super(i2, str);
        this.httpStatusCode = i3;
    }
}
