package com.ss.android.socialbase.downloader.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface IDownloadDepend {
    static {
        Covode.recordClassIndex(37266);
    }

    void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i2);
}
