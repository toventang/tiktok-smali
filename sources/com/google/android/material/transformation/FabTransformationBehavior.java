package com.google.android.material.transformation;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.a.h;
import com.google.android.material.a.i;
import com.google.android.material.a.j;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f52672c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f52673d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f52674e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f52675f;

    static {
        Covode.recordClassIndex(32621);
    }

    /* access modifiers changed from: protected */
    public abstract a a(Context context, boolean z);

    /* access modifiers changed from: protected */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public h f52687a;

        /* renamed from: b  reason: collision with root package name */
        public j f52688b;

        static {
            Covode.recordClassIndex(32626);
        }

        protected a() {
        }
    }

    public FabTransformationBehavior() {
        this.f52672c = new Rect();
        this.f52673d = new RectF();
        this.f52674e = new RectF();
        this.f52675f = new int[2];
    }

    private static ViewGroup a(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout.e eVar) {
        if (eVar.f2107h == 0) {
            eVar.f2107h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52672c = new Rect();
        this.f52673d = new RectF();
        this.f52674e = new RectF();
        this.f52675f = new int[2];
    }

    private void a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f52675f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private float a(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f52673d;
        RectF rectF2 = this.f52674e;
        a(view, rectF);
        a(view2, rectF2);
        int i2 = jVar.f52145a & 7;
        if (i2 != 1) {
            if (i2 == 3) {
                f2 = rectF2.left;
                f3 = rectF.left;
            } else if (i2 != 5) {
                f4 = 0.0f;
            } else {
                f2 = rectF2.right;
                f3 = rectF.right;
            }
            f4 = f2 - f3;
        } else {
            f2 = rectF2.centerX();
            f3 = rectF.centerX();
            f4 = f2 - f3;
        }
        return f4 + jVar.f52146b;
    }

    private float b(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f52673d;
        RectF rectF2 = this.f52674e;
        a(view, rectF);
        a(view2, rectF2);
        int i2 = jVar.f52145a & 112;
        if (i2 != 16) {
            if (i2 == 48) {
                f2 = rectF2.top;
                f3 = rectF.top;
            } else if (i2 != 80) {
                f4 = 0.0f;
            } else {
                f2 = rectF2.bottom;
                f3 = rectF.bottom;
            }
            f4 = f2 - f3;
        } else {
            f2 = rectF2.centerY();
            f3 = rectF.centerY();
            f4 = f2 - f3;
        }
        return f4 + jVar.f52147c;
    }

    private static float a(a aVar, i iVar, float f2) {
        long j2 = iVar.f52140a;
        long j3 = iVar.f52141b;
        i a2 = aVar.f52687a.a("expansion");
        return f2 + (iVar.a().getInterpolation(((float) (((a2.f52140a + a2.f52141b) + 17) - j2)) / ((float) j3)) * (0.0f - f2));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d3, code lost:
        if (r15 != false) goto L_0x00d5;
     */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet b(final android.view.View r28, final android.view.View r29, final boolean r30, boolean r31) {
        /*
        // Method dump skipped, instructions count: 846
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    private static void a(View view, long j2, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j2 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j2);
            list.add(createCircularReveal);
        }
    }
}
