package com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f140939a;

    /* renamed from: b  reason: collision with root package name */
    public int f140940b;

    /* renamed from: c  reason: collision with root package name */
    public int f140941c;

    /* renamed from: d  reason: collision with root package name */
    public int f140942d;

    /* renamed from: e  reason: collision with root package name */
    public int f140943e;

    /* renamed from: f  reason: collision with root package name */
    public int f140944f;

    /* renamed from: g  reason: collision with root package name */
    public int f140945g;

    /* renamed from: h  reason: collision with root package name */
    public float f140946h;

    /* renamed from: i  reason: collision with root package name */
    public float f140947i;

    /* renamed from: j  reason: collision with root package name */
    public float f140948j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f140949k;

    /* renamed from: l  reason: collision with root package name */
    private b f140950l;

    static {
        Covode.recordClassIndex(92029);
    }

    public final void a() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f140940b, this.f140941c);
        final GradientDrawable gradientDrawable = this.f140950l.f140956c;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(92030);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue;
                int i2;
                float animatedFraction;
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                if (a.this.f140940b > a.this.f140941c) {
                    intValue = (a.this.f140940b - num.intValue()) / 2;
                    i2 = a.this.f140940b - intValue;
                    animatedFraction = a.this.f140948j * valueAnimator.getAnimatedFraction();
                } else {
                    intValue = (a.this.f140941c - num.intValue()) / 2;
                    i2 = a.this.f140941c - intValue;
                    animatedFraction = a.this.f140948j - (a.this.f140948j * valueAnimator.getAnimatedFraction());
                }
                int i3 = (int) animatedFraction;
                gradientDrawable.setBounds(intValue + i3, i3, i2 - i3, a.this.f140949k.getHeight() - i3);
            }
        });
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(gradientDrawable, b.f37372a, this.f140942d, this.f140943e);
        ofInt2.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(this.f140950l, "strokeColor", this.f140944f, this.f140945g);
        ofInt3.setEvaluator(new ArgbEvaluator());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gradientDrawable, "cornerRadius", this.f140946h, this.f140947i);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration((long) this.f140939a);
        animatorSet.playTogether(ofInt, ofInt2, ofInt3, ofFloat);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(92031);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        animatorSet.start();
    }

    a(TextView textView, b bVar) {
        this.f140949k = textView;
        this.f140950l = bVar;
    }
}
