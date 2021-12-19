package com.ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

public interface IEffectPlatformBaseListener<T> {
    static {
        Covode.recordClassIndex(95316);
    }

    void onSuccess(T t);
}
