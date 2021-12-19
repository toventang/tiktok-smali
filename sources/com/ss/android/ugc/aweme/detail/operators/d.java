package com.ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.detail.i.c;
import com.ss.android.ugc.aweme.detail.i.d;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.u.x;
import h.f.b.l;

public class d<MODEL extends c<?, ?>, PRESENTER extends com.ss.android.ugc.aweme.detail.i.d<MODEL, Aweme>> extends a<MODEL, PRESENTER> implements aa.b {
    static {
        Covode.recordClassIndex(49638);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public void bindPreLoadView(x xVar) {
        ((com.ss.android.ugc.aweme.detail.i.d) this.mPresenter).f79771a = xVar;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public boolean init(Fragment fragment) {
        l.d(fragment, "");
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa.b
    public void setPreLoad(boolean z) {
        b bVar = this.mPresenter;
        l.b(bVar, "");
        ((com.ss.android.ugc.aweme.detail.i.d) bVar).f79772b = z;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        this.mPresenter.a(Integer.valueOf(i2));
    }
}
