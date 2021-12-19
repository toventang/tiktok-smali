package com.bytedance.android.live.design.view.sheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
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
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LiveBottomSheetBehavior<V extends View> extends CoordinatorLayout.b<V> {
    private static final int A = R.style.ra;
    private boolean B;
    private int C;
    private boolean D;
    private int E;
    private int F;
    private final ArrayList<a> G = new ArrayList<>();
    private VelocityTracker H;
    private int I;
    private Map<View, Integer> J;
    private int K = -1;
    private int L = -1;
    private float M;
    private int N = -1;
    private float O;
    private int P = -1;
    private float Q;
    private float R;
    private final a.AbstractC0038a S = new a.AbstractC0038a() {
        /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AnonymousClass2 */

        static {
            Covode.recordClassIndex(4829);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int b() {
            if (LiveBottomSheetBehavior.this.f9510k) {
                return LiveBottomSheetBehavior.this.q;
            }
            return LiveBottomSheetBehavior.this.f9508i;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(int i2) {
            if (i2 == 1 && LiveBottomSheetBehavior.this.f9512m) {
                LiveBottomSheetBehavior.this.d(1);
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int c(View view, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final boolean b(View view, int i2) {
            View view2;
            if (LiveBottomSheetBehavior.this.n == 1 || LiveBottomSheetBehavior.this.u) {
                return false;
            }
            if ((LiveBottomSheetBehavior.this.n != 3 || LiveBottomSheetBehavior.this.t != i2 || LiveBottomSheetBehavior.this.s == null || (view2 = LiveBottomSheetBehavior.this.s.get()) == null || !view2.canScrollVertically(-1)) && LiveBottomSheetBehavior.this.r != null && LiveBottomSheetBehavior.this.r.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view, int i2, int i3) {
            int i4;
            int b2 = LiveBottomSheetBehavior.this.b();
            if (LiveBottomSheetBehavior.this.f9510k) {
                i4 = LiveBottomSheetBehavior.this.q;
            } else {
                i4 = LiveBottomSheetBehavior.this.f9508i;
            }
            return androidx.core.b.a.a(i2, b2, i4);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, float f2, float f3) {
            int i2;
            int i3 = 4;
            if (f3 < 0.0f || LiveBottomSheetBehavior.this.b(view, f3)) {
                if (LiveBottomSheetBehavior.this.f9501b) {
                    i2 = LiveBottomSheetBehavior.this.f9505f;
                } else if (view.getTop() > LiveBottomSheetBehavior.this.f9506g) {
                    i2 = LiveBottomSheetBehavior.this.f9506g;
                    i3 = 6;
                    LiveBottomSheetBehavior.this.a(view, i3, i2, true);
                } else {
                    i2 = LiveBottomSheetBehavior.this.f9504e;
                }
            } else if (LiveBottomSheetBehavior.this.f9510k && LiveBottomSheetBehavior.this.a(view, f3)) {
                i2 = LiveBottomSheetBehavior.this.q;
                i3 = 5;
                LiveBottomSheetBehavior.this.a(view, i3, i2, true);
            } else if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                int top = view.getTop();
                if (!LiveBottomSheetBehavior.this.f9501b) {
                    if (top < LiveBottomSheetBehavior.this.f9506g) {
                        if (top < Math.abs(top - LiveBottomSheetBehavior.this.f9508i)) {
                            i2 = LiveBottomSheetBehavior.this.f9504e;
                        } else {
                            i2 = LiveBottomSheetBehavior.this.f9506g;
                        }
                    } else if (Math.abs(top - LiveBottomSheetBehavior.this.f9506g) < Math.abs(top - LiveBottomSheetBehavior.this.f9508i)) {
                        i2 = LiveBottomSheetBehavior.this.f9506g;
                    } else {
                        i2 = LiveBottomSheetBehavior.this.f9508i;
                        LiveBottomSheetBehavior.this.a(view, i3, i2, true);
                    }
                    i3 = 6;
                    LiveBottomSheetBehavior.this.a(view, i3, i2, true);
                } else if (Math.abs(top - LiveBottomSheetBehavior.this.f9505f) < Math.abs(top - LiveBottomSheetBehavior.this.f9508i)) {
                    i2 = LiveBottomSheetBehavior.this.f9505f;
                } else {
                    i2 = LiveBottomSheetBehavior.this.f9508i;
                    LiveBottomSheetBehavior.this.a(view, i3, i2, true);
                }
            } else {
                if (!LiveBottomSheetBehavior.this.f9501b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - LiveBottomSheetBehavior.this.f9506g) < Math.abs(top2 - LiveBottomSheetBehavior.this.f9508i)) {
                        i2 = LiveBottomSheetBehavior.this.f9506g;
                        i3 = 6;
                        LiveBottomSheetBehavior.this.a(view, i3, i2, true);
                    }
                }
                i2 = LiveBottomSheetBehavior.this.f9508i;
                LiveBottomSheetBehavior.this.a(view, i3, i2, true);
            }
            i3 = 3;
            LiveBottomSheetBehavior.this.a(view, i3, i2, true);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, int i2, int i3, int i4, int i5) {
            LiveBottomSheetBehavior.this.e(i3);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f9500a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9501b = true;

    /* renamed from: c  reason: collision with root package name */
    public int f9502c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f9503d;

    /* renamed from: e  reason: collision with root package name */
    int f9504e;

    /* renamed from: f  reason: collision with root package name */
    int f9505f;

    /* renamed from: g  reason: collision with root package name */
    int f9506g;

    /* renamed from: h  reason: collision with root package name */
    public float f9507h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    int f9508i;

    /* renamed from: j  reason: collision with root package name */
    float f9509j = -1.0f;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9510k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9511l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9512m = true;
    public int n = 4;
    androidx.customview.a.a o;
    int p;
    public int q;
    WeakReference<V> r;
    WeakReference<View> s;
    int t;
    boolean u;
    private boolean v;
    private float w;
    private boolean x;
    private int y;
    private LiveBottomSheetBehavior<V>.b z;

    public static abstract class a {
        static {
            Covode.recordClassIndex(4832);
        }

        public abstract void a(View view, float f2);

        public abstract void a(View view, int i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(V v2, int i2) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4, int i5) {
        int i6 = v2.getContext().getResources().getConfiguration().orientation;
        int size = View.MeasureSpec.getSize(i4);
        if (i6 == 1) {
            int i7 = this.L;
            if (i7 == -1) {
                float f2 = this.M;
                i7 = f2 > 0.0f ? (int) (f2 * ((float) size)) : -1;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
            if (i7 != -1) {
                v2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                return true;
            }
            int i8 = this.P;
            if (i8 == -1) {
                float f3 = this.Q;
                if (f3 > 0.0f) {
                    i8 = (int) (((float) size) * f3);
                }
                return super.a(coordinatorLayout, v2, i2, i3, i4, i5);
            }
            if (i8 != -1) {
                v2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE));
                return true;
            }
            return super.a(coordinatorLayout, v2, i2, i3, i4, i5);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        v2.measure(makeMeasureSpec, ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin + i5, marginLayoutParams2.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        if (v.o(coordinatorLayout) && !v.o(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.r == null) {
            this.r = new WeakReference<>(v2);
            if (v.d(v2) == 0) {
                v.a((View) v2, 1);
            }
        }
        if (this.o == null) {
            this.o = androidx.customview.a.a.a(coordinatorLayout, this.S);
        }
        int top = v2.getTop();
        coordinatorLayout.a(v2, i2);
        this.p = coordinatorLayout.getWidth();
        this.q = coordinatorLayout.getHeight();
        int height = v2.getHeight();
        this.E = height;
        int i3 = this.q;
        this.F = (int) (((float) i3) * 0.15f);
        if (i3 - height < this.y) {
            this.E = i3;
        }
        this.f9505f = Math.max(0, i3 - this.E);
        this.f9506g = (int) (((float) this.q) * (1.0f - this.f9507h));
        e();
        int i4 = this.n;
        if (i4 == 3) {
            v.d(v2, b());
        } else if (i4 == 6) {
            v.d(v2, this.f9506g);
        } else if (this.f9510k && i4 == 5) {
            v.d(v2, this.q);
        } else if (i4 == 4) {
            v.d(v2, this.f9508i);
        } else if (i4 == 1 || i4 == 2) {
            v.d(v2, top - v2.getTop());
        }
        this.s = new WeakReference<>(b(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean a(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        WeakReference<View> weakReference;
        View view;
        androidx.customview.a.a aVar;
        if (!v2.isShown() || !this.f9512m) {
            this.B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            f();
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.I = (int) motionEvent.getY();
            if (!(this.n == 2 || (weakReference = this.s) == null || (view = weakReference.get()) == null || !coordinatorLayout.a(view, x2, this.I))) {
                this.t = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.u = true;
            }
            this.B = this.t == -1 && !coordinatorLayout.a(v2, x2, this.I);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.u = false;
            this.t = -1;
            if (this.B) {
                this.B = false;
                return false;
            }
        }
        if (!this.B && (aVar = this.o) != null && aVar.a(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.s;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        return actionMasked == 2 && view2 != null && !this.B && this.n != 1 && !coordinatorLayout.a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.o != null && Math.abs(((float) this.I) - motionEvent.getY()) > ((float) this.o.f2653b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.C = 0;
        this.D = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.s;
        if (weakReference == null || view != weakReference.get() || (this.n == 3 && !super.a(coordinatorLayout, v2, view, f2, f3))) {
            return false;
        }
        return true;
    }

    public final void a(boolean z2) {
        if (this.f9501b != z2) {
            this.f9501b = z2;
            if (this.r != null) {
                e();
            }
            d((!this.f9501b || this.n != 6) ? this.n : 3);
        }
    }

    public final void a(a aVar) {
        if (!this.G.contains(aVar)) {
            this.G.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (this.f9511l) {
            return true;
        }
        if (view.getTop() < this.f9508i) {
            return false;
        }
        int d2 = d();
        float abs = Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f9508i));
        if (abs > ((float) this.F) || abs / ((float) d2) > 0.25f) {
            return true;
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4831);
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
        final int f9517a;

        /* renamed from: b  reason: collision with root package name */
        int f9518b;

        /* renamed from: e  reason: collision with root package name */
        boolean f9519e;

        /* renamed from: f  reason: collision with root package name */
        boolean f9520f;

        /* renamed from: g  reason: collision with root package name */
        boolean f9521g;

        static {
            Covode.recordClassIndex(4830);
        }

        public SavedState(Parcelable parcelable, LiveBottomSheetBehavior<?> liveBottomSheetBehavior) {
            super(parcelable);
            this.f9517a = liveBottomSheetBehavior.n;
            this.f9518b = liveBottomSheetBehavior.f9502c;
            this.f9519e = liveBottomSheetBehavior.f9501b;
            this.f9520f = liveBottomSheetBehavior.f9510k;
            this.f9521g = liveBottomSheetBehavior.f9511l;
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f9517a);
            parcel.writeInt(this.f9518b);
            parcel.writeInt(this.f9519e ? 1 : 0);
            parcel.writeInt(this.f9520f ? 1 : 0);
            parcel.writeInt(this.f9521g ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            boolean z2;
            this.f9517a = parcel.readInt();
            this.f9518b = parcel.readInt();
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f9519e = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f9520f = z2;
            this.f9521g = parcel.readInt() == 1 ? true : z3;
        }
    }

    static {
        Covode.recordClassIndex(4827);
    }

    private void f() {
        this.t = -1;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
    }

    public final int b() {
        if (this.f9501b) {
            return this.f9505f;
        }
        return this.f9504e;
    }

    private void c() {
        V v2;
        if (this.r != null) {
            e();
            if (this.n == 4 && (v2 = this.r.get()) != null) {
                v2.requestLayout();
            }
        }
    }

    private int d() {
        int i2 = this.f9502c;
        if (i2 == -1) {
            return Math.min(Math.max(this.f9503d, (int) (((float) this.q) * this.R)), this.E);
        }
        return i2;
    }

    private void e() {
        int d2 = d();
        if (this.f9501b) {
            this.f9508i = Math.max(this.q - d2, this.f9505f);
        } else {
            this.f9508i = this.q - d2;
        }
    }

    private float g() {
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.w);
        return this.H.getYVelocity(this.t);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a() {
        super.a();
        this.r = null;
        this.o = null;
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9522a;

        /* renamed from: b  reason: collision with root package name */
        int f9523b;

        /* renamed from: d  reason: collision with root package name */
        private final View f9525d;

        static {
            Covode.recordClassIndex(4833);
        }

        public final void run() {
            if (LiveBottomSheetBehavior.this.o == null || !LiveBottomSheetBehavior.this.o.c()) {
                LiveBottomSheetBehavior.this.d(this.f9523b);
            } else {
                v.a(this.f9525d, this);
            }
            this.f9522a = false;
        }

        b(View view, int i2) {
            this.f9525d = view;
            this.f9523b = i2;
        }
    }

    public LiveBottomSheetBehavior() {
    }

    public final void b(int i2) {
        if (i2 == -1) {
            if (!this.x) {
                this.x = true;
            } else {
                return;
            }
        } else if (this.x || this.f9502c != i2) {
            this.x = false;
            this.f9502c = Math.max(0, i2);
        } else {
            return;
        }
        c();
    }

    public static <V extends View> LiveBottomSheetBehavior<V> a(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.e) {
            CoordinatorLayout.b bVar = ((CoordinatorLayout.e) layoutParams).f2100a;
            if (bVar instanceof LiveBottomSheetBehavior) {
                return (LiveBottomSheetBehavior) bVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private View b(View view) {
        if (v.t(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View b2 = b(viewGroup.getChildAt(i2));
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    private void f(final int i2) {
        final V v2 = this.r.get();
        if (v2 != null) {
            ViewParent parent = v2.getParent();
            if (parent == null || !parent.isLayoutRequested() || !v.y(v2)) {
                b((View) v2, i2);
            } else {
                v2.post(new Runnable() {
                    /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(4828);
                    }

                    public final void run() {
                        LiveBottomSheetBehavior.this.b(v2, i2);
                    }
                });
            }
        }
    }

    public final void c(int i2) {
        if (i2 != this.n) {
            if (this.r != null) {
                f(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.f9510k && i2 == 5)) {
                this.n = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        V v2;
        if (this.n != i2) {
            this.n = i2;
            WeakReference<V> weakReference = this.r;
            if (!(weakReference == null || (v2 = weakReference.get()) == null)) {
                if (i2 == 3) {
                    c(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    c(false);
                }
                for (int i3 = 0; i3 < this.G.size(); i3++) {
                    this.G.get(i3).a((View) v2, i2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(int i2) {
        float f2;
        float f3;
        V v2 = this.r.get();
        if (!(v2 == null || this.G.isEmpty())) {
            int i3 = this.f9508i;
            if (i2 > i3 || i3 == b()) {
                int i4 = this.f9508i;
                f2 = (float) (i4 - i2);
                f3 = (float) (this.q - i4);
            } else {
                int i5 = this.f9508i;
                f2 = (float) (i5 - i2);
                f3 = (float) (i5 - b());
            }
            float f4 = f2 / f3;
            for (int i6 = 0; i6 < this.G.size(); i6++) {
                this.G.get(i6).a(v2, f4);
            }
        }
    }

    private void c(boolean z2) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.r;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                int i2 = Build.VERSION.SDK_INT;
                if (z2) {
                    if (this.J == null) {
                        this.J = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.r.get()) {
                        if (z2) {
                            int i4 = Build.VERSION.SDK_INT;
                            this.J.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.v) {
                                v.a(childAt, 4);
                            }
                        } else if (this.v && (map = this.J) != null && map.containsKey(childAt)) {
                            v.a(childAt, this.J.get(childAt).intValue());
                        }
                    }
                }
                if (!z2) {
                    this.J = null;
                } else if (this.v) {
                    this.r.get().sendAccessibilityEvent(8);
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout.e eVar) {
        super.a(eVar);
        this.r = null;
        this.o = null;
    }

    public final void b(boolean z2) {
        if (this.f9510k != z2) {
            this.f9510k = z2;
            if (!z2 && this.n == 5) {
                c(4);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.a(coordinatorLayout, (View) v2), (LiveBottomSheetBehavior<?>) this);
    }

    /* access modifiers changed from: package-private */
    public final void b(View view, int i2) {
        int i3;
        if (i2 == 4) {
            i3 = this.f9508i;
        } else if (i2 == 6) {
            int i4 = this.f9506g;
            if (!this.f9501b || i4 > (i3 = this.f9505f)) {
                i3 = i4;
            } else {
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = b();
        } else if (!this.f9510k || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i2)));
        } else {
            i3 = this.q;
        }
        a(view, i2, i3, false);
    }

    public LiveBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843840, R.attr.jh, R.attr.k8, R.attr.k9, R.attr.kb, R.attr.kc, R.attr.a32, R.attr.a33, R.attr.a34, R.attr.a35, R.attr.a36, R.attr.a37, R.attr.a38, R.attr.a39, R.attr.a3_});
        if (Build.VERSION.SDK_INT >= 21) {
            this.f9509j = obtainStyledAttributes.getDimension(0, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(4);
        if (peekValue == null || peekValue.data != -1) {
            b(obtainStyledAttributes.getDimensionPixelSize(4, -1));
        } else {
            b(peekValue.data);
        }
        b(obtainStyledAttributes.getBoolean(3, false));
        a(obtainStyledAttributes.getBoolean(2, true));
        this.f9511l = obtainStyledAttributes.getBoolean(5, false);
        this.f9512m = obtainStyledAttributes.getBoolean(6, true);
        this.L = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        TypedValue typedValue = new TypedValue();
        obtainStyledAttributes.getValue(8, typedValue);
        this.M = typedValue.getFloat();
        this.N = obtainStyledAttributes.getDimensionPixelSize(11, -1);
        obtainStyledAttributes.getValue(12, typedValue);
        this.O = typedValue.getFloat();
        this.P = obtainStyledAttributes.getDimensionPixelSize(9, -1);
        obtainStyledAttributes.getValue(10, typedValue);
        this.Q = typedValue.getFloat();
        obtainStyledAttributes.getValue(14, typedValue);
        this.R = typedValue.getFloat();
        this.f9503d = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        obtainStyledAttributes.recycle();
        this.w = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: package-private */
    public final boolean b(View view, float f2) {
        int b2 = this.q - b();
        float abs = Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) b()));
        if (abs >= ((float) this.F) || abs / ((float) b2) >= 0.25f) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, v2, savedState.f2667d);
        int i2 = this.f9500a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f9502c = savedState.f9518b;
            }
            int i3 = this.f9500a;
            if (i3 == -1 || (i3 & 2) == 2) {
                this.f9501b = savedState.f9519e;
            }
            int i4 = this.f9500a;
            if (i4 == -1 || (i4 & 4) == 4) {
                this.f9510k = savedState.f9520f;
            }
            int i5 = this.f9500a;
            if (i5 == -1 || (i5 & 8) == 8) {
                this.f9511l = savedState.f9521g;
            }
        }
        if (savedState.f9517a == 1 || savedState.f9517a == 2) {
            this.n = 4;
        } else {
            this.n = savedState.f9517a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean b(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.n == 1 && actionMasked == 0) {
            return true;
        }
        androidx.customview.a.a aVar = this.o;
        if (aVar != null) {
            aVar.b(motionEvent);
        }
        if (actionMasked == 0) {
            f();
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        if (this.o != null && actionMasked == 2 && !this.B && Math.abs(((float) this.I) - motionEvent.getY()) > ((float) this.o.f2653b)) {
            this.o.a(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.B) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, int i2, int i3, boolean z2) {
        androidx.customview.a.a aVar = this.o;
        if (aVar == null || (!z2 ? !aVar.a(view, view.getLeft(), i3) : !aVar.a(view.getLeft(), i3))) {
            d(i2);
            return;
        }
        d(2);
        if (this.z == null) {
            this.z = new b(view, i2);
        }
        if (!this.z.f9522a) {
            this.z.f9523b = i2;
            v.a(view, this.z);
            this.z.f9522a = true;
            return;
        }
        this.z.f9523b = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        int i4 = 3;
        if (v2.getTop() == b()) {
            d(3);
            return;
        }
        WeakReference<View> weakReference = this.s;
        if (weakReference != null && view == weakReference.get() && this.D) {
            if (this.C > 0 || b(v2, g())) {
                if (this.f9501b) {
                    i3 = this.f9505f;
                } else {
                    int top = v2.getTop();
                    i3 = this.f9506g;
                    if (top <= i3) {
                        i3 = this.f9504e;
                    }
                    i4 = 6;
                }
            } else if (!this.f9510k || !a(v2, g())) {
                if (this.C == 0) {
                    int top2 = v2.getTop();
                    if (!this.f9501b) {
                        int i5 = this.f9506g;
                        if (top2 < i5) {
                            if (top2 < Math.abs(top2 - this.f9508i)) {
                                i3 = this.f9504e;
                            } else {
                                i3 = this.f9506g;
                            }
                        } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.f9508i)) {
                            i3 = this.f9506g;
                        } else {
                            i3 = this.f9508i;
                        }
                        i4 = 6;
                    } else if (Math.abs(top2 - this.f9505f) < Math.abs(top2 - this.f9508i)) {
                        i3 = this.f9505f;
                    } else {
                        i3 = this.f9508i;
                    }
                } else {
                    if (!this.f9501b) {
                        int top3 = v2.getTop();
                        if (Math.abs(top3 - this.f9506g) < Math.abs(top3 - this.f9508i)) {
                            i3 = this.f9506g;
                            i4 = 6;
                        }
                    }
                    i3 = this.f9508i;
                }
                i4 = 4;
            } else {
                i3 = this.q;
                i4 = 5;
            }
            a((View) v2, i4, i3, false);
            this.D = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        View view2;
        if (i4 != 1) {
            WeakReference<View> weakReference = this.s;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view == view2) {
                int top = v2.getTop();
                int i5 = top - i3;
                if (i3 > 0) {
                    if (i5 < b()) {
                        iArr[1] = top - b();
                        v.d(v2, -iArr[1]);
                        d(3);
                    } else if (this.f9512m) {
                        iArr[1] = i3;
                        v.d(v2, -i3);
                        d(1);
                    } else {
                        return;
                    }
                } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.f9508i;
                    if (i5 > i6 && !this.f9510k) {
                        iArr[1] = top - i6;
                        v.d(v2, -iArr[1]);
                        d(4);
                    } else if (this.f9512m) {
                        iArr[1] = i3;
                        v.d(v2, -i3);
                        d(1);
                    } else {
                        return;
                    }
                }
                e(v2.getTop());
                this.C = i3;
                this.D = true;
            }
        }
    }
}
