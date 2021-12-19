package com.ss.android.ugc.aweme.feed.operator;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel;
import com.ss.android.ugc.aweme.feed.u.r;
import h.f.b.l;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.detail.operators.a<FollowingFeedListModel, b<FollowingFeedListModel>> implements aa.a {
    static {
        Covode.recordClassIndex(59572);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final int getPageType(int i2) {
        return 9001;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final boolean isLoading() {
        return super.isLoading();
    }

    public a(List<String> list, List<String> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.mModel = new FollowingFeedListModel(list, list2);
        this.mPresenter = new r();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.a
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        l.d(bVar, "");
        this.mPresenter.a(Integer.valueOf(i2), bVar.getSelectedUid());
    }
}
