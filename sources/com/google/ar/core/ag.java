package com.google.ar.core;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ag implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f53403a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f53404b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f53405c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InstallActivity f53406d;

    static {
        Covode.recordClassIndex(33057);
    }

    ag(InstallActivity installActivity, int i2, int i3, int i4) {
        this.f53406d = installActivity;
        this.f53403a = i2;
        this.f53404b = i3;
        this.f53405c = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        int i2 = this.f53403a;
        float f2 = ((float) this.f53404b) * animatedFraction2;
        this.f53406d.getWindow().setLayout((int) ((((float) i2) * animatedFraction) + f2), (int) ((((float) this.f53405c) * animatedFraction) + f2));
        this.f53406d.getWindow().getDecorView().refreshDrawableState();
    }
}
