package com.ss.android.socialbase.downloader.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.e.a;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public abstract class AbsDownloadListener implements IDownloadListener {
    private static final String TAG = AbsDownloadListener.class.getSimpleName();

    static {
        Covode.recordClassIndex(37265);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            a.b(TAG, " onCanceled -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstStart(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            a.b(TAG, " onFirstStart -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstSuccess(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            a.b(TAG, " onFirstSuccess -- " + downloadInfo.getName());
        }
    }

    public void onIntercept(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            a.b(TAG, " onIntercept -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            a.b(TAG, " onPause -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            a.b(TAG, " onPrepare -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
            a.b(TAG, com.a.a("onProgress %s %.2f%%", new Object[]{downloadInfo.getName(), Float.valueOf((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f)}));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            a.b(TAG, " onStart -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (a.a() && downloadInfo != null) {
            a.b(TAG, " onSuccessed -- " + downloadInfo.getName() + " " + downloadInfo.isSuccessByCache());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (a.a() && downloadInfo != null) {
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            a.b(str2, com.a.a("onFailed on %s because of : %s", objArr));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (a.a() && downloadInfo != null) {
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            a.b(str2, com.a.a("onRetry on %s because of : %s", objArr));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (a.a() && downloadInfo != null) {
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            a.b(str2, com.a.a("onRetryDelay on %s because of : %s", objArr));
        }
    }
}
