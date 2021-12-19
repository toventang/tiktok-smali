package com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a;

import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public final class a implements Interpolator {
    static {
        Covode.recordClassIndex(65692);
    }

    public final float getInterpolation(float f2) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f2));
        double d2 = (double) (f2 - 0.1f);
        Double.isNaN(d2);
        return (float) ((pow * Math.sin((d2 * 6.283185307179586d) / 0.4000000059604645d)) + 1.0d);
    }
}
