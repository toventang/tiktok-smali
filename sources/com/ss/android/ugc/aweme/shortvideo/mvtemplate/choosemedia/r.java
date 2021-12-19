package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final n f129178a;

    /* renamed from: b  reason: collision with root package name */
    private final float f129179b;

    static {
        Covode.recordClassIndex(84795);
    }

    r(n nVar, float f2) {
        this.f129178a = nVar;
        this.f129179b = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        n nVar = this.f129178a;
        float f2 = this.f129179b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        nVar.t = floatValue;
        n.a(nVar.f129154b, floatValue);
        if (nVar.q) {
            nVar.f129156d.setTranslationX(floatValue - f2);
        } else {
            nVar.f129156d.setTranslationX(f2 - floatValue);
        }
    }
}
