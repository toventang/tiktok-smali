package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

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
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

public class ViewPagerBottomSheetBehavior<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f68165a;

    /* renamed from: b  reason: collision with root package name */
    int f68166b;

    /* renamed from: c  reason: collision with root package name */
    int f68167c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f68168d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f68169e;

    /* renamed from: f  reason: collision with root package name */
    public int f68170f = 4;

    /* renamed from: g  reason: collision with root package name */
    androidx.customview.a.a f68171g;

    /* renamed from: h  reason: collision with root package name */
    int f68172h;

    /* renamed from: i  reason: collision with root package name */
    WeakReference<V> f68173i;

    /* renamed from: j  reason: collision with root package name */
    WeakReference<View> f68174j;

    /* renamed from: k  reason: collision with root package name */
    public a f68175k;

    /* renamed from: l  reason: collision with root package name */
    int f68176l;

    /* renamed from: m  reason: collision with root package name */
    boolean f68177m;
    private float n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean s;
    private VelocityTracker t;
    private int u;
    private boolean v;
    private final a.AbstractC0038a w = new a.AbstractC0038a() {
        /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.AnonymousClass1 */

        static {
            Covode.recordClassIndex(42000);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int b() {
            int i2;
            int i3;
            if (ViewPagerBottomSheetBehavior.this.f68168d) {
                i2 = ViewPagerBottomSheetBehavior.this.f68172h;
                i3 = ViewPagerBottomSheetBehavior.this.f68166b;
            } else {
                i2 = ViewPagerBottomSheetBehavior.this.f68167c;
                i3 = ViewPagerBottomSheetBehavior.this.f68166b;
            }
            return i2 - i3;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(int i2) {
            if (i2 == 1) {
                ViewPagerBottomSheetBehavior.this.c(1);
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int c(View view, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final boolean b(View view, int i2) {
            View view2;
            if (ViewPagerBottomSheetBehavior.this.f68170f == 1 || ViewPagerBottomSheetBehavior.this.f68177m) {
                return false;
            }
            if ((ViewPagerBottomSheetBehavior.this.f68170f != 3 || ViewPagerBottomSheetBehavior.this.f68176l != i2 || (view2 = ViewPagerBottomSheetBehavior.this.f68174j.get()) == null || !view2.canScrollVertically(-1)) && ViewPagerBottomSheetBehavior.this.f68173i != null && ViewPagerBottomSheetBehavior.this.f68173i.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view, int i2, int i3) {
            int i4;
            int i5 = ViewPagerBottomSheetBehavior.this.f68166b;
            if (ViewPagerBottomSheetBehavior.this.f68168d) {
                i4 = ViewPagerBottomSheetBehavior.this.f68172h;
            } else {
                i4 = ViewPagerBottomSheetBehavior.this.f68167c;
            }
            return androidx.core.b.a.a(i2, i5, i4);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, float f2, float f3) {
            int i2;
            int i3 = 3;
            if (f3 < 0.0f) {
                i2 = ViewPagerBottomSheetBehavior.this.f68166b;
            } else if (!ViewPagerBottomSheetBehavior.this.f68168d || !ViewPagerBottomSheetBehavior.this.a(view, f3)) {
                if (f3 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f68166b) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f68167c)) {
                        i2 = ViewPagerBottomSheetBehavior.this.f68166b;
                    } else {
                        i2 = ViewPagerBottomSheetBehavior.this.f68167c;
                    }
                } else {
                    i2 = ViewPagerBottomSheetBehavior.this.f68167c;
                }
                i3 = 4;
            } else {
                i2 = ViewPagerBottomSheetBehavior.this.f68172h;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f68171g.a(view.getLeft(), i2)) {
                ViewPagerBottomSheetBehavior.this.c(2);
                v.a(view, new c(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.c(i3);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, int i2, int i3, int i4, int i5) {
            ViewPagerBottomSheetBehavior.this.d(i3);
        }
    };

    public static abstract class a {
        static {
            Covode.recordClassIndex(42003);
        }

        public abstract void a(View view, float f2);

        public abstract void a(View view, int i2);
    }

    static {
        Covode.recordClassIndex(41999);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        if (v.o(coordinatorLayout) && !v.o(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        coordinatorLayout.a(v2, i2);
        this.f68172h = coordinatorLayout.getHeight();
        if (this.p) {
            if (this.f68165a == 0) {
                this.f68165a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            }
            i3 = Math.max(this.f68165a, this.f68172h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i3 = this.o;
        }
        int max = Math.max(0, this.f68172h - v2.getHeight());
        this.f68166b = max;
        int max2 = Math.max(this.f68172h - i3, max);
        this.f68167c = max2;
        int i4 = this.f68170f;
        if (i4 == 3) {
            v.d(v2, this.f68166b);
        } else if (this.f68168d && i4 == 5) {
            v.d(v2, this.f68172h);
        } else if (i4 == 4) {
            v.d(v2, max2);
        } else if (i4 == 1 || i4 == 2) {
            v.d(v2, top - v2.getTop());
        }
        if (this.f68171g == null) {
            this.f68171g = androidx.customview.a.a.a(coordinatorLayout, this.w);
        }
        this.f68173i = new WeakReference<>(v2);
        this.f68174j = new WeakReference<>(c(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean a(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        View view;
        if (!v2.isShown()) {
            this.q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.u = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f68174j;
            if (!(weakReference == null || (view = weakReference.get()) == null || !coordinatorLayout.a(view, x, this.u))) {
                this.f68176l = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f68177m = true;
            }
            this.q = this.f68176l == -1 && !coordinatorLayout.a(v2, x, this.u);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f68177m = false;
            this.f68176l = -1;
            if (this.q) {
                this.q = false;
                return false;
            }
        }
        if (!this.q && this.f68171g.a(motionEvent)) {
            return true;
        }
        View view2 = this.f68174j.get();
        return actionMasked == 2 && view2 != null && !this.q && this.f68170f != 1 && !coordinatorLayout.a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.u) - motionEvent.getY()) > ((float) this.f68171g.f2653b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        if (view == this.f68174j.get()) {
            return this.f68170f != 3 || super.a(coordinatorLayout, v2, view, f2, f3);
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(42002);
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
        final int f68179a;

        static {
            Covode.recordClassIndex(42001);
        }

        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f68179a = i2;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f68179a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f68179a);
        }
    }

    public ViewPagerBottomSheetBehavior() {
    }

    private void c() {
        this.f68176l = -1;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f68184b;

        /* renamed from: c  reason: collision with root package name */
        private final int f68185c;

        static {
            Covode.recordClassIndex(42006);
        }

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f68171g == null || !ViewPagerBottomSheetBehavior.this.f68171g.c()) {
                ViewPagerBottomSheetBehavior.this.c(this.f68185c);
            } else {
                v.a(this.f68184b, this);
            }
        }

        c(View view, int i2) {
            this.f68184b = view;
            this.f68185c = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f68174j = new WeakReference<>(c(this.f68173i.get()));
    }

    static class b extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPagerBottomSheetBehavior f68180a;

        /* renamed from: b  reason: collision with root package name */
        private final ViewPager f68181b;

        static {
            Covode.recordClassIndex(42004);
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            this.f68181b.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(42005);
                }

                public final void run() {
                    if (b.this.f68180a.f68173i != null) {
                        b.this.f68180a.b();
                    }
                }
            });
        }

        private b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f68181b = viewPager;
            this.f68180a = viewPagerBottomSheetBehavior;
        }

        /* synthetic */ b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, byte b2) {
            this(viewPager, viewPagerBottomSheetBehavior);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        a aVar;
        if (this.f68170f != i2) {
            this.f68170f = i2;
            V v2 = this.f68173i.get();
            if (v2 != null && (aVar = this.f68175k) != null) {
                aVar.a((View) v2, i2);
            }
        }
    }

    public static <V extends View> ViewPagerBottomSheetBehavior<V> a(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.e) {
            CoordinatorLayout.b bVar = ((CoordinatorLayout.e) layoutParams).f2100a;
            if (bVar instanceof ViewPagerBottomSheetBehavior) {
                return (ViewPagerBottomSheetBehavior) bVar;
            }
            throw new IllegalArgumentException("The view is not associated with ViewPagerBottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void b(int i2) {
        WeakReference<V> weakReference;
        V v2;
        if (i2 == -1) {
            if (!this.p) {
                this.p = true;
            } else {
                return;
            }
        } else if (this.p || this.o != i2) {
            this.p = false;
            this.o = Math.max(0, i2);
            this.f68167c = this.f68172h - i2;
        } else {
            return;
        }
        if (this.f68170f == 4 && (weakReference = this.f68173i) != null && (v2 = weakReference.get()) != null) {
            v2.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        a aVar;
        V v2 = this.f68173i.get();
        if (v2 != null && (aVar = this.f68175k) != null) {
            int i3 = this.f68167c;
            if (i2 > i3) {
                aVar.a(v2, ((float) (i3 - i2)) / ((float) (this.f68172h - i3)));
            } else {
                aVar.a(v2, ((float) (i3 - i2)) / ((float) (i3 - this.f68166b)));
            }
        }
    }

    private View c(View view) {
        if (view == null) {
            return null;
        }
        if (this.v) {
            return this.f68174j.get();
        }
        if (v.t(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View c2 = c(a.a((ViewPager) view));
            if (c2 != null) {
                return c2;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View c3 = c(viewGroup.getChildAt(i2));
                    if (c3 != null) {
                        return c3;
                    }
                }
            }
        }
        return null;
    }

    public final void b(View view) {
        V v2 = this.f68173i.get();
        if (v2 != null) {
            if (view != null) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == v2) {
                        View c2 = c(view);
                        if (c2 != null) {
                            this.f68174j = new WeakReference<>(c2);
                            this.v = true;
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("child is not a child of current View.");
            }
            if (this.v) {
                this.v = false;
                b();
            }
        }
    }

    public final void a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new b(viewPager, this, (byte) 0));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(int i2) {
        this.r = 0;
        this.s = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.a(coordinatorLayout, (View) v2), this.f68170f);
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
        this.f68168d = obtainStyledAttributes.getBoolean(1, false);
        this.f68169e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(V v2, View view) {
        int i2;
        int i3 = 3;
        if (v2.getTop() == this.f68166b) {
            c(3);
            return;
        }
        WeakReference<View> weakReference = this.f68174j;
        if (weakReference != null && view == weakReference.get() && this.s) {
            if (this.r > 0) {
                i2 = this.f68166b;
            } else {
                if (this.f68168d) {
                    this.t.computeCurrentVelocity(1000, this.n);
                    if (a(v2, this.t.getYVelocity(this.f68176l))) {
                        i2 = this.f68172h;
                        i3 = 5;
                    }
                }
                if (this.r == 0) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f68166b) < Math.abs(top - this.f68167c)) {
                        i2 = this.f68166b;
                    } else {
                        i2 = this.f68167c;
                    }
                } else {
                    i2 = this.f68167c;
                }
                i3 = 4;
            }
            if (this.f68171g.a((View) v2, v2.getLeft(), i2)) {
                c(2);
                v.a(v2, new c(v2, i3));
            } else {
                c(i3);
            }
            this.s = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (this.f68169e) {
            return true;
        }
        if (view.getTop() >= this.f68167c && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f68167c)) / ((float) this.o) > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, v2, savedState.f2667d);
        if (savedState.f68179a == 1 || savedState.f68179a == 2) {
            this.f68170f = 4;
        } else {
            this.f68170f = savedState.f68179a;
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr) {
        if (view == this.f68174j.get()) {
            int top = v2.getTop();
            int i4 = top - i3;
            if (i3 > 0) {
                int i5 = this.f68166b;
                if (i4 < i5) {
                    iArr[1] = top - i5;
                    v.d(v2, -iArr[1]);
                    c(3);
                } else {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    c(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.f68167c;
                if (i4 <= i6 || this.f68168d) {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    c(1);
                } else {
                    iArr[1] = top - i6;
                    v.d(v2, -iArr[1]);
                    c(4);
                }
            }
            d(v2.getTop());
            this.r = i3;
            this.s = true;
        }
    }
}
