package com.ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.bytedance.o.n;
import com.bytedance.o.p;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.i;
import h.k.k;
import h.m;
import h.z;
import java.util.Objects;

public final class a extends com.bytedance.scene.group.b implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: e  reason: collision with root package name */
    public static final c f137459e = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f137460b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f137461c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f137462d = i.a(m.NONE, new C3609a(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f137463f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.o.f f137464g;

    static {
        Covode.recordClassIndex(89910);
    }

    public final StoryEditToolbarViewModel E() {
        return (StoryEditToolbarViewModel) this.f137463f.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(89913);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a$a  reason: collision with other inner class name */
    public static final class C3609a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.business.shared.d.c> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3609a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.d.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.d.c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.d.c> r1 = com.ss.android.ugc.aweme.story.edit.business.shared.d.c.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.C3609a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        com.bytedance.o.f b2 = com.bytedance.als.dsl.c.b(this);
        if (b2 == null) {
            l.b();
        }
        return b2;
    }

    public static final class b extends h.f.b.m implements h.f.a.a<StoryEditToolbarViewModel> {
        final /* synthetic */ j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(89912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_edit_business_shared_toolbar_StoryEditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_edit_business_shared_toolbar_StoryEditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_story_edit_business_shared_toolbar_StoryEditBottomBarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137469a;

        static {
            Covode.recordClassIndex(89916);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(a aVar) {
            this.f137469a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f137469a.E().a(new n(100));
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<n, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f137472a = new h();

        static {
            Covode.recordClassIndex(89918);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n nVar) {
            l.d(nVar, "");
            return z.f158842a;
        }
    }

    public static final class g extends p<com.ss.android.ugc.aweme.story.edit.business.shared.d.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137470a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f137471b;

        static {
            Covode.recordClassIndex(89917);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.shared.d.d get(com.bytedance.o.f fVar) {
            l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.shared.d.d(fVar, this.f137471b);
        }

        public g(com.bytedance.als.dsl.d dVar, a aVar) {
            this.f137470a = dVar;
            this.f137471b = aVar;
        }
    }

    public static final /* synthetic */ ViewGroup a(a aVar) {
        ViewGroup viewGroup = aVar.f137460b;
        if (viewGroup == null) {
            l.a("bottomLayout");
        }
        return viewGroup;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public a(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f137464g = fVar;
        h.k.c a2 = h.f.b.ab.a(StoryEditToolbarViewModel.class);
        this.f137463f = i.a((h.f.a.a) new b(this, a2, a2));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        com.bytedance.als.dsl.g.a(this, h.f137472a);
        com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.shared.d.d.class, (String) null, (p) new g(dVar, this));
        alsLogicContainer.a(com.ss.android.ugc.aweme.story.edit.business.shared.d.c.class, com.ss.android.ugc.aweme.story.edit.business.shared.d.d.class);
        bVar.a();
        selectNonNullSubscribe(E(), b.f137473a, new ah(), new d(this));
        selectNonNullSubscribe(E(), c.f137474a, new ah(), new e(this));
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            l.d(bVar, "");
            ViewGroup.LayoutParams layoutParams = a.a(this.this$0).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                en.a(54.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                marginLayoutParams.height = intValue;
                a.a(this.this$0).setLayoutParams(marginLayoutParams);
            }
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            ViewGroup viewGroup = this.this$0.f137461c;
            if (viewGroup == null) {
                l.a("shareBtn");
            }
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            viewGroup.setVisibility(i2);
            ((com.ss.android.ugc.aweme.story.edit.business.shared.d.c) this.this$0.f137462d.getValue()).a(booleanValue);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.b6f);
        l.b(c2, "");
        ViewGroup viewGroup = (ViewGroup) c2;
        this.f137461c = viewGroup;
        if (viewGroup == null) {
            l.a("shareBtn");
        }
        viewGroup.setOnClickListener(new f(this));
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2m, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        this.f137460b = viewGroup2;
        if (viewGroup2 == null) {
            l.a("bottomLayout");
        }
        return viewGroup2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
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
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
