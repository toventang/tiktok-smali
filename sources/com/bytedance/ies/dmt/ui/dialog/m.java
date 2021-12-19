package com.bytedance.ies.dmt.ui.dialog;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final int f33449a;

    /* renamed from: b  reason: collision with root package name */
    private final View f33450b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33451c;

    static {
        Covode.recordClassIndex(19959);
    }

    m(int i2, View view, boolean z) {
        this.f33449a = i2;
        this.f33450b = view;
        this.f33451c = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.f33449a;
        View view = this.f33450b;
        boolean z = this.f33451c;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f2 = (float) i2;
        view.setTranslationY(z ? (float) ((int) (f2 - (f2 * animatedFraction))) : animatedFraction * ((float) (-i2)));
    }
}
