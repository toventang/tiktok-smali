package com.ss.android.ugc.aweme.commercialize.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.detail.operators.a;
import h.f.b.l;

public final class d extends a<n, b<n>> {
    static {
        Covode.recordClassIndex(46356);
    }

    public d(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar) {
        this.mModel = (n) (!(aVar instanceof n) ? null : aVar);
        this.mPresenter = new b();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        b bVar2 = this.mPresenter;
        Object[] objArr = new Object[8];
        objArr[0] = bVar.getUid();
        int i4 = 1;
        objArr[1] = bVar.getSecUid();
        objArr[2] = Long.valueOf(bVar.getMaxCursor());
        objArr[3] = 0L;
        objArr[4] = 6;
        if (bVar.getMaxCursor() != 0) {
            i4 = 4;
        }
        objArr[5] = Integer.valueOf(i4);
        objArr[6] = bVar.getAdvId();
        objArr[7] = "";
        bVar2.a(objArr);
    }
}
