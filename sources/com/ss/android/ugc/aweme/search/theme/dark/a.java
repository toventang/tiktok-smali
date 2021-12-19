package com.ss.android.ugc.aweme.search.theme.dark;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.theme.c;
import h.f.b.l;

public final class a extends ValueAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private c f121732a;

    /* renamed from: b  reason: collision with root package name */
    private final ThemeViewModel f121733b;

    static {
        Covode.recordClassIndex(79286);
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public a(ThemeViewModel themeViewModel) {
        l.d(themeViewModel, "");
        this.f121733b = themeViewModel;
    }

    public final void onAnimationEnd(Animator animator) {
        c.a aVar = new c.a(3);
        c cVar = this.f121732a;
        if (cVar != null) {
            c a2 = c.a(cVar, aVar);
            this.f121733b.b(a2);
            this.f121733b.c(a2);
        }
    }

    public final void onAnimationStart(Animator animator) {
        c.a aVar = new c.a(1);
        c cVar = this.f121732a;
        if (cVar != null) {
            this.f121733b.b(c.a(cVar, aVar));
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator != null) {
            c.a aVar = new c.a(2, Float.valueOf(valueAnimator.getAnimatedFraction()));
            c cVar = this.f121732a;
            if (cVar != null) {
                this.f121733b.b(c.a(cVar, aVar));
            }
        }
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "");
        if (!(!l.a(mainLooper.getThread(), Thread.currentThread())) && !l.a(this.f121732a, cVar)) {
            removeAllUpdateListeners();
            removeAllListeners();
            this.f121732a = cVar;
            addListener(this);
            addUpdateListener(this);
            start();
        }
    }
}
