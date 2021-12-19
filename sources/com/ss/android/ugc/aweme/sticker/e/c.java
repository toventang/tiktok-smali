package com.ss.android.ugc.aweme.sticker.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public class c implements IDownloadListener {
    static {
        Covode.recordClassIndex(88126);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstStart(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstSuccess(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
    }
}
