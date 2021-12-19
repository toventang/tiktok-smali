package com.ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.detail.g.d;
import com.ss.android.ugc.aweme.discover.mixfeed.b;

public final class ag extends d<d, b<d>> {
    static {
        Covode.recordClassIndex(49624);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return 9;
    }

    public ag(a<?, ?> aVar) {
        this.mModel = (d) (!(aVar instanceof d) ? null : aVar);
        this.mPresenter = new b();
    }
}
