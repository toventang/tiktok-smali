package com.ss.android.ugc.aweme.setting.ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.ui.b.a;

final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingNewVersionActivity f122900a;

    static {
        Covode.recordClassIndex(80683);
    }

    d(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f122900a = i18nSettingNewVersionActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f122900a;
        if (((a) i18nSettingNewVersionActivity.o.f79368m).f122841k != null) {
            ((a) i18nSettingNewVersionActivity.o.f79368m).f122841k.setAlpha(255 - ((int) (valueAnimator.getAnimatedFraction() * 255.0f)));
        }
    }
}
