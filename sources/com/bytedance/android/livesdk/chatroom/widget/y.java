package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f16677a;

    static {
        Covode.recordClassIndex(9255);
    }

    y(View view) {
        this.f16677a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        n.a(this.f16677a, -3, ((Integer) valueAnimator.getAnimatedValue()).intValue(), -3);
    }
}
