package com.ss.android.ugc.aweme.download.impl.component_impl.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public final class a implements IDownloadListener {

    /* renamed from: a  reason: collision with root package name */
    private IDownloadListener f83113a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f83114b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC1954a f83115c;

    /* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.a.a$a  reason: collision with other inner class name */
    public interface AbstractC1954a {
        static {
            Covode.recordClassIndex(51819);
        }

        void a(DownloadInfo downloadInfo);
    }

    static {
        Covode.recordClassIndex(51818);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onCanceled(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onFirstStart(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onFirstSuccess(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onPause(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onPrepare(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onProgress(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onStart(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        AbstractC1954a aVar = this.f83115c;
        if (aVar != null) {
            aVar.a(downloadInfo);
        }
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onSuccessed(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onFailed(downloadInfo, baseException);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onRetry(downloadInfo, baseException);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        IDownloadListener iDownloadListener = this.f83113a;
        if (iDownloadListener != null) {
            iDownloadListener.onRetryDelay(downloadInfo, baseException);
        }
    }

    public a(IDownloadListener iDownloadListener, boolean z, AbstractC1954a aVar) {
        this.f83113a = iDownloadListener;
        this.f83114b = z;
        this.f83115c = aVar;
    }
}
