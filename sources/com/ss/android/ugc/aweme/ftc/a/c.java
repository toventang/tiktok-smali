package com.ss.android.ugc.aweme.ftc.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m;
import com.bytedance.als.h;
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
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.v;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.gamora.recorder.b.e;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;
import java.util.Objects;

public final class c extends j implements com.bytedance.jedi.arch.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f97418b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TabHost f97419a;

    /* renamed from: c  reason: collision with root package name */
    private final ShortVideoContext f97420c;

    /* renamed from: d  reason: collision with root package name */
    private final e f97421d;

    /* renamed from: e  reason: collision with root package name */
    private final h<Boolean> f97422e;

    static {
        Covode.recordClassIndex(61886);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61887);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ i getReceiver() {
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
    public final ae<i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final /* synthetic */ TabHost a(c cVar) {
        TabHost tabHost = cVar.f97419a;
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
        final /* synthetic */ c f97423a;

        static {
            Covode.recordClassIndex(61888);
        }

        b(c cVar) {
            this.f97423a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            ViewGroup.LayoutParams layoutParams = c.a(this.f97423a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = (com.ss.android.ugc.aweme.adaptation.a.c() - ((int) n.b(this.f97423a.t(), 40.0f))) / 2;
            } else {
                i2 = 0;
            }
            marginLayoutParams.bottomMargin = i2;
            c.a(this.f97423a).setLayoutParams(marginLayoutParams);
        }
    }

    public final int a(Object obj) {
        l.d(obj, "");
        TabHost tabHost = this.f97419a;
        if (tabHost == null) {
            l.a("tabHost");
        }
        int tabCount = tabHost.getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            TabHost tabHost2 = this.f97419a;
            if (tabHost2 == null) {
                l.a("tabHost");
            }
            if (l.a(obj, tabHost2.a(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.wa);
        l.b(c2, "");
        TabHost tabHost = (TabHost) c2;
        this.f97419a = tabHost;
        e eVar = this.f97421d;
        ShortVideoContext shortVideoContext = this.f97420c;
        if (tabHost == null) {
            l.a("tabHost");
        }
        eVar.a(shortVideoContext, tabHost);
        this.f97422e.a(this, new b(this));
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
        View a2 = com.a.a(layoutInflater, R.layout.a35, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    public final void a(int i2, boolean z) {
        TabHost tabHost = this.f97419a;
        if (tabHost == null) {
            l.a("tabHost");
        }
        tabHost.a(i2, z, true);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public c(ShortVideoContext shortVideoContext, e eVar, h<Boolean> hVar) {
        l.d(shortVideoContext, "");
        l.d(eVar, "");
        l.d(hVar, "");
        this.f97420c = shortVideoContext;
        this.f97421d = eVar;
        this.f97422e = hVar;
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
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends d<? extends A>> kVar, ah<ak<d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
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

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar, h.f.a.m<? super i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
