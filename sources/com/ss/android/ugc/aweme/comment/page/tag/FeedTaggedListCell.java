package com.ss.android.ugc.aweme.comment.page.tag;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.follow.NewFollowButton;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.im.IIMAdapterService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import java.util.List;

public final class FeedTaggedListCell extends PowerCell<e> {

    /* renamed from: j  reason: collision with root package name */
    public static final o f72139j = new o((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public NewFollowButton f72140a;

    /* renamed from: b  reason: collision with root package name */
    public TuxButton f72141b;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f72142k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f72143l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f72144m;
    private SmartImageView n;
    private TuxTextView o;
    private TuxTextView p;
    private TuxTextView q;

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(44379);
        }

        public g() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f fVar) {
            h.f.b.l.c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(44372);
    }

    private final com.ss.android.ugc.aweme.follow.widet.a c() {
        return (com.ss.android.ugc.aweme.follow.widet.a) this.f72143l.getValue();
    }

    public final FeedTaggedListViewModel a() {
        return (FeedTaggedListViewModel) this.f72142k.getValue();
    }

    public final String b() {
        return (String) this.f72144m.getValue();
    }

    public static final class o {
        static {
            Covode.recordClassIndex(44387);
        }

        private o() {
        }

        public /* synthetic */ o(byte b2) {
            this();
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(44374);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(44375);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(44380);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(44383);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f>> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(44384);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f72145a = new p();

        static {
            Covode.recordClassIndex(44388);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            return g2.getCurUserId();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44373);
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

    static final class q extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.follow.widet.a> {
        final /* synthetic */ FeedTaggedListCell this$0;

        static {
            Covode.recordClassIndex(44389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(FeedTaggedListCell feedTaggedListCell) {
            super(0);
            this.this$0 = feedTaggedListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.follow.widet.a invoke() {
            return new com.ss.android.ugc.aweme.follow.widet.a(FeedTaggedListCell.b(this.this$0), new a.g(this) {
                /* class com.ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell.q.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ q f72146a;

                static {
                    Covode.recordClassIndex(44390);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f72146a = r1;
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
                public final void a(int i2, User user) {
                    String str;
                    e eVar;
                    f fVar;
                    String str2;
                    String str3;
                    if (!(user == null || (eVar = (e) this.f72146a.this$0.f34234d) == null || (fVar = eVar.f72255b) == null)) {
                        if (user.getFollowStatus() == 0) {
                            str2 = "follow";
                        } else {
                            str2 = "follow_cancel";
                        }
                        com.ss.android.ugc.aweme.metrics.v vVar = new com.ss.android.ugc.aweme.metrics.v(str2);
                        String str4 = fVar.f72257b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        com.ss.android.ugc.aweme.metrics.v a2 = vVar.a(str4);
                        a2.s = "tag";
                        a2.f109608e = user.getUid();
                        Aweme aweme = fVar.f72256a;
                        if (aweme != null) {
                            str3 = aweme.getGroupId();
                        } else {
                            str3 = null;
                        }
                        a2.p = str3;
                        a2.V = user.getFollowStatus();
                        a2.f();
                    }
                    FeedTaggedListViewModel a3 = this.f72146a.this$0.a();
                    String b2 = this.f72146a.this$0.b();
                    h.f.b.l.b(b2, "");
                    if (i2 == 1) {
                        str = "click_follow";
                    } else {
                        str = "click_cancel_follow";
                    }
                    a3.a(b2, str);
                }
            });
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.core.a invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return (com.bytedance.assem.arch.core.a) i2;
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return ((com.bytedance.assem.arch.core.a) i2).getViewModelStore();
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final ad.b invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return ((com.bytedance.assem.arch.core.a) i2).q();
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.m invoke() {
            View view = this.$this_assemViewModel.itemView;
            h.f.b.l.a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof androidx.fragment.app.e) {
                View view2 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (androidx.fragment.app.e) context2;
                }
                throw new h.w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (androidx.fragment.app.e) baseContext;
                    }
                    throw new h.w("null cannot be cast to non-null type");
                }
                throw new h.w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            androidx.fragment.app.e eVar;
            View view = this.$this_assemViewModel.itemView;
            h.f.b.l.a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof androidx.fragment.app.e) {
                View view2 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (androidx.fragment.app.e) context2;
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextThemeWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        eVar = (androidx.fragment.app.e) baseContext;
                    } else {
                        throw new h.w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            af viewModelStore = eVar.getViewModelStore();
            h.f.b.l.a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.m invoke() {
            androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
            if (i2 instanceof Fragment) {
                androidx.lifecycle.m i3 = this.$this_assemViewModel.i();
                if (i3 != null) {
                    return (Fragment) i3;
                }
                throw new h.w("null cannot be cast to non-null type");
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                    if (a2 != null) {
                        return a2;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new h.w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(44386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            Fragment a2;
            af viewModelStore;
            androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
            if (i2 instanceof Fragment) {
                androidx.lifecycle.m i3 = this.$this_assemViewModel.i();
                if (i3 != null) {
                    a2 = (Fragment) i3;
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
            if (a2 != null && (viewModelStore = a2.getViewModelStore()) != null) {
                return viewModelStore;
            }
            throw new IllegalStateException("can not get viewModelStore due to null fragment.");
        }
    }

    public FeedTaggedListCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(FeedTaggedListViewModel.class);
        a aVar = new a(a2);
        g gVar = g.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, h.INSTANCE, new i(this), new j(this), k.INSTANCE, gVar);
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, l.INSTANCE, new m(this), new n(this), b.INSTANCE, gVar);
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, c.INSTANCE, new d(this), new e(this), new f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f72142k = bVar;
        this.f72143l = h.i.a((h.f.a.a) new q(this));
        this.f72144m = h.i.a((h.f.a.a) p.f72145a);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        View view = this.itemView;
        h.f.b.l.b(view, "");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) view.findViewById(R.id.ov);
        h.f.b.l.b(smartAvatarImageView, "");
        this.n = smartAvatarImageView;
        View view2 = this.itemView;
        h.f.b.l.b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.fct);
        h.f.b.l.b(tuxTextView, "");
        this.o = tuxTextView;
        View view3 = this.itemView;
        h.f.b.l.b(view3, "");
        TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.dkd);
        h.f.b.l.b(tuxTextView2, "");
        this.p = tuxTextView2;
        View view4 = this.itemView;
        h.f.b.l.b(view4, "");
        TuxTextView tuxTextView3 = (TuxTextView) view4.findViewById(R.id.ak_);
        h.f.b.l.b(tuxTextView3, "");
        this.q = tuxTextView3;
        View view5 = this.itemView;
        h.f.b.l.b(view5, "");
        NewFollowButton newFollowButton = (NewFollowButton) view5.findViewById(R.id.b7b);
        h.f.b.l.b(newFollowButton, "");
        this.f72140a = newFollowButton;
        if (newFollowButton == null) {
            h.f.b.l.a("followBtn");
        }
        newFollowButton.setShouldShowMessageText(true);
        View view6 = this.itemView;
        h.f.b.l.b(view6, "");
        TuxButton tuxButton = (TuxButton) view6.findViewById(R.id.dkq);
        h.f.b.l.b(tuxButton, "");
        this.f72141b = tuxButton;
        if (tuxButton == null) {
            h.f.b.l.a("removeBtn");
        }
        tuxButton.setOnClickListener(new w(this));
    }

    static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedTaggedListCell f72149a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f72150b;

        static {
            Covode.recordClassIndex(44392);
        }

        s(FeedTaggedListCell feedTaggedListCell, User user) {
            this.f72149a = feedTaggedListCell;
            this.f72150b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f72149a.a(this.f72150b);
        }
    }

    public static final /* synthetic */ TuxButton a(FeedTaggedListCell feedTaggedListCell) {
        TuxButton tuxButton = feedTaggedListCell.f72141b;
        if (tuxButton == null) {
            h.f.b.l.a("removeBtn");
        }
        return tuxButton;
    }

    public static final /* synthetic */ NewFollowButton b(FeedTaggedListCell feedTaggedListCell) {
        NewFollowButton newFollowButton = feedTaggedListCell.f72140a;
        if (newFollowButton == null) {
            h.f.b.l.a("followBtn");
        }
        return newFollowButton;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.i9, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedTaggedListCell f72147a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f72148b;

        static {
            Covode.recordClassIndex(44391);
        }

        r(FeedTaggedListCell feedTaggedListCell, User user) {
            this.f72147a = feedTaggedListCell;
            this.f72148b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f72147a.a(this.f72148b);
            FeedTaggedListViewModel a2 = this.f72147a.a();
            String uid = this.f72148b.getUid();
            h.f.b.l.b(uid, "");
            a2.a(uid, "click_head");
        }
    }

    public static final class u implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedTaggedListCell f72153a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f72154b;

        static {
            Covode.recordClassIndex(44394);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            f fVar;
            Aweme aweme;
            InteractionTagInfo interactionTagInfo;
            List<InteractionTagUserInfo> taggedUsers;
            User user = this.f72154b.f72254a;
            if (followStatus != null) {
                FeedTaggedListCell.b(this.f72153a).a(followStatus.followStatus, followStatus.followerStatus);
                e eVar = this.f72154b;
                if (!(eVar == null || (fVar = eVar.f72255b) == null || (aweme = fVar.f72256a) == null || (interactionTagInfo = aweme.getInteractionTagInfo()) == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null)) {
                    for (T t : taggedUsers) {
                        if (h.f.b.l.a((Object) t.getUid(), (Object) user.getUid())) {
                            t.setFollowStatus(followStatus.followStatus);
                        }
                    }
                }
            }
        }

        u(FeedTaggedListCell feedTaggedListCell, e eVar) {
            this.f72153a = feedTaggedListCell;
            this.f72154b = eVar;
        }
    }

    public static final class v implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedTaggedListCell f72155a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f72156b;

        static {
            Covode.recordClassIndex(44395);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        public final void onViewAttachedToWindow(View view) {
            String str;
            String authorUid;
            FeedTaggedListViewModel a2 = this.f72155a.a();
            String uid = this.f72156b.f72254a.getUid();
            String str2 = "";
            h.f.b.l.b(uid, str2);
            h.f.b.l.d(uid, str2);
            if (!a2.f72275j.contains(uid)) {
                a2.f72275j.add(uid);
                com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("to_user_id", uid);
                Aweme aweme = a2.g().f72245a;
                if (aweme == null || (str = aweme.getAid()) == null) {
                    str = str2;
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("group_id", str);
                Aweme aweme2 = a2.g().f72245a;
                if (!(aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null)) {
                    str2 = authorUid;
                }
                com.ss.android.ugc.aweme.common.r.a("show_tagged_user", a4.a("author_id", str2).a("enter_from", a2.g().f72247c).a("anchor_type", a2.g().f72248d).f66730a);
            }
        }

        v(FeedTaggedListCell feedTaggedListCell, e eVar) {
            this.f72155a = feedTaggedListCell;
            this.f72156b = eVar;
        }
    }

    static final class w implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedTaggedListCell f72157a;

        static {
            Covode.recordClassIndex(44396);
        }

        w(FeedTaggedListCell feedTaggedListCell) {
            this.f72157a = feedTaggedListCell;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            FeedTaggedListViewModel a2 = this.f72157a.a();
            String b2 = this.f72157a.b();
            h.f.b.l.b(b2, "");
            if (this.f72157a.a().f72276k) {
                str = "click_add_back";
            } else {
                str = "click_remove";
            }
            a2.a(b2, str);
            if (this.f72157a.a().f72276k) {
                this.f72157a.a().f72276k = false;
                FeedTaggedListCell.a(this.f72157a).setText(R.string.gbx);
                return;
            }
            this.f72157a.a().f72276k = true;
            FeedTaggedListCell.a(this.f72157a).setText(R.string.gbw);
            View view2 = this.f72157a.itemView;
            h.f.b.l.b(view2, "");
            new com.bytedance.tux.g.b(view2).e(R.string.gby).b();
        }
    }

    public final void a(User user) {
        f fVar;
        e eVar = (e) this.f34234d;
        if (!(eVar == null || (fVar = eVar.f72255b) == null)) {
            com.ss.android.ugc.aweme.metrics.q f2 = new com.ss.android.ugc.aweme.metrics.q().g(fVar.f72256a);
            String str = fVar.f72257b;
            if (str == null) {
                str = "";
            }
            f2.o(str).a("tag").f();
        }
        View view = this.itemView;
        h.f.b.l.b(view, "");
        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
    }

    static final class t implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedTaggedListCell f72151a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f72152b;

        static {
            Covode.recordClassIndex(44393);
        }

        t(FeedTaggedListCell feedTaggedListCell, User user) {
            this.f72151a = feedTaggedListCell;
            this.f72152b = user;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.c
        public final boolean a(int i2) {
            Boolean bool;
            f fVar;
            String str;
            Aweme aweme;
            String str2;
            if (i2 != 2) {
                return false;
            }
            FeedTaggedListViewModel a2 = this.f72151a.a();
            String uid = this.f72152b.getUid();
            h.f.b.l.b(uid, "");
            a2.a(uid, "click_chat");
            FeedTaggedListCell feedTaggedListCell = this.f72151a;
            User user = this.f72152b;
            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
            if (createIMainServiceHelperbyMonsterPlugin == null || !createIMainServiceHelperbyMonsterPlugin.shouldRedictToTipsPage() || createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                IIMAdapterService d2 = IMAdapterServiceImpl.d();
                String str3 = null;
                if (d2 != null) {
                    bool = Boolean.valueOf(d2.a());
                } else {
                    bool = null;
                }
                if (!bool.booleanValue()) {
                    return true;
                }
                e eVar = (e) feedTaggedListCell.f34234d;
                if (eVar != null) {
                    fVar = eVar.f72255b;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    com.ss.android.ugc.aweme.metrics.u o = new com.ss.android.ugc.aweme.metrics.u().a(fVar.f72257b).o("tag");
                    o.f109597b = u.a.ENTER_CHAT;
                    Aweme aweme2 = fVar.f72256a;
                    if (aweme2 != null) {
                        str2 = aweme2.getGroupId();
                    } else {
                        str2 = null;
                    }
                    com.ss.android.ugc.aweme.metrics.u r = o.r(str2);
                    r.V = user.getFollowStatus();
                    r.a(user).f();
                }
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                View view = feedTaggedListCell.itemView;
                h.f.b.l.b(view, "");
                a.C2643a a3 = a.b.a(view.getContext(), IMUser.fromUser(user));
                if (fVar != null) {
                    str = fVar.f72257b;
                } else {
                    str = null;
                }
                a.C2643a b2 = a3.c(str).b("tag");
                if (!(fVar == null || (aweme = fVar.f72256a) == null)) {
                    str3 = aweme.getGroupId();
                }
                createIIMServicebyMonsterPlugin.startChat(b2.e(str3).d(user.getFollowStatus()).f103883a);
                return true;
            }
            createIMainServiceHelperbyMonsterPlugin.goToTipsPage();
            return true;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(e eVar) {
        String nickname;
        String uniqueId;
        e eVar2 = eVar;
        h.f.b.l.d(eVar2, "");
        User user = eVar2.f72254a;
        com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(user.getAvatarThumb())).a("FeedTaggedListCell");
        SmartImageView smartImageView = this.n;
        if (smartImageView == null) {
            h.f.b.l.a("avatarIv");
        }
        a2.E = smartImageView;
        e.a aVar = new e.a();
        aVar.f39827a = true;
        com.bytedance.lighten.a.e a3 = aVar.a();
        h.f.b.l.b(a3, "");
        a2.w = a3;
        a2.f39907c = true;
        a2.c();
        SmartImageView smartImageView2 = this.n;
        if (smartImageView2 == null) {
            h.f.b.l.a("avatarIv");
        }
        smartImageView2.setOnClickListener(new r(this, user));
        this.itemView.setOnClickListener(new s(this, user));
        TuxTextView tuxTextView = this.q;
        if (tuxTextView == null) {
            h.f.b.l.a("descTv");
        }
        tuxTextView.setVisibility(0);
        TuxTextView tuxTextView2 = this.q;
        if (tuxTextView2 == null) {
            h.f.b.l.a("descTv");
        }
        a.C0730a aVar2 = new a.C0730a();
        FeedTaggedListViewModel a4 = a();
        h.f.b.l.d(user, "");
        if (a4.h()) {
            nickname = user.getUniqueId();
            h.f.b.l.b(nickname, "");
        } else {
            nickname = user.getNickname();
            h.f.b.l.b(nickname, "");
        }
        tuxTextView2.setText(aVar2.a(nickname).f33382a);
        TuxTextView tuxTextView3 = this.o;
        if (tuxTextView3 == null) {
            h.f.b.l.a("userTv");
        }
        a.C0730a aVar3 = new a.C0730a();
        FeedTaggedListViewModel a5 = a();
        h.f.b.l.d(user, "");
        if (a5.h()) {
            uniqueId = user.getNickname();
            h.f.b.l.b(uniqueId, "");
        } else {
            uniqueId = user.getUniqueId();
            h.f.b.l.b(uniqueId, "");
        }
        tuxTextView3.setText(aVar3.a(uniqueId).f33382a);
        View view = this.itemView;
        h.f.b.l.b(view, "");
        Context context = view.getContext();
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        TuxTextView tuxTextView4 = this.o;
        if (tuxTextView4 == null) {
            h.f.b.l.a("userTv");
        }
        io.a(context, customVerify, enterpriseVerifyReason, tuxTextView4);
        if (user.getFollowStatus() == 2) {
            TuxTextView tuxTextView5 = this.p;
            if (tuxTextView5 == null) {
                h.f.b.l.a("relationTv");
            }
            tuxTextView5.setVisibility(0);
        } else {
            TuxTextView tuxTextView6 = this.p;
            if (tuxTextView6 == null) {
                h.f.b.l.a("relationTv");
            }
            tuxTextView6.setVisibility(8);
        }
        if (in.g(user)) {
            TuxButton tuxButton = this.f72141b;
            if (tuxButton == null) {
                h.f.b.l.a("removeBtn");
            }
            tuxButton.setVisibility(0);
            NewFollowButton newFollowButton = this.f72140a;
            if (newFollowButton == null) {
                h.f.b.l.a("followBtn");
            }
            newFollowButton.setVisibility(8);
        } else if (user.getFollowStatus() == -1 || user.getFollowerStatus() == -1) {
            NewFollowButton newFollowButton2 = this.f72140a;
            if (newFollowButton2 == null) {
                h.f.b.l.a("followBtn");
            }
            newFollowButton2.setVisibility(8);
            TuxButton tuxButton2 = this.f72141b;
            if (tuxButton2 == null) {
                h.f.b.l.a("removeBtn");
            }
            tuxButton2.setVisibility(8);
        } else {
            NewFollowButton newFollowButton3 = this.f72140a;
            if (newFollowButton3 == null) {
                h.f.b.l.a("followBtn");
            }
            newFollowButton3.setVisibility(0);
            TuxButton tuxButton3 = this.f72141b;
            if (tuxButton3 == null) {
                h.f.b.l.a("removeBtn");
            }
            tuxButton3.setVisibility(8);
            c().a(user);
            c().f96288e = new t(this, user);
            c().f96287d = new u(this, eVar2);
        }
        this.itemView.addOnAttachStateChangeListener(new v(this, eVar2));
    }
}
