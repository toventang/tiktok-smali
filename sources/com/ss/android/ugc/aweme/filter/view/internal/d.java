package com.ss.android.ugc.aweme.filter.view.internal;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;

public interface d {
    static {
        Covode.recordClassIndex(60689);
    }

    void a(FilterBean filterBean);

    void a(EffectCategoryResponse effectCategoryResponse);

    void a(EffectCategoryResponse effectCategoryResponse, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);
}
