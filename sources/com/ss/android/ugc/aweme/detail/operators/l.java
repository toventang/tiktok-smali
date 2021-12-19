package com.ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i.d;
import com.ss.android.ugc.aweme.detail.i.e;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.feed.u.x;
import com.ss.android.ugc.aweme.follow.presenter.a;
import com.ss.android.ugc.aweme.follow.presenter.e;
import com.ss.android.ugc.aweme.newfollow.c.b;

public final class l extends a<a, e> implements aa.b {
    static {
        Covode.recordClassIndex(49646);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public final void bindPreLoadView(x xVar) {
        ((d) this.mPresenter).f79771a = xVar;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public final void setPreLoad(boolean z) {
        ((d) this.mPresenter).f79772b = z;
    }

    public l(com.ss.android.ugc.aweme.common.e.a aVar) {
        this.mModel = !(aVar instanceof a) ? new a() : aVar;
        this.mPresenter = new e();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, b bVar, int i3, boolean z) {
        if (i2 == 1) {
            this.mPresenter.a(1, e.a.a(1, 0, 0, b.a.a("feed").b()).a());
        } else if (i2 == 4) {
            com.ss.android.ugc.aweme.common.e.b bVar2 = this.mPresenter;
            com.ss.android.ugc.aweme.follow.presenter.e a2 = e.a.a(4, 2, 0, b.a.a("feed").b());
            a2.f96271a = b.a.a("feed").a();
            bVar2.a(4, a2.a());
        } else {
            com.ss.android.ugc.aweme.common.e.b bVar3 = this.mPresenter;
            com.ss.android.ugc.aweme.follow.presenter.e a3 = e.a.a(i2, 2, 0, b.a.a("feed").b());
            a3.f96271a = b.a.a("feed").a();
            bVar3.a(Integer.valueOf(i2), a3.a());
        }
    }
}
