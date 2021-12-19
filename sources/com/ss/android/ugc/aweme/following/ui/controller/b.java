package com.ss.android.ugc.aweme.following.ui.controller;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.following.ui.viewmodel.TopRecommendVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.a.c;
import com.ss.android.ugc.aweme.social.widget.card.a.e;
import com.ss.android.ugc.aweme.social.widget.card.a.f;
import com.ss.android.ugc.aweme.social.widget.card.j;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.List;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<Fragment> f96495d;

    static {
        Covode.recordClassIndex(61112);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j, com.ss.android.ugc.aweme.following.ui.controller.a
    public final void a(User user) {
        l.d(user, "");
        c.d();
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.j, com.ss.android.ugc.aweme.following.ui.controller.a
    public final void a(f fVar, e eVar, List<? extends User> list) {
        l.d(fVar, "");
        l.d(eVar, "");
        c.d();
        Fragment fragment = this.f96495d.get();
        if (fragment != null && fragment.isResumed() && eVar == e.ON_AUTHORIZE && list != null && !list.isEmpty()) {
            if (fVar == f.CONTACT) {
                SmartRouter.buildRoute(fragment, "//friends/contacts").withParam("enter_from", "following_list").withParam("scene", 7).open();
            } else if (fVar == f.FACEBOOK) {
                SmartRouter.buildRoute(fragment, "//friend/find").withParam("enter_from", "following_list").withParam(StringSet.type, 3).withParam("scene", 7).open();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Fragment fragment, TopRecommendVM topRecommendVM, DmtStatusView dmtStatusView, j jVar) {
        super(topRecommendVM, dmtStatusView, jVar);
        l.d(fragment, "");
        l.d(topRecommendVM, "");
        l.d(dmtStatusView, "");
        l.d(jVar, "");
        this.f96495d = new WeakReference<>(fragment);
    }
}
