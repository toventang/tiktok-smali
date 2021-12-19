package com.bytedance.android.livesdk.userinfowidget;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21977a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21978b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21979c;

    /* renamed from: d  reason: collision with root package name */
    private final GradientDrawable f21980d;

    static {
        Covode.recordClassIndex(12940);
    }

    o(LiveRoomUserInfoWidget liveRoomUserInfoWidget, int i2, int i3, GradientDrawable gradientDrawable) {
        this.f21977a = liveRoomUserInfoWidget;
        this.f21978b = i2;
        this.f21979c = i3;
        this.f21980d = gradientDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f21977a;
        int i2 = this.f21978b;
        int i3 = this.f21979c;
        GradientDrawable gradientDrawable = this.f21980d;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = liveRoomUserInfoWidget.f21938k.getLayoutParams();
        layoutParams.width = (int) (floatValue * ((float) i2));
        if (layoutParams.width <= i3) {
            layoutParams.height = layoutParams.width;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius((float) (layoutParams.height >> 1));
            }
        }
        liveRoomUserInfoWidget.f21938k.setLayoutParams(layoutParams);
    }
}
