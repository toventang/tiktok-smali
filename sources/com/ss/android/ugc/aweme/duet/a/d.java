package com.ss.android.ugc.aweme.duet.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.detail.operators.a;
import h.f.b.l;

public final class d extends a<b, b<b>> {
    static {
        Covode.recordClassIndex(52444);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return i2 + 17000;
    }

    public d(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar) {
        b bVar = (b) (!(aVar instanceof b) ? null : aVar);
        this.mModel = bVar == null ? new b() : bVar;
        this.mPresenter = new b();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        this.mPresenter.a(Integer.valueOf(i2), bVar.getDuetId(), Integer.valueOf(bVar.getVideoType()));
    }
}
