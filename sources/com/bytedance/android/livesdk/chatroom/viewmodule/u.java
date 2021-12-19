package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.chatroom.ui.SweepEffectFrameLayout;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final SweepEffectFrameLayout f16520a;

    static {
        Covode.recordClassIndex(9158);
    }

    u(SweepEffectFrameLayout sweepEffectFrameLayout) {
        this.f16520a = sweepEffectFrameLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16520a.setSweepRatio(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
