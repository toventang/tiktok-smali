package com.ss.android.ugc.aweme.common.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class b implements View.OnTouchListener {
    static {
        Covode.recordClassIndex(47157);
    }

    public abstract void a(View view, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    public abstract Animator b(View view);

    /* access modifiers changed from: protected */
    public abstract Animator c(View view);

    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Animator b2 = b(view);
            b2.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.common.d.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(47158);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            b2.start();
            return true;
        } else if (motionEvent.getAction() == 1) {
            Animator c2 = c(view);
            c2.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.common.d.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(47159);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    b.this.a(view, motionEvent);
                }
            });
            c2.start();
            return true;
        } else {
            if (motionEvent.getAction() == 3) {
                c(view).start();
            }
            return false;
        }
    }
}
