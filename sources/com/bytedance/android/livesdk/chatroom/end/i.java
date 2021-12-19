package com.bytedance.android.livesdk.chatroom.end;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRecommendBar.a f15451a;

    static {
        Covode.recordClassIndex(8532);
    }

    i(LiveRecommendBar.a aVar) {
        this.f15451a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LiveRecommendBar.a aVar = this.f15451a;
        n.a(LiveRecommendBar.this, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) LiveRecommendBar.this.f15387a)), -3);
    }
}
