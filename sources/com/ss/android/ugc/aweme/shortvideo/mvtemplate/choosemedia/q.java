package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final n f129176a;

    /* renamed from: b  reason: collision with root package name */
    private final float f129177b;

    static {
        Covode.recordClassIndex(84794);
    }

    q(n nVar, float f2) {
        this.f129176a = nVar;
        this.f129177b = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        n nVar = this.f129176a;
        float f2 = this.f129177b;
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
