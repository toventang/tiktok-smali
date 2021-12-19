package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.i.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.service.g;
import h.f.b.l;

public final class FavoritesMobUtilsServiceImpl implements g {
    static {
        Covode.recordClassIndex(79447);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.g
    public final boolean isDataSetChangedOnStart() {
        return a.f90646b;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.g
    public final void setDataSetChangedOnStart(boolean z) {
        a.f90646b = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.service.g
    public final void onVideoItemActionShow(Aweme aweme) {
        l.d(aweme, "");
        r.a(a.a(1), a.b("video", "collection_video").a("author_id", ac.a(aweme)).a("group_id", ac.e(aweme)).a("music_id", ac.d(aweme)).f66730a);
    }
}
