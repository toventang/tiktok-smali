package com.ss.android.ugc.effectmanager.effect.bridge;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.SyncTask;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;

public interface EffectFetcher {
    static {
        Covode.recordClassIndex(95365);
    }

    SyncTask<EffectTaskResult> fetchEffect(EffectFetcherArguments effectFetcherArguments);
}
