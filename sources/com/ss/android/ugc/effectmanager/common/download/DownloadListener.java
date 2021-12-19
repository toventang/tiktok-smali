package com.ss.android.ugc.effectmanager.common.download;

import com.bytedance.covode.number.Covode;

public interface DownloadListener {
    static {
        Covode.recordClassIndex(95287);
    }

    void onFinish(DownloadResult downloadResult);

    void onProgress(int i2, long j2);

    void onStart();
}
