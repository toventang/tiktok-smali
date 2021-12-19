package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.sticker.d.d;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class FavoriteStickerListViewModel extends StickerListViewModel implements au {
    static {
        Covode.recordClassIndex(89091);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    public final void a(a<CategoryEffectModel> aVar) {
        List<Effect> effects;
        l.d(aVar, "");
        a.EnumC1574a aVar2 = aVar.f69569b;
        if (aVar2 != null) {
            int i2 = c.f136444a[aVar2.ordinal()];
            if (i2 == 1) {
                this.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
            } else if (i2 == 2) {
                Throwable th = aVar.f69570c;
                if (!(th instanceof StatusCodeException) || ((StatusCodeException) th).getStatusCode() != 8) {
                    this.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
                } else {
                    this.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.EMPTY);
                }
            } else if (i2 == 3) {
                M m2 = aVar.f69568a;
                if (m2 == null || (effects = m2.getEffects()) == null || effects.isEmpty()) {
                    this.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.EMPTY);
                    this.f136624l.setValue(z.INSTANCE);
                    return;
                }
                this.f136625m.setValue(com.ss.android.ugc.tools.view.widget.b.a.NONE);
                a((List<? extends Effect>) effects);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteStickerListViewModel(m mVar, o oVar, d dVar, g gVar) {
        super(mVar, oVar, dVar, gVar);
        l.d(mVar, "");
        l.d(oVar, "");
        l.d(dVar, "");
        l.d(gVar, "");
    }
}
