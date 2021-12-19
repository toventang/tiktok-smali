package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f130019a;

    static {
        Covode.recordClassIndex(85318);
    }

    public c(a aVar) {
        this.f130019a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f130019a.f130009c.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
