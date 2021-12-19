package com.bytedance.android.livesdk.l;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final int f18305a;

    /* renamed from: b  reason: collision with root package name */
    private final View f18306b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f18307c;

    static {
        Covode.recordClassIndex(10305);
    }

    j(int i2, View view, boolean z) {
        this.f18305a = i2;
        this.f18306b = view;
        this.f18307c = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.f18305a;
        View view = this.f18306b;
        boolean z = this.f18307c;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f2 = (float) i2;
        view.setTranslationY(z ? (float) ((int) (f2 - (f2 * animatedFraction))) : animatedFraction * ((float) (-i2)));
    }
}
