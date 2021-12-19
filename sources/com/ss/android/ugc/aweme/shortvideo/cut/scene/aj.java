package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
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
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.p;
import h.z;
import java.util.Objects;

public final class aj extends com.ss.android.ugc.gamora.b.b implements com.bytedance.jedi.arch.b {
    public static final a t = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public bt f125593a;

    /* renamed from: b  reason: collision with root package name */
    public VECutVideoPresenter f125594b;

    /* renamed from: c  reason: collision with root package name */
    public SurfaceView f125595c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f125596d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f125597e;

    /* renamed from: f  reason: collision with root package name */
    public FrameLayout f125598f;

    /* renamed from: g  reason: collision with root package name */
    public VEVideoCutterViewModel f125599g;

    /* renamed from: h  reason: collision with root package name */
    public CutMultiVideoViewModel f125600h;

    /* renamed from: i  reason: collision with root package name */
    public VideoEditViewModel f125601i;

    /* renamed from: j  reason: collision with root package name */
    public CutVideoSpeedViewModel f125602j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f125603k = new Handler();

    /* renamed from: l  reason: collision with root package name */
    public final j f125604l = new j(this);
    private CutVideoViewModel u;
    private CutVideoPreviewViewModel v;
    private CutVideoMultiBottomViewModel w;

    static {
        Covode.recordClassIndex(82475);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82476);
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

    public final int C() {
        SurfaceView surfaceView = this.f125595c;
        if (surfaceView == null) {
            l.a("videoSurface");
        }
        return surfaceView.getMeasuredHeight();
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        this.f125603k.removeCallbacks(this.f125604l);
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f125607a;

        static {
            Covode.recordClassIndex(82484);
        }

        h(aj ajVar) {
            this.f125607a = ajVar;
        }

        public final void run() {
            CutVideoSpeedViewModel a2 = aj.a(this.f125607a);
            aj ajVar = this.f125607a;
            a2.b(ajVar.d(ajVar.D()));
        }
    }

    public final int D() {
        FrameLayout frameLayout = this.f125597e;
        if (frameLayout == null) {
            l.a("videoLayout");
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    public final SurfaceView b() {
        SurfaceView surfaceView = this.f125595c;
        if (surfaceView == null) {
            l.a("videoSurface");
        }
        return surfaceView;
    }

    public final int d() {
        SurfaceView surfaceView = this.f125595c;
        if (surfaceView == null) {
            l.a("videoSurface");
        }
        return surfaceView.getMeasuredWidth();
    }

    public final VECutVideoPresenter a() {
        VECutVideoPresenter vECutVideoPresenter = this.f125594b;
        if (vECutVideoPresenter == null) {
            l.a("presenter");
        }
        return vECutVideoPresenter;
    }

    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f125609a;

        static {
            Covode.recordClassIndex(82486);
        }

        public final void run() {
            com.ss.android.ugc.aweme.shortvideo.cut.j jVar = this.f125609a.a().f125351f;
            if (jVar != null) {
                long a2 = jVar.a();
                if (a2 > 0) {
                    CutMultiVideoViewModel cutMultiVideoViewModel = this.f125609a.f125600h;
                    if (cutMultiVideoViewModel == null) {
                        l.a("cutMultiVideoViewModel");
                    }
                    cutMultiVideoViewModel.a(a2, aj.e(this.f125609a).j(), aj.e(this.f125609a).l());
                }
            }
            this.f125609a.f125603k.postDelayed(this, 30);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(aj ajVar) {
            this.f125609a = ajVar;
        }
    }

    public final void a(VECutVideoPresenter vECutVideoPresenter) {
        l.d(vECutVideoPresenter, "");
        this.f125594b = vECutVideoPresenter;
    }

    public static final /* synthetic */ CutVideoSpeedViewModel a(aj ajVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = ajVar.f125602j;
        if (cutVideoSpeedViewModel == null) {
            l.a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    public static final /* synthetic */ ImageView b(aj ajVar) {
        ImageView imageView = ajVar.f125596d;
        if (imageView == null) {
            l.a("ivPlay");
        }
        return imageView;
    }

    public static final /* synthetic */ FrameLayout c(aj ajVar) {
        FrameLayout frameLayout = ajVar.f125598f;
        if (frameLayout == null) {
            l.a("videoControlLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ FrameLayout d(aj ajVar) {
        FrameLayout frameLayout = ajVar.f125597e;
        if (frameLayout == null) {
            l.a("videoLayout");
        }
        return frameLayout;
    }

    public static final /* synthetic */ VideoEditViewModel e(aj ajVar) {
        VideoEditViewModel videoEditViewModel = ajVar.f125601i;
        if (videoEditViewModel == null) {
            l.a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f125608a;

        static {
            Covode.recordClassIndex(82485);
        }

        i(aj ajVar) {
            this.f125608a = ajVar;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a aVar;
            ClickAgent.onClick(view);
            VEVideoCutterViewModel vEVideoCutterViewModel = this.f125608a.f125599g;
            if (vEVideoCutterViewModel == null) {
                l.a("veVideoCutterViewModel");
            }
            if (this.f125608a.a().b()) {
                aVar = new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2);
            } else {
                aVar = new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1);
            }
            vEVideoCutterViewModel.a(aVar);
        }
    }

    public final float d(int i2) {
        FrameLayout frameLayout = this.f125597e;
        if (frameLayout == null) {
            l.a("videoLayout");
        }
        Context context = frameLayout.getContext();
        l.b(context, "");
        return (float) (((i2 - ((int) com.ss.android.ugc.aweme.editSticker.a.d.a(context, 32.0f))) / 2) + context.getResources().getDimensionPixelSize(R.dimen.qt));
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f125605a;

        static {
            Covode.recordClassIndex(82477);
        }

        b(aj ajVar) {
            this.f125605a = ajVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a aVar = (com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a) obj;
            if (aVar != null && (valueOf = Integer.valueOf(aVar.f126290d)) != null) {
                if (valueOf.intValue() == 1) {
                    if (this.f125605a.a().b()) {
                        aj.b(this.f125605a).setVisibility(8);
                        this.f125605a.f125603k.post(this.f125605a.f125604l);
                    }
                } else if (valueOf.intValue() == 2) {
                    if (aVar.f126291e) {
                        aj.b(this.f125605a).setVisibility(0);
                    }
                    this.f125605a.f125603k.removeCallbacks(this.f125605a.f125604l);
                } else if (valueOf.intValue() == 3) {
                    this.f125605a.f125603k.removeCallbacks(this.f125605a.f125604l);
                }
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(CutMultiVideoViewModel.class);
        l.b(a2, "");
        this.f125600h = (CutMultiVideoViewModel) a2;
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a3 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity2, (ad.b) null).a(VideoEditViewModel.class);
        l.b(a3, "");
        this.f125601i = (VideoEditViewModel) a3;
        Activity activity3 = this.f42913m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ac a4 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity3, (ad.b) null).a(VEVideoCutterViewModel.class);
        l.b(a4, "");
        this.f125599g = (VEVideoCutterViewModel) a4;
        Activity activity4 = this.f42913m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = t.a((androidx.fragment.app.e) activity4).a(CutVideoPreviewViewModel.class);
        l.b(a5, "");
        this.v = (CutVideoPreviewViewModel) a5;
        Activity activity5 = this.f42913m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = t.a((androidx.fragment.app.e) activity5).a(CutVideoMultiBottomViewModel.class);
        l.b(a6, "");
        this.w = (CutVideoMultiBottomViewModel) a6;
        Activity activity6 = this.f42913m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = t.a((androidx.fragment.app.e) activity6).a(CutVideoSpeedViewModel.class);
        l.b(a7, "");
        this.f125602j = (CutVideoSpeedViewModel) a7;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f125599g;
        if (vEVideoCutterViewModel == null) {
            l.a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.a().observe(this, new b(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel = this.v;
        if (cutVideoPreviewViewModel == null) {
            l.a("previewViewModel");
        }
        b.a.b(this, cutVideoPreviewViewModel, al.f125611a, new d(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.v;
        if (cutVideoPreviewViewModel2 == null) {
            l.a("previewViewModel");
        }
        selectNonNullSubscribe(cutVideoPreviewViewModel2, am.f125612a, new ah(), new e(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel3 = this.v;
        if (cutVideoPreviewViewModel3 == null) {
            l.a("previewViewModel");
        }
        b.a.b(this, cutVideoPreviewViewModel3, an.f125613a, new f(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel4 = this.v;
        if (cutVideoPreviewViewModel4 == null) {
            l.a("previewViewModel");
        }
        b.a.b(this, cutVideoPreviewViewModel4, ao.f125614a, new g(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel5 = this.v;
        if (cutVideoPreviewViewModel5 == null) {
            l.a("previewViewModel");
        }
        b.a.b(this, cutVideoPreviewViewModel5, ak.f125610a, new c(this));
        CutVideoViewModel cutVideoViewModel = this.u;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.g()) {
            VideoEditViewModel videoEditViewModel = this.f125601i;
            if (videoEditViewModel == null) {
                l.a("videoEditViewModel");
            }
            if (videoEditViewModel.n()) {
                VideoEditViewModel videoEditViewModel2 = this.f125601i;
                if (videoEditViewModel2 == null) {
                    l.a("videoEditViewModel");
                }
                VideoSegment videoSegment = videoEditViewModel2.k().get(0);
                int min = Math.min(videoSegment.f125482f, videoSegment.f125483g);
                int max = Math.max(videoSegment.f125482f, videoSegment.f125483g);
                com.ss.android.ugc.aweme.adaptation.a aVar = com.ss.android.ugc.aweme.adaptation.a.f66177a;
                SurfaceView surfaceView = this.f125595c;
                if (surfaceView == null) {
                    l.a("videoSurface");
                }
                aVar.a(surfaceView, min, max);
            }
        } else {
            CutVideoViewModel cutVideoViewModel2 = this.u;
            if (cutVideoViewModel2 == null) {
                l.a("cutVideoViewModel");
            }
            if (cutVideoViewModel2.i()) {
                FrameLayout frameLayout = this.f125598f;
                if (frameLayout == null) {
                    l.a("videoControlLayout");
                }
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin += dh.c(this.f42913m);
                FrameLayout frameLayout2 = this.f125598f;
                if (frameLayout2 == null) {
                    l.a("videoControlLayout");
                }
                frameLayout2.setLayoutParams(layoutParams2);
                FrameLayout frameLayout3 = this.f125597e;
                if (frameLayout3 == null) {
                    l.a("videoLayout");
                }
                ViewGroup.LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin += dh.c(this.f42913m);
                FrameLayout frameLayout4 = this.f125597e;
                if (frameLayout4 == null) {
                    l.a("videoLayout");
                }
                frameLayout4.setLayoutParams(layoutParams4);
            }
            FrameLayout frameLayout5 = this.f125597e;
            if (frameLayout5 == null) {
                l.a("videoLayout");
            }
            frameLayout5.post(new h(this));
        }
        SurfaceView surfaceView2 = this.f125595c;
        if (surfaceView2 == null) {
            l.a("videoSurface");
        }
        surfaceView2.setOnClickListener(new i(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(82478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(aj ajVar) {
            super(2);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            l.d(bVar, "");
            l.d(zVar, "");
            aj.c(this.this$0).post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.cut.scene.aj.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f125606a;

                static {
                    Covode.recordClassIndex(82479);
                }

                {
                    this.f125606a = r1;
                }

                public final void run() {
                    float width = (float) aj.d(this.f125606a.this$0).getWidth();
                    float height = (float) aj.d(this.f125606a.this$0).getHeight();
                    float height2 = (float) aj.c(this.f125606a.this$0).getHeight();
                    bt btVar = this.f125606a.this$0.f125593a;
                    if (btVar != null) {
                        btVar.a(width, height, height2);
                    }
                }
            });
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(82481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(aj ajVar) {
            super(2);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            this.this$0.b().setEnabled(booleanValue);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.asm, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(82480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(aj ajVar) {
            super(2);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            l.d(bVar, "");
            l.d(zVar, "");
            this.this$0.f125603k.removeCallbacks(this.this$0.f125604l);
            this.this$0.f125603k.post(this.this$0.f125604l);
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, p<? extends Integer, ? extends Integer>, z> {
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(82482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(aj ajVar) {
            super(2);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, p<? extends Integer, ? extends Integer> pVar) {
            p<? extends Integer, ? extends Integer> pVar2 = pVar;
            l.d(bVar, "");
            l.d(pVar2, "");
            com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.this$0.b(), ((Number) pVar2.getFirst()).intValue(), ((Number) pVar2.getSecond()).intValue());
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(82483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(aj ajVar) {
            super(2);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            l.d(bVar, "");
            ViewGroup.LayoutParams layoutParams = aj.c(this.this$0).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin += intValue;
            aj.c(this.this$0).setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = aj.d(this.this$0).getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.bottomMargin += intValue;
            aj.d(this.this$0).setLayoutParams(layoutParams4);
            CutVideoSpeedViewModel a2 = aj.a(this.this$0);
            aj ajVar = this.this$0;
            a2.b(ajVar.d(ajVar.D()));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.ffd);
        l.b(c2, "");
        this.f125595c = (SurfaceView) c2;
        View c3 = c(R.id.bta);
        l.b(c3, "");
        this.f125596d = (ImageView) c3;
        View c4 = c(R.id.fgj);
        l.b(c4, "");
        this.f125597e = (FrameLayout) c4;
        View c5 = c(R.id.ffr);
        l.b(c5, "");
        this.f125598f = (FrameLayout) c5;
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(CutVideoViewModel.class);
        l.b(a2, "");
        CutVideoViewModel cutVideoViewModel = (CutVideoViewModel) a2;
        this.u = cutVideoViewModel;
        if (cutVideoViewModel == null) {
            l.a("cutVideoViewModel");
        }
        if (cutVideoViewModel.g()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity t2 = t();
            l.b(t2, "");
            marginLayoutParams.topMargin = (int) com.ss.android.ugc.aweme.editSticker.a.d.a(t2, 56.0f);
            CutVideoViewModel cutVideoViewModel2 = this.u;
            if (cutVideoViewModel2 == null) {
                l.a("cutVideoViewModel");
            }
            if (cutVideoViewModel2.i()) {
                marginLayoutParams.bottomMargin = t().getResources().getDimensionPixelSize(R.dimen.sy);
            } else {
                marginLayoutParams.topMargin += dh.c(this.f42913m);
                Activity t3 = t();
                l.b(t3, "");
                marginLayoutParams.bottomMargin = (int) com.ss.android.ugc.aweme.editSticker.a.d.a(t3, 270.0f);
            }
            view.setLayoutParams(marginLayoutParams);
        }
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
