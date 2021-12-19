package com.ss.android.ugc.aweme.download.component_api.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;

public interface IDownloadService extends IBaseDownloadService {
    static {
        Covode.recordClassIndex(51811);
    }

    void a(Context context, IMonitorLogSendDepend iMonitorLogSendDepend, IDownloadConfigDepend iDownloadConfigDepend);

    void a(IDownloadSdkMonitorDepend iDownloadSdkMonitorDepend);

    boolean a(int i2);
}
