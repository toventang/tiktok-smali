package com.ss.android.ugc.aweme.mvtemplate.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.detail.operators.a<b, b<b>> {
    static {
        Covode.recordClassIndex(72049);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return i2 + 11000;
    }

    public a(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar) {
        b bVar = (b) (!(aVar instanceof b) ? null : aVar);
        this.mModel = bVar == null ? new b() : bVar;
        this.mPresenter = new b();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        this.mPresenter.a(Integer.valueOf(i2), bVar.getMvId(), Integer.valueOf(bVar.getVideoType()));
    }
}
