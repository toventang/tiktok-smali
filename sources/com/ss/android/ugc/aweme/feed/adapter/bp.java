package com.ss.android.ugc.aweme.feed.adapter;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bp implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91718a;

    static {
        Covode.recordClassIndex(57745);
    }

    bp(VideoViewCell videoViewCell) {
        this.f91718a = videoViewCell;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f91718a.w.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
