package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.service.h;
import com.ss.android.ugc.aweme.profile.ui.widget.AvatarImageWithVerifyMus;
import com.ss.android.ugc.aweme.profile.ui.widget.i;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class cw extends RecyclerView.ViewHolder implements View.OnClickListener, r {
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AvatarImageWithVerifyMus f117101a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f117102b;

    /* renamed from: c  reason: collision with root package name */
    public MutualRelationView f117103c;

    /* renamed from: d  reason: collision with root package name */
    public TuxTextView f117104d;

    /* renamed from: e  reason: collision with root package name */
    public User f117105e;

    /* renamed from: f  reason: collision with root package name */
    public int f117106f;

    /* renamed from: g  reason: collision with root package name */
    public b f117107g;

    /* renamed from: h  reason: collision with root package name */
    public c f117108h;

    /* renamed from: i  reason: collision with root package name */
    public Context f117109i;

    /* renamed from: j  reason: collision with root package name */
    public i.b f117110j;

    /* renamed from: k  reason: collision with root package name */
    public View f117111k;

    /* renamed from: l  reason: collision with root package name */
    public String f117112l;

    /* renamed from: m  reason: collision with root package name */
    public String f117113m;
    public Integer n;
    private TextView p;
    private w q;
    private int r;
    private TuxIconView s;
    private View t;

    public interface b {
        static {
            Covode.recordClassIndex(75624);
        }

        void a(User user, int i2);
    }

    public interface c {
        static {
            Covode.recordClassIndex(75625);
        }

        void a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f117114a;

        static {
            Covode.recordClassIndex(75627);
        }

        e(h.f.a.a aVar) {
            this.f117114a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final /* synthetic */ void a() {
            l.b(this.f117114a.invoke(), "");
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }
    }

    static {
        Covode.recordClassIndex(75622);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75623);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class d extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(75626);
        }

        d(cw cwVar) {
            super(0, cwVar, cw.class, "follow", "follow()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((cw) this.receiver).a();
            return z.f158842a;
        }
    }

    public static float b() {
        if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
            return 160.0f;
        }
        return 130.0f;
    }

    private static float e() {
        if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
            return 120.0f;
        }
        return 72.0f;
    }

    private static int f() {
        if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
            return 61;
        }
        return 71;
    }

    private final String d() {
        int i2 = this.r;
        if (i2 == 1) {
            return "homepage_follow";
        }
        if (i2 != 2) {
            return "others_homepage";
        }
        return "homepage_friends";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r0.isPrivateAccount() != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c() {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.cw.c():void");
    }

    public final void a() {
        c cVar;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        Activity activity = null;
        if (!g2.isLogin()) {
            com.ss.android.ugc.aweme.login.c.a(com.bytedance.ies.ugc.appcontext.f.j(), "homepage_follow", "click_follow_tab", (Bundle) null, new e(new d(this)));
            return;
        }
        User user = this.f117105e;
        if (user == null) {
            l.a("mUser");
        }
        if (user.getFollowStatus() == 0 && (cVar = this.f117108h) != null) {
            cVar.a();
        }
        Context context = this.f117109i;
        if (context instanceof Activity) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            activity = (Activity) context;
        }
        User user2 = this.f117105e;
        if (user2 == null) {
            l.a("mUser");
        }
        char c2 = 2;
        if (user2.getFollowStatus() != 0) {
            c2 = 0;
        } else {
            User user3 = this.f117105e;
            if (user3 == null) {
                l.a("mUser");
            }
            if (user3.isSecret()) {
                c2 = 4;
            } else {
                User user4 = this.f117105e;
                if (user4 == null) {
                    l.a("mUser");
                }
                if (user4.getFollowerStatus() != 1) {
                    c2 = 1;
                }
            }
        }
        User user5 = this.f117105e;
        if (user5 == null) {
            l.a("mUser");
        }
        if (user5.getFollowStatus() == 4) {
            if (activity == null) {
                return;
            }
        } else if (c2 == 4) {
            if (activity != null) {
                a(activity);
            } else {
                return;
            }
        }
        c();
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void d_(Exception exc) {
        int i2;
        if (!h.f116622a.shouldDoCaptcha(exc)) {
            Activity a2 = o.a(this.f117109i);
            l.b(a2, "");
            com.ss.android.ugc.aweme.common.l.a(a2, exc);
        }
        Integer num = this.n;
        User user = this.f117105e;
        if (user == null) {
            l.a("mUser");
        }
        a(num, user.getFollowerStatus());
        User user2 = this.f117105e;
        if (user2 == null) {
            l.a("mUser");
        }
        Integer num2 = this.n;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        user2.setFollowStatus(i2);
    }

    private static void a(Activity activity) {
        com.bytedance.tux.dialog.e eVar;
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<Integer> privacyAccountFollowCount = inst.getPrivacyAccountFollowCount();
        l.b(privacyAccountFollowCount, "");
        Integer c2 = privacyAccountFollowCount.c();
        if (c2 != null && c2.intValue() == 0) {
            eVar.a(((com.bytedance.tux.dialog.e) new com.bytedance.tux.dialog.e(activity).b(R.string.evb)).o.getText(R.string.cc_), false, null).a().b().show();
        } else {
            l.b(c2, "");
            int intValue = c2.intValue();
            if (1 <= intValue && 3 >= intValue) {
                new com.bytedance.tux.g.b(activity).e(R.string.evc).b();
            }
        }
        privacyAccountFollowCount.b(Integer.valueOf(c2.intValue() + 1));
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void b(FollowStatus followStatus) {
        l.d(followStatus, "");
        String str = followStatus.userId;
        User user = this.f117105e;
        if (user == null) {
            l.a("mUser");
        }
        if (TextUtils.equals(str, user.getUid())) {
            User user2 = this.f117105e;
            if (user2 == null) {
                l.a("mUser");
            }
            user2.setFollowStatus(followStatus.followStatus);
            int i2 = followStatus.followStatus;
            User user3 = this.f117105e;
            if (user3 == null) {
                l.a("mUser");
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.challenge.d.c(i2, user3));
            IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
            a(Integer.valueOf(followStatus.followStatus), followStatus.followerStatus);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void c(FollowStatus followStatus) {
        l.d(followStatus, "");
        this.n = Integer.valueOf(followStatus.followStatus);
        String d2 = d();
        String str = followStatus.userId;
        l.b(str, "");
        if (followStatus.followStatus == 0) {
            com.ss.android.ugc.aweme.common.r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", d2).a("to_user_id", str).f66730a);
        } else {
            com.ss.android.ugc.aweme.common.r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", d2).a("to_user_id", str).f66730a);
        }
    }

    public final void onClick(View view) {
        boolean z;
        u.a aVar;
        ClickAgent.onClick(view);
        l.d(view, "");
        int id = view.getId();
        if (id == R.id.a7h) {
            b bVar = this.f117107g;
            if (bVar != null) {
                User user = this.f117105e;
                if (user == null) {
                    l.a("mUser");
                }
                bVar.a(user, this.f117106f);
            }
            u a2 = new u().a("others_homepage");
            a2.f109596a = u.c.CARD;
            a2.f109597b = u.a.CLOSE;
            User user2 = this.f117105e;
            if (user2 == null) {
                l.a("mUser");
            }
            a2.a(user2).s(this.f117112l).p("top").t(this.f117113m).f();
        } else if (id == R.id.or) {
            i.b bVar2 = this.f117110j;
            if (bVar2 != null) {
                User user3 = this.f117105e;
                if (user3 == null) {
                    l.a("mUser");
                }
                bVar2.d(user3);
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(this.f117109i, "aweme://user/profile/");
            User user4 = this.f117105e;
            if (user4 == null) {
                l.a("mUser");
            }
            SmartRoute withParam = buildRoute.withParam("uid", user4.getUid());
            User user5 = this.f117105e;
            if (user5 == null) {
                l.a("mUser");
            }
            SmartRoute withParam2 = withParam.withParam("sec_user_id", user5.getSecUid()).withParam("enter_from", d()).withParam("enter_from_request_id", this.f117112l).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1);
            User user6 = this.f117105e;
            if (user6 == null) {
                l.a("mUser");
            }
            SmartRoute withParam3 = withParam2.withParam("previous_recommend_reason", user6.getRecommendReason()).withParam("recommend_from_type", "card").withParam("position", "top");
            u.c cVar = u.c.CARD;
            User user7 = this.f117105e;
            if (user7 == null) {
                l.a("mUser");
            }
            String recType = user7.getRecType();
            User user8 = this.f117105e;
            if (user8 == null) {
                l.a("mUser");
            }
            u.b a3 = g.a.a(user8);
            User user9 = this.f117105e;
            if (user9 == null) {
                l.a("mUser");
            }
            String uid = user9.getUid();
            String str = this.f117112l;
            String str2 = this.f117113m;
            User user10 = this.f117105e;
            if (user10 == null) {
                l.a("mUser");
            }
            String friendTypeStr = user10.getFriendTypeStr();
            User user11 = this.f117105e;
            if (user11 == null) {
                l.a("mUser");
            }
            withParam3.withParam("recommend_enter_profile_params", new g("others_homepage", null, cVar, recType, a3, uid, null, null, str, str2, friendTypeStr, user11.getSocialInfo())).open();
            u a4 = new u().a("others_homepage");
            a4.f109596a = u.c.CARD;
            a4.f109597b = u.a.ENTER_PROFILE;
            User user12 = this.f117105e;
            if (user12 == null) {
                l.a("mUser");
            }
            a4.a(user12).s(this.f117112l).p("top").t(this.f117113m).f();
        } else if (id == R.id.b7a) {
            boolean d2 = IMUnder16ProxyImpl.n().d();
            INoticeService f2 = NoticeServiceImpl.f();
            Context context = this.f117109i;
            User user13 = this.f117105e;
            if (user13 == null) {
                l.a("mUser");
            }
            if (d2 || !com.ss.android.ugc.aweme.im.service.c.d.b()) {
                z = false;
            } else {
                z = true;
            }
            if (!f2.a(context, user13, "others_homepage", "card", z)) {
                i.b bVar3 = this.f117110j;
                if (bVar3 != null) {
                    User user14 = this.f117105e;
                    if (user14 == null) {
                        l.a("mUser");
                    }
                    bVar3.c(user14);
                }
                u a5 = new u().a("others_homepage");
                a5.f109596a = u.c.CARD;
                User user15 = this.f117105e;
                if (user15 == null) {
                    l.a("mUser");
                }
                if (user15.getFollowStatus() == 0) {
                    aVar = u.a.FOLLOW;
                } else {
                    aVar = u.a.FOLLOW_CANCEL;
                }
                a5.f109597b = aVar;
                User user16 = this.f117105e;
                if (user16 == null) {
                    l.a("mUser");
                }
                a5.a(user16).s(this.f117112l).p("top").t(this.f117113m).f();
                a();
                com.ss.android.ugc.aweme.friends.service.a aVar2 = com.ss.android.ugc.aweme.friends.service.a.f97047a;
                User user17 = this.f117105e;
                if (user17 == null) {
                    l.a("mUser");
                }
                if (aVar2.a(user17)) {
                    com.ss.android.ugc.aweme.friends.service.a.f97047a.a(3, "others_homepage", "follow", this.f117109i);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cw(View view, int i2) {
        super(view);
        float f2;
        float f3;
        int i3;
        l.d(view, "");
        Context context = view.getContext();
        l.b(context, "");
        this.f117109i = context;
        View findViewById = view.findViewById(R.id.or);
        l.b(findViewById, "");
        this.f117101a = (AvatarImageWithVerifyMus) findViewById;
        View findViewById2 = view.findViewById(R.id.p3);
        l.b(findViewById2, "");
        this.t = findViewById2;
        View findViewById3 = view.findViewById(R.id.dqe);
        l.b(findViewById3, "");
        this.f117111k = findViewById3;
        View findViewById4 = view.findViewById(R.id.fdm);
        l.b(findViewById4, "");
        this.f117102b = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dii);
        l.b(findViewById5, "");
        this.f117103c = (MutualRelationView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dig);
        l.b(findViewById6, "");
        this.f117104d = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.b7a);
        l.b(findViewById7, "");
        this.p = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.a7h);
        l.b(findViewById8, "");
        TuxIconView tuxIconView = (TuxIconView) findViewById8;
        this.s = tuxIconView;
        tuxIconView.setOnClickListener(this);
        this.s.setVisibility(0);
        this.f117101a.setOnClickListener(this);
        this.p.setOnClickListener(this);
        if (this.q == null) {
            w i4 = com.ss.android.ugc.aweme.friends.service.a.f97047a.i();
            this.q = i4;
            if (i4 != null) {
                i4.a(this);
            }
        }
        this.r = i2;
        this.f117111k.setBackgroundResource(R.color.v);
        ViewGroup.LayoutParams layoutParams = this.f117111k.getLayoutParams();
        float b2 = b();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, b2, system.getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams2 = this.f117101a.getLayoutParams();
        l.b(layoutParams2, "");
        float e2 = e();
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        layoutParams2.width = h.g.a.a(TypedValue.applyDimension(1, e2, system2.getDisplayMetrics()));
        float e3 = e();
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        layoutParams2.height = h.g.a.a(TypedValue.applyDimension(1, e3, system3.getDisplayMetrics()));
        this.f117101a.setLayoutParams(layoutParams2);
        this.t.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.p.getLayoutParams();
        l.b(layoutParams3, "");
        if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
            f2 = 136.0f;
        } else {
            f2 = 106.0f;
        }
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        layoutParams3.width = h.g.a.a(TypedValue.applyDimension(1, f2, system4.getDisplayMetrics()));
        this.p.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.f117111k.getLayoutParams();
        l.b(layoutParams4, "");
        if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
            f3 = 226.0f;
        } else {
            f3 = 176.0f;
        }
        Resources system5 = Resources.getSystem();
        l.a((Object) system5, "");
        layoutParams4.height = h.g.a.a(TypedValue.applyDimension(1, f3, system5.getDisplayMetrics()));
        this.f117111k.setLayoutParams(layoutParams4);
        this.f117104d.setTuxFont(f());
        TuxTextView tuxTextView = this.f117104d;
        if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
            i3 = 144;
        } else {
            i3 = 114;
        }
        float f4 = (float) i3;
        Resources system6 = Resources.getSystem();
        l.a((Object) system6, "");
        tuxTextView.setMaxWidth(h.g.a.a(TypedValue.applyDimension(1, f4, system6.getDisplayMetrics())));
        this.f117103c.setTuxTextSize(f());
        this.f117103c.setAllTextColorUseAttrResource(R.attr.bj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        if (r1 == null) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Integer r9, int r10) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.cw.a(java.lang.Integer, int):void");
    }
}
