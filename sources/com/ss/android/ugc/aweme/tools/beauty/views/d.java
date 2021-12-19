package com.ss.android.ugc.aweme.tools.beauty.views;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final SwitchButton f139288a;

    static {
        Covode.recordClassIndex(91057);
    }

    d(SwitchButton switchButton) {
        this.f139288a = switchButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f139288a.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
