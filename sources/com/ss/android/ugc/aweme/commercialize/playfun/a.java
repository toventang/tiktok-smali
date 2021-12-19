package com.ss.android.ugc.aweme.commercialize.playfun;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74951a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46210);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a$a  reason: collision with other inner class name */
    static final class C1702a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PathMeasure f74952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float[] f74953b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f74954c;

        static {
            Covode.recordClassIndex(46211);
        }

        C1702a(PathMeasure pathMeasure, float[] fArr, View view) {
            this.f74952a = pathMeasure;
            this.f74953b = fArr;
            this.f74954c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                PathMeasure pathMeasure = this.f74952a;
                pathMeasure.getPosTan(pathMeasure.getLength() * valueAnimator.getAnimatedFraction(), this.f74953b, null);
                this.f74954c.setTranslationX(this.f74953b[0]);
                this.f74954c.setTranslationY(this.f74953b[1]);
            }
        }
    }

    public static Animator a(View view, float f2) {
        l.d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), f2);
        l.b(ofFloat, "");
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    public static Animator a(View view, Path path) {
        l.d(view, "");
        l.d(path, "");
        if (Build.VERSION.SDK_INT >= 21) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", "translationY", path);
            l.b(ofFloat, "");
            return ofFloat;
        }
        C1702a aVar = new C1702a(new PathMeasure(path, false), new float[2], view);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(aVar);
        l.b(ofFloat2, "");
        return ofFloat2;
    }

    public static Animator a(View view, float f2, float f3, int i2) {
        l.d(view, "");
        float f4 = ((float) i2) / 2.0f;
        view.setPivotX(f4);
        view.setPivotY(f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f3);
        l.b(ofFloat, "");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", view.getScaleY(), f3);
        l.b(ofFloat2, "");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), f2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.play(ofFloat3).with(ofFloat).with(ofFloat2);
        return animatorSet;
    }
}
