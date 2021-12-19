package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f52670b;

    static {
        Covode.recordClassIndex(32619);
    }

    /* access modifiers changed from: protected */
    public abstract AnimatorSet b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean a(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        AnimatorSet animatorSet = this.f52670b;
        if (animatorSet != null) {
            z3 = true;
            animatorSet.cancel();
        } else {
            z3 = false;
        }
        AnimatorSet b2 = b(view, view2, z, z3);
        this.f52670b = b2;
        b2.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.transformation.ExpandableTransformationBehavior.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32620);
            }

            public final void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.f52670b = null;
            }
        });
        this.f52670b.start();
        if (!z2) {
            this.f52670b.end();
        }
        return true;
    }
}
