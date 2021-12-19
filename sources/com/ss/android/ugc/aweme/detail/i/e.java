package com.ss.android.ugc.aweme.detail.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.a;
import com.ss.android.ugc.aweme.metrics.ac;
import java.util.List;

public final class e extends d<a, FollowFeed> {
    static {
        Covode.recordClassIndex(49579);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.i.d
    public final List<FollowFeed> d() {
        if (this.f76396h == null) {
            return null;
        }
        return ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.i.d
    public final List<Aweme> e() {
        return a.a(((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.i.d
    public final /* synthetic */ String b(FollowFeed followFeed) {
        FollowFeed followFeed2 = followFeed;
        if (followFeed2 == null) {
            return "";
        }
        return ac.e(followFeed2.getAweme());
    }
}
