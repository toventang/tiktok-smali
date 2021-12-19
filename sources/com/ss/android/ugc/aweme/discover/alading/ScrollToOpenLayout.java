package com.ss.android.ugc.aweme.discover.alading;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.core.h.k;
import androidx.core.h.o;
import androidx.core.h.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import h.f.b.l;
import java.util.Objects;

public final class ScrollToOpenLayout extends LinearLayout implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80692a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f80693b;

    /* renamed from: c  reason: collision with root package name */
    private final q f80694c;

    /* renamed from: d  reason: collision with root package name */
    private int f80695d;

    /* renamed from: e  reason: collision with root package name */
    private int f80696e;

    /* renamed from: f  reason: collision with root package name */
    private int f80697f;

    /* renamed from: g  reason: collision with root package name */
    private b f80698g;

    public interface b {
        static {
            Covode.recordClassIndex(50189);
        }
    }

    static {
        Covode.recordClassIndex(50187);
    }

    @Override // androidx.core.h.o
    public final boolean a(View view, View view2, int i2, int i3) {
        l.d(view, "");
        l.d(view2, "");
        return i2 == 1;
    }

    @Override // androidx.core.h.n
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        l.d(view, "");
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50188);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getEnable() {
        return this.f80693b;
    }

    public final int getNestedScrollAxes() {
        return this.f80694c.a();
    }

    /* access modifiers changed from: protected */
    public final int computeHorizontalScrollRange() {
        if (!this.f80693b) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int i2 = 0;
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                View childAt = getChildAt(i3);
                l.b(childAt, "");
                i2 += childAt.getWidth();
                if (i3 == childCount) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 2) {
            throw new IllegalArgumentException("ScrollToOpenLayout must have two child");
        } else if (getChildAt(0) instanceof k) {
            View childAt = getChildAt(0);
            l.b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = -1;
            childAt.setLayoutParams(layoutParams);
        } else {
            throw new IllegalArgumentException("first child must be an instance of NestedScrollingChild2");
        }
    }

    private final double a() {
        if (!i.a(this)) {
            double scrollX = (double) getScrollX();
            double d2 = (double) this.f80695d;
            Double.isNaN(scrollX);
            Double.isNaN(d2);
            return Math.max(0.05d, 1.0d - Math.pow(scrollX / d2, 0.9d));
        }
        double d3 = (double) (-getScrollX());
        double d4 = (double) this.f80695d;
        Double.isNaN(d3);
        Double.isNaN(d4);
        return Math.max(0.05d, 1.0d - Math.pow(d3 / d4, 0.9d));
    }

    public final void setEnable(boolean z) {
        this.f80693b = z;
    }

    public final void setOnScrollToEndListener(b bVar) {
        this.f80698g = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollToOpenLayout(Context context) {
        this(context, null);
        l.d(context, "");
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScrollToOpenLayout f80699a;

        static {
            Covode.recordClassIndex(50190);
        }

        c(ScrollToOpenLayout scrollToOpenLayout) {
            this.f80699a = scrollToOpenLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f80699a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            scrollToOpenLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
        }
    }

    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScrollToOpenLayout f80700a;

        static {
            Covode.recordClassIndex(50191);
        }

        d(ScrollToOpenLayout scrollToOpenLayout) {
            this.f80700a = scrollToOpenLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f80700a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            scrollToOpenLayout.scrollTo(-((Integer) animatedValue).intValue(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScrollToOpenLayout f80701a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f80702b;

        static {
            Covode.recordClassIndex(50192);
        }

        e(ScrollToOpenLayout scrollToOpenLayout, float f2) {
            this.f80701a = scrollToOpenLayout;
            this.f80702b = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f80701a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            scrollToOpenLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScrollToOpenLayout f80703a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f80704b;

        static {
            Covode.recordClassIndex(50193);
        }

        f(ScrollToOpenLayout scrollToOpenLayout, float f2) {
            this.f80703a = scrollToOpenLayout;
            this.f80704b = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f80703a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            scrollToOpenLayout.scrollTo(-((Integer) animatedValue).intValue(), 0);
        }
    }

    private final void a(float f2) {
        if (f2 >= 0.0f) {
            if (!i.a(this)) {
                double d2 = (double) this.f80695d;
                Double.isNaN(d2);
                double d3 = (double) f2;
                Double.isNaN(d3);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) (d2 * 0.66d * d3), 0);
                ofInt.setDuration((long) (600.0f * f2));
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.addUpdateListener(new e(this, f2));
                ofInt.start();
                return;
            }
            double d4 = (double) this.f80695d;
            Double.isNaN(d4);
            double d5 = (double) f2;
            Double.isNaN(d5);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(0, (int) (d4 * 0.66d * d5), 0);
            ofInt2.setDuration((long) (600.0f * f2));
            ofInt2.setInterpolator(new LinearInterpolator());
            ofInt2.addUpdateListener(new f(this, f2));
            ofInt2.start();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollToOpenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(3253);
        super.onMeasure(i2, i3);
        View childAt = getChildAt(1);
        l.b(childAt, "");
        this.f80695d = childAt.getMeasuredWidth();
        MethodCollector.o(3253);
    }

    @Override // androidx.core.h.o
    public final void b(View view, int i2) {
        l.d(view, "");
        this.f80694c.a(i2);
        if (i2 != 0) {
            return;
        }
        if (!i.a(this)) {
            if (getScrollX() > 0) {
                getScrollX();
                ValueAnimator ofInt = ValueAnimator.ofInt(getScrollX(), 0);
                double scrollX = (double) getScrollX();
                double d2 = (double) this.f80695d;
                Double.isNaN(scrollX);
                Double.isNaN(d2);
                ofInt.setDuration((long) ((scrollX / d2) * 200.0d));
                ofInt.addUpdateListener(new c(this));
                ofInt.start();
            }
        } else if (getScrollX() < 0) {
            getScrollX();
            ValueAnimator ofInt2 = ValueAnimator.ofInt(-getScrollX(), 0);
            double d3 = (double) (-getScrollX());
            double d4 = (double) this.f80695d;
            Double.isNaN(d3);
            Double.isNaN(d4);
            ofInt2.setDuration((long) ((d3 / d4) * 200.0d));
            ofInt2.addUpdateListener(new d(this));
            ofInt2.start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ScrollToOpenLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3284);
        this.f80693b = true;
        this.f80694c = new q();
        setOrientation(0);
        MethodCollector.o(3284);
    }

    @Override // androidx.core.h.n
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        l.d(view, "");
        if (!this.f80693b) {
            return false;
        }
        OverScroller overScroller = new OverScroller(view.getContext());
        overScroller.fling(0, 0, (int) f2, (int) f3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.f80696e = overScroller.getFinalX();
        this.f80697f = 0;
        return false;
    }

    @Override // androidx.core.h.o
    public final void b(View view, View view2, int i2, int i3) {
        l.d(view, "");
        l.d(view2, "");
        this.f80694c.a(i2, i3);
    }

    @Override // androidx.core.h.o
    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        l.d(view, "");
        l.d(iArr, "");
        if (!this.f80693b || i4 != 0) {
            return;
        }
        if (!i.a(this)) {
            if (i2 < 0 && getScrollX() > 0) {
                double a2 = a();
                double d2 = (double) i2;
                Double.isNaN(d2);
                scrollBy(Math.max((int) (d2 * a2), -getScrollX()), 0);
                iArr[0] = i2;
            }
        } else if (i2 > 0 && getScrollX() < 0) {
            double a3 = a();
            double d3 = (double) i2;
            Double.isNaN(d3);
            scrollBy(Math.min((int) (d3 * a3), -getScrollX()), 0);
            iArr[0] = i2;
        }
    }

    @Override // androidx.core.h.o
    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        l.d(view, "");
        if (this.f80693b) {
            if (!i.a(this)) {
                if (i6 == 0) {
                    if (i4 > 0) {
                        requestDisallowInterceptTouchEvent(true);
                        double a2 = a();
                        double d2 = (double) i4;
                        Double.isNaN(d2);
                        scrollBy(Math.min((int) (d2 * a2), this.f80695d - getScrollX()), 0);
                    }
                } else if (i2 > 0) {
                    int i7 = this.f80697f + i2;
                    this.f80697f = i7;
                    if (i4 > 0) {
                        int i8 = this.f80696e - i7;
                        Context context = getContext();
                        l.b(context, "");
                        Resources resources = context.getResources();
                        l.b(resources, "");
                        float applyDimension = TypedValue.applyDimension(1, 800.0f, resources.getDisplayMetrics());
                        a(Math.min((float) i8, applyDimension) / applyDimension);
                    }
                } else if (i2 < 0) {
                    int i9 = this.f80697f - i2;
                    this.f80697f = i9;
                    if (i4 < 0) {
                        int i10 = i9 - this.f80696e;
                        Context context2 = getContext();
                        l.b(context2, "");
                        Resources resources2 = context2.getResources();
                        l.b(resources2, "");
                        float applyDimension2 = TypedValue.applyDimension(1, 800.0f, resources2.getDisplayMetrics());
                        a(Math.min((float) i10, applyDimension2) / applyDimension2);
                    }
                }
            } else if (i6 == 0) {
                if (i4 < 0) {
                    requestDisallowInterceptTouchEvent(true);
                    double a3 = a();
                    double d3 = (double) i4;
                    Double.isNaN(d3);
                    scrollBy(Math.max((int) (d3 * a3), (-this.f80695d) - getScrollX()), 0);
                }
            } else if (i2 < 0) {
                int i11 = this.f80697f - i2;
                this.f80697f = i11;
                if (i4 < 0) {
                    int i12 = i11 - this.f80696e;
                    Context context3 = getContext();
                    l.b(context3, "");
                    Resources resources3 = context3.getResources();
                    l.b(resources3, "");
                    float applyDimension3 = TypedValue.applyDimension(1, 800.0f, resources3.getDisplayMetrics());
                    a(Math.min((float) i12, applyDimension3) / applyDimension3);
                }
            }
        }
    }
}
