package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.app.Dialog;
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
    public int f130353a;

    /* renamed from: b  reason: collision with root package name */
    int f130354b;

    /* renamed from: c  reason: collision with root package name */
    int f130355c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f130356d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f130357e;

    /* renamed from: f  reason: collision with root package name */
    public int f130358f = 4;

    /* renamed from: g  reason: collision with root package name */
    androidx.customview.a.a f130359g;

    /* renamed from: h  reason: collision with root package name */
    int f130360h;

    /* renamed from: i  reason: collision with root package name */
    WeakReference<V> f130361i;

    /* renamed from: j  reason: collision with root package name */
    WeakReference<View> f130362j;

    /* renamed from: k  reason: collision with root package name */
    WeakReference<Dialog> f130363k;

    /* renamed from: l  reason: collision with root package name */
    public a f130364l;

    /* renamed from: m  reason: collision with root package name */
    int f130365m;
    boolean n;
    private float o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private VelocityTracker u;
    private int v;
    private final a.AbstractC0038a w = new a.AbstractC0038a() {
        /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.AnonymousClass2 */

        static {
            Covode.recordClassIndex(85493);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int b() {
            int i2;
            int i3;
            if (ViewPagerBottomSheetBehavior.this.f130356d) {
                i2 = ViewPagerBottomSheetBehavior.this.f130360h;
                i3 = ViewPagerBottomSheetBehavior.this.f130354b;
            } else {
                i2 = ViewPagerBottomSheetBehavior.this.f130355c;
                i3 = ViewPagerBottomSheetBehavior.this.f130354b;
            }
            return i2 - i3;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(int i2) {
            if (i2 == 1) {
                ViewPagerBottomSheetBehavior.this.b(1);
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int c(View view, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final boolean b(View view, int i2) {
            View view2;
            if (ViewPagerBottomSheetBehavior.this.f130358f == 1 || ViewPagerBottomSheetBehavior.this.n) {
                return false;
            }
            if ((ViewPagerBottomSheetBehavior.this.f130358f != 3 || ViewPagerBottomSheetBehavior.this.f130365m != i2 || (view2 = ViewPagerBottomSheetBehavior.this.f130362j.get()) == null || !view2.canScrollVertically(-1)) && ViewPagerBottomSheetBehavior.this.f130361i != null && ViewPagerBottomSheetBehavior.this.f130361i.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view, int i2, int i3) {
            int i4;
            int i5 = ViewPagerBottomSheetBehavior.this.f130354b;
            if (ViewPagerBottomSheetBehavior.this.f130356d) {
                i4 = ViewPagerBottomSheetBehavior.this.f130360h;
            } else {
                i4 = ViewPagerBottomSheetBehavior.this.f130355c;
            }
            return androidx.core.b.a.a(i2, i5, i4);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, float f2, float f3) {
            int i2;
            int i3 = 3;
            if (f3 < 0.0f) {
                i2 = ViewPagerBottomSheetBehavior.this.f130354b;
            } else if (!ViewPagerBottomSheetBehavior.this.f130356d || !ViewPagerBottomSheetBehavior.this.a(view, f3)) {
                if (f3 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f130354b) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f130355c)) {
                        i2 = ViewPagerBottomSheetBehavior.this.f130354b;
                    } else {
                        i2 = ViewPagerBottomSheetBehavior.this.f130355c;
                    }
                } else {
                    i2 = ViewPagerBottomSheetBehavior.this.f130355c;
                }
                i3 = 4;
            } else {
                i2 = ViewPagerBottomSheetBehavior.this.f130360h;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f130359g.a(view.getLeft(), i2)) {
                ViewPagerBottomSheetBehavior.this.b(2);
                v.a(view, new b(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.b(i3);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, int i2, int i3, int i4, int i5) {
            ViewPagerBottomSheetBehavior.this.b();
        }
    };

    public static abstract class a {
        static {
            Covode.recordClassIndex(85496);
        }

        public abstract void a(int i2);
    }

    static {
        Covode.recordClassIndex(85491);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        View view;
        if (!v2.isShown()) {
            this.r = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.v = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f130362j;
            if (!(weakReference == null || (view = weakReference.get()) == null || !coordinatorLayout.a(view, x, this.v))) {
                this.f130365m = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.n = true;
            }
            this.r = this.f130365m == -1 && !coordinatorLayout.a(v2, x, this.v);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.n = false;
            this.f130365m = -1;
            if (this.r) {
                this.r = false;
                return false;
            }
        }
        if (!this.r && this.f130359g.a(motionEvent)) {
            return true;
        }
        View view2 = this.f130362j.get();
        return actionMasked == 2 && view2 != null && !this.r && this.f130358f != 1 && !coordinatorLayout.a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.v) - motionEvent.getY()) > ((float) this.f130359g.f2653b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        if (view == this.f130362j.get()) {
            return this.f130358f != 3 || super.a(coordinatorLayout, v2, view, f2, f3);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f130361i.get();
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(85495);
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
        final int f130370a;

        static {
            Covode.recordClassIndex(85494);
        }

        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f130370a = i2;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f130370a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f130370a);
        }
    }

    public ViewPagerBottomSheetBehavior() {
    }

    private void c() {
        this.f130365m = -1;
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f130372b;

        /* renamed from: c  reason: collision with root package name */
        private final int f130373c;

        static {
            Covode.recordClassIndex(85497);
        }

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f130359g == null || !ViewPagerBottomSheetBehavior.this.f130359g.c()) {
                ViewPagerBottomSheetBehavior.this.b(this.f130373c);
            } else {
                v.a(this.f130372b, this);
            }
        }

        b(View view, int i2) {
            this.f130372b = view;
            this.f130373c = i2;
        }
    }

    public final void a(Dialog dialog) {
        this.f130363k = new WeakReference<>(dialog);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        a aVar;
        if (this.f130358f != i2) {
            this.f130358f = i2;
            if (this.f130361i.get() != null && (aVar = this.f130364l) != null) {
                aVar.a(i2);
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

    private void c(int i2) {
        WeakReference<V> weakReference;
        V v2;
        if (i2 == -1) {
            if (!this.q) {
                this.q = true;
            } else {
                return;
            }
        } else if (this.q || this.p != i2) {
            this.q = false;
            this.p = Math.max(0, i2);
            this.f130355c = this.f130360h - i2;
        } else {
            return;
        }
        if (this.f130358f == 4 && (weakReference = this.f130361i) != null && (v2 = weakReference.get()) != null) {
            v2.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public final View a(View view) {
        View a2;
        if (v.t(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View focusedChild = ((ViewPager) view).getFocusedChild();
            if (!(focusedChild == null || (a2 = a(focusedChild)) == null)) {
                return a2;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View a3 = a(viewGroup.getChildAt(i2));
                if (a3 != null) {
                    return a3;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(int i2) {
        this.s = 0;
        this.t = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.a(coordinatorLayout, (View) v2), this.f130358f);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k8, R.attr.k9, R.attr.kb, R.attr.kc});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            c(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            c(peekValue.data);
        }
        this.f130356d = obtainStyledAttributes.getBoolean(1, false);
        this.f130357e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.o = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: package-private */
    public final void b(View view, int i2) {
        int i3;
        if (i2 == 4) {
            i3 = this.f130355c;
        } else if (i2 == 3) {
            i3 = this.f130354b;
        } else if (!this.f130356d || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i2)));
        } else {
            i3 = this.f130360h;
        }
        if (this.f130359g.a(view, view.getLeft(), i3)) {
            b(2);
            v.a(view, new b(view, i2));
            return;
        }
        b(i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(V v2, View view) {
        int i2;
        int i3 = 3;
        if (v2.getTop() == this.f130354b) {
            b(3);
            return;
        }
        WeakReference<View> weakReference = this.f130362j;
        if (weakReference != null && view == weakReference.get() && this.t) {
            if (this.s > 0) {
                i2 = this.f130354b;
            } else {
                if (this.f130356d) {
                    this.u.computeCurrentVelocity(1000, this.o);
                    if (a(v2, this.u.getYVelocity(this.f130365m))) {
                        i2 = this.f130360h;
                        i3 = 5;
                    }
                }
                if (this.s == 0) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f130354b) < Math.abs(top - this.f130355c)) {
                        i2 = this.f130354b;
                    } else {
                        i2 = this.f130355c;
                    }
                } else {
                    i2 = this.f130355c;
                }
                i3 = 4;
            }
            if (this.f130359g.a((View) v2, v2.getLeft(), i2)) {
                b(2);
                v.a(v2, new b(v2, i3));
            } else {
                b(i3);
            }
            this.t = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        if (this.f130357e) {
            return true;
        }
        if (view.getTop() >= this.f130355c && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.f130355c)) / ((float) this.p) > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.a(coordinatorLayout, v2, savedState.f2667d);
        if (savedState.f130370a == 1 || savedState.f130370a == 2) {
            this.f130358f = 4;
        } else {
            this.f130358f = savedState.f130370a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean b(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f130358f == 1 && actionMasked == 0) {
            return true;
        }
        androidx.customview.a.a aVar = this.f130359g;
        if (aVar != null) {
            aVar.b(motionEvent);
        }
        if (actionMasked == 0) {
            c();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.r && Math.abs(((float) this.v) - motionEvent.getY()) > ((float) this.f130359g.f2653b)) {
            this.f130359g.a(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.r) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        Dialog dialog;
        int i3;
        if (v.o(coordinatorLayout) && !v.o(v2)) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        try {
            coordinatorLayout.a(v2, i2);
            this.f130360h = coordinatorLayout.getHeight();
            if (this.q) {
                if (this.f130353a == 0) {
                    this.f130353a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
                }
                i3 = Math.max(this.f130353a, this.f130360h - ((coordinatorLayout.getWidth() * 9) / 16));
            } else {
                i3 = this.p;
            }
            int max = Math.max(0, this.f130360h - v2.getHeight());
            this.f130354b = max;
            int max2 = Math.max(this.f130360h - i3, max);
            this.f130355c = max2;
            int i4 = this.f130358f;
            if (i4 == 3) {
                v.d(v2, this.f130354b);
            } else if (this.f130356d && i4 == 5) {
                v.d(v2, this.f130360h);
            } else if (i4 == 4) {
                v.d(v2, max2);
            } else if (i4 == 1 || i4 == 2) {
                v.d(v2, top - v2.getTop());
            }
            if (this.f130359g == null) {
                this.f130359g = androidx.customview.a.a.a(coordinatorLayout, this.w);
            }
            this.f130361i = new WeakReference<>(v2);
            this.f130362j = new WeakReference<>(a(v2));
            return true;
        } catch (Exception e2) {
            if (!(this.f130363k == null || (dialog = this.f130363k.get()) == null || !dialog.isShowing())) {
                dialog.dismiss();
            }
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            return true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr) {
        if (view == this.f130362j.get()) {
            int top = v2.getTop();
            int i4 = top - i3;
            if (i3 > 0) {
                int i5 = this.f130354b;
                if (i4 < i5) {
                    iArr[1] = top - i5;
                    v.d(v2, -iArr[1]);
                    b(3);
                } else {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    b(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.f130355c;
                if (i4 <= i6 || this.f130356d) {
                    iArr[1] = i3;
                    v.d(v2, -i3);
                    b(1);
                } else {
                    iArr[1] = top - i6;
                    v.d(v2, -iArr[1]);
                    b(4);
                }
            }
            v2.getTop();
            b();
            this.s = i3;
            this.t = true;
        }
    }
}
