package com.ss.android.ugc.aweme.recommend.users.profile.powerlist;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.friends.ui.au;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM;
import h.f.b.ab;
import h.w;
import h.z;
import java.util.List;
import java.util.Objects;

public final class RecommendUserCell extends PowerCell<b> {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.recommend.a f120129a;

    /* renamed from: b  reason: collision with root package name */
    final h.h f120130b;

    /* renamed from: j  reason: collision with root package name */
    final h.h f120131j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f120132k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f120133l;

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.recommend.users.profile.ui.f, com.ss.android.ugc.aweme.recommend.users.profile.ui.f> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(78107);
        }

        public g() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.recommend.users.profile.ui.f invoke(com.ss.android.ugc.aweme.recommend.users.profile.ui.f fVar) {
            h.f.b.l.c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(78100);
    }

    private final com.ss.android.ugc.aweme.follow.widet.a b() {
        return (com.ss.android.ugc.aweme.follow.widet.a) this.f120133l.getValue();
    }

    public final UserProfilePublishListRecommendUserVM a() {
        return (UserProfilePublishListRecommendUserVM) this.f120132k.getValue();
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(78102);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.recommend.users.profile.ui.f>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(78103);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.recommend.users.profile.ui.f> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.recommend.users.profile.ui.f>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(78108);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.recommend.users.profile.ui.f> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(78111);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.recommend.users.profile.ui.f>> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(78112);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.recommend.users.profile.ui.f> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>((byte) 0);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.following.ui.view.a> {
        final /* synthetic */ RecommendUserCell this$0;

        static {
            Covode.recordClassIndex(78115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(RecommendUserCell recommendUserCell) {
            super(0);
            this.this$0 = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.following.ui.view.a invoke() {
            return RecommendUserCell.a(this.this$0).getFollowBtn();
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<Context> {
        final /* synthetic */ RecommendUserCell this$0;

        static {
            Covode.recordClassIndex(78118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(RecommendUserCell recommendUserCell) {
            super(0);
            this.this$0 = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Context invoke() {
            View view = this.this$0.itemView;
            h.f.b.l.b(view, "");
            return view.getContext();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(78101);
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

    static final class p extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.follow.widet.a> {
        final /* synthetic */ RecommendUserCell this$0;

        static {
            Covode.recordClassIndex(78116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(RecommendUserCell recommendUserCell) {
            super(0);
            this.this$0 = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.follow.widet.a invoke() {
            return new com.ss.android.ugc.aweme.follow.widet.a((com.ss.android.ugc.aweme.following.ui.view.a) this.this$0.f120130b.getValue(), new a.g(this) {
                /* class com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell.p.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f120134a;

                static {
                    Covode.recordClassIndex(78117);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f120134a = r1;
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
                public final void a(int i2, User user) {
                    u.a aVar;
                    UserProfilePublishListRecommendUserVM a2 = this.f120134a.this$0.a();
                    if (i2 == 1) {
                        aVar = u.a.FOLLOW;
                    } else {
                        aVar = u.a.FOLLOW_CANCEL;
                    }
                    a2.a(aVar, user);
                }
            });
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(78104);
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
                throw new w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(78105);
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
                throw new w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(78106);
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
                throw new w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(78109);
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
                throw new w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (androidx.fragment.app.e) baseContext;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
                throw new w("null cannot be cast to non-null type");
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
            Covode.recordClassIndex(78110);
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
                    throw new w("null cannot be cast to non-null type");
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
                        throw new w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
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
            Covode.recordClassIndex(78113);
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
                throw new w("null cannot be cast to non-null type");
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                    if (a2 != null) {
                        return a2;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(78114);
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
                    throw new w("null cannot be cast to non-null type");
                }
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                } else {
                    throw new w("null cannot be cast to non-null type");
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        com.ss.android.ugc.aweme.recommend.a aVar = this.f120129a;
        if (aVar == null) {
            h.f.b.l.a("recommendView");
        }
        aVar.a(false);
        com.ss.android.ugc.aweme.recommend.a aVar2 = this.f120129a;
        if (aVar2 == null) {
            h.f.b.l.a("recommendView");
        }
        aVar2.setEventListener(new r(this));
        b().f96287d = new s(this);
        b().f96289f = t.f120136a;
        com.ss.android.ugc.aweme.recommend.a aVar3 = this.f120129a;
        if (aVar3 == null) {
            h.f.b.l.a("recommendView");
        }
        aVar3.getView().addOnAttachStateChangeListener(new u(this));
    }

    public RecommendUserCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(UserProfilePublishListRecommendUserVM.class);
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
        this.f120132k = bVar;
        this.f120130b = h.i.a((h.f.a.a) new o(this));
        this.f120133l = h.i.a((h.f.a.a) new p(this));
        this.f120131j = h.i.a((h.f.a.a) new q(this));
    }

    public static final class s implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserCell f120135a;

        static {
            Covode.recordClassIndex(78120);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(RecommendUserCell recommendUserCell) {
            this.f120135a = recommendUserCell;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            if (followStatus != null) {
                RecommendUserCell.a(this.f120135a).a(followStatus.followStatus, followStatus.followerStatus, null);
            }
        }
    }

    public static final class u implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserCell f120137a;

        static {
            Covode.recordClassIndex(78122);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        u(RecommendUserCell recommendUserCell) {
            this.f120137a = recommendUserCell;
        }

        public final void onViewDetachedFromWindow(View view) {
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
        }

        public final void onViewAttachedToWindow(View view) {
            User user;
            UserProfilePublishListRecommendUserVM a2 = this.f120137a.a();
            u.a aVar = u.a.SHOW;
            b bVar = (b) this.f120137a.f34234d;
            if (bVar != null) {
                user = bVar.f120139a;
            } else {
                user = null;
            }
            a2.a(aVar, user);
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.recommend.a a(RecommendUserCell recommendUserCell) {
        com.ss.android.ugc.aweme.recommend.a aVar = recommendUserCell.f120129a;
        if (aVar == null) {
            h.f.b.l.a("recommendView");
        }
        return aVar;
    }

    static final class t implements a.e {

        /* renamed from: a  reason: collision with root package name */
        public static final t f120136a = new t();

        static {
            Covode.recordClassIndex(78121);
        }

        t() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            h.f.b.l.b(followStatus, "");
            if (followStatus.followStatus == 0) {
                com.ss.android.ugc.aweme.common.r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage").a("to_user_id", followStatus.userId).f66730a);
            } else {
                com.ss.android.ugc.aweme.common.r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage").a("to_user_id", followStatus.userId).f66730a);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        RecommendUserService b2 = RecommendUserServiceImpl.b();
        Context context = viewGroup.getContext();
        h.f.b.l.b(context, "");
        com.ss.android.ugc.aweme.recommend.a a2 = b2.a(context, 2);
        this.f120129a = a2;
        if (a2 == null) {
            h.f.b.l.a("recommendView");
        }
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.View");
        return (View) a2;
    }

    static final class r extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ RecommendUserCell this$0;

        static {
            Covode.recordClassIndex(78119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(RecommendUserCell recommendUserCell) {
            super(1);
            this.this$0 = recommendUserCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            String str;
            int intValue = num.intValue();
            b bVar = (b) this.this$0.f34234d;
            if (bVar != null) {
                if (intValue == au.f97192e) {
                    this.this$0.a().a((com.bytedance.ies.powerlist.b.a) bVar);
                    com.ss.android.ugc.aweme.recommend.users.b bVar2 = com.ss.android.ugc.aweme.recommend.users.b.f120122a;
                    String uid = bVar.f120139a.getUid();
                    h.f.b.l.b(uid, "");
                    bVar2.a(uid, bVar.f120139a.getSecUid());
                    this.this$0.a().a(u.a.CLOSE, bVar.f120139a);
                } else if (intValue == au.f97189b || intValue == au.f97190c) {
                    UserProfilePublishListRecommendUserVM a2 = this.this$0.a();
                    Context context = (Context) this.this$0.f120131j.getValue();
                    h.f.b.l.b(context, "");
                    User user = bVar.f120139a;
                    h.f.b.l.d(context, "");
                    h.f.b.l.d(user, "");
                    SmartRoute withParam = SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", user.getRecommendReason()).withParam("recommend_from_type", "card").withParam("position", "bottom");
                    u.c cVar = u.c.CARD;
                    String recType = user.getRecType();
                    u.b a3 = g.a.a(user);
                    String uid2 = user.getUid();
                    String str2 = a2.n;
                    User user2 = a2.f120142m;
                    if (user2 != null) {
                        str = user2.getUid();
                    } else {
                        str = null;
                    }
                    withParam.withParam("recommend_enter_profile_params", new com.ss.android.ugc.aweme.recommend.g("others_homepage", null, cVar, recType, a3, uid2, null, null, str2, str, user.getFriendTypeStr(), user.getSocialInfo())).open();
                    this.this$0.a().a(u.a.ENTER_PROFILE, bVar.f120139a);
                }
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a, java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(b bVar, List list) {
        b bVar2 = bVar;
        h.f.b.l.d(bVar2, "");
        h.f.b.l.d(list, "");
        User user = bVar2.f120139a;
        com.ss.android.ugc.aweme.recommend.a aVar = this.f120129a;
        if (aVar == null) {
            h.f.b.l.a("recommendView");
        }
        aVar.a(user);
        b().a(user);
    }
}
