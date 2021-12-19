package com.ss.android.ugc.aweme.ftc.pages;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.core.h.v;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.tools.draft.ftc.util.FTCPreviewSurfaceView;
import com.zhiliaoapp.musically.R;
import dmt.av.video.z;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public final class FTCVideoPublishPreviewActivity extends com.ss.android.ugc.aweme.adaptation.b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f98823d = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private static final String f98824h = FTCVideoPublishPreviewActivity.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private VideoPublishEditModel f98825e;

    /* renamed from: f  reason: collision with root package name */
    private z f98826f;

    /* renamed from: g  reason: collision with root package name */
    private n f98827g = new n(this);

    /* renamed from: i  reason: collision with root package name */
    private HashMap f98828i;

    @Override // com.ss.android.ugc.aweme.adaptation.b
    public final View d_(int i2) {
        if (this.f98828i == null) {
            this.f98828i = new HashMap();
        }
        View view = (View) this.f98828i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f98828i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.adaptation.b
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62836);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f98827g;
    }

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        super.onBackPressed();
        g();
    }

    static {
        Covode.recordClassIndex(62835);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        this.f98827g.a(i.b.DESTROYED);
        z zVar = this.f98826f;
        if (zVar == null) {
            l.a("mPresenter");
        }
        zVar.b();
        super.onDestroy();
        com.ss.android.ugc.tools.d.a.c.a(this);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public final void g() {
        if (Build.VERSION.SDK_INT >= 21) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.0f);
            ofFloat.addUpdateListener(new b(this));
            ofFloat.addListener(new c(this));
            l.b(ofFloat, "");
            ofFloat.setDuration(100L);
            ofFloat.start();
            ((ImageView) d_(R.id.btb)).bringToFront();
            ((ImageView) d_(R.id.btb)).setAlpha(1.0f);
            ((ImageView) d_(R.id.btb)).setVisibility(0);
            finishAfterTransition();
            return;
        }
        finish();
    }

    public static final class d extends com.ss.android.ugc.aweme.da.a {

        /* renamed from: a  reason: collision with root package name */
        public final ValueAnimator f98831a = ValueAnimator.ofFloat(0.0f, 1.0f);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FTCVideoPublishPreviewActivity f98832b;

        static {
            Covode.recordClassIndex(62839);
        }

        public static final class b implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f98834a;

            static {
                Covode.recordClassIndex(62841);
            }

            public final void onAnimationCancel(Animator animator) {
                l.d(animator, "");
            }

            public final void onAnimationRepeat(Animator animator) {
                l.d(animator, "");
            }

            public final void onAnimationStart(Animator animator) {
                l.d(animator, "");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            b(d dVar) {
                this.f98834a = dVar;
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                ((ImageView) this.f98834a.f98832b.d_(R.id.btb)).setVisibility(8);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(FTCVideoPublishPreviewActivity fTCVideoPublishPreviewActivity) {
            this.f98832b = fTCVideoPublishPreviewActivity;
        }

        static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f98833a;

            static {
                Covode.recordClassIndex(62840);
            }

            a(d dVar) {
                this.f98833a = dVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.d(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                ((ImageView) this.f98833a.f98832b.d_(R.id.btb)).setAlpha(((Float) animatedValue).floatValue());
            }
        }

        @Override // com.ss.android.ugc.aweme.da.a
        public final void onTransitionEnd(Transition transition) {
            l.d(transition, "");
            ((FTCPreviewSurfaceView) this.f98832b.d_(R.id.d8k)).bringToFront();
            ((FTCPreviewSurfaceView) this.f98832b.d_(R.id.d8k)).setVisibility(0);
            this.f98831a.end();
        }

        @Override // com.ss.android.ugc.aweme.da.a
        public final void onTransitionStart(Transition transition) {
            l.d(transition, "");
            this.f98831a.addUpdateListener(new a(this));
            this.f98831a.addListener(new b(this));
            ValueAnimator valueAnimator = this.f98831a;
            l.b(valueAnimator, "");
            valueAnimator.setDuration(300L);
            this.f98831a.start();
        }
    }

    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCVideoPublishPreviewActivity f98830a;

        static {
            Covode.recordClassIndex(62838);
        }

        public final void onAnimationCancel(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(FTCVideoPublishPreviewActivity fTCVideoPublishPreviewActivity) {
            this.f98830a = fTCVideoPublishPreviewActivity;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            ((FTCPreviewSurfaceView) this.f98830a.d_(R.id.d8k)).setVisibility(4);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCVideoPublishPreviewActivity f98835a;

        static {
            Covode.recordClassIndex(62842);
        }

        e(FTCVideoPublishPreviewActivity fTCVideoPublishPreviewActivity) {
            this.f98835a = fTCVideoPublishPreviewActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f98835a.g();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        getIntent();
        com.ss.android.ugc.tools.d.a.c.a(this, bundle);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCVideoPublishPreviewActivity f98829a;

        static {
            Covode.recordClassIndex(62837);
        }

        b(FTCVideoPublishPreviewActivity fTCVideoPublishPreviewActivity) {
            this.f98829a = fTCVideoPublishPreviewActivity;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            ((FTCPreviewSurfaceView) this.f98829a.d_(R.id.d8k)).setAlpha(((Float) animatedValue).floatValue());
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.ss.android.ugc.aweme.adaptation.b
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.bc);
        com.ss.android.ugc.tools.d.a.c.a(this, getIntent(), bundle);
        g.a().u();
        Bitmap bitmap = VideoCoverBitmapHolder.f131084a;
        if (bitmap != null) {
            ((ImageView) d_(R.id.btb)).setImageBitmap(bitmap);
        }
        v.a(d_(R.id.btb), "transition_view_v1");
        v.a(d_(R.id.dx6), "transition_view_v2");
        FTCPreviewSurfaceView fTCPreviewSurfaceView = (FTCPreviewSurfaceView) d_(R.id.d8k);
        l.b(fTCPreviewSurfaceView, "");
        fTCPreviewSurfaceView.setVisibility(4);
        ((FTCPreviewSurfaceView) d_(R.id.d8k)).setOnClickListener(new e(this));
        Serializable serializableExtra = getIntent().getSerializableExtra("args");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        this.f98825e = (VideoPublishEditModel) serializableExtra;
        VideoPublishEditModel videoPublishEditModel = this.f98825e;
        if (videoPublishEditModel == null) {
            l.a("mModel");
        }
        this.f98826f = new z(videoPublishEditModel.videoEditorType, f98824h);
        this.f98827g.a(i.b.STARTED);
        FTCPreviewSurfaceView fTCPreviewSurfaceView2 = (FTCPreviewSurfaceView) d_(R.id.d8k);
        l.b(fTCPreviewSurfaceView2, "");
        z zVar = this.f98826f;
        if (zVar == null) {
            l.a("mPresenter");
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f98825e;
        if (videoPublishEditModel2 == null) {
            l.a("mModel");
        }
        com.ss.android.ugc.aweme.tools.draft.ftc.util.g.a(this, this, fTCPreviewSurfaceView2, zVar, videoPublishEditModel2);
        com.ss.android.ugc.aweme.adaptation.a aVar = com.ss.android.ugc.aweme.adaptation.a.f66177a;
        View d_ = d_(R.id.d8k);
        VideoPublishEditModel videoPublishEditModel3 = this.f98825e;
        if (videoPublishEditModel3 == null) {
            l.a("mModel");
        }
        int intValue = com.ss.android.ugc.aweme.tools.draft.ftc.util.g.a(videoPublishEditModel3).getFirst().intValue();
        VideoPublishEditModel videoPublishEditModel4 = this.f98825e;
        if (videoPublishEditModel4 == null) {
            l.a("mModel");
        }
        aVar.a(d_, intValue, com.ss.android.ugc.aweme.tools.draft.ftc.util.g.a(videoPublishEditModel4).getSecond().intValue());
        com.ss.android.ugc.aweme.adaptation.a aVar2 = com.ss.android.ugc.aweme.adaptation.a.f66177a;
        View d_2 = d_(R.id.btb);
        VideoPublishEditModel videoPublishEditModel5 = this.f98825e;
        if (videoPublishEditModel5 == null) {
            l.a("mModel");
        }
        int intValue2 = com.ss.android.ugc.aweme.tools.draft.ftc.util.g.a(videoPublishEditModel5).getFirst().intValue();
        VideoPublishEditModel videoPublishEditModel6 = this.f98825e;
        if (videoPublishEditModel6 == null) {
            l.a("mModel");
        }
        aVar2.a(d_2, intValue2, com.ss.android.ugc.aweme.tools.draft.ftc.util.g.a(videoPublishEditModel6).getSecond().intValue());
        if (Build.VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            Window window = getWindow();
            l.b(window, "");
            window.setSharedElementEnterTransition(autoTransition);
            Window window2 = getWindow();
            l.b(window2, "");
            window2.setSharedElementExitTransition(autoTransition);
            autoTransition.addListener((Transition.TransitionListener) new d(this));
            AutoTransition autoTransition2 = new AutoTransition();
            Window window3 = getWindow();
            l.b(window3, "");
            window3.setReturnTransition(autoTransition2);
        } else {
            FTCPreviewSurfaceView fTCPreviewSurfaceView3 = (FTCPreviewSurfaceView) d_(R.id.d8k);
            l.b(fTCPreviewSurfaceView3, "");
            fTCPreviewSurfaceView3.setVisibility(0);
            ((FTCPreviewSurfaceView) d_(R.id.d8k)).bringToFront();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onCreate", false);
    }
}
