package com.ss.android.ugc.aweme.setting.ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.ui.b.a;

final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final I18nSettingNewVersionActivity f122909a;

    static {
        Covode.recordClassIndex(80692);
    }

    m(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f122909a = i18nSettingNewVersionActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        I18nSettingNewVersionActivity i18nSettingNewVersionActivity = this.f122909a;
        if (((a) i18nSettingNewVersionActivity.o.f79368m).f122841k != null) {
            ((a) i18nSettingNewVersionActivity.o.f79368m).f122841k.setAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
        }
    }
}
