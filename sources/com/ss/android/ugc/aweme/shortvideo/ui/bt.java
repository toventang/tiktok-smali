package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bt implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity f131553a;

    static {
        Covode.recordClassIndex(86161);
    }

    bt(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f131553a = vEVideoPublishPreviewActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f131553a.f131175g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
