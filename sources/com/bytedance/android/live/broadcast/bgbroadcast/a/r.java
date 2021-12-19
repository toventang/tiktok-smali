package com.bytedance.android.live.broadcast.bgbroadcast.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.s.g;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class r extends g {

    /* renamed from: a  reason: collision with root package name */
    final int f7711a;

    /* renamed from: b  reason: collision with root package name */
    public int f7712b;

    /* renamed from: c  reason: collision with root package name */
    public int f7713c = ((int) i.a.a.a.a.b.a(2.0f));

    /* renamed from: d  reason: collision with root package name */
    public boolean f7714d;

    /* renamed from: i  reason: collision with root package name */
    private final int f7715i;

    /* renamed from: j  reason: collision with root package name */
    private final int f7716j;

    /* renamed from: k  reason: collision with root package name */
    private final int f7717k;

    /* renamed from: l  reason: collision with root package name */
    private Animator f7718l;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f7719m;

    static {
        Covode.recordClassIndex(3806);
    }

    public final int a() {
        return this.f7713c - this.f7712b;
    }

    public final void b() {
        if (this.f21113g >= (-this.f7715i) - this.f7712b) {
            com.bytedance.android.live.core.c.a.a(3, "TrayView", "slideOut, current x = " + this.f21113g);
            a(this, this.f21113g, (-this.f7715i) - this.f7712b, false);
            return;
        }
        com.bytedance.android.live.core.c.a.a(3, "TrayView", "slideOut failed, current x = " + this.f21113g + ',' + " -width - safeInsetTop = " + ((-this.f7715i) - this.f7712b));
    }

    public final void c() {
        if (this.f21113g < 0 - this.f7712b) {
            com.bytedance.android.live.core.c.a.a(3, "TrayView", "slideIn, current x = " + this.f21113g);
            a(this, this.f21113g, 0 - this.f7712b, true);
            return;
        }
        com.bytedance.android.live.core.c.a.a(3, "TrayView", "slideIn failed, current x = " + this.f21113g + ',' + " ORIGIN_X - safeInsetTop = " + (0 - this.f7712b));
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f7721a;

        static {
            Covode.recordClassIndex(3808);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(r rVar) {
            this.f7721a = rVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f7721a.f7714d = false;
        }

        public final void onAnimationStart(Animator animator) {
            this.f7721a.f7714d = true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.s.a f7720a;

        static {
            Covode.recordClassIndex(3807);
        }

        a(com.bytedance.android.livesdk.s.a aVar) {
            this.f7720a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            this.f7720a.a(((Integer) animatedValue).intValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.s.a f7722a;

        static {
            Covode.recordClassIndex(3809);
        }

        c(com.bytedance.android.livesdk.s.a aVar) {
            this.f7722a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View d2 = this.f7722a.d();
            l.b(d2, "");
            d2.setAlpha(floatValue);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context, View view) {
        super(context);
        l.d(context, "");
        l.d(view, "");
        int a2 = y.a(40.0f);
        this.f7715i = a2;
        this.f7711a = a2;
        int i2 = -a2;
        this.f7716j = i2;
        this.f7717k = a2;
        this.f21112f = view;
        b(a2, a2);
        a(8388659, i2, a2);
        e();
    }

    private final void a(com.bytedance.android.livesdk.s.a aVar, int i2, int i3, boolean z) {
        ValueAnimator ofFloat;
        if (this.f7714d) {
            if (l.a(this.f7719m, Boolean.valueOf(z))) {
                com.bytedance.android.live.core.c.a.a(3, "TrayView", "Same isSlidingIn = " + z + ", returning...");
                return;
            }
            Animator animator = this.f7718l;
            if (animator != null) {
                animator.cancel();
            }
            com.bytedance.android.live.core.c.a.a(3, "TrayView", "isSlidingIn changed, animator are canceled.");
        }
        this.f7719m = Boolean.valueOf(z);
        com.bytedance.android.live.core.c.a.a(3, "TrayView", "New isSlidingIn = " + z + ", animator are created.");
        ValueAnimator ofInt = ObjectAnimator.ofInt(i2, i3);
        l.b(ofInt, "");
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new a(aVar));
        ofInt.addListener(new b(this));
        if (z) {
            ofFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(1.0f, 0.0f);
        }
        l.b(ofFloat, "");
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new c(aVar));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
        this.f7718l = animatorSet;
    }
}
