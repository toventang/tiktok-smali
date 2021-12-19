package com.ss.android.ugc.aweme.choosemusic.h.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class a implements View.OnTouchListener {
    static {
        Covode.recordClassIndex(43507);
    }

    public abstract void a(View view);

    private static Animator b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 1.0f);
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.5f);
            ofFloat.setDuration(150L);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.choosemusic.h.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(43508);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.start();
            return true;
        } else if (motionEvent.getAction() == 1) {
            Animator b2 = b(view);
            b2.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.choosemusic.h.b.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(43509);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    a.this.a(view);
                }
            });
            b2.start();
            return true;
        } else {
            if (motionEvent.getAction() == 3) {
                b(view).start();
            }
            return false;
        }
    }
}
