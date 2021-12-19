package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.a.b;
import com.google.android.material.a.i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final i f52689c = new i(75);

    /* renamed from: d  reason: collision with root package name */
    private final i f52690d = new i(0);

    static {
        Covode.recordClassIndex(32627);
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.b(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet b(View view, final View view2, final boolean z, boolean z2) {
        i iVar;
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z) {
            iVar = this.f52689c;
        } else {
            iVar = this.f52690d;
        }
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f);
        }
        iVar.a((Animator) ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.transformation.FabTransformationScrimBehavior.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32628);
            }

            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    view2.setVisibility(4);
                }
            }

            public final void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }
}
