package com.ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.bw.a.b;
import com.ss.android.ugc.aweme.common.d.c;
import com.ss.android.ugc.aweme.common.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.fy;
import com.ss.android.ugc.aweme.feed.adapter.au;
import com.ss.android.ugc.aweme.feed.adapter.ax;
import com.ss.android.ugc.aweme.feed.experiment.aj;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.feed.q.ao;
import com.ss.android.ugc.aweme.feed.u.ae;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ab;
import com.ss.android.ugc.aweme.profile.presenter.u;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView;
import com.ss.android.ugc.aweme.profile.ui.widget.h;
import com.ss.android.ugc.aweme.profile.ui.widget.l;
import com.ss.android.ugc.aweme.recommend.users.a;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class EmptyGuideV2 implements c<l>, d<ax>, e, ao, u, u {

    /* renamed from: a  reason: collision with root package name */
    public static final String f93195a = EmptyGuideV2.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public DmtStatusView f93196b;

    /* renamed from: c  reason: collision with root package name */
    public RecommendCommonUserView f93197c;

    /* renamed from: d  reason: collision with root package name */
    public RecommendSuperUserView f93198d;

    /* renamed from: e  reason: collision with root package name */
    public Activity f93199e;

    /* renamed from: f  reason: collision with root package name */
    public String f93200f;

    /* renamed from: g  reason: collision with root package name */
    public b f93201g;

    /* renamed from: h  reason: collision with root package name */
    public f f93202h = f.f_;

    /* renamed from: i  reason: collision with root package name */
    private final View f93203i;

    /* renamed from: j  reason: collision with root package name */
    private SimpleDMTDefaultView f93204j;

    /* renamed from: k  reason: collision with root package name */
    private List<String> f93205k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b f93206l;

    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.e
    public final View a() {
        return this.f93203i;
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.e
    public final void d() {
        b(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.e
    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        this.f93198d.a();
    }

    static {
        Covode.recordClassIndex(59106);
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        DmtStatusView dmtStatusView = this.f93196b;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
    }

    private boolean j() {
        RecommendCommonUserView recommendCommonUserView = this.f93197c;
        if (recommendCommonUserView != null && recommendCommonUserView.getVisibility() == 0) {
            return true;
        }
        RecommendSuperUserView recommendSuperUserView = this.f93198d;
        if (recommendSuperUserView == null || recommendSuperUserView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    private void g() {
        if (!a.f120113a.a(true) || SharePrefCache.inst().getIsContactsUploaded().c().booleanValue()) {
            i();
        } else {
            h();
        }
    }

    private void h() {
        i();
        if (SharePrefCache.inst().getIsEuropeCountry().c().booleanValue() || fy.b()) {
            this.f93204j.b();
        } else {
            this.f93204j.a(com.bytedance.ies.dmt.ui.widget.a.SOLID, R.drawable.aew, R.string.atp).a(new c(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.e
    public final void c() {
        com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b bVar = this.f93206l;
        if (bVar != null) {
            bVar.setRefreshing(false);
        }
        if (this.f93202h.e()) {
            if (fy.a()) {
                this.f93198d.setVisibility(8);
                this.f93198d.a();
            } else {
                this.f93197c.setVisibility(8);
            }
            a(com.ss.android.ugc.aweme.account.b.g().isLogin());
            this.f93202h.h();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.e
    @v(a = i.a.ON_RESUME)
    public void onResume() {
        RecommendSuperUserView recommendSuperUserView;
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isOnFollowPage(this.f93199e) && (recommendSuperUserView = this.f93198d) != null && recommendSuperUserView.getVisibility() == 0) {
            RecommendSuperUserView recommendSuperUserView2 = this.f93198d;
            RecyclerView recyclerView = recommendSuperUserView2.f93233a;
            if (recyclerView == null) {
                h.f.b.l.a("list");
            }
            GalleryLayoutManager galleryLayoutManager = recommendSuperUserView2.f93235c;
            if (galleryLayoutManager == null) {
                h.f.b.l.a("layoutManager");
            }
            RecyclerView.ViewHolder f2 = recyclerView.f(galleryLayoutManager.f93214b);
            if (f2 != null) {
                Objects.requireNonNull(f2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
                ((ax) f2).e();
            }
        }
    }

    private void e() {
        SimpleDMTDefaultView e2 = this.f93204j.e((int) n.b(this.f93199e, 7.0f));
        int b2 = (int) n.b(this.f93199e, 16.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e2.f93238a.getLayoutParams();
        marginLayoutParams.topMargin = b2;
        e2.f93238a.setLayoutParams(marginLayoutParams);
        e2.d(n.b(this.f93199e) / 5).a((int) n.b(this.f93199e, 247.0f)).f93239b.setVisibility(8);
    }

    private void f() {
        if (a.f120113a.b()) {
            this.f93204j.a("").d((n.b(this.f93199e) - ((int) n.b(this.f93199e, 172.0f))) / 2).a((int) n.b(this.f93199e, 180.0f)).c(R.string.ez4).a().a(com.bytedance.ies.dmt.ui.widget.a.SOLID, -1, R.string.eyp).a(new a(this));
        } else {
            this.f93204j.b(R.string.dij).c(R.string.bzc).a(com.bytedance.ies.dmt.ui.widget.a.SOLID, -1, R.string.czh).a(new b(this));
        }
    }

    private void i() {
        if (fy.b()) {
            this.f93204j.b(R.string.byz).c().c(R.string.byy).d(((int) n.b(this.f93199e, 58.0f)) + (n.b(this.f93199e) / 13)).e((int) n.b(this.f93199e, 12.0f)).b();
            return;
        }
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin() || com.ss.android.ugc.aweme.account.b.g().getCurUser().getFollowingCount() == 0) {
            this.f93204j.b(R.string.bzk);
        } else {
            this.f93204j.a("");
        }
        this.f93204j.c(R.string.bzc).b();
    }

    public final void b() {
        com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b bVar = this.f93206l;
        if (bVar != null) {
            bVar.setRefreshing(false);
        }
        if (this.f93202h.e()) {
            a(com.ss.android.ugc.aweme.account.b.g().isLogin());
            if (fy.a()) {
                this.f93198d.setVisibility(0);
                this.f93198d.setOnViewFirstShowListener(this);
            } else {
                this.f93197c.setVisibility(0);
                this.f93197c.setReminderText(R.string.ey_);
                this.f93197c.setBackgroundResource(R.color.c9);
                this.f93197c.setOnViewAttachedToWindowListener(this);
            }
            this.f93202h.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void b(RecommendList recommendList) {
        a(recommendList);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // com.ss.android.ugc.aweme.common.d.c
    public final /* synthetic */ void a(l lVar) {
        User user;
        l lVar2 = lVar;
        if (lVar2 != null && (user = lVar2.f117459e) != null) {
            b(user);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // com.ss.android.ugc.aweme.common.d.d
    public final /* synthetic */ void b(ax axVar) {
        User user;
        UserWithAweme userWithAweme = axVar.f91626i;
        if (userWithAweme != null && (user = userWithAweme.getUser()) != null) {
            b(user);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.e
    public final void a(com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b bVar) {
        this.f93206l = bVar;
        a(com.ss.android.ugc.aweme.account.b.g().isLogin());
        b(false);
    }

    private void b(User user) {
        if (this.f93205k == null) {
            this.f93205k = new ArrayList();
        }
        if (!this.f93205k.contains(user.getUid())) {
            com.ss.android.ugc.aweme.feed.w.a.a(user, "impression", a(user), this.f93200f, "cold_launch");
            this.f93205k.add(user.getUid());
        }
    }

    public final int a(User user) {
        b bVar = this.f93201g;
        if (bVar instanceof ab) {
            return ((ab) bVar).a(user.getUid());
        }
        if (bVar instanceof ae) {
            return ((ae) bVar).a(user.getUid());
        }
        if (user != null) {
            return 0;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void a(RecommendList recommendList) {
        boolean z;
        DmtStatusView dmtStatusView = this.f93196b;
        if (dmtStatusView != null) {
            dmtStatusView.d();
        }
        if (recommendList == null || recommendList.getUserList() == null || recommendList.getUserList().size() <= 0) {
            c();
            return;
        }
        this.f93200f = recommendList.getRid();
        this.f93197c.a(recommendList.getUserList(), recommendList.getRid());
        boolean hasMore = recommendList.hasMore();
        RecommendCommonUserView recommendCommonUserView = this.f93197c;
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin() || !hasMore) {
            z = false;
        } else {
            z = true;
        }
        recommendCommonUserView.setShowLookMore(z);
        if (fy.b()) {
            RecommendCommonUserView recommendCommonUserView2 = this.f93197c;
            if (recommendCommonUserView2.f117373e != null) {
                recommendCommonUserView2.f117373e.b(0);
            }
        }
        this.f93197c.setOnItemOperationListener(new h.b() {
            /* class com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.AnonymousClass4 */

            static {
                Covode.recordClassIndex(59110);
            }

            @Override // com.ss.android.ugc.aweme.profile.ui.widget.h.b
            public final void a() {
                if (com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                    ((ab) EmptyGuideV2.this.f93201g).a(30, com.ss.android.ugc.aweme.account.b.g().getCurUserId(), 2, com.ss.android.ugc.aweme.utils.permission.d.a(), 2, null);
                } else {
                    EmptyGuideV2.this.f93197c.post(new d(this));
                }
            }

            @Override // com.ss.android.ugc.aweme.profile.ui.widget.h.b
            public final void c(User user) {
                com.ss.android.ugc.aweme.feed.w.a.a(user, "enter_profile", EmptyGuideV2.this.a(user), EmptyGuideV2.this.f93200f, "cold_launch");
                com.ss.android.ugc.aweme.feed.w.a.a(EmptyGuideV2.this.f93200f, user);
            }

            @Override // com.ss.android.ugc.aweme.profile.ui.widget.h.b
            public final void b(User user) {
                if (user.getFollowStatus() == 0) {
                    com.ss.android.ugc.aweme.feed.w.a.a(user, "follow", EmptyGuideV2.this.a(user), EmptyGuideV2.this.f93200f, "cold_launch");
                    com.ss.android.ugc.aweme.feed.w.a.a(user);
                    return;
                }
                com.ss.android.ugc.aweme.feed.w.a.a(user, "follow_cancel", EmptyGuideV2.this.a(user), EmptyGuideV2.this.f93200f, "cold_launch");
                com.ss.android.ugc.aweme.feed.w.a.b(user);
            }

            @Override // com.ss.android.ugc.aweme.profile.ui.widget.h.b
            public final void a(User user) {
                com.ss.android.ugc.aweme.feed.w.a.a(user, "delete", EmptyGuideV2.this.a(user), EmptyGuideV2.this.f93200f, "cold_launch");
                if (EmptyGuideV2.this.f93201g != null) {
                    ((ab) EmptyGuideV2.this.f93201g).a(user);
                }
            }
        });
        this.f93197c.setOnLookMoreUserListener(new RecommendCommonUserView.a() {
            /* class com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2.AnonymousClass5 */

            static {
                Covode.recordClassIndex(59111);
            }

            @Override // com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView.a
            public final void a() {
                SmartRouter.buildRoute(EmptyGuideV2.this.f93199e, "//friends/find").withParam("previous_page", "").open();
                r.a("click_add_friends", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_follow").a("enter_method", "click_card").a("trigger_reason", "cold_launch_non_login").f66730a);
            }
        });
        b();
    }

    private void b(boolean z) {
        String str;
        if (this.f93202h.e()) {
            c();
            if (this.f93206l != null && j()) {
                this.f93206l.setRefreshing(true);
            }
            if (fy.a()) {
                if (this.f93201g == null) {
                    this.f93201g = new ae(new au(), this);
                }
                b bVar = this.f93201g;
                if (bVar instanceof ae) {
                    ((ae) bVar).a();
                }
            } else if (z || this.f93201g == null || fy.b()) {
                if (this.f93201g == null) {
                    this.f93201g = new ab(new RecommendCommonUserModel(), this);
                }
                b bVar2 = this.f93201g;
                if (bVar2 instanceof ab) {
                    ab abVar = (ab) bVar2;
                    if (com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                        str = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
                    } else {
                        str = "0";
                    }
                    abVar.a(str, com.ss.android.ugc.aweme.utils.permission.d.a(), com.bytedance.ies.abmock.b.a().a(true, "show_super_accounts_to_unlogged_users", 0));
                }
            } else {
                return;
            }
            DmtStatusView dmtStatusView = this.f93196b;
            if (dmtStatusView != null) {
                dmtStatusView.f();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.e
    public final void a(com.ss.android.ugc.aweme.challenge.d.c cVar) {
        if (cVar.f69921b instanceof User) {
            RecommendCommonUserView recommendCommonUserView = this.f93197c;
            int i2 = 0;
            if (recommendCommonUserView == null || com.bytedance.common.utility.collection.b.a((Collection) recommendCommonUserView.getData())) {
                RecommendSuperUserView recommendSuperUserView = this.f93198d;
                if (recommendSuperUserView != null && !com.bytedance.common.utility.collection.b.a((Collection) recommendSuperUserView.getMCardItems())) {
                    List<UserWithAweme> mCardItems = this.f93198d.getMCardItems();
                    User user = (User) cVar.f69921b;
                    int size = mCardItems.size();
                    while (i2 < size) {
                        User user2 = mCardItems.get(i2).getUser();
                        if (TextUtils.equals(user2.getUid(), user.getUid())) {
                            user2.setFollowStatus(cVar.f69920a);
                            if (this.f93201g instanceof ae) {
                                RecommendSuperUserView recommendSuperUserView2 = this.f93198d;
                                if (recommendSuperUserView2.f93235c == null) {
                                    h.f.b.l.a("layoutManager");
                                    return;
                                }
                                GalleryLayoutManager galleryLayoutManager = recommendSuperUserView2.f93235c;
                                if (galleryLayoutManager == null) {
                                    h.f.b.l.a("layoutManager");
                                }
                                Iterator<GalleryLayoutManager.c> it = galleryLayoutManager.f93222j.iterator();
                                while (it.hasNext()) {
                                    it.next().h();
                                }
                                return;
                            }
                            return;
                        }
                        i2++;
                    }
                    return;
                }
                return;
            }
            List<User> data = this.f93197c.getData();
            User user3 = (User) cVar.f69921b;
            int size2 = data.size();
            while (i2 < size2) {
                User user4 = data.get(i2);
                if (TextUtils.equals(user4.getUid(), user3.getUid())) {
                    user4.setFollowStatus(cVar.f69920a);
                    b bVar = this.f93201g;
                    if (bVar instanceof ab) {
                        ((ab) bVar).a(data);
                        this.f93197c.a(data, user4.getRequestId());
                        return;
                    }
                    return;
                }
                i2++;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void a(Exception exc) {
        DmtStatusView dmtStatusView = this.f93196b;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b bVar = this.f93206l;
        if (bVar != null) {
            bVar.setRefreshing(false);
        }
        if (exc instanceof com.ss.android.ugc.aweme.base.api.a.a.c) {
            c();
        } else {
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) this.f93199e, (Throwable) exc, (int) R.string.g4j);
        }
    }

    public final void a(boolean z) {
        e();
        if (z || fy.b()) {
            g();
        } else {
            f();
        }
    }

    public EmptyGuideV2(Fragment fragment, f fVar) {
        MethodCollector.i(10333);
        e activity = fragment.getActivity();
        this.f93199e = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.z9, (ViewGroup) null);
        this.f93203i = inflate;
        this.f93204j = (SimpleDMTDefaultView) inflate.findViewById(R.id.ajn);
        this.f93197c = (RecommendCommonUserView) inflate.findViewById(R.id.fje);
        RecommendSuperUserView recommendSuperUserView = (RecommendSuperUserView) inflate.findViewById(R.id.eew);
        this.f93198d = recommendSuperUserView;
        recommendSuperUserView.setContainer(new WeakReference<>(this.f93199e));
        if (aj.a()) {
            ViewGroup.LayoutParams layoutParams = this.f93198d.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (((((float) n.a(this.f93199e)) * 0.712f) * 1.34f) / 0.93f);
            }
            this.f93198d.setLayoutParams(layoutParams);
        }
        DmtStatusView dmtStatusView = (DmtStatusView) inflate.findViewById(R.id.e_o);
        this.f93196b = dmtStatusView;
        dmtStatusView.setBuilder(DmtStatusView.a.a(this.f93199e));
        a(com.ss.android.ugc.aweme.account.b.g().isLogin());
        this.f93202h = fVar;
        fragment.getLifecycle().a(this);
        MethodCollector.o(10333);
    }
}
