package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.b.a;
import androidx.core.h.ad;
import androidx.core.h.e;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class b extends c<View> {

    /* renamed from: a  reason: collision with root package name */
    final Rect f52205a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    final Rect f52206b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public int f52207c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f52208d;

    static {
        Covode.recordClassIndex(32439);
    }

    /* access modifiers changed from: package-private */
    public float a(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    public abstract View a(List<View> list);

    public b() {
    }

    /* access modifiers changed from: package-private */
    public int b(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int c(View view) {
        if (this.f52208d == 0) {
            return 0;
        }
        float a2 = a(view);
        int i2 = this.f52208d;
        return a.a((int) (a2 * ((float) i2)), 0, i2);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.c
    public final void a_(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View a2 = a(coordinatorLayout.b(view));
        if (a2 != null) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
            Rect rect = this.f52205a;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, a2.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + a2.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            ad lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && v.o(coordinatorLayout) && !v.o(view)) {
                rect.left += lastWindowInsets.a();
                rect.right -= lastWindowInsets.c();
            }
            Rect rect2 = this.f52206b;
            int i3 = eVar.f2102c;
            if (i3 == 0) {
                i3 = 8388659;
            }
            e.a(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
            int c2 = c(a2);
            view.layout(rect2.left, rect2.top - c2, rect2.right, rect2.bottom - c2);
            this.f52207c = rect2.top - a2.getBottom();
            return;
        }
        super.a_(coordinatorLayout, view, i2);
        this.f52207c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        View a2;
        int i6;
        int i7 = view.getLayoutParams().height;
        if ((i7 != -1 && i7 != -2) || (a2 = a(coordinatorLayout.b(view))) == null) {
            return false;
        }
        if (v.o(a2) && !v.o(view)) {
            view.setFitsSystemWindows(true);
            if (v.o(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        int measuredHeight = (size - a2.getMeasuredHeight()) + b(a2);
        if (i7 == -1) {
            i6 = 1073741824;
        } else {
            i6 = Integer.MIN_VALUE;
        }
        coordinatorLayout.a(view, i2, i3, View.MeasureSpec.makeMeasureSpec(measuredHeight, i6), i5);
        return true;
    }
}
