package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f102396a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(65540);
    }

    public static final void a(View view) {
        l.d(view, "");
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        view.clearAnimation();
    }

    public static final TranslateAnimation a(float f2, float f3) {
        TranslateAnimation translateAnimation = new TranslateAnimation(f2, f3, 0.0f, 0.0f);
        translateAnimation.setDuration(240);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setRepeatMode(1);
        return translateAnimation;
    }

    public static final RotateAnimation a(int i2, Animation.AnimationListener animationListener) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration((long) i2);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setAnimationListener(animationListener);
        return rotateAnimation;
    }
}
