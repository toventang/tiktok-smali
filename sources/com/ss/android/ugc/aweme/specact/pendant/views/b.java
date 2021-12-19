package com.ss.android.ugc.aweme.specact.pendant.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.pendant.OptimizedLottieAnimationView;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public final class b extends c {

    /* renamed from: m  reason: collision with root package name */
    public static final a f134359m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f134360a;

    /* renamed from: b  reason: collision with root package name */
    public View f134361b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f134362c;

    /* renamed from: d  reason: collision with root package name */
    public View f134363d;

    /* renamed from: e  reason: collision with root package name */
    public View f134364e;

    /* renamed from: f  reason: collision with root package name */
    public View f134365f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f134366g;

    /* renamed from: h  reason: collision with root package name */
    public View f134367h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.c.e.b f134368i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.c.b.a f134369j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.c.d.b f134370k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f134371l;
    private GradientDrawable p;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private final h.h t;

    public static final class e<T> implements com.airbnb.lottie.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OptimizedLottieAnimationView f134376a;

        static {
            Covode.recordClassIndex(87862);
        }

        public e(OptimizedLottieAnimationView optimizedLottieAnimationView) {
            this.f134376a = optimizedLottieAnimationView;
        }

        @Override // com.airbnb.lottie.i
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(87857);
    }

    private final View getPendantLayout() {
        return (View) this.t.getValue();
    }

    public final TextView getBonusTextView() {
        return (TextView) this.s.getValue();
    }

    public final OptimizedLottieAnimationView getLottieView() {
        return (OptimizedLottieAnimationView) this.r.getValue();
    }

    public final ProgressBarTimerView getProgressBarTimerView() {
        return (ProgressBarTimerView) this.q.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87858);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$b  reason: collision with other inner class name */
    static final class C3493b extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3493b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.findViewById(R.id.ue);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<OptimizedLottieAnimationView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ OptimizedLottieAnimationView invoke() {
            return this.this$0.findViewById(R.id.elf);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.d33);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<ProgressBarTimerView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProgressBarTimerView invoke() {
            return this.this$0.findViewById(R.id.dc4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f134371l;
        if (animator != null && animator.isStarted()) {
            animator.cancel();
        }
    }

    public final void a() {
        this.f134360a = 0;
        getProgressBarTimerView().a(0.0f);
    }

    public final void b() {
        getBonusTextView().setVisibility(8);
        getBonusTextView().setText("");
        getBonusTextView().setTranslationY(a(2.0f));
        getBonusTextView().setScaleY(1.0f);
        getBonusTextView().setScaleX(1.0f);
        getBonusTextView().setAlpha(1.0f);
    }

    public final Animator c() {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(getBonusTextView(), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", a(6.0f), a(5.0f))).setDuration(133L);
        h.f.b.l.b(duration, "");
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(getBonusTextView(), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.3f), PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.3f), PropertyValuesHolder.ofFloat("translationY", a(5.0f), a(7.0f))).setDuration(166L);
        h.f.b.l.b(duration2, "");
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(getBonusTextView(), "translationY", a(7.0f), a(-1.5f)).setDuration(800L);
        h.f.b.l.b(duration3, "");
        ObjectAnimator duration4 = ObjectAnimator.ofPropertyValuesHolder(getBonusTextView(), PropertyValuesHolder.ofFloat("scaleY", 1.3f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 1.3f, 1.0f)).setDuration(367L);
        h.f.b.l.b(duration4, "");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration3).with(duration4);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(getBonusTextView(), "alpha", 1.0f, 1.0f).setDuration(300L);
        h.f.b.l.b(duration5, "");
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(getBonusTextView(), "alpha", 1.0f, 0.0f).setDuration(133L);
        h.f.b.l.b(duration6, "");
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(duration, duration2, animatorSet, duration5, duration6);
        return animatorSet2;
    }

    public static final class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134377a;

        static {
            Covode.recordClassIndex(87865);
        }

        public h(b bVar) {
            this.f134377a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f134377a.f134371l = null;
        }
    }

    public static final class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f134378a = 0;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f134379b = 64;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f134380c = 0;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f134381d = 1;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f134382e = null;

        static {
            Covode.recordClassIndex(87866);
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.a.a aVar = this.f134382e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            h.f.a.a aVar = this.f134382e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class k extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134385a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f134386b;

        static {
            Covode.recordClassIndex(87868);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f134385a.b();
        }

        public final void onAnimationStart(Animator animator) {
            this.f134385a.getBonusTextView().setText(this.f134386b);
        }

        public k(b bVar, String str) {
            this.f134385a = bVar;
            this.f134386b = str;
        }
    }

    public static final class l extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134387a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f134388b;

        static {
            Covode.recordClassIndex(87869);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f134387a.b();
        }

        public final void onAnimationStart(Animator animator) {
            this.f134387a.getBonusTextView().setText(this.f134388b);
        }

        public l(b bVar, String str) {
            this.f134387a = bVar;
            this.f134388b = str;
        }
    }

    public static final class j extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134383a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f134384b;

        static {
            Covode.recordClassIndex(87867);
        }

        public final void onAnimationStart(Animator animator) {
            this.f134383a.getBonusTextView().setText(this.f134384b);
        }

        public j(b bVar, String str) {
            this.f134383a = bVar;
            this.f134384b = str;
        }
    }

    public final float a(float f2) {
        return com.bytedance.common.utility.n.b(getContext(), f2);
    }

    public final void setProgressForegroundColor(List<String> list) {
        h.f.b.l.d(list, "");
        getProgressBarTimerView().setProgressForegroundColor(list);
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134372a;

        static {
            Covode.recordClassIndex(87860);
        }

        public c(b bVar) {
            this.f134372a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.specact.pendant.c.e.b bVar = this.f134372a.f134368i;
            if (bVar != null) {
                bVar.a();
            }
            r.onEventV3("widget_bubble_close_click");
        }
    }

    public static final class d<T> implements com.airbnb.lottie.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OptimizedLottieAnimationView f134373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputStream f134374b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.specact.pendant.e.f f134375c;

        static {
            Covode.recordClassIndex(87861);
        }

        public d(OptimizedLottieAnimationView optimizedLottieAnimationView, InputStream inputStream, com.ss.android.ugc.aweme.specact.pendant.e.f fVar) {
            this.f134373a = optimizedLottieAnimationView;
            this.f134374b = inputStream;
            this.f134375c = fVar;
        }

        @Override // com.airbnb.lottie.i
        public final /* synthetic */ void a(Object obj) {
            com.airbnb.lottie.e eVar = (com.airbnb.lottie.e) obj;
            OptimizedLottieAnimationView optimizedLottieAnimationView = this.f134373a;
            h.f.b.l.b(eVar, "");
            optimizedLottieAnimationView.setComposition(eVar);
            com.ss.android.ugc.aweme.specact.pendant.e.f fVar = this.f134375c;
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    public static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134389a;

        static {
            Covode.recordClassIndex(87871);
        }

        public n(b bVar) {
            this.f134389a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.specact.pendant.c.d.b bVar = this.f134389a.f134370k;
            if (bVar != null) {
                bVar.a();
            }
            r.a("widget_bubble2_close_click", new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, "watch_video").f66730a);
        }
    }

    public static final class o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134390a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f134391b;

        static {
            Covode.recordClassIndex(87872);
        }

        public o(b bVar, int i2) {
            this.f134390a = bVar;
            this.f134391b = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ProgressBarTimerView progressBarTimerView = this.f134390a.getProgressBarTimerView();
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            progressBarTimerView.a(((Float) animatedValue).floatValue() / ((float) this.f134391b));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null)) {
            if (valueOf.intValue() == 0) {
                setAlpha(0.7f);
            } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                setAlpha(1.0f);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setProgressBackgroundColor(List<String> list) {
        h.f.b.l.d(list, "");
        try {
            this.p = a(Color.parseColor(list.get(0)), Color.parseColor(list.get(1)));
            getPendantLayout().setBackground(this.p);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        h.f.b.l.d(context, "");
        this.q = h.i.a((h.f.a.a) new m(this));
        this.r = h.i.a((h.f.a.a) new f(this));
        this.s = h.i.a((h.f.a.a) new C3493b(this));
        this.t = h.i.a((h.f.a.a) new g(this));
        Objects.requireNonNull(com.a.a(LayoutInflater.from(context), R.layout.b1h, this, true), "null cannot be cast to non-null type android.view.View");
        if (this.p == null) {
            int c2 = androidx.core.content.b.c(getContext(), R.color.c5);
            this.p = a(c2, c2);
            this.n = true;
        }
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    private static GradientDrawable a(int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(2);
        gradientDrawable.setShape(1);
        gradientDrawable.setColors(new int[]{i2, i3});
        return gradientDrawable;
    }
}
