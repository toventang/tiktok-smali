package com.ss.android.ugc.aweme.profile.widgets.g.a;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ag;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.IProfileNaviService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bu;
import com.ss.android.ugc.aweme.commercialize.utils.bo;
import com.ss.android.ugc.aweme.experiment.fp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.edit.g;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView;
import com.ss.android.ugc.aweme.profile.ui.v2.ac;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.story.avatar.ProfileStoryRingViewModel;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.z;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class g extends com.bytedance.assem.arch.d.a implements l, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final e o = new e((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    final com.bytedance.assem.arch.extensions.i f117850j = new com.bytedance.assem.arch.extensions.i(bQ_(), new d(this, null));

    /* renamed from: k  reason: collision with root package name */
    MusAvatarWithBorderView f117851k;

    /* renamed from: l  reason: collision with root package name */
    public SmartImageView f117852l;

    /* renamed from: m  reason: collision with root package name */
    public LiveCircleView f117853m;
    public TextView n;
    private final com.bytedance.assem.arch.extensions.i p = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    private final com.bytedance.assem.arch.viewModel.b q;
    private AnimationImageView r;
    private com.ss.android.ugc.aweme.feed.ui.d s;
    private UrlModel t;
    private final IProfileBadgeService u;
    private final IProfileBadgeService.c v;
    private final h.h w;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.story.avatar.p, com.ss.android.ugc.aweme.story.avatar.p> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(76356);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.story.avatar.p invoke(com.ss.android.ugc.aweme.story.avatar.p pVar) {
            h.f.b.l.c(pVar, "");
            return pVar;
        }
    }

    static {
        Covode.recordClassIndex(76354);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(9, new org.greenrobot.eventbus.g(g.class, "onLiveStatusEvent", com.bytedance.android.live.base.a.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final bu u() {
        return (bu) this.w.getValue();
    }

    public static final class e {
        static {
            Covode.recordClassIndex(76359);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    public static final class f implements bo {
        static {
            Covode.recordClassIndex(76360);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.bo
        public final void a() {
        }

        f() {
        }
    }

    public static final class h extends com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f> {
        static {
            Covode.recordClassIndex(76362);
        }

        h() {
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(th, "");
            super.onFailure(str, th);
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f117858a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f117859b;

        static {
            Covode.recordClassIndex(76365);
        }

        k(g gVar, View view) {
            this.f117858a = gVar;
            this.f117859b = view;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            User user;
            User user2;
            Aweme aweme;
            ClickAgent.onClick(view);
            this.f117858a.ar_();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                new com.bytedance.tux.g.b(this.f117859b).e(R.string.de8).b();
            } else if (!com.ss.android.ugc.aweme.l.a.a.a(this.f117859b, 1200)) {
                g gVar = this.f117858a;
                com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(gVar, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                Object obj = null;
                if (iVar != null) {
                    user = iVar.f117705a;
                } else {
                    user = null;
                }
                androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(gVar);
                if (!(!gVar.f25594h || user == null || b2 == null)) {
                    if (!user.isLive() || in.b(user, false)) {
                        com.ss.android.ugc.aweme.common.r.a("click_profile_icon", new com.ss.android.ugc.aweme.app.f.d().a("author_id", user.getUid()).a("enter_from", "others_homepage").a("enter_method", "click_head").f66730a);
                        MusAvatarWithBorderView musAvatarWithBorderView = gVar.f117851k;
                        if (musAvatarWithBorderView == null) {
                            h.f.b.l.b();
                        }
                        new com.ss.android.ugc.aweme.profile.edit.g(b2, musAvatarWithBorderView, null, user).a();
                    } else {
                        ac acVar = (ac) com.bytedance.assem.arch.service.d.f(gVar, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                        if (acVar != null) {
                            aweme = acVar.f117249g;
                        } else {
                            aweme = null;
                        }
                        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
                            com.ss.android.ugc.aweme.profile.service.h.f116622a.watchFromProfile(gVar.ar_(), user, false, new i(gVar, user));
                        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.w(aweme)) {
                            com.ss.android.ugc.aweme.profile.service.a.f116616a.openTopViewLive(gVar.ar_(), aweme, 50, new f());
                        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
                            com.ss.android.ugc.aweme.profile.service.a.f116616a.feedLiveProfileAvatarOpen(gVar.ar_(), aweme, 50);
                        }
                    }
                }
                SmartImageView smartImageView = this.f117858a.f117852l;
                if (smartImageView != null && smartImageView.getVisibility() == 0) {
                    com.ss.android.ugc.aweme.profile.widgets.common.i iVar2 = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.f117858a, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                    if (iVar2 != null) {
                        user2 = iVar2.f117705a;
                    } else {
                        user2 = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage");
                    if (user2 == null || user2.getProfileBadge() == null) {
                        obj = "";
                    } else {
                        ProfileBadgeStruct profileBadge = user2.getProfileBadge();
                        if (profileBadge != null) {
                            obj = Long.valueOf(profileBadge.getId());
                        }
                    }
                    com.ss.android.ugc.aweme.common.r.a("profile_badge_click", a2.a("badge_id", obj).f66730a);
                }
            }
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76355);
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

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.b> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.b.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.g.a.g.c.invoke():java.lang.Object");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.assem.arch.core.a aVar, String str) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.g.a.g.d.invoke():java.lang.Object");
        }
    }

    private final String w() {
        try {
            ILiveOuterService s2 = LiveOuterService.s();
            h.f.b.l.b(s2, "");
            com.ss.android.ugc.aweme.live.c d2 = s2.d();
            h.f.b.l.b(d2, "");
            return d2.r().a(ar_());
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean x() {
        try {
            ILiveOuterService s2 = LiveOuterService.s();
            h.f.b.l.b(s2, "");
            com.ss.android.ugc.aweme.live.c d2 = s2.d();
            h.f.b.l.b(d2, "");
            return d2.s().a();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        this.u.a(this.v);
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        this.u.b(this.v);
        EventBus.a().b(this);
    }

    static final class q extends h.f.b.m implements h.f.a.a<bu> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(76373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ bu invoke() {
            IProfileNaviService a2;
            String str;
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.this$0);
            if (b2 == null || (a2 = ProfileNaviServiceImpl.a()) == null) {
                return null;
            }
            com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.this$0.f117850j.getValue();
            if (aVar == null || !aVar.f117878c) {
                str = "others_homepage";
            } else {
                str = "personal_homepage";
            }
            return a2.a(b2, str);
        }
    }

    public final void v() {
        MusAvatarWithBorderView musAvatarWithBorderView = this.f117851k;
        if (musAvatarWithBorderView != null && musAvatarWithBorderView.getController() != null) {
            MusAvatarWithBorderView musAvatarWithBorderView2 = this.f117851k;
            if (musAvatarWithBorderView2 == null) {
                h.f.b.l.b();
            }
            com.facebook.drawee.h.a controller = musAvatarWithBorderView2.getController();
            if (controller == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(controller, "");
            Animatable i2 = controller.i();
            if (i2 == null) {
                return;
            }
            if (g.b.a()) {
                i2.stop();
                return;
            }
            ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
            if (acVar == null || !acVar.f117252j) {
                if (i2.isRunning()) {
                    i2.stop();
                }
            } else if (!i2.isRunning()) {
                i2.start();
            }
        }
    }

    public g() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(ProfileStoryRingViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.q = bVar;
        this.u = ProfileBadgeServiceImpl.b();
        this.v = new j(this);
        this.w = h.i.a((h.f.a.a) new q(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a.g$g  reason: collision with other inner class name */
    public static final class C2999g extends com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f117854a;

        static {
            Covode.recordClassIndex(76361);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2999g(g gVar) {
            this.f117854a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            h.f.b.l.d(str, "");
            this.f117854a.v();
        }
    }

    public static final class j implements IProfileBadgeService.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f117857a;

        static {
            Covode.recordClassIndex(76364);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(g gVar) {
            this.f117857a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.IProfileBadgeService.c
        public final void a(ProfileBadgeStruct profileBadgeStruct) {
            this.f117857a.a(profileBadgeStruct);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(76371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            if (aVar != null) {
                this.this$0.a((ProfileBadgeStruct) null);
            }
            return z.f158842a;
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.profile.presenter.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f117855a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f117856b;

        static {
            Covode.recordClassIndex(76363);
        }

        @Override // com.ss.android.ugc.aweme.profile.presenter.r
        public final void c(FollowStatus followStatus) {
        }

        @Override // com.ss.android.ugc.aweme.profile.presenter.r
        public final void d_(Exception exc) {
            h.f.b.l.d(exc, "");
            com.ss.android.ugc.aweme.profile.widgets.follow.c cVar = (com.ss.android.ugc.aweme.profile.widgets.follow.c) com.bytedance.assem.arch.service.d.c(this.f117855a, ab.a(com.ss.android.ugc.aweme.profile.widgets.follow.c.class));
            if (cVar != null) {
                cVar.a(exc);
            }
        }

        @Override // com.ss.android.ugc.aweme.profile.presenter.r
        public final void b(FollowStatus followStatus) {
            h.f.b.l.d(followStatus, "");
            com.ss.android.ugc.aweme.profile.widgets.follow.c cVar = (com.ss.android.ugc.aweme.profile.widgets.follow.c) com.bytedance.assem.arch.service.d.c(this.f117855a, ab.a(com.ss.android.ugc.aweme.profile.widgets.follow.c.class));
            if (cVar != null) {
                cVar.a(followStatus);
            }
            this.f117856b.setFollowStatus(followStatus.followStatus);
            com.ss.android.ugc.aweme.profile.service.h.f116622a.watchFromProfile(this.f117855a.ar_(), this.f117856b, false, null);
        }

        i(g gVar, User user) {
            this.f117855a = gVar;
            this.f117856b = user;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(76366);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            MusAvatarWithBorderView musAvatarWithBorderView;
            com.bytedance.assem.arch.extensions.a<? extends z> aVar2 = aVar;
            if (!(aVar2 == null || aVar2.f25631b == null)) {
                g gVar = this.this$0;
                if (gVar.bw_() && (musAvatarWithBorderView = gVar.f117851k) != null) {
                    musAvatarWithBorderView.setImageURI("");
                }
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(76367);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(g gVar, View view) {
            super(1);
            this.this$0 = gVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) AnonymousClass1.f117860a);
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.g.a.g.m.AnonymousClass2 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(76369);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.q qVar) {
                    com.bytedance.assem.arch.core.q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.story.avatar.i.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.story.avatar.i();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    private final boolean b(UrlModel urlModel) {
        String str;
        String uri;
        String uri2;
        if (fp.f90067e && this.t != null) {
            String str2 = null;
            if (urlModel == null || (uri2 = urlModel.getUri()) == null) {
                str = null;
            } else {
                str = h.m.p.c(uri2, '/', "");
            }
            UrlModel urlModel2 = this.t;
            if (!(urlModel2 == null || (uri = urlModel2.getUri()) == null)) {
                str2 = h.m.p.c(uri, '/', "");
            }
            if (!h.f.b.l.a((Object) str, (Object) str2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    static final class p extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(76372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            User user;
            bu u;
            bu u2;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                this.this$0.v();
                if (aVar2.f25631b.booleanValue()) {
                    com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                    if (iVar != null) {
                        user = iVar.f117705a;
                    } else {
                        user = null;
                    }
                    this.this$0.a(com.ss.android.ugc.aweme.utils.u.a(user));
                    g gVar = this.this$0;
                    if (com.ss.android.ugc.aweme.profile.widgets.g.b.a.f117869a && (((u = gVar.u()) == null || !u.b()) && (u2 = this.this$0.u()) != null)) {
                        u2.a();
                    }
                }
            }
            return z.f158842a;
        }
    }

    static final class r<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f117861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f117862b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f117863c;

        static {
            Covode.recordClassIndex(76374);
        }

        r(g gVar, User user, String str) {
            this.f117861a = gVar;
            this.f117862b = user;
            this.f117863c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            User user;
            long j2;
            Map map = (Map) obj;
            if (map != null && (user = this.f117862b) != null) {
                long j3 = user.roomId;
                long j4 = 0;
                try {
                    String str = this.f117863c;
                    if (str != null) {
                        j2 = Long.parseLong(str);
                    } else {
                        j2 = -1;
                    }
                    Long l2 = (Long) map.get(Long.valueOf(j2));
                    if (l2 != null) {
                        j4 = l2.longValue();
                    }
                } catch (Throwable unused) {
                }
                this.f117862b.roomId = j4;
                if (j3 != j4) {
                    com.ss.android.ugc.aweme.profile.widgets.common.j jVar = (com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.c(this.f117861a, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                    if (jVar != null) {
                        j.a.a(jVar, this.f117862b, null, false, 6);
                    }
                    this.f117861a.a(this.f117862b.isLive());
                }
                com.bytedance.android.live.base.a.a aVar = new com.bytedance.android.live.base.a.a();
                String uid = this.f117862b.getUid();
                h.f.b.l.b(uid, "");
                aVar.f7363b = Long.parseLong(uid);
                aVar.f7362a = this.f117862b.roomId;
                aVar.f7364c = !this.f117862b.isLive();
                com.ss.android.ugc.d.a.c.a(aVar);
            }
        }
    }

    public final void a(UrlModel urlModel) {
        User user;
        List<String> urlList;
        if (!com.ss.android.ugc.aweme.performance.i.a()) {
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            if (iVar != null) {
                user = iVar.f117705a;
            } else {
                user = null;
            }
            if (bw_() && urlModel != null && user != null) {
                UrlModel avatarVideoUri = user.getAvatarVideoUri();
                if (avatarVideoUri == null || (urlList = avatarVideoUri.getUrlList()) == null || !(!urlList.isEmpty())) {
                    if (b(urlModel)) {
                        this.t = urlModel;
                        com.ss.android.ugc.aweme.base.e.a(this.f117851k, urlModel);
                    }
                } else if (b(avatarVideoUri)) {
                    com.ss.android.ugc.aweme.base.e.a((RemoteImageView) this.f117851k, avatarVideoUri, (com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f>) new C2999g(this), false);
                    this.t = avatarVideoUri;
                }
            }
        } else if (bw_() && urlModel != null && b(urlModel)) {
            this.t = urlModel;
            com.ss.android.ugc.aweme.base.e.a(this.f117851k, urlModel, new h());
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onLiveStatusEvent(com.bytedance.android.live.base.a.a aVar) {
        User user;
        long j2;
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        if (iVar != null && (user = iVar.f117705a) != null) {
            try {
                String uid = user.getUid();
                h.f.b.l.b(uid, "");
                j2 = Long.parseLong(uid);
            } catch (Throwable unused) {
                j2 = 0;
            }
            if (j2 == aVar.f7363b && aVar.f7364c) {
                user.roomId = 0;
                com.ss.android.ugc.aweme.profile.widgets.common.j jVar = (com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.c(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                if (jVar != null) {
                    j.a.a(jVar, user, com.ss.android.ugc.aweme.profile.widgets.common.g.NORMAL, false, 4);
                }
                a(user.isLive());
            }
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ z.a $badgeShouldShowEventTrigger;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(76370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(g gVar, z.a aVar) {
            super(1);
            this.this$0 = gVar;
            this.$badgeShouldShowEventTrigger = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            ProfileBadgeStruct profileBadge;
            Long l2;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                this.this$0.a(com.ss.android.ugc.aweme.utils.u.a(t));
                if (!t.isBlock) {
                    this.this$0.a(t.isLive());
                    this.this$0.a(t.getProfileBadge());
                    if (t.getProfileBadge() != null && (profileBadge = t.getProfileBadge()) != null && profileBadge.getShouldShow() && this.$badgeShouldShowEventTrigger.element) {
                        this.$badgeShouldShowEventTrigger.element = false;
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage");
                        ProfileBadgeStruct profileBadge2 = t.getProfileBadge();
                        if (profileBadge2 != null) {
                            l2 = Long.valueOf(profileBadge2.getId());
                        } else {
                            l2 = "";
                        }
                        com.ss.android.ugc.aweme.common.r.a("profile_badge_show", a2.a("badge_id", l2).a("group_id", "").a("author_id", "").f66730a);
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r0 == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r4) {
        /*
            r3 = this;
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L_0x0010
            java.lang.String r0 = r4.getUrl()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0022
        L_0x0010:
            boolean r0 = com.ss.android.ugc.aweme.utils.in.d()
            if (r0 != 0) goto L_0x0018
            if (r1 == 0) goto L_0x002e
        L_0x0018:
            com.bytedance.lighten.loader.SmartImageView r1 = r3.f117852l
            if (r1 == 0) goto L_0x0021
            r0 = 8
            r1.setVisibility(r0)
        L_0x0021:
            return
        L_0x0022:
            r4.getShouldShow()
            boolean r0 = r4.getShouldShow()
            if (r0 != 0) goto L_0x002c
            goto L_0x0010
        L_0x002c:
            r1 = 0
            goto L_0x0010
        L_0x002e:
            if (r4 == 0) goto L_0x0052
            java.lang.String r0 = r4.getUrl()
            if (r0 != 0) goto L_0x0039
        L_0x0036:
            h.f.b.l.b()
        L_0x0039:
            com.bytedance.lighten.a.v r1 = com.bytedance.lighten.a.r.a(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r3.f117852l
            r1.E = r0
            java.lang.String r0 = "ProfileWidgetProfileFragment"
            com.bytedance.lighten.a.v r0 = r1.a(r0)
            r0.c()
            com.bytedance.lighten.loader.SmartImageView r0 = r3.f117852l
            if (r0 == 0) goto L_0x0051
            r0.setVisibility(r2)
        L_0x0051:
            return
        L_0x0052:
            r0 = 0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.g.a.g.a(com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct):void");
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        h.f.b.l.d(view, "");
        MusAvatarWithBorderView musAvatarWithBorderView = (MusAvatarWithBorderView) view.findViewById(R.id.bfb);
        this.f117851k = musAvatarWithBorderView;
        if (musAvatarWithBorderView != null) {
            ((CircleImageView) musAvatarWithBorderView).f68292f = true;
        }
        MusAvatarWithBorderView musAvatarWithBorderView2 = this.f117851k;
        if (musAvatarWithBorderView2 != null) {
            musAvatarWithBorderView2.setBorderColor(R.color.f159926j);
        }
        MusAvatarWithBorderView musAvatarWithBorderView3 = this.f117851k;
        if (musAvatarWithBorderView3 != null) {
            musAvatarWithBorderView3.setOnClickListener(new k(this, view));
        }
        this.f117852l = (SmartImageView) view.findViewById(R.id.dbp);
        this.r = (AnimationImageView) view.findViewById(R.id.il);
        this.f117853m = (LiveCircleView) view.findViewById(R.id.bsf);
        this.n = (TextView) view.findViewById(R.id.ew9);
        z.a aVar = new z.a();
        aVar.element = true;
        com.bytedance.assem.arch.extensions.d.a(this, new m(this, view));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), h.f117864a, new n(this, aVar));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), i.f117865a, new o(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), j.f117866a, new p(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), k.f117867a, new l(this));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.g.a.l
    public final void a(String str) {
        User user;
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        if (iVar != null && (user = iVar.f117705a) != null) {
            if (!TextUtils.isEmpty(user.roomData)) {
                try {
                    SlimRoom.a linkMic = ((SlimRoom) com.ss.android.ugc.aweme.account.util.i.a(user.roomData, SlimRoom.class)).getLinkMic();
                    h.f.b.l.b(linkMic, "");
                    if (linkMic.f23033c > 0) {
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            ILiveOuterService s2 = LiveOuterService.s();
            h.f.b.l.b(s2, "");
            s2.b().a(user, new r(this, user, str), "tiktok_profile_head");
        }
    }

    public final void a(boolean z) {
        User user;
        LiveCircleView liveCircleView;
        TextView textView;
        LiveCircleView liveCircleView2;
        TextView textView2;
        String str;
        LiveCircleView liveCircleView3;
        TextView textView3;
        String str2;
        if (this.r != null) {
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            if (iVar != null) {
                user = iVar.f117705a;
            } else {
                user = null;
            }
            boolean b2 = in.b(user, false);
            if (!z || !com.ss.android.ugc.aweme.story.c.a() || b2) {
                MusAvatarWithBorderView musAvatarWithBorderView = this.f117851k;
                if (musAvatarWithBorderView != null) {
                    musAvatarWithBorderView.setBorderColor(R.color.f159928l);
                }
                MusAvatarWithBorderView musAvatarWithBorderView2 = this.f117851k;
                if (musAvatarWithBorderView2 != null) {
                    musAvatarWithBorderView2.setBorderWidth(1);
                }
                MusAvatarWithBorderView musAvatarWithBorderView3 = this.f117851k;
                if (musAvatarWithBorderView3 != null) {
                    musAvatarWithBorderView3.d();
                }
                TextView textView4 = this.n;
                if (!(textView4 == null || textView4.getVisibility() != 0 || (textView = this.n) == null)) {
                    textView.setVisibility(8);
                }
                LiveCircleView liveCircleView4 = this.f117853m;
                if (!(liveCircleView4 == null || liveCircleView4.getVisibility() != 0 || (liveCircleView = this.f117853m) == null)) {
                    liveCircleView.setVisibility(8);
                }
                com.ss.android.ugc.aweme.feed.ui.d dVar = this.s;
                if (dVar != null) {
                    dVar.d();
                }
                AnimationImageView animationImageView = this.r;
                if (animationImageView != null) {
                    animationImageView.d();
                }
                AnimationImageView animationImageView2 = this.r;
                if (animationImageView2 != null) {
                    animationImageView2.setVisibility(8);
                }
            } else {
                ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                if (!(acVar == null || !acVar.f117252j || user == null)) {
                    ar_();
                    String requestId = user.getRequestId();
                    ac acVar2 = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                    if (acVar2 != null) {
                        str2 = acVar2.f117243a;
                    } else {
                        str2 = null;
                    }
                    com.ss.android.ugc.aweme.story.live.d.a(false, 0, requestId, str2, user.roomId);
                }
                if (!x() || this.f117853m == null || this.n == null) {
                    MusAvatarWithBorderView musAvatarWithBorderView4 = this.f117851k;
                    if (musAvatarWithBorderView4 != null) {
                        musAvatarWithBorderView4.setBorderColor(R.color.bh);
                    }
                    MusAvatarWithBorderView musAvatarWithBorderView5 = this.f117851k;
                    if (musAvatarWithBorderView5 != null) {
                        musAvatarWithBorderView5.setBorderWidth(2);
                    }
                    MusAvatarWithBorderView musAvatarWithBorderView6 = this.f117851k;
                    if (musAvatarWithBorderView6 != null) {
                        musAvatarWithBorderView6.d();
                    }
                    AnimationImageView animationImageView3 = this.r;
                    if (animationImageView3 != null) {
                        animationImageView3.setVisibility(0);
                    }
                    AnimationImageView animationImageView4 = this.r;
                    if (animationImageView4 != null) {
                        animationImageView4.setAnimation("tag_profile_live.json");
                    }
                    AnimationImageView animationImageView5 = this.r;
                    if (animationImageView5 != null) {
                        animationImageView5.a();
                    }
                    TextView textView5 = this.n;
                    if (!(textView5 == null || textView5.getVisibility() != 0 || (textView2 = this.n) == null)) {
                        textView2.setVisibility(8);
                    }
                    LiveCircleView liveCircleView5 = this.f117853m;
                    if (!(liveCircleView5 == null || liveCircleView5.getVisibility() != 0 || (liveCircleView2 = this.f117853m) == null)) {
                        liveCircleView2.setVisibility(8);
                    }
                    com.ss.android.ugc.aweme.feed.ui.d dVar2 = this.s;
                    if (dVar2 != null) {
                        dVar2.d();
                    }
                } else {
                    MusAvatarWithBorderView musAvatarWithBorderView7 = this.f117851k;
                    if (musAvatarWithBorderView7 != null) {
                        musAvatarWithBorderView7.setBorderWidth(0);
                    }
                    MusAvatarWithBorderView musAvatarWithBorderView8 = this.f117851k;
                    if (musAvatarWithBorderView8 != null) {
                        musAvatarWithBorderView8.d();
                    }
                    AnimationImageView animationImageView6 = this.r;
                    if (animationImageView6 != null) {
                        animationImageView6.d();
                    }
                    AnimationImageView animationImageView7 = this.r;
                    if (animationImageView7 != null) {
                        animationImageView7.setVisibility(8);
                    }
                    TextView textView6 = this.n;
                    if (textView6 != null) {
                        textView6.setText(w());
                    }
                    TextView textView7 = this.n;
                    if (!(textView7 == null || textView7.getVisibility() != 8 || (textView3 = this.n) == null)) {
                        textView3.setVisibility(0);
                    }
                    LiveCircleView liveCircleView6 = this.f117853m;
                    if (!(liveCircleView6 == null || liveCircleView6.getVisibility() != 8 || (liveCircleView3 = this.f117853m) == null)) {
                        liveCircleView3.setVisibility(0);
                    }
                    if (this.s == null) {
                        MusAvatarWithBorderView musAvatarWithBorderView9 = this.f117851k;
                        com.ss.android.ugc.aweme.feed.ui.d dVar3 = new com.ss.android.ugc.aweme.feed.ui.d(musAvatarWithBorderView9, musAvatarWithBorderView9, this.f117853m);
                        this.s = dVar3;
                        dVar3.a(null, getClass());
                    }
                    com.ss.android.ugc.aweme.feed.ui.d dVar4 = this.s;
                    if (dVar4 == null) {
                        h.f.b.l.b();
                    }
                    dVar4.c();
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("enter_from_merge", "others_homepage");
                        if (h.f.b.l.a((Object) "LIVE", (Object) w())) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        hashMap.put("is_english", str);
                        ILiveOuterService s2 = LiveOuterService.s();
                        h.f.b.l.b(s2, "");
                        com.ss.android.ugc.aweme.live.c d2 = s2.d();
                        h.f.b.l.b(d2, "");
                        d2.r().a("livesdk_live_show_language", hashMap);
                    } catch (Exception unused) {
                    }
                }
                ILiveOuterService s3 = LiveOuterService.s();
                h.f.b.l.b(s3, "");
                s3.m().a("ttlive_user_profile_avatar_entrance", 0, new HashMap());
            }
            ((ProfileStoryRingViewModel) this.q.getValue()).a("live");
        }
    }
}
