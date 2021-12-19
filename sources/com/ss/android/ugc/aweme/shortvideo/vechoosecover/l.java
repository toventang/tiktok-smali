package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;

final /* synthetic */ class l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseCoverActivity.a f132560a;

    /* renamed from: b  reason: collision with root package name */
    private final float f132561b;

    /* renamed from: c  reason: collision with root package name */
    private final int f132562c;

    /* renamed from: d  reason: collision with root package name */
    private final int f132563d;

    static {
        Covode.recordClassIndex(86752);
    }

    l(ChooseCoverActivity.a aVar, float f2, int i2, int i3) {
        this.f132560a = aVar;
        this.f132561b = f2;
        this.f132562c = i2;
        this.f132563d = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ChooseCoverActivity.a aVar = this.f132560a;
        float f2 = this.f132561b;
        int i2 = this.f132562c;
        int i3 = this.f132563d;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f3 = f2 * floatValue;
        int i4 = (int) ((((float) i2) - f3) / 2.0f);
        int i5 = (int) (((float) i3) * animatedFraction);
        int i6 = (int) f3;
        int i7 = (int) floatValue;
        ChooseCoverActivity.this.f132504e.w.a(i4, i5, i6, i7);
        aVar.a(i5, i6, i7);
        ChooseCoverActivity.this.a(i4, i5, i6, i7);
    }
}
