package com.ss.android.ugc.aweme.profile.widgets.relations;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ag;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.PrivacySetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class b extends com.bytedance.assem.arch.d.a implements d, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: m  reason: collision with root package name */
    public static final d f118094m = new d((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    TextView f118095j;

    /* renamed from: k  reason: collision with root package name */
    TextView f118096k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f118097l;
    private final com.bytedance.assem.arch.extensions.i n = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    private final com.bytedance.assem.arch.viewModel.b o;
    private View p;
    private TextView q;
    private ViewGroup r;
    private ViewGroup s;
    private ViewGroup t;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.b$b  reason: collision with other inner class name */
    public static final class C3017b extends m implements h.f.a.b<a, a> {
        public static final C3017b INSTANCE = new C3017b();

        static {
            Covode.recordClassIndex(76679);
        }

        public C3017b() {
            super(1);
        }

        public final a invoke(a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(76677);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(36, new org.greenrobot.eventbus.g(b.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final ProfileRelationVM v() {
        return (ProfileRelationVM) this.o.getValue();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(76681);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        EventBus.a().b(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.n.getValue();
        if (aVar != null) {
            return aVar.f117878c;
        }
        return false;
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.relations.b.c.invoke():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.relations.d
    public final void w() {
        TextView textView = this.f118095j;
        if (textView != null) {
            textView.setText("-");
        }
        TextView textView2 = this.q;
        if (textView2 != null) {
            textView2.setText("-");
        }
        TextView textView3 = this.f118097l;
        if (textView3 != null) {
            textView3.setText("-");
        }
    }

    public b() {
        h.k.c a2 = ab.a(ProfileRelationVM.class);
        this.o = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.a(this), C3017b.INSTANCE, u.b(this), u.c(this));
    }

    public final void a(int i2) {
        long a2 = a((long) i2);
        if (a2 < 0) {
            a2 = 0;
        }
        TextView textView = this.q;
        if (textView != null) {
            textView.setText(com.ss.android.ugc.aweme.i18n.b.a(a2));
        }
    }

    /* access modifiers changed from: package-private */
    public final long a(long j2) {
        User user;
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        if (iVar != null) {
            user = iVar.f117705a;
        } else {
            user = null;
        }
        if (!in.g(user) || !in.d()) {
            return j2;
        }
        return 0;
    }

    @r
    public final void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        l.d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        if (u()) {
            String str = followStatus.userId;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (TextUtils.equals(str, g2.getCurUserId()) || !followStatus.isFollowSucess) {
                return;
            }
            if (followStatus.followStatus == 0) {
                com.ss.android.ugc.aweme.account.b.g().updateCurFollowingCount(-1);
            } else {
                com.ss.android.ugc.aweme.account.b.g().updateCurFollowingCount(1);
            }
        }
    }

    static final class e extends m implements h.f.a.b<a, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ String $from;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(76682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, androidx.fragment.app.e eVar, String str) {
            super(1);
            this.this$0 = bVar;
            this.$activity = eVar;
            this.$from = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            User user;
            a aVar2 = aVar;
            l.d(aVar2, "");
            if (this.$activity != null) {
                com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                if (iVar != null) {
                    user = iVar.f117705a;
                } else {
                    user = null;
                }
                if (in.k(user) || !in.b(user, in.g(user)) || aVar2.f118091a <= 0) {
                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("click_fans_count").setLabelName(this.$from));
                    com.ss.android.ugc.aweme.common.r.a("click_fans_count", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.$from).f66730a);
                    if (user != null) {
                        FollowRelationTabActivity.c.a(this.$activity, user, "follower_relation");
                    }
                }
            }
            return z.f158842a;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f118099a;

        static {
            Covode.recordClassIndex(76685);
        }

        h(b bVar) {
            this.f118099a = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            b bVar = this.f118099a;
            l.b(view, "");
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                if (bVar.u()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(bVar);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (!g2.isLogin()) {
                    com.ss.android.ugc.aweme.login.c.a(b2, "personal_homepage", "follower_list");
                } else {
                    b.a(bVar.v(), new e(bVar, b2, str));
                }
            }
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f118100a;

        static {
            Covode.recordClassIndex(76686);
        }

        i(b bVar) {
            this.f118100a = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            b bVar = this.f118100a;
            l.b(view, "");
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                if (bVar.u()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(bVar);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (!g2.isLogin()) {
                    com.ss.android.ugc.aweme.login.c.a(b2, "personal_homepage", "following_list");
                } else {
                    b.a(bVar.v(), new f(bVar, b2, str));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.relations.d
    public final void a(FollowStatus followStatus) {
        User user;
        l.d(followStatus, "");
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        if (iVar != null && (user = iVar.f117705a) != null && TextUtils.equals(followStatus.userId, user.getUid()) && followStatus.followStatus != user.getFollowStatus()) {
            user.setFollowStatus(followStatus.followStatus);
            if (followStatus.followStatus == 0) {
                if (!in.b(user, false)) {
                    int followerCount = user.getFollowerCount() - 1;
                    user.setFollowerCount(followerCount);
                    a(followerCount);
                }
            } else if (followStatus.followStatus == 1 && !in.b(user, false)) {
                int followerCount2 = user.getFollowerCount() + 1;
                user.setFollowerCount(followerCount2);
                a(followerCount2);
            }
            j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), user, null, false, 6);
        }
    }

    static final class f extends m implements h.f.a.b<a, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ String $from;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(76683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, androidx.fragment.app.e eVar, String str) {
            super(1);
            this.this$0 = bVar;
            this.$activity = eVar;
            this.$from = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            User user;
            PrivacySetting privacySetting;
            a aVar2 = aVar;
            l.d(aVar2, "");
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            if (iVar != null) {
                user = iVar.f117705a;
            } else {
                user = null;
            }
            if (in.k(user) || !in.b(user, in.g(user)) || aVar2.f118092b <= 0) {
                if (user == null || (privacySetting = user.getPrivacySetting()) == null || privacySetting.getFollowingVisibility() != 2) {
                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName(this.$from));
                    com.ss.android.ugc.aweme.common.r.a("click_follow_count", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.$from).f66730a);
                    androidx.fragment.app.e eVar = this.$activity;
                    if (eVar != null) {
                        FollowRelationTabActivity.c.a(eVar, user, "following_relation");
                    }
                } else {
                    androidx.fragment.app.e eVar2 = this.$activity;
                    if (eVar2 != null) {
                        new com.bytedance.tux.g.b(eVar2).e(R.string.exv).a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).b();
                    }
                }
            }
            return z.f158842a;
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f118098a;

        static {
            Covode.recordClassIndex(76684);
        }

        g(b bVar) {
            this.f118098a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            if (r2 == null) goto L_0x005e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r14) {
            /*
            // Method dump skipped, instructions count: 168
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.relations.b.g.onClick(android.view.View):void");
        }
    }

    static final class j extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(76687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.model.User> r11) {
            /*
            // Method dump skipped, instructions count: 163
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.relations.b.j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        View view2;
        l.d(view, "");
        this.f118095j = (TextView) view.findViewById(R.id.b8g);
        this.q = (TextView) view.findViewById(R.id.b86);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.apo);
        this.r = viewGroup;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new g(this));
        }
        this.f118096k = (TextView) view.findViewById(R.id.ala);
        this.f118097l = (TextView) view.findViewById(R.id.al_);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.b89);
        this.s = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new h(this));
        }
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.b8j);
        this.t = viewGroup3;
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(new i(this));
        }
        w();
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), c.f118101a, new j(this));
        this.p = view.findViewById(R.id.dkg);
        if (in.d() && (view2 = this.p) != null) {
            view2.setVisibility(8);
        }
    }
}
