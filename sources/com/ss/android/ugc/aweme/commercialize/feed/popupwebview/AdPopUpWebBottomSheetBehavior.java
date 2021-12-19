package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c;
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

public class AdPopUpWebBottomSheetBehavior<V extends View> extends CoordinatorLayout.b<V> {
    private VelocityTracker A;
    private int B;
    private boolean C;
    private final c.a D = new c.a() {
        /* class com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.AnonymousClass2 */

        static {
            Covode.recordClassIndex(45827);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c.a
        public final int a() {
            int i2;
            int i3;
            if (AdPopUpWebBottomSheetBehavior.this.f74263d) {
                i2 = AdPopUpWebBottomSheetBehavior.this.f74267h;
                i3 = AdPopUpWebBottomSheetBehavior.this.f74261b;
            } else {
                i2 = AdPopUpWebBottomSheetBehavior.this.f74262c;
                i3 = AdPopUpWebBottomSheetBehavior.this.f74261b;
            }
            return i2 - i3;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c.a
        public final int b() {
            int i2;
            int i3;
            if (AdPopUpWebBottomSheetBehavior.this.f74263d) {
                i2 = AdPopUpWebBottomSheetBehavior.this.f74267h;
                i3 = AdPopUpWebBottomSheetBehavior.this.f74261b;
            } else {
                i2 = AdPopUpWebBottomSheetBehavior.this.f74262c;
                i3 = AdPopUpWebBottomSheetBehavior.this.f74261b;
            }
            return i2 - i3;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c.a
        public final int a(View view) {
            return view.getLeft();
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c.a
        public final void a(int i2) {
            AdPopUpWebBottomSheetBehavior.this.e(i2);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c.a
        public final void b(int i2) {
            if (i2 == 1) {
                AdPopUpWebBottomSheetBehavior.this.d(1);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c.a
        public final int c(int i2) {
            int i3;
            int i4 = AdPopUpWebBottomSheetBehavior.this.f74261b;
            if (AdPopUpWebBottomSheetBehavior.this.f74263d) {
                i3 = AdPopUpWebBottomSheetBehavior.this.f74267h;
            } else {
                i3 = AdPopUpWebBottomSheetBehavior.this.f74262c;
            }
            return androidx.core.b.a.a(i2, i4, i3);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c.a
        public final boolean a(View view, int i2) {
            View view2;
            if (AdPopUpWebBottomSheetBehavior.this.f74265f == 1 || AdPopUpWebBottomSheetBehavior.this.f74272m) {
                return false;
            }
            if ((AdPopUpWebBottomSheetBehavior.this.f74265f != 3 || AdPopUpWebBottomSheetBehavior.this.f74271l != i2 || (view2 = AdPopUpWebBottomSheetBehavior.this.f74269j.get()) == null || !view2.canScrollVertically(-1)) && AdPopUpWebBottomSheetBehavior.this.f74268i != null && AdPopUpWebBottomSheetBehavior.this.f74268i.get() == view) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
            if ((java.lang.Math.abs(((float) r9.getTop()) + (r11 * 0.1f)) / ((float) r2)) <= 0.5f) goto L_0x0138;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x014b  */
        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r9, float r10, float r11) {
            /*
            // Method dump skipped, instructions count: 339
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.AnonymousClass2.a(android.view.View, float, float):void");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f74260a;

    /* renamed from: b  reason: collision with root package name */
    int f74261b;

    /* renamed from: c  reason: collision with root package name */
    int f74262c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f74263d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f74264e;

    /* renamed from: f  reason: collision with root package name */
    public int f74265f = 4;

    /* renamed from: g  reason: collision with root package name */
    public c f74266g;

    /* renamed from: h  reason: collision with root package name */
    int f74267h;

    /* renamed from: i  reason: collision with root package name */
    WeakReference<V> f74268i;

    /* renamed from: j  reason: collision with root package name */
    WeakReference<View> f74269j;

    /* renamed from: k  reason: collision with root package name */
    public a f74270k;

    /* renamed from: l  reason: collision with root package name */
    int f74271l;

    /* renamed from: m  reason: collision with root package name */
    boolean f74272m;
    public boolean n;
    public boolean o = true;
    int p;
    int q;
    float r = 0.2683658f;
    public WebView s;
    public boolean t;
    private float u;
    private int v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    public static abstract class a {
        static {
            Covode.recordClassIndex(45830);
        }

        public abstract void a(View view, float f2);

        public abstract void a(View view, int i2);
    }

    static {
        Covode.recordClassIndex(45825);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        if (v.o(coordinatorLayout) && !v.o(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        coordinatorLayout.a(v2, i2);
        this.f74267h = coordinatorLayout.getHeight();
        if (this.w) {
            if (this.f74260a == 0) {
                this.f74260a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            }
            i3 = Math.max(this.f74260a, this.f74267h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i3 = this.v;
        }
        int max = Math.max(0, this.f74267h - v2.getHeight());
        this.f74261b = max;
        int max2 = Math.max(this.f74267h - i3, max);
        this.f74262c = max2;
        int i4 = this.f74261b;
        this.p = i4;
        int i5 = this.f74267h;
        int i6 = (int) (((float) i5) * this.r);
        this.q = i6;
        int i7 = this.f74265f;
        if (i7 == 3) {
            v.d(v2, i4);
        } else if (this.f74263d && i7 == 5) {
            v.d(v2, i5);
        } else if (i7 == 4) {
            v.d(v2, max2);
        } else if (i7 == 1 || i7 == 2) {
            v.d(v2, top - v2.getTop());
        } else if (i7 == 6) {
            v.d(v2, i6);
        }
        if (this.f74266g == null) {
            this.f74266g = new c(coordinatorLayout.getContext(), coordinatorLayout, this.D);
        }
        this.f74268i = new WeakReference<>(v2);
        this.f74269j = new WeakReference<>(a(v2));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0143, code lost:
        if (r13 != r14) goto L_0x0112;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
        // Method dump skipped, instructions count: 525
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        if (view == this.f74269j.get()) {
            return this.f74265f != 3 || super.a(coordinatorLayout, v2, view, f2, f3);
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(45829);
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
        final int f74277a;

        static {
            Covode.recordClassIndex(45828);
        }

        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f74277a = i2;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f74277a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f74277a);
        }
    }

    private void c() {
        this.f74271l = -1;
        VelocityTracker velocityTracker = this.A;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A = null;
        }
    }

    public final int b() {
        if (this.w) {
            return -1;
        }
        return this.v;
    }

    public AdPopUpWebBottomSheetBehavior() {
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f74279b;

        /* renamed from: c  reason: collision with root package name */
        private final int f74280c;

        static {
            Covode.recordClassIndex(45831);
        }

        public final void run() {
            if (AdPopUpWebBottomSheetBehavior.this.f74266g != null) {
                c cVar = AdPopUpWebBottomSheetBehavior.this.f74266g;
                if (cVar.f74394a == 2) {
                    boolean computeScrollOffset = cVar.f74406m.computeScrollOffset();
                    int currX = cVar.f74406m.getCurrX();
                    int currY = cVar.f74406m.getCurrY();
                    int left = currX - cVar.o.getLeft();
                    int top = currY - cVar.o.getTop();
                    if (left != 0) {
                        v.e(cVar.o, left);
                    }
                    if (top != 0) {
                        v.d(cVar.o, top);
                    }
                    if (!(left == 0 && top == 0)) {
                        cVar.n.a(currY);
                    }
                    if (computeScrollOffset) {
                        if (currX == cVar.f74406m.getFinalX() && currY == cVar.f74406m.getFinalY()) {
                            cVar.f74406m.abortAnimation();
                        }
                    }
                    cVar.q.post(cVar.r);
                }
                if (cVar.f74394a == 2) {
                    v.a(this.f74279b, this);
                    return;
                }
            }
            AdPopUpWebBottomSheetBehavior.this.d(this.f74280c);
        }

        b(View view, int i2) {
            this.f74279b = view;
            this.f74280c = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        a aVar;
        if (this.f74265f != i2) {
            this.f74265f = i2;
            V v2 = this.f74268i.get();
            if (v2 != null && (aVar = this.f74270k) != null) {
                aVar.a((View) v2, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(int i2) {
        a aVar;
        V v2 = this.f74268i.get();
        if (v2 != null && (aVar = this.f74270k) != null) {
            int i3 = this.f74262c;
            if (i2 > i3) {
                aVar.a(v2, ((float) (i3 - i2)) / ((float) (this.f74267h - i3)));
            } else {
                aVar.a(v2, ((float) (i3 - i2)) / ((float) (i3 - this.f74261b)));
            }
        }
    }

    private View a(View view) {
        while (view != null) {
            if (this.C) {
                return this.f74269j.get();
            }
            if (v.t(view)) {
                return view;
            }
            if (view instanceof ViewPager) {
                view = com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a.a((ViewPager) view);
            } else {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (viewGroup.getVisibility() == 0) {
                        int childCount = viewGroup.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View a2 = a(viewGroup.getChildAt(i2));
                            if (a2 != null) {
                                return a2;
                            }
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }

    public final void c(final int i2) {
        if (i2 != this.f74265f) {
            WeakReference<V> weakReference = this.f74268i;
            if (weakReference != null) {
                final V v2 = weakReference.get();
                if (v2 != null) {
                    ViewParent parent = v2.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !v.y(v2)) {
                        b((View) v2, i2);
                    } else {
                        v2.post(new Runnable() {
                            /* class com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(45826);
                            }

                            public final void run() {
                                AdPopUpWebBottomSheetBehavior.this.b(v2, i2);
                            }
                        });
                    }
                }
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.f74263d && i2 == 5)) {
                this.f74265f = i2;
            }
        }
    }

    public final void b(int i2) {
        WeakReference<V> weakReference;
        V v2;
        if (i2 == -1) {
            if (!this.w) {
                this.w = true;
            } else {
                return;
            }
        } else if (this.w || this.v != i2) {
            this.w = false;
            this.v = Math.max(0, i2);
            this.f74262c = this.f74267h - i2;
        } else {
            return;
        }
        if (this.f74265f == 4 && (weakReference = this.f74268i) != null && (v2 = weakReference.get()) != null) {
            v2.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(int i2) {
        this.y = 0;
        this.z = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.a(coordinatorLayout, (View) v2), this.f74265f);
    }

    private boolean a(View view, float f2) {
        if ((((float) view.getTop()) + (f2 * 0.1f)) / ((float) this.f74267h) > 0.5f) {
            return true;
        }
        return false;
    }

    private boolean b(View view, float f2) {
        if (this.f74264e) {
            return a(view, f2);
        }
        if (view.getTop() >= this.f74262c && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f74262c)) / ((float) this.v) > 0.5f) {
            return true;
        }
        return false;
    }

    public AdPopUpWebBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k8, R.attr.k9, R.attr.kb, R.attr.kc});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            b(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            b(peekValue.data);
        }
        this.f74263d = obtainStyledAttributes.getBoolean(1, false);
        this.f74264e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.u = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (a(r6, r2, r5.A.getXVelocity(r5.f74271l)) == false) goto L_0x007e;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(V r6, android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.a(android.view.View, android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    public final void b(View view, int i2) {
        int i3;
        boolean z2 = this.n;
        if (i2 == 4) {
            i3 = this.f74262c;
            z2 = false;
        } else if (i2 == 3) {
            i3 = this.f74261b;
        } else if (this.f74263d && i2 == 5) {
            i3 = this.f74267h;
        } else if (i2 == 6) {
            i3 = this.q;
        } else {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i2)));
        }
        if (this.f74266g.a(view, view.getLeft(), i3, z2)) {
            d(2);
            v.a(view, new b(view, i2));
            return;
        }
        d(i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, v2, savedState.f2667d);
        if (savedState.f74277a == 1 || savedState.f74277a == 2) {
            this.f74265f = 4;
        } else {
            this.f74265f = savedState.f74277a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (((r3 - ((float) r6.f74262c)) / ((float) r6.v)) > 0.5f) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (((r2 - ((float) r6.f74262c)) / ((float) r6.v)) > 0.5f) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(android.view.View r7, float r8, float r9) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.b(android.view.View, float, float):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e2, code lost:
        if (r11.f74396c == -1) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e4, code lost:
        r11.b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0220 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a9 A[RETURN] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r16, V r17, android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 545
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2, float f3) {
        if (aa.f75532c) {
            return b(view, f2, f3);
        }
        return b(view, f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr) {
        if (view == this.f74269j.get()) {
            int top = v2.getTop();
            int i4 = top - i3;
            if (i3 > 0) {
                int i5 = this.f74261b;
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
                int i6 = this.f74262c;
                if (i4 <= i6 || this.f74263d) {
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
            this.y = i3;
            this.z = true;
        }
    }
}
