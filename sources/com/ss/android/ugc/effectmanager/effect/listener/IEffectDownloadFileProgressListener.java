package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;

public interface IEffectDownloadFileProgressListener {
    static {
        Covode.recordClassIndex(95370);
    }

    void onProgress(int i2, long j2);
}
