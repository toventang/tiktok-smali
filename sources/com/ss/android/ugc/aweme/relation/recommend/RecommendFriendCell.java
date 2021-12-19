package com.ss.android.ugc.aweme.relation.recommend;

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
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel;
import h.f.b.ab;
import h.w;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class RecommendFriendCell extends PowerCell<j> {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.recommend.a f120396a;

    /* renamed from: b  reason: collision with root package name */
    final h.h f120397b;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f120398j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f120399k;

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.relation.viewmodel.b, com.ss.android.ugc.aweme.relation.viewmodel.b> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(78342);
        }

        public g() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.relation.viewmodel.b invoke(com.ss.android.ugc.aweme.relation.viewmodel.b bVar) {
            h.f.b.l.c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(78335);
    }

    private final com.ss.android.ugc.aweme.follow.widet.a b() {
        return (com.ss.android.ugc.aweme.follow.widet.a) this.f120399k.getValue();
    }

    public final RecFriendsListViewModel a() {
        return (RecFriendsListViewModel) this.f120398j.getValue();
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(78337);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.relation.viewmodel.b>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(78338);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.relation.viewmodel.b> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.relation.viewmodel.b>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(78343);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.relation.viewmodel.b> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(78346);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.relation.viewmodel.b>> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(78347);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.relation.viewmodel.b> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.following.ui.view.a> {
        final /* synthetic */ RecommendFriendCell this$0;

        static {
            Covode.recordClassIndex(78350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(RecommendFriendCell recommendFriendCell) {
            super(0);
            this.this$0 = recommendFriendCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.following.ui.view.a invoke() {
            return RecommendFriendCell.a(this.this$0).getFollowBtn();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        com.ss.android.ugc.aweme.recommend.a aVar = this.f120396a;
        if (aVar == null) {
            h.f.b.l.a("recommendView");
        }
        aVar.a(false);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(78336);
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
        final /* synthetic */ RecommendFriendCell this$0;

        static {
            Covode.recordClassIndex(78351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(RecommendFriendCell recommendFriendCell) {
            super(0);
            this.this$0 = recommendFriendCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.follow.widet.a invoke() {
            return new com.ss.android.ugc.aweme.follow.widet.a((com.ss.android.ugc.aweme.following.ui.view.a) this.this$0.f120397b.getValue(), new a.g(this) {
                /* class com.ss.android.ugc.aweme.relation.recommend.RecommendFriendCell.p.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f120400a;

                static {
                    Covode.recordClassIndex(78352);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f120400a = r1;
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
                public final void a(int i2, User user) {
                    com.ss.android.ugc.aweme.relation.b.b.b(3, com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_RECOMMEND.getValue());
                    if (i2 == 1) {
                        com.ss.android.ugc.aweme.relation.c.d.a(user, this.f120400a.this$0.getAdapterPosition() - 1, 3);
                        this.f120400a.this$0.a();
                        RecFriendsListViewModel.a(user, u.a.FOLLOW);
                        return;
                    }
                    com.ss.android.ugc.aweme.relation.c.d.b(user, this.f120400a.this$0.getAdapterPosition() - 1, 3);
                    this.f120400a.this$0.a();
                    RecFriendsListViewModel.a(user, u.a.FOLLOW_CANCEL);
                }
            });
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(78339);
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
            Covode.recordClassIndex(78340);
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
            Covode.recordClassIndex(78341);
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
            Covode.recordClassIndex(78344);
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
            Covode.recordClassIndex(78345);
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
            Covode.recordClassIndex(78348);
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
            Covode.recordClassIndex(78349);
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

    public RecommendFriendCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(RecFriendsListViewModel.class);
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
        this.f120398j = bVar;
        this.f120397b = h.i.a((h.f.a.a) new o(this));
        this.f120399k = h.i.a((h.f.a.a) new p(this));
    }

    public static final class r implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendFriendCell f120403a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f120404b;

        static {
            Covode.recordClassIndex(78354);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            if (followStatus != null) {
                RecommendFriendCell.a(this.f120403a).a(followStatus.followStatus, followStatus.followerStatus, null);
            }
        }

        r(RecommendFriendCell recommendFriendCell, j jVar) {
            this.f120403a = recommendFriendCell;
            this.f120404b = jVar;
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.recommend.a a(RecommendFriendCell recommendFriendCell) {
        com.ss.android.ugc.aweme.recommend.a aVar = recommendFriendCell.f120396a;
        if (aVar == null) {
            h.f.b.l.a("recommendView");
        }
        return aVar;
    }

    static final class s implements a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f120405a;

        static {
            Covode.recordClassIndex(78355);
        }

        s(j jVar) {
            this.f120405a = jVar;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            String uid = this.f120405a.f120441a.getUid();
            h.f.b.l.b(uid, "");
            com.ss.android.ugc.aweme.relation.c.d.a(3, uid, this.f120405a.f120441a.getFollowStatus());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        RecommendUserService b2 = RecommendUserServiceImpl.b();
        Context context = viewGroup.getContext();
        h.f.b.l.b(context, "");
        com.ss.android.ugc.aweme.recommend.a a2 = b2.a(context, 8);
        this.f120396a = a2;
        if (a2 == null) {
            h.f.b.l.a("recommendView");
        }
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.View");
        return (View) a2;
    }

    public static final class q implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendFriendCell f120401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f120402b;

        static {
            Covode.recordClassIndex(78353);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        public final void onViewAttachedToWindow(View view) {
            RecFriendsListViewModel a2 = this.f120401a.a();
            User user = this.f120402b.f120441a;
            h.f.b.l.d(user, "");
            if (!a2.f120498k.contains(user.getUid())) {
                u o = new u().a("version_update").o("");
                o.f109596a = u.c.CARD;
                o.f109597b = u.a.SHOW;
                o.a(user).s(user.getRequestId()).f();
                Set<String> set = a2.f120498k;
                String uid = user.getUid();
                h.f.b.l.b(uid, "");
                set.add(uid);
            }
        }

        q(RecommendFriendCell recommendFriendCell, j jVar) {
            this.f120401a = recommendFriendCell;
            this.f120402b = jVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a, java.util.List] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(j jVar, List list) {
        j jVar2 = jVar;
        h.f.b.l.d(jVar2, "");
        h.f.b.l.d(list, "");
        com.ss.android.ugc.aweme.recommend.a aVar = this.f120396a;
        if (aVar == null) {
            h.f.b.l.a("recommendView");
        }
        aVar.a(jVar2.f120441a);
        com.ss.android.ugc.aweme.recommend.a aVar2 = this.f120396a;
        if (aVar2 == null) {
            h.f.b.l.a("recommendView");
        }
        aVar2.getView().addOnAttachStateChangeListener(new q(this, jVar2));
        b().a(jVar2.f120441a);
        b().f96287d = new r(this, jVar2);
        b().f96289f = new s(jVar2);
    }
}
