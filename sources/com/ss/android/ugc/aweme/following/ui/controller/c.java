package com.ss.android.ugc.aweme.following.ui.controller;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.following.ui.viewmodel.TopRecommendVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.a.e;
import com.ss.android.ugc.aweme.social.widget.card.a.f;
import com.ss.android.ugc.aweme.social.widget.card.j;
import h.f.b.l;
import java.util.List;

public final class c extends a {
    static {
        Covode.recordClassIndex(61113);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j, com.ss.android.ugc.aweme.following.ui.controller.a
    public final void a(User user) {
        l.d(user, "");
        com.ss.android.ugc.aweme.social.a.c.d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(TopRecommendVM topRecommendVM, DmtStatusView dmtStatusView, j jVar) {
        super(topRecommendVM, dmtStatusView, jVar);
        l.d(topRecommendVM, "");
        l.d(dmtStatusView, "");
        l.d(jVar, "");
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j, com.ss.android.ugc.aweme.following.ui.controller.a
    public final void a(f fVar, e eVar, List<? extends User> list) {
        l.d(fVar, "");
        l.d(eVar, "");
        com.ss.android.ugc.aweme.social.a.c.d();
    }
}
