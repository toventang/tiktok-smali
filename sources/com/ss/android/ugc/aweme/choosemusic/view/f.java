package com.ss.android.ugc.aweme.choosemusic.view;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.utils.gb;

public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f70830a;

    /* renamed from: b  reason: collision with root package name */
    private final int f70831b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup.LayoutParams f70832c;

    static {
        Covode.recordClassIndex(43642);
    }

    public f(c cVar, int i2, ViewGroup.LayoutParams layoutParams) {
        this.f70830a = cVar;
        this.f70831b = i2;
        this.f70832c = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c cVar = this.f70830a;
        int i2 = this.f70831b;
        ViewGroup.LayoutParams layoutParams = this.f70832c;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (gb.a(cVar.f70810a.getContext())) {
            cVar.f70822m.setTranslationX(((float) i2) * (floatValue - 1.0f));
        } else {
            cVar.f70822m.setTranslationX(((float) i2) * (1.0f - floatValue));
        }
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) (cVar.w - n.a(16.0d))) - (((float) i2) * floatValue));
            cVar.f70818i.setLayoutParams(layoutParams);
        }
    }
}
