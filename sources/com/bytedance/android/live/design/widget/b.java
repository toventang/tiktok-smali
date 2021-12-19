package com.bytedance.android.live.design.widget;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveButton f9587a;

    static {
        Covode.recordClassIndex(4858);
    }

    b(LiveButton liveButton) {
        this.f9587a = liveButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9587a.invalidate();
    }
}
