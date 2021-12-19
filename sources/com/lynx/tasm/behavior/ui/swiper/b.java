package com.lynx.tasm.behavior.ui.swiper;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.utils.j;

/* access modifiers changed from: package-private */
public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    final c f56329a;

    /* renamed from: b  reason: collision with root package name */
    final LinearLayout f56330b;

    /* renamed from: c  reason: collision with root package name */
    final int f56331c;

    /* renamed from: d  reason: collision with root package name */
    int f56332d;

    /* renamed from: e  reason: collision with root package name */
    int f56333e;

    /* renamed from: f  reason: collision with root package name */
    int f56334f;

    /* renamed from: g  reason: collision with root package name */
    int f56335g;

    static {
        Covode.recordClassIndex(35164);
    }

    public b(Context context) {
        this(context, (byte) 0);
    }

    static GradientDrawable a(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    public final void a(boolean z) {
        if (z) {
            v.b((View) this.f56330b, 1);
        } else {
            v.b((View) this.f56330b, 0);
        }
        this.f56329a.q = z;
    }

    public final void c(int i2) {
        this.f56335g = i2;
        LinearLayout linearLayout = this.f56330b;
        if (linearLayout != null) {
            removeView(linearLayout);
            d(i2);
        }
        this.f56329a.t = i2;
    }

    public final void b(int i2) {
        this.f56334f = i2;
        for (int childCount = this.f56330b.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f56330b.getChildAt(childCount);
            if (childCount == this.f56334f) {
                childAt.setBackground(a(this.f56332d));
            } else {
                childAt.setBackground(a(this.f56333e));
            }
        }
    }

    private void d(int i2) {
        FrameLayout.LayoutParams layoutParams;
        if (i2 == 1) {
            this.f56330b.setGravity(16);
            this.f56330b.setOrientation(1);
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.rightMargin = (int) j.a(10.0f);
            layoutParams.gravity = 8388629;
        } else {
            this.f56330b.setGravity(17);
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = (int) j.a(10.0f);
            layoutParams.gravity = 81;
        }
        addView(this.f56330b, layoutParams);
    }

    private b(Context context, byte b2) {
        super(context, null);
        MethodCollector.i(11348);
        this.f56332d = XSwiperUI.f56301a;
        this.f56333e = XSwiperUI.f56302b;
        this.f56331c = (int) j.a(7.0f);
        c cVar = new c(context);
        this.f56329a = cVar;
        addView(cVar, new FrameLayout.LayoutParams(-1, -1));
        this.f56330b = new LinearLayout(context);
        d(0);
        MethodCollector.o(11348);
    }
}
