package com.ss.android.ugc.aweme.shortvideo.duet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class f implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    final LottieAnimationView f126518a;

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f126519b;

    /* renamed from: c  reason: collision with root package name */
    final long f126520c;

    /* renamed from: d  reason: collision with root package name */
    final float f126521d;

    /* renamed from: e  reason: collision with root package name */
    final long f126522e;

    /* renamed from: f  reason: collision with root package name */
    final long f126523f;

    /* renamed from: g  reason: collision with root package name */
    public float f126524g;

    /* renamed from: h  reason: collision with root package name */
    public m<? super Float, ? super Float, z> f126525h;

    /* renamed from: i  reason: collision with root package name */
    public h.f.a.a<z> f126526i;

    /* renamed from: j  reason: collision with root package name */
    final ViewGroup f126527j;

    /* renamed from: k  reason: collision with root package name */
    final a f126528k;

    /* renamed from: l  reason: collision with root package name */
    private final long f126529l;

    public enum a {
        UP_DOWN,
        THREE_SCREEN,
        NONE;

        static {
            Covode.recordClassIndex(82993);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$f  reason: collision with other inner class name */
    final /* synthetic */ class RunnableC3288f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f126534a;

        static {
            Covode.recordClassIndex(82998);
        }

        RunnableC3288f(h.f.a.a aVar) {
            this.f126534a = aVar;
        }

        public final /* synthetic */ void run() {
            l.b(this.f126534a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(82992);
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f126533a;

        static {
            Covode.recordClassIndex(82997);
        }

        e(f fVar) {
            this.f126533a = fVar;
        }

        public final void run() {
            ValueAnimator valueAnimator = this.f126533a.f126519b;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f126535a;

        static {
            Covode.recordClassIndex(82999);
        }

        g(f fVar) {
            this.f126535a = fVar;
        }

        public final void run() {
            ValueAnimator valueAnimator = this.f126535a.f126519b;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    static final /* synthetic */ class h extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(83000);
        }

        h(f fVar) {
            super(0, fVar, f.class, "startAnimation", "startAnimation()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            f fVar = (f) this.receiver;
            fVar.f126518a.a();
            fVar.f126518a.setVisibility(0);
            fVar.f126518a.postDelayed(new g(fVar), fVar.f126522e);
            return z.f158842a;
        }
    }

    private final void b() {
        int i2 = g.f126538b[this.f126528k.ordinal()];
        if (i2 == 1) {
            j.a();
        } else if (i2 == 2) {
            j.b();
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f126519b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        this.f126518a.c();
        this.f126518a.d();
        this.f126518a.setVisibility(8);
        b();
    }

    static final /* synthetic */ class d extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(82996);
        }

        d(f fVar) {
            super(0, fVar, f.class, "restartAnimation", "restartAnimation()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            f fVar = (f) this.receiver;
            fVar.f126518a.b();
            fVar.f126518a.setTranslationY(fVar.f126524g);
            m<? super Float, ? super Float, z> mVar = fVar.f126525h;
            if (mVar != null) {
                mVar.invoke(Float.valueOf(fVar.f126524g), Float.valueOf(0.0f));
            }
            fVar.f126518a.postDelayed(new e(fVar), fVar.f126522e);
            return z.f158842a;
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f126532a;

        static {
            Covode.recordClassIndex(82995);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(f fVar) {
            this.f126532a = fVar;
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.a.a<z> aVar = this.f126532a.f126526i;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f126531a;

        static {
            Covode.recordClassIndex(82994);
        }

        b(f fVar) {
            this.f126531a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                f fVar = this.f126531a;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                fVar.f126518a.setAlpha(((Float) animatedValue).floatValue());
            }
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f126518a.e();
        this.f126518a.postDelayed(new RunnableC3288f(new d(this)), this.f126523f);
    }

    static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f126536a;

        static {
            Covode.recordClassIndex(83001);
        }

        i(f fVar) {
            this.f126536a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                m<? super Float, ? super Float, z> mVar = this.f126536a.f126525h;
                if (mVar != null) {
                    Float valueOf = Float.valueOf(this.f126536a.f126524g);
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    mVar.invoke(valueOf, animatedValue);
                }
                f fVar = this.f126536a;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                fVar.f126518a.setTranslationY(((Float) animatedValue2).floatValue() + this.f126536a.f126524g);
            }
        }
    }

    public final void onAnimationEnd(Animator animator) {
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(this.f126529l);
        duration.removeAllUpdateListeners();
        duration.addUpdateListener(new b(this));
        duration.addListener(new c(this));
        duration.start();
        b();
    }

    public f(ViewGroup viewGroup, a aVar) {
        l.d(viewGroup, "");
        l.d(aVar, "");
        MethodCollector.i(11057);
        this.f126527j = viewGroup;
        this.f126528k = aVar;
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b4b, viewGroup, false);
        if (a2 != null) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) a2;
            this.f126518a = lottieAnimationView;
            this.f126520c = 880;
            this.f126522e = 680;
            this.f126529l = 520;
            this.f126523f = 300;
            viewGroup.addView(lottieAnimationView);
            this.f126521d = (float) com.ss.android.ugc.aweme.adaptation.a.f66177a.b(com.ss.android.ugc.aweme.adaptation.a.c());
            MethodCollector.o(11057);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        MethodCollector.o(11057);
        throw nullPointerException;
    }
}
