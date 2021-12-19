package com.bytedance.android.live.publicscreen.impl.widget;

import android.animation.ValueAnimator;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final PublicScreenWidget f12582a;

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout.LayoutParams f12583b;

    static {
        Covode.recordClassIndex(6924);
    }

    n(PublicScreenWidget publicScreenWidget, RelativeLayout.LayoutParams layoutParams) {
        this.f12582a = publicScreenWidget;
        this.f12583b = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PublicScreenWidget publicScreenWidget = this.f12582a;
        RelativeLayout.LayoutParams layoutParams = this.f12583b;
        if (publicScreenWidget.getView() != null) {
            layoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            publicScreenWidget.getView().setLayoutParams(layoutParams);
        }
    }
}
