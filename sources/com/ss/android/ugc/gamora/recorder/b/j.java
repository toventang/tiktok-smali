package com.ss.android.ugc.gamora.recorder.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import androidx.lifecycle.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.views.TransEdgeView;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.h;
import h.i;
import h.k.k;
import h.z;
import java.util.Objects;

public final class j extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f147471c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TabHost f147472a;

    /* renamed from: b  reason: collision with root package name */
    public final e f147473b;

    /* renamed from: d  reason: collision with root package name */
    private final h f147474d = i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f147475e = i.a((h.f.a.a) new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final f f147476f;

    /* renamed from: g  reason: collision with root package name */
    private final ShortVideoContext f147477g;

    /* renamed from: h  reason: collision with root package name */
    private final com.bytedance.als.h<Boolean> f147478h;

    static {
        Covode.recordClassIndex(97172);
    }

    private final TransEdgeView a() {
        return (TransEdgeView) this.f147475e.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97173);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f147476f;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
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

    static final class c extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(97175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return j.a(this.this$0).findViewById(R.id.ad7);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<TransEdgeView> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(97176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TransEdgeView invoke() {
            return j.a(this.this$0).findViewById(R.id.eh8);
        }
    }

    private final void b() {
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        float b2 = n.b(t(), 16.0f);
        if (marginLayoutParams.leftMargin > 0 && marginLayoutParams.rightMargin > 0) {
            a().c();
            a().setDrawSize(b2);
        } else if (marginLayoutParams.leftMargin == 0) {
            a().b();
            a().setDrawSize(b2);
        } else if (marginLayoutParams.rightMargin == 0) {
            a().a();
            a().setDrawSize(b2);
        } else {
            a().setDrawSize(0.0f);
        }
    }

    public static final /* synthetic */ TabHost a(j jVar) {
        TabHost tabHost = jVar.f147472a;
        if (tabHost == null) {
            l.a("tabHost");
        }
        return tabHost;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f147479a;

        static {
            Covode.recordClassIndex(97174);
        }

        b(j jVar) {
            this.f147479a = jVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            ViewGroup.LayoutParams layoutParams = j.a(this.f147479a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = (com.ss.android.ugc.aweme.adaptation.a.c() - ((int) n.b(this.f147479a.t(), 40.0f))) / 2;
            } else {
                i2 = 0;
            }
            marginLayoutParams.bottomMargin = i2;
            j.a(this.f147479a).setLayoutParams(marginLayoutParams);
        }
    }

    public final int a(Object obj) {
        l.d(obj, "");
        TabHost tabHost = this.f147472a;
        if (tabHost == null) {
            l.a("tabHost");
        }
        int tabCount = tabHost.getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            TabHost tabHost2 = this.f147472a;
            if (tabHost2 == null) {
                l.a("tabHost");
            }
            if (l.a(obj, tabHost2.a(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public final void b(Integer num) {
        int i2;
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = 0;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        marginLayoutParams.leftMargin = i2;
        TabHost tabHost = this.f147472a;
        if (tabHost == null) {
            l.a("tabHost");
        }
        if (num != null) {
            i3 = num.intValue();
        }
        tabHost.setStartMargin(i3);
        a().setLayoutParams(marginLayoutParams);
        b();
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.wa);
        l.b(c2, "");
        TabHost tabHost = (TabHost) c2;
        this.f147472a = tabHost;
        e eVar = this.f147473b;
        ShortVideoContext shortVideoContext = this.f147477g;
        if (tabHost == null) {
            l.a("tabHost");
        }
        eVar.a(shortVideoContext, tabHost);
        this.f147478h.a(this, new b(this));
    }

    public final void a(Animation animation) {
        l.d(animation, "");
        TabHost tabHost = this.f147472a;
        if (tabHost == null) {
            l.a("tabHost");
        }
        tabHost.clearAnimation();
        TabHost tabHost2 = this.f147472a;
        if (tabHost2 == null) {
            l.a("tabHost");
        }
        tabHost2.startAnimation(animation);
    }

    public final void a(Integer num) {
        int i2;
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        marginLayoutParams.rightMargin = i2;
        a().setLayoutParams(marginLayoutParams);
        b();
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bil, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    public final void a(int i2, boolean z) {
        TabHost tabHost = this.f147472a;
        if (tabHost == null) {
            l.a("tabHost");
        }
        tabHost.a(i2, z, true);
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
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    public j(f fVar, ShortVideoContext shortVideoContext, e eVar, com.bytedance.als.h<Boolean> hVar) {
        l.d(fVar, "");
        l.d(shortVideoContext, "");
        l.d(eVar, "");
        l.d(hVar, "");
        this.f147476f = fVar;
        this.f147477g = shortVideoContext;
        this.f147473b = eVar;
        this.f147478h = hVar;
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
