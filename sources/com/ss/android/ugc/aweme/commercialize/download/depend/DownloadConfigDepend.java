package com.ss.android.ugc.aweme.commercialize.download.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.socialbase.downloader.g.j;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.e.a.a;
import com.ss.android.ugc.aweme.app.e.a.c;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend;
import h.f.b.l;

public final class DownloadConfigDepend implements IDownloadConfigDepend {
    static {
        Covode.recordClassIndex(45445);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public final boolean needAutoRefreshUnSuccessTask() {
        return a.f66691a;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public final j getTTNetDownloadHttpService() {
        return new c();
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public final String getDeviceId() {
        String deviceId = DeviceRegisterManager.getDeviceId();
        l.b(deviceId, "");
        return deviceId;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public final String getSettingString() {
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<String> downloadSdkConfig = inst.getDownloadSdkConfig();
        l.b(downloadSdkConfig, "");
        String c2 = downloadSdkConfig.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public final String getUserId() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        l.b(curUserId, "");
        return curUserId;
    }
}
