package com.ss.android.ugc.aweme.download.component_api.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.a;
import com.ss.android.ugc.aweme.download.component_api.a.b;

public interface IBaseDownloadService {
    static {
        Covode.recordClassIndex(51810);
    }

    void cancel(int i2);

    int getDownloadId(String str, String str2);

    DownloadInfo getDownloadInfo(int i2);

    DownloadInfo getDownloadInfo(String str, String str2);

    a getDownloadTask(int i2);

    com.ss.android.ugc.aweme.download.component_api.a.a getPageLifeMonitor(int i2);

    b getViewLifeMonitor(int i2);

    void restart(int i2);

    a with(String str);
}
