package com.ss.android.ugc.aweme.shortvideo.util;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;

public final class bu {
    static {
        Covode.recordClassIndex(86638);
    }

    public static int a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return -(iArr[0] + view.getWidth());
    }

    public static void a(View view, float f2, float f3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", f2, f3);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
