package com.google.android.material.bottomsheet;

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
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f52325a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f52326b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f52327c;

    /* renamed from: d  reason: collision with root package name */
    public int f52328d;

    /* renamed from: e  reason: collision with root package name */
    int f52329e;

    /* renamed from: f  reason: collision with root package name */
    int f52330f;

    /* renamed from: g  reason: collision with root package name */
    int f52331g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f52332h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f52333i;

    /* renamed from: j  reason: collision with root package name */
    public int f52334j = 4;

    /* renamed from: k  reason: collision with root package name */
    androidx.customview.a.a f52335k;

    /* renamed from: l  reason: collision with root package name */
    int f52336l;

    /* renamed from: m  reason: collision with root package name */
    WeakReference<V> f52337m;
    WeakReference<View> n;
    public a o;
    int p;
    boolean q;
    private float r;
    private int s;
    private boolean t;
    private int u;
    private boolean v;
    private VelocityTracker w;
    private int x;
    private Map<View, Integer> y;
    private final a.AbstractC0038a z = new a.AbstractC0038a() {
        /* class com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass2 */

        static {
            Covode.recordClassIndex(32476);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int b() {
            if (BottomSheetBehavior.this.f52332h) {
                return BottomSheetBehavior.this.f52336l;
            }
            return BottomSheetBehavior.this.f52331g;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(int i2) {
            if (i2 == 1) {
                BottomSheetBehavior.this.d(1);
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int c(View view, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final boolean b(View view, int i2) {
            View view2;
            if (BottomSheetBehavior.this.f52334j == 1 || BottomSheetBehavior.this.q) {
                return false;
            }
            if ((BottomSheetBehavior.this.f52334j != 3 || BottomSheetBehavior.this.p != i2 || (view2 = BottomSheetBehavior.this.n.get()) == null || !view2.canScrollVertically(-1)) && BottomSheetBehavior.this.f52337m != null && BottomSheetBehavior.this.f52337m.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view, int i2, int i3) {
            int i4;
            int b2 = BottomSheetBehavior.this.b();
            if (BottomSheetBehavior.this.f52332h) {
                i4 = BottomSheetBehavior.this.f52336l;
            } else {
                i4 = BottomSheetBehavior.this.f52331g;
            }
            return androidx.core.b.a.a(i2, b2, i4);
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        @Override // androidx.customview.a.a.AbstractC0038a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r6, float r7, float r8) {
            /*
            // Method dump skipped, instructions count: 239
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass2.a(android.view.View, float, float):void");
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.e(i3);
        }
    };

    public static abstract class a {
        static {
            Covode.recordClassIndex(32479);
        }

        public abstract void a(View view, float f2);

        public abstract void a(View view, int i2);
    }

    static {
        Covode.recordClassIndex(32474);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return a(this, view, motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        if (v.o(coordinatorLayout) && !v.o(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        coordinatorLayout.a(v2, i2);
        this.f52336l = coordinatorLayout.getHeight();
        if (this.f52327c) {
            if (this.f52328d == 0) {
                this.f52328d = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            }
            this.s = Math.max(this.f52328d, this.f52336l - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.s = this.f52326b;
        }
        this.f52329e = Math.max(0, this.f52336l - v2.getHeight());
        this.f52330f = this.f52336l / 2;
        c();
        int i3 = this.f52334j;
        if (i3 == 3) {
            v.d(v2, b());
        } else if (i3 == 6) {
            v.d(v2, this.f52330f);
        } else if (this.f52332h && i3 == 5) {
            v.d(v2, this.f52336l);
        } else if (i3 == 4) {
            v.d(v2, this.f52331g);
        } else if (i3 == 1 || i3 == 2) {
            v.d(v2, top - v2.getTop());
        }
        if (this.f52335k == null) {
            this.f52335k = androidx.customview.a.a.a(coordinatorLayout, this.z);
        }
        this.f52337m = new WeakReference<>(v2);
        this.n = new WeakReference<>(b(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        View view;
        androidx.customview.a.a aVar;
        if (!v2.isShown()) {
            this.t = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            d();
        }
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.x = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.n;
            if (!(weakReference == null || (view = weakReference.get()) == null || !coordinatorLayout.a(view, x2, this.x))) {
                this.p = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.q = true;
            }
            this.t = this.p == -1 && !coordinatorLayout.a(v2, x2, this.x);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.q = false;
            this.p = -1;
            if (this.t) {
                this.t = false;
                return false;
            }
        }
        if (!this.t && (aVar = this.f52335k) != null && aVar.a(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.n;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        return actionMasked == 2 && view2 != null && !this.t && this.f52334j != 1 && !coordinatorLayout.a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f52335k != null && Math.abs(((float) this.x) - motionEvent.getY()) > ((float) this.f52335k.f2653b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.u = 0;
        this.v = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        if (view == this.n.get()) {
            return this.f52334j != 3 || super.a(coordinatorLayout, v2, view, f2, f3);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (this.f52333i) {
            return true;
        }
        if (view.getTop() >= this.f52331g && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f52331g)) / ((float) this.f52326b) > 0.5f) {
            return true;
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32478);
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
        final int f52342a;

        static {
            Covode.recordClassIndex(32477);
        }

        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f52342a = i2;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f52342a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f52342a);
        }
    }

    private void d() {
        this.p = -1;
        VelocityTracker velocityTracker = this.w;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.w = null;
        }
    }

    public final int b() {
        if (this.f52325a) {
            return this.f52329e;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f52344b;

        /* renamed from: c  reason: collision with root package name */
        private final int f52345c;

        static {
            Covode.recordClassIndex(32480);
        }

        public final void run() {
            if (BottomSheetBehavior.this.f52335k == null || !BottomSheetBehavior.this.f52335k.c()) {
                BottomSheetBehavior.this.d(this.f52345c);
            } else {
                v.a(this.f52344b, this);
            }
        }

        b(View view, int i2) {
            this.f52344b = view;
            this.f52345c = i2;
        }
    }

    public BottomSheetBehavior() {
    }

    private void c() {
        if (this.f52325a) {
            this.f52331g = Math.max(this.f52336l - this.s, this.f52329e);
        } else {
            this.f52331g = this.f52336l - this.s;
        }
    }

    private static float a(BottomSheetBehavior bottomSheetBehavior) {
        try {
            VelocityTracker velocityTracker = bottomSheetBehavior.w;
            if (velocityTracker == null) {
                return 0.0f;
            }
            velocityTracker.computeCurrentVelocity(1000, bottomSheetBehavior.r);
            return bottomSheetBehavior.w.getYVelocity(bottomSheetBehavior.p);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0f;
        }
    }

    public static <V extends View> BottomSheetBehavior<V> a(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.e) {
            CoordinatorLayout.b bVar = ((CoordinatorLayout.e) layoutParams).f2100a;
            if (bVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) bVar;
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

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        a aVar;
        if (this.f52334j != i2) {
            this.f52334j = i2;
            if (i2 == 6 || i2 == 3) {
                b(true);
            } else if (i2 == 5 || i2 == 4) {
                b(false);
            }
            V v2 = this.f52337m.get();
            if (v2 != null && (aVar = this.o) != null) {
                aVar.a((View) v2, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(int i2) {
        a aVar;
        V v2 = this.f52337m.get();
        if (v2 != null && (aVar = this.o) != null) {
            int i3 = this.f52331g;
            if (i2 > i3) {
                aVar.a(v2, ((float) (i3 - i2)) / ((float) (this.f52336l - i3)));
            } else {
                aVar.a(v2, ((float) (i3 - i2)) / ((float) (i3 - b())));
            }
        }
    }

    private void b(boolean z2) {
        WeakReference<V> weakReference = this.f52337m;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                int i2 = Build.VERSION.SDK_INT;
                if (z2) {
                    if (this.y == null) {
                        this.y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.f52337m.get()) {
                        if (!z2) {
                            Map<View, Integer> map = this.y;
                            if (map != null && map.containsKey(childAt)) {
                                v.a(childAt, this.y.get(childAt).intValue());
                            }
                        } else {
                            int i4 = Build.VERSION.SDK_INT;
                            this.y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            v.a(childAt, 4);
                        }
                    }
                }
                if (!z2) {
                    this.y = null;
                }
            }
        }
    }

    public final void c(final int i2) {
        if (i2 != this.f52334j) {
            WeakReference<V> weakReference = this.f52337m;
            if (weakReference != null) {
                final V v2 = weakReference.get();
                if (v2 != null) {
                    ViewParent parent = v2.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !v.y(v2)) {
                        b(v2, i2);
                    } else {
                        v2.post(new Runnable() {
                            /* class com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(32475);
                            }

                            public final void run() {
                                BottomSheetBehavior.this.b(v2, i2);
                            }
                        });
                    }
                }
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.f52332h && i2 == 5)) {
                this.f52334j = i2;
            }
        }
    }

    public final void b(int i2) {
        WeakReference<V> weakReference;
        V v2;
        if (i2 == -1) {
            if (!this.f52327c) {
                this.f52327c = true;
            } else {
                return;
            }
        } else if (this.f52327c || this.f52326b != i2) {
            this.f52327c = false;
            this.f52326b = Math.max(0, i2);
            this.f52331g = this.f52336l - i2;
        } else {
            return;
        }
        if (this.f52334j == 4 && (weakReference = this.f52337m) != null && (v2 = weakReference.get()) != null) {
            v2.requestLayout();
        }
    }

    public final void a(boolean z2) {
        int i2;
        if (this.f52325a != z2) {
            this.f52325a = z2;
            if (this.f52337m != null) {
                c();
            }
            if (!this.f52325a || this.f52334j != 6) {
                i2 = this.f52334j;
            } else {
                i2 = 3;
            }
            d(i2);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.a(coordinatorLayout, (View) v2), this.f52334j);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k8, R.attr.k9, R.attr.kb, R.attr.kc});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            b(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            b(peekValue.data);
        }
        this.f52332h = obtainStyledAttributes.getBoolean(1, false);
        a(obtainStyledAttributes.getBoolean(0, true));
        this.f52333i = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.r = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: package-private */
    public final void b(View view, int i2) {
        int i3;
        if (i2 == 4) {
            i3 = this.f52331g;
        } else if (i2 == 6) {
            int i4 = this.f52330f;
            if (!this.f52325a || i4 > (i3 = this.f52329e)) {
                i3 = i4;
            } else {
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = b();
        } else if (!this.f52332h || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i2)));
        } else {
            i3 = this.f52336l;
        }
        if (this.f52335k.a(view, view.getLeft(), i3)) {
            d(2);
            v.a(view, new b(view, i2));
            return;
        }
        d(i2);
    }

    private static boolean a(BottomSheetBehavior bottomSheetBehavior, View view, MotionEvent motionEvent) {
        try {
            if (!view.isShown()) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (bottomSheetBehavior.f52334j == 1 && actionMasked == 0) {
                return true;
            }
            androidx.customview.a.a aVar = bottomSheetBehavior.f52335k;
            if (aVar != null) {
                aVar.b(motionEvent);
            }
            if (actionMasked == 0) {
                bottomSheetBehavior.d();
            }
            if (bottomSheetBehavior.w == null) {
                bottomSheetBehavior.w = VelocityTracker.obtain();
            }
            bottomSheetBehavior.w.addMovement(motionEvent);
            if (actionMasked == 2 && !bottomSheetBehavior.t && Math.abs(((float) bottomSheetBehavior.x) - motionEvent.getY()) > ((float) bottomSheetBehavior.f52335k.f2653b)) {
                bottomSheetBehavior.f52335k.a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            if (!bottomSheetBehavior.t) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, v2, savedState.f2667d);
        if (savedState.f52342a == 1 || savedState.f52342a == 2) {
            this.f52334j = 4;
        } else {
            this.f52334j = savedState.f52342a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        int i4 = 3;
        if (v2.getTop() == b()) {
            d(3);
        } else if (view == this.n.get() && this.v) {
            if (this.u > 0) {
                i3 = b();
            } else if (!this.f52332h || !a(v2, a(this))) {
                if (this.u == 0) {
                    int top = v2.getTop();
                    if (!this.f52325a) {
                        int i5 = this.f52330f;
                        if (top < i5) {
                            if (top < Math.abs(top - this.f52331g)) {
                                i3 = 0;
                            } else {
                                i3 = this.f52330f;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - this.f52331g)) {
                            i3 = this.f52330f;
                        } else {
                            i3 = this.f52331g;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.f52329e) < Math.abs(top - this.f52331g)) {
                        i3 = this.f52329e;
                    } else {
                        i3 = this.f52331g;
                    }
                } else {
                    i3 = this.f52331g;
                }
                i4 = 4;
            } else {
                i3 = this.f52336l;
                i4 = 5;
            }
            if (this.f52335k.a((View) v2, v2.getLeft(), i3)) {
                d(2);
                v.a(v2, new b(v2, i4));
            } else {
                d(i4);
            }
            this.v = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 != 1 && view == this.n.get()) {
            int top = v2.getTop();
            int i5 = top - i3;
            if (i3 > 0) {
                if (i5 < b()) {
                    iArr[1] = top - b();
                    v.d(v2, -iArr[1]);
                    d(3);
                } else {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    d(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.f52331g;
                if (i5 <= i6 || this.f52332h) {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    d(1);
                } else {
                    iArr[1] = top - i6;
                    v.d(v2, -iArr[1]);
                    d(4);
                }
            }
            e(v2.getTop());
            this.u = i3;
            this.v = true;
        }
    }
}
