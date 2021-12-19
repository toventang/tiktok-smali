package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final ae f128918a;

    /* renamed from: b  reason: collision with root package name */
    private final int f128919b;

    static {
        Covode.recordClassIndex(84595);
    }

    aj(ae aeVar, int i2) {
        this.f128918a = aeVar;
        this.f128919b = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f128918a.f128905f.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) this.f128919b));
    }
}
