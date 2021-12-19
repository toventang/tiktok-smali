package com.airbnb.lottie.i;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a extends ValueAnimator {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f5676a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f5677b = new CopyOnWriteArraySet();

    static {
        Covode.recordClassIndex(2382);
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f5677b.clear();
    }

    public void removeAllUpdateListeners() {
        this.f5676a.clear();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        for (Animator.AnimatorListener animatorListener : this.f5677b) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        for (Animator.AnimatorListener animatorListener : this.f5677b) {
            animatorListener.onAnimationCancel(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f5676a) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f5677b.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f5676a.add(animatorUpdateListener);
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f5677b.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f5676a.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.ValueAnimator
    public ValueAnimator setDuration(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f5677b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    public final void b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f5677b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }
}
