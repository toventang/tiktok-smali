package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.m;
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
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.setting.cj;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;
import java.util.Objects;

public final class bm extends com.ss.android.ugc.gamora.b.b implements com.bytedance.jedi.arch.b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f125733d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ImageView f125734a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f125735b;

    /* renamed from: c  reason: collision with root package name */
    public CutVideoViewModel f125736c;

    /* renamed from: e  reason: collision with root package name */
    private CutVideoTitleBarViewModel f125737e;

    static {
        Covode.recordClassIndex(82576);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82577);
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

    public static final class c extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bm f125739a;

        static {
            Covode.recordClassIndex(82579);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(bm bmVar) {
            this.f125739a = bmVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            b.a.f132249a.start("av_video_edit", "click onNext btn");
            bm.c(this.f125739a).c(CutVideoViewModel.a.f125547a);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bm f125738a;

        static {
            Covode.recordClassIndex(82578);
        }

        b(bm bmVar) {
            this.f125738a = bmVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            bm.c(this.f125738a).a();
        }
    }

    public static final /* synthetic */ ImageView a(bm bmVar) {
        ImageView imageView = bmVar.f125734a;
        if (imageView == null) {
            l.a("ivBack");
        }
        return imageView;
    }

    public static final /* synthetic */ TextView b(bm bmVar) {
        TextView textView = bmVar.f125735b;
        if (textView == null) {
            l.a("tvNext");
        }
        return textView;
    }

    public static final /* synthetic */ CutVideoViewModel c(bm bmVar) {
        CutVideoViewModel cutVideoViewModel = bmVar.f125736c;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(CutVideoViewModel.class);
        l.b(a2, "");
        this.f125736c = (CutVideoViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(CutVideoTitleBarViewModel.class);
        l.b(a3, "");
        this.f125737e = (CutVideoTitleBarViewModel) a3;
        Typeface a4 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
        if (a4 != null) {
            TextView textView = this.f125735b;
            if (textView == null) {
                l.a("tvNext");
            }
            textView.setTypeface(a4);
        }
        CutVideoViewModel cutVideoViewModel = this.f125736c;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.g()) {
            View view = this.n;
            l.b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = ((int) n.b(this.f42913m, 25.0f)) + dh.c(this.f42913m);
            View view2 = this.n;
            l.b(view2, "");
            view2.setLayoutParams(layoutParams2);
        } else {
            View view3 = this.n;
            l.b(view3, "");
            if (view3.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin = dh.c(this.f42913m);
                view3.setLayoutParams(layoutParams4);
            } else if (view3.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                layoutParams6.topMargin = dh.c(this.f42913m);
                view3.setLayoutParams(layoutParams6);
            }
        }
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f125737e;
        if (cutVideoTitleBarViewModel == null) {
            l.a("titleBarViewModel");
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel, bn.f125742a, new ah(), new e(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f125737e;
        if (cutVideoTitleBarViewModel2 == null) {
            l.a("titleBarViewModel");
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel2, bo.f125743a, new ah(), new f(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel3 = this.f125737e;
        if (cutVideoTitleBarViewModel3 == null) {
            l.a("titleBarViewModel");
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel3, bp.f125744a, new ah(), new g(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel4 = this.f125737e;
        if (cutVideoTitleBarViewModel4 == null) {
            l.a("titleBarViewModel");
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel4, bq.f125745a, new ah(), new h(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel5 = this.f125737e;
        if (cutVideoTitleBarViewModel5 == null) {
            l.a("titleBarViewModel");
        }
        b.a.b(this, cutVideoTitleBarViewModel5, br.f125746a, new d(this));
        ImageView imageView = this.f125734a;
        if (imageView == null) {
            l.a("ivBack");
        }
        imageView.setOnClickListener(new b(this));
        TextView textView2 = this.f125735b;
        if (textView2 == null) {
            l.a("tvNext");
        }
        textView2.setOnClickListener(new c(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ bm this$0;

        static {
            Covode.recordClassIndex(82582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(bm bmVar) {
            super(2);
            this.this$0 = bmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            ImageView a2 = bm.a(this.this$0);
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            a2.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ bm this$0;

        static {
            Covode.recordClassIndex(82583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(bm bmVar) {
            super(2);
            this.this$0 = bmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            TextView b2 = bm.b(this.this$0);
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            b2.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ bm this$0;

        static {
            Covode.recordClassIndex(82584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(bm bmVar) {
            super(2);
            this.this$0 = bmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            bm.a(this.this$0).setEnabled(booleanValue);
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ bm this$0;

        static {
            Covode.recordClassIndex(82585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(bm bmVar) {
            super(2);
            this.this$0 = bmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            bm.b(this.this$0).setEnabled(booleanValue);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ass, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ bm this$0;

        static {
            Covode.recordClassIndex(82580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(bm bmVar) {
            super(2);
            this.this$0 = bmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            final boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            float f2 = 0.0f;
            float f3 = 1.0f;
            if (!booleanValue) {
                f2 = 1.0f;
                f3 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.this$0.n, "alpha", f2, f3);
            l.b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.addListener(new AnimatorListenerAdapter(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.scene.bm.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f125740a;

                static {
                    Covode.recordClassIndex(82581);
                }

                public final void onAnimationEnd(Animator animator) {
                    l.d(animator, "");
                    super.onAnimationEnd(animator);
                    if (booleanValue) {
                        View view = this.f125740a.this$0.n;
                        if (view != null) {
                            view.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    View view2 = this.f125740a.this$0.n;
                    if (view2 != null) {
                        view2.setVisibility(4);
                    }
                }

                {
                    this.f125740a = r1;
                }
            });
            ofFloat.start();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.bt4);
        l.b(c2, "");
        this.f125734a = (ImageView) c2;
        if (cj.a()) {
            ImageView imageView = this.f125734a;
            if (imageView == null) {
                l.a("ivBack");
            }
            imageView.setImageResource(2131232197);
        }
        View c3 = c(R.id.eux);
        l.b(c3, "");
        this.f125735b = (TextView) c3;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
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
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, z> mVar) {
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
