package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f130020a;

    static {
        Covode.recordClassIndex(85319);
    }

    public d(a aVar) {
        this.f130020a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f130020a.f130009c.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
