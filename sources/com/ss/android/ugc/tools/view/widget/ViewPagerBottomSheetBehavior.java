package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.v;
import androidx.customview.a.a;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.p;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

public class ViewPagerBottomSheetBehavior<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a  reason: collision with root package name */
    private float f150299a;

    /* renamed from: b  reason: collision with root package name */
    public float f150300b = 0.5f;

    /* renamed from: c  reason: collision with root package name */
    public int f150301c;

    /* renamed from: d  reason: collision with root package name */
    int f150302d;

    /* renamed from: e  reason: collision with root package name */
    int f150303e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f150304f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f150305g;

    /* renamed from: h  reason: collision with root package name */
    public int f150306h = 4;

    /* renamed from: i  reason: collision with root package name */
    androidx.customview.a.a f150307i;

    /* renamed from: j  reason: collision with root package name */
    int f150308j;

    /* renamed from: k  reason: collision with root package name */
    WeakReference<V> f150309k;

    /* renamed from: l  reason: collision with root package name */
    WeakReference<View> f150310l;

    /* renamed from: m  reason: collision with root package name */
    public a f150311m;
    int n;
    boolean o;
    public double p = 1.0d;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean u;
    private VelocityTracker v;
    private int w;
    private boolean x;
    private final a.AbstractC0038a y = new a.AbstractC0038a() {
        /* class com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.AnonymousClass2 */

        static {
            Covode.recordClassIndex(98877);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int b() {
            int i2;
            int i3;
            if (ViewPagerBottomSheetBehavior.this.f150304f) {
                i2 = ViewPagerBottomSheetBehavior.this.f150308j;
                i3 = ViewPagerBottomSheetBehavior.this.f150302d;
            } else {
                i2 = ViewPagerBottomSheetBehavior.this.f150303e;
                i3 = ViewPagerBottomSheetBehavior.this.f150302d;
            }
            return i2 - i3;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(int i2) {
            if (i2 == 1) {
                ViewPagerBottomSheetBehavior.this.d(1);
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int c(View view, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final boolean b(View view, int i2) {
            View view2;
            if (ViewPagerBottomSheetBehavior.this.f150306h == 1 || ViewPagerBottomSheetBehavior.this.o) {
                return false;
            }
            if ((ViewPagerBottomSheetBehavior.this.f150306h != 3 || ViewPagerBottomSheetBehavior.this.n != i2 || ViewPagerBottomSheetBehavior.this.f150310l == null || (view2 = ViewPagerBottomSheetBehavior.this.f150310l.get()) == null || !view2.canScrollVertically(-1)) && ViewPagerBottomSheetBehavior.this.f150309k != null && ViewPagerBottomSheetBehavior.this.f150309k.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view, int i2, int i3) {
            int i4;
            double d2 = (double) i3;
            Double.isNaN(d2);
            int i5 = i2 - ((int) (d2 * (1.0d - ViewPagerBottomSheetBehavior.this.p)));
            int i6 = ViewPagerBottomSheetBehavior.this.f150302d;
            if (ViewPagerBottomSheetBehavior.this.f150304f) {
                i4 = ViewPagerBottomSheetBehavior.this.f150308j;
            } else {
                i4 = ViewPagerBottomSheetBehavior.this.f150303e;
            }
            return androidx.core.b.a.a(i5, i6, i4);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, float f2, float f3) {
            int i2;
            int i3 = 3;
            if (f3 < 0.0f) {
                i2 = ViewPagerBottomSheetBehavior.this.f150302d;
            } else if (!ViewPagerBottomSheetBehavior.this.f150304f || !ViewPagerBottomSheetBehavior.this.a(view, f3)) {
                if (f3 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f150302d) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f150303e)) {
                        i2 = ViewPagerBottomSheetBehavior.this.f150302d;
                    } else {
                        i2 = ViewPagerBottomSheetBehavior.this.f150303e;
                    }
                } else {
                    i2 = ViewPagerBottomSheetBehavior.this.f150303e;
                }
                i3 = 4;
            } else {
                i2 = ViewPagerBottomSheetBehavior.this.f150308j;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f150307i.a(view.getLeft(), i2)) {
                ViewPagerBottomSheetBehavior.this.d(2);
                v.a(view, new c(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.d(i3);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, int i2, int i3, int i4, int i5) {
            ViewPagerBottomSheetBehavior.this.b();
        }
    };

    public static abstract class a {
        static {
            Covode.recordClassIndex(98880);
        }

        public abstract void a(View view);

        public abstract void a(View view, int i2);
    }

    static {
        Covode.recordClassIndex(98875);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        if (v.o(coordinatorLayout) && !v.o(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        coordinatorLayout.a(v2, i2);
        this.f150308j = coordinatorLayout.getHeight();
        if (this.r) {
            if (this.f150301c == 0) {
                this.f150301c = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            }
            i3 = Math.max(this.f150301c, this.f150308j - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i3 = this.q;
        }
        int max = Math.max(0, this.f150308j - v2.getHeight());
        this.f150302d = max;
        int max2 = Math.max(this.f150308j - i3, max);
        this.f150303e = max2;
        int i4 = this.f150306h;
        if (i4 == 3) {
            int top2 = v2.getTop();
            int i5 = this.f150302d;
            if (top2 != i5) {
                v.d(v2, i5);
            }
        } else if (this.f150304f && i4 == 5) {
            v.d(v2, this.f150308j);
        } else if (i4 == 4) {
            v.d(v2, max2);
        } else if (i4 == 1 || i4 == 2) {
            v.d(v2, top - v2.getTop());
        }
        if (this.f150307i == null) {
            this.f150307i = androidx.customview.a.a.a(coordinatorLayout, this.y);
        }
        this.f150309k = new WeakReference<>(v2);
        this.f150310l = new WeakReference<>(a(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        View view;
        if (!v2.isShown()) {
            this.s = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
        }
        if (this.v == null) {
            this.v = VelocityTracker.obtain();
        }
        this.v.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f150310l;
            if (!(weakReference == null || (view = weakReference.get()) == null || !coordinatorLayout.a(view, x2, this.w))) {
                this.n = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.o = true;
            }
            this.s = this.n == -1 && !coordinatorLayout.a(v2, x2, this.w);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.o = false;
            this.n = -1;
            if (this.s) {
                this.s = false;
                return false;
            }
        }
        if (!this.s && this.f150307i.a(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f150310l;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        return actionMasked == 2 && view2 != null && !this.s && this.f150306h != 1 && !coordinatorLayout.a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.w) - motionEvent.getY()) > ((float) this.f150307i.f2653b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.f150310l;
        if (view == (weakReference != null ? weakReference.get() : null)) {
            return this.f150306h != 3 || super.a(coordinatorLayout, v2, view, f2, f3);
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(98879);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        final int f150316a;

        static {
            Covode.recordClassIndex(98878);
        }

        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f150316a = i2;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f150316a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f150316a);
        }
    }

    private void c() {
        this.n = -1;
        VelocityTracker velocityTracker = this.v;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.v = null;
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f150321b;

        /* renamed from: c  reason: collision with root package name */
        private final int f150322c;

        static {
            Covode.recordClassIndex(98883);
        }

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f150307i == null || !ViewPagerBottomSheetBehavior.this.f150307i.c()) {
                ViewPagerBottomSheetBehavior.this.d(this.f150322c);
            } else {
                v.a(this.f150321b, this);
            }
        }

        c(View view, int i2) {
            this.f150321b = view;
            this.f150322c = i2;
        }
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        a aVar;
        V v2 = this.f150309k.get();
        if (v2 != null && (aVar = this.f150311m) != null) {
            aVar.a(v2);
        }
    }

    static class b extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPagerBottomSheetBehavior f150317a;

        /* renamed from: b  reason: collision with root package name */
        private final ViewPager f150318b;

        static {
            Covode.recordClassIndex(98881);
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            this.f150318b.post(new Runnable() {
                /* class com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(98882);
                }

                public final void run() {
                    if (b.this.f150317a.f150309k != null) {
                        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = b.this.f150317a;
                        viewPagerBottomSheetBehavior.f150310l = new WeakReference<>(viewPagerBottomSheetBehavior.a(viewPagerBottomSheetBehavior.f150309k.get()));
                    }
                }
            });
        }

        private b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f150318b = viewPager;
            this.f150317a = viewPagerBottomSheetBehavior;
        }

        /* synthetic */ b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, byte b2) {
            this(viewPager, viewPagerBottomSheetBehavior);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        a aVar;
        if (this.f150306h != i2) {
            this.f150306h = i2;
            V v2 = this.f150309k.get();
            if (v2 != null && (aVar = this.f150311m) != null) {
                aVar.a(v2, i2);
            }
        }
    }

    public ViewPagerBottomSheetBehavior(Context context) {
        super(context, null);
        b(-1);
        this.f150299a = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new b(viewPager, this, (byte) 0));
    }

    public final void b(int i2) {
        WeakReference<V> weakReference;
        V v2;
        if (i2 == -1) {
            if (!this.r) {
                this.r = true;
            } else {
                return;
            }
        } else if (this.r || this.q != i2) {
            this.r = false;
            this.q = Math.max(0, i2);
            this.f150303e = this.f150308j - i2;
        } else {
            return;
        }
        if (this.f150306h == 4 && (weakReference = this.f150309k) != null && (v2 = weakReference.get()) != null) {
            v2.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public final View a(View view) {
        if (view == null) {
            return null;
        }
        if (this.x) {
            WeakReference<View> weakReference = this.f150310l;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        } else if (v.t(view)) {
            return view;
        } else {
            if (view instanceof ViewPager) {
                View a2 = a(p.a.a((ViewPager) view));
                if (a2 != null) {
                    return a2;
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getVisibility() == 0) {
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View a3 = a(viewGroup.getChildAt(i2));
                        if (a3 != null) {
                            return a3;
                        }
                    }
                }
            }
            return null;
        }
    }

    public final void c(final int i2) {
        if (i2 != this.f150306h) {
            WeakReference<V> weakReference = this.f150309k;
            if (weakReference != null) {
                final V v2 = weakReference.get();
                if (v2 != null) {
                    ViewParent parent = v2.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !v.y(v2)) {
                        b(v2, i2);
                    } else {
                        v2.post(new Runnable() {
                            /* class com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(98876);
                            }

                            public final void run() {
                                ViewPagerBottomSheetBehavior.this.b(v2, i2);
                            }
                        });
                    }
                }
            } else if (i2 == 4 || i2 == 3 || (this.f150304f && i2 == 5)) {
                this.f150306h = i2;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(int i2) {
        this.t = 0;
        this.u = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.a(coordinatorLayout, (View) v2), this.f150306h);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k8, R.attr.k9, R.attr.kb, R.attr.kc});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            b(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            b(peekValue.data);
        }
        this.f150304f = obtainStyledAttributes.getBoolean(1, false);
        this.f150305g = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f150299a = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: package-private */
    public final void b(View view, int i2) {
        int i3;
        if (i2 == 4) {
            i3 = this.f150303e;
        } else if (i2 == 3) {
            i3 = this.f150302d;
        } else if (!this.f150304f || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i2)));
        } else {
            i3 = this.f150308j;
        }
        if (this.f150307i.a(view, view.getLeft(), i3)) {
            d(2);
            v.a(view, new c(view, i2));
            return;
        }
        d(i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(V v2, View view) {
        int i2;
        int i3 = 3;
        if (v2.getTop() == this.f150302d) {
            d(3);
            return;
        }
        WeakReference<View> weakReference = this.f150310l;
        if (weakReference != null && view == weakReference.get() && this.u) {
            if (this.t > 0) {
                i2 = this.f150302d;
            } else {
                if (this.f150304f) {
                    this.v.computeCurrentVelocity(1000, this.f150299a);
                    if (a(v2, this.v.getYVelocity(this.n))) {
                        i2 = this.f150308j;
                        i3 = 5;
                    }
                }
                if (this.t == 0) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f150302d) < Math.abs(top - this.f150303e)) {
                        i2 = this.f150302d;
                    } else {
                        i2 = this.f150303e;
                    }
                } else {
                    i2 = this.f150303e;
                }
                i3 = 4;
            }
            if (this.f150307i.a((View) v2, v2.getLeft(), i2)) {
                d(2);
                v.a(v2, new c(v2, i3));
            } else {
                d(i3);
            }
            this.u = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (this.f150305g) {
            return true;
        }
        if (view.getTop() >= this.f150303e && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f150303e)) / ((float) this.q) > this.f150300b) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, v2, savedState.f2667d);
        if (savedState.f150316a == 1 || savedState.f150316a == 2) {
            this.f150306h = 4;
        } else {
            this.f150306h = savedState.f150316a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[RETURN] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr) {
        View view2;
        WeakReference<View> weakReference = this.f150310l;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view == view2) {
            int top = v2.getTop();
            int i4 = top - i3;
            if (i3 > 0) {
                int i5 = this.f150302d;
                if (i4 < i5) {
                    iArr[1] = top - i5;
                    v.d(v2, -iArr[1]);
                    d(3);
                } else {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    d(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.f150303e;
                if (i4 <= i6 || this.f150304f) {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    d(1);
                } else {
                    iArr[1] = top - i6;
                    v.d(v2, -iArr[1]);
                    d(4);
                }
            }
            v2.getTop();
            b();
            this.t = i3;
            this.u = true;
        }
    }
}
