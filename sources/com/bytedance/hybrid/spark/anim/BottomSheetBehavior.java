package com.bytedance.hybrid.spark.anim;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.anim.a;
import com.bytedance.hybrid.spark.anim.b;
import com.google.android.material.i.c;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b<V> {
    private static final int O = R.style.qy;
    int A;
    WeakReference<V> B;
    WeakReference<View> C;
    public final ArrayList<a> D = new ArrayList<>();
    int E;
    boolean F;
    public a G;
    private float H;
    private boolean I;
    private boolean J;
    private int K;
    private boolean L;
    private BottomSheetBehavior<V>.b M;
    private ValueAnimator N;
    private boolean P;
    private int Q;
    private boolean R;
    private VelocityTracker S;
    private int T;
    private Map<View, Integer> U;
    private final b.a V = new b.a() {
        /* class com.bytedance.hybrid.spark.anim.BottomSheetBehavior.AnonymousClass3 */

        static {
            Covode.recordClassIndex(18050);
        }

        @Override // com.bytedance.hybrid.spark.anim.b.a
        public final int a() {
            if (BottomSheetBehavior.this.n) {
                return BottomSheetBehavior.this.A;
            }
            return BottomSheetBehavior.this.f31069l;
        }

        @Override // com.bytedance.hybrid.spark.anim.b.a
        public final int a(View view) {
            return view.getLeft();
        }

        @Override // com.bytedance.hybrid.spark.anim.b.a
        public final void b(int i2) {
            if (i2 == 1 && BottomSheetBehavior.this.p) {
                BottomSheetBehavior.this.d(1);
            }
        }

        @Override // com.bytedance.hybrid.spark.anim.b.a
        public final void a(int i2) {
            BottomSheetBehavior.this.e(i2);
        }

        @Override // com.bytedance.hybrid.spark.anim.b.a
        public final int c(int i2) {
            int i3;
            int b2 = BottomSheetBehavior.this.b();
            if (BottomSheetBehavior.this.n) {
                i3 = BottomSheetBehavior.this.A;
            } else {
                i3 = BottomSheetBehavior.this.f31069l;
            }
            return androidx.core.b.a.a(i2, b2, i3);
        }

        @Override // com.bytedance.hybrid.spark.anim.b.a
        public final boolean a(View view, MotionEvent motionEvent) {
            if (!BottomSheetBehavior.this.y.a(view, 1, 1, (int) motionEvent.getX(), ((int) motionEvent.getY()) - (BottomSheetBehavior.this.A - BottomSheetBehavior.this.q))) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.hybrid.spark.anim.b.a
        public final boolean a(View view, int i2) {
            View view2;
            if (BottomSheetBehavior.this.x == 1 || BottomSheetBehavior.this.F) {
                return false;
            }
            if ((BottomSheetBehavior.this.x != 3 || BottomSheetBehavior.this.E != i2 || BottomSheetBehavior.this.C == null || (view2 = BottomSheetBehavior.this.C.get()) == null || !view2.canScrollVertically(-1)) && BottomSheetBehavior.this.B != null && BottomSheetBehavior.this.B.get() == view) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.hybrid.spark.anim.b.a
        public final void a(View view, float f2, float f3) {
            int i2;
            int top = view.getTop();
            int i3 = 4;
            if (f3 >= 0.0f) {
                if (!BottomSheetBehavior.this.n || !BottomSheetBehavior.this.a(view, f3)) {
                    if (f3 != 0.0f && Math.abs(f2) <= Math.abs(f3)) {
                        if (BottomSheetBehavior.this.f31059b) {
                            if (BottomSheetBehavior.this.o) {
                                i2 = BottomSheetBehavior.this.f31066i;
                            } else {
                                i2 = BottomSheetBehavior.this.f31069l;
                            }
                        } else if (BottomSheetBehavior.this.o) {
                            i2 = BottomSheetBehavior.this.f31065h;
                        }
                        i3 = 3;
                    } else if (BottomSheetBehavior.this.f31059b) {
                        if (BottomSheetBehavior.this.w == 3) {
                            if (BottomSheetBehavior.this.o || Math.abs(top - BottomSheetBehavior.this.f31066i) < BottomSheetBehavior.this.t) {
                                i2 = BottomSheetBehavior.this.f31066i;
                            }
                        } else if (BottomSheetBehavior.this.f31069l - top >= BottomSheetBehavior.this.s) {
                            i2 = BottomSheetBehavior.this.f31066i;
                        } else {
                            i2 = BottomSheetBehavior.this.f31069l;
                        }
                        i3 = 3;
                    } else {
                        if (BottomSheetBehavior.this.w == 3) {
                            if (BottomSheetBehavior.this.o || Math.abs(top - BottomSheetBehavior.this.f31065h) < BottomSheetBehavior.this.t) {
                                i2 = BottomSheetBehavior.this.f31065h;
                            }
                        } else if (BottomSheetBehavior.this.f31069l - top >= BottomSheetBehavior.this.s) {
                            i2 = BottomSheetBehavior.this.f31065h;
                        } else {
                            i2 = BottomSheetBehavior.this.f31069l;
                        }
                        i3 = 3;
                    }
                } else if ((Math.abs(f2) < Math.abs(f3) && f3 > 500.0f) || ((BottomSheetBehavior.this.w == 3 && view.getTop() - BottomSheetBehavior.this.f31065h >= BottomSheetBehavior.this.v) || (BottomSheetBehavior.this.w == 4 && view.getTop() - BottomSheetBehavior.this.f31069l >= BottomSheetBehavior.this.u))) {
                    i2 = BottomSheetBehavior.this.A;
                    i3 = 5;
                } else if (BottomSheetBehavior.this.f31059b) {
                    if (BottomSheetBehavior.this.w == 3) {
                        if (BottomSheetBehavior.this.o || Math.abs(top - BottomSheetBehavior.this.f31066i) < BottomSheetBehavior.this.t) {
                            i2 = BottomSheetBehavior.this.f31066i;
                        }
                    } else if (BottomSheetBehavior.this.f31069l - top >= BottomSheetBehavior.this.s) {
                        i2 = BottomSheetBehavior.this.f31066i;
                    } else {
                        i2 = BottomSheetBehavior.this.f31069l;
                    }
                    i3 = 3;
                } else {
                    if (BottomSheetBehavior.this.w == 3) {
                        if (BottomSheetBehavior.this.o || Math.abs(top - BottomSheetBehavior.this.f31065h) < BottomSheetBehavior.this.t) {
                            i2 = BottomSheetBehavior.this.f31065h;
                        }
                    } else if (BottomSheetBehavior.this.f31069l - top >= BottomSheetBehavior.this.s) {
                        i2 = BottomSheetBehavior.this.f31065h;
                    } else {
                        i2 = BottomSheetBehavior.this.f31069l;
                    }
                    i3 = 3;
                }
                i2 = BottomSheetBehavior.this.f31069l;
            } else if (BottomSheetBehavior.this.f31059b) {
                if (top <= BottomSheetBehavior.this.f31069l || (BottomSheetBehavior.this.o && BottomSheetBehavior.this.w != 4)) {
                    i2 = BottomSheetBehavior.this.f31066i;
                    i3 = 3;
                } else {
                    i2 = BottomSheetBehavior.this.f31069l;
                }
            } else if (top <= BottomSheetBehavior.this.f31069l || (BottomSheetBehavior.this.o && BottomSheetBehavior.this.w != 4)) {
                i2 = BottomSheetBehavior.this.f31065h;
                i3 = 3;
            } else {
                i2 = BottomSheetBehavior.this.f31069l;
            }
            BottomSheetBehavior.this.a(view, i3, i2, true);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f31058a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31059b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f31060c;

    /* renamed from: d  reason: collision with root package name */
    public int f31061d;

    /* renamed from: e  reason: collision with root package name */
    public int f31062e;

    /* renamed from: f  reason: collision with root package name */
    public c f31063f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f31064g;

    /* renamed from: h  reason: collision with root package name */
    int f31065h;

    /* renamed from: i  reason: collision with root package name */
    int f31066i;

    /* renamed from: j  reason: collision with root package name */
    int f31067j;

    /* renamed from: k  reason: collision with root package name */
    public float f31068k = 0.5f;

    /* renamed from: l  reason: collision with root package name */
    int f31069l;

    /* renamed from: m  reason: collision with root package name */
    float f31070m = -1.0f;
    public boolean n;
    public boolean o;
    public boolean p = true;
    int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w = 5;
    public int x = 4;
    b y;
    int z;

    public static abstract class a {
        static {
            Covode.recordClassIndex(18053);
        }

        public abstract void a(View view);

        public abstract void a(View view, int i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        c cVar;
        if (v.o(coordinatorLayout) && !v.o(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.B == null) {
            this.f31062e = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            this.B = new WeakReference<>(v2);
            if (this.J && (cVar = this.f31063f) != null) {
                v.a(v2, cVar);
            }
            c cVar2 = this.f31063f;
            if (cVar2 != null) {
                boolean z2 = this.x == 3;
                this.L = z2;
                cVar2.a(z2 ? 0.0f : 1.0f);
            }
            if (v.d(v2) == 0) {
                v.a((View) v2, 1);
            }
        }
        if (this.y == null) {
            this.y = new b(coordinatorLayout.getContext(), coordinatorLayout, this.V);
        }
        int top = v2.getTop();
        coordinatorLayout.a(v2, i2);
        this.z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.A = height;
        int i3 = this.r;
        if (i3 > 0) {
            this.f31065h = height - i3;
        } else {
            this.f31065h = 0;
        }
        this.f31066i = Math.max(0, height - v2.getHeight());
        f();
        e();
        int i4 = this.x;
        if (i4 == 3) {
            v.d(v2, b());
        } else if (i4 == 6) {
            v.d(v2, this.f31067j);
        } else if (this.n && i4 == 5) {
            v.d(v2, this.A);
        } else if (i4 == 4) {
            v.d(v2, this.f31069l);
        } else if (i4 == 1 || i4 == 2) {
            v.d(v2, top - v2.getTop());
        }
        this.C = new WeakReference<>(a(v2));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r1 != 3) goto L_0x003c;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r17, V r18, android.view.MotionEvent r19) {
        /*
        // Method dump skipped, instructions count: 546
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.Q = 0;
        this.R = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.C;
        if (weakReference == null || view != weakReference.get() || (this.x == 3 && !super.a(coordinatorLayout, v2, view, f2, f3))) {
            return false;
        }
        return true;
    }

    public final void a(boolean z2) {
        if (this.f31059b != z2) {
            this.f31059b = z2;
            if (this.B != null) {
                e();
            }
            d((!this.f31059b || this.x != 6) ? this.x : 3);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (this.o) {
            return true;
        }
        if ((this.w == 3 && view.getTop() - this.f31065h >= this.v) || (this.w == 4 && view.getTop() - this.f31069l >= this.u)) {
            return true;
        }
        if (view.getTop() < this.f31069l) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f31069l)) / ((float) d()) > 0.5f) {
            return true;
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.bytedance.hybrid.spark.anim.BottomSheetBehavior.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(18052);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        final int f31076a;

        /* renamed from: b  reason: collision with root package name */
        int f31077b;

        /* renamed from: c  reason: collision with root package name */
        int f31078c;

        /* renamed from: d  reason: collision with root package name */
        boolean f31079d;

        /* renamed from: e  reason: collision with root package name */
        boolean f31080e;

        /* renamed from: f  reason: collision with root package name */
        boolean f31081f;

        static {
            Covode.recordClassIndex(18051);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z;
            boolean z2;
            this.f31076a = parcel.readInt();
            this.f31077b = parcel.readInt();
            this.f31078c = parcel.readInt();
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f31079d = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f31080e = z2;
            this.f31081f = parcel.readInt() == 1 ? true : z3;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f31076a = bottomSheetBehavior.x;
            this.f31077b = bottomSheetBehavior.f31061d;
            this.f31078c = bottomSheetBehavior.r;
            this.f31079d = bottomSheetBehavior.f31059b;
            this.f31080e = bottomSheetBehavior.n;
            this.f31081f = bottomSheetBehavior.o;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f31076a);
            parcel.writeInt(this.f31077b);
            parcel.writeInt(this.f31078c);
            parcel.writeInt(this.f31079d ? 1 : 0);
            parcel.writeInt(this.f31080e ? 1 : 0);
            parcel.writeInt(this.f31081f ? 1 : 0);
        }
    }

    static {
        Covode.recordClassIndex(18047);
    }

    private void f() {
        this.f31067j = (int) (((float) this.A) * (1.0f - this.f31068k));
    }

    private void g() {
        this.E = -1;
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.S = null;
        }
    }

    public final int b() {
        if (this.f31059b) {
            return this.f31066i;
        }
        return this.f31065h;
    }

    private void c() {
        V v2;
        if (this.B != null) {
            e();
            if (this.x == 4 && (v2 = this.B.get()) != null) {
                v2.requestLayout();
            }
        }
    }

    private int d() {
        int i2;
        if (this.I) {
            return Math.max(this.f31062e, this.A - ((this.z * 9) / 16));
        }
        int i3 = this.f31061d;
        if (this.f31064g) {
            i2 = 0;
        } else {
            i2 = this.K;
        }
        return i3 + i2;
    }

    private void e() {
        int d2 = d();
        if (this.f31059b) {
            this.f31069l = Math.max(this.A - d2, this.f31066i);
        } else {
            this.f31069l = this.A - d2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a() {
        super.a();
        this.B = null;
        this.y = null;
    }

    public BottomSheetBehavior() {
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public boolean f31082a;

        /* renamed from: b  reason: collision with root package name */
        int f31083b;

        /* renamed from: d  reason: collision with root package name */
        private final View f31085d;

        static {
            Covode.recordClassIndex(18054);
        }

        public final void run() {
            if (BottomSheetBehavior.this.y != null) {
                b bVar = BottomSheetBehavior.this.y;
                if (bVar.f31088a == 2) {
                    boolean computeScrollOffset = bVar.f31100m.computeScrollOffset();
                    int currX = bVar.f31100m.getCurrX();
                    int currY = bVar.f31100m.getCurrY();
                    int left = currX - bVar.o.getLeft();
                    int top = currY - bVar.o.getTop();
                    if (left != 0) {
                        v.e(bVar.o, left);
                    }
                    if (top != 0) {
                        v.d(bVar.o, top);
                    }
                    if (!(left == 0 && top == 0)) {
                        bVar.n.a(currY);
                    }
                    if (computeScrollOffset) {
                        if (currX == bVar.f31100m.getFinalX() && currY == bVar.f31100m.getFinalY()) {
                            bVar.f31100m.abortAnimation();
                        }
                    }
                    bVar.p.post(bVar.q);
                }
                if (bVar.f31088a == 2) {
                    v.a(this.f31085d, this);
                    this.f31082a = false;
                }
            }
            BottomSheetBehavior.this.d(this.f31083b);
            this.f31082a = false;
        }

        b(View view, int i2) {
            this.f31085d = view;
            this.f31083b = i2;
        }
    }

    public final void b(int i2) {
        if (i2 == -1) {
            if (!this.I) {
                this.I = true;
            } else {
                return;
            }
        } else if (this.I || this.f31061d != i2) {
            this.I = false;
            this.f31061d = Math.max(0, i2);
        } else {
            return;
        }
        c();
    }

    private View a(View view) {
        if (v.t(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View a2 = a(viewGroup.getChildAt(i2));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private void f(final int i2) {
        final V v2 = this.B.get();
        if (v2 != null) {
            ViewParent parent = v2.getParent();
            if (parent == null || !parent.isLayoutRequested() || !v.y(v2)) {
                b(v2, i2);
            } else {
                v2.post(new Runnable() {
                    /* class com.bytedance.hybrid.spark.anim.BottomSheetBehavior.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(18048);
                    }

                    public final void run() {
                        BottomSheetBehavior.this.b(v2, i2);
                    }
                });
            }
        }
    }

    private void g(int i2) {
        boolean z2;
        ValueAnimator valueAnimator;
        float f2;
        if (i2 != 2) {
            if (i2 == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.L != z2) {
                this.L = z2;
                if (this.f31063f != null && (valueAnimator = this.N) != null) {
                    if (valueAnimator.isRunning()) {
                        this.N.reverse();
                        return;
                    }
                    if (z2) {
                        f2 = 0.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    this.N.setFloatValues(1.0f - f2, f2);
                    this.N.start();
                }
            }
        }
    }

    public final void c(int i2) {
        if (i2 != this.x) {
            if (this.B != null) {
                f(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.n && i2 == 5)) {
                this.x = i2;
            }
        }
    }

    private void c(boolean z2) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.B;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                int i2 = Build.VERSION.SDK_INT;
                if (z2) {
                    if (this.U == null) {
                        this.U = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.B.get()) {
                        if (z2) {
                            int i4 = Build.VERSION.SDK_INT;
                            this.U.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f31060c) {
                                v.a(childAt, 4);
                            }
                        } else if (this.f31060c && (map = this.U) != null && map.containsKey(childAt)) {
                            v.a(childAt, this.U.get(childAt).intValue());
                        }
                    }
                }
                if (!z2) {
                    this.U = null;
                }
            }
        }
    }

    public final void b(boolean z2) {
        if (this.n != z2) {
            this.n = z2;
            if (!z2 && this.x == 5) {
                c(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        V v2;
        int i3 = this.x;
        if (i3 != i2) {
            this.w = i3;
            this.x = i2;
            WeakReference<V> weakReference = this.B;
            if (!(weakReference == null || (v2 = weakReference.get()) == null)) {
                if (i2 == 3) {
                    c(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    c(false);
                }
                g(i2);
                for (int i4 = 0; i4 < this.D.size(); i4++) {
                    this.D.get(i4).a(v2, i2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(int i2) {
        V v2 = this.B.get();
        a aVar = this.G;
        if (aVar != null && aVar.f31086a == a.EnumC0653a.DONE) {
            v2.getLayoutParams().height = this.A - i2;
            v2.requestLayout();
        } else if (v2 == null) {
            return;
        }
        if (!this.D.isEmpty()) {
            int i3 = this.f31069l;
            if (i2 <= i3 && i3 != b()) {
                b();
            }
            for (int i4 = 0; i4 < this.D.size(); i4++) {
                this.D.get(i4).a(v2);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout.e eVar) {
        super.a(eVar);
        this.B = null;
        this.y = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.a(coordinatorLayout, (View) v2), this);
    }

    /* access modifiers changed from: package-private */
    public final void b(View view, int i2) {
        int i3;
        if (i2 == 4) {
            i3 = this.f31069l;
        } else if (i2 == 6) {
            int i4 = this.f31067j;
            if (!this.f31059b || i4 > (i3 = this.f31066i)) {
                i3 = i4;
            } else {
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = b();
        } else if (!this.n || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i2)));
        } else {
            i3 = this.A;
        }
        a(view, i2, i3, false);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k8, R.attr.k9, R.attr.kb, R.attr.kc});
        this.J = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.N = ofFloat;
        ofFloat.setDuration(500L);
        this.N.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.hybrid.spark.anim.BottomSheetBehavior.AnonymousClass2 */

            static {
                Covode.recordClassIndex(18049);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.f31063f != null) {
                    BottomSheetBehavior.this.f31063f.a(floatValue);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            this.f31070m = -1.0f;
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            b(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            b(peekValue.data);
        }
        b(obtainStyledAttributes.getBoolean(1, false));
        this.f31064g = false;
        a(true);
        this.o = false;
        this.p = true;
        this.f31058a = 0;
        this.f31068k = 0.5f;
        if (this.B != null) {
            f();
        }
        this.f31065h = 0;
        obtainStyledAttributes.recycle();
        this.H = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, v2, savedState.getSuperState());
        int i2 = this.f31058a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f31061d = savedState.f31077b;
            }
            int i3 = this.f31058a;
            if (i3 == -1 || (i3 & 2) == 2) {
                this.f31059b = savedState.f31079d;
            }
            int i4 = this.f31058a;
            if (i4 == -1 || (i4 & 4) == 4) {
                this.n = savedState.f31080e;
            }
            int i5 = this.f31058a;
            if (i5 == -1 || (i5 & 8) == 8) {
                this.o = savedState.f31081f;
            }
        }
        if (savedState.f31076a == 1 || savedState.f31076a == 2) {
            this.x = 4;
        } else {
            this.x = savedState.f31076a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c1, code lost:
        if (r11.f31090c == -1) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c3, code lost:
        r11.b();
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r16, V r17, android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 513
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, int i2, int i3, boolean z2) {
        boolean a2;
        if (z2) {
            a2 = this.y.a(view.getLeft(), i3);
        } else {
            a2 = this.y.a(view, view.getLeft(), i3);
        }
        if (a2) {
            d(2);
            g(i2);
            if (this.M == null) {
                this.M = new b(view, i2);
            }
            if (!this.M.f31082a) {
                this.M.f31083b = i2;
                v.a(view, this.M);
                this.M.f31082a = true;
                return;
            }
            this.M.f31083b = i2;
            return;
        }
        d(i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        float yVelocity;
        int i4 = 3;
        if (v2.getTop() == b()) {
            d(3);
            return;
        }
        WeakReference<View> weakReference = this.C;
        if (weakReference != null && view == weakReference.get() && this.R) {
            if (this.Q <= 0) {
                if (this.n) {
                    VelocityTracker velocityTracker = this.S;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.H);
                        yVelocity = this.S.getYVelocity(this.E);
                    }
                    if (a(v2, yVelocity)) {
                        i3 = this.A;
                        i4 = 5;
                    }
                }
                if (this.Q == 0) {
                    int top = v2.getTop();
                    if (this.f31059b) {
                        if (Math.abs(top - this.f31066i) < Math.abs(top - this.f31069l)) {
                            i3 = this.f31066i;
                        } else {
                            i3 = this.f31069l;
                        }
                    } else if (Math.abs(top - this.f31065h) < Math.abs(top - this.f31069l)) {
                        i3 = this.f31065h;
                    } else {
                        i3 = this.f31069l;
                    }
                } else {
                    i3 = this.f31069l;
                }
                i4 = 4;
            } else if (this.f31059b) {
                i3 = this.f31066i;
            } else {
                i3 = this.f31065h;
            }
            a((View) v2, i4, i3, false);
            this.R = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        View view2;
        if (i4 != 1) {
            WeakReference<View> weakReference = this.C;
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
                    } else if (this.p) {
                        iArr[1] = i3;
                        v.d(v2, -i3);
                        d(1);
                    } else {
                        return;
                    }
                } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.f31069l;
                    if (i5 > i6 && !this.n) {
                        iArr[1] = top - i6;
                        v.d(v2, -iArr[1]);
                        d(4);
                    } else if (this.p) {
                        iArr[1] = i3;
                        v.d(v2, -i3);
                        d(1);
                    } else {
                        return;
                    }
                }
                e(v2.getTop());
                this.Q = i3;
                this.R = true;
            }
        }
    }
}
