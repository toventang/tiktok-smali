package com.ss.android.ugc.aweme.prop.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;

public final class a extends com.ss.android.ugc.aweme.detail.operators.a<c, b<c>> {
    static {
        Covode.recordClassIndex(76811);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return i2 + 10000;
    }

    public a(com.ss.android.ugc.aweme.common.e.a aVar, com.ss.android.ugc.aweme.feed.param.b bVar) {
        this.mModel = !(aVar instanceof c) ? new c(bVar.getPreviousPage()) : aVar;
        this.mPresenter = new b();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        this.mPresenter.a(Integer.valueOf(i2), bVar.getStickerId(), Integer.valueOf(bVar.getVideoType()));
    }
}
