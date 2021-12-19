package com.ss.android.socialbase.downloader.exception;

import com.bytedance.covode.number.Covode;

public class DownloadRetryNeedlessException extends BaseException {
    static {
        Covode.recordClassIndex(37383);
    }

    public DownloadRetryNeedlessException(int i2, String str) {
        super(i2, str);
    }
}
