package com.ss.android.ugc.aweme.discover.j;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.ss.android.ugc.aweme.challenge.d.c;
import com.ss.android.ugc.aweme.discover.adapter.al;
import com.ss.android.ugc.aweme.discover.mob.o;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.ui.ac;
import com.ss.android.ugc.aweme.discover.ui.bh;
import com.ss.android.ugc.aweme.following.ui.adapter.d;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.search.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;

public final class q extends bh<SearchUser> implements r {

    /* renamed from: a  reason: collision with root package name */
    public w f81304a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f81305b;

    static {
        Covode.recordClassIndex(50522);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final View a(int i2) {
        if (this.f81305b == null) {
            this.f81305b = new SparseArray();
        }
        View view = (View) this.f81305b.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f81305b.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final void aT_() {
        SparseArray sparseArray = this.f81305b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final String c() {
        return "user";
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void c(FollowStatus followStatus) {
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.discover.ui.av
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(3, new g(q.class, "onFollowStatus", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(13, new g(q.class, "onProfileFollowEvent", c.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    public q() {
        this.t = j.f121155c;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.discover.ui.bh, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public final void onDestroyView() {
        super.onDestroyView();
        w wVar = this.f81304a;
        if (wVar != null) {
            wVar.cd_();
        }
        aT_();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void m() {
        a(new al(this.r, v(), new a(), this, "search_result"));
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void i() {
        a(new s());
        n().a_((com.ss.android.ugc.aweme.common.e.c) this);
        w i2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.i();
        this.f81304a = i2;
        if (i2 == null) {
            l.b();
        }
        i2.a(this);
        n().a((ac) this);
    }

    final class a implements d {
        static {
            Covode.recordClassIndex(50523);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // com.ss.android.ugc.aweme.following.ui.adapter.d
        public final void a(View view, User user, int i2, String str, String str2) {
            l.d(view, "");
            l.d(user, "");
            l.d(str, "");
            String u = q.this.u();
            String requestId = user.getRequestId();
            String uid = user.getUid();
            String a2 = o.a(q.this.u());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String uid2 = user.getUid();
            l.b(uid2, "");
            linkedHashMap.put("search_result_id", uid2);
            linkedHashMap.put("previous_page", "search_result");
            o.a(view, i2, u, 0, requestId, uid, a2, str, linkedHashMap);
            SmartRouter.buildRoute(q.this.getActivity(), "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "search_result").withParam("previous_page", "search_result").withParam("extra_from_pre_page", "search_result").withParam("extra_from_event_enter_from", "search_result").withParam("profile_enterprise_type", user.getCommerceUserLevel()).withParam("extra_previous_page_position", "main_head").withParam("search_request_id", user.getRequestId()).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void b(FollowStatus followStatus) {
        l.d(followStatus, "");
        if (ab_()) {
            a(followStatus);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onFollowStatus(FollowStatusEvent followStatusEvent) {
        l.d(followStatusEvent, "");
        a(followStatusEvent.status);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void d_(Exception exc) {
        l.d(exc, "");
        if (ab_()) {
            CaptchaHelperServiceImpl.a();
            com.ss.android.ugc.aweme.app.api.b.a.a(getContext(), (Throwable) exc, (int) R.string.bz9);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onProfileFollowEvent(c cVar) {
        l.d(cVar, "");
        if (cVar.f69921b instanceof User) {
            Object obj = cVar.f69921b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            FollowStatus followStatus = new FollowStatus();
            followStatus.userId = ((User) obj).getUid();
            followStatus.followStatus = cVar.f69920a;
            a(followStatus);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.discover.ui.av
    public final void b(List<? extends SearchUser> list, boolean z) {
        g<?> n = n();
        l.d(n, "");
        super.b(list, ((s) n).d());
    }
}
