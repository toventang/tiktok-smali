package com.ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.music.presenter.g;

public final class r extends a<g, b<g>> {
    static {
        Covode.recordClassIndex(49667);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return i2 + 4000;
    }

    public r(a aVar) {
        this.mModel = !(aVar instanceof g) ? new g() : aVar;
        this.mPresenter = new b();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        this.mPresenter.a(Integer.valueOf(i2), bVar.getMusicId(), Integer.valueOf(bVar.getVideoType()));
    }
}
