package com.ss.android.ugc.effectmanager.effect.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;

public interface IUpdateTagRepository {
    static {
        Covode.recordClassIndex(95467);
    }

    String isTagUpdated(String str, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    String updateTag(String str, String str2, IUpdateTagListener iUpdateTagListener);
}
