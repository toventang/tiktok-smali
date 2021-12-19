package com.bytedance.ies.dmt.ui.f;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(19976);
    }

    public static void a(View view, float f2, float f3) {
        view.setAlpha(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), f3);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
