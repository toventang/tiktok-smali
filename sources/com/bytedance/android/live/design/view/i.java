package com.bytedance.android.live.design.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class i extends Transition {

    /* renamed from: a  reason: collision with root package name */
    private final long f9479a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9480b;

    /* renamed from: c  reason: collision with root package name */
    private final float f9481c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9482d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f9483e;

    static {
        Covode.recordClassIndex(4818);
    }

    @Override // android.transition.Transition
    public final Transition addTarget(View view) {
        view.setPivotX(this.f9481c);
        view.setPivotY(this.f9482d);
        return super.addTarget(view);
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        if (this.f9483e) {
            transitionValues.values.put("ttlive:scaleX", Float.valueOf(1.0f));
            transitionValues.values.put("ttlive:scaleY", Float.valueOf(1.0f));
            transitionValues.values.put("ttlive:alpha", Float.valueOf(1.0f));
            return;
        }
        transitionValues.values.put("ttlive:scaleX", Float.valueOf(0.0f));
        transitionValues.values.put("ttlive:scaleY", Float.valueOf(0.0f));
        transitionValues.values.put("ttlive:alpha", Float.valueOf(0.0f));
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        if (this.f9483e) {
            transitionValues.values.put("ttlive:scaleX", Float.valueOf(0.0f));
            transitionValues.values.put("ttlive:scaleY", Float.valueOf(0.0f));
            transitionValues.values.put("ttlive:alpha", Float.valueOf(0.0f));
            return;
        }
        transitionValues.values.put("ttlive:scaleX", Float.valueOf(1.0f));
        transitionValues.values.put("ttlive:scaleY", Float.valueOf(1.0f));
        transitionValues.values.put("ttlive:alpha", Float.valueOf(1.0f));
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || transitionValues.view != transitionValues2.view) {
            return null;
        }
        float floatValue = ((Float) transitionValues.values.get("ttlive:scaleX")).floatValue();
        float floatValue2 = ((Float) transitionValues.values.get("ttlive:scaleY")).floatValue();
        float floatValue3 = ((Float) transitionValues2.values.get("ttlive:scaleX")).floatValue();
        float floatValue4 = ((Float) transitionValues2.values.get("ttlive:scaleY")).floatValue();
        float floatValue5 = ((Float) transitionValues.values.get("ttlive:alpha")).floatValue();
        float floatValue6 = ((Float) transitionValues2.values.get("ttlive:alpha")).floatValue();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(transitionValues.view, "alpha", floatValue5, floatValue6);
        ofFloat.setDuration(this.f9479a);
        ofFloat.setInterpolator(new LinearInterpolator());
        if (!this.f9483e) {
            ofFloat.setStartDelay(this.f9480b - this.f9479a);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(transitionValues.view, "scaleX", floatValue, floatValue3);
        ofFloat2.setDuration(this.f9480b);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(transitionValues.view, "scaleY", floatValue2, floatValue4);
        ofFloat3.setDuration(this.f9480b);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat2, ofFloat3, ofFloat);
        return animatorSet;
    }

    public i(long j2, long j3, float f2, float f3, boolean z) {
        this.f9479a = j2;
        this.f9480b = j3;
        this.f9481c = f2;
        this.f9482d = f3;
        this.f9483e = z;
    }
}
