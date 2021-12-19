package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
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
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.tools.i;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;
import java.util.Objects;

public class aw extends com.ss.android.ugc.gamora.b.b implements com.bytedance.jedi.arch.b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f125648h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public bu f125649a;

    /* renamed from: b  reason: collision with root package name */
    public DMTBgAnimRadioGroup f125650b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f125651c = true;

    /* renamed from: d  reason: collision with root package name */
    protected CutMultiVideoViewModel f125652d;

    /* renamed from: e  reason: collision with root package name */
    protected CutVideoSpeedViewModel f125653e;

    /* renamed from: f  reason: collision with root package name */
    public float f125654f;

    /* renamed from: g  reason: collision with root package name */
    public i f125655g = i.NORMAL;

    static {
        Covode.recordClassIndex(82524);
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82525);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    /* access modifiers changed from: protected */
    public final CutMultiVideoViewModel cr_() {
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f125652d;
        if (cutMultiVideoViewModel == null) {
            l.a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* access modifiers changed from: protected */
    public void b() {
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup = this.f125650b;
        if (dMTBgAnimRadioGroup == null) {
            l.a("speedView");
        }
        ViewGroup.LayoutParams layoutParams = dMTBgAnimRadioGroup.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = (int) this.f125654f;
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup2 = this.f125650b;
        if (dMTBgAnimRadioGroup2 == null) {
            l.a("speedView");
        }
        dMTBgAnimRadioGroup2.setLayoutParams(layoutParams2);
    }

    public static final class g implements DMTBgAnimRadioGroup.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aw f125659a;

        static {
            Covode.recordClassIndex(82531);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(aw awVar) {
            this.f125659a = awVar;
        }

        @Override // com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup.b
        public final void a(int i2) {
            if (this.f125659a.f125651c) {
                this.f125659a.f125655g = aw.d(i2);
                this.f125659a.cr_().f125329d.setValue(Float.valueOf(aw.d(i2).value()));
            }
        }

        @Override // com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup.b
        public final boolean b(int i2) {
            float f2;
            if (!this.f125659a.f125651c || this.f125659a.f125649a == null) {
                return false;
            }
            bu buVar = this.f125659a.f125649a;
            if (buVar != null) {
                f2 = buVar.G();
            } else {
                f2 = 0.0f;
            }
            float value = this.f125659a.f125655g.value();
            float value2 = aw.d(i2).value();
            if (((long) ((f2 * value) / value2)) >= di.a() / 1000) {
                return true;
            }
            Activity t = this.f125659a.t();
            l.b(t, "");
            String string = t.getResources().getString(R.string.h_f, Integer.valueOf((int) ((((float) (di.a() / 1000)) * value2) / value)));
            l.b(string, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f125659a.t()).a(string).a();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(CutMultiVideoViewModel cutMultiVideoViewModel) {
        l.d(cutMultiVideoViewModel, "");
        this.f125652d = cutMultiVideoViewModel;
    }

    public static final /* synthetic */ DMTBgAnimRadioGroup a(aw awVar) {
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup = awVar.f125650b;
        if (dMTBgAnimRadioGroup == null) {
            l.a("speedView");
        }
        return dMTBgAnimRadioGroup;
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aw f125656a;

        static {
            Covode.recordClassIndex(82528);
        }

        d(aw awVar) {
            this.f125656a = awVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                View view = this.f125656a.n;
                l.b(view, "");
                view.setAlpha(floatValue);
            }
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aw f125658a;

        static {
            Covode.recordClassIndex(82530);
        }

        f(aw awVar) {
            this.f125658a = awVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            float a2;
            Float f2 = (Float) obj;
            aw awVar = this.f125658a;
            if (f2 != null) {
                a2 = f2.floatValue();
            } else {
                Activity t = awVar.t();
                l.b(t, "");
                a2 = com.ss.android.ugc.aweme.editSticker.a.d.a(t, 163.0f);
            }
            awVar.f125654f = a2;
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aw f125657a;

        static {
            Covode.recordClassIndex(82529);
        }

        e(aw awVar) {
            this.f125657a = awVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            i iVar = (i) obj;
            if (iVar != null) {
                this.f125657a.f125655g = iVar;
                DMTBgAnimRadioGroup a2 = aw.a(this.f125657a);
                int i2 = ax.f125660a[iVar.ordinal()];
                int i3 = 2;
                if (i2 == 1) {
                    i3 = 0;
                } else if (i2 == 2) {
                    i3 = 1;
                } else if (i2 != 3) {
                    i3 = -1;
                }
                a2.setCurrentItem(i3);
                aw.a(this.f125657a).requestLayout();
            }
        }
    }

    public static i d(int i2) {
        if (i2 == 0) {
            return i.SLOW;
        }
        if (i2 == 1) {
            return i.NORMAL;
        }
        if (i2 == 2) {
            return i.FAST;
        }
        throw new IllegalArgumentException("unknown view: ".concat(String.valueOf(i2)));
    }

    /* access modifiers changed from: protected */
    public final void a(CutVideoSpeedViewModel cutVideoSpeedViewModel) {
        l.d(cutVideoSpeedViewModel, "");
        this.f125653e = cutVideoSpeedViewModel;
    }

    @Override // com.bytedance.scene.j
    public void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(CutMultiVideoViewModel.class);
        l.b(a2, "");
        this.f125652d = (CutMultiVideoViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(CutVideoSpeedViewModel.class);
        l.b(a3, "");
        CutVideoSpeedViewModel cutVideoSpeedViewModel = (CutVideoSpeedViewModel) a3;
        this.f125653e = cutVideoSpeedViewModel;
        if (cutVideoSpeedViewModel == null) {
            l.a("speedViewModel");
        }
        selectNonNullSubscribe(cutVideoSpeedViewModel, ay.f125661a, new ah(), new b(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.f125653e;
        if (cutVideoSpeedViewModel2 == null) {
            l.a("speedViewModel");
        }
        selectNonNullSubscribe(cutVideoSpeedViewModel2, az.f125662a, new ah(), new c(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.f125653e;
        if (cutVideoSpeedViewModel3 == null) {
            l.a("speedViewModel");
        }
        cutVideoSpeedViewModel3.b().observe(this, new d(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel4 = this.f125653e;
        if (cutVideoSpeedViewModel4 == null) {
            l.a("speedViewModel");
        }
        cutVideoSpeedViewModel4.a().observe(this, new e(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel5 = this.f125653e;
        if (cutVideoSpeedViewModel5 == null) {
            l.a("speedViewModel");
        }
        cutVideoSpeedViewModel5.g().observe(this, new f(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class b extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ aw this$0;

        static {
            Covode.recordClassIndex(82526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(aw awVar) {
            super(2);
            this.this$0 = awVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            this.this$0.f125651c = booleanValue;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.asq, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ aw this$0;

        static {
            Covode.recordClassIndex(82527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(aw awVar) {
            super(2);
            this.this$0 = awVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            if (booleanValue) {
                this.this$0.b();
            }
            DMTBgAnimRadioGroup a2 = aw.a(this.this$0);
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a2.setVisibility(i2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        Context context = view.getContext();
        l.b(context, "");
        this.f125654f = com.ss.android.ugc.aweme.editSticker.a.d.a(context, 163.0f);
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup = (DMTBgAnimRadioGroup) view;
        this.f125650b = dMTBgAnimRadioGroup;
        if (dMTBgAnimRadioGroup == null) {
            l.a("speedView");
        }
        String c_ = c_(R.string.g1j);
        l.b(c_, "");
        dMTBgAnimRadioGroup.a(c_);
        String c_2 = c_(R.string.g5_);
        l.b(c_2, "");
        dMTBgAnimRadioGroup.a(c_2);
        String c_3 = c_(R.string.bsd);
        l.b(c_3, "");
        dMTBgAnimRadioGroup.a(c_3);
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup2 = this.f125650b;
        if (dMTBgAnimRadioGroup2 == null) {
            l.a("speedView");
        }
        dMTBgAnimRadioGroup2.setCurrentItem(1);
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup3 = this.f125650b;
        if (dMTBgAnimRadioGroup3 == null) {
            l.a("speedView");
        }
        dMTBgAnimRadioGroup3.setOnItemChangeListener(new g(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
