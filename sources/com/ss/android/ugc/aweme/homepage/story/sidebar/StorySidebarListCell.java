package com.ss.android.ugc.aweme.homepage.story.sidebar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.ss.android.ugc.aweme.profile.f.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.w;
import h.z;
import java.util.HashMap;
import java.util.Objects;

public final class StorySidebarListCell extends PowerCell<n> implements View.OnClickListener, com.bytedance.jedi.arch.q, IStoryPublishAnimateListener {

    /* renamed from: b  reason: collision with root package name */
    public static final int f99441b;

    /* renamed from: j  reason: collision with root package name */
    public static final int f99442j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f99443k;

    /* renamed from: l  reason: collision with root package name */
    public static final p f99444l = new p((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public n f99445a;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f99446m = h.i.a((h.f.a.a) new s(this));
    private final com.bytedance.assem.a.a n;
    private final h.h o;
    private AnimatorSet p;
    private Context q;
    private final h.h r;
    private final h.h s;
    private final com.bytedance.assem.arch.viewModel.b t;

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.homepage.story.feed.d, com.ss.android.ugc.aweme.homepage.story.feed.d> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(63375);
        }

        public g() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.homepage.story.feed.d invoke(com.ss.android.ugc.aweme.homepage.story.feed.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.b<o, o> {
        public static final o INSTANCE = new o();

        static {
            Covode.recordClassIndex(63383);
        }

        public o() {
            super(1);
        }

        public final o invoke(o oVar) {
            h.f.b.l.c(oVar, "");
            return oVar;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f99449a = new u();

        static {
            Covode.recordClassIndex(63392);
        }

        u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_sidebar_list";
        }
    }

    private final com.ss.android.ugc.aweme.story.avatar.d e() {
        return (com.ss.android.ugc.aweme.story.avatar.d) this.o.getValue();
    }

    public final StoryBrandView a() {
        return (StoryBrandView) this.f99446m.getValue();
    }

    public final StorySidebarListVM b() {
        return (StorySidebarListVM) this.n.getValue();
    }

    public final DrawerViewModel c() {
        return (DrawerViewModel) this.s.getValue();
    }

    public final StorySidebarFeedVM d() {
        return (StorySidebarFeedVM) this.t.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class p {
        static {
            Covode.recordClassIndex(63384);
        }

        private p() {
        }

        public /* synthetic */ p(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(63370);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.homepage.story.feed.d>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(63371);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.homepage.story.feed.d> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.homepage.story.feed.d>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(63376);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.homepage.story.feed.d> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(63379);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.homepage.story.feed.d>> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(63380);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.homepage.story.feed.d> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateStart() {
        onAnimateUpdate(0.0f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    @androidx.lifecycle.v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        if (b().n != null) {
            b().n = null;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(63369);
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

    static final class r extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.avatar.d> {
        final /* synthetic */ StorySidebarListCell this$0;

        static {
            Covode.recordClassIndex(63387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(StorySidebarListCell storySidebarListCell) {
            super(0);
            this.this$0 = storySidebarListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.story.avatar.d invoke() {
            com.ss.android.ugc.aweme.story.avatar.d a2;
            com.ss.android.ugc.aweme.story.avatar.c d2 = com.ss.android.ugc.aweme.story.g.f137757a.d();
            if (d2 == null || (a2 = d2.a(new com.ss.android.ugc.aweme.story.avatar.e(this) {
                /* class com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListCell.r.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ r f99448a;

                static {
                    Covode.recordClassIndex(63388);
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.h
                public final boolean d() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final com.ss.android.ugc.aweme.story.avatar.o c() {
                    return com.ss.android.ugc.aweme.story.avatar.o.WESTWINDOW;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final /* bridge */ /* synthetic */ androidx.lifecycle.m b() {
                    return this.f99448a.this$0;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final StoryBrandView a() {
                    return this.f99448a.this$0.a();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f99448a = r1;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.h
                public final void a(boolean z, com.ss.android.ugc.aweme.tux.business.story.a aVar) {
                    int i2;
                    h.f.b.l.d(aVar, "");
                    View view = this.f99448a.this$0.itemView;
                    h.f.b.l.b(view, "");
                    ImageView imageView = (ImageView) view.findViewById(R.id.bwv);
                    if (imageView != null) {
                        if (aVar == com.ss.android.ugc.aweme.tux.business.story.a.RED_RING) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        imageView.setVisibility(i2);
                    }
                    if (!z) {
                        StorySidebarListVM b2 = this.f99448a.this$0.b();
                        T t = this.f99448a.this$0.f34234d;
                        if (t == null) {
                            h.f.b.l.b();
                        }
                        b2.a((com.bytedance.ies.powerlist.b.a) t);
                    }
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final void a(SmartRoute smartRoute, Aweme aweme) {
                    h.f.b.l.d(smartRoute, "");
                    h.f.b.l.d(aweme, "");
                    View view = this.f99448a.this$0.itemView;
                    h.f.b.l.b(view, "");
                    androidx.core.app.b b2 = androidx.core.app.b.b(view, view.getWidth(), view.getHeight());
                    h.f.b.l.b(b2, "");
                    T t = this.f99448a.this$0.f34234d;
                    if (t == null) {
                        h.f.b.l.b();
                    }
                    smartRoute.withParam("id", ((n) t).f99486a.getAid()).withParam("story_req_id", this.f99448a.this$0.d().f99376m.f99401c).withParam("impr_id", this.f99448a.this$0.d().f99376m.f99401c).withBundleAnimation(b2.a()).withParam("activity_has_activity_options", true);
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.g
                public final boolean a(String str, HashMap<String, String> hashMap) {
                    Boolean bool;
                    n nVar;
                    Aweme aweme;
                    User author;
                    String uid;
                    String str2;
                    androidx.lifecycle.t<Boolean> tVar;
                    String str3 = "";
                    h.f.b.l.d(str, str3);
                    h.f.b.l.d(hashMap, str3);
                    DrawerViewModel c2 = this.f99448a.this$0.c();
                    if (c2 == null || (tVar = c2.f99259b) == null) {
                        bool = null;
                    } else {
                        bool = tVar.getValue();
                    }
                    if ((!h.f.b.l.a((Object) bool, (Object) true)) || (nVar = (n) this.f99448a.this$0.f34234d) == null || (aweme = nVar.f99486a) == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
                        return false;
                    }
                    if (h.f.b.l.a((Object) str, (Object) "story_show")) {
                        if (this.f99448a.this$0.b().o.contains(uid)) {
                            return false;
                        }
                        this.f99448a.this$0.b().o.add(uid);
                    }
                    int adapterPosition = this.f99448a.this$0.getAdapterPosition() + 1;
                    DrawerViewModel c3 = this.f99448a.this$0.c();
                    if (!(c3 == null || (str2 = c3.f99265h) == null)) {
                        str3 = str2;
                    }
                    hashMap.put("num", String.valueOf(adapterPosition));
                    hashMap.put("enter_method", str3);
                    hashMap.put("enter_from", "westwindow");
                    hashMap.put("req_id", this.f99448a.this$0.d().f99376m.f99401c);
                    return true;
                }
            })) == null) {
                return null;
            }
            a2.a(new a(this));
            return a2;
        }

        static final class a extends h.f.b.m implements h.f.a.b<Aweme, z> {
            final /* synthetic */ r this$0;

            static {
                Covode.recordClassIndex(63389);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar) {
                super(1);
                this.this$0 = rVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Aweme aweme) {
                Aweme aweme2;
                Aweme aweme3 = aweme;
                if (com.ss.android.ugc.aweme.feed.x.m.a(aweme3)) {
                    n nVar = this.this$0.this$0.f99445a;
                    if (nVar != null) {
                        aweme2 = nVar.f99486a;
                    } else {
                        aweme2 = null;
                    }
                    if (!(!com.ss.android.ugc.aweme.feed.x.m.a(aweme2) || this.this$0.this$0.getBindingAdapterPosition() == -1 || aweme3 == null)) {
                        this.this$0.this$0.b().b(this.this$0.this$0.getBindingAdapterPosition(), new n(aweme3));
                    }
                }
                return z.f158842a;
            }
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<StoryBrandView> {
        final /* synthetic */ StorySidebarListCell this$0;

        static {
            Covode.recordClassIndex(63390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(StorySidebarListCell storySidebarListCell) {
            super(0);
            this.this$0 = storySidebarListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryBrandView invoke() {
            View view = this.this$0.itemView;
            h.f.b.l.b(view, "");
            return view.findViewById(R.id.c0s);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<DrawerViewModel> {
        final /* synthetic */ StorySidebarListCell this$0;

        static {
            Covode.recordClassIndex(63391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(StorySidebarListCell storySidebarListCell) {
            super(0);
            this.this$0 = storySidebarListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DrawerViewModel invoke() {
            View view = this.this$0.itemView;
            h.f.b.l.b(view, "");
            Context context = view.getContext();
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

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(63372);
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
            Covode.recordClassIndex(63373);
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
            Covode.recordClassIndex(63374);
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

    static final class q extends h.f.b.m implements h.f.a.a<ValueAnimator> {
        final /* synthetic */ StorySidebarListCell this$0;

        static {
            Covode.recordClassIndex(63385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(StorySidebarListCell storySidebarListCell) {
            super(0);
            this.this$0 = storySidebarListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ValueAnimator invoke() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(com.bytedance.tux.a.a.a.c());
            ofFloat.addUpdateListener(new a(this));
            return ofFloat;
        }

        static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f99447a;

            static {
                Covode.recordClassIndex(63386);
            }

            a(q qVar) {
                this.f99447a = qVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.f.b.l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this.f99447a.this$0.a(((Float) animatedValue).floatValue());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateFinish() {
        if (this.p == null) {
            this.p = new AnimatorSet();
        }
        AnimatorSet animatorSet = this.p;
        if (animatorSet != null) {
            animatorSet.cancel();
            animatorSet.play((ValueAnimator) this.r.getValue());
            animatorSet.start();
            com.ss.android.ugc.aweme.story.j.a.b("StorySidebarListCell", "onAnimateFinish: start self avatar animation");
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(63377);
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
            Covode.recordClassIndex(63378);
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
            Covode.recordClassIndex(63381);
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
            Covode.recordClassIndex(63382);
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

    static {
        Covode.recordClassIndex(63368);
        Resources system = Resources.getSystem();
        h.f.b.l.a((Object) system, "");
        f99441b = h.g.a.a(TypedValue.applyDimension(1, 68.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        h.f.b.l.a((Object) system2, "");
        f99442j = h.g.a.a(TypedValue.applyDimension(1, 58.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        h.f.b.l.a((Object) system3, "");
        f99443k = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system3.getDisplayMetrics()));
    }

    public StorySidebarListCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        u uVar = u.f99449a;
        this.n = new com.bytedance.assem.a.a(ab.a(StorySidebarListVM.class), uVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), u.c.f25670a, o.INSTANCE, null, null);
        this.o = h.i.a((h.f.a.a) new r(this));
        this.r = h.i.a((h.f.a.a) new q(this));
        this.s = h.i.a((h.f.a.a) new t(this));
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(StorySidebarFeedVM.class);
        a aVar2 = new a(a2);
        g gVar = g.INSTANCE;
        if (h.f.b.l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, h.INSTANCE, new i(this), new j(this), k.INSTANCE, gVar);
        } else if (h.f.b.l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, l.INSTANCE, new m(this), new n(this), b.INSTANCE, gVar);
        } else if (aVar == null || h.f.b.l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, c.INSTANCE, new d(this), new e(this), new f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + aVar + " there");
        }
        this.t = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a().performClick();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        this.q = context;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.a3q, viewGroup, false);
        a2.setOnClickListener(this);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener
    public final void onAnimateUpdate(float f2) {
        View view = this.itemView;
        h.f.b.l.b(view, "");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.b4d);
        h.f.b.l.b(frameLayout, "");
        if (frameLayout.getAlpha() != 0.0f) {
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(R.id.b4d);
            h.f.b.l.b(frameLayout2, "");
            frameLayout2.setAlpha(0.0f);
        }
    }

    public final void a(float f2) {
        View view = this.itemView;
        h.f.b.l.b(view, "");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.b4d);
        h.f.b.l.b(frameLayout, "");
        frameLayout.setAlpha(f2);
        View view2 = this.itemView;
        h.f.b.l.b(view2, "");
        AvatarImageView avatarImageView = (AvatarImageView) view2.findViewById(R.id.bu0);
        h.f.b.l.b(avatarImageView, "");
        a(avatarImageView, (int) (((float) f99442j) * f2));
        View view3 = this.itemView;
        h.f.b.l.b(view3, "");
        StoryBrandView storyBrandView = (StoryBrandView) view3.findViewById(R.id.c0s);
        h.f.b.l.b(storyBrandView, "");
        a((View) storyBrandView, (int) (f2 * ((float) f99441b)));
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.story.avatar.d e2 = e();
        if (e2 != null) {
            e2.a(str);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(n nVar) {
        String str;
        UrlModel urlModel;
        Aweme aweme;
        int i2;
        int a2;
        n nVar2 = nVar;
        h.f.b.l.d(nVar2, "");
        if (!h.f.b.l.a(nVar2, this.f99445a)) {
            this.f99445a = nVar2;
            Aweme aweme2 = nVar2.f99486a;
            User author = aweme2.getAuthor();
            if (author == null || (str = author.getUid()) == null) {
                str = "";
            }
            String b2 = ai.b(aweme2.getAuthor());
            View view = this.itemView;
            h.f.b.l.b(view, "");
            ((SimpleDraweeView) view.findViewById(R.id.bu0)).setActualImageResource(R.raw.icon_color_default_avatar);
            User author2 = aweme2.getAuthor();
            if (author2 != null) {
                urlModel = author2.getAvatarThumb();
            } else {
                urlModel = null;
            }
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.f3c);
            h.f.b.l.b(tuxTextView, "");
            UserStory userStory = aweme2.getUserStory();
            if (userStory != null) {
                aweme = UserStoryKt.currentStory(userStory);
            } else {
                aweme = null;
            }
            if (com.ss.android.ugc.aweme.story.d.a.f(aweme)) {
                View view3 = this.itemView;
                h.f.b.l.b(view3, "");
                b2 = view3.getContext().getString(R.string.g9p);
            } else if (com.ss.android.ugc.aweme.homepage.story.c.b.a(str)) {
                View view4 = this.itemView;
                h.f.b.l.b(view4, "");
                b2 = view4.getContext().getString(R.string.g9l);
            }
            tuxTextView.setText(b2);
            View view5 = this.itemView;
            h.f.b.l.b(view5, "");
            com.ss.android.ugc.aweme.base.e.a((RemoteImageView) view5.findViewById(R.id.bu0), urlModel);
            com.ss.android.ugc.aweme.story.avatar.d e2 = e();
            if (e2 != null) {
                T t2 = this.f34234d;
                if (t2 == null) {
                    h.f.b.l.b();
                }
                e2.a(((n) t2).f99486a);
            }
            if (com.ss.android.ugc.aweme.homepage.story.c.b.a(str)) {
                b().n = this;
            } else {
                if (h.f.b.l.a(b().n, this)) {
                    b().n = null;
                }
                AnimatorSet animatorSet = this.p;
                if (animatorSet != null && animatorSet.isRunning()) {
                    animatorSet.cancel();
                }
            }
            a(1.0f);
            User author3 = nVar2.f99486a.getAuthor();
            h.f.b.l.b(author3, "");
            String uid = author3.getUid();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            boolean a3 = h.f.b.l.a((Object) uid, (Object) g2.getCurUserId());
            int i3 = 0;
            if (com.ss.android.ugc.aweme.homepage.experiment.a.a() != 0) {
                View view6 = this.itemView;
                h.f.b.l.b(view6, "");
                ViewGroup.LayoutParams layoutParams = view6.getLayoutParams();
                View view7 = this.itemView;
                h.f.b.l.b(view7, "");
                if (a3) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view7.setVisibility(i2);
                View view8 = this.itemView;
                h.f.b.l.b(view8, "");
                if (a3) {
                    a2 = 0;
                } else {
                    Resources system = Resources.getSystem();
                    h.f.b.l.a((Object) system, "");
                    a2 = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
                }
                com.bytedance.tux.h.i.b(view8, 0, Integer.valueOf(a2), 0, 0, false, 16);
                if (!a3) {
                    Resources system2 = Resources.getSystem();
                    h.f.b.l.a((Object) system2, "");
                    i3 = h.g.a.a(TypedValue.applyDimension(1, 84.0f, system2.getDisplayMetrics()));
                }
                layoutParams.height = i3;
                View view9 = this.itemView;
                h.f.b.l.b(view9, "");
                view9.setLayoutParams(layoutParams);
            }
            com.ss.android.ugc.aweme.story.j.a.b("StorySidebarListCell", "onBind: ".concat(String.valueOf(str)));
        }
    }

    private static void a(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i2;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
