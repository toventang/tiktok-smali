package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.g.d;
import androidx.core.h.ad;
import androidx.core.h.j;
import androidx.core.h.r;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.internal.k;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@CoordinatorLayout.c(a = Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f52148a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f52149b;

    /* renamed from: c  reason: collision with root package name */
    int f52150c;

    /* renamed from: d  reason: collision with root package name */
    ad f52151d;

    /* renamed from: e  reason: collision with root package name */
    List<a> f52152e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f52153f;

    /* renamed from: g  reason: collision with root package name */
    private int f52154g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f52155h = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f52156i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f52157j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f52158k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f52159l;

    public interface a<T extends AppBarLayout> {
        static {
            Covode.recordClassIndex(32429);
        }

        void a(T t, int i2);
    }

    public interface c extends a<AppBarLayout> {
        static {
            Covode.recordClassIndex(32431);
        }
    }

    static {
        Covode.recordClassIndex(32420);
    }

    public float getTargetElevation() {
        return 0.0f;
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        static {
            Covode.recordClassIndex(32427);
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.c
        public final /* bridge */ /* synthetic */ int c() {
            return super.c();
        }

        @Override // com.google.android.material.appbar.c
        public final /* bridge */ /* synthetic */ boolean b(int i2) {
            return super.b(i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void a(BaseBehavior.a aVar) {
            super.a(aVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ Parcelable a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.a(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.a(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2) {
            return super.a(coordinatorLayout, appBarLayout, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
            super.a(coordinatorLayout, appBarLayout, view, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, int i4, int i5) {
            return super.a(coordinatorLayout, appBarLayout, i2, i3, i4, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i2, int i3) {
            return super.a(coordinatorLayout, appBarLayout, view, view2, i2, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int[] iArr, int i4) {
            super.a(coordinatorLayout, appBarLayout, view, i2, i3, iArr, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int i4, int i5, int i6) {
            super.a(coordinatorLayout, appBarLayout, view, i2, i3, i4, i5, i6);
        }
    }

    public static class ScrollingViewBehavior extends b {
        static {
            Covode.recordClassIndex(32428);
        }

        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.c
        public final /* bridge */ /* synthetic */ int c() {
            return super.c();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public final /* synthetic */ View a(List list) {
            return b(list);
        }

        @Override // com.google.android.material.appbar.c
        public final /* bridge */ /* synthetic */ boolean b(int i2) {
            return super.b(i2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public final int b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.b(view);
        }

        private static AppBarLayout b(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public final float a(View view) {
            int i2;
            int i3;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.b bVar = ((CoordinatorLayout.e) appBarLayout.getLayoutParams()).f2100a;
                if (bVar instanceof BaseBehavior) {
                    i2 = ((BaseBehavior) bVar).b();
                } else {
                    i2 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i2 > downNestedPreScrollRange) && (i3 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) i2) / ((float) i3)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ka});
            this.f52208d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
            return super.a(coordinatorLayout, view, i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z;
            CoordinatorLayout.b bVar = ((CoordinatorLayout.e) view2.getLayoutParams()).f2100a;
            if (bVar instanceof BaseBehavior) {
                v.d(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).f52161a) + ((b) this).f52207c) - c(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f52153f) {
                    if (view.getScrollY() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    appBarLayout.a(z);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public final boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b2 = b(coordinatorLayout.b(view));
            if (b2 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f52205a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b2.a(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            return super.a(coordinatorLayout, view, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f52150c;
    }

    public static class BaseBehavior<T extends AppBarLayout> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        public int f52161a;

        /* renamed from: c  reason: collision with root package name */
        private int f52162c;

        /* renamed from: d  reason: collision with root package name */
        private ValueAnimator f52163d;

        /* renamed from: e  reason: collision with root package name */
        private int f52164e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f52165f;

        /* renamed from: g  reason: collision with root package name */
        private float f52166g;

        /* renamed from: h  reason: collision with root package name */
        private WeakReference<View> f52167h;

        /* renamed from: i  reason: collision with root package name */
        private a f52168i;

        public static abstract class a<T extends AppBarLayout> {
            static {
                Covode.recordClassIndex(32426);
            }

            public abstract boolean a(T t);
        }

        static {
            Covode.recordClassIndex(32422);
        }

        private static boolean a(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i2, int i3) {
            boolean z = true;
            if ((i2 & 2) == 0 || (!t.f52153f && (t.getTotalScrollRange() == 0 || coordinatorLayout.getHeight() - view.getHeight() > t.getHeight()))) {
                z = false;
            } else {
                ValueAnimator valueAnimator = this.f52163d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.f52167h = null;
            this.f52162c = i3;
            return z;
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int[] iArr, int i4) {
            int i5;
            int i6;
            if (i3 != 0) {
                if (i3 < 0) {
                    i5 = -t.getTotalScrollRange();
                    i6 = t.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i6 = 0;
                }
                if (i5 != i6) {
                    iArr[1] = b(coordinatorLayout, t, i3, i5, i6);
                    a(i3, t, view, i4);
                }
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i5 < 0) {
                b(coordinatorLayout, t, i5, -t.getDownNestedScrollRange(), 0);
                a(i5, t, view, i6);
            }
            if (t.f52153f) {
                t.a(view.getScrollY() > 0);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i2) {
            if (this.f52162c == 0 || i2 == 1) {
                b(coordinatorLayout, (AppBarLayout) t);
            }
            this.f52167h = new WeakReference<>(view);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4, int i5) {
            if (((CoordinatorLayout.e) t.getLayoutParams()).height != -2) {
                return super.a(coordinatorLayout, (View) t, i2, i3, i4, i5);
            }
            coordinatorLayout.a(t, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i2) {
            int round;
            boolean a2 = super.a(coordinatorLayout, (View) t, i2);
            int pendingAction = t.getPendingAction();
            int i3 = this.f52164e;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f52165f) {
                    round = v.i(childAt) + t.getTopInset();
                } else {
                    round = Math.round(((float) childAt.getHeight()) * this.f52166g);
                }
                b(coordinatorLayout, (View) t, i4 + round);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        b(coordinatorLayout, (AppBarLayout) t, i5);
                    } else {
                        b(coordinatorLayout, (View) t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        b(coordinatorLayout, (AppBarLayout) t, 0);
                    } else {
                        b(coordinatorLayout, (View) t, 0);
                    }
                }
            }
            t.f52150c = 0;
            this.f52164e = -1;
            b(androidx.core.b.a.a(c(), -t.getTotalScrollRange(), 0));
            a(coordinatorLayout, (AppBarLayout) t, c(), 0, true);
            t.a(c());
            return a2;
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.a(coordinatorLayout, (View) t, savedState.f2667d);
                this.f52164e = savedState.f52172a;
                this.f52166g = savedState.f52173b;
                this.f52165f = savedState.f52174e;
                return;
            }
            super.a(coordinatorLayout, (View) t, parcelable);
            this.f52164e = -1;
        }

        public BaseBehavior() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        public final int b() {
            return c() + this.f52161a;
        }

        /* access modifiers changed from: protected */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
                /* class com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(32425);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                    return new SavedState[i2];
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }
            };

            /* renamed from: a  reason: collision with root package name */
            int f52172a;

            /* renamed from: b  reason: collision with root package name */
            float f52173b;

            /* renamed from: e  reason: collision with root package name */
            boolean f52174e;

            static {
                Covode.recordClassIndex(32424);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z;
                this.f52172a = parcel.readInt();
                this.f52173b = parcel.readFloat();
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f52174e = z;
            }

            @Override // androidx.customview.view.AbsSavedState
            public void writeToParcel(Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeInt(this.f52172a);
                parcel.writeFloat(this.f52173b);
                parcel.writeByte(this.f52174e ? (byte) 1 : 0);
            }
        }

        public void a(a aVar) {
            this.f52168i = aVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        public final /* synthetic */ int a(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        public final /* synthetic */ int b(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        private static View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt instanceof j) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        public final /* synthetic */ boolean c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            a aVar = this.f52168i;
            if (aVar != 0) {
                return aVar.a(appBarLayout);
            }
            WeakReference<View> weakReference = this.f52167h;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private static int a(T t, int i2) {
            int childCount = t.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = t.getChildAt(i3);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                b bVar = (b) childAt.getLayoutParams();
                if (a(bVar.f52175a, 32)) {
                    top -= bVar.topMargin;
                    bottom += bVar.bottomMargin;
                }
                int i4 = -i2;
                if (top <= i4 && bottom >= i4) {
                    return i3;
                }
            }
            return -1;
        }

        private static View b(AppBarLayout appBarLayout, int i2) {
            int abs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private static boolean c(CoordinatorLayout coordinatorLayout, T t) {
            List<View> c2 = coordinatorLayout.c(t);
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                CoordinatorLayout.b bVar = ((CoordinatorLayout.e) c2.get(i2).getLayoutParams()).f2100a;
                if (bVar instanceof ScrollingViewBehavior) {
                    if (((b) bVar).f52208d != 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public void b(CoordinatorLayout coordinatorLayout, T t) {
            int b2 = b();
            int a2 = a((AppBarLayout) t, b2);
            if (a2 >= 0) {
                View childAt = t.getChildAt(a2);
                b bVar = (b) childAt.getLayoutParams();
                int i2 = bVar.f52175a;
                if ((i2 & 17) == 17) {
                    int i3 = -childAt.getTop();
                    int i4 = -childAt.getBottom();
                    if (a2 == t.getChildCount() - 1) {
                        i4 += t.getTopInset();
                    }
                    if (a(i2, 2)) {
                        i4 += v.i(childAt);
                    } else if (a(i2, 5)) {
                        int i5 = v.i(childAt) + i4;
                        if (b2 < i5) {
                            i3 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    if (a(i2, 32)) {
                        i3 += bVar.topMargin;
                        i4 -= bVar.bottomMargin;
                    }
                    if (b2 < (i4 + i3) / 2) {
                        i3 = i4;
                    }
                    b(coordinatorLayout, (AppBarLayout) t, androidx.core.b.a.a(i3, -t.getTotalScrollRange(), 0));
                }
            }
        }

        public Parcelable a(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable a2 = super.a(coordinatorLayout, (View) t);
            int c2 = c();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + c2;
                if (childAt.getTop() + c2 <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(a2);
                    savedState.f52172a = i2;
                    if (bottom == v.i(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f52174e = z;
                    savedState.f52173b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return a2;
        }

        private void b(final CoordinatorLayout coordinatorLayout, final T t, int i2) {
            int height;
            int abs = Math.abs(b() - i2);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            int b2 = b();
            if (b2 == i2) {
                ValueAnimator valueAnimator = this.f52163d;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f52163d.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f52163d;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f52163d = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.a.a.f52130e);
                this.f52163d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.appbar.AppBarLayout.BaseBehavior.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(32423);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.b(coordinatorLayout, (View) t, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.f52163d.setDuration((long) Math.min(height, 600));
            this.f52163d.setIntValues(b2, i2);
            this.f52163d.start();
        }

        private void a(int i2, T t, View view, int i3) {
            if (i3 == 1) {
                int b2 = b();
                if (i2 < 0) {
                    if (b2 != 0) {
                        return;
                    }
                } else if (i2 <= 0 || b2 != (-t.getDownNestedScrollRange())) {
                    return;
                }
                v.u(view);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        public final /* synthetic */ int a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int b2 = b();
            if (i3 == 0 || b2 < i3 || b2 > i4) {
                this.f52161a = 0;
                return 0;
            }
            int a2 = androidx.core.b.a.a(i2, i3, i4);
            if (b2 == a2) {
                return 0;
            }
            if (appBarLayout.f52149b) {
                int abs = Math.abs(a2);
                int childCount = appBarLayout.getChildCount();
                int i8 = 0;
                while (true) {
                    if (i8 >= childCount) {
                        break;
                    }
                    View childAt = appBarLayout.getChildAt(i8);
                    b bVar = (b) childAt.getLayoutParams();
                    Interpolator interpolator = bVar.f52176b;
                    if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                        i8++;
                    } else if (interpolator != null) {
                        int i9 = bVar.f52175a;
                        if ((i9 & 1) != 0) {
                            i7 = childAt.getHeight() + bVar.topMargin + bVar.bottomMargin + 0;
                            if ((i9 & 2) != 0) {
                                i7 -= v.i(childAt);
                            }
                        } else {
                            i7 = 0;
                        }
                        if (v.o(childAt)) {
                            i7 -= appBarLayout.getTopInset();
                        }
                        if (i7 > 0) {
                            float f2 = (float) i7;
                            i5 = Integer.signum(a2) * (childAt.getTop() + Math.round(f2 * interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f2)));
                        }
                    }
                }
            }
            i5 = a2;
            boolean b3 = b(i5);
            int i10 = b2 - a2;
            this.f52161a = a2 - i5;
            if (!b3 && appBarLayout.f52149b) {
                coordinatorLayout.a(appBarLayout);
            }
            appBarLayout.a(c());
            if (a2 < b2) {
                i6 = -1;
            } else {
                i6 = 1;
            }
            a(coordinatorLayout, appBarLayout, a2, i6, false);
            return i10;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f52148a = -1;
        this.f52154g = -1;
        this.f52155h = -1;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public static class b extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f52175a = 1;

        /* renamed from: b  reason: collision with root package name */
        public Interpolator f52176b;

        static {
            Covode.recordClassIndex(32430);
        }

        public b() {
            super(-1, -2);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            MethodCollector.i(3016);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a1n, R.attr.a1o});
            this.f52175a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f52176b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
            MethodCollector.o(3016);
        }
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        ad adVar = this.f52151d;
        if (adVar != null) {
            return adVar.b();
        }
        return 0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int i2 = v.i(this);
        if (i2 == 0 && ((childCount = getChildCount()) <= 0 || (i2 = v.i(getChildAt(childCount - 1))) == 0)) {
            return getHeight() / 3;
        }
        return (i2 * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int topInset;
        int i2 = this.f52154g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = bVar.f52175a;
            if ((i4 & 5) != 5) {
                if (i3 > 0) {
                    break;
                }
            } else {
                int i5 = i3 + bVar.topMargin + bVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    i3 = i5 + v.i(childAt);
                } else {
                    if ((i4 & 2) != 0) {
                        topInset = v.i(childAt);
                    } else {
                        topInset = getTopInset();
                    }
                    i3 = i5 + (measuredHeight - topInset);
                }
            }
        }
        int max = Math.max(0, i3);
        this.f52154g = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i2 = this.f52155h;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin;
            int i5 = bVar.f52175a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= v.i(childAt) + getTopInset();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f52155h = max;
        return max;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f52148a;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = bVar.f52175a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + bVar.topMargin + bVar.bottomMargin;
            if ((i5 & 2) != 0) {
                i4 -= v.i(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4 - getTopInset());
        this.f52148a = max;
        return max;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public void setLiftOnScroll(boolean z) {
        this.f52153f = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public void setExpanded(boolean z) {
        a(z, v.v(this), true);
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        List<a> list = this.f52152e;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f52152e.get(i3);
                if (aVar != null) {
                    aVar.a(this, i2);
                }
            }
        }
    }

    private static b a(ViewGroup.LayoutParams layoutParams) {
        int i2 = Build.VERSION.SDK_INT;
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new b((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public final void a(a aVar) {
        if (this.f52152e == null) {
            this.f52152e = new ArrayList();
        }
        if (aVar != null && !this.f52152e.contains(aVar)) {
            this.f52152e.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f52159l == null) {
            this.f52159l = new int[4];
        }
        int[] iArr = this.f52159l;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z = this.f52157j;
        if (z) {
            i3 = R.attr.afi;
        } else {
            i3 = -2130970175;
        }
        iArr[0] = i3;
        if (!z || !this.f52158k) {
            i4 = -2130970176;
        } else {
            i4 = R.attr.afj;
        }
        iArr[1] = i4;
        if (z) {
            i5 = R.attr.afh;
        } else {
            i5 = -2130970174;
        }
        iArr[2] = i5;
        if (!z || !this.f52158k) {
            i6 = -2130970173;
        } else {
            i6 = R.attr.afg;
        }
        iArr[3] = i6;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(boolean z) {
        if (this.f52158k == z) {
            return false;
        }
        this.f52158k = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(3219);
        super.onMeasure(i2, i3);
        a();
        MethodCollector.o(3219);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3214);
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            try {
                Context context2 = getContext();
                TypedArray a2 = k.a(context2, attributeSet, e.f52217a, 0, R.style.qw, new int[0]);
                try {
                    if (a2.hasValue(0)) {
                        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, a2.getResourceId(0, 0)));
                    }
                    a2.recycle();
                } catch (Throwable th) {
                    a2.recycle();
                    MethodCollector.o(3214);
                    throw th;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        TypedArray a3 = k.a(context, attributeSet, new int[]{16842964, 16843919, 16844096, R.attr.sh, R.attr.tc, R.attr.a2e}, 0, R.style.qw, new int[0]);
        v.a(this, a3.getDrawable(0));
        if (a3.hasValue(4)) {
            a(a3.getBoolean(4, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && a3.hasValue(3)) {
            e.a(this, (float) a3.getDimensionPixelSize(3, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (a3.hasValue(2)) {
                setKeyboardNavigationCluster(a3.getBoolean(2, false));
            }
            if (a3.hasValue(1)) {
                setTouchscreenBlocksFocus(a3.getBoolean(1, false));
            }
        }
        this.f52153f = a3.getBoolean(5, false);
        a3.recycle();
        v.a(this, new r() {
            /* class com.google.android.material.appbar.AppBarLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32421);
            }

            @Override // androidx.core.h.r
            public final ad a(View view, ad adVar) {
                ad adVar2;
                AppBarLayout appBarLayout = AppBarLayout.this;
                if (v.o(appBarLayout)) {
                    adVar2 = adVar;
                } else {
                    adVar2 = null;
                }
                if (!d.a(appBarLayout.f52151d, adVar2)) {
                    appBarLayout.f52151d = adVar2;
                    appBarLayout.a();
                }
                return adVar;
            }
        });
        MethodCollector.o(3214);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        int i2;
        int i3;
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        int i4 = 0;
        if (z2) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i5 = i2 | i3;
        if (z3) {
            i4 = 8;
        }
        this.f52150c = i5 | i4;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(3230);
        super.onLayout(z, i2, i3, i4, i5);
        a();
        boolean z2 = false;
        this.f52149b = false;
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            } else if (((b) getChildAt(i6).getLayoutParams()).f52176b != null) {
                this.f52149b = true;
                break;
            } else {
                i6++;
            }
        }
        if (!this.f52156i) {
            if (!this.f52153f) {
                int childCount2 = getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    }
                    b bVar = (b) getChildAt(i7).getLayoutParams();
                    if ((bVar.f52175a & 1) == 1 && (bVar.f52175a & 10) != 0) {
                        break;
                    }
                    i7++;
                }
            }
            z2 = true;
            if (this.f52157j != z2) {
                this.f52157j = z2;
                refreshDrawableState();
            }
        }
        MethodCollector.o(3230);
    }
}
