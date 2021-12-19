package com.ss.android.ugc.aweme.editSticker.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(55408);
    }

    public static void a(final View view) {
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.editSticker.f.a.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Animator.AnimatorListener f88151b = null;

            static {
                Covode.recordClassIndex(55409);
            }

            public final void onAnimationEnd(Animator animator) {
                view.setVisibility(0);
                Animator.AnimatorListener animatorListener = this.f88151b;
                if (animatorListener != null) {
                    animatorListener.onAnimationEnd(animator);
                }
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.start();
    }

    public static void b(final View view) {
        if (view.getVisibility() != 8) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.editSticker.f.a.AnonymousClass2 */

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Animator.AnimatorListener f88153b = null;

                static {
                    Covode.recordClassIndex(55410);
                }

                public final void onAnimationEnd(Animator animator) {
                    view.setVisibility(8);
                    Animator.AnimatorListener animatorListener = this.f88153b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationEnd(animator);
                    }
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.start();
        }
    }
}
