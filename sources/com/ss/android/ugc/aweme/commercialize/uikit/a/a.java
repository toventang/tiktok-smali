package com.ss.android.ugc.aweme.commercialize.uikit.a;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(46524);
    }

    public static void a(View view) {
        if (view != null) {
            view.setOnTouchListener(new b(view, view.getAlpha()));
        }
    }

    public static Drawable a(Drawable drawable, int i2) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i2);
        }
        androidx.core.graphics.drawable.a.a(drawable, i2);
        return drawable;
    }

    public static ValueAnimator a(final View view, int i2, int i3, int i4) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i3);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.commercialize.uikit.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(46525);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.bottomMargin = intValue;
                view.setLayoutParams(marginLayoutParams);
            }
        });
        ofInt.setDuration((long) i4);
        ofInt.setTarget(view);
        return ofInt;
    }

    public static void a(View view, Drawable drawable, int i2, int i3, long j2) {
        a(view, drawable, i2, i3, j2, null);
    }

    public static void a(final View view, Drawable drawable, int i2, int i3, long j2, Animator.AnimatorListener animatorListener) {
        if (i2 != i3 && drawable != null) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i2), Integer.valueOf(i3));
            final Drawable mutate = androidx.core.graphics.drawable.a.e(drawable).mutate();
            if (mutate instanceof GradientDrawable) {
                ((GradientDrawable) mutate).setColor(i3);
            }
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.commercialize.uikit.a.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(46526);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    View view = view;
                    if (view != null) {
                        view.setBackground(a.a(mutate, intValue));
                    }
                }
            });
            if (animatorListener != null) {
                ofObject.addListener(animatorListener);
            }
            ofObject.setDuration(j2);
            ofObject.start();
        }
    }
}
