package com.bytedance.tux.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.a.a.a;
import h.f.b.l;
import h.w;

public final class ExpandableLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f45576a;

    /* renamed from: b  reason: collision with root package name */
    public final ValueAnimator f45577b;

    /* renamed from: c  reason: collision with root package name */
    public float f45578c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45579d;

    /* renamed from: e  reason: collision with root package name */
    private int f45580e;

    static {
        Covode.recordClassIndex(27731);
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45577b.cancel();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(5358);
        if (this.f45576a) {
            if (this.f45580e <= 0) {
                super.onMeasure(i2, i3);
                this.f45580e = getMeasuredHeight();
            }
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec((int) (((float) this.f45580e) * this.f45578c), 1073741824));
            MethodCollector.o(5358);
        } else if (this.f45579d) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            this.f45580e = 0;
            MethodCollector.o(5358);
        } else {
            super.onMeasure(i2, i3);
            this.f45580e = 0;
            MethodCollector.o(5358);
        }
    }

    private /* synthetic */ ExpandableLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ExpandableLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(5379);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f45577b = ofFloat;
        this.f45579d = true;
        l.a((Object) ofFloat, "");
        ofFloat.setInterpolator(a.c());
        l.a((Object) ofFloat, "");
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            /* class com.bytedance.tux.widget.ExpandableLayout.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ExpandableLayout f45581a;

            static {
                Covode.recordClassIndex(27732);
            }

            {
                this.f45581a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandableLayout expandableLayout = this.f45581a;
                l.a((Object) valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    expandableLayout.f45578c = ((Float) animatedValue).floatValue();
                    this.f45581a.requestLayout();
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter(this) {
            /* class com.bytedance.tux.widget.ExpandableLayout.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ExpandableLayout f45582a;

            static {
                Covode.recordClassIndex(27733);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f45582a = r1;
            }

            public final void onAnimationEnd(Animator animator) {
                this.f45582a.f45576a = false;
                this.f45582a.requestLayout();
            }

            public final void onAnimationStart(Animator animator, boolean z) {
                super.onAnimationStart(animator, z);
                this.f45582a.f45576a = true;
            }
        });
        MethodCollector.o(5379);
    }
}
