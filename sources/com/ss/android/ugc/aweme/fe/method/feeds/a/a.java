package com.ss.android.ugc.aweme.fe.method.feeds.a;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.detail.operators.a<com.ss.android.ugc.aweme.fe.method.feeds.a, b<com.ss.android.ugc.aweme.fe.method.feeds.a>> {
    static {
        Covode.recordClassIndex(57455);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final boolean init(Fragment fragment) {
        l.d(fragment, "");
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    public a(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar) {
        this.mModel = (com.ss.android.ugc.aweme.fe.method.feeds.a) (!(aVar instanceof com.ss.android.ugc.aweme.fe.method.feeds.a) ? null : aVar);
        this.mPresenter = new b();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        this.mPresenter.a(Integer.valueOf(i2));
    }
}
