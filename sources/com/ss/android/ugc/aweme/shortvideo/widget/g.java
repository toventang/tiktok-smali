package com.ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final ProgressSegmentView f132913a;

    static {
        Covode.recordClassIndex(86942);
    }

    g(ProgressSegmentView progressSegmentView) {
        this.f132913a = progressSegmentView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f132913a.b(valueAnimator);
    }
}
