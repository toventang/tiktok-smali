package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final l f126281a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f126282b;

    static {
        Covode.recordClassIndex(82887);
    }

    m(l lVar, boolean z) {
        this.f126281a = lVar;
        this.f126282b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f126281a.a(this.f126282b, valueAnimator);
    }
}
