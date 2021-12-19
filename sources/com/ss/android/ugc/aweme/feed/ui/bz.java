package com.ss.android.ugc.aweme.feed.ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.bv;

final /* synthetic */ class bz implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final bv.AnonymousClass3 f94456a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f94457b;

    static {
        Covode.recordClassIndex(59983);
    }

    bz(bv.AnonymousClass3 r1, boolean z) {
        this.f94456a = r1;
        this.f94457b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        bv.AnonymousClass3 r3 = this.f94456a;
        boolean z = this.f94457b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue > 0) {
            bv.this.f94427c.setHeight(intValue);
            if (!bv.f94424a) {
                return;
            }
            if (z) {
                bv.this.f94428d.getLayoutParams().height = intValue + bv.this.f94429e;
                return;
            }
            bv.this.f94428d.getLayoutParams().height = intValue;
        }
    }
}
