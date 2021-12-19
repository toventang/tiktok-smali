package com.google.android.material.a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public long f52140a;

    /* renamed from: b  reason: collision with root package name */
    public long f52141b = 300;

    /* renamed from: c  reason: collision with root package name */
    public int f52142c;

    /* renamed from: d  reason: collision with root package name */
    public int f52143d = 1;

    /* renamed from: e  reason: collision with root package name */
    private TimeInterpolator f52144e;

    static {
        Covode.recordClassIndex(32418);
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f52144e;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return a.f52127b;
    }

    public final int hashCode() {
        long j2 = this.f52140a;
        long j3 = this.f52141b;
        return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + a().getClass().hashCode()) * 31) + this.f52142c) * 31) + this.f52143d;
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f52140a + " duration: " + this.f52141b + " interpolator: " + a().getClass() + " repeatCount: " + this.f52142c + " repeatMode: " + this.f52143d + "}\n";
    }

    public i(long j2) {
        this.f52140a = j2;
        this.f52141b = 150;
    }

    static i a(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        iVar.f52142c = valueAnimator.getRepeatCount();
        iVar.f52143d = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f52127b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f52128c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return a.f52129d;
        }
        return interpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f52140a);
        animator.setDuration(this.f52141b);
        animator.setInterpolator(a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f52142c);
            valueAnimator.setRepeatMode(this.f52143d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f52140a == iVar.f52140a && this.f52141b == iVar.f52141b && this.f52142c == iVar.f52142c && this.f52143d == iVar.f52143d) {
            return a().getClass().equals(iVar.a().getClass());
        }
        return false;
    }

    private i(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.f52140a = j2;
        this.f52141b = j3;
        this.f52144e = timeInterpolator;
    }
}
