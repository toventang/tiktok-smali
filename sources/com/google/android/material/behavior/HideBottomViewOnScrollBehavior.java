package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.a.a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a  reason: collision with root package name */
    public ViewPropertyAnimator f52239a;

    /* renamed from: b  reason: collision with root package name */
    private int f52240b;

    /* renamed from: c  reason: collision with root package name */
    private int f52241c = 2;

    static {
        Covode.recordClassIndex(32446);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(int i2) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public void b(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f52239a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f52241c = 1;
        a(v, this.f52240b, 175, a.f52128c);
    }

    public void a(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f52239a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f52241c = 2;
        a(v, 0, 225, a.f52129d);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(V v, int i2) {
        int i3 = this.f52241c;
        if (i3 != 1) {
            if (i2 > 0) {
                b(v);
                return;
            } else if (i3 == 2) {
                return;
            }
        }
        if (i2 < 0) {
            a(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i2) {
        this.f52240b = v.getMeasuredHeight();
        return super.a(coordinatorLayout, v, i2);
    }

    private void a(V v, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f52239a = v.animate().translationY((float) i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.behavior.HideBottomViewOnScrollBehavior.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32447);
            }

            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.f52239a = null;
            }
        });
    }
}
