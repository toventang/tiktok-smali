package com.ss.android.ugc.aweme.profile.survey;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f116661a;

    static {
        Covode.recordClassIndex(75370);
    }

    i(g gVar) {
        this.f116661a = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        g gVar = this.f116661a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.0f) {
            gVar.f116647c.setAlpha(Math.abs(floatValue));
            return;
        }
        if (gVar.f116647c.getAlpha() > 0.0f) {
            gVar.f116647c.setAlpha(0.0f);
        }
        gVar.f116650f.setAlpha(floatValue);
    }
}
