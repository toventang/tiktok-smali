package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.g.f;
import androidx.core.h.ad;
import androidx.core.h.o;
import androidx.core.h.q;
import androidx.core.h.r;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements o {

    /* renamed from: a  reason: collision with root package name */
    static final String f2084a;

    /* renamed from: b  reason: collision with root package name */
    static final Class<?>[] f2085b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<b>>> f2086c = new ThreadLocal<>();

    /* renamed from: d  reason: collision with root package name */
    static final Comparator<View> f2087d;

    /* renamed from: h  reason: collision with root package name */
    private static final f.a<Rect> f2088h = new f.c(12);

    /* renamed from: e  reason: collision with root package name */
    ad f2089e;

    /* renamed from: f  reason: collision with root package name */
    boolean f2090f;

    /* renamed from: g  reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f2091g;

    /* renamed from: i  reason: collision with root package name */
    private final List<View> f2092i;

    /* renamed from: j  reason: collision with root package name */
    private final a<View> f2093j;

    /* renamed from: k  reason: collision with root package name */
    private final List<View> f2094k;

    /* renamed from: l  reason: collision with root package name */
    private final List<View> f2095l;

    /* renamed from: m  reason: collision with root package name */
    private final int[] f2096m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private f s;
    private boolean t;
    private Drawable u;
    private r v;
    private final q w;

    public interface a {
        static {
            Covode.recordClassIndex(631);
        }

        b getBehavior();
    }

    public @interface c {
        static {
            Covode.recordClassIndex(633);
        }

        Class<? extends b> a();
    }

    private static int c(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int d(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static int e(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    public static abstract class b<V extends View> {
        static {
            Covode.recordClassIndex(632);
        }

        public void a() {
        }

        public void a(V v, int i2) {
        }

        public void a(V v, View view) {
        }

        public void a(e eVar) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr) {
        }

        public boolean a(int i2) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i2) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public b() {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                return a(i2);
            }
            return false;
        }

        public Parcelable a(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public b(Context context, AttributeSet attributeSet) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
            if (i2 == 0) {
                a(v, view);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
            if (i4 == 0) {
                a(coordinatorLayout, v, view, i2, i3, iArr);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i6 == 0) {
                a(v, i3);
            }
        }
    }

    static class g implements Comparator<View> {
        static {
            Covode.recordClassIndex(637);
        }

        g() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            float w = v.w(view);
            float w2 = v.w(view2);
            if (w > w2) {
                return -1;
            }
            if (w < w2) {
                return 1;
            }
            return 0;
        }
    }

    public final ad getLastWindowInsets() {
        return this.f2089e;
    }

    public Drawable getStatusBarBackground() {
        return this.u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r13 == false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.view.MotionEvent r24, int r25) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.a(android.view.MotionEvent, int):boolean");
    }

    public final void a(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = 0;
        if (eVar.f2110k == null && eVar.f2105f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (eVar.f2110k != null) {
            View view2 = eVar.f2110k;
            Rect a2 = a();
            Rect a3 = a();
            try {
                a(view2, a2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                a(i2, a2, a3, eVar2, measuredWidth, measuredHeight);
                a(eVar2, a3, measuredWidth, measuredHeight);
                view.layout(a3.left, a3.top, a3.right, a3.bottom);
            } finally {
                a(a2);
                a(a3);
            }
        } else if (eVar.f2104e >= 0) {
            int i4 = eVar.f2104e;
            e eVar3 = (e) view.getLayoutParams();
            int a4 = androidx.core.h.e.a(d(eVar3.f2102c), i2);
            int i5 = a4 & 7;
            int i6 = a4 & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i2 == 1) {
                i4 = width - i4;
            }
            int b2 = b(i4) - measuredWidth2;
            if (i5 == 1) {
                b2 += measuredWidth2 / 2;
            } else if (i5 == 5) {
                b2 += measuredWidth2;
            }
            if (i6 == 16) {
                i3 = 0 + (measuredHeight2 / 2);
            } else if (i6 == 80) {
                i3 = measuredHeight2 + 0;
            }
            int max = Math.max(getPaddingLeft() + eVar3.leftMargin, Math.min(b2, ((width - getPaddingRight()) - measuredWidth2) - eVar3.rightMargin));
            int max2 = Math.max(getPaddingTop() + eVar3.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - eVar3.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
        } else {
            e eVar4 = (e) view.getLayoutParams();
            Rect a5 = a();
            a5.set(getPaddingLeft() + eVar4.leftMargin, getPaddingTop() + eVar4.topMargin, (getWidth() - getPaddingRight()) - eVar4.rightMargin, (getHeight() - getPaddingBottom()) - eVar4.bottomMargin);
            if (this.f2089e != null && v.o(this) && !v.o(view)) {
                a5.left += this.f2089e.f2507b.g().f2406b;
                a5.top += this.f2089e.f2507b.g().f2407c;
                a5.right -= this.f2089e.f2507b.g().f2408d;
                a5.bottom -= this.f2089e.f2507b.g().f2409e;
            }
            Rect a6 = a();
            androidx.core.h.e.a(c(eVar4.f2102c), view.getMeasuredWidth(), view.getMeasuredHeight(), a5, a6, i2);
            view.layout(a6.left, a6.top, a6.right, a6.bottom);
            a(a5);
            a(a6);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        boolean z;
        boolean z2;
        int width;
        int i3;
        int height;
        int i4;
        b bVar;
        int e2 = v.e(this);
        int size = this.f2092i.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2092i.get(i5);
            e eVar = (e) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i6 = 0; i6 < i5; i6++) {
                    if (eVar.f2111l == this.f2092i.get(i6)) {
                        e eVar2 = (e) view.getLayoutParams();
                        if (eVar2.f2110k != null) {
                            Rect a5 = a();
                            Rect a6 = a();
                            Rect a7 = a();
                            a(eVar2.f2110k, a5);
                            a(view, false, a6);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            e2 = e2;
                            a(e2, a5, a7, eVar2, measuredWidth, measuredHeight);
                            boolean z3 = (a7.left == a6.left && a7.top == a6.top) ? false : true;
                            a(eVar2, a7, measuredWidth, measuredHeight);
                            int i7 = a7.left - a6.left;
                            int i8 = a7.top - a6.top;
                            if (i7 != 0) {
                                v.e(view, i7);
                            }
                            if (i8 != 0) {
                                v.d(view, i8);
                            }
                            if (z3 && (bVar = eVar2.f2100a) != null) {
                                bVar.b(this, view, eVar2.f2110k);
                            }
                            a(a5);
                            a(a6);
                            a(a7);
                        }
                    }
                }
                a(view, true, a3);
                if (eVar.f2106g != 0 && !a3.isEmpty()) {
                    int a8 = androidx.core.h.e.a(eVar.f2106g, e2);
                    int i9 = a8 & 112;
                    if (i9 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i9 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i10 = a8 & 7;
                    if (i10 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i10 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (eVar.f2107h != 0 && view.getVisibility() == 0 && v.v(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    e eVar3 = (e) view.getLayoutParams();
                    b bVar2 = eVar3.f2100a;
                    Rect a9 = a();
                    Rect a10 = a();
                    a10.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (bVar2 == null || !bVar2.a(this, view, a9)) {
                        a9.set(a10);
                    } else if (!a10.contains(a9)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a9.toShortString() + " | Bounds:" + a10.toShortString());
                    }
                    a(a10);
                    if (!a9.isEmpty()) {
                        int a11 = androidx.core.h.e.a(eVar3.f2107h, e2);
                        if ((a11 & 48) != 48 || (i4 = (a9.top - eVar3.topMargin) - eVar3.f2109j) >= a2.top) {
                            z = false;
                        } else {
                            d(view, a2.top - i4);
                            z = true;
                        }
                        if ((a11 & 80) == 80 && (height = ((getHeight() - a9.bottom) - eVar3.bottomMargin) + eVar3.f2109j) < a2.bottom) {
                            d(view, height - a2.bottom);
                        } else if (!z) {
                            d(view, 0);
                        }
                        if ((a11 & 3) != 3 || (i3 = (a9.left - eVar3.leftMargin) - eVar3.f2108i) >= a2.left) {
                            z2 = false;
                        } else {
                            c(view, a2.left - i3);
                            z2 = true;
                        }
                        if ((a11 & 5) == 5 && (width = ((getWidth() - a9.right) - eVar3.rightMargin) + eVar3.f2108i) < a2.right) {
                            c(view, width - a2.right);
                        } else if (!z2) {
                            c(view, 0);
                        }
                    }
                    a(a9);
                }
                if (i2 != 2) {
                    a4.set(((e) view.getLayoutParams()).o);
                    if (!a4.equals(a3)) {
                        ((e) view.getLayoutParams()).o.set(a3);
                    }
                }
                for (int i11 = i5 + 1; i11 < size; i11++) {
                    View view2 = this.f2092i.get(i11);
                    e eVar4 = (e) view2.getLayoutParams();
                    b bVar3 = eVar4.f2100a;
                    if (bVar3 != null && bVar3.a(this, view2, view)) {
                        if (i2 == 0) {
                            if (eVar4.n) {
                                eVar4.n = false;
                            }
                        } else if (i2 == 2) {
                        }
                        boolean b2 = bVar3.b(this, view2, view);
                        if (i2 == 1) {
                            eVar4.n = b2;
                        }
                    }
                }
            }
        }
        a(a2);
        a(a3);
        a(a4);
    }

    public final void a(View view) {
        List b2 = this.f2093j.b(view);
        if (!(b2 == null || b2.isEmpty())) {
            for (int i2 = 0; i2 < b2.size(); i2++) {
                View view2 = (View) b2.get(i2);
                b bVar = ((e) view2.getLayoutParams()).f2100a;
                if (bVar != null) {
                    bVar.b(this, view2, view);
                }
            }
        }
    }

    public final boolean a(View view, int i2, int i3) {
        Rect a2 = a();
        a(view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a(a2);
        }
    }

    @Override // androidx.core.h.o
    public final boolean a(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f2100a;
                if (bVar != null) {
                    boolean a2 = bVar.a(this, childAt, view, view2, i2, i3);
                    z |= a2;
                    eVar.a(i3, a2);
                } else {
                    eVar.a(i3, false);
                }
            }
        }
        return z;
    }

    @Override // androidx.core.h.o
    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        b bVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i6) && (bVar = eVar.f2100a) != null) {
                    bVar.a(this, childAt, view, i2, i3, i4, i5, i6);
                    z = true;
                }
            }
        }
        if (z) {
            a(1);
        }
    }

    @Override // androidx.core.h.o
    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        b bVar;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i4) && (bVar = eVar.f2100a) != null) {
                    int[] iArr2 = this.f2096m;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    bVar.a(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f2096m;
                    if (i2 > 0) {
                        i5 = Math.max(i5, iArr3[0]);
                    } else {
                        i5 = Math.min(i5, iArr3[0]);
                    }
                    int[] iArr4 = this.f2096m;
                    if (i3 > 0) {
                        i6 = Math.max(i6, iArr4[1]);
                    } else {
                        i6 = Math.min(i6, iArr4[1]);
                    }
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            a(1);
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        static {
            Covode.recordClassIndex(636);
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.a(0);
            return true;
        }

        f() {
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    public int getNestedScrollAxes() {
        return this.w.a();
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(630);
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
        SparseArray<Parcelable> f2098a;

        static {
            Covode.recordClassIndex(629);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2098a = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                this.f2098a.append(iArr[i2], readParcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            int i3;
            super.writeToParcel(parcel, i2);
            SparseArray<Parcelable> sparseArray = this.f2098a;
            if (sparseArray != null) {
                i3 = sparseArray.size();
            } else {
                i3 = 0;
            }
            parcel.writeInt(i3);
            int[] iArr = new int[i3];
            Parcelable[] parcelableArr = new Parcelable[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = this.f2098a.keyAt(i4);
                parcelableArr[i4] = this.f2098a.valueAt(i4);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }
    }

    private static Rect a() {
        Rect acquire = f2088h.acquire();
        if (acquire == null) {
            return new Rect();
        }
        return acquire;
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        b();
        return Collections.unmodifiableList(this.f2092i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful() && (false || drawable.setState(drawableState))) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    private void c() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (v.o(this)) {
                if (this.v == null) {
                    this.v = new r() {
                        /* class androidx.coordinatorlayout.widget.CoordinatorLayout.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(628);
                        }

                        @Override // androidx.core.h.r
                        public final ad a(View view, ad adVar) {
                            boolean z;
                            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                            if (!androidx.core.g.d.a(coordinatorLayout.f2089e, adVar)) {
                                coordinatorLayout.f2089e = adVar;
                                boolean z2 = true;
                                if (adVar == null || adVar.f2507b.g().f2407c <= 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                coordinatorLayout.f2090f = z;
                                if (coordinatorLayout.f2090f || coordinatorLayout.getBackground() != null) {
                                    z2 = false;
                                }
                                coordinatorLayout.setWillNotDraw(z2);
                                if (!adVar.f2507b.b()) {
                                    int childCount = coordinatorLayout.getChildCount();
                                    for (int i2 = 0; i2 < childCount; i2++) {
                                        View childAt = coordinatorLayout.getChildAt(i2);
                                        if (v.o(childAt) && ((e) childAt.getLayoutParams()).f2100a != null && adVar.f2507b.b()) {
                                            break;
                                        }
                                    }
                                }
                                coordinatorLayout.requestLayout();
                            }
                            return adVar;
                        }
                    };
                }
                v.a(this, this.v);
                setSystemUiVisibility(1280);
                return;
            }
            v.a(this, (r) null);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.t) {
            if (this.s == null) {
                this.s = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.f2089e == null && v.o(this)) {
            v.n(this);
        }
        this.o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        View view = this.r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.o = false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable a2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f2100a;
            if (!(id == -1 || bVar == null || (a2 = bVar.a(this, childAt)) == null)) {
                sparseArray.append(id, a2);
            }
        }
        savedState.f2098a = sparseArray;
        return savedState;
    }

    static {
        String str;
        Covode.recordClassIndex(627);
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        f2084a = str;
        if (Build.VERSION.SDK_INT >= 21) {
            f2087d = new g();
        } else {
            f2087d = null;
        }
    }

    private void b() {
        View childAt;
        int e2;
        int a2;
        this.f2092i.clear();
        a<View> aVar = this.f2093j;
        int size = aVar.f2115b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> c2 = aVar.f2115b.c(i2);
            if (c2 != null) {
                c2.clear();
                aVar.f2114a.release(c2);
            }
        }
        aVar.f2115b.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            e d2 = d(childAt2);
            if (d2.f2105f == -1) {
                d2.f2111l = null;
                d2.f2110k = null;
            } else {
                if (d2.f2110k != null && d2.f2110k.getId() == d2.f2105f) {
                    View view = d2.f2110k;
                    for (ViewParent parent = d2.f2110k.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt2) {
                            d2.f2111l = null;
                            d2.f2110k = null;
                        } else {
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                        }
                    }
                    d2.f2111l = view;
                }
                d2.f2110k = findViewById(d2.f2105f);
                if (d2.f2110k != null) {
                    if (d2.f2110k != this) {
                        View view2 = d2.f2110k;
                        ViewParent parent2 = d2.f2110k.getParent();
                        while (true) {
                            if (parent2 == this || parent2 == null) {
                                d2.f2111l = view2;
                            } else if (parent2 != childAt2) {
                                if (parent2 instanceof View) {
                                    view2 = (View) parent2;
                                }
                                parent2 = parent2.getParent();
                            } else if (isInEditMode()) {
                                d2.f2111l = null;
                                d2.f2110k = null;
                            } else {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                        }
                    } else if (isInEditMode()) {
                        d2.f2111l = null;
                        d2.f2110k = null;
                    } else {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                } else if (isInEditMode()) {
                    d2.f2111l = null;
                    d2.f2110k = null;
                } else {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(d2.f2105f) + " to anchor view " + childAt2);
                }
            }
            this.f2093j.a(childAt2);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3 && ((childAt = getChildAt(i4)) == d2.f2111l || (((a2 = androidx.core.h.e.a(((e) childAt.getLayoutParams()).f2106g, (e2 = v.e(this)))) != 0 && (androidx.core.h.e.a(d2.f2107h, e2) & a2) == a2) || (d2.f2100a != null && d2.f2100a.a(this, childAt2, childAt))))) {
                    if (!this.f2093j.f2115b.containsKey(childAt)) {
                        this.f2093j.a(childAt);
                    }
                    a<View> aVar2 = this.f2093j;
                    if (!aVar2.f2115b.containsKey(childAt) || !aVar2.f2115b.containsKey(childAt2)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList<T> arrayList = aVar2.f2115b.get(childAt);
                    if (arrayList == null) {
                        arrayList = aVar2.f2114a.acquire();
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        aVar2.f2115b.put(childAt, arrayList);
                    }
                    arrayList.add(childAt2);
                }
            }
        }
        this.f2092i.addAll(this.f2093j.a());
        Collections.reverse(this.f2092i);
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2091g = onHierarchyChangeListener;
    }

    class d implements ViewGroup.OnHierarchyChangeListener {
        static {
            Covode.recordClassIndex(634);
        }

        d() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f2091g != null) {
                CoordinatorLayout.this.f2091g.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.a(2);
            if (CoordinatorLayout.this.f2091g != null) {
                CoordinatorLayout.this.f2091g.onChildViewRemoved(view, view2);
            }
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    @Override // androidx.core.h.n
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        c();
    }

    private int b(int i2) {
        int[] iArr = this.p;
        if (iArr != null && i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof e) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = androidx.core.content.b.a(getContext(), i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.u) {
            return true;
        }
        return false;
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public b f2100a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2101b;

        /* renamed from: c  reason: collision with root package name */
        public int f2102c;

        /* renamed from: d  reason: collision with root package name */
        public int f2103d;

        /* renamed from: e  reason: collision with root package name */
        public int f2104e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2105f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2106g;

        /* renamed from: h  reason: collision with root package name */
        public int f2107h;

        /* renamed from: i  reason: collision with root package name */
        int f2108i;

        /* renamed from: j  reason: collision with root package name */
        int f2109j;

        /* renamed from: k  reason: collision with root package name */
        View f2110k;

        /* renamed from: l  reason: collision with root package name */
        View f2111l;

        /* renamed from: m  reason: collision with root package name */
        boolean f2112m;
        public boolean n;
        public final Rect o = new Rect();
        Object p;
        private boolean q;
        private boolean r;

        static {
            Covode.recordClassIndex(635);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final void a(b bVar) {
            b bVar2 = this.f2100a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.a();
                }
                this.f2100a = bVar;
                this.p = null;
                this.f2101b = true;
                if (bVar != null) {
                    bVar.a(this);
                }
            }
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(int i2) {
            if (i2 == 0) {
                return this.q;
            }
            if (i2 != 1) {
                return false;
            }
            return this.r;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
        }

        public e(int i2, int i3) {
            super(i2, i3);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, boolean z) {
            if (i2 == 0) {
                this.q = z;
            } else if (i2 == 1) {
                this.r = z;
            }
        }

        e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, R.attr.zd, R.attr.ze, R.attr.zf, R.attr.a0x, R.attr.a1a, R.attr.a1b});
            this.f2102c = obtainStyledAttributes.getInteger(0, 0);
            this.f2105f = obtainStyledAttributes.getResourceId(1, -1);
            this.f2103d = obtainStyledAttributes.getInteger(2, 0);
            this.f2104e = obtainStyledAttributes.getInteger(6, -1);
            this.f2106g = obtainStyledAttributes.getInt(5, 0);
            this.f2107h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f2101b = hasValue;
            if (hasValue) {
                this.f2100a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            b bVar = this.f2100a;
            if (bVar != null) {
                bVar.a(this);
            }
        }
    }

    private static void a(Rect rect) {
        rect.setEmpty();
        f2088h.release(rect);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(true);
        }
        boolean a2 = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            a(true);
        }
        return a2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.n) {
            a(false);
            this.n = true;
        }
    }

    public void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.u;
        if (drawable != null && drawable.isVisible() != z) {
            this.u.setVisible(z, false);
        }
    }

    public final List<View> b(View view) {
        a<View> aVar = this.f2093j;
        int size = aVar.f2115b.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> c2 = aVar.f2115b.c(i2);
            if (c2 != null && c2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.f2115b.b(i2));
            }
        }
        this.f2095l.clear();
        if (arrayList != null) {
            this.f2095l.addAll(arrayList);
        }
        return this.f2095l;
    }

    public void onDraw(Canvas canvas) {
        ad adVar;
        int i2;
        super.onDraw(canvas);
        if (this.f2090f && this.u != null && (adVar = this.f2089e) != null && (i2 = adVar.f2507b.g().f2407c) > 0) {
            this.u.setBounds(0, 0, getWidth(), i2);
            this.u.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2667d);
        SparseArray<Parcelable> sparseArray = savedState.f2098a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            b bVar = d(childAt).f2100a;
            if (!(id == -1 || bVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                bVar.a(this, childAt, parcelable2);
            }
        }
    }

    private static e d(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f2101b) {
            if (view instanceof a) {
                eVar.a(((a) view).getBehavior());
                eVar.f2101b = true;
            } else {
                Class<?> cls = view.getClass();
                while (true) {
                    if (cls == null) {
                        break;
                    }
                    c cVar = (c) cls.getAnnotation(c.class);
                    if (cVar == null) {
                        cls = cls.getSuperclass();
                    } else {
                        try {
                            eVar.a((b) cVar.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            break;
                        } catch (Exception unused) {
                            cVar.a().getName();
                        }
                    }
                }
                eVar.f2101b = true;
            }
        }
        return eVar;
    }

    public final List<View> c(View view) {
        List b2 = this.f2093j.b(view);
        this.f2095l.clear();
        if (b2 != null) {
            this.f2095l.addAll(b2);
        }
        return this.f2095l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r7 != false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r16) {
        /*
            r15 = this;
            r5 = r15
            r8 = r16
            int r4 = r8.getActionMasked()
            android.view.View r0 = r5.q
            r6 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0052
            boolean r7 = r5.a(r8, r6)
            if (r7 == 0) goto L_0x0050
        L_0x0013:
            android.view.View r0 = r5.q
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r1 = r0.f2100a
            if (r1 == 0) goto L_0x0050
            android.view.View r0 = r5.q
            boolean r2 = r1.b(r5, r0, r8)
        L_0x0025:
            android.view.View r1 = r5.q
            r0 = 0
            if (r1 != 0) goto L_0x0038
            boolean r0 = super.onTouchEvent(r8)
            r2 = r2 | r0
        L_0x002f:
            if (r4 == r6) goto L_0x0034
            r0 = 3
            if (r4 != r0) goto L_0x0037
        L_0x0034:
            r5.a(r3)
        L_0x0037:
            return r2
        L_0x0038:
            if (r7 == 0) goto L_0x002f
            long r7 = android.os.SystemClock.uptimeMillis()
            r11 = 3
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r7
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r7, r9, r11, r12, r13, r14)
            super.onTouchEvent(r0)
            if (r0 == 0) goto L_0x002f
            r0.recycle()
            goto L_0x002f
        L_0x0050:
            r2 = 0
            goto L_0x0025
        L_0x0052:
            r7 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.u = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.u.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.b(this.u, v.e(this));
                Drawable drawable4 = this.u;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.u.setCallback(this);
            }
            v.c(this);
        }
    }

    private void a(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            b bVar = ((e) childAt.getLayoutParams()).f2100a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    bVar.a(this, childAt, obtain);
                } else {
                    bVar.b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((e) getChildAt(i3).getLayoutParams()).f2112m = false;
        }
        this.q = null;
        this.n = false;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.q0);
    }

    private static void c(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.f2108i != i2) {
            v.e(view, i2 - eVar.f2108i);
            eVar.f2108i = i2;
        }
    }

    private static void d(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.f2109j != i2) {
            v.d(view, i2 - eVar.f2109j);
            eVar.f2109j = i2;
        }
    }

    @Override // androidx.core.h.o
    public final void b(View view, int i2) {
        this.w.a(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i2)) {
                b bVar = eVar.f2100a;
                if (bVar != null) {
                    bVar.a(this, childAt, view, i2);
                }
                eVar.a(i2, false);
                eVar.n = false;
            }
        }
        this.r = null;
    }

    private void a(View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = b.f2118a.get();
        if (matrix == null) {
            matrix = new Matrix();
            b.f2118a.set(matrix);
        } else {
            matrix.reset();
        }
        b.a(this, view, matrix);
        RectF rectF = b.f2119b.get();
        if (rectF == null) {
            rectF = new RectF();
            b.f2119b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r20 != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0165, code lost:
        if (r20 != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0167, code lost:
        r28 = java.lang.Math.max(0, (r19 - r21) - r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r32, int r33) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j2);
    }

    @Override // androidx.core.h.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    @Override // androidx.core.h.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        b bVar = ((e) view.getLayoutParams()).f2100a;
        if (bVar == null || !bVar.a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // androidx.core.h.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        b bVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f2100a) != null) {
                    z |= bVar.a(this, childAt, view, f2, f3);
                }
            }
        }
        return z;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes;
        this.f2092i = new ArrayList();
        this.f2093j = new a<>();
        this.f2094k = new ArrayList();
        this.f2095l = new ArrayList();
        this.f2096m = new int[2];
        this.w = new q();
        if (i2 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.yk, R.attr.afk}, 0, R.style.sk);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.yk, R.attr.afk}, i2, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.p = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.p.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.p;
                iArr[i3] = (int) (((float) iArr[i3]) * f2);
            }
        }
        this.u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        c();
        super.setOnHierarchyChangeListener(new d());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$b>>> */
    /* JADX WARN: Multi-variable type inference failed */
    static b a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2084a;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<b>>> threadLocal = f2086c;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f2085b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), e2);
        }
    }

    @Override // androidx.core.h.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    @Override // androidx.core.h.o
    public final void b(View view, View view2, int i2, int i3) {
        this.w.a(i2, i3);
        this.r = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((e) getChildAt(i4).getLayoutParams()).a(i3);
        }
    }

    @Override // androidx.core.h.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ((e) childAt.getLayoutParams()).a(0);
            }
        }
        return false;
    }

    private void a(e eVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - eVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public final void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // androidx.core.h.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(view, i2, i3, i4, i5, 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        b bVar;
        int e2 = v.e(this);
        int size = this.f2092i.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f2092i.get(i6);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f2100a) == null || !bVar.a(this, view, e2))) {
                a(view, e2);
            }
        }
    }

    private static void a(int i2, Rect rect, Rect rect2, e eVar, int i3, int i4) {
        int width;
        int height;
        int a2 = androidx.core.h.e.a(e(eVar.f2102c), i2);
        int a3 = androidx.core.h.e.a(c(eVar.f2103d), i2);
        int i5 = a2 & 7;
        int i6 = a2 & 112;
        int i7 = a3 & 7;
        int i8 = a3 & 112;
        if (i7 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i7 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i8 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i8 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i5 == 1) {
            width -= i3 / 2;
        } else if (i5 != 5) {
            width -= i3;
        }
        if (i6 == 16) {
            height -= i4 / 2;
        } else if (i6 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }
}
