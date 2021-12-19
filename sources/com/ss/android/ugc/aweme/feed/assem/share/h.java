package com.ss.android.ugc.aweme.feed.assem.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bb;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.x.x;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.utils.w;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;
import h.z;

public final class h extends com.ss.android.ugc.aweme.feed.assem.base.a<h> implements View.OnClickListener {
    static final /* synthetic */ h.k.i[] u = {new y(h.class, "videoShareVM", "getVideoShareVM()Lcom/ss/android/ugc/aweme/feed/assem/share/VideoShareViewModel;", 0)};
    public static final i v = new i((byte) 0);
    private SparseArray A;
    private final h.h.d w;
    private final h.h x;
    private final h.h y;
    private com.ss.android.ugc.aweme.cp.g z;

    public static final class b extends h.f.b.m implements h.f.a.b<r, r> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58529);
        }

        public b() {
            super(1);
        }

        public final r invoke(r rVar) {
            h.f.b.l.c(rVar, "");
            return rVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58530);
        }

        public c() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<bb, bb> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58533);
        }

        public f() {
            super(1);
        }

        public final bb invoke(bb bbVar) {
            h.f.b.l.c(bbVar, "");
            return bbVar;
        }
    }

    static {
        Covode.recordClassIndex(58527);
    }

    private final VideoViewModel J() {
        return (VideoViewModel) this.x.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.t6;
    }

    public final VideoShareViewModel F() {
        return (VideoShareViewModel) this.w.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.A == null) {
            this.A = new SparseArray();
        }
        View view = (View) this.A.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s2 = s();
        if (s2 == null) {
            return null;
        }
        View findViewById = s2.findViewById(R.id.dlk);
        this.A.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class i {
        static {
            Covode.recordClassIndex(58536);
        }

        private i() {
        }

        public /* synthetic */ i(byte b2) {
            this();
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58531);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58532);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bb>> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58534);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bb> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$h  reason: collision with other inner class name */
    public static final class C2248h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final C2248h INSTANCE = new C2248h();

        static {
            Covode.recordClassIndex(58535);
        }

        public C2248h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FrameLayout f92455a;

        static {
            Covode.recordClassIndex(58537);
        }

        j(FrameLayout frameLayout) {
            this.f92455a = frameLayout;
        }

        public final void run() {
            this.f92455a.clearAnimation();
        }
    }

    @Override // com.bytedance.assem.arch.b.x
    public final void D() {
        super.D();
        I();
    }

    public final com.ss.android.ugc.aweme.cp.g H() {
        if (this.z == null) {
            this.z = new com.ss.android.ugc.aweme.cp.g();
        }
        return this.z;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final void a() {
        super.a();
        F().a((Context) null);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58528);
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

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FrameLayout f92456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f92457b;

        static {
            Covode.recordClassIndex(58538);
        }

        k(FrameLayout frameLayout, h hVar) {
            this.f92456a = frameLayout;
            this.f92457b = hVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.base.e.a((RemoteImageView) this.f92457b.B().findViewById(R.id.e10), 2131233113);
            this.f92456a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150).withEndAction(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.feed.assem.share.h.k.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ k f92458a;

                static {
                    Covode.recordClassIndex(58539);
                }

                {
                    this.f92458a = r1;
                }

                public final void run() {
                    this.f92458a.f92456a.clearAnimation();
                }
            });
        }
    }

    static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f92478a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout f92479b;

        static {
            Covode.recordClassIndex(58556);
        }

        t(RemoteImageView remoteImageView, FrameLayout frameLayout) {
            this.f92478a = remoteImageView;
            this.f92479b = frameLayout;
        }

        public final void run() {
            com.ss.android.ugc.aweme.base.e.a(this.f92478a, 2131231780);
            this.f92479b.animate().scaleX(1.16f).scaleY(1.16f).setDuration(150).withEndAction(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.feed.assem.share.h.t.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ t f92480a;

                static {
                    Covode.recordClassIndex(58557);
                }

                {
                    this.f92480a = r1;
                }

                public final void run() {
                    this.f92480a.f92479b.animate().scaleX(0.8f).scaleY(0.8f).setDuration(150).withEndAction(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.feed.assem.share.h.t.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f92481a;

                        static {
                            Covode.recordClassIndex(58558);
                        }

                        {
                            this.f92481a = r1;
                        }

                        public final void run() {
                            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.16f, 0.8f, 1.16f, 1, 0.5f, 1, 0.5f);
                            scaleAnimation.setDuration(600);
                            scaleAnimation.setRepeatMode(2);
                            scaleAnimation.setRepeatCount(-1);
                            this.f92481a.f92480a.f92479b.startAnimation(scaleAnimation);
                        }
                    }).start();
                }
            }).start();
        }
    }

    public final void I() {
        FrameLayout frameLayout = (FrameLayout) B().findViewById(R.id.e0s);
        if (frameLayout != null) {
            Animation animation = frameLayout.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            com.ss.android.ugc.aweme.base.utils.m.a(new j(frameLayout));
        }
        F().i();
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        f.a.a(this, F(), j.f92483a, (com.bytedance.assem.arch.viewModel.k) null, l.f92459a, 6);
        f.a.a(this, F(), k.f92484a, (com.bytedance.assem.arch.viewModel.k) null, m.f92460a, 6);
        f.a.a(this, F(), l.f92485a, (com.bytedance.assem.arch.viewModel.k) null, n.f92461a, 6);
        f.a.a(this, F(), m.f92486a, com.bytedance.assem.arch.viewModel.l.b(), o.f92462a, 4);
        super.x();
    }

    public h() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VideoShareViewModel.class);
        this.w = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.x = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
        this.y = new com.bytedance.ext_power_list.g(ab.a(VideoEventDispatchViewModel.class), this, g.INSTANCE, C2248h.INSTANCE, f.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final /* synthetic */ void b(VideoItemParams videoItemParams) {
        b(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        super.b(videoItemParams);
        F().a(ar_());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        com.ss.android.ugc.aweme.cp.g H = H();
        if (H != null) {
            H.c();
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        ((RemoteImageView) B().findViewById(R.id.e10)).setOnClickListener(this);
        ((RemoteImageView) B().findViewById(R.id.e10)).setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.6f));
        ((TuxTextView) B().findViewById(R.id.e0v)).setOnClickListener(this);
        ((FrameLayout) B().findViewById(R.id.e0s)).setOnClickListener(this);
        com.ss.android.ugc.aweme.cp.g H = H();
        if (H != null) {
            H.f78266a = s();
            H.f78267b = B();
            H.f78268c = (FrameLayout) B().findViewById(R.id.e0s);
            H.f78269d = (RemoteImageView) B().findViewById(R.id.e10);
        }
        f.a.a(this, J(), n.f92487a, (com.bytedance.assem.arch.viewModel.k) null, p.f92474a, 6);
        f.a.b(this, J(), o.f92488a, (com.bytedance.assem.arch.viewModel.k) null, q.f92475a, 6);
        f.a.b(this, J(), p.f92489a, (com.bytedance.assem.arch.viewModel.k) null, r.f92476a, 6);
        f.a.b(this, (VideoEventDispatchViewModel) this.y.getValue(), q.f92490a, (com.bytedance.assem.arch.viewModel.k) null, s.f92477a, 6);
    }

    public final void onClick(View view) {
        RemoteImageView remoteImageView;
        DataCenter dataCenter;
        Aweme aweme;
        String uid;
        String str;
        String str2;
        com.ss.android.ugc.aweme.feed.param.b a2;
        com.ss.android.ugc.aweme.feed.param.b a3;
        String uid2;
        String str3;
        ClickAgent.onClick(view);
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            g.a();
            com.ss.android.ugc.aweme.common.r.a("verify_precise_exp", new com.ss.android.ugc.aweme.app.f.d().a("scene", "enter_share").f66730a);
            VideoShareViewModel F = F();
            View B = B();
            String str4 = null;
            if (B != null) {
                remoteImageView = (RemoteImageView) B.findViewById(R.id.e10);
            } else {
                remoteImageView = null;
            }
            VideoItemParams videoItemParams = (VideoItemParams) F.g();
            if (videoItemParams != null && (dataCenter = videoItemParams.dataCenter) != null) {
                String str5 = "";
                h.f.b.l.b(dataCenter, str5);
                VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                if (videoItemParams2 != null && (aweme = videoItemParams2.mAweme) != null) {
                    dataCenter.a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", aweme.getAid());
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - F.v < 800) {
                        F.v = 0;
                    } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aX(aweme)) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(F.h()).a(R.string.ob).a();
                    } else {
                        F.v = currentTimeMillis;
                        if (((aweme.isCanPlay() && !aweme.isDelete()) || x.a(aweme, ((FeedBaseViewModel) F).o) || com.ss.android.ugc.aweme.login.b.a.b(aweme)) && (((FeedBaseViewModel) F).o == 1000 || x.a(aweme, ((FeedBaseViewModel) F).o) || !com.ss.android.ugc.aweme.login.b.a.a(aweme))) {
                            if (com.ss.android.ugc.aweme.share.y.f124429b && !com.ss.android.ugc.aweme.im.service.c.k.c()) {
                                com.ss.android.ugc.aweme.share.y.c(aweme);
                            }
                            dataCenter.a("video_share_click", (Object) null);
                            if (F.n) {
                                com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", ac.e(aweme)).a("author_id", ac.a(aweme));
                                Context h2 = F.h();
                                if (!(h2 instanceof Activity)) {
                                    h2 = null;
                                }
                                Activity activity = (Activity) h2;
                                if (activity != null) {
                                    str3 = ah.f123353b.b(activity);
                                } else {
                                    str3 = null;
                                }
                                com.ss.android.ugc.aweme.common.r.a("share_highlight_click", a4.a("show_content", str3).a("is_pop_up", 0).f66730a);
                            } else if (remoteImageView != null) {
                                com.ss.android.ugc.aweme.feed.helper.l.a();
                                com.ss.android.ugc.aweme.feed.helper.l.a(remoteImageView, F.p, ac.e(aweme), ac.a(aweme));
                            }
                            SecApiImpl.a().reportData("share");
                            F.i();
                            String str6 = F.p;
                            if (str6 == null) {
                                str6 = str5;
                            }
                            boolean c2 = com.ss.android.ugc.aweme.im.service.c.k.c();
                            int hashCode = str6.hashCode();
                            if (hashCode != -1271119582) {
                                if (hashCode == 1691937916 && str6.equals("homepage_hot")) {
                                    com.bytedance.ies.ugc.appcontext.d.a();
                                    com.ss.android.ugc.aweme.common.r.a("click_share_button", "homepage_hot", aweme.getAid(), 0);
                                    com.ss.android.ugc.aweme.metrics.f f2 = new com.ss.android.ugc.aweme.metrics.f(c2).a("homepage_hot").g(aweme);
                                    f2.p = (String) dataCenter.b("playlist_id", str5);
                                    f2.f109572e = (String) dataCenter.b("playlist_id_key", str5);
                                    f2.f109571d = (String) dataCenter.b("playlist_type", str5);
                                    com.ss.android.ugc.aweme.metrics.f fVar = (com.ss.android.ugc.aweme.metrics.f) f2.c((String) dataCenter.b("tab_name", str5)).d(ac.b(aweme, ((FeedBaseViewModel) F).o));
                                    User author = aweme.getAuthor();
                                    if (!(author == null || (uid2 = author.getUid()) == null)) {
                                        str5 = uid2;
                                    }
                                    fVar.f109569b = str5;
                                    fVar.v = com.ss.android.ugc.aweme.story.d.a.b(aweme);
                                    fVar.V = com.ss.android.ugc.aweme.story.b.h.a(aweme.getAuthor());
                                    fVar.u = Boolean.valueOf(com.ss.android.ugc.aweme.story.d.a.g(aweme));
                                    com.ss.android.ugc.aweme.upvote.event.c.a(fVar, aweme, "homepage_hot").f();
                                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
                                        com.ss.android.ugc.aweme.commercialize.g.a().u(F.h(), aweme);
                                    }
                                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
                                }
                            } else if (str6.equals("homepage_follow")) {
                                com.bytedance.ies.ugc.appcontext.d.a();
                                com.ss.android.ugc.aweme.common.r.a("click_share_button", "homepage_follow", aweme.getAid(), 0);
                                com.ss.android.ugc.aweme.metrics.f f3 = new com.ss.android.ugc.aweme.metrics.f(c2).a("homepage_follow").g(aweme);
                                f3.p = (String) dataCenter.b("playlist_id", str5);
                                f3.f109572e = (String) dataCenter.b("playlist_id_key", str5);
                                f3.f109571d = (String) dataCenter.b("playlist_type", str5);
                                com.ss.android.ugc.aweme.metrics.f fVar2 = (com.ss.android.ugc.aweme.metrics.f) f3.c((String) dataCenter.b("tab_name", str5)).d(ac.b(aweme, ((FeedBaseViewModel) F).o));
                                User author2 = aweme.getAuthor();
                                if (!(author2 == null || (uid = author2.getUid()) == null)) {
                                    str5 = uid;
                                }
                                fVar2.f109569b = str5;
                                fVar2.f();
                                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
                            }
                            if (F.u == 2) {
                                com.bytedance.ies.ugc.appcontext.d.a();
                                com.ss.android.ugc.aweme.common.r.a("click_share_button", str6, aweme.getAid(), 0);
                                Context h3 = F.h();
                                if (h3 == null || (a3 = FeedParamProvider.a.a(h3)) == null) {
                                    str = null;
                                } else {
                                    str = a3.getSearchResultId();
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = ac.e(aweme);
                                }
                                com.ss.android.ugc.aweme.metrics.f fVar3 = new com.ss.android.ugc.aweme.metrics.f(c2);
                                String str7 = F.p;
                                if (str7 == null) {
                                    str7 = str5;
                                }
                                com.ss.android.ugc.aweme.metrics.f f4 = fVar3.a(str7).g(aweme);
                                f4.p = (String) dataCenter.b("playlist_id", str5);
                                f4.f109572e = (String) dataCenter.b("playlist_id_key", str5);
                                f4.f109571d = (String) dataCenter.b("playlist_type", str5);
                                com.ss.android.ugc.aweme.metrics.f fVar4 = (com.ss.android.ugc.aweme.metrics.f) f4.c((String) dataCenter.b("tab_name", str5)).d(ac.b(aweme, ((FeedBaseViewModel) F).o));
                                User author3 = aweme.getAuthor();
                                if (author3 == null || (str2 = author3.getUid()) == null) {
                                    str2 = str5;
                                }
                                fVar4.f109569b = str2;
                                Context h4 = F.h();
                                if (!(h4 == null || (a2 = FeedParamProvider.a.a(h4)) == null)) {
                                    str4 = a2.getSearchId();
                                }
                                com.ss.android.ugc.aweme.metrics.c a5 = fVar4.l(str4).f(str).a(w.a(aweme, "click_more_button", str6));
                                String str8 = F.p;
                                if (str8 != null) {
                                    str5 = str8;
                                }
                                com.ss.android.ugc.aweme.upvote.event.c.a(a5, aweme, str5).f();
                            }
                            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
                        } else if (aweme.isImage()) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(F.h()).a(R.string.cjs).a();
                        } else {
                            new com.ss.android.ugc.aweme.tux.a.i.a(F.h()).a(com.ss.android.ugc.aweme.login.b.a.a(aweme, R.string.har)).a();
                        }
                    }
                }
            }
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<h, com.bytedance.assem.arch.extensions.a<? extends String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f92474a = new p();

        static {
            Covode.recordClassIndex(58552);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(h hVar, com.bytedance.assem.arch.extensions.a<? extends String> aVar) {
            h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            if (aVar != null) {
                hVar2.I();
            }
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<h, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f92475a = new q();

        static {
            Covode.recordClassIndex(58553);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(h hVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            if (aVar != null) {
                hVar2.F().a(VideoShareViewModel.g.f92437a);
            }
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<h, com.bytedance.assem.arch.extensions.a<? extends VideoItemParams>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f92476a = new r();

        static {
            Covode.recordClassIndex(58554);
        }

        r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(h hVar, com.bytedance.assem.arch.extensions.a<? extends VideoItemParams> aVar) {
            h hVar2 = hVar;
            com.bytedance.assem.arch.extensions.a<? extends VideoItemParams> aVar2 = aVar;
            h.f.b.l.d(hVar2, "");
            if (aVar2 != null) {
                VideoShareViewModel F = hVar2.F();
                T t = aVar2.f25631b;
                if (t != null) {
                    F.a(new VideoShareViewModel.f(F, t));
                }
            }
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<h, d, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f92459a = new l();

        static {
            Covode.recordClassIndex(58540);
        }

        l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(h hVar, d dVar) {
            int i2;
            h hVar2 = hVar;
            d dVar2 = dVar;
            h.f.b.l.d(hVar2, "");
            if (dVar2 != null) {
                FrameLayout frameLayout = (FrameLayout) hVar2.B().findViewById(R.id.e0s);
                if (dVar2.f92445a) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                frameLayout.setVisibility(i2);
                Float f2 = dVar2.f92446b;
                if (f2 != null) {
                    frameLayout.setAlpha(f2.floatValue());
                }
                frameLayout.setEnabled(dVar2.f92447c);
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<h, e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f92460a = new m();

        static {
            Covode.recordClassIndex(58541);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(h hVar, e eVar) {
            int i2;
            h hVar2 = hVar;
            e eVar2 = eVar;
            h.f.b.l.d(hVar2, "");
            if (eVar2 != null) {
                TuxTextView tuxTextView = (TuxTextView) hVar2.B().findViewById(R.id.e0v);
                if (eVar2.f92448a) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                tuxTextView.setVisibility(i2);
                Float f2 = eVar2.f92449b;
                if (f2 != null && f2.floatValue() > 0.0f) {
                    tuxTextView.setTextSize(1, f2.floatValue());
                }
                String str = eVar2.f92450c;
                if (str != null && str.length() > 0) {
                    tuxTextView.setText(str);
                }
                if (hVar2.H() != null) {
                    TuxTextView tuxTextView2 = (TuxTextView) hVar2.B().findViewById(R.id.e0v);
                    h.f.b.l.b(tuxTextView2, "");
                    com.ss.android.ugc.aweme.cp.g.a(tuxTextView2);
                }
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<h, f, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f92461a = new n();

        static {
            Covode.recordClassIndex(58542);
        }

        n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(h hVar, f fVar) {
            h hVar2 = hVar;
            f fVar2 = fVar;
            h.f.b.l.d(hVar2, "");
            if (fVar2 != null) {
                Drawable drawable = fVar2.f92451a;
                if (drawable != null) {
                    ((RemoteImageView) hVar2.B().findViewById(R.id.e10)).setImageDrawable(drawable);
                }
                ViewGroup.LayoutParams layoutParams = fVar2.f92452b;
                if (layoutParams != null) {
                    RemoteImageView remoteImageView = (RemoteImageView) hVar2.B().findViewById(R.id.e10);
                    h.f.b.l.b(remoteImageView, "");
                    remoteImageView.getLayoutParams().width = layoutParams.width;
                    RemoteImageView remoteImageView2 = (RemoteImageView) hVar2.B().findViewById(R.id.e10);
                    h.f.b.l.b(remoteImageView2, "");
                    remoteImageView2.getLayoutParams().height = layoutParams.height;
                }
            }
            return z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<h, com.ss.android.ugc.aweme.shortvideo.j.j, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f92477a = new s();

        static {
            Covode.recordClassIndex(58555);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(h hVar, com.ss.android.ugc.aweme.shortvideo.j.j jVar) {
            String str;
            int k2;
            Aweme aweme;
            Aweme aweme2;
            MethodCollector.i(8710);
            h hVar2 = hVar;
            com.ss.android.ugc.aweme.shortvideo.j.j jVar2 = jVar;
            h.f.b.l.d(hVar2, "");
            if (jVar2 != null) {
                VideoShareViewModel F = hVar2.F();
                h.f.b.l.d(jVar2, "");
                if (jVar2.f128596c == 7) {
                    String str2 = jVar2.f128599f;
                    VideoItemParams videoItemParams = (VideoItemParams) F.g();
                    String str3 = null;
                    if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null) {
                        str = null;
                    } else {
                        str = aweme2.getAid();
                    }
                    if (TextUtils.equals(str2, str)) {
                        synchronized (F) {
                            try {
                                String str4 = jVar2.f128599f;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                h.f.b.l.b(str4, "");
                                F.f92433l++;
                                if (!(F.j() || (k2 = VideoShareViewModel.k()) == 0 || k2 == -2)) {
                                    try {
                                        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                                        Context h2 = F.h();
                                        if (!(h2 instanceof Activity)) {
                                            h2 = null;
                                        }
                                        if (j2 == ((Activity) h2)) {
                                            Aweme a2 = AwemeChangeCallBack.a((androidx.fragment.app.e) com.bytedance.ies.ugc.appcontext.f.j());
                                            h.f.b.l.b(a2, "");
                                            String aid = a2.getAid();
                                            VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                                            if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
                                                str3 = aweme.getAid();
                                            }
                                            TextUtils.equals(aid, str3);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                MethodCollector.o(8710);
                                throw th;
                            }
                        }
                    }
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(8710);
            return zVar;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<h, com.bytedance.assem.arch.extensions.a<? extends h.p<? extends b, ? extends Object>>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f92462a = new o();

        static {
            Covode.recordClassIndex(58543);
        }

        o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
            r3 = r10.f25631b;
         */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.feed.assem.share.h r9, com.bytedance.assem.arch.extensions.a<? extends h.p<? extends com.ss.android.ugc.aweme.feed.assem.share.b, ? extends java.lang.Object>> r10) {
            /*
            // Method dump skipped, instructions count: 304
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.share.h.o.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
