package com.ss.android.ugc.aweme.sticker.view.internal;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;

public interface g {
    static {
        Covode.recordClassIndex(88985);
    }

    void a(Effect effect, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    void a(Effect effect, IUpdateTagListener iUpdateTagListener);

    void a(EffectCategoryModel effectCategoryModel, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    void a(EffectCategoryModel effectCategoryModel, IUpdateTagListener iUpdateTagListener);
}
