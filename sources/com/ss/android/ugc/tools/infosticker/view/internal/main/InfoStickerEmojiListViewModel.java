package com.ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.b;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.infosticker.a.a.d;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import f.a.ab;
import h.f.b.l;
import java.util.List;

public final class InfoStickerEmojiListViewModel extends BaseInfoStickerListViewModel<Effect> implements au {

    /* renamed from: d  reason: collision with root package name */
    private b f149614d;

    /* renamed from: e  reason: collision with root package name */
    private j<Effect, CategoryEffectModel> f149615e;

    /* renamed from: f  reason: collision with root package name */
    private final d f149616f;

    static {
        Covode.recordClassIndex(98528);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<Effect>> h() {
        d dVar = this.f149616f;
        b bVar = this.f149614d;
        if (bVar != null) {
            j<Effect, CategoryEffectModel> a2 = dVar.a(bVar);
            this.f149615e = a2;
            return a2.b();
        }
        throw new IllegalArgumentException("ListMeta not fetched yet".toString());
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<Effect>> i() {
        ab<List<Effect>> b2;
        j<Effect, CategoryEffectModel> jVar = this.f149615e;
        if (jVar != null && (b2 = jVar.b()) != null) {
            return b2;
        }
        ab<List<Effect>> a2 = ab.a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void a(com.ss.android.ugc.tools.h.a.m mVar) {
        l.d(mVar, "");
        if (mVar instanceof b) {
            this.f149614d = (b) mVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerEmojiListViewModel(m mVar, d dVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(dVar, "");
        this.f149616f = dVar;
    }
}
