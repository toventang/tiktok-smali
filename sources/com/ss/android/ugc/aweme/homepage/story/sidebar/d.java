package com.ss.android.ugc.aweme.homepage.story.sidebar;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ag;
import androidx.lifecycle.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.story.avatar.o;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Iterator;

public final class d extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f99455j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f99456k;

    /* renamed from: l  reason: collision with root package name */
    public StoryBrandView f99457l;

    /* renamed from: m  reason: collision with root package name */
    public FrameLayout f99458m;
    public AvatarImageView n;
    FrameLayout o;
    FrameLayout p;
    boolean q;
    public UrlModel r;
    private final h.h s = h.i.a((h.f.a.a) new C2432d(this));
    private final com.bytedance.assem.arch.viewModel.b t;
    private FrameLayout u;
    private StoryBrandView v;
    private TuxIconView w;
    private final h.h x;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.homepage.story.feed.d, com.ss.android.ugc.aweme.homepage.story.feed.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(63415);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.homepage.story.feed.d invoke(com.ss.android.ugc.aweme.homepage.story.feed.d dVar) {
            l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(63413);
    }

    public final DrawerViewModel u() {
        return (DrawerViewModel) this.s.getValue();
    }

    public final StorySidebarFeedVM v() {
        return (StorySidebarFeedVM) this.t.getValue();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(63414);
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

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.story.avatar.d> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(63416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.story.avatar.d invoke() {
            com.ss.android.ugc.aweme.story.avatar.c d2 = com.ss.android.ugc.aweme.story.g.f137757a.d();
            if (d2 != null) {
                return d2.a(new com.ss.android.ugc.aweme.story.avatar.e(this) {
                    /* class com.ss.android.ugc.aweme.homepage.story.sidebar.d.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f99459a;

                    static {
                        Covode.recordClassIndex(63417);
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.h
                    public final boolean d() {
                        return true;
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.e
                    public final o c() {
                        return o.WESTWINDOW;
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.e
                    public final /* bridge */ /* synthetic */ androidx.lifecycle.m b() {
                        return this.f99459a.this$0;
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.e
                    public final StoryBrandView a() {
                        return d.a(this.f99459a.this$0);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f99459a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.e
                    public final void a(SmartRoute smartRoute, Aweme aweme) {
                        l.d(smartRoute, "");
                        l.d(aweme, "");
                        if (this.f99459a.this$0.n != null) {
                            AvatarImageView avatarImageView = this.f99459a.this$0.n;
                            if (avatarImageView == null) {
                                l.b();
                            }
                            androidx.core.app.b b2 = androidx.core.app.b.b(avatarImageView, avatarImageView.getWidth(), avatarImageView.getHeight());
                            l.b(b2, "");
                            smartRoute.withBundleAnimation(b2.a()).withParam("activity_has_activity_options", true);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.h
                    public final void a(boolean z, com.ss.android.ugc.aweme.tux.business.story.a aVar) {
                        FrameLayout frameLayout;
                        l.d(aVar, "");
                        d dVar = this.f99459a.this$0;
                        if (!z || aVar != com.ss.android.ugc.aweme.tux.business.story.a.RED_RING) {
                            FrameLayout frameLayout2 = dVar.o;
                            if (frameLayout2 != null) {
                                frameLayout2.setVisibility(8);
                            }
                            if (dVar.q && (frameLayout = dVar.p) != null) {
                                frameLayout.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        FrameLayout frameLayout3 = dVar.o;
                        if (frameLayout3 != null) {
                            frameLayout3.setVisibility(0);
                        }
                        FrameLayout frameLayout4 = dVar.p;
                        if (frameLayout4 != null) {
                            frameLayout4.setVisibility(8);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.g
                    public final boolean a(String str, HashMap<String, String> hashMap) {
                        Boolean bool;
                        String str2;
                        t<Boolean> tVar;
                        String str3 = "";
                        l.d(str, str3);
                        l.d(hashMap, str3);
                        DrawerViewModel u = this.f99459a.this$0.u();
                        if (u == null || (tVar = u.f99259b) == null) {
                            bool = null;
                        } else {
                            bool = tVar.getValue();
                        }
                        if (!l.a((Object) bool, (Object) true)) {
                            return false;
                        }
                        if (l.a((Object) str, (Object) "story_show")) {
                            if (this.f99459a.this$0.f99456k) {
                                return false;
                            }
                            this.f99459a.this$0.f99456k = true;
                        }
                        DrawerViewModel u2 = this.f99459a.this$0.u();
                        if (!(u2 == null || (str2 = u2.f99265h) == null)) {
                            str3 = str2;
                        }
                        hashMap.put("enter_method", str3);
                        hashMap.put("enter_from", "westwindow");
                        hashMap.put("req_id", this.f99459a.this$0.v().f99376m.f99401c);
                        return true;
                    }
                });
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.d$d  reason: collision with other inner class name */
    static final class C2432d extends m implements h.f.a.a<DrawerViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(63418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2432d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DrawerViewModel invoke() {
            Context context;
            FrameLayout frameLayout = this.this$0.f99458m;
            if (frameLayout != null) {
                context = frameLayout.getContext();
            } else {
                context = null;
            }
            if (!(context instanceof androidx.fragment.app.e)) {
                context = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
            if (eVar != null) {
                return DrawerViewModel.a.a(eVar);
            }
            return null;
        }
    }

    public final void w() {
        if (com.ss.android.ugc.aweme.story.c.b.g() || com.ss.android.ugc.aweme.story.c.b.h()) {
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
            if (b2 != null) {
                AVExternalServiceImpl.a().storyService().startStoryActivity(b2, new EnterStoryParam(null, "click_west_window_camera", com.ss.android.ugc.aweme.homepage.story.c.b.a(b2), false, false, false, false, 49, null));
                return;
            }
            return;
        }
        DrawerViewModel u2 = u();
        if (u2 != null) {
            u2.a(1, "click_westwindow_camera");
        }
    }

    public d() {
        com.bytedance.assem.arch.viewModel.b bVar;
        UrlModel urlModel;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(StorySidebarFeedVM.class);
        a aVar2 = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar == null || l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.t = bVar;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        this.f99455j = g2.getCurUserId();
        this.q = com.ss.android.ugc.aweme.homepage.experiment.a.b();
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        User curUser = g3.getCurUser();
        if (curUser != null) {
            urlModel = curUser.getAvatarThumb();
        } else {
            urlModel = null;
        }
        this.r = urlModel;
        this.x = h.i.a((h.f.a.a) new c(this));
    }

    public static final /* synthetic */ StoryBrandView a(d dVar) {
        StoryBrandView storyBrandView = dVar.f99457l;
        if (storyBrandView == null) {
            l.a("storyBrandView");
        }
        return storyBrandView;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f99460a;

        static {
            Covode.recordClassIndex(63419);
        }

        e(d dVar) {
            this.f99460a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                this.f99460a.w();
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f99461a;

        static {
            Covode.recordClassIndex(63420);
        }

        f(d dVar) {
            this.f99461a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (d.a(this.f99461a).getMode() == com.ss.android.ugc.aweme.tux.business.story.a.RED_RING) {
                d.a(this.f99461a).performClick();
            }
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f99463a;

        static {
            Covode.recordClassIndex(63422);
        }

        h(d dVar) {
            this.f99463a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                this.f99463a.w();
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f99462a;

        static {
            Covode.recordClassIndex(63421);
        }

        g(d dVar) {
            this.f99462a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Iterator<T> it = this.f99462a.v().h().iterator();
            boolean z = false;
            while (it.hasNext()) {
                User author = it.next().getAuthor();
                l.b(author, "");
                if (l.a((Object) author.getUid(), (Object) this.f99462a.f99455j)) {
                    z = true;
                }
            }
            if (z) {
                d.a(this.f99462a).performClick();
            } else {
                this.f99462a.w();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        com.ss.android.ugc.aweme.story.avatar.d dVar;
        l.d(view, "");
        com.ss.android.ugc.aweme.story.avatar.c d2 = com.ss.android.ugc.aweme.story.g.f137757a.d();
        if (d2 != null && d2.a()) {
            View findViewById = s().findViewById(R.id.c15);
            l.b(findViewById, "");
            this.f99457l = (StoryBrandView) findViewById;
            this.f99458m = (FrameLayout) s().findViewById(R.id.b54);
            this.u = (FrameLayout) s().findViewById(R.id.b4e);
            this.v = (StoryBrandView) s().findViewById(R.id.bw2);
            this.w = (TuxIconView) s().findViewById(R.id.bur);
            this.n = (AvatarImageView) s().findViewById(R.id.c14);
            this.o = (FrameLayout) s().findViewById(R.id.b66);
            this.p = (FrameLayout) s().findViewById(R.id.b4m);
            if (this.q) {
                StoryBrandView storyBrandView = this.v;
                if (storyBrandView != null) {
                    storyBrandView.setVisibility(8);
                }
                TuxIconView tuxIconView = this.w;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(8);
                }
                AvatarImageView avatarImageView = this.n;
                if (avatarImageView != null) {
                    avatarImageView.setVisibility(0);
                }
                FrameLayout frameLayout = this.p;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                AvatarImageView avatarImageView2 = this.n;
                if (avatarImageView2 != null) {
                    avatarImageView2.setActualImageResource(R.raw.icon_color_default_avatar);
                }
                com.ss.android.ugc.aweme.base.e.a(this.n, this.r);
                FrameLayout frameLayout2 = this.p;
                if (frameLayout2 != null) {
                    frameLayout2.setOnClickListener(new e(this));
                }
                FrameLayout frameLayout3 = this.o;
                if (frameLayout3 != null) {
                    frameLayout3.setOnClickListener(new f(this));
                }
                AvatarImageView avatarImageView3 = this.n;
                if (avatarImageView3 != null) {
                    avatarImageView3.setOnClickListener(new g(this));
                }
            } else {
                StoryBrandView storyBrandView2 = this.v;
                if (storyBrandView2 != null) {
                    storyBrandView2.setVisibility(0);
                }
                TuxIconView tuxIconView2 = this.w;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(0);
                }
                AvatarImageView avatarImageView4 = this.n;
                if (avatarImageView4 != null) {
                    avatarImageView4.setVisibility(8);
                }
                FrameLayout frameLayout4 = this.p;
                if (frameLayout4 != null) {
                    frameLayout4.setVisibility(8);
                }
                StoryBrandView storyBrandView3 = this.f99457l;
                if (storyBrandView3 == null) {
                    l.a("storyBrandView");
                }
                storyBrandView3.setVisibility(8);
                FrameLayout frameLayout5 = this.f99458m;
                if (frameLayout5 != null) {
                    frameLayout5.setOnClickListener(new h(this));
                }
            }
            f.a.a(this, v(), e.f99464a, com.bytedance.assem.arch.viewModel.l.a(), new i(this), 4);
            if (this.q && (dVar = (com.ss.android.ugc.aweme.story.avatar.d) this.x.getValue()) != null) {
                dVar.a(com.ss.android.ugc.aweme.story.g.f137757a.e().a());
            }
        }
    }

    static final class i extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends String>, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(63423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar) {
            super(2);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends String> aVar) {
            l.d(pVar, "");
            l.d(aVar, "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            UrlModel avatarThumb = curUser.getAvatarThumb();
            if (!l.a(avatarThumb, this.this$0.r)) {
                this.this$0.r = avatarThumb;
                com.ss.android.ugc.aweme.base.e.a(this.this$0.n, this.this$0.r);
            }
            return z.f158842a;
        }
    }
}
