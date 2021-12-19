package com.bytedance.android.livesdk.s;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f21142a;

    static {
        Covode.recordClassIndex(12477);
    }

    i(h hVar) {
        this.f21142a = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        h hVar = this.f21142a;
        hVar.f21115a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
