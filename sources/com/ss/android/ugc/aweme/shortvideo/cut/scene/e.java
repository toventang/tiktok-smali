package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
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
import com.google.android.material.internal.CheckableImageButton;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.z;
import java.util.Objects;

public final class e extends com.ss.android.ugc.gamora.b.b implements com.bytedance.jedi.arch.b {
    public static final a v = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ba f125751a;

    /* renamed from: b  reason: collision with root package name */
    public VECutVideoPresenter f125752b;

    /* renamed from: c  reason: collision with root package name */
    public bs f125753c;

    /* renamed from: d  reason: collision with root package name */
    TextView f125754d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f125755e;

    /* renamed from: f  reason: collision with root package name */
    public CheckableImageButton f125756f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f125757g;

    /* renamed from: h  reason: collision with root package name */
    public CutVideoBottomBarViewModel f125758h;

    /* renamed from: i  reason: collision with root package name */
    public CutVideoViewModel f125759i;

    /* renamed from: j  reason: collision with root package name */
    VideoEditViewModel f125760j;

    /* renamed from: k  reason: collision with root package name */
    public CutVideoListViewModel f125761k;

    /* renamed from: l  reason: collision with root package name */
    public CutVideoSpeedViewModel f125762l;
    public CutMultiVideoViewModel t;
    CutVideoEditViewModel u;

    static {
        Covode.recordClassIndex(82600);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82601);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
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

    public final bs a() {
        bs bsVar = this.f125753c;
        if (bsVar == null) {
            h.f.b.l.a("previewEditCallback");
        }
        return bsVar;
    }

    public final void a(VECutVideoPresenter vECutVideoPresenter) {
        h.f.b.l.d(vECutVideoPresenter, "");
        this.f125752b = vECutVideoPresenter;
    }

    public static final class p extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f125776b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.b f125777c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.b f125778d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.c f125779e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z.c f125780f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f125781g;

        static {
            Covode.recordClassIndex(82617);
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f125781g.setEnabled(true);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f125781g.setEnabled(false);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f125781g.setEnabled(true);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f125775a.t;
            if (cutMultiVideoViewModel == null) {
                h.f.b.l.a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.b();
        }

        p(e eVar, z.c cVar, z.b bVar, z.b bVar2, z.c cVar2, z.c cVar3, View view) {
            this.f125775a = eVar;
            this.f125776b = cVar;
            this.f125777c = bVar;
            this.f125778d = bVar2;
            this.f125779e = cVar2;
            this.f125780f = cVar3;
            this.f125781g = view;
        }
    }

    public static final /* synthetic */ CheckableImageButton a(e eVar) {
        CheckableImageButton checkableImageButton = eVar.f125756f;
        if (checkableImageButton == null) {
            h.f.b.l.a("ivSpeed");
        }
        return checkableImageButton;
    }

    public static final /* synthetic */ ImageView b(e eVar) {
        ImageView imageView = eVar.f125755e;
        if (imageView == null) {
            h.f.b.l.a("ivRotate");
        }
        return imageView;
    }

    public static final /* synthetic */ ImageView c(e eVar) {
        ImageView imageView = eVar.f125757g;
        if (imageView == null) {
            h.f.b.l.a("ivDelete");
        }
        return imageView;
    }

    public static final /* synthetic */ CutVideoListViewModel d(e eVar) {
        CutVideoListViewModel cutVideoListViewModel = eVar.f125761k;
        if (cutVideoListViewModel == null) {
            h.f.b.l.a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    public static final /* synthetic */ CutVideoViewModel e(e eVar) {
        CutVideoViewModel cutVideoViewModel = eVar.f125759i;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    public static final /* synthetic */ CutVideoSpeedViewModel f(e eVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = eVar.f125762l;
        if (cutVideoSpeedViewModel == null) {
            h.f.b.l.a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125766a;

        static {
            Covode.recordClassIndex(82610);
        }

        i(e eVar) {
            this.f125766a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                View view = this.f125766a.n;
                h.f.b.l.b(view, "");
                view.setAlpha(floatValue);
            }
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125767a;

        static {
            Covode.recordClassIndex(82611);
        }

        j(e eVar) {
            this.f125767a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                View view = this.f125767a.n;
                h.f.b.l.b(view, "");
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125763a;

        static {
            Covode.recordClassIndex(82602);
        }

        b(e eVar) {
            this.f125763a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e eVar = this.f125763a;
            AnonymousClass1 r4 = new h.f.a.a<h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.scene.e.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(82603);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    e.d(this.this$0.f125763a).c(CutVideoListViewModel.b.f125531a);
                    return h.z.f158842a;
                }
            };
            Activity activity = eVar.f42913m;
            if (activity != null) {
                new a.C0731a(activity).b(R.string.b69).b(R.string.d6h, (DialogInterface.OnClickListener) null, false).a(R.string.b5g, (DialogInterface.OnClickListener) new q(r4), false).a().b().show();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125764a;

        static {
            Covode.recordClassIndex(82604);
        }

        c(e eVar) {
            this.f125764a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            boolean isChecked = e.a(this.f125764a).isChecked();
            e.a(this.f125764a).toggle();
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f125764a.f125758h;
            if (cutVideoBottomBarViewModel == null) {
                h.f.b.l.a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel.b(!isChecked);
            if (e.e(this.f125764a).g()) {
                e.d(this.f125764a).c(new CutVideoListViewModel.l(!isChecked));
            } else if (!isChecked) {
                CutVideoSpeedViewModel f2 = e.f(this.f125764a);
                com.ss.android.ugc.aweme.tools.i a2 = com.ss.android.ugc.aweme.shortvideo.cut.m.a(this.f125764a.a().L().getCurrentSpeed());
                h.f.b.l.b(a2, "");
                f2.a(a2);
                e.f(this.f125764a).b(true);
            } else {
                e.f(this.f125764a).b(false);
            }
        }
    }

    static final class o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f125769b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.b f125770c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.b f125771d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.c f125772e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z.c f125773f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f125774g;

        static {
            Covode.recordClassIndex(82616);
        }

        o(e eVar, z.c cVar, z.b bVar, z.b bVar2, z.c cVar2, z.c cVar3, View view) {
            this.f125768a = eVar;
            this.f125769b = cVar;
            this.f125770c = bVar;
            this.f125771d = bVar2;
            this.f125772e = cVar2;
            this.f125773f = cVar3;
            this.f125774g = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            VECutVideoPresenter vECutVideoPresenter = this.f125768a.f125752b;
            if (vECutVideoPresenter == null) {
                h.f.b.l.a("presenter");
            }
            VECutVideoPresenter.a(vECutVideoPresenter, e.d(this.f125768a).f125528b, (90.0f * animatedFraction) + ((float) this.f125769b.element), false, (this.f125771d.element * animatedFraction) + this.f125770c.element, this.f125770c.element + (this.f125771d.element * animatedFraction), this.f125772e.element, this.f125773f.element, 4);
        }
    }

    public final void a(bs bsVar) {
        h.f.b.l.d(bsVar, "");
        this.f125753c = bsVar;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f125765a;

        static {
            Covode.recordClassIndex(82605);
        }

        d(e eVar) {
            this.f125765a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0125, code lost:
            if (r0 == null) goto L_0x0127;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
            if (r0 == null) goto L_0x0138;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
            if (r0 == null) goto L_0x0149;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r19) {
            /*
            // Method dump skipped, instructions count: 490
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.scene.e.d.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(CutVideoBottomBarViewModel.class);
        h.f.b.l.b(a2, "");
        this.f125758h = (CutVideoBottomBarViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((androidx.fragment.app.e) activity2).a(CutVideoViewModel.class);
        h.f.b.l.b(a3, "");
        this.f125759i = (CutVideoViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a4 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity3, (ad.b) null).a(VideoEditViewModel.class);
        h.f.b.l.b(a4, "");
        this.f125760j = (VideoEditViewModel) a4;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = t.a((androidx.fragment.app.e) activity4).a(CutVideoListViewModel.class);
        h.f.b.l.b(a5, "");
        this.f125761k = (CutVideoListViewModel) a5;
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = t.a((androidx.fragment.app.e) activity5).a(CutVideoSpeedViewModel.class);
        h.f.b.l.b(a6, "");
        this.f125762l = (CutVideoSpeedViewModel) a6;
        Activity activity6 = this.f42913m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a7 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity6, (ad.b) null).a(CutMultiVideoViewModel.class);
        h.f.b.l.b(a7, "");
        this.t = (CutMultiVideoViewModel) a7;
        Activity activity7 = this.f42913m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a8 = t.a((androidx.fragment.app.e) activity7).a(CutVideoEditViewModel.class);
        h.f.b.l.b(a8, "");
        this.u = (CutVideoEditViewModel) a8;
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f125758h;
        if (cutVideoBottomBarViewModel == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel, f.f125783a, new ah(), new k(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.f125758h;
        if (cutVideoBottomBarViewModel2 == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel2, j.f125787a, new ah(), new l(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.f125758h;
        if (cutVideoBottomBarViewModel3 == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel3, k.f125788a, new ah(), new m(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.f125758h;
        if (cutVideoBottomBarViewModel4 == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel4, l.f125789a, new ah(), new n(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel5 = this.f125758h;
        if (cutVideoBottomBarViewModel5 == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel5, m.f125790a, new ah(), new C3270e(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel6 = this.f125758h;
        if (cutVideoBottomBarViewModel6 == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel6, g.f125784a, new ah(), new f(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel7 = this.f125758h;
        if (cutVideoBottomBarViewModel7 == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel7, h.f125785a, new ah(), new g(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel8 = this.f125758h;
        if (cutVideoBottomBarViewModel8 == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel8, i.f125786a, new ah(), new h(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel9 = this.f125758h;
        if (cutVideoBottomBarViewModel9 == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel9.a().observe(this, new i(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel10 = this.f125758h;
        if (cutVideoBottomBarViewModel10 == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel10.b().observe(this, new j(this));
        CutVideoViewModel cutVideoViewModel = this.f125759i;
        if (cutVideoViewModel == null) {
            h.f.b.l.a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.g()) {
            ImageView imageView = this.f125755e;
            if (imageView == null) {
                h.f.b.l.a("ivRotate");
            }
            boolean z = false;
            imageView.setVisibility(0);
            VideoEditViewModel videoEditViewModel = this.f125760j;
            if (videoEditViewModel == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            if (videoEditViewModel.n()) {
                VideoEditViewModel videoEditViewModel2 = this.f125760j;
                if (videoEditViewModel2 == null) {
                    h.f.b.l.a("videoEditViewModel");
                }
                VideoSegment videoSegment = videoEditViewModel2.k().get(0);
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel11 = this.f125758h;
                if (cutVideoBottomBarViewModel11 == null) {
                    h.f.b.l.a("bottomBarViewModel");
                }
                CutVideoViewModel cutVideoViewModel2 = this.f125759i;
                if (cutVideoViewModel2 == null) {
                    h.f.b.l.a("cutVideoViewModel");
                }
                if (cutVideoViewModel2.h() && com.ss.android.ugc.aweme.shortvideo.cut.o.a(videoSegment)) {
                    z = true;
                }
                cutVideoBottomBarViewModel11.a(z);
            }
        }
        ImageView imageView2 = this.f125757g;
        if (imageView2 == null) {
            h.f.b.l.a("ivDelete");
        }
        imageView2.setOnClickListener(new b(this));
        CheckableImageButton checkableImageButton = this.f125756f;
        if (checkableImageButton == null) {
            h.f.b.l.a("ivSpeed");
        }
        checkableImageButton.setOnClickListener(new c(this));
        ImageView imageView3 = this.f125755e;
        if (imageView3 == null) {
            h.f.b.l.a("ivRotate");
        }
        imageView3.setOnClickListener(new d(this));
    }

    static final class q implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f125782a;

        static {
            Covode.recordClassIndex(82618);
        }

        q(h.f.a.a aVar) {
            this.f125782a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f125782a.invoke();
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$e  reason: collision with other inner class name */
    static final class C3270e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(82606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3270e(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            ImageView c2 = e.c(this.this$0);
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c2.setVisibility(i2);
            return h.z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(82607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            e.a(this.this$0).setEnabled(booleanValue);
            return h.z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(82608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            e.b(this.this$0).setEnabled(booleanValue);
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(82609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            e.c(this.this$0).setEnabled(booleanValue);
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(82613);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            CheckableImageButton a2 = e.a(this.this$0);
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a2.setVisibility(i2);
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(82614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            e.a(this.this$0).setChecked(booleanValue);
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(82615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            ImageView b2 = e.b(this.this$0);
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            b2.setVisibility(i2);
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ase, viewGroup, false);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Float, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(82612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Float f2) {
            float floatValue = f2.floatValue();
            h.f.b.l.d(bVar, "");
            e eVar = this.this$0;
            TextView textView = eVar.f125754d;
            if (textView == null) {
                h.f.b.l.a("tvTime");
            }
            Activity t = eVar.t();
            h.f.b.l.b(t, "");
            bs bsVar = eVar.f125753c;
            if (bsVar == null) {
                h.f.b.l.a("previewEditCallback");
            }
            textView.setText(com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.d.a(t, floatValue, bsVar.L().d()));
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.ev0);
        h.f.b.l.b(c2, "");
        this.f125754d = (TextView) c2;
        View c3 = c(R.id.btg);
        h.f.b.l.b(c3, "");
        this.f125755e = (ImageView) c3;
        View c4 = c(R.id.bti);
        h.f.b.l.b(c4, "");
        this.f125756f = (CheckableImageButton) c4;
        View c5 = c(R.id.bt7);
        h.f.b.l.b(c5, "");
        this.f125757g = (ImageView) c5;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
