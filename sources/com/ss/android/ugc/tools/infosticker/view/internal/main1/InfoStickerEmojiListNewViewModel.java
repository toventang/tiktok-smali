package com.ss.android.ugc.tools.infosticker.view.internal.main1;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.tools.h.a.b;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.infosticker.a.a.a;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import f.a.ab;
import h.f.b.l;
import java.util.List;

public final class InfoStickerEmojiListNewViewModel extends BaseInfoStickerListViewModel<InfoStickerEffect> implements au {

    /* renamed from: d  reason: collision with root package name */
    private b f149822d;

    /* renamed from: e  reason: collision with root package name */
    private j<InfoStickerEffect, CategoryEffectModel> f149823e;

    /* renamed from: f  reason: collision with root package name */
    private final a f149824f;

    static {
        Covode.recordClassIndex(98646);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<InfoStickerEffect>> h() {
        a aVar = this.f149824f;
        if (this.f149822d != null) {
            j<InfoStickerEffect, CategoryEffectModel> c2 = aVar.c();
            this.f149823e = c2;
            return c2.b();
        }
        throw new IllegalArgumentException("ListMeta not fetched yet".toString());
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final ab<List<InfoStickerEffect>> i() {
        ab<List<InfoStickerEffect>> b2;
        j<InfoStickerEffect, CategoryEffectModel> jVar = this.f149823e;
        if (jVar != null && (b2 = jVar.b()) != null) {
            return b2;
        }
        ab<List<InfoStickerEffect>> a2 = ab.a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void a(com.ss.android.ugc.tools.h.a.m mVar) {
        l.d(mVar, "");
        if (mVar instanceof b) {
            this.f149822d = (b) mVar;
        }
    }
}
