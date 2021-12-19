package com.ss.android.ugc.aweme.tools.mvtemplate.view;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final MvThemeListViewPager f140933a;

    static {
        Covode.recordClassIndex(92027);
    }

    a(MvThemeListViewPager mvThemeListViewPager) {
        this.f140933a = mvThemeListViewPager;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f140933a.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
