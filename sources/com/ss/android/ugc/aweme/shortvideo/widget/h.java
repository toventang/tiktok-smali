package com.ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final ProgressSegmentView f132914a;

    static {
        Covode.recordClassIndex(86943);
    }

    h(ProgressSegmentView progressSegmentView) {
        this.f132914a = progressSegmentView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f132914a.a(valueAnimator);
    }
}
