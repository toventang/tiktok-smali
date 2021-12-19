package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.g.d;
import androidx.core.h.ad;
import androidx.core.h.r;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.c;
import com.google.android.material.internal.k;
import com.zhiliaoapp.musically.R;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    final com.google.android.material.internal.b f52177a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f52178b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f52179c;

    /* renamed from: d  reason: collision with root package name */
    int f52180d;

    /* renamed from: e  reason: collision with root package name */
    ad f52181e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f52182f;

    /* renamed from: g  reason: collision with root package name */
    private int f52183g;

    /* renamed from: h  reason: collision with root package name */
    private Toolbar f52184h;

    /* renamed from: i  reason: collision with root package name */
    private View f52185i;

    /* renamed from: j  reason: collision with root package name */
    private View f52186j;

    /* renamed from: k  reason: collision with root package name */
    private int f52187k;

    /* renamed from: l  reason: collision with root package name */
    private int f52188l;

    /* renamed from: m  reason: collision with root package name */
    private int f52189m;
    private int n;
    private final Rect o;
    private boolean p;
    private Drawable q;
    private int r;
    private boolean s;
    private ValueAnimator t;
    private long u;
    private int v;
    private AppBarLayout.c w;

    static {
        Covode.recordClassIndex(32432);
    }

    public Drawable getContentScrim() {
        return this.q;
    }

    public int getExpandedTitleMarginBottom() {
        return this.n;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f52189m;
    }

    public int getExpandedTitleMarginStart() {
        return this.f52187k;
    }

    public int getExpandedTitleMarginTop() {
        return this.f52188l;
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.r;
    }

    public long getScrimAnimationDuration() {
        return this.u;
    }

    public Drawable getStatusBarScrim() {
        return this.f52179c;
    }

    private void d() {
        setContentDescription(getTitle());
    }

    public int getCollapsedTitleGravity() {
        return this.f52177a.f52515f;
    }

    public int getExpandedTitleGravity() {
        return this.f52177a.f52514e;
    }

    public static class a extends FrameLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f52192a;

        /* renamed from: b  reason: collision with root package name */
        public float f52193b = 0.5f;

        static {
            Covode.recordClassIndex(32435);
        }

        public a() {
            super(-1, -1);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.zj, R.attr.zk});
            this.f52192a = obtainStyledAttributes.getInt(0, 0);
            this.f52193b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }
    }

    public Typeface getCollapsedTitleTypeface() {
        com.google.android.material.internal.b bVar = this.f52177a;
        if (bVar.f52522m != null) {
            return bVar.f52522m;
        }
        return Typeface.DEFAULT;
    }

    public Typeface getExpandedTitleTypeface() {
        com.google.android.material.internal.b bVar = this.f52177a;
        if (bVar.n != null) {
            return bVar.n;
        }
        return Typeface.DEFAULT;
    }

    public CharSequence getTitle() {
        if (this.f52178b) {
            return this.f52177a.o;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.c cVar = this.w;
        if (cVar != null && (parent instanceof AppBarLayout)) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (appBarLayout.f52152e != null) {
                appBarLayout.f52152e.remove(cVar);
            }
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        boolean z;
        if (this.q != null || this.f52179c != null) {
            if (getHeight() + this.f52180d < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    public int getScrimVisibleHeightTrigger() {
        int i2;
        int i3 = this.v;
        if (i3 >= 0) {
            return i3;
        }
        ad adVar = this.f52181e;
        if (adVar != null) {
            i2 = adVar.b();
        } else {
            i2 = 0;
        }
        int i4 = v.i(this);
        if (i4 > 0) {
            return Math.min((i4 * 2) + i2, getHeight());
        }
        return getHeight() / 3;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            setFitsSystemWindows(v.o((View) parent));
            if (this.w == null) {
                this.w = new b();
            }
            ((AppBarLayout) parent).a(this.w);
            v.n(this);
        }
    }

    private void b() {
        if (this.f52182f) {
            Toolbar toolbar = null;
            this.f52184h = null;
            this.f52185i = null;
            int i2 = this.f52183g;
            if (i2 != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i2);
                this.f52184h = toolbar2;
                if (toolbar2 != null) {
                    this.f52185i = c(toolbar2);
                }
            }
            if (this.f52184h == null) {
                int childCount = getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i3);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i3++;
                }
                this.f52184h = toolbar;
            }
            c();
            this.f52182f = false;
        }
    }

    private void c() {
        View view;
        MethodCollector.i(4055);
        if (!this.f52178b && (view = this.f52186j) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f52186j);
            }
        }
        if (this.f52178b && this.f52184h != null) {
            if (this.f52186j == null) {
                this.f52186j = new View(getContext());
            }
            if (this.f52186j.getParent() == null) {
                this.f52184h.addView(this.f52186j, -1, -1);
            }
        }
        MethodCollector.o(4055);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f52179c;
        boolean z2 = false;
        if (drawable == null || !drawable.isStateful()) {
            z = false;
        } else {
            z = drawable.setState(drawableState) | false;
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.b bVar = this.f52177a;
        if (bVar != null) {
            bVar.v = drawableState;
            if ((bVar.f52519j != null && bVar.f52519j.isStateful()) || (bVar.f52518i != null && bVar.f52518i.isStateful())) {
                bVar.c();
                z2 = true;
            }
            z |= z2;
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void setScrimAnimationDuration(long j2) {
        this.u = j2;
    }

    class b implements AppBarLayout.c {
        static {
            Covode.recordClassIndex(32436);
        }

        b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i2) {
            int i3;
            CollapsingToolbarLayout.this.f52180d = i2;
            if (CollapsingToolbarLayout.this.f52181e != null) {
                i3 = CollapsingToolbarLayout.this.f52181e.b();
            } else {
                i3 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i4);
                a aVar = (a) childAt.getLayoutParams();
                d a2 = CollapsingToolbarLayout.a(childAt);
                int i5 = aVar.f52192a;
                if (i5 == 1) {
                    a2.a(androidx.core.b.a.a(-i2, 0, CollapsingToolbarLayout.this.b(childAt)));
                } else if (i5 == 2) {
                    a2.a(Math.round(((float) (-i2)) * aVar.f52193b));
                }
            }
            CollapsingToolbarLayout.this.a();
            if (CollapsingToolbarLayout.this.f52179c != null && i3 > 0) {
                v.c(CollapsingToolbarLayout.this);
            }
            com.google.android.material.internal.b bVar = CollapsingToolbarLayout.this.f52177a;
            float a3 = androidx.core.b.a.a(((float) Math.abs(i2)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - v.i(CollapsingToolbarLayout.this)) - i3)), 0.0f, 1.0f);
            if (a3 != bVar.f52511b) {
                bVar.f52511b = a3;
                bVar.b();
            }
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        this.f52177a.b(i2);
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        this.f52177a.c(i2);
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.f52177a.a(i2);
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.n = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.f52189m = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.f52187k = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.f52188l = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        this.f52177a.d(i2);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.b bVar = this.f52177a;
        if (bVar.f52519j != colorStateList) {
            bVar.f52519j = colorStateList;
            bVar.c();
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        com.google.android.material.internal.b bVar = this.f52177a;
        if (bVar.f52522m != typeface) {
            bVar.f52522m = typeface;
            bVar.c();
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(androidx.core.content.b.a(getContext(), i2));
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.b bVar = this.f52177a;
        if (bVar.f52518i != colorStateList) {
            bVar.f52518i = colorStateList;
            bVar.c();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        com.google.android.material.internal.b bVar = this.f52177a;
        if (bVar.n != typeface) {
            bVar.n = typeface;
            bVar.c();
        }
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.v != i2) {
            this.v = i2;
            a();
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(androidx.core.content.b.a(getContext(), i2));
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f52178b) {
            this.f52178b = z;
            d();
            c();
            requestLayout();
        }
    }

    static d a(View view) {
        d dVar = (d) view.getTag(R.id.fj8);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(view);
        view.setTag(R.id.fj8, dVar2);
        return dVar2;
    }

    private View c(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private static int d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* access modifiers changed from: package-private */
    public final int b(View view) {
        return ((getHeight() - a(view).f52212a) - view.getHeight()) - ((a) view.getLayoutParams()).bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i2) {
        Toolbar toolbar;
        if (i2 != this.r) {
            if (!(this.q == null || (toolbar = this.f52184h) == null)) {
                v.c(toolbar);
            }
            this.r = i2;
            v.c(this);
        }
    }

    public void setTitle(CharSequence charSequence) {
        com.google.android.material.internal.b bVar = this.f52177a;
        if (charSequence == null || !charSequence.equals(bVar.o)) {
            bVar.o = charSequence;
            bVar.p = null;
            bVar.d();
            bVar.c();
        }
        d();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.q || drawable == this.f52179c) {
            return true;
        }
        return false;
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.q.setCallback(this);
                this.q.setAlpha(this.r);
            }
            v.c(this);
        }
    }

    public void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f52179c;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f52179c.setVisible(z, false);
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.q.setVisible(z, false);
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2;
        TimeInterpolator timeInterpolator;
        int i2 = 0;
        if (!v.v(this) || isInEditMode()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.s != z) {
            int i3 = 255;
            if (z2) {
                if (!z) {
                    i3 = 0;
                }
                b();
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.t = valueAnimator2;
                    valueAnimator2.setDuration(this.u);
                    ValueAnimator valueAnimator3 = this.t;
                    if (i3 > this.r) {
                        timeInterpolator = com.google.android.material.a.a.f52128c;
                    } else {
                        timeInterpolator = com.google.android.material.a.a.f52129d;
                    }
                    valueAnimator3.setInterpolator(timeInterpolator);
                    this.t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.google.android.material.appbar.CollapsingToolbarLayout.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(32434);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    });
                } else if (valueAnimator.isRunning()) {
                    this.t.cancel();
                }
                this.t.setIntValues(this.r, i3);
                this.t.start();
            } else {
                if (z) {
                    i2 = 255;
                }
                setScrimAlpha(i2);
            }
            this.s = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f52179c;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f52179c = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f52179c.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.b(this.f52179c, v.e(this));
                Drawable drawable4 = this.f52179c;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f52179c.setCallback(this);
                this.f52179c.setAlpha(this.r);
            }
            v.c(this);
        }
    }

    public void draw(Canvas canvas) {
        ad adVar;
        int b2;
        boolean z;
        Drawable drawable;
        super.draw(canvas);
        b();
        if (this.f52184h == null && (drawable = this.q) != null && this.r > 0) {
            drawable.mutate().setAlpha(this.r);
            this.q.draw(canvas);
        }
        if (this.f52178b && this.p) {
            com.google.android.material.internal.b bVar = this.f52177a;
            int save = canvas.save();
            if (bVar.p != null && bVar.f52510a) {
                float f2 = bVar.f52520k;
                float f3 = bVar.f52521l;
                if (!bVar.q || bVar.r == null) {
                    z = false;
                    bVar.x.ascent();
                    bVar.x.descent();
                } else {
                    z = true;
                    f3 += bVar.t * bVar.u;
                }
                if (bVar.u != 1.0f) {
                    canvas.scale(bVar.u, bVar.u, f2, f3);
                }
                if (z) {
                    canvas.drawBitmap(bVar.r, f2, f3, bVar.s);
                } else {
                    canvas.drawText(bVar.p, 0, bVar.p.length(), f2, f3, bVar.x);
                }
            }
            canvas.restoreToCount(save);
        }
        if (this.f52179c != null && this.r > 0 && (adVar = this.f52181e) != null && (b2 = adVar.b()) > 0) {
            this.f52179c.setBounds(0, -this.f52180d, getWidth(), b2 - this.f52180d);
            this.f52179c.mutate().setAlpha(this.r);
            this.f52179c.draw(canvas);
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        MethodCollector.i(4184);
        b();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        ad adVar = this.f52181e;
        if (adVar != null) {
            i4 = adVar.b();
        } else {
            i4 = 0;
        }
        if (mode == 0 && i4 > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i4, 1073741824));
        }
        MethodCollector.o(4184);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        View view2;
        Drawable drawable = this.q;
        if (drawable == null || this.r <= 0 || ((view2 = this.f52185i) == null || view2 == this ? view != this.f52184h : view != view2)) {
            z = false;
        } else {
            drawable.mutate().setAlpha(this.r);
            this.q.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j2) || z) {
            return true;
        }
        return false;
    }

    private CollapsingToolbarLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(4008);
        this.f52182f = true;
        this.o = new Rect();
        this.v = -1;
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f52177a = bVar;
        bVar.y = com.google.android.material.a.a.f52130e;
        bVar.c();
        TypedArray a2 = k.a(context, attributeSet, new int[]{R.attr.o9, R.attr.o_, R.attr.pw, R.attr.td, R.attr.te, R.attr.tf, R.attr.tg, R.attr.th, R.attr.ti, R.attr.tj, R.attr.aas, R.attr.aau, R.attr.afl, R.attr.aiy, R.attr.aj0, R.attr.ajc}, 0, R.style.qz, new int[0]);
        bVar.a(a2.getInt(3, 8388691));
        bVar.b(a2.getInt(0, 8388627));
        int dimensionPixelSize = a2.getDimensionPixelSize(4, 0);
        this.n = dimensionPixelSize;
        this.f52189m = dimensionPixelSize;
        this.f52188l = dimensionPixelSize;
        this.f52187k = dimensionPixelSize;
        if (a2.hasValue(7)) {
            this.f52187k = a2.getDimensionPixelSize(7, 0);
        }
        if (a2.hasValue(6)) {
            this.f52189m = a2.getDimensionPixelSize(6, 0);
        }
        if (a2.hasValue(8)) {
            this.f52188l = a2.getDimensionPixelSize(8, 0);
        }
        if (a2.hasValue(5)) {
            this.n = a2.getDimensionPixelSize(5, 0);
        }
        this.f52178b = a2.getBoolean(14, true);
        setTitle(a2.getText(13));
        bVar.d(R.style.jb);
        bVar.c(R.style.im);
        if (a2.hasValue(9)) {
            bVar.d(a2.getResourceId(9, 0));
        }
        if (a2.hasValue(1)) {
            bVar.c(a2.getResourceId(1, 0));
        }
        this.v = a2.getDimensionPixelSize(11, -1);
        this.u = (long) a2.getInt(10, 600);
        setContentScrim(a2.getDrawable(2));
        setStatusBarScrim(a2.getDrawable(12));
        this.f52183g = a2.getResourceId(15, -1);
        a2.recycle();
        setWillNotDraw(false);
        v.a(this, new r() {
            /* class com.google.android.material.appbar.CollapsingToolbarLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32433);
            }

            @Override // androidx.core.h.r
            public final ad a(View view, ad adVar) {
                ad adVar2;
                CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                if (v.o(collapsingToolbarLayout)) {
                    adVar2 = adVar;
                } else {
                    adVar2 = null;
                }
                if (!d.a(collapsingToolbarLayout.f52181e, adVar2)) {
                    collapsingToolbarLayout.f52181e = adVar2;
                    collapsingToolbarLayout.requestLayout();
                }
                return adVar.f2507b.c();
            }
        });
        MethodCollector.o(4008);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        boolean z2;
        boolean z3;
        int titleMarginStart;
        int titleMarginEnd;
        int i6;
        int i7;
        MethodCollector.i(4263);
        super.onLayout(z, i2, i3, i4, i5);
        ad adVar = this.f52181e;
        if (adVar != null) {
            int b2 = adVar.b();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (!v.o(childAt) && childAt.getTop() < b2) {
                    v.d(childAt, b2);
                }
            }
        }
        if (this.f52178b && (view = this.f52186j) != null) {
            if (!v.y(view) || this.f52186j.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.p = z2;
            if (z2) {
                if (v.e(this) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                View view2 = this.f52185i;
                if (view2 == null) {
                    view2 = this.f52184h;
                }
                int b3 = b(view2);
                c.a(this, this.f52186j, this.o);
                com.google.android.material.internal.b bVar = this.f52177a;
                int i9 = this.o.left;
                if (z3) {
                    titleMarginStart = this.f52184h.getTitleMarginEnd();
                } else {
                    titleMarginStart = this.f52184h.getTitleMarginStart();
                }
                int i10 = i9 + titleMarginStart;
                int titleMarginTop = this.o.top + b3 + this.f52184h.getTitleMarginTop();
                int i11 = this.o.right;
                if (z3) {
                    titleMarginEnd = this.f52184h.getTitleMarginStart();
                } else {
                    titleMarginEnd = this.f52184h.getTitleMarginEnd();
                }
                int i12 = i11 + titleMarginEnd;
                int titleMarginBottom = (this.o.bottom + b3) - this.f52184h.getTitleMarginBottom();
                if (!com.google.android.material.internal.b.a(bVar.f52513d, i10, titleMarginTop, i12, titleMarginBottom)) {
                    bVar.f52513d.set(i10, titleMarginTop, i12, titleMarginBottom);
                    bVar.w = true;
                    bVar.a();
                }
                com.google.android.material.internal.b bVar2 = this.f52177a;
                if (z3) {
                    i6 = this.f52189m;
                } else {
                    i6 = this.f52187k;
                }
                int i13 = this.o.top + this.f52188l;
                int i14 = i4 - i2;
                if (z3) {
                    i7 = this.f52187k;
                } else {
                    i7 = this.f52189m;
                }
                int i15 = i14 - i7;
                int i16 = (i5 - i3) - this.n;
                if (!com.google.android.material.internal.b.a(bVar2.f52512c, i6, i13, i15, i16)) {
                    bVar2.f52512c.set(i6, i13, i15, i16);
                    bVar2.w = true;
                    bVar2.a();
                }
                this.f52177a.c();
            }
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            a(getChildAt(i17)).a();
        }
        if (this.f52184h != null) {
            if (this.f52178b && TextUtils.isEmpty(this.f52177a.o)) {
                setTitle(this.f52184h.getTitle());
            }
            View view3 = this.f52185i;
            if (view3 == null || view3 == this) {
                setMinimumHeight(d(this.f52184h));
            } else {
                setMinimumHeight(d(view3));
            }
        }
        a();
        MethodCollector.o(4263);
    }
}
