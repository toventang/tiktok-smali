package com.bytedance.android.livesdk.service.animation.a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.core.h.b.b;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(12497);
    }

    public static AnimatorSet a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        ofFloat.setDuration(1L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        ofFloat2.setDuration(1L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 0.7f);
        ofFloat3.setDuration(100L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 0.7f);
        ofFloat4.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        return animatorSet3;
    }

    public static AnimatorSet b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        ofFloat.setDuration(100L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        ofFloat2.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 1.08f);
        ofFloat3.setDuration(100L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 1.08f);
        ofFloat4.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        ofFloat5.setDuration(100L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        ofFloat6.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ofFloat5, ofFloat6);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        return animatorSet4;
    }

    public static AnimatorSet c(View view) {
        float a2 = (float) y.a(16.0f);
        float a3 = (float) y.a(8.0f);
        float f2 = -a2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, f2);
        ofFloat.setInterpolator(b.a(0.4f, 0.64f, 0.74f, 1.0f));
        ofFloat.setDuration(250L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", f2, 0.0f);
        ofFloat2.setInterpolator(b.a(0.26f, 0.0f, 0.6f, 0.36f));
        ofFloat.setDuration(250L);
        float f3 = -a3;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, f3);
        ofFloat3.setInterpolator(b.a(0.4f, 0.64f, 0.74f, 1.0f));
        ofFloat3.setDuration(200L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationY", f3, 0.0f);
        ofFloat4.setInterpolator(b.a(0.26f, 0.0f, 0.6f, 0.36f));
        ofFloat3.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        return animatorSet;
    }
}
