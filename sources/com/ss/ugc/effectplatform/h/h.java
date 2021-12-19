package com.ss.ugc.effectplatform.h;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;

public interface h {
    static {
        Covode.recordClassIndex(102415);
    }

    void onFetchModelList(boolean z, String str, long j2, String str2);

    void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc);

    void onModelDownloadStart(Effect effect, ModelInfo modelInfo);

    void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j2);

    void onModelNotFound(Effect effect, Exception exc);
}
