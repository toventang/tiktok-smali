package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.sticker.d.d;
import com.ss.android.ugc.aweme.sticker.f.c;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.a.y;
import com.ss.android.ugc.aweme.sticker.repository.b;
import com.ss.android.ugc.aweme.sticker.view.internal.f;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.l;
import java.util.List;

public final class SharedPoolStickerListViewModel extends StickerListViewModel implements au {
    static {
        Covode.recordClassIndex(89236);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final Effect a(f<Effect> fVar) {
        String key;
        a<CategoryEffectModel> value;
        M m2;
        List<Effect> effects;
        l.d(fVar, "");
        int i2 = fVar.f136650b;
        int i3 = fVar.f136651c;
        y j2 = this.o.c().j();
        List<EffectCategoryModel> a2 = b.a(j2);
        if (i3 <= 0 || a2.size() <= i3 || (key = a2.get(i3).getKey()) == null || (value = j2.a(key, false).getValue()) == null || (m2 = value.f69568a) == null || (effects = m2.getEffects()) == null || effects.isEmpty()) {
            return null;
        }
        return c.a(this.o, effects, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPoolStickerListViewModel(m mVar, o oVar, d dVar, g gVar, f fVar) {
        super(mVar, oVar, dVar, gVar, fVar);
        l.d(mVar, "");
        l.d(oVar, "");
        l.d(dVar, "");
        l.d(gVar, "");
        l.d(fVar, "");
    }
}
