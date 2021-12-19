package com.ss.android.ugc.aweme.download.component_api.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IDownloadSdkMonitorDepend {
    static {
        Covode.recordClassIndex(51808);
    }

    String getAid();

    String getAppVersionName();

    String getChannel();

    Context getContext();

    String getDeviceId();

    String[] getMonitorHosts();

    String getPackageName();

    long getUpdateVersionCode();
}
