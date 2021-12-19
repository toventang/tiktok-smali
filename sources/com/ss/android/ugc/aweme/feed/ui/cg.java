package com.ss.android.ugc.aweme.feed.ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.experiment.q;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final cc f94489a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f94490b;

    static {
        Covode.recordClassIndex(59995);
    }

    cg(cc ccVar, boolean z) {
        this.f94489a = ccVar;
        this.f94490b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        cc ccVar = this.f94489a;
        boolean z = this.f94490b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue > 0) {
            ccVar.f94465d.setHeight(intValue);
            if (cc.f94462a) {
                if (z) {
                    ccVar.f94469h.getLayoutParams().height = intValue + ccVar.q;
                } else {
                    ccVar.f94469h.getLayoutParams().height = intValue;
                }
            }
            if (q.c()) {
                ccVar.f94471j.h(z);
            }
        }
    }
}
