package com.ss.android.ugc.aweme.feed.ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ch implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final cc f94491a;

    static {
        Covode.recordClassIndex(59996);
    }

    ch(cc ccVar) {
        this.f94491a = ccVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        cc ccVar = this.f94491a;
        ccVar.f94466e.setVisibility(0);
        ccVar.f94466e.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
