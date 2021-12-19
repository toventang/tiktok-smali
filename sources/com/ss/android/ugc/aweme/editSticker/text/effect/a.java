package com.ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.editSticker.d;

public abstract class a extends AbsDownloadListener {
    static {
        Covode.recordClassIndex(55692);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        if (downloadInfo != null) {
            Downloader.getInstance(d.a()).removeMainThreadListener(downloadInfo.getId(), this);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (downloadInfo != null) {
            Downloader.getInstance(d.a()).removeMainThreadListener(downloadInfo.getId(), this);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        if (downloadInfo != null) {
            Downloader.getInstance(d.a()).removeMainThreadListener(downloadInfo.getId(), this);
        }
    }
}
