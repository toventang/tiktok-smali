package com.ss.android.socialbase.downloader.downloader;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import java.lang.ref.WeakReference;

public class IndependentProcessDownloadService extends DownloadService {
    static {
        Covode.recordClassIndex(37334);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.DownloadService
    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.DownloadService
    public void onCreate() {
        super.onCreate();
        c.a(this);
        if (c.f60427b == null) {
            c.a(new x());
        }
        this.f60411a = c.s();
        this.f60411a.a(new WeakReference(this));
    }
}
