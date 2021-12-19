package com.ss.android.ugc.aweme.sticker.p;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(88265);
    }

    public static Animation a(float f2, float f3, long j2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setDuration(j2);
        return alphaAnimation;
    }
}
