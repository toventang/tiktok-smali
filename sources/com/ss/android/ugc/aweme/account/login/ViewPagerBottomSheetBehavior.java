package com.ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
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
    public float f63224a;

    /* renamed from: b  reason: collision with root package name */
    public int f63225b;

    /* renamed from: c  reason: collision with root package name */
    int f63226c;

    /* renamed from: d  reason: collision with root package name */
    int f63227d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f63228e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f63229f;

    /* renamed from: g  reason: collision with root package name */
    public int f63230g = 4;

    /* renamed from: h  reason: collision with root package name */
    androidx.customview.a.a f63231h;

    /* renamed from: i  reason: collision with root package name */
    int f63232i;

    /* renamed from: j  reason: collision with root package name */
    WeakReference<V> f63233j;

    /* renamed from: k  reason: collision with root package name */
    WeakReference<View> f63234k;

    /* renamed from: l  reason: collision with root package name */
    public a f63235l;

    /* renamed from: m  reason: collision with root package name */
    int f63236m;
    boolean n;
    public b o;
    private float p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private VelocityTracker u;
    private int v;
    private final a.AbstractC0038a w = new a.AbstractC0038a() {
        /* class com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.AnonymousClass2 */

        static {
            Covode.recordClassIndex(38970);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int b() {
            int i2;
            int i3;
            if (ViewPagerBottomSheetBehavior.this.f63228e) {
                i2 = ViewPagerBottomSheetBehavior.this.f63232i;
                i3 = ViewPagerBottomSheetBehavior.this.f63226c;
            } else {
                i2 = ViewPagerBottomSheetBehavior.this.f63227d;
                i3 = ViewPagerBottomSheetBehavior.this.f63226c;
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
            if (ViewPagerBottomSheetBehavior.this.f63230g == 1 || ViewPagerBottomSheetBehavior.this.n) {
                return false;
            }
            if ((ViewPagerBottomSheetBehavior.this.f63230g != 3 || ViewPagerBottomSheetBehavior.this.f63236m != i2 || (view2 = ViewPagerBottomSheetBehavior.this.f63234k.get()) == null || !view2.canScrollVertically(-1)) && ViewPagerBottomSheetBehavior.this.f63233j != null && ViewPagerBottomSheetBehavior.this.f63233j.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view, int i2, int i3) {
            int i4;
            int i5 = ViewPagerBottomSheetBehavior.this.f63226c;
            if (ViewPagerBottomSheetBehavior.this.f63228e) {
                i4 = ViewPagerBottomSheetBehavior.this.f63232i;
            } else {
                i4 = ViewPagerBottomSheetBehavior.this.f63227d;
            }
            return androidx.core.b.a.a(i2, i5, i4);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, float f2, float f3) {
            int i2;
            int i3 = 3;
            if (f3 < 0.0f && Math.abs(f3) > ViewPagerBottomSheetBehavior.this.f63224a && Math.abs(f3) > Math.abs(f2)) {
                i2 = ViewPagerBottomSheetBehavior.this.f63226c;
            } else if (!ViewPagerBottomSheetBehavior.this.f63228e || !ViewPagerBottomSheetBehavior.this.a(view, f3)) {
                if (f3 <= 0.0f || Math.abs(f3) <= ViewPagerBottomSheetBehavior.this.f63224a || Math.abs(f3) <= Math.abs(f2)) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f63226c) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f63227d)) {
                        i2 = ViewPagerBottomSheetBehavior.this.f63226c;
                    }
                }
                i2 = ViewPagerBottomSheetBehavior.this.f63227d;
                i3 = 4;
            } else {
                i2 = ViewPagerBottomSheetBehavior.this.f63232i;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f63231h.a(view.getLeft(), i2)) {
                ViewPagerBottomSheetBehavior.this.c(2);
                v.a(view, new c(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.c(i3);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, int i2, int i3, int i4, int i5) {
            ViewPagerBottomSheetBehavior.this.c();
        }
    };

    public static abstract class a {
        static {
            Covode.recordClassIndex(38973);
        }

        public abstract void a(View view);

        public abstract void a(View view, int i2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(38974);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(38968);
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
            d();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.v = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f63234k;
            if (!(weakReference == null || (view = weakReference.get()) == null || !coordinatorLayout.a(view, x, this.v))) {
                this.f63236m = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.n = true;
            }
            this.s = this.f63236m == -1 && !coordinatorLayout.a(v2, x, this.v);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.n = false;
            this.f63236m = -1;
            if (this.s) {
                this.s = false;
                return false;
            }
        }
        if (!this.s && this.f63231h.a(motionEvent)) {
            return true;
        }
        View view2 = this.f63234k.get();
        return actionMasked == 2 && view2 != null && !this.s && this.f63230g != 1 && !coordinatorLayout.a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.v) - motionEvent.getY()) > ((float) this.f63231h.f2653b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        if (view == this.f63234k.get()) {
            return this.f63230g != 3 || super.a(coordinatorLayout, v2, view, f2, f3);
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(38972);
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
        final int f63241a;

        static {
            Covode.recordClassIndex(38971);
        }

        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f63241a = i2;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f63241a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f63241a);
        }
    }

    public ViewPagerBottomSheetBehavior() {
    }

    private void d() {
        this.f63236m = -1;
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f63243b;

        /* renamed from: c  reason: collision with root package name */
        private final int f63244c;

        static {
            Covode.recordClassIndex(38975);
        }

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f63231h == null || !ViewPagerBottomSheetBehavior.this.f63231h.c()) {
                ViewPagerBottomSheetBehavior.this.c(this.f63244c);
            } else {
                v.a(this.f63243b, this);
            }
        }

        c(View view, int i2) {
            this.f63243b = view;
            this.f63244c = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        a aVar;
        V v2 = this.f63233j.get();
        if (v2 != null && (aVar = this.f63235l) != null) {
            aVar.a(v2);
        }
    }

    public final void b() {
        if (3 != this.f63230g) {
            WeakReference<V> weakReference = this.f63233j;
            if (weakReference == null) {
                this.f63230g = 3;
                return;
            }
            final V v2 = weakReference.get();
            if (v2 != null) {
                ViewParent parent = v2.getParent();
                if (parent == null || !parent.isLayoutRequested() || !v.y(v2)) {
                    b(v2, 3);
                } else {
                    v2.post(new Runnable() {
                        /* class com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.AnonymousClass1 */

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ int f63238b = 3;

                        static {
                            Covode.recordClassIndex(38969);
                        }

                        public final void run() {
                            ViewPagerBottomSheetBehavior.this.b(v2, this.f63238b);
                        }
                    });
                }
            }
        }
    }

    public static <V extends View> ViewPagerBottomSheetBehavior<V> b(V v2) {
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

    /* access modifiers changed from: package-private */
    public final View a(View view) {
        View a2;
        if (v.t(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View a3 = com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a.a((ViewPager) view);
            if (!(a3 == null || (a2 = a(a3)) == null)) {
                return a2;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View a4 = a(viewGroup.getChildAt(i2));
                if (a4 != null) {
                    return a4;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        a aVar;
        if (this.f63230g != i2) {
            this.f63230g = i2;
            V v2 = this.f63233j.get();
            if (v2 != null && (aVar = this.f63235l) != null) {
                aVar.a(v2, i2);
            }
        }
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
            this.f63227d = this.f63232i - i2;
        } else {
            return;
        }
        if (this.f63230g == 4 && (weakReference = this.f63233j) != null && (v2 = weakReference.get()) != null) {
            v2.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(int i2) {
        this.t = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.a(coordinatorLayout, (View) v2), this.f63230g);
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
        this.f63228e = obtainStyledAttributes.getBoolean(1, false);
        this.f63229f = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.p = (float) viewConfiguration.getScaledMaximumFlingVelocity();
        this.f63224a = (float) viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(V v2, View view) {
        int i2;
        int i3 = 3;
        if (v2.getTop() == this.f63226c) {
            c(3);
            return;
        }
        WeakReference<View> weakReference = this.f63234k;
        if (weakReference != null && view == weakReference.get() && this.t) {
            this.u.computeCurrentVelocity(1000, this.p);
            float xVelocity = this.u.getXVelocity(this.f63236m);
            float yVelocity = this.u.getYVelocity(this.f63236m);
            if (yVelocity < 0.0f && Math.abs(yVelocity) > this.f63224a && Math.abs(yVelocity) > Math.abs(xVelocity)) {
                i2 = this.f63226c;
            } else if (!this.f63228e || !a(v2, yVelocity)) {
                if (yVelocity <= 0.0f || Math.abs(yVelocity) <= this.f63224a || Math.abs(yVelocity) <= Math.abs(xVelocity)) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f63226c) < Math.abs(top - this.f63227d)) {
                        i2 = this.f63226c;
                    }
                }
                i2 = this.f63227d;
                i3 = 4;
            } else {
                i2 = this.f63232i;
                i3 = 5;
            }
            if (this.f63231h.a((View) v2, v2.getLeft(), i2)) {
                c(2);
                v.a(v2, new c(v2, i3));
            } else {
                c(i3);
            }
            this.t = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(View view, int i2) {
        int i3;
        if (i2 == 4) {
            i3 = this.f63227d;
        } else if (i2 == 3) {
            i3 = this.f63226c;
        } else if (!this.f63228e || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i2)));
        } else {
            i3 = this.f63232i;
        }
        if (this.f63231h.a(view, view.getLeft(), i3)) {
            c(2);
            v.a(view, new c(view, i2));
            return;
        }
        c(i2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (this.f63229f) {
            return true;
        }
        if (view.getTop() >= this.f63227d && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f63227d)) / ((float) this.q) > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, v2, savedState.f2667d);
        if (savedState.f63241a == 1 || savedState.f63241a == 2) {
            this.f63230g = 4;
        } else {
            this.f63230g = savedState.f63241a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean b(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        b bVar;
        try {
            if (!v2.isShown()) {
                return false;
            }
            if (motionEvent.getAction() == 0 && this.f63230g == 3) {
                Rect rect = new Rect();
                v2.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && (bVar = this.o) != null) {
                    bVar.a();
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (this.f63230g == 1 && actionMasked == 0) {
                return true;
            }
            androidx.customview.a.a aVar = this.f63231h;
            if (aVar != null) {
                aVar.b(motionEvent);
            }
            if (actionMasked == 0) {
                d();
            }
            if (this.u == null) {
                this.u = VelocityTracker.obtain();
            }
            this.u.addMovement(motionEvent);
            if (actionMasked == 2 && !this.s && Math.abs(((float) this.v) - motionEvent.getY()) > ((float) this.f63231h.f2653b)) {
                this.f63231h.a(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            if (!this.s) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException e2) {
            if (!TextUtils.isEmpty(e2.getMessage()) && e2.getMessage().contains("pointerIndex out of range")) {
                return false;
            }
            throw e2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        if (v.o(coordinatorLayout) && !v.o(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        coordinatorLayout.a(v2, i2);
        this.f63232i = coordinatorLayout.getHeight();
        if (this.r) {
            if (this.f63225b == 0) {
                this.f63225b = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            }
            i3 = Math.max(this.f63225b, this.f63232i - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i3 = this.q;
        }
        int max = Math.max(0, this.f63232i - v2.getHeight());
        this.f63226c = max;
        int max2 = Math.max(this.f63232i - i3, max);
        this.f63227d = max2;
        int i4 = this.f63230g;
        if (i4 == 3) {
            v.d(v2, this.f63226c);
        } else if (this.f63228e && i4 == 5) {
            v.d(v2, this.f63232i);
        } else if (i4 == 4) {
            v.d(v2, max2);
        } else if (i4 == 1 || i4 == 2) {
            v.d(v2, top - v2.getTop());
        }
        if (this.f63231h == null) {
            this.f63231h = androidx.customview.a.a.a(coordinatorLayout, this.w);
        }
        this.f63233j = new WeakReference<>(v2);
        this.f63234k = new WeakReference<>(a(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr) {
        if (view == this.f63234k.get()) {
            int top = v2.getTop();
            int i4 = top - i3;
            if (i3 > 0) {
                int i5 = this.f63226c;
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
                int i6 = this.f63227d;
                if (i4 <= i6 || this.f63228e) {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    c(1);
                } else {
                    iArr[1] = top - i6;
                    v.d(v2, -iArr[1]);
                    c(4);
                }
            }
            v2.getTop();
            c();
            this.t = true;
        }
    }
}
