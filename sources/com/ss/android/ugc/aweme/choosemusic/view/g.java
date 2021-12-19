package com.ss.android.ugc.aweme.choosemusic.view;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.utils.gb;

public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f70833a;

    /* renamed from: b  reason: collision with root package name */
    private final int f70834b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup.LayoutParams f70835c;

    static {
        Covode.recordClassIndex(43643);
    }

    public g(c cVar, int i2, ViewGroup.LayoutParams layoutParams) {
        this.f70833a = cVar;
        this.f70834b = i2;
        this.f70835c = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c cVar = this.f70833a;
        int i2 = this.f70834b;
        ViewGroup.LayoutParams layoutParams = this.f70835c;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (gb.a(cVar.f70810a.getContext())) {
            cVar.f70822m.setTranslationX(((float) (-i2)) * floatValue);
        } else {
            cVar.f70822m.setTranslationX(((float) i2) * floatValue);
        }
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) (cVar.w - (n.a(16.0d) * 2))) - (((float) i2) * (1.0f - floatValue)));
            cVar.f70818i.setLayoutParams(layoutParams);
        }
        if (floatValue == 1.0f) {
            cVar.f70813d.setVisibility(8);
            cVar.n.setVisibility(0);
        }
    }
}
