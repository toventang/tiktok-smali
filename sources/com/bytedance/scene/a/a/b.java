package com.bytedance.scene.a.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.a.a;
import com.bytedance.scene.a.e;

public class b extends e {
    static {
        Covode.recordClassIndex(26216);
    }

    @Override // com.bytedance.scene.a.e
    public final boolean a() {
        return true;
    }

    @Override // com.bytedance.scene.a.e
    public final Animator a(a aVar, a aVar2) {
        final View view = aVar2.f42664b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, view.getAlpha());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.scene.a.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(26217);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150L);
        return ofFloat;
    }

    @Override // com.bytedance.scene.a.e
    public Animator b(final a aVar, a aVar2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(aVar.f42664b.getAlpha(), 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.scene.a.a.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(26218);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aVar.f42664b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150L);
        return ofFloat;
    }
}
