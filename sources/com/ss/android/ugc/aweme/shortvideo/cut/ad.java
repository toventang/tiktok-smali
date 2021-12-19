package com.ss.android.ugc.aweme.shortvideo.cut;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ad {
    static {
        Covode.recordClassIndex(82338);
    }

    public static final void a(View view) {
        l.d(view, "");
        view.setPivotX(((float) view.getWidth()) / 2.0f);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofFloat2, ofFloat);
        animatorSet.start();
    }
}
