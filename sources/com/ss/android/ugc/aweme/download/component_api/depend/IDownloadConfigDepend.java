package com.ss.android.ugc.aweme.download.component_api.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.g.j;

public interface IDownloadConfigDepend {
    static {
        Covode.recordClassIndex(51807);
    }

    String getDeviceId();

    String getSettingString();

    j getTTNetDownloadHttpService();

    String getUserId();

    boolean needAutoRefreshUnSuccessTask();
}
