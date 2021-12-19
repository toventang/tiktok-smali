package com.ss.android.ugc.aweme.sticker.panel.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.i;
import com.airbnb.lottie.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.sticker.panel.guide.h;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class k implements f {

    /* renamed from: k  reason: collision with root package name */
    public static final b f135169k = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Effect f135170a;

    /* renamed from: b  reason: collision with root package name */
    public final h f135171b;

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f135172c;

    /* renamed from: d  reason: collision with root package name */
    public View f135173d;

    /* renamed from: e  reason: collision with root package name */
    public LottieAnimationView f135174e;

    /* renamed from: f  reason: collision with root package name */
    public FrameLayout f135175f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f135176g;

    /* renamed from: h  reason: collision with root package name */
    public View f135177h;

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f135178i = new d(this);

    /* renamed from: j  reason: collision with root package name */
    public final Animation f135179j;

    /* renamed from: l  reason: collision with root package name */
    private final ExtraParams f135180l;

    /* renamed from: m  reason: collision with root package name */
    private m<com.airbnb.lottie.e> f135181m;
    private boolean n;
    private final i<com.airbnb.lottie.e> o;
    private final i<Throwable> p;

    static {
        Covode.recordClassIndex(88361);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(88363);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final boolean b() {
        return this.n;
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f135184a;

        static {
            Covode.recordClassIndex(88365);
        }

        d(k kVar) {
            this.f135184a = kVar;
        }

        public final void run() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new a(this));
            ofFloat.addListener(new b(this));
            ofFloat.start();
        }

        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f135186a;

            static {
                Covode.recordClassIndex(88367);
            }

            b(d dVar) {
                this.f135186a = dVar;
            }

            public final void onAnimationEnd(Animator animator) {
                this.f135186a.f135184a.a();
            }
        }

        static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f135185a;

            static {
                Covode.recordClassIndex(88366);
            }

            a(d dVar) {
                this.f135185a = dVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = this.f135185a.f135184a.f135173d;
                if (view != null) {
                    l.b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    view.setAlpha(((Float) animatedValue).floatValue());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a() {
        FrameLayout frameLayout;
        MethodCollector.i(11874);
        m<com.airbnb.lottie.e> mVar = this.f135181m;
        if (mVar != null) {
            mVar.b(this.o);
            i<Throwable> iVar = this.p;
            if (iVar != null) {
                mVar.d(iVar);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.airbnb.lottie.LottieListener<com.airbnb.lottie.LottieComposition>");
                MethodCollector.o(11874);
                throw nullPointerException;
            }
        }
        LottieAnimationView lottieAnimationView = this.f135174e;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        }
        FrameLayout frameLayout2 = this.f135172c;
        if (frameLayout2 != null) {
            frameLayout2.removeCallbacks(this.f135178i);
        }
        View view = this.f135173d;
        if (!(view == null || (frameLayout = this.f135172c) == null)) {
            frameLayout.removeView(view);
        }
        this.n = false;
        MethodCollector.o(11874);
    }

    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f135182a;

        static {
            Covode.recordClassIndex(88362);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        a(k kVar) {
            this.f135182a = kVar;
        }

        public final void onAnimationEnd(Animation animation) {
            FrameLayout frameLayout = this.f135182a.f135175f;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f135188a;

        static {
            Covode.recordClassIndex(88369);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(k kVar) {
            this.f135188a = kVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f135188a.f135178i.run();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f135187a;

        static {
            Covode.recordClassIndex(88368);
        }

        e(k kVar) {
            this.f135187a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f135187a.f135178i.run();
        }
    }

    static final class c<T> implements i<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f135183a;

        static {
            Covode.recordClassIndex(88364);
        }

        c(k kVar) {
            this.f135183a = kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.i
        public final /* synthetic */ void a(Throwable th) {
            FrameLayout frameLayout = this.f135183a.f135172c;
            if (frameLayout != null) {
                frameLayout.postDelayed(this.f135183a.f135178i, 5000);
            }
            h hVar = this.f135183a.f135171b;
            if (hVar != null) {
                hVar.a(false, this.f135183a.f135170a, h.a.LOTTIE);
            }
        }
    }

    static final class g<T> implements i<com.airbnb.lottie.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f135189a;

        static {
            Covode.recordClassIndex(88370);
        }

        g(k kVar) {
            this.f135189a = kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.i
        public final /* synthetic */ void a(com.airbnb.lottie.e eVar) {
            com.airbnb.lottie.e eVar2 = eVar;
            LottieAnimationView lottieAnimationView = this.f135189a.f135174e;
            if (lottieAnimationView != null) {
                lottieAnimationView.setComposition(eVar2);
            }
            FrameLayout frameLayout = this.f135189a.f135175f;
            if (frameLayout != null) {
                frameLayout.startAnimation(this.f135189a.f135179j);
            }
            FrameLayout frameLayout2 = this.f135189a.f135175f;
            if (frameLayout2 != null) {
                frameLayout2.postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.sticker.panel.guide.k.g.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ g f135190a;

                    static {
                        Covode.recordClassIndex(88371);
                    }

                    {
                        this.f135190a = r1;
                    }

                    public final void run() {
                        int i2;
                        View view = this.f135190a.f135189a.f135177h;
                        if (view != null) {
                            if (this.f135190a.f135189a.f135176g) {
                                i2 = 0;
                            } else {
                                i2 = 4;
                            }
                            view.setVisibility(i2);
                        }
                        LottieAnimationView lottieAnimationView = this.f135190a.f135189a.f135174e;
                        if (lottieAnimationView != null) {
                            lottieAnimationView.a();
                        }
                    }
                }, 300);
            }
            h hVar = this.f135189a.f135171b;
            if (hVar != null) {
                hVar.a(true, this.f135189a.f135170a, h.a.LOTTIE);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.guide.f
    public final void a(FrameLayout frameLayout) {
        ConstraintLayout constraintLayout;
        boolean z;
        String str;
        TextView textView;
        MethodCollector.i(11715);
        if (frameLayout == null) {
            MethodCollector.o(11715);
            return;
        }
        ExtraParams extraParams = this.f135180l;
        if (extraParams == null || !extraParams.isLottieValid()) {
            MethodCollector.o(11715);
            return;
        }
        this.f135172c = frameLayout;
        View a2 = com.a.a(LayoutInflater.from(frameLayout.getContext()), R.layout.ai4, frameLayout, false);
        this.f135173d = a2;
        frameLayout.addView(a2, 0);
        View view = this.f135173d;
        if (view == null) {
            l.b();
        }
        this.f135174e = (LottieAnimationView) view.findViewById(R.id.eb0);
        View view2 = this.f135173d;
        if (view2 == null) {
            l.b();
        }
        this.f135175f = (FrameLayout) view2.findViewById(R.id.bds);
        View view3 = this.f135173d;
        if (view3 == null) {
            l.b();
        }
        View findViewById = view3.findViewById(R.id.eb1);
        this.f135177h = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new e(this));
        }
        LottieAnimationView lottieAnimationView = this.f135174e;
        if (lottieAnimationView != null) {
            lottieAnimationView.setRepeatCount(1);
        }
        LottieAnimationView lottieAnimationView2 = this.f135174e;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.a(new f(this));
        }
        View view4 = this.f135173d;
        if (!(view4 == null || (textView = (TextView) view4.findViewById(R.id.ebc)) == null)) {
            String hint = this.f135170a.getHint();
            if (hint == null || hint.length() <= 0) {
                textView.setText("");
            } else {
                textView.startAnimation(com.ss.android.ugc.aweme.sticker.p.a.a(0.0f, 1.0f, 300));
                textView.setText(this.f135170a.getHint());
            }
        }
        View view5 = this.f135173d;
        ViewGroup.LayoutParams layoutParams = null;
        if (view5 != null) {
            constraintLayout = (ConstraintLayout) view5.findViewById(R.id.adx);
        } else {
            constraintLayout = null;
        }
        if (1 == this.f135180l.lottieType) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.a(constraintLayout);
            Context context = frameLayout.getContext();
            l.b(context, "");
            bVar.b(R.id.bds, (int) r.a(context, 240.0f));
            bVar.a(R.id.bds, "4:3");
            bVar.b(constraintLayout);
        }
        if (this.f135180l.manualClose == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f135176g = z;
        Context context2 = frameLayout.getContext();
        l.b(context2, "");
        int a3 = (int) r.a(context2, 264.0f);
        View view6 = this.f135173d;
        if (!(view6 == null || (layoutParams = view6.getLayoutParams()) == null)) {
            layoutParams.height = dh.e(frameLayout.getContext()) - a3;
        }
        View view7 = this.f135173d;
        if (view7 != null) {
            view7.setLayoutParams(layoutParams);
        }
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            if (layoutParams2 != null) {
                int e2 = dh.e(frameLayout.getContext()) - a3;
                Context context3 = frameLayout.getContext();
                l.b(context3, "");
                layoutParams2.height = e2 - ((int) r.a(context3, 112.0f));
            }
            if (constraintLayout != null) {
                constraintLayout.setLayoutParams(layoutParams2);
            }
        }
        UrlModel a4 = com.ss.android.ugc.aweme.effectplatform.a.a(this.f135170a.getHintFile());
        l.b(a4, "");
        List<String> urlList = a4.getUrlList();
        if (urlList == null || (str = urlList.get(0)) == null) {
            FrameLayout frameLayout2 = this.f135172c;
            if (frameLayout2 != null) {
                frameLayout2.postDelayed(this.f135178i, 5000);
            }
        } else {
            this.f135181m = com.airbnb.lottie.f.a(frameLayout.getContext(), str).a(this.o).c(this.p);
        }
        this.n = true;
        MethodCollector.o(11715);
    }

    public k(Effect effect, ExtraParams extraParams, h hVar) {
        l.d(effect, "");
        l.d(extraParams, "");
        this.f135170a = effect;
        this.f135180l = extraParams;
        this.f135171b = hVar;
        Animation a2 = com.ss.android.ugc.aweme.sticker.p.a.a(0.0f, 1.0f, 300);
        a2.setFillAfter(true);
        a2.setAnimationListener(new a(this));
        this.f135179j = a2;
        this.o = new g(this);
        this.p = new c(this);
    }
}
