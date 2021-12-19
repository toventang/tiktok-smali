package com.ss.android.ugc.aweme.feed.ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.bv;

final /* synthetic */ class ca implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final bv.AnonymousClass3 f94460a;

    static {
        Covode.recordClassIndex(59986);
    }

    ca(bv.AnonymousClass3 r1) {
        this.f94460a = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        bv.AnonymousClass3 r2 = this.f94460a;
        bv.this.f94435k.setVisibility(0);
        bv.this.f94435k.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
