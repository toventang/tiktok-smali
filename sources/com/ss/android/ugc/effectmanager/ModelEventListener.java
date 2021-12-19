package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.model.ModelInfo;

public interface ModelEventListener {
    static {
        Covode.recordClassIndex(95200);
    }

    void onFetchModelList(boolean z, String str, long j2, String str2);

    void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc);

    void onModelDownloadStart(Effect effect, ModelInfo modelInfo);

    void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j2);

    void onModelNotFound(Effect effect, Exception exc);
}
