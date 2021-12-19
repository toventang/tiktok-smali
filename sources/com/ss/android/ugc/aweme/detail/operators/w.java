package com.ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.detail.i.d;
import com.ss.android.ugc.aweme.detail.i.f;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.discover.mixfeed.u;
import com.ss.android.ugc.aweme.feed.u.x;
import h.f.b.l;

public final class w extends a<u, f> implements aa.b {
    static {
        Covode.recordClassIndex(49672);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return 9;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public final void bindPreLoadView(x xVar) {
        ((d) this.mPresenter).f79771a = xVar;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public final void setPreLoad(boolean z) {
        b bVar = this.mPresenter;
        l.b(bVar, "");
        ((d) bVar).f79772b = z;
    }

    public w(a<?, ?> aVar) {
        u uVar;
        if (aVar instanceof u) {
            uVar = (u) aVar;
        } else {
            uVar = new u();
        }
        this.mModel = uVar;
        this.mPresenter = new f();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        if (i2 == 1) {
            this.mPresenter.a(Integer.valueOf(i2), bVar.getSearchKeyword());
            return;
        }
        this.mPresenter.a(Integer.valueOf(i2));
    }
}
