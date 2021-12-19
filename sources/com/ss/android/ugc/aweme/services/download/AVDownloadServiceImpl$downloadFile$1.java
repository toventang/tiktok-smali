package com.ss.android.ugc.aweme.services.download;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.common.c.a;

public final class AVDownloadServiceImpl$downloadFile$1 extends AbsDownloadListener {
    final /* synthetic */ a $listener;
    final /* synthetic */ AVDownloadServiceImpl this$0;

    static {
        Covode.recordClassIndex(79597);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        if (downloadInfo != null) {
            downloadInfo.getCurBytes();
            downloadInfo.getTotalBytes();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String str;
        super.onSuccessed(downloadInfo);
        a aVar = this.$listener;
        if (aVar != null) {
            if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                str = "";
            }
            aVar.a(str, this.this$0.getFullFilePath(downloadInfo));
        }
    }

    AVDownloadServiceImpl$downloadFile$1(AVDownloadServiceImpl aVDownloadServiceImpl, a aVar) {
        this.this$0 = aVDownloadServiceImpl;
        this.$listener = aVar;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        a aVar = this.$listener;
        if (aVar != null) {
            if (baseException != null) {
                baseException.getErrorMessage();
                Integer.valueOf(baseException.getErrorCode());
            }
            aVar.a();
        }
    }
}
