package com.ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ba implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f142660a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f142661b;

    static {
        Covode.recordClassIndex(93326);
    }

    ba(ViewGroup viewGroup, boolean z) {
        this.f142660a = viewGroup;
        this.f142661b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup = this.f142660a;
        boolean z = this.f142661b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        if (z) {
            marginLayoutParams.bottomMargin = intValue;
        } else {
            marginLayoutParams.topMargin = intValue;
        }
        viewGroup.setLayoutParams(marginLayoutParams);
    }
}
