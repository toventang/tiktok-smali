package com.ss.android.socialbase.downloader.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface p extends IDownloadListener {
    static {
        Covode.recordClassIndex(37314);
    }

    void a(DownloadInfo downloadInfo);
}
