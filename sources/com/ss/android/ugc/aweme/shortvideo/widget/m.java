package com.ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final TabHost f132941a;

    static {
        Covode.recordClassIndex(86951);
    }

    m(TabHost tabHost) {
        this.f132941a = tabHost;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f132941a.f132866g.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
