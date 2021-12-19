package com.ss.android.ugc.aweme.inbox.g;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.friends.ui.au;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.ss.android.ugc.aweme.inbox.af;
import com.ss.android.ugc.aweme.inbox.e;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class h extends g<af> {

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.follow.widet.a f104272g = new com.ss.android.ugc.aweme.follow.widet.a(this.f104275j, new a.g(this) {
        /* class com.ss.android.ugc.aweme.inbox.g.h.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f104276a;

        static {
            Covode.recordClassIndex(66772);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f104276a = r1;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
        public final void a(int i2, User user) {
            h.h();
            r.a().execute(new g(this.f104276a));
        }
    });

    /* renamed from: h  reason: collision with root package name */
    public Map<String, String> f104273h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.recommend.a f104274i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.following.ui.view.a f104275j;

    static {
        Covode.recordClassIndex(66771);
    }

    public static void h() {
        com.ss.android.ugc.aweme.inbox.f.a(a.f104277a);
    }

    public final User f() {
        return ((af) c()).f104041a;
    }

    public final void g() {
        r.a().execute(new e(this));
    }

    public final boolean i() {
        Context requireContext = d().requireContext();
        l.b(requireContext, "");
        if (fe.a(requireContext)) {
            return false;
        }
        new com.bytedance.tux.g.b(d()).e(R.string.de8).b();
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f104281a;

        static {
            Covode.recordClassIndex(66778);
        }

        e(h hVar) {
            this.f104281a = hVar;
        }

        public final void run() {
            String str;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").a("rec_type", this.f104281a.f().getRecType()).a("rec_uid", this.f104281a.f().getUid());
            RecommendUserVM e2 = this.f104281a.e();
            String uid = this.f104281a.f().getUid();
            String str2 = "";
            l.b(uid, str2);
            r.a("close_recommend_user_cell", a2.a("impr_order", e2.a(uid)).a("relation_type", this.f104281a.f().getFriendTypeStr()).a("req_id", this.f104281a.f().getRequestId()).f66730a);
            u a3 = new u().a("notification_page");
            a3.f109596a = u.c.CARD;
            a3.f109597b = u.a.CLOSE;
            u s = a3.a(this.f104281a.f()).s(this.f104281a.f().getRequestId());
            Map<String, String> map = this.f104281a.f104273h;
            if (!(map == null || (str = map.get("position")) == null)) {
                str2 = str;
            }
            s.p(str2).f();
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f104282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f104283b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f104284c;

        static {
            Covode.recordClassIndex(66779);
        }

        f(h hVar, User user, int i2) {
            this.f104282a = hVar;
            this.f104283b = user;
            this.f104284c = i2;
        }

        public final void run() {
            String str;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").a("rec_type", this.f104283b.getRecType()).a("to_user_id", this.f104283b.getUid()).a("impr_order", this.f104284c).a("req_id", this.f104283b.getRequestId()).a("impr_id", this.f104283b.getUid()).a("relation_type", this.f104283b.getFriendTypeStr()).a("follow_status", this.f104283b.getFollowStatus());
            String str2 = "";
            l.b(a2, str2);
            r.a("enter_personal_detail", eu.a(a2, this.f104283b).f66730a);
            u a3 = new u().a("notification_page");
            a3.f109596a = u.c.CARD;
            a3.f109597b = u.a.ENTER_PROFILE;
            u s = a3.a(this.f104283b).s(this.f104283b.getRequestId());
            Map<String, String> map = this.f104282a.f104273h;
            if (!(map == null || (str = map.get("position")) == null)) {
                str2 = str;
            }
            s.p(str2).f();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void a() {
        int followStatus;
        String str;
        if (c().f104039c == -2) {
            RecommendUserVM e2 = e();
            User user = ((af) c()).f104041a;
            l.d(user, "");
            if (user.getUid() != null && !e2.b().contains(user.getUid())) {
                Set<String> b2 = e2.b();
                String uid = user.getUid();
                l.b(uid, "");
                b2.add(uid);
                l.d(user, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "notification_page");
                String uid2 = user.getUid();
                l.b(uid2, "");
                linkedHashMap.put("to_user_id", uid2);
                if (user.getFollowStatus() == 0 && user.getFollowerStatus() == 1) {
                    followStatus = 3;
                } else {
                    followStatus = user.getFollowStatus();
                }
                linkedHashMap.put("follow_status", String.valueOf(followStatus));
                if (user.isPrivateAccount()) {
                    str = "1";
                } else {
                    str = "0";
                }
                linkedHashMap.put("is_private_account", str);
                r.a("invite_follow_cell_show", linkedHashMap);
            }
        } else if (c().f104039c == 2 && f().isShould_write_impr()) {
            e.a.f112592a.a(1, f().getUid());
            RecommendUserVM e3 = e();
            if (e3 != null) {
                User user2 = ((af) c()).f104041a;
                Map<String, String> map = this.f104273h;
                l.d(user2, "");
                l.d(map, "");
                if (!e3.f103997h.contains(user2.getUid())) {
                    r.a().execute(new RecommendUserVM.f(e3, user2, map));
                    Set<String> set = e3.f103997h;
                    String uid3 = user2.getUid();
                    l.b(uid3, "");
                    set.add(uid3);
                }
            }
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f104285a;

        static {
            Covode.recordClassIndex(66780);
        }

        g(h hVar) {
            this.f104285a = hVar;
        }

        public final void run() {
            String str;
            String str2;
            String str3;
            u.a aVar;
            String str4;
            if (this.f104285a.f().getFollowerStatus() == 1) {
                str = "mutual";
            } else {
                str = "single";
            }
            if (this.f104285a.f().getFollowStatus() == 0) {
                str2 = "follow";
            } else {
                str2 = "follow_cancel";
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "follow_button").a("enter_from", "notification_page").a("rec_type", this.f104285a.f().getRecType()).a("to_user_id", this.f104285a.f().getUid());
            RecommendUserVM e2 = this.f104285a.e();
            String uid = this.f104285a.f().getUid();
            String str5 = "";
            l.b(uid, str5);
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("impr_order", e2.a(uid)).a("req_id", this.f104285a.f().getRequestId()).a("relation_type", this.f104285a.f().getFriendTypeStr());
            Map<String, String> map = this.f104285a.f104273h;
            if (map == null || (str3 = map.get("position")) == null) {
                str3 = str5;
            }
            r.a(str2, a3.a("position", str3).a("follow_type", str).f66730a);
            u a4 = new u().a("notification_page");
            a4.f109596a = u.c.CARD;
            if (this.f104285a.f().getFollowStatus() == 0) {
                aVar = u.a.FOLLOW;
            } else {
                aVar = u.a.FOLLOW_CANCEL;
            }
            a4.f109597b = aVar;
            u s = a4.a(this.f104285a.f()).s(this.f104285a.f().getRequestId());
            Map<String, String> map2 = this.f104285a.f104273h;
            if (!(map2 == null || (str4 = map2.get("position")) == null)) {
                str5 = str4;
            }
            s.p(str5).f();
        }
    }

    public static final class c implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f104280a;

        static {
            Covode.recordClassIndex(66776);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(h hVar) {
            this.f104280a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            if (followStatus != null) {
                this.f104280a.f104274i.a(followStatus.followStatus, followStatus.followerStatus, null);
            }
            com.ss.android.ugc.aweme.friends.service.a aVar = com.ss.android.ugc.aweme.friends.service.a.f97047a;
            View view = this.f104280a.itemView;
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            aVar.a(3, "notification_page", "follow", context);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<e.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104277a = new a();

        static {
            Covode.recordClassIndex(66774);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e.a aVar) {
            e.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.b();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void b(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        super.b(bVar);
        this.f104274i.a(bVar);
    }

    static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f104278a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f104279b;

        static {
            Covode.recordClassIndex(66775);
        }

        b(h hVar, boolean z) {
            this.f104278a = hVar;
            this.f104279b = z;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.c
        public final boolean a(int i2) {
            INoticeService f2 = NoticeServiceImpl.f();
            View view = this.f104278a.itemView;
            l.b(view, "");
            return INoticeService.a.a(f2, view.getContext(), this.f104278a.f(), null, null, !this.f104279b, 12);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final /* synthetic */ void a(af afVar) {
        af afVar2 = afVar;
        l.d(afVar2, "");
        this.f104273h = afVar2.f104040d;
        boolean d2 = IMUnder16ProxyImpl.n().d();
        if (in.d() || d2) {
            this.f104274i.a(false);
        } else {
            this.f104274i.a(true);
        }
        this.f104274i.a(f());
        com.ss.android.ugc.aweme.follow.widet.a aVar = this.f104272g;
        if (aVar != null) {
            aVar.a(f());
        }
        com.ss.android.ugc.aweme.follow.widet.a aVar2 = this.f104272g;
        if (aVar2 != null) {
            aVar2.f96288e = new b(this, d2);
        }
        com.ss.android.ugc.aweme.follow.widet.a aVar3 = this.f104272g;
        if (aVar3 != null) {
            aVar3.f96287d = new c(this);
        }
        this.f104274i.setEventListener(new d(this, afVar2));
    }

    static final class d extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ af $data;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(66777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar, af afVar) {
            super(1);
            this.this$0 = hVar;
            this.$data = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            String str;
            boolean z;
            int intValue = num.intValue();
            if (intValue == au.f97191d) {
                User f2 = this.this$0.f();
                com.ss.android.ugc.aweme.follow.widet.a aVar = this.this$0.f104272g;
                if (aVar == null) {
                    l.b();
                }
                String uid = f2.getUid();
                String secUid = f2.getSecUid();
                int followStatus = f2.getFollowStatus();
                int followerStatus = f2.getFollowerStatus();
                if (f2.isSecret() || f2.isPrivateAccount()) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.a(uid, secUid, followStatus, followerStatus, z);
            } else if (intValue == au.f97190c) {
                h.h();
                h hVar = this.this$0;
                User f3 = hVar.f();
                SmartRoute withParam = SmartRouter.buildRoute(hVar.d().requireActivity(), "aweme://user/profile/" + f3.getUid()).withParam("sec_user_id", f3.getSecUid()).withParam("from_recommend_card", 1).withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", f3.getRecommendReason()).withParam("extra_mutual_relation", f3.getMutualStruct()).withParam("extra_from_mutual", true).withParam("recommend_from_type", "list").withParam("enter_from_request_id", this.$data.f104042b);
                Map<String, String> map = hVar.f104273h;
                if (map == null || (str = map.get("position")) == null) {
                    str = "";
                }
                withParam.withParam("position", str).withParam("recommend_enter_profile_params", new com.ss.android.ugc.aweme.recommend.g("notification_page", null, u.c.CARD, f3.getRecType(), g.a.a(f3), f3.getUid(), null, null, f3.getRequestId(), null, f3.getFriendTypeStr(), f3.getSocialInfo())).open();
                h hVar2 = this.this$0;
                User f4 = hVar2.f();
                RecommendUserVM e2 = this.this$0.e();
                String uid2 = this.this$0.f().getUid();
                l.b(uid2, "");
                r.a().execute(new f(hVar2, f4, e2.a(uid2)));
            } else if (intValue == au.f97192e && !this.this$0.i()) {
                this.this$0.e().a(this.$data);
                this.this$0.g();
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(com.ss.android.ugc.aweme.recommend.a aVar, int i2) {
        super(aVar.getView());
        l.d(aVar, "");
        this.f104274i = aVar;
        this.f104275j = aVar.getFollowBtn();
        if (i2 == 9) {
            a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.inbox.g.h.AnonymousClass2 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(66773);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.g();
                    return z.f158842a;
                }
            });
        }
    }
}
