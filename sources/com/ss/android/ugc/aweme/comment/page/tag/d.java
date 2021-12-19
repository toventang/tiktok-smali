package com.ss.android.ugc.aweme.comment.page.tag;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.page.tag.api.VideoTagApi;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.SocialVideoTagShareVM;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.k.k;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;

public final class d extends com.bytedance.ies.foundation.fragment.a implements q {

    /* renamed from: h  reason: collision with root package name */
    public static final c f72238h = new c((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<User> f72239e;

    /* renamed from: f  reason: collision with root package name */
    public Aweme f72240f;

    /* renamed from: g  reason: collision with root package name */
    public h.f.a.a<z> f72241g;

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f72242i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f72243j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f72244k;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(44531);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f fVar) {
            l.c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(44529);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    private FeedTaggedListViewModel c() {
        return (FeedTaggedListViewModel) this.f72242i.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f72244k == null) {
            this.f72244k = new SparseArray();
        }
        View view = (View) this.f72244k.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f72244k.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f72244k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(44532);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f72249a = new e();

        static {
            Covode.recordClassIndex(44534);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
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

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$d  reason: collision with other inner class name */
    public static final class C1624d implements com.bytedance.assem.arch.extensions.c {

        /* renamed from: a  reason: collision with root package name */
        public final Aweme f72245a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<User> f72246b;

        /* renamed from: c  reason: collision with root package name */
        public final String f72247c;

        /* renamed from: d  reason: collision with root package name */
        public final String f72248d;

        static {
            Covode.recordClassIndex(44533);
        }

        private /* synthetic */ C1624d() {
            this(null, null, "", "");
        }

        public C1624d(Aweme aweme, ArrayList<User> arrayList, String str, String str2) {
            this.f72245a = aweme;
            this.f72246b = arrayList;
            this.f72247c = str;
            this.f72248d = str2;
        }
    }

    static final class j extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(44542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(com.bytedance.assem.arch.extensions.b.b(this.this$0));
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44530);
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

    static final class i extends m implements h.f.a.a<SocialVideoTagShareVM> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(44541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SocialVideoTagShareVM invoke() {
            SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider();
            androidx.lifecycle.i lifecycle = this.this$0.getLifecycle();
            l.b(lifecycle, "");
            return sharedViewModelProvider.a(lifecycle, SocialVideoTagShareVM.class);
        }
    }

    public d() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        j jVar = new j(this);
        h.k.c a2 = ab.a(FeedTaggedListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), jVar, bVar2, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (dVar == null || l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), jVar, bVar2, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f72242i = bVar;
        this.f72243j = h.i.a((h.f.a.a) new i(this));
        this.f72241g = e.f72249a;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (c().f72276k) {
            c().f72276k = false;
            SocialVideoTagShareVM socialVideoTagShareVM = (SocialVideoTagShareVM) this.f72243j.getValue();
            Aweme aweme = this.f72240f;
            if (aweme != null) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                String curUserId = g2.getCurUserId();
                String aid = aweme.getAid();
                l.b(aid, "");
                VideoTagApi.a.a().tagUpdate("", "[" + curUserId + ']', Long.parseLong(aid)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a(new SocialVideoTagShareVM.a(aweme, curUserId, socialVideoTagShareVM), SocialVideoTagShareVM.b.f72285a);
            }
        }
        super.onDestroyView();
        br_();
    }

    static final class f extends m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f72250a = new f();

        static {
            Covode.recordClassIndex(44535);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f72251a);
            return z.f158842a;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f72253a;

        static {
            Covode.recordClassIndex(44540);
        }

        h(d dVar) {
            this.f72253a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f72253a.f72241g.invoke();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(f.f72250a);
    }

    static final class g extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ String $anchorType;
        final /* synthetic */ String $enterFrom;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(44537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar, String str, String str2) {
            super(1);
            this.this$0 = dVar;
            this.$enterFrom = str;
            this.$anchorType = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.comment.page.tag.d.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(44538);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    iVar2.a(new C1624d(this.this$0.this$0.f72240f, this.this$0.this$0.f72239e, this.this$0.$enterFrom, this.this$0.$anchorType));
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, AnonymousClass2.f72252a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        String str;
        String str2;
        String str3;
        String authorUid;
        String str4 = "";
        l.d(view, str4);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Serializable serializable2 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("tagged_users");
        } else {
            serializable = null;
        }
        this.f72239e = (ArrayList) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("aweme");
        }
        this.f72240f = (Aweme) serializable2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str = arguments3.getString("enter_from")) == null) {
            str = str4;
        }
        l.b(str, str4);
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str2 = arguments4.getString("anchor_type")) == null) {
            str2 = str4;
        }
        l.b(str2, str4);
        com.bytedance.assem.arch.extensions.d.a(this, new g(this, str, str2));
        ((TuxIconView) a(R.id.a7l)).setOnClickListener(new h(this));
        FeedTaggedListViewModel c2 = c();
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", c2.g().f72247c);
        Aweme aweme = c2.g().f72245a;
        if (aweme == null || (str3 = aweme.getAid()) == null) {
            str3 = str4;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str3);
        Aweme aweme2 = c2.g().f72245a;
        if (!(aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null)) {
            str4 = authorUid;
        }
        r.a("show_in_this_video_bottom_sheet", a3.a("author_id", str4).a("anchor_type", c2.g().f72248d).f66730a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ib, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
