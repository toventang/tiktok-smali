package com.ss.android.ugc.aweme.sticker.view.internal.search;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.d.d;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.c.c;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import h.f.b.l;

public final class TTSearchStickerViewModel extends SearchStickerViewModel implements au {
    static {
        Covode.recordClassIndex(89169);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel, com.ss.android.ugc.aweme.sticker.view.internal.search.a
    public final void a(c cVar) {
        l.d(cVar, "");
        this.f136515j.setValue(cVar.f135486b);
        this.f136511f = cVar;
        this.f136512g = System.currentTimeMillis();
        this.o.c().b(cVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTSearchStickerViewModel(m mVar, o oVar, d dVar, g gVar) {
        super(mVar, oVar, dVar, gVar);
        l.d(mVar, "");
        l.d(oVar, "");
        l.d(dVar, "");
        l.d(gVar, "");
    }
}
