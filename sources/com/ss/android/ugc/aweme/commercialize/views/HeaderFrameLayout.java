package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.af;
import h.f.b.l;
import h.j.h;
import java.util.Iterator;
import java.util.Objects;

public class HeaderFrameLayout extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final a f75879e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f75880a;

    /* renamed from: b  reason: collision with root package name */
    public int f75881b;

    /* renamed from: c  reason: collision with root package name */
    public int f75882c;

    /* renamed from: d  reason: collision with root package name */
    public Animator f75883d;

    /* renamed from: f  reason: collision with root package name */
    private int f75884f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f75885g;

    /* renamed from: h  reason: collision with root package name */
    private int f75886h;

    /* renamed from: i  reason: collision with root package name */
    private int f75887i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f75888j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f75889k;

    static {
        Covode.recordClassIndex(46795);
    }

    /* access modifiers changed from: protected */
    public boolean getCanScaleContent() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean getCanScroll() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46796);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final View getHeader() {
        return this.f75880a;
    }

    public final int getHeaderId() {
        return this.f75884f;
    }

    public final int getScrollOffset() {
        return this.f75885g;
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HeaderFrameLayout f75890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f75891b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HeaderFrameLayout f75892c;

        static {
            Covode.recordClassIndex(46797);
        }

        public b(HeaderFrameLayout headerFrameLayout, View view, HeaderFrameLayout headerFrameLayout2) {
            this.f75890a = headerFrameLayout;
            this.f75891b = view;
            this.f75892c = headerFrameLayout2;
        }

        public final void run() {
            if (this.f75891b.getMeasuredHeight() <= 0) {
                HeaderFrameLayout headerFrameLayout = this.f75890a;
                headerFrameLayout.measureChild(this.f75891b, headerFrameLayout.f75881b, this.f75890a.f75882c);
            }
            final ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f75890a, "scrollOffset", this.f75892c.getScrollOffset(), this.f75891b.getMeasuredHeight());
            l.b(ofInt, "");
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f75893a;

                static {
                    Covode.recordClassIndex(46798);
                }

                {
                    this.f75893a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HeaderFrameLayout headerFrameLayout = this.f75893a.f75890a;
                    l.b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    headerFrameLayout.setScrollOffset(((Integer) animatedValue).intValue());
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this) {
                /* class com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.b.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f75894a;

                static {
                    Covode.recordClassIndex(46799);
                }

                public final void onAnimationCancel(Animator animator) {
                    this.f75894a.f75890a.f75883d = null;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f75894a.f75890a.f75883d = null;
                }

                {
                    this.f75894a = r1;
                }

                public final void onAnimationStart(Animator animator, boolean z) {
                    Animator animator2 = this.f75894a.f75890a.f75883d;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f75894a.f75890a.f75883d = ofInt;
                }
            });
            ofInt.start();
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HeaderFrameLayout f75896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f75897b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HeaderFrameLayout f75898c;

        static {
            Covode.recordClassIndex(46800);
        }

        public c(HeaderFrameLayout headerFrameLayout, View view, HeaderFrameLayout headerFrameLayout2) {
            this.f75896a = headerFrameLayout;
            this.f75897b = view;
            this.f75898c = headerFrameLayout2;
        }

        public final void run() {
            if (this.f75897b.getMeasuredHeight() <= 0) {
                HeaderFrameLayout headerFrameLayout = this.f75896a;
                headerFrameLayout.measureChild(this.f75897b, headerFrameLayout.f75881b, this.f75896a.f75882c);
            }
            final ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f75896a, "scrollOffset", this.f75898c.getScrollOffset(), 0);
            l.b(ofInt, "");
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f75899a;

                static {
                    Covode.recordClassIndex(46801);
                }

                {
                    this.f75899a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HeaderFrameLayout headerFrameLayout = this.f75899a.f75896a;
                    l.b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    headerFrameLayout.setScrollOffset(((Integer) animatedValue).intValue());
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this) {
                /* class com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.c.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f75900a;

                static {
                    Covode.recordClassIndex(46802);
                }

                public final void onAnimationCancel(Animator animator) {
                    this.f75900a.f75896a.f75883d = null;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f75900a.f75896a.f75883d = null;
                }

                {
                    this.f75900a = r1;
                }

                public final void onAnimationStart(Animator animator, boolean z) {
                    Animator animator2 = this.f75900a.f75896a.f75883d;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f75900a.f75896a.f75883d = ofInt;
                }
            });
            ofInt.start();
        }
    }

    public final void setScrollOffset(int i2) {
        if (this.f75885g != i2) {
            this.f75885g = i2;
            requestLayout();
        }
    }

    public void onViewRemoved(View view) {
        l.d(view, "");
        super.onViewRemoved(view);
        if (l.a(this.f75880a, view)) {
            this.f75880a = null;
        }
    }

    public final void setHeaderId(int i2) {
        if (this.f75884f != i2) {
            View findViewById = findViewById(i2);
            if (!l.a(this.f75880a, findViewById)) {
                this.f75880a = findViewById;
                requestLayout();
            }
            this.f75884f = i2;
        }
    }

    public void onViewAdded(View view) {
        l.d(view, "");
        super.onViewAdded(view);
        if (this.f75884f != -1 && view.getId() == this.f75884f) {
            if (this.f75880a == null) {
                this.f75880a = view;
                return;
            }
            throw new RuntimeException("dup header");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(12213);
        this.f75881b = i2;
        this.f75882c = i3;
        super.onMeasure(i2, i3);
        MethodCollector.o(12213);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(12354);
        MethodCollector.o(12354);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingLeft = i2 + getPaddingLeft();
        int paddingTop = i3 + getPaddingTop();
        int paddingRight = i4 - getPaddingRight();
        int paddingBottom = i5 - getPaddingBottom();
        Iterator it = h.a(0, getChildCount()).iterator();
        while (it.hasNext()) {
            View childAt = getChildAt(((af) it).a());
            l.b(childAt, "");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (layoutParams2.gravity == -1) {
                    i6 = 8388659;
                } else {
                    i6 = layoutParams2.gravity;
                }
                int i14 = Build.VERSION.SDK_INT;
                int absoluteGravity = Gravity.getAbsoluteGravity(i6, getLayoutDirection());
                int i15 = absoluteGravity & 7;
                int i16 = absoluteGravity & 112;
                if (i15 == 1) {
                    i7 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams2.leftMargin;
                    i8 = layoutParams2.rightMargin;
                    i9 = i7 - i8;
                } else if (i15 != 5) {
                    i9 = paddingLeft;
                } else {
                    i7 = paddingRight - measuredWidth;
                    i8 = layoutParams2.rightMargin;
                    i9 = i7 - i8;
                }
                if (i16 == 16) {
                    i10 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams2.topMargin;
                    i11 = layoutParams2.bottomMargin;
                    i12 = i10 - i11;
                } else if (i16 != 80) {
                    i12 = layoutParams2.topMargin + paddingTop;
                } else {
                    i10 = paddingBottom - measuredHeight;
                    i11 = layoutParams2.bottomMargin;
                    i12 = i10 - i11;
                }
                int i17 = measuredWidth + i9;
                int i18 = measuredHeight + i12;
                l.d(childAt, "");
                if (l.a(childAt, this.f75880a)) {
                    i13 = this.f75885g - childAt.getMeasuredHeight();
                    i12 += i13;
                } else {
                    if (this.f75880a != null) {
                        i12 += this.f75885g;
                        if (!getCanScaleContent()) {
                            i13 = this.f75885g;
                        }
                    }
                    childAt.layout(i9, i12, i17, i18);
                }
                i18 += i13;
                childAt.layout(i9, i12, i17, i18);
            }
        }
    }
}
