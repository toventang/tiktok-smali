package com.ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bb implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f142662a;

    static {
        Covode.recordClassIndex(93327);
    }

    bb(TextView textView) {
        this.f142662a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TextView textView = this.f142662a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = intValue;
        textView.setLayoutParams(layoutParams);
    }
}
