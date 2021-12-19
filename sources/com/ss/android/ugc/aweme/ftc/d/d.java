package com.ss.android.ugc.aweme.ftc.d;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import androidx.lifecycle.m;
import com.bytedance.als.h;
import com.bytedance.als.l;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
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
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.v;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.k.k;
import h.p;
import h.z;
import java.util.Objects;

public final class d extends j implements com.bytedance.jedi.arch.b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f98430e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AVAutoRTLImageView f98431a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<z> f98432b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Drawable> f98433c;

    /* renamed from: d  reason: collision with root package name */
    public final l<p<Float, Float>> f98434d;

    /* renamed from: f  reason: collision with root package name */
    private final h<Boolean> f98435f;

    static {
        Covode.recordClassIndex(62599);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62600);
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

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98436a;

        static {
            Covode.recordClassIndex(62601);
        }

        b(d dVar) {
            this.f98436a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Drawable drawable = (Drawable) obj;
            if (drawable != null) {
                d.a(this.f98436a).setImageDrawable(drawable);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98439a;

        static {
            Covode.recordClassIndex(62604);
        }

        e(d dVar) {
            this.f98439a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f98439a.f98432b.invoke();
        }
    }

    public static final /* synthetic */ AVAutoRTLImageView a(d dVar) {
        AVAutoRTLImageView aVAutoRTLImageView = dVar.f98431a;
        if (aVAutoRTLImageView == null) {
            h.f.b.l.a("closeRecordView");
        }
        return aVAutoRTLImageView;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98437a;

        static {
            Covode.recordClassIndex(62602);
        }

        c(d dVar) {
            this.f98437a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            p pVar = (p) obj;
            if (pVar != null) {
                n.a(d.a(this.f98437a));
                AlphaAnimation alphaAnimation = new AlphaAnimation(((Number) pVar.getFirst()).floatValue(), ((Number) pVar.getSecond()).floatValue());
                alphaAnimation.setDuration(150);
                d.a(this.f98437a).startAnimation(alphaAnimation);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.d.d$d  reason: collision with other inner class name */
    static final class C2383d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98438a;

        static {
            Covode.recordClassIndex(62603);
        }

        C2383d(d dVar) {
            this.f98438a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = d.a(this.f98438a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f98438a.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            marginLayoutParams.topMargin = dh.c(activity) + this.f98438a.t().getResources().getDimensionPixelSize(R.dimen.rk);
            d.a(this.f98438a).setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.bmu);
        h.f.b.l.b(c2, "");
        this.f98431a = (AVAutoRTLImageView) c2;
        this.f98433c.a(this, new b(this));
        this.f98434d.a(this, new c(this));
        this.f98435f.a(this, new C2383d(this));
        AVAutoRTLImageView aVAutoRTLImageView = this.f98431a;
        if (aVAutoRTLImageView == null) {
            h.f.b.l.a("closeRecordView");
        }
        aVAutoRTLImageView.setOnClickListener(new e(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a34, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public d(h.f.a.a<z> aVar, l<Drawable> lVar, l<p<Float, Float>> lVar2, h<Boolean> hVar) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(lVar2, "");
        h.f.b.l.d(hVar, "");
        this.f98432b = aVar;
        this.f98433c = lVar;
        this.f98434d = lVar2;
        this.f98435f = hVar;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar, h.f.a.m<? super i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
