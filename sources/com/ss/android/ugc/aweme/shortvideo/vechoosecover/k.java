package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;

final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseCoverActivity.a f132554a;

    /* renamed from: b  reason: collision with root package name */
    private final float f132555b;

    /* renamed from: c  reason: collision with root package name */
    private final int f132556c;

    /* renamed from: d  reason: collision with root package name */
    private final int f132557d;

    /* renamed from: e  reason: collision with root package name */
    private final int f132558e;

    /* renamed from: f  reason: collision with root package name */
    private final int f132559f;

    static {
        Covode.recordClassIndex(86751);
    }

    k(ChooseCoverActivity.a aVar, float f2, int i2, int i3, int i4, int i5) {
        this.f132554a = aVar;
        this.f132555b = f2;
        this.f132556c = i2;
        this.f132557d = i3;
        this.f132558e = i4;
        this.f132559f = i5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ChooseCoverActivity.a aVar = this.f132554a;
        float f2 = this.f132555b;
        int i2 = this.f132556c;
        int i3 = this.f132557d;
        int i4 = this.f132558e;
        int i5 = this.f132559f;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i6 = (int) ((((((float) (i2 - i3)) - (((float) (i4 + i5)) * animatedFraction)) - floatValue) / 2.0f) + ((float) i5));
        int i7 = (int) (f2 * floatValue);
        int i8 = (int) floatValue;
        ChooseCoverActivity.this.f132504e.w.a(0, i6, i7, i8);
        aVar.a(i6, i7, i8);
        ChooseCoverActivity.this.a(0, i6, i7, i8);
    }
}
