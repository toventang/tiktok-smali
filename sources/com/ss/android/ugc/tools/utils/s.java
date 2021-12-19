package com.ss.android.ugc.tools.utils;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;

public final class s {
    static {
        Covode.recordClassIndex(98762);
    }

    public static void a(View view, float f2) {
        if (view != null) {
            view.setOnTouchListener(new t(view, f2));
        }
    }

    static void a(View view, float f2, float f3) {
        view.setAlpha(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f3);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
