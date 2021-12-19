package com.ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;

public final class y extends a<a, b<a>> {
    static {
        Covode.recordClassIndex(49674);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return 8000;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final boolean init(Fragment fragment) {
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    public y(a aVar) {
        this.mModel = aVar;
        this.mPresenter = new b();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        this.mPresenter.a(bVar.getAid());
    }
}
