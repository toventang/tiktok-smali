package com.ss.android.ugc.aweme.detail.a;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79593a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(49444);
    }

    public static /* synthetic */ AnimationSet a() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(-0.5f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(false);
        return animationSet;
    }

    public static /* synthetic */ AnimationSet b() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(false);
        return animationSet;
    }
}
