package com.ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.m.a;
import com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.follow.NewFollowButton;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.metrics.v;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

public final class LikeCell extends PowerCell<af> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71295a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f71296b = h.i.a((h.f.a.a) d.f71302a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f71297j = h.i.a((h.f.a.a) new l(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f71298k = h.i.a((h.f.a.a) new c(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f71299l = h.i.a((h.f.a.a) new i(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f71300m = h.i.a((h.f.a.a) new h(this));
    private final h.h n = h.i.a((h.f.a.a) new f(this));
    private final h.h o = h.i.a((h.f.a.a) new e(this));
    private final u<Boolean> p = new g(this);

    static {
        Covode.recordClassIndex(43887);
    }

    private final LikeListVM d() {
        return (LikeListVM) this.f71297j.getValue();
    }

    private final SmartImageView e() {
        return (SmartImageView) this.f71298k.getValue();
    }

    private final MutualRelationView r() {
        return (MutualRelationView) this.f71300m.getValue();
    }

    public final NewFollowButton a() {
        return (NewFollowButton) this.n.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43888);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ LikeCell this$0;

        static {
            Covode.recordClassIndex(43890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LikeCell likeCell) {
            super(0);
            this.this$0 = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            return this.this$0.itemView.findViewById(R.id.bu0);
        }
    }

    static final class f extends m implements h.f.a.a<NewFollowButton> {
        final /* synthetic */ LikeCell this$0;

        static {
            Covode.recordClassIndex(43897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LikeCell likeCell) {
            super(0);
            this.this$0 = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NewFollowButton invoke() {
            return this.this$0.itemView.findViewById(R.id.yf);
        }
    }

    static final class h extends m implements h.f.a.a<MutualRelationView> {
        final /* synthetic */ LikeCell this$0;

        static {
            Covode.recordClassIndex(43899);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(LikeCell likeCell) {
            super(0);
            this.this$0 = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MutualRelationView invoke() {
            return this.this$0.itemView.findViewById(R.id.crw);
        }
    }

    static final class i extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ LikeCell this$0;

        static {
            Covode.recordClassIndex(43900);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(LikeCell likeCell) {
            super(0);
            this.this$0 = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.itemView.findViewById(R.id.f3c);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f71302a = new d();

        static {
            Covode.recordClassIndex(43891);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (!in.d() && !MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false).isChatFunOfflineUnder16()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class l extends m implements h.f.a.a<LikeListVM> {
        final /* synthetic */ LikeCell this$0;

        static {
            Covode.recordClassIndex(43903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(LikeCell likeCell) {
            super(0);
            this.this$0 = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LikeListVM invoke() {
            View view = this.this$0.itemView;
            h.f.b.l.b(view, "");
            Context context = view.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return LikeListVM.a.a((androidx.fragment.app.e) context);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void m() {
        super.m();
        d().j().removeObserver(this.p);
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.follow.widet.a> {
        final /* synthetic */ LikeCell this$0;

        static {
            Covode.recordClassIndex(43892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LikeCell likeCell) {
            super(0);
            this.this$0 = likeCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.follow.widet.a invoke() {
            com.ss.android.ugc.aweme.follow.widet.a aVar = new com.ss.android.ugc.aweme.follow.widet.a(this.this$0.a(), new a(this));
            aVar.f96288e = new a.c(this) {
                /* class com.ss.android.ugc.aweme.comment.adapter.LikeCell.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f71303a;

                static {
                    Covode.recordClassIndex(43893);
                }

                {
                    this.f71303a = r1;
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.c
                public final boolean a(int i2) {
                    LikeCell likeCell = this.f71303a.this$0;
                    af afVar = (af) likeCell.f34234d;
                    if (afVar == null || i2 != 2 || !likeCell.a().getShouldShowMessageText()) {
                        com.ss.android.ugc.aweme.comment.util.i.b("LikeCell", "tryEnterChat invalid:" + i2 + ", " + likeCell.a().getShouldShowMessageText());
                        return false;
                    }
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    View view = likeCell.itemView;
                    h.f.b.l.b(view, "");
                    createIIMServicebyMonsterPlugin.startChat(a.b.a(view.getContext(), IMUser.fromUser(afVar.f71333a)).c(afVar.f71334b.f71338c).b("like_list").e(afVar.f71334b.f71336a).d(a.C1620a.a(i2, afVar.f71333a.getFollowerStatus())).f(UGCMonitor.TYPE_POST).f103883a);
                    likeCell.a(u.a.ENTER_CHAT);
                    return true;
                }
            };
            aVar.f96287d = new a.d(this) {
                /* class com.ss.android.ugc.aweme.comment.adapter.LikeCell.e.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f71304a;

                static {
                    Covode.recordClassIndex(43894);
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.d
                public final void a() {
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.d
                public final void b() {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f71304a = r1;
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.d
                public final void a(FollowStatus followStatus) {
                    h.f.b.l.d(followStatus, "");
                    this.f71304a.this$0.a().a(followStatus.followStatus, followStatus.followerStatus);
                }
            };
            aVar.f96289f = AnonymousClass3.f71305a;
            return aVar;
        }

        public static final class a extends a.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f71306a;

            static {
                Covode.recordClassIndex(43896);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(e eVar) {
                this.f71306a = eVar;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final void a(int i2, User user) {
                String str;
                LikeCell likeCell = this.f71306a.this$0;
                af afVar = (af) likeCell.f34234d;
                if (afVar != null) {
                    if (i2 == 0) {
                        r.a("follow_cancel", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", afVar.f71334b.f71338c).a("enter_method", "like_list").a("group_id", afVar.f71334b.f71336a).a("to_user_id", afVar.f71333a.getUid()).a("story_type", UGCMonitor.TYPE_POST).f66730a);
                        likeCell.a(u.a.FOLLOW_CANCEL);
                        return;
                    }
                    v a2 = new v().a(afVar.f71334b.f71338c);
                    a2.s = "like_list";
                    a2.p = afVar.f71334b.f71336a;
                    a2.f109608e = afVar.f71333a.getUid();
                    a2.W = UGCMonitor.TYPE_POST;
                    User user2 = afVar.f71333a;
                    h.f.b.l.d(user2, "");
                    if (user2.getFollowerStatus() == 1) {
                        str = "mutual";
                    } else {
                        str = "single";
                    }
                    a2.v = str;
                    a2.f();
                    likeCell.a(u.a.FOLLOW);
                }
            }
        }
    }

    public final void b() {
        User user;
        af afVar = (af) this.f34234d;
        if (afVar != null && (user = afVar.f71333a) != null && !d().i().contains(user.getUid()) && a(u.a.SHOW)) {
            Set<String> i2 = d().i();
            String uid = user.getUid();
            h.f.b.l.b(uid, "");
            i2.add(uid);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeCell f71301a;

        static {
            Covode.recordClassIndex(43889);
        }

        b(LikeCell likeCell) {
            this.f71301a = likeCell;
        }

        public final void run() {
            View view = this.f71301a.itemView;
            View view2 = this.f71301a.itemView;
            h.f.b.l.b(view2, "");
            View view3 = this.f71301a.itemView;
            h.f.b.l.b(view3, "");
            ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "backgroundColor", view2.getResources().getColor(R.color.f159922f), view3.getResources().getColor(R.color.c9));
            h.f.b.l.b(ofInt, "");
            ofInt.setDuration(3000L);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.start();
            af afVar = (af) this.f71301a.f34234d;
            if (afVar != null) {
                afVar.f71335c = false;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        super.l();
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> j2 = d().j();
        View view = this.itemView;
        h.f.b.l.b(view, "");
        Context context = view.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        j2.observe((androidx.lifecycle.m) context, this.p);
        if (h.f.b.l.a((Object) d().j().getValue(), (Object) true)) {
            b();
        }
        af afVar = (af) this.f34234d;
        if (afVar != null && afVar.f71335c) {
            this.itemView.postDelayed(new b(this), 150);
        }
    }

    public final void c() {
        String str;
        Throwable th;
        af afVar = (af) this.f34234d;
        if (afVar != null) {
            User user = afVar.f71333a;
            q qVar = (q) new q().g(afVar.f71334b.f71337b).o(afVar.f71334b.f71338c).a("click_head");
            qVar.Y = "like_list";
            qVar.Z = "like_list";
            qVar.f109594e = afVar.f71334b.f71336a;
            qVar.V = a.C1620a.a(user.getFollowStatus(), user.getFollowerStatus());
            qVar.W = UGCMonitor.TYPE_POST;
            qVar.f();
            a(u.a.ENTER_PROFILE);
            if (a(user)) {
                try {
                    MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scene_type", u.c.CARD);
                    jSONObject.put("position", "like_list");
                    String recType = user.getRecType();
                    if (recType == null) {
                        recType = "";
                    }
                    jSONObject.put("rec_type", recType);
                    String relationType = matchedFriendStruct.getRelationType();
                    if (relationType == null) {
                        relationType = "";
                    }
                    jSONObject.put("relation_type", relationType);
                    jSONObject.put("to_user_id", user.getUid());
                    String requestId = user.getRequestId();
                    if (requestId == null) {
                        requestId = "";
                    }
                    jSONObject.put("req_id", requestId);
                    eu.a(jSONObject, user.getSocialInfo());
                    str = jSONObject.toString();
                    h.f.b.l.b(str, "");
                    try {
                        h.q.m223constructorimpl(z.f158842a);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = "";
                    h.q.m223constructorimpl(h.r.a(th));
                    View view = this.itemView;
                    h.f.b.l.b(view, "");
                    SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("event_keys", str).open();
                }
            } else {
                str = "";
            }
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("event_keys", str).open();
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeCell f71308a;

        static {
            Covode.recordClassIndex(43901);
        }

        j(LikeCell likeCell) {
            this.f71308a = likeCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71308a.c();
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeCell f71309a;

        static {
            Covode.recordClassIndex(43902);
        }

        k(LikeCell likeCell) {
            this.f71309a = likeCell;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71309a.c();
        }
    }

    static final class g<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeCell f71307a;

        static {
            Covode.recordClassIndex(43898);
        }

        g(LikeCell likeCell) {
            this.f71307a = likeCell;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                this.f71307a.b();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.iy, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    private static boolean a(User user) {
        List<MutualUser> list;
        String recommendReason;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
            if (mMutualStruct != null) {
                list = mMutualStruct.getUserList();
            } else {
                list = null;
            }
            if ((list == null || list.isEmpty()) && ((recommendReason = matchedFriendStruct.getRecommendReason()) == null || recommendReason.length() == 0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(u.a aVar) {
        af afVar = (af) this.f34234d;
        if (afVar == null || !a(afVar.f71333a)) {
            return false;
        }
        afVar.f71333a.getMatchedFriendStruct();
        com.ss.android.ugc.aweme.metrics.u a2 = new com.ss.android.ugc.aweme.metrics.u().a(afVar.f71334b.f71338c);
        a2.f109597b = aVar;
        com.ss.android.ugc.aweme.metrics.u r = a2.r(afVar.f71334b.f71336a);
        r.W = UGCMonitor.TYPE_POST;
        com.ss.android.ugc.aweme.metrics.u a3 = r.a(afVar.f71333a);
        a3.f109596a = u.c.CARD;
        a3.p("like_list").f();
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0088, code lost:
        if (r6 != null) goto L_0x008a;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.comment.adapter.af r8) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.adapter.LikeCell.a(com.bytedance.ies.powerlist.b.a):void");
    }
}
