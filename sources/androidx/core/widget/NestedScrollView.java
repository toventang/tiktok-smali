package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.h.a.d;
import androidx.core.h.l;
import androidx.core.h.m;
import androidx.core.h.p;
import androidx.core.h.q;
import androidx.core.h.t;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements l, p, t {
    private static final a w = new a();
    private static final int[] x = {16843130};
    private float A;
    private b B;

    /* renamed from: a  reason: collision with root package name */
    public OverScroller f2594a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2595b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2596c;

    /* renamed from: d  reason: collision with root package name */
    private long f2597d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f2598e;

    /* renamed from: f  reason: collision with root package name */
    private EdgeEffect f2599f;

    /* renamed from: g  reason: collision with root package name */
    private EdgeEffect f2600g;

    /* renamed from: h  reason: collision with root package name */
    private int f2601h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2602i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2603j;

    /* renamed from: k  reason: collision with root package name */
    private View f2604k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2605l;

    /* renamed from: m  reason: collision with root package name */
    private VelocityTracker f2606m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final int[] r;
    private final int[] s;
    private int t;
    private int u;
    private SavedState v;
    private final q y;
    private final m z;

    public interface b {
        static {
            Covode.recordClassIndex(896);
        }

        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    private static int b(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    @Override // androidx.core.h.o
    public final boolean a(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    static class a extends androidx.core.h.a {
        static {
            Covode.recordClassIndex(895);
        }

        a() {
        }

        @Override // androidx.core.h.a
        public final void a(View view, d dVar) {
            int scrollRange;
            super.a(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                dVar.d(true);
                if (nestedScrollView.getScrollY() > 0) {
                    dVar.a(d.a.n);
                    dVar.a(d.a.y);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    dVar.a(d.a.f2499m);
                    dVar.a(d.a.A);
                }
            }
        }

        @Override // androidx.core.h.a
        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            int scrollX = nestedScrollView.getScrollX();
            int i2 = Build.VERSION.SDK_INT;
            accessibilityEvent.setMaxScrollX(scrollX);
            int scrollRange = nestedScrollView.getScrollRange();
            int i3 = Build.VERSION.SDK_INT;
            accessibilityEvent.setMaxScrollY(scrollRange);
        }

        @Override // androidx.core.h.a
        public final boolean a(View view, int i2, Bundle bundle) {
            if (super.a(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.a(0, max, true);
                    return true;
                } else if (i2 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.a(0, min, true);
            return true;
        }
    }

    @Override // androidx.core.h.k
    public final void a(int i2) {
        this.z.b(i2);
    }

    private boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.z.a(i2, i3, iArr, iArr2, i4);
    }

    @Override // androidx.core.h.o
    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        a(i5, i6, (int[]) null);
    }

    @Override // androidx.core.h.o
    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        a(i2, i3, iArr, (int[]) null, i4);
    }

    public final boolean a(KeyEvent keyEvent) {
        this.f2598e.setEmpty();
        int i2 = 130;
        if (!a()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i2 = 33;
                    }
                    d(i2);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return f(130);
                } else {
                    return e(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return f(33);
            } else {
                return e(33);
            }
        }
    }

    private boolean a(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i6 = i3 + 0;
        int i7 = i4 + i2;
        int i8 = i5 + 0;
        if (i6 <= 0 && i6 >= 0) {
            z2 = false;
        } else {
            i6 = 0;
            z2 = true;
        }
        if (i7 > i8) {
            i7 = i8;
        } else if (i7 < 0) {
            i7 = 0;
        } else {
            z3 = false;
            onOverScrolled(i6, i7, z2, z3);
            return !z2 || z3;
        }
        z3 = true;
        if (!c(1)) {
            this.f2594a.springBack(i6, i7, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i6, i7, z2, z3);
        if (!z2) {
        }
    }

    private boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private boolean a(View view, int i2, int i3) {
        view.getDrawingRect(this.f2598e);
        offsetDescendantRectToMyCoords(view, this.f2598e);
        return this.f2598e.bottom + i2 >= getScrollY() && this.f2598e.top - i2 <= getScrollY() + i3;
    }

    public final void a(int i2, int i3, boolean z2) {
        b(i2 - getScrollX(), i3 - getScrollY(), z2);
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !a((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int getNestedScrollAxes() {
        return this.y.a();
    }

    public boolean hasNestedScrollingParent() {
        return c(0);
    }

    @Override // androidx.core.h.j
    public boolean isNestedScrollingEnabled() {
        return this.z.f2548a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2603j = false;
    }

    public void requestLayout() {
        this.f2602i = true;
        super.requestLayout();
    }

    @Override // androidx.core.h.j
    public void stopNestedScroll() {
        a(0);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.core.widget.NestedScrollView.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(894);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public int f2607a;

        static {
            Covode.recordClassIndex(893);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2607a + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2607a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f2607a);
        }
    }

    private void c() {
        VelocityTracker velocityTracker = this.f2606m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2606m = null;
        }
    }

    private void d() {
        this.f2594a.abortAnimation();
        a(1);
    }

    @Override // androidx.core.h.t
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2607a = getScrollY();
        return savedState;
    }

    static {
        Covode.recordClassIndex(892);
    }

    private void b() {
        if (this.f2606m == null) {
            this.f2606m = VelocityTracker.obtain();
        }
    }

    private void e() {
        this.f2605l = false;
        c();
        a(0);
        EdgeEffect edgeEffect = this.f2599f;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2600g.onRelease();
        }
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    private void f() {
        if (getOverScrollMode() == 2) {
            this.f2599f = null;
            this.f2600g = null;
        } else if (this.f2599f == null) {
            Context context = getContext();
            this.f2599f = new EdgeEffect(context);
            this.f2600g = new EdgeEffect(context);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.A;
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public void computeScroll() {
        if (!this.f2594a.isFinished()) {
            this.f2594a.computeScrollOffset();
            int currY = this.f2594a.getCurrY();
            int i2 = currY - this.u;
            this.u = currY;
            int[] iArr = this.s;
            iArr[1] = 0;
            a(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.s[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                a(i3, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.s;
                iArr2[1] = 0;
                a(scrollY2, i4, this.r, 1, iArr2);
                int i5 = i4 - this.s[1];
                if (i5 != 0) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        f();
                        if (i5 < 0) {
                            if (this.f2599f.isFinished()) {
                                this.f2599f.onAbsorb((int) this.f2594a.getCurrVelocity());
                            }
                        } else if (this.f2600g.isFinished()) {
                            this.f2600g.onAbsorb((int) this.f2594a.getCurrVelocity());
                        }
                    }
                    d();
                }
            }
            if (!this.f2594a.isFinished()) {
                v.c(this);
            } else {
                a(1);
            }
        }
    }

    private boolean a() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f2596c = z2;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private boolean c(int i2) {
        return this.z.a(i2);
    }

    @Override // androidx.core.h.n
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.z.a(z2);
    }

    public boolean startNestedScroll(int i2) {
        return a(i2, 0);
    }

    private void g(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.f2596c) {
            b(0, i2, false);
        } else {
            scrollBy(0, i2);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || a(keyEvent)) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            c();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f2595b) {
            this.f2595b = z2;
            requestLayout();
        }
    }

    private void a(boolean z2) {
        if (z2) {
            a(2, 1);
        } else {
            a(1);
        }
        this.u = getScrollY();
        v.c(this);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.v = savedState;
        requestLayout();
    }

    private void b(View view) {
        view.getDrawingRect(this.f2598e);
        offsetDescendantRectToMyCoords(view, this.f2598e);
        int a2 = a(this.f2598e);
        if (a2 != 0) {
            scrollBy(0, a2);
        }
    }

    private int a(Rect rect) {
        int i2;
        int i3;
        int i4;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i2 = i5 - verticalFadingEdgeLength;
        } else {
            i2 = i5;
        }
        if (rect.bottom > i2 && rect.top > scrollY) {
            if (rect.height() > height) {
                i4 = rect.top - scrollY;
            } else {
                i4 = rect.bottom - i2;
            }
            return Math.min(i4 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        } else if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        } else {
            if (rect.height() > height) {
                i3 = 0 - (i2 - rect.bottom);
            } else {
                i3 = 0 - (scrollY - rect.top);
            }
            return Math.max(i3, -getScrollY());
        }
    }

    private boolean d(int i2) {
        boolean z2;
        if (i2 == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        if (z2) {
            this.f2598e.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.f2598e.top + height > bottom) {
                    this.f2598e.top = bottom - height;
                }
            }
        } else {
            this.f2598e.top = getScrollY() - height;
            if (this.f2598e.top < 0) {
                this.f2598e.top = 0;
            }
        }
        Rect rect = this.f2598e;
        rect.bottom = rect.top + height;
        return a(i2, this.f2598e.top, this.f2598e.bottom);
    }

    private boolean e(int i2) {
        boolean z2;
        int childCount;
        if (i2 == 130) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = getHeight();
        this.f2598e.top = 0;
        this.f2598e.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2598e.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.f2598e;
            rect.top = rect.bottom - height;
        }
        return a(i2, this.f2598e.top, this.f2598e.bottom);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2605l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    scrollRange = 0;
                } else if (i2 <= scrollRange) {
                    scrollRange = i2;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean f(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2598e);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2598e);
            g(a(this.f2598e));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus == null || !findFocus.isFocused() || !a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public void b(int i2) {
        if (getChildCount() > 0) {
            this.f2594a.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            a(true);
        }
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f2599f != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.f2599f.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i2 = getPaddingLeft() + 0;
                } else {
                    i2 = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i2, (float) min);
                this.f2599f.setSize(width, height);
                if (this.f2599f.draw(canvas)) {
                    v.c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2600g.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i3 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f2600g.setSize(width2, height2);
                if (this.f2600g.draw(canvas)) {
                    v.c(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        if (action == 2 && this.f2605l) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.q;
                    if (!(i3 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i3)) == -1)) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y2 - this.f2601h) > this.n && (2 & getNestedScrollAxes()) == 0) {
                            this.f2605l = true;
                            this.f2601h = y2;
                            b();
                            this.f2606m.addMovement(motionEvent);
                            this.t = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        a(motionEvent);
                    }
                }
            }
            this.f2605l = false;
            this.q = -1;
            c();
            if (this.f2594a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                v.c(this);
            }
            a(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f2601h = y3;
                    this.q = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.f2606m;
                    if (velocityTracker == null) {
                        this.f2606m = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.f2606m.addMovement(motionEvent);
                    this.f2594a.computeScrollOffset();
                    this.f2605l = !this.f2594a.isFinished();
                    a(2, 0);
                }
            }
            this.f2605l = false;
            c();
        }
        return this.f2605l;
    }

    private void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.q) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f2601h = (int) motionEvent.getY(i2);
            this.q = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f2606m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z2;
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.t = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.t);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2606m;
                velocityTracker.computeCurrentVelocity(1000, (float) this.p);
                int yVelocity = (int) velocityTracker.getYVelocity(this.q);
                if (Math.abs(yVelocity) >= this.o) {
                    int i2 = -yVelocity;
                    float f2 = (float) i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        b(i2);
                    }
                } else if (this.f2594a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    v.c(this);
                }
                this.q = -1;
                e();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.q);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.f2601h - y2;
                    if (!this.f2605l && Math.abs(i3) > this.n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2605l = true;
                        i3 = i3 > 0 ? i3 - this.n : i3 + this.n;
                    }
                    if (this.f2605l) {
                        if (a(0, i3, this.s, this.r, 0)) {
                            i3 -= this.s[1];
                            this.t += this.r[1];
                        }
                        this.f2601h = y2 - this.r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (a(i3, 0, getScrollY(), scrollRange) && !c(0)) {
                            this.f2606m.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.s;
                        iArr[1] = 0;
                        a(scrollY2, i3 - scrollY2, this.r, 0, iArr);
                        int i4 = this.f2601h;
                        int[] iArr2 = this.r;
                        this.f2601h = i4 - iArr2[1];
                        this.t += iArr2[1];
                        if (z2) {
                            int i5 = i3 - this.s[1];
                            f();
                            int i6 = scrollY + i5;
                            if (i6 < 0) {
                                d.a(this.f2599f, ((float) i5) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f2600g.isFinished()) {
                                    this.f2600g.onRelease();
                                }
                            } else if (i6 > scrollRange) {
                                d.a(this.f2600g, ((float) i5) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f2599f.isFinished()) {
                                    this.f2599f.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f2599f;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f2600g.isFinished())) {
                                v.c(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2605l && getChildCount() > 0 && this.f2594a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    v.c(this);
                }
                this.q = -1;
                e();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2601h = (int) motionEvent.getY(actionIndex);
                this.q = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                a(motionEvent);
                this.f2601h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.q));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z3 = !this.f2594a.isFinished();
            this.f2605l = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2594a.isFinished()) {
                d();
            }
            this.f2601h = (int) motionEvent.getY();
            this.q = motionEvent.getPointerId(0);
            a(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f2606m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    private boolean a(int i2, int i3) {
        return this.z.a(i2, i3);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.z.a(f2, f3);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2602i) {
            b(view2);
        } else {
            this.f2604k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View findNextFocusFromRect;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (findNextFocusFromRect != null && !a(findNextFocusFromRect)) {
            return findNextFocusFromRect.requestFocus(i2, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2595b && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b2 = b(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b3 = b(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b2 != getScrollX() || b3 != getScrollY()) {
                super.scrollTo(b2, b3);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // androidx.core.h.o
    public final void b(View view, int i2) {
        this.y.a(i2);
        a(i2);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.z.a(f2, f3, z2);
    }

    @Override // androidx.core.h.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // androidx.core.h.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    @Override // androidx.core.h.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private void a(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.z.a(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a2 = a(rect);
        if (a2 == 0) {
            return false;
        }
        if (z2) {
            scrollBy(0, a2);
            return true;
        }
        b(0, a2, false);
        return true;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        this.f2598e = new Rect();
        this.f2602i = true;
        this.f2603j = false;
        this.f2604k = null;
        this.f2605l = false;
        this.f2596c = true;
        this.q = -1;
        this.r = new int[2];
        this.s = new int[2];
        this.f2594a = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.n = viewConfiguration.getScaledTouchSlop();
        this.o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x, 0, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.y = new q();
        this.z = new m(this);
        setNestedScrollingEnabled(true);
        v.a(this, w);
    }

    private void b(int i2, int i3, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2597d > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2594a;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                a(z2);
            } else {
                if (!this.f2594a.isFinished()) {
                    d();
                }
                scrollBy(i2, i3);
            }
            this.f2597d = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    private View a(boolean z2, int i2, int i3) {
        boolean z3;
        boolean z4;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                if (i2 >= top || bottom >= i3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (view == null) {
                    view = view2;
                    z5 = z3;
                } else {
                    if (!z2 ? bottom <= view.getBottom() : top >= view.getTop()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z5) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z5 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private boolean a(int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z3 = false;
        if (i2 == 33) {
            z2 = true;
        } else {
            z2 = false;
        }
        View a2 = a(z2, i3, i4);
        if (a2 == null) {
            a2 = this;
        }
        if (i3 < scrollY || i4 > i6) {
            if (z2) {
                i5 = i3 - scrollY;
            } else {
                i5 = i4 - i6;
            }
            g(i5);
            z3 = true;
        }
        if (a2 != findFocus()) {
            a2.requestFocus(i2);
        }
        return z3;
    }

    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return a(i2, i3, iArr, iArr2, 0);
    }

    @Override // androidx.core.h.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        b((int) f3);
        return true;
    }

    @Override // androidx.core.h.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.B;
        if (bVar != null) {
            bVar.a(this, i2, i3, i4, i5);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.f2598e);
            offsetDescendantRectToMyCoords(findFocus, this.f2598e);
            g(a(this.f2598e));
        }
    }

    @Override // androidx.core.h.o
    public final void b(View view, View view2, int i2, int i3) {
        this.y.a(i2, i3);
        a(2, i3);
    }

    @Override // androidx.core.h.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(i5, 0, (int[]) null);
    }

    private void a(int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        this.z.a(0, i2, 0, i3, iArr, i4, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.z.a(i2, i3, i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f2602i = false;
        View view = this.f2604k;
        if (view != null && a(view, this)) {
            b(this.f2604k);
        }
        this.f2604k = null;
        if (!this.f2603j) {
            if (this.v != null) {
                scrollTo(getScrollX(), this.v.f2607a);
                this.v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b2 = b(scrollY, paddingTop, i6);
            if (b2 != scrollY) {
                scrollTo(getScrollX(), b2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2603j = true;
    }

    @Override // androidx.core.h.p
    public final void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(i5, i6, iArr);
    }
}
