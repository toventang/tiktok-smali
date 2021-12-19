package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity;

final /* synthetic */ class bx implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity.AnonymousClass2 f131560a;

    static {
        Covode.recordClassIndex(86165);
    }

    bx(VEVideoPublishPreviewActivity.AnonymousClass2 r1) {
        this.f131560a = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        VEVideoPublishPreviewActivity.this.f131173e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
