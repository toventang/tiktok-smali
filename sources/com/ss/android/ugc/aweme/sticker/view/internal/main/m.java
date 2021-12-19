package com.ss.android.ugc.aweme.sticker.view.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.b.a.d;
import h.f.b.l;

public final class m implements g {

    /* renamed from: a  reason: collision with root package name */
    private final d f136315a;

    static {
        Covode.recordClassIndex(89032);
    }

    public m(d dVar) {
        l.d(dVar, "");
        this.f136315a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.g
    public final void a(Effect effect, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        l.d(iIsTagNeedUpdatedListener, "");
        if (effect != null) {
            this.f136315a.a(effect.getId(), effect.getTags(), effect.getTagsUpdatedAt(), iIsTagNeedUpdatedListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.g
    public final void a(Effect effect, IUpdateTagListener iUpdateTagListener) {
        l.d(iUpdateTagListener, "");
        if (effect != null) {
            this.f136315a.a(effect.getId(), effect.getTagsUpdatedAt(), iUpdateTagListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.g
    public final void a(EffectCategoryModel effectCategoryModel, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        l.d(iIsTagNeedUpdatedListener, "");
        if (effectCategoryModel != null) {
            this.f136315a.a(effectCategoryModel.getId(), effectCategoryModel.getTags(), effectCategoryModel.getTagsUpdateTime(), iIsTagNeedUpdatedListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.g
    public final void a(EffectCategoryModel effectCategoryModel, IUpdateTagListener iUpdateTagListener) {
        l.d(iUpdateTagListener, "");
        if (effectCategoryModel != null) {
            this.f136315a.a(effectCategoryModel.getId(), effectCategoryModel.getTagsUpdateTime(), iUpdateTagListener);
        }
    }
}
