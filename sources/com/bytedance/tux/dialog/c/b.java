package com.bytedance.tux.dialog.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;

public final class b extends a {
    static {
        Covode.recordClassIndex(27377);
    }

    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Interpolator f44841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f44842b;

        static {
            Covode.recordClassIndex(27378);
        }

        a(Interpolator interpolator, View view) {
            this.f44841a = interpolator;
            this.f44842b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f44842b;
            l.a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setScaleX(((Float) animatedValue).floatValue());
                View view2 = this.f44842b;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    view2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.tux.dialog.c.a
    public final Animator b(View view) {
        l.c(view, "");
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator b2 = com.bytedance.tux.a.a.a.b();
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(view);
        objectAnimator.setPropertyName("alpha");
        objectAnimator.setFloatValues(0.0f, 1.0f);
        objectAnimator.setDuration(300L);
        objectAnimator.setInterpolator(new LinearInterpolator());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.2f, 1.0f);
        ofFloat.setInterpolator(b2);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new a(b2, view));
        animatorSet.playTogether(objectAnimator, ofFloat);
        return animatorSet;
    }
}
