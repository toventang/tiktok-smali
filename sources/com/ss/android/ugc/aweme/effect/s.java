package com.ss.android.ugc.aweme.effect;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.g.a;
import com.bytedance.covode.number.Covode;

public final class s {
    static {
        Covode.recordClassIndex(55952);
    }

    public static void a(final View view, boolean z) {
        float f2;
        float[] fArr = new float[2];
        float f3 = 0.0f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 1.0f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.effect.s.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f88970a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f88971b = false;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f88972c = false;

            static {
                Covode.recordClassIndex(55954);
            }

            public final void onAnimationEnd(Animator animator) {
                int i2;
                View view = this.f88970a;
                if (view != null) {
                    if (this.f88971b) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                }
                if (this.f88972c) {
                    view.setVisibility(4);
                }
            }
        });
    }

    public static void a(View view, boolean z, int i2, View view2, a<Void> aVar) {
        a(view, z, i2, view2, 300, aVar);
    }

    public static void a(final View view, final boolean z, int i2, final View view2, int i3, final a<Void> aVar) {
        float f2;
        float f3;
        float f4;
        if (z) {
            view2.setVisibility(0);
        }
        view2.bringToFront();
        float[] fArr = new float[2];
        float f5 = 0.0f;
        if (!z) {
            f2 = 0.0f;
        } else {
            f2 = (float) i2;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = (float) i2;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", fArr);
        long j2 = (long) i3;
        ofFloat.setDuration(j2);
        float[] fArr2 = new float[2];
        if (!z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[0] = f4;
        if (z) {
            f5 = 1.0f;
        }
        fArr2[1] = f5;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", fArr2);
        ofFloat2.setDuration(j2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.effect.s.AnonymousClass1 */

            static {
                Covode.recordClassIndex(55953);
            }

            public final void onAnimationStart(Animator animator) {
                view.setVisibility(0);
            }

            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    view2.setVisibility(4);
                }
                a aVar = aVar;
                if (aVar != null) {
                    aVar.a(null);
                }
            }
        });
        animatorSet.start();
    }
}
