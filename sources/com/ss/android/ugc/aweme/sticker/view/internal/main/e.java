package com.ss.android.ugc.aweme.sticker.view.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.l;

public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final e f136288a = new e();

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.g
    public final void a(Effect effect, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        l.d(iIsTagNeedUpdatedListener, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.g
    public final void a(Effect effect, IUpdateTagListener iUpdateTagListener) {
        l.d(iUpdateTagListener, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.g
    public final void a(EffectCategoryModel effectCategoryModel, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        l.d(iIsTagNeedUpdatedListener, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.g
    public final void a(EffectCategoryModel effectCategoryModel, IUpdateTagListener iUpdateTagListener) {
        l.d(iUpdateTagListener, "");
    }

    private e() {
    }

    static {
        Covode.recordClassIndex(89016);
    }
}
