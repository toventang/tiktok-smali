package com.google.android.material.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.material.c.d;

public final class a {
    static {
        Covode.recordClassIndex(32487);
    }

    public static Animator a(d dVar, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, d.b.f52370a, d.a.f52368a, new d.C1219d(f2, f3, f4));
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        d.C1219d revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f2, (int) f3, revealInfo.f52374c, f4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
