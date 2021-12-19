package com.ss.android.socialbase.downloader.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface IDownloadListener {
    static {
        Covode.recordClassIndex(37267);
    }

    void onCanceled(DownloadInfo downloadInfo);

    void onFailed(DownloadInfo downloadInfo, BaseException baseException);

    void onFirstStart(DownloadInfo downloadInfo);

    void onFirstSuccess(DownloadInfo downloadInfo);

    void onPause(DownloadInfo downloadInfo);

    void onPrepare(DownloadInfo downloadInfo);

    void onProgress(DownloadInfo downloadInfo);

    void onRetry(DownloadInfo downloadInfo, BaseException baseException);

    void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException);

    void onStart(DownloadInfo downloadInfo);

    void onSuccessed(DownloadInfo downloadInfo);
}
