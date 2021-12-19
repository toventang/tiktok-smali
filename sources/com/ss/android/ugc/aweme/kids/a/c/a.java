package com.ss.android.ugc.aweme.kids.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public abstract class a extends AbsDownloadListener {
    static {
        Covode.recordClassIndex(67479);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        if (downloadInfo != null) {
            Downloader.getInstance(d.a()).removeSubThreadListener(downloadInfo.getId(), this);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (downloadInfo != null) {
            Downloader.getInstance(d.a()).removeSubThreadListener(downloadInfo.getId(), this);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        if (downloadInfo != null) {
            Downloader.getInstance(d.a()).removeSubThreadListener(downloadInfo.getId(), this);
        }
    }
}
