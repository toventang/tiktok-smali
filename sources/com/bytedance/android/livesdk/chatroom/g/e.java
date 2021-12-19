package com.bytedance.android.livesdk.chatroom.g;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.uikit.c.a;
import com.bytedance.covode.number.Covode;

public final class e {
    static {
        Covode.recordClassIndex(8579);
    }

    public static void a(Context context, final View view, final boolean z, int i2) {
        float f2;
        if (context != null && view != null) {
            a.a(context);
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = (float) (i2 * 1);
            }
            view.animate().translationX(f2).setDuration(200).setListener(new Animator.AnimatorListener() {
                /* class com.bytedance.android.livesdk.chatroom.g.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(8580);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (!z) {
                        view.setVisibility(8);
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    if (view.getVisibility() != 8 || z) {
                        view.setVisibility(0);
                    }
                }
            }).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r4 != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r2, final android.view.View r3, final boolean r4, final boolean r5) {
        /*
            if (r2 == 0) goto L_0x0004
            if (r3 != 0) goto L_0x0005
        L_0x0004:
            return
        L_0x0005:
            if (r4 != 0) goto L_0x0011
            if (r5 == 0) goto L_0x000e
            r0 = 8
            r3.setVisibility(r0)
        L_0x000e:
            r1 = 0
            if (r4 == 0) goto L_0x0013
        L_0x0011:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0013:
            android.view.ViewPropertyAnimator r0 = r3.animate()
            android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            com.bytedance.android.livesdk.chatroom.g.e$2 r0 = new com.bytedance.android.livesdk.chatroom.g.e$2
            r0.<init>(r4, r5, r3)
            android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
            r0.start()
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.g.e.a(android.content.Context, android.view.View, boolean, boolean):void");
    }
}
