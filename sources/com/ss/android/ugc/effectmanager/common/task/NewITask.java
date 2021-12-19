package com.ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

public interface NewITask<T> {
    static {
        Covode.recordClassIndex(95318);
    }

    void cancel();

    void execute(IEffectPlatformBaseListener<T> iEffectPlatformBaseListener);

    String getId();
}
