package com.ss.android.ugc.effectmanager.common.download;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class DownloadListenerAdapter implements DownloadListener {
    static {
        Covode.recordClassIndex(95288);
    }

    @Override // com.ss.android.ugc.effectmanager.common.download.DownloadListener
    public void onFinish(DownloadResult downloadResult) {
        l.c(downloadResult, "");
    }

    @Override // com.ss.android.ugc.effectmanager.common.download.DownloadListener
    public void onProgress(int i2, long j2) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.download.DownloadListener
    public void onStart() {
    }
}
