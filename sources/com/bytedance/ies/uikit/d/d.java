package com.bytedance.ies.uikit.d;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(21189);
    }

    public static AnimatorSet a(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    public static AnimatorSet b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
        animatorSet.setDuration(300L);
        return animatorSet;
    }
}
