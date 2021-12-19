package com.ss.android.socialbase.downloader.k;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.p;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public final class d {
    static {
        Covode.recordClassIndex(37480);
    }

    public static void a(int i2, SparseArray<IDownloadListener> sparseArray, boolean z, DownloadInfo downloadInfo, BaseException baseException) {
        SparseArray<IDownloadListener> clone;
        MethodCollector.i(13762);
        if (z && sparseArray != null) {
            try {
                if (sparseArray.size() > 0) {
                    synchronized (sparseArray) {
                        try {
                            clone = sparseArray.clone();
                        } finally {
                            MethodCollector.o(13762);
                        }
                    }
                    for (int i3 = 0; i3 < clone.size(); i3++) {
                        IDownloadListener iDownloadListener = clone.get(clone.keyAt(i3));
                        if (iDownloadListener != null) {
                            if (i2 == 1) {
                                iDownloadListener.onPrepare(downloadInfo);
                            } else if (i2 == 2) {
                                iDownloadListener.onStart(downloadInfo);
                            } else if (i2 == 4) {
                                iDownloadListener.onProgress(downloadInfo);
                            } else if (i2 == 5) {
                                iDownloadListener.onRetry(downloadInfo, baseException);
                            } else if (i2 == 6) {
                                iDownloadListener.onFirstStart(downloadInfo);
                            } else if (i2 == 7) {
                                iDownloadListener.onRetryDelay(downloadInfo, baseException);
                            } else if (i2 != 11) {
                                switch (i2) {
                                    case -7:
                                        if (iDownloadListener instanceof AbsDownloadListener) {
                                            ((AbsDownloadListener) iDownloadListener).onIntercept(downloadInfo);
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case -6:
                                        iDownloadListener.onFirstSuccess(downloadInfo);
                                        continue;
                                    case -5:
                                    case -2:
                                        iDownloadListener.onPause(downloadInfo);
                                        continue;
                                    case -4:
                                        iDownloadListener.onCanceled(downloadInfo);
                                        continue;
                                    case -3:
                                        iDownloadListener.onSuccessed(downloadInfo);
                                        continue;
                                    case -1:
                                        iDownloadListener.onFailed(downloadInfo, baseException);
                                        continue;
                                }
                            } else if (iDownloadListener instanceof p) {
                                ((p) iDownloadListener).a(downloadInfo);
                            }
                        }
                    }
                    return;
                }
            } catch (Throwable unused) {
                MethodCollector.o(13762);
                return;
            }
        }
        MethodCollector.o(13762);
    }
}
