package com.ss.android.ugc.aweme.aq.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public abstract class e extends AbsDownloadListener {
    static {
        Covode.recordClassIndex(41280);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
    }
}
