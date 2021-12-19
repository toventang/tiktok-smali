package com.ss.android.ugc.aweme.feed.assem.avatar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bb;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;
import h.z;
import org.json.JSONObject;

public final class b implements com.bytedance.assem.arch.viewModel.f<a> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f92005a = {new y(b.class, "avatarDefaultVM", "getAvatarDefaultVM()Lcom/ss/android/ugc/aweme/feed/assem/avatar/FeedAvatarDefaultVM;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public AnimationImageView f92006b;

    /* renamed from: c  reason: collision with root package name */
    ViewGroup f92007c;

    /* renamed from: d  reason: collision with root package name */
    SmartAvatarBorderView f92008d;

    /* renamed from: e  reason: collision with root package name */
    SmartImageView f92009e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f92010f;

    /* renamed from: g  reason: collision with root package name */
    RemoteImageView f92011g;

    /* renamed from: h  reason: collision with root package name */
    public Context f92012h;

    /* renamed from: i  reason: collision with root package name */
    final f f92013i;

    /* renamed from: j  reason: collision with root package name */
    public final a f92014j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f92015k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f92016l;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.b$b  reason: collision with other inner class name */
    public static final class C2221b extends h.f.b.m implements h.f.a.b<h, h> {
        public static final C2221b INSTANCE = new C2221b();

        static {
            Covode.recordClassIndex(57948);
        }

        public C2221b() {
            super(1);
        }

        public final h invoke(h hVar) {
            h.f.b.l.c(hVar, "");
            return hVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<bb, bb> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(57949);
        }

        public c() {
            super(1);
        }

        public final bb invoke(bb bbVar) {
            h.f.b.l.c(bbVar, "");
            return bbVar;
        }
    }

    static {
        Covode.recordClassIndex(57946);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super a, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        this.f92014j.a(assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super a, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        this.f92014j.a(assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super a, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        this.f92014j.a(assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super a, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        this.f92014j.a(assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super a, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        this.f92014j.a(assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }

    /* access modifiers changed from: package-private */
    public final VideoEventDispatchViewModel b() {
        return (VideoEventDispatchViewModel) this.f92015k.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super a, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        this.f92014j.b(assemViewModel, kVar, kVar2, bVar, mVar);
    }

    public final FeedAvatarDefaultVM c() {
        return (FeedAvatarDefaultVM) this.f92016l.a(this, f92005a[0]);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this.f92014j.getActualLifecycleOwnerHolder();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<a> getActualReceiverHolder() {
        return this.f92014j.getActualReceiverHolder();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return this.f92014j.getHasSubscribedForReused();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return this.f92014j.getHostLifecycleOwner();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return this.f92014j.getUniqueOnlyDefault();
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bb>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(57950);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bb> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(57951);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    /* Return type fixed from 'com.bytedance.tiktok.proxy.d' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.f
    public final /* bridge */ /* synthetic */ a getReceiverForHostVM() {
        return (a) this.f92014j.getReceiverForHostVM();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(57947);
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

    public final Context a() {
        Context context = this.f92012h;
        if (context == null) {
            h.f.b.l.a("context");
        }
        return context;
    }

    public static final class f implements IProfileBadgeService.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f92017a;

        static {
            Covode.recordClassIndex(57952);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(b bVar) {
            this.f92017a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.IProfileBadgeService.c
        public final void a(ProfileBadgeStruct profileBadgeStruct) {
            String str;
            Aweme aweme;
            User author;
            Aweme aweme2;
            FeedAvatarDefaultVM c2 = this.f92017a.c();
            if (profileBadgeStruct != null) {
                VideoItemParams videoItemParams = (VideoItemParams) c2.g();
                if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null) {
                    str = null;
                } else {
                    str = aweme2.getAuthorUid();
                }
                IAccountUserService e2 = AccountService.a().e();
                h.f.b.l.b(e2, "");
                User curUser = e2.getCurUser();
                h.f.b.l.b(curUser, "");
                if (h.f.b.l.a((Object) str, (Object) curUser.getUid())) {
                    VideoItemParams videoItemParams2 = (VideoItemParams) c2.g();
                    if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null || (author = aweme.getAuthor()) == null)) {
                        author.setProfileBadgeStruct(profileBadgeStruct);
                    }
                    c2.b(new FeedAvatarDefaultVM.b(c2, c2.i()));
                }
            }
        }
    }

    public static final /* synthetic */ AnimationImageView a(b bVar) {
        AnimationImageView animationImageView = bVar.f92006b;
        if (animationImageView == null) {
            h.f.b.l.a("followView");
        }
        return animationImageView;
    }

    public b(a aVar) {
        h.f.b.l.d(aVar, "");
        this.f92014j = aVar;
        this.f92015k = new com.bytedance.ext_power_list.g(ab.a(VideoEventDispatchViewModel.class), aVar, d.INSTANCE, e.INSTANCE, c.INSTANCE);
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(FeedAvatarDefaultVM.class);
        this.f92016l = com.bytedance.ext_power_list.k.a(aVar, a2, cVar == null ? i.c.f25720a : cVar, new a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(aVar), C2221b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(aVar), com.bytedance.ext_power_list.k.c(aVar));
        this.f92013i = new f(this);
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f92020a;

        static {
            Covode.recordClassIndex(57956);
        }

        j(b bVar) {
            this.f92020a = bVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            ClickAgent.onClick(view);
            VideoItemParams videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92020a.f92014j);
            if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null) {
                DataCenter dataCenter = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92020a.f92014j)).dataCenter;
                if (dataCenter != null) {
                    dataCenter.a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", aweme.getAid());
                }
                h.f.b.l.b(view, "");
                if (view.getVisibility() != 4 && !com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme) && !aweme.isDelete() && aweme.getAuthor() != null) {
                    User author = aweme.getAuthor();
                    h.f.b.l.b(author, "");
                    if (author.getFollowStatus() == 0) {
                        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                        h.f.b.l.b(g2, "");
                        if (!h.f.b.l.a((Object) g2.getCurUserId(), (Object) aweme.getAuthorUid())) {
                            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme)) {
                                com.ss.android.ugc.aweme.commercialize.g.a().a(this.f92020a.a(), aweme);
                                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "follow", aweme.getAwemeRawAd()).a("anchor_id", com.ss.android.ugc.aweme.feed.ui.m.a(aweme)).a("room_id", com.ss.android.ugc.aweme.feed.ui.m.b(aweme)).c();
                            }
                            if (com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme)) {
                                com.ss.android.ugc.aweme.commercialize.g.a().a(this.f92020a.a(), aweme, "plus_sign");
                            }
                            com.ss.android.ugc.aweme.base.utils.f fVar = f.a.f68431a;
                            h.f.b.l.b(fVar, "");
                            if (!fVar.c()) {
                                new com.ss.android.ugc.aweme.tux.a.i.a(this.f92020a.a()).a(R.string.de8).a();
                                return;
                            }
                            DataCenter dataCenter2 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92020a.f92014j)).dataCenter;
                            if (dataCenter2 != null) {
                                ag agVar = new ag(12, aweme);
                                agVar.f93454e = "feed";
                                dataCenter2.a("feed_internal_event", agVar);
                            }
                            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                            h.f.b.l.b(g3, "");
                            if (g3.isLogin()) {
                                com.ss.android.ugc.aweme.discover.hitrank.d.a(aweme.getAuthor(), 5);
                                Context a2 = this.f92020a.a();
                                Context a3 = this.f92020a.a();
                                User author2 = aweme.getAuthor();
                                h.f.b.l.b(author2, "");
                                com.ss.android.ugc.aweme.feed.x.a.a(a2, a3.getString(R.string.kv, author2.getNickname()), false, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f92018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f92019b;

        static {
            Covode.recordClassIndex(57953);
        }

        g(b bVar, VideoItemParams videoItemParams) {
            this.f92018a = bVar;
            this.f92019b = videoItemParams;
        }

        public final void onClick(View view) {
            int i2;
            String str;
            boolean z;
            String str2;
            String str3;
            String str4;
            String str5;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a c2;
            ClickAgent.onClick(view);
            Aweme aweme = this.f92019b.mAweme;
            DataCenter dataCenter = this.f92019b.dataCenter;
            if (!in.d() && !com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
                String str6 = "";
                if ((!h.f.b.l.a((Object) this.f92019b.mEventType, (Object) "new_ad_fake_user")) && com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme)) {
                    h.f.b.l.b(aweme, str6);
                    if (!aweme.isAd()) {
                        return;
                    }
                }
                h.f.b.l.b(aweme, str6);
                if (!aweme.isCanPlay() || aweme.isDelete()) {
                    com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(this.f92018a.a());
                    if (aweme.isImage()) {
                        i2 = R.string.cjs;
                    } else {
                        i2 = R.string.har;
                    }
                    aVar.a(i2).a();
                    return;
                }
                IAdSceneService f2 = AdSceneServiceImpl.f();
                if (!(f2 == null || (c2 = f2.c()) == null)) {
                    c2.a(aweme, this.f92018a.a());
                }
                u a2 = new u().a("homepage_hot");
                a2.f109596a = u.c.ITEM;
                a2.f109597b = u.a.ENTER_PROFILE;
                u a3 = a2.g(aweme).a(aweme.getAuthor());
                User author = aweme.getAuthor();
                h.f.b.l.b(author, str6);
                a3.s(author.getRequestId()).b();
                com.ss.android.ugc.aweme.feed.s.a(af.PROFILE);
                JSONObject jSONObject = this.f92019b.mRequestId;
                if (jSONObject == null || (str = jSONObject.optString("request_id")) == null) {
                    str = aweme.getRequestId();
                }
                aweme.setRequestId(str);
                if (dataCenter != null) {
                    dataCenter.a("feed_internal_event", new ag(19, aweme));
                }
                if (MSAdaptionService.c().c(this.f92018a.a())) {
                    SmartRouter.buildRoute(this.f92018a.a(), "//duo").withParam("duo_type", "duo_profile").open();
                    return;
                }
                if (dataCenter != null) {
                    dataCenter.a("to_profile", str6);
                }
                com.ss.android.ugc.aweme.metrics.q c3 = new com.ss.android.ugc.aweme.metrics.q().c(aweme, this.f92019b.mPageType);
                String str7 = this.f92019b.mEventType;
                if (str7 == null) {
                    str7 = str6;
                }
                com.ss.android.ugc.aweme.metrics.q qVar = (com.ss.android.ugc.aweme.metrics.q) c3.o(str7).a(this.f92018a.a());
                qVar.Y = FeedParamProvider.a.a(this.f92018a.a()).getPreviousPage();
                qVar.Z = FeedParamProvider.a.a(this.f92018a.a()).getPreviousPagePosition();
                if (aweme.getBottomBarModel() != null) {
                    z = true;
                } else {
                    z = false;
                }
                qVar.aa = z;
                String str8 = null;
                if (dataCenter != null) {
                    str2 = (String) dataCenter.b("playlist_type", str6);
                } else {
                    str2 = null;
                }
                qVar.t = str2;
                if (dataCenter != null) {
                    str3 = (String) dataCenter.b("playlist_id", str6);
                } else {
                    str3 = null;
                }
                qVar.v = str3;
                if (dataCenter != null) {
                    str4 = (String) dataCenter.b("playlist_id_key", str6);
                } else {
                    str4 = null;
                }
                qVar.u = str4;
                if (dataCenter != null) {
                    str8 = (String) dataCenter.b("tab_name", str6);
                }
                com.ss.android.ugc.aweme.metrics.h l2 = ((com.ss.android.ugc.aweme.metrics.a) qVar.c(str8).d(ac.b(aweme, this.f92019b.mPageType))).a("click_head").l(FeedParamProvider.a.a(this.f92018a.a()).getSearchId());
                String searchResultId = FeedParamProvider.a.a(this.f92018a.a()).getSearchResultId();
                if (searchResultId == null || searchResultId.length() == 0) {
                    searchResultId = aweme.getAid();
                }
                com.ss.android.ugc.aweme.metrics.q qVar2 = (com.ss.android.ugc.aweme.metrics.q) l2.f(searchResultId);
                qVar2.ad = FeedParamProvider.a.a(this.f92018a.a()).getCategoryName();
                qVar2.V = com.ss.android.ugc.aweme.story.b.h.a(aweme.getAuthor());
                if (com.ss.android.ugc.aweme.story.d.a.g(aweme)) {
                    str5 = "story";
                } else {
                    str5 = UGCMonitor.TYPE_POST;
                }
                qVar2.W = str5;
                com.ss.android.ugc.aweme.metrics.h b_ = qVar2.b_(com.ss.android.ugc.aweme.story.d.a.b(aweme));
                String str9 = this.f92019b.mEventType;
                if (str9 != null) {
                    str6 = str9;
                }
                com.ss.android.ugc.aweme.upvote.event.c.a(b_, aweme, str6).f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011b, code lost:
        if (com.ss.android.ugc.aweme.commercialize.model.n.a.a(r0.getAuthor()) != false) goto L_0x011d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.VideoItemParams r12) {
        /*
        // Method dump skipped, instructions count: 378
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.avatar.b.a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public final void a(String str) {
        int i2;
        Aweme aweme;
        SmartImageView smartImageView = this.f92009e;
        if (smartImageView == null) {
            h.f.b.l.a("profileWidgetView");
        }
        if (str == null || str.length() == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        smartImageView.setVisibility(i2);
        if (str != null && str.length() != 0) {
            v a2 = com.bytedance.lighten.a.r.a(str);
            SmartImageView smartImageView2 = this.f92009e;
            if (smartImageView2 == null) {
                h.f.b.l.a("profileWidgetView");
            }
            a2.E = smartImageView2;
            a2.c();
            VideoItemParams videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92014j);
            if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null) {
                com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", aweme.getAid());
                User author = aweme.getAuthor();
                String str2 = "";
                h.f.b.l.b(author, str2);
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", author.getSecUid());
                User author2 = aweme.getAuthor();
                h.f.b.l.b(author2, str2);
                ProfileBadgeStruct profileBadge = author2.getProfileBadge();
                Long l2 = str2;
                if (profileBadge != null) {
                    l2 = Long.valueOf(profileBadge.getId());
                }
                com.ss.android.ugc.aweme.common.r.a("profile_badge_show", a4.a("badge_id", l2).a("enter_from", ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92014j)).mEventType).f66730a);
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<a, String, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(57955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, String str) {
            h.f.b.l.d(aVar, "");
            this.this$0.a(str);
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<a, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(57954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(aVar, "");
            b.a(this.this$0).setVisibility(intValue);
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<a, com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(57959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar2) {
            Aweme aweme;
            a aVar3 = aVar;
            com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            VideoItemParams videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3);
            if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null && aVar4 != null && aVar4.f34874a == 3 && com.ss.android.ugc.aweme.commercialize.e.a.b.w(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.x(aweme)) {
                this.this$0.c().h();
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<a, com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(57960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g gVar) {
            Aweme aweme;
            String str;
            a aVar2 = aVar;
            com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g gVar2 = gVar;
            h.f.b.l.d(aVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2);
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null)) {
                if (gVar2 != null) {
                    str = gVar2.f34887a;
                } else {
                    str = null;
                }
                if (h.f.b.l.a((Object) str, (Object) aweme.getAid())) {
                    this.this$0.c().h();
                }
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<a, FollowStatusEvent, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(57957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, FollowStatusEvent followStatusEvent) {
            FollowStatus followStatus;
            VideoItemParams videoItemParams;
            Aweme aweme;
            FollowStatusEvent followStatusEvent2 = followStatusEvent;
            h.f.b.l.d(aVar, "");
            if (!(followStatusEvent2 == null || (followStatus = followStatusEvent2.status) == null)) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                if (!(!g2.isLogin() || (videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(this.this$0.f92014j)) == null || (aweme = videoItemParams.mAweme) == null)) {
                    User author = aweme.getAuthor();
                    h.f.b.l.b(author, "");
                    if (!(!h.f.b.l.a((Object) author.getUid(), (Object) followStatus.userId)) && aweme.isCanPlay()) {
                        User author2 = aweme.getAuthor();
                        h.f.b.l.b(author2, "");
                        author2.setFollowStatus(followStatus.followStatus);
                        b.a(this.this$0).d();
                        b.a(this.this$0).setProgress(0.0f);
                        if (followStatus.followStatus == 0) {
                            this.this$0.c().h();
                        } else {
                            b.a(this.this$0).a();
                            b.a(this.this$0).a(new AnimatorListenerAdapter(this) {
                                /* class com.ss.android.ugc.aweme.feed.assem.avatar.b.k.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ k f92021a;

                                static {
                                    Covode.recordClassIndex(57958);
                                }

                                /* JADX WARN: Incorrect args count in method signature: ()V */
                                {
                                    this.f92021a = r1;
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f92021a.this$0.c().h();
                                }
                            });
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }
}
