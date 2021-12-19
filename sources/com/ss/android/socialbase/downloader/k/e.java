package com.ss.android.socialbase.downloader.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.i.a;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public final class e {
    static {
        Covode.recordClassIndex(37481);
    }

    public static boolean a(DownloadInfo downloadInfo) {
        if (downloadInfo != null && a.a(downloadInfo.getId(), (DownloadInfo) null).a("optimize_head_request", 0) == 1) {
            return true;
        }
        return false;
    }
}
