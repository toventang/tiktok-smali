package com.ss.android.ugc.aweme.dsp.widget.vvpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import androidx.core.h.v;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.dsp.widget.vvpager.b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MDVerticalViewPager extends ViewGroup {
    private static final g ag = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f84061b = {16842931};

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<b> f84062h = new Comparator<b>() {
        /* class com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(52414);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
            return bVar.f84079b - bVar2.f84079b;
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private static final Interpolator f84063i = new Interpolator() {
        /* class com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(52415);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private boolean A;
    private boolean B;
    private int C = 2;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private float K;
    private int L = -1;
    private VelocityTracker M;
    private int N;
    private int O;
    private int P;
    private androidx.core.widget.d Q;
    private androidx.core.widget.d R;
    private boolean S = true;
    private boolean T = false;
    private boolean U;
    private int V;
    private ViewPager.e W;

    /* renamed from: a  reason: collision with root package name */
    private int f84064a;
    private ViewPager.e aa;
    private e ab;
    private ViewPager.f ac;
    private Method ad;
    private int ae;
    private ArrayList<View> af;
    private final Runnable ah = new Runnable() {
        /* class com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.AnonymousClass3 */

        static {
            Covode.recordClassIndex(52416);
        }

        public final void run() {
            MDVerticalViewPager.this.setScrollState(0);
            MDVerticalViewPager.this.b();
        }
    };
    private int ai = 0;

    /* renamed from: c  reason: collision with root package name */
    public PagerAdapter f84065c;

    /* renamed from: d  reason: collision with root package name */
    public int f84066d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f84067e;

    /* renamed from: f  reason: collision with root package name */
    public int f84068f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f84069g;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList<b> f84070j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private final b f84071k = new b();

    /* renamed from: l  reason: collision with root package name */
    private final Rect f84072l = new Rect();

    /* renamed from: m  reason: collision with root package name */
    private int f84073m = -1;
    private Parcelable n = null;
    private ClassLoader o = null;
    private b p;
    private f q;
    private int r;
    private Drawable s;
    private int t;
    private int u;
    private float v = -3.4028235E38f;
    private float w = Float.MAX_VALUE;
    private int x;
    private int y;
    private boolean z;

    interface a {
        static {
            Covode.recordClassIndex(52419);
        }
    }

    interface e {
        static {
            Covode.recordClassIndex(52423);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Object f84078a;

        /* renamed from: b  reason: collision with root package name */
        int f84079b;

        /* renamed from: c  reason: collision with root package name */
        boolean f84080c;

        /* renamed from: d  reason: collision with root package name */
        float f84081d;

        /* renamed from: e  reason: collision with root package name */
        float f84082e;

        static {
            Covode.recordClassIndex(52420);
        }

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class g implements Comparator<View> {
        static {
            Covode.recordClassIndex(52425);
        }

        g() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            c cVar = (c) view.getLayoutParams();
            c cVar2 = (c) view2.getLayoutParams();
            if (cVar.f84083a == cVar2.f84083a) {
                return cVar.f84087e - cVar2.f84087e;
            }
            if (cVar.f84083a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f84065c;
    }

    public int getCurrentItem() {
        return this.f84066d;
    }

    public int getOffscreenPageLimit() {
        return this.C;
    }

    public int getPageMargin() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z2, boolean z3, int i3) {
        PagerAdapter pagerAdapter = this.f84065c;
        boolean z4 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f84066d != i2 || this.f84070j.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f84065c.getCount()) {
                i2 = this.f84065c.getCount() - 1;
            }
            int i4 = this.C;
            int i5 = this.f84066d;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f84070j.size(); i6++) {
                    this.f84070j.get(i6).f84080c = true;
                }
            }
            if (this.f84066d != i2) {
                z4 = true;
            }
            if (this.S) {
                this.f84066d = i2;
                if (z4) {
                    ViewPager.e eVar = this.W;
                    if (eVar != null) {
                        eVar.onPageSelected(i2);
                    }
                    ViewPager.e eVar2 = this.aa;
                    if (eVar2 != null) {
                        eVar2.onPageSelected(i2);
                    }
                }
                requestLayout();
                return;
            }
            b(i2);
            a(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int count = this.f84065c.getCount();
        this.f84064a = count;
        boolean z2 = this.f84070j.size() < (this.C * 2) + 1 && this.f84070j.size() < count;
        int i2 = this.f84066d;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.f84070j.size()) {
            b bVar = this.f84070j.get(i3);
            int itemPosition = this.f84065c.getItemPosition(bVar.f84078a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f84070j.remove(i3);
                    i3--;
                    if (!z3) {
                        this.f84065c.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f84065c.destroyItem((ViewGroup) this, bVar.f84079b, bVar.f84078a);
                    if (this.f84066d == bVar.f84079b) {
                        i2 = Math.max(0, Math.min(this.f84066d, count - 1));
                    }
                } else if (bVar.f84079b != itemPosition) {
                    if (bVar.f84079b == this.f84066d) {
                        i2 = itemPosition;
                    }
                    bVar.f84079b = itemPosition;
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.f84065c.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f84070j, f84062h);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                if (!cVar.f84083a) {
                    cVar.f84085c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    private void a(b bVar, int i2, b bVar2) {
        b bVar3;
        b bVar4;
        int count = this.f84065c.getCount();
        int clientHeight = getClientHeight();
        float f2 = clientHeight > 0 ? ((float) this.r) / ((float) clientHeight) : 0.0f;
        if (bVar2 != null) {
            int i3 = bVar2.f84079b;
            if (i3 < bVar.f84079b) {
                float f3 = bVar2.f84082e + bVar2.f84081d + f2;
                int i4 = i3 + 1;
                int i5 = 0;
                while (i4 <= bVar.f84079b && i5 < this.f84070j.size()) {
                    b bVar5 = this.f84070j.get(i5);
                    while (true) {
                        bVar4 = bVar5;
                        if (i4 > bVar4.f84079b && i5 < this.f84070j.size() - 1) {
                            i5++;
                            bVar5 = this.f84070j.get(i5);
                        }
                    }
                    while (i4 < bVar4.f84079b) {
                        f3 += this.f84065c.getPageWidth(i4) + f2;
                        i4++;
                    }
                    bVar4.f84082e = f3;
                    f3 += bVar4.f84081d + f2;
                    i4++;
                }
            } else if (i3 > bVar.f84079b) {
                int size = this.f84070j.size() - 1;
                float f4 = bVar2.f84082e;
                int i6 = i3 - 1;
                while (i6 >= bVar.f84079b && size >= 0) {
                    b bVar6 = this.f84070j.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i6 < bVar3.f84079b && size > 0) {
                            size--;
                            bVar6 = this.f84070j.get(size);
                        }
                    }
                    while (i6 > bVar3.f84079b) {
                        f4 -= this.f84065c.getPageWidth(i6) + f2;
                        i6--;
                    }
                    f4 -= bVar3.f84081d + f2;
                    bVar3.f84082e = f4;
                    i6--;
                }
            }
        }
        int size2 = this.f84070j.size();
        float f5 = bVar.f84082e;
        int i7 = bVar.f84079b - 1;
        this.v = bVar.f84079b == 0 ? bVar.f84082e : -3.4028235E38f;
        int i8 = count - 1;
        this.w = bVar.f84079b == i8 ? (bVar.f84082e + bVar.f84081d) - 1.0f : Float.MAX_VALUE;
        int i9 = i2 - 1;
        while (i9 >= 0) {
            b bVar7 = this.f84070j.get(i9);
            while (i7 > bVar7.f84079b) {
                f5 -= this.f84065c.getPageWidth(i7) + f2;
                i7--;
            }
            f5 -= bVar7.f84081d + f2;
            bVar7.f84082e = f5;
            if (bVar7.f84079b == 0) {
                this.v = f5;
            }
            i9--;
            i7--;
        }
        float f6 = bVar.f84082e + bVar.f84081d + f2;
        int i10 = bVar.f84079b + 1;
        int i11 = i2 + 1;
        while (i11 < size2) {
            b bVar8 = this.f84070j.get(i11);
            while (i10 < bVar8.f84079b) {
                f6 += this.f84065c.getPageWidth(i10) + f2;
                i10++;
            }
            if (bVar8.f84079b == i8) {
                this.w = (bVar8.f84081d + f6) - 1.0f;
            }
            bVar8.f84082e = f6;
            f6 += bVar8.f84081d + f2;
            i11++;
            i10++;
        }
        this.T = false;
    }

    /* access modifiers changed from: protected */
    public void a(int i2, float f2, int i3) {
        int i4;
        int i5;
        if (this.V > 0) {
            int scrollY = getScrollY();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f84083a) {
                    int i7 = cVar.f84084b & 112;
                    if (i7 == 16) {
                        i4 = Math.max((height - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i5 = paddingTop;
                        paddingTop = i4;
                    } else if (i7 == 48) {
                        i5 = childAt.getHeight() + paddingTop;
                    } else if (i7 != 80) {
                        i5 = paddingTop;
                    } else {
                        i4 = (height - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i5 = paddingTop;
                        paddingTop = i4;
                    }
                    int top = (paddingTop + scrollY) - childAt.getTop();
                    if (top != 0) {
                        childAt.offsetTopAndBottom(top);
                    }
                    paddingTop = i5;
                }
            }
        }
        ViewPager.e eVar = this.W;
        if (eVar != null) {
            eVar.onPageScrolled(i2, f2, i3);
        }
        ViewPager.e eVar2 = this.aa;
        if (eVar2 != null) {
            eVar2.onPageScrolled(i2, f2, i3);
        }
        if (this.ac != null) {
            int scrollY2 = getScrollY();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((c) childAt2.getLayoutParams()).f84083a) {
                    this.ac.a(childAt2, ((float) (childAt2.getTop() - scrollY2)) / ((float) getClientHeight()));
                }
            }
        }
        this.U = true;
    }

    private void a(boolean z2) {
        boolean z3;
        if (this.ai == 2) {
            z3 = true;
            setScrollingCacheEnabled(false);
            this.p.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        } else {
            z3 = false;
        }
        this.B = false;
        for (int i2 = 0; i2 < this.f84070j.size(); i2++) {
            b bVar = this.f84070j.get(i2);
            if (bVar.f84080c) {
                bVar.f84080c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            v.a(this, this.ah);
        } else {
            this.ah.run();
        }
    }

    public final boolean a(int i2) {
        if (this.f84065c == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i2 < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.v))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollY >= ((int) (((float) clientHeight) * this.w))) {
            return false;
        } else {
            return true;
        }
    }

    private boolean a(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i4 + scrollY;
                if (i6 >= childAt.getTop() && i6 < childAt.getBottom() && (i5 = i3 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() && a(childAt, true, i2, i5 - childAt.getLeft(), i6 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z2 || !view.canScrollVertically(-i2)) {
            return false;
        }
        return true;
    }

    public static class c extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f84083a;

        /* renamed from: b  reason: collision with root package name */
        public int f84084b;

        /* renamed from: c  reason: collision with root package name */
        float f84085c;

        /* renamed from: d  reason: collision with root package name */
        boolean f84086d;

        /* renamed from: e  reason: collision with root package name */
        int f84087e;

        /* renamed from: f  reason: collision with root package name */
        int f84088f;

        static {
            Covode.recordClassIndex(52421);
        }

        public c() {
            super(-1, -1);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MDVerticalViewPager.f84061b);
            this.f84084b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends DataSetObserver {
        static {
            Covode.recordClassIndex(52424);
        }

        public final void onChanged() {
            MDVerticalViewPager.this.a();
        }

        public final void onInvalidated() {
            MDVerticalViewPager.this.a();
        }

        private f() {
        }

        /* synthetic */ f(MDVerticalViewPager mDVerticalViewPager, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        b(this.f84066d);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    private void e() {
        this.f84067e = false;
        this.D = false;
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.M = null;
        }
    }

    private boolean f() {
        int i2 = this.f84066d;
        if (i2 <= 0) {
            return false;
        }
        a(i2 - 1, true);
        return true;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.ah);
        super.onDetachedFromWindow();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = androidx.core.d.e.a(new androidx.core.d.f<SavedState>() {
            /* class com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(52418);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // androidx.core.d.f
            public final /* bridge */ /* synthetic */ SavedState[] a(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // androidx.core.d.f
            public final /* synthetic */ SavedState a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        });

        /* renamed from: a  reason: collision with root package name */
        int f84075a;

        /* renamed from: b  reason: collision with root package name */
        Parcelable f84076b;

        /* renamed from: c  reason: collision with root package name */
        ClassLoader f84077c;

        static {
            Covode.recordClassIndex(52417);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f84075a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f84075a);
            parcel.writeParcelable(this.f84076b, i2);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f84075a = parcel.readInt();
            this.f84076b = parcel.readParcelable(classLoader);
            this.f84077c = classLoader;
        }
    }

    class d extends androidx.core.h.a {
        static {
            Covode.recordClassIndex(52422);
        }

        private boolean a() {
            if (MDVerticalViewPager.this.f84065c == null || MDVerticalViewPager.this.f84065c.getCount() <= 1) {
                return false;
            }
            return true;
        }

        d() {
        }

        @Override // androidx.core.h.a
        public final void a(View view, androidx.core.h.a.d dVar) {
            super.a(view, dVar);
            dVar.a((CharSequence) ViewPager.class.getName());
            dVar.d(a());
            if (MDVerticalViewPager.this.a(1)) {
                dVar.a(4096);
            }
            if (MDVerticalViewPager.this.a(-1)) {
                dVar.a(8192);
            }
        }

        @Override // androidx.core.h.a
        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            androidx.core.h.a.f a2 = androidx.core.h.a.f.a();
            a2.a(a());
            if (accessibilityEvent.getEventType() == 4096 && MDVerticalViewPager.this.f84065c != null) {
                a2.a(MDVerticalViewPager.this.f84065c.getCount());
                a2.b(MDVerticalViewPager.this.f84066d);
                a2.c(MDVerticalViewPager.this.f84066d);
            }
        }

        @Override // androidx.core.h.a
        public final boolean a(View view, int i2, Bundle bundle) {
            if (super.a(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !MDVerticalViewPager.this.a(-1)) {
                    return false;
                }
                MDVerticalViewPager mDVerticalViewPager = MDVerticalViewPager.this;
                mDVerticalViewPager.setCurrentItem(mDVerticalViewPager.f84066d - 1);
                return true;
            } else if (!MDVerticalViewPager.this.a(1)) {
                return false;
            } else {
                MDVerticalViewPager mDVerticalViewPager2 = MDVerticalViewPager.this;
                mDVerticalViewPager2.setCurrentItem(mDVerticalViewPager2.f84066d + 1);
                return true;
            }
        }
    }

    private boolean g() {
        PagerAdapter pagerAdapter = this.f84065c;
        if (pagerAdapter == null || this.f84066d >= pagerAdapter.getCount() - 1) {
            return false;
        }
        a(this.f84066d + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f84075a = this.f84066d;
        PagerAdapter pagerAdapter = this.f84065c;
        if (pagerAdapter != null) {
            savedState.f84076b = pagerAdapter.saveState();
        }
        return savedState;
    }

    static {
        Covode.recordClassIndex(52413);
    }

    private void c() {
        if (this.ae != 0) {
            ArrayList<View> arrayList = this.af;
            if (arrayList == null) {
                this.af = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.af.add(getChildAt(i2));
            }
            Collections.sort(this.af, ag);
        }
    }

    private b d() {
        float f2;
        float f3;
        int i2;
        int clientHeight = getClientHeight();
        float f4 = 0.0f;
        if (clientHeight > 0) {
            f2 = ((float) getScrollY()) / ((float) clientHeight);
            f3 = ((float) this.r) / ((float) clientHeight);
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        b bVar = null;
        float f5 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.f84070j.size()) {
            b bVar2 = this.f84070j.get(i4);
            if (!z2 && bVar2.f84079b != (i2 = i3 + 1)) {
                bVar2 = this.f84071k;
                bVar2.f84082e = f4 + f5 + f3;
                bVar2.f84079b = i2;
                bVar2.f84081d = this.f84065c.getPageWidth(bVar2.f84079b);
                i4--;
            }
            f4 = bVar2.f84082e;
            float f6 = bVar2.f84081d + f4 + f3;
            if (!z2 && f2 < f4) {
                return bVar;
            }
            if (f2 < f6 || i4 == this.f84070j.size() - 1) {
                return bVar2;
            }
            i3 = bVar2.f84079b;
            f5 = bVar2.f84081d;
            i4++;
            bVar = bVar2;
            z2 = false;
        }
        return bVar;
    }

    public void computeScroll() {
        if (this.p.isFinished() || !this.p.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.p.getCurrX();
        int currY = this.p.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!d(currY)) {
                this.p.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        v.c(this);
    }

    /* access modifiers changed from: package-private */
    public void setOnAdapterChangeListener(e eVar) {
        this.ab = eVar;
    }

    public void setOnPageChangeListener(ViewPager.e eVar) {
        this.W = eVar;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.A != z2) {
            this.A = z2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof c) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public void setAutoScroll(Boolean bool) {
        b bVar = this.p;
        boolean booleanValue = bool.booleanValue();
        bVar.f84098c = booleanValue;
        bVar.f84096a.f84099a = booleanValue;
    }

    public void setCurrentItem(int i2) {
        this.B = false;
        a(i2, !this.S, false);
    }

    public void setPageMargin(int i2) {
        int i3 = this.r;
        this.r = i2;
        int height = getHeight();
        a(height, height, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i2));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.s) {
            return true;
        }
        return false;
    }

    private static float a(float f2) {
        double d2 = (double) (f2 - 0.5f);
        Double.isNaN(d2);
        return (float) Math.sin((double) ((float) (d2 * 0.4712389167638204d)));
    }

    private b b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    private b c(int i2) {
        for (int i3 = 0; i3 < this.f84070j.size(); i3++) {
            b bVar = this.f84070j.get(i3);
            if (bVar.f84079b == i2) {
                return bVar;
            }
        }
        return null;
    }

    public void removeView(View view) {
        MethodCollector.i(858);
        if (this.z) {
            removeViewInLayout(view);
            MethodCollector.o(858);
            return;
        }
        super.removeView(view);
        MethodCollector.o(858);
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z2;
        this.s = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z2 = false;
        } else {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    private b a(View view) {
        for (int i2 = 0; i2 < this.f84070j.size(); i2++) {
            b bVar = this.f84070j.get(i2);
            if (this.f84065c.isViewFromObject(view, bVar.f84078a)) {
                return bVar;
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        b a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f84079b == this.f84066d) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        b a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f84079b == this.f84066d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f84065c;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f84076b, savedState.f84077c);
            a(savedState.f84075a, false, true);
            return;
        }
        this.f84073m = savedState.f84075a;
        this.n = savedState.f84076b;
        this.o = savedState.f84077c;
    }

    /* access modifiers changed from: package-private */
    public void setChildrenDrawingOrderEnabledCompat(boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        if (this.ad == null) {
            try {
                this.ad = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
                com.ss.android.ugc.aweme.dsp.common.b.b.a("Can't find setChildrenDrawingOrderEnabled", e2);
            }
        }
        try {
            this.ad.invoke(this, Boolean.valueOf(z2));
        } catch (Exception e3) {
            com.ss.android.ugc.aweme.dsp.common.b.b.a("Error changing children drawing order", e3);
        }
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 2) {
            String.valueOf("Requested offscreen page limit " + i2 + " too small; defaulting to 2");
            i2 = 2;
        }
        if (i2 != this.C) {
            this.C = i2;
            b();
        }
    }

    public void setScrollState(int i2) {
        boolean z2;
        int i3;
        if (this.ai != i2) {
            this.ai = i2;
            if (this.ac != null) {
                if (i2 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    if (z2) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    getChildAt(i4).setLayerType(i3, null);
                }
            }
            ViewPager.e eVar = this.W;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i2);
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    z2 = e(17);
                } else if (keyCode == 22) {
                    z2 = e(66);
                } else if (keyCode == 61) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (keyEvent.hasNoModifiers()) {
                        z2 = e(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        z2 = e(1);
                    }
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private boolean b(float f2) {
        boolean z2;
        this.I = f2;
        float scrollY = ((float) getScrollY()) + (this.I - f2);
        float clientHeight = (float) getClientHeight();
        float f3 = this.v * clientHeight;
        float f4 = this.w * clientHeight;
        boolean z3 = false;
        b bVar = this.f84070j.get(0);
        ArrayList<b> arrayList = this.f84070j;
        boolean z4 = true;
        b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f84079b != 0) {
            f3 = bVar.f84082e * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (bVar2.f84079b != this.f84065c.getCount() - 1) {
            f4 = bVar2.f84082e * clientHeight;
            z4 = false;
        }
        if (scrollY < f3) {
            if (z2) {
                z3 = this.Q.a(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z4) {
                z3 = this.R.a(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i2 = (int) scrollY;
        this.H += scrollY - ((float) i2);
        scrollTo(getScrollX(), i2);
        d(i2);
        return z3;
    }

    private boolean d(int i2) {
        if (this.f84070j.size() == 0) {
            this.U = false;
            a(0, 0.0f, 0);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        b d2 = d();
        int clientHeight = getClientHeight();
        int i3 = this.r;
        int i4 = clientHeight + i3;
        float f2 = (float) i3;
        float f3 = (float) clientHeight;
        int i5 = d2.f84079b;
        float f4 = ((((float) i2) / f3) - d2.f84082e) / (d2.f84081d + (f2 / f3));
        this.U = false;
        a(i5, f4, (int) (((float) i4) * f4));
        if (this.U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r8 != 2) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e(int r8) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.e(int):boolean");
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f84065c) != null && pagerAdapter.getCount() > 1)) {
            if (!this.Q.f2636a.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.v * ((float) height));
                this.Q.a(width, height);
                z2 = false | this.Q.a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.R.f2636a.isFinished()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.w + 1.0f)) * ((float) height2));
                this.R.a(width2, height2);
                z2 |= this.R.a(canvas);
                canvas.restoreToCount(save2);
            }
            if (z2) {
                v.c(this);
                return;
            }
            return;
        }
        this.Q.f2636a.finish();
        this.R.f2636a.finish();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        int i2 = 923;
        MethodCollector.i(923);
        super.onDraw(canvas);
        if (this.r > 0 && this.s != null && this.f84070j.size() > 0 && this.f84065c != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f3 = (float) height;
            float f4 = ((float) this.r) / f3;
            int i3 = 0;
            b bVar = this.f84070j.get(0);
            float f5 = bVar.f84082e;
            int size = this.f84070j.size();
            int i4 = bVar.f84079b;
            int i5 = this.f84070j.get(size - 1).f84079b;
            while (true) {
                if (i4 >= i5) {
                    break;
                }
                while (i4 > bVar.f84079b && i3 < size) {
                    i3++;
                    bVar = this.f84070j.get(i3);
                }
                if (i4 == bVar.f84079b) {
                    f2 = (bVar.f84082e + bVar.f84081d) * f3;
                    f5 = bVar.f84082e + bVar.f84081d + f4;
                } else {
                    float pageWidth = this.f84065c.getPageWidth(i4);
                    f2 = (f5 + pageWidth) * f3;
                    f5 += pageWidth + f4;
                }
                int i6 = this.r;
                if (((float) i6) + f2 > ((float) scrollY)) {
                    this.s.setBounds(this.t, (int) f2, this.u, (int) (((float) i6) + f2 + 0.5f));
                    this.s.draw(canvas);
                }
                if (f2 > ((float) (scrollY + height))) {
                    i2 = 923;
                    break;
                } else {
                    i4++;
                    i2 = 923;
                }
            }
        }
        MethodCollector.o(i2);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f84065c;
        if (pagerAdapter2 != null) {
            pagerAdapter2.unregisterDataSetObserver(this.q);
            this.f84065c.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.f84070j.size(); i2++) {
                b bVar = this.f84070j.get(i2);
                this.f84065c.destroyItem((ViewGroup) this, bVar.f84079b, bVar.f84078a);
            }
            this.f84065c.finishUpdate((ViewGroup) this);
            this.f84070j.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((c) getChildAt(i3).getLayoutParams()).f84083a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f84066d = 0;
            scrollTo(0, 0);
        }
        this.f84065c = pagerAdapter;
        this.f84064a = 0;
        if (pagerAdapter != null) {
            if (this.q == null) {
                this.q = new f(this, (byte) 0);
            }
            this.f84065c.registerDataSetObserver(this.q);
            this.B = false;
            boolean z2 = this.S;
            this.S = true;
            this.f84064a = this.f84065c.getCount();
            if (this.f84073m >= 0) {
                this.f84065c.restoreState(this.n, this.o);
                a(this.f84073m, false, true);
                this.f84073m = -1;
                this.n = null;
                this.o = null;
            } else if (!z2) {
                b();
            } else {
                requestLayout();
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f84067e = false;
            this.D = false;
            this.L = -1;
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.M = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.f84067e) {
                return true;
            }
            if (this.D) {
                return false;
            }
        }
        if (action == 0) {
            this.J = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.K = y2;
            this.H = this.J;
            this.I = y2;
            this.L = motionEvent.getPointerId(0);
            this.D = false;
            this.p.computeScrollOffset();
            if (this.ai != 2 || Math.abs(this.p.getFinalY() - this.p.getCurrY()) <= this.P) {
                a(false);
                this.f84067e = false;
            } else {
                this.p.abortAnimation();
                this.B = false;
                b();
                this.f84067e = true;
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.L;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float y3 = motionEvent.getY(findPointerIndex);
                float f3 = y3 - this.I;
                float abs = Math.abs(f3);
                float x2 = motionEvent.getX(findPointerIndex);
                float abs2 = Math.abs(x2 - this.J);
                if (f3 != 0.0f) {
                    float f4 = this.I;
                    if ((f4 >= ((float) this.F) || f3 <= 0.0f) && ((f4 <= ((float) (getHeight() - this.F)) || f3 >= 0.0f) && a(this, false, (int) f3, (int) x2, (int) y3))) {
                        this.H = x2;
                        this.I = y3;
                        this.D = true;
                        return false;
                    }
                }
                int i3 = this.G;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.f84067e = true;
                    setScrollState(1);
                    if (f3 > 0.0f) {
                        f2 = this.K + ((float) this.G);
                    } else {
                        f2 = this.K - ((float) this.G);
                    }
                    this.I = f2;
                    this.H = x2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.D = true;
                }
                if (this.f84067e && b(y3)) {
                    v.c(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.M == null) {
            this.M = VelocityTracker.obtain();
        }
        this.M.addMovement(motionEvent);
        return this.f84067e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 423
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r7.f84079b == r17.f84066d) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r12 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r12 < 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        r13 = r17.f84070j.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r11 = getClientHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r11 > 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r2 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r1 = r17.f84066d - 1;
        r15 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (r1 < 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r15 < r2) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r1 >= r4) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r13 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r1 != r13.f84079b) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r13.f84080c != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        r17.f84070j.remove(r12);
        r17.f84065c.destroyItem((android.view.ViewGroup) r17, r1, r13.f84078a);
        r12 = r12 - 1;
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r13 = r17.f84070j.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r13 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        if (r1 != r13.f84079b) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r15 = r15 + r13.f84081d;
        r12 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r13 = r17.f84070j.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cd, code lost:
        r15 = r15 + b(r1, r12 + 1).f84081d;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        r13 = r17.f84070j.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        r2 = (2.0f - r7.f84081d) + (((float) getPaddingLeft()) / ((float) r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        if (r7 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0105, code lost:
        r4 = r7.f84081d;
        r2 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010b, code lost:
        if (r4 >= 2.0f) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r2 >= r17.f84070j.size()) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0115, code lost:
        r13 = r17.f84070j.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011d, code lost:
        if (r11 > 0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011f, code lost:
        r1 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0120, code lost:
        r11 = r17.f84066d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0122, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        if (r11 >= r6) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0128, code lost:
        if (r4 < r1) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012a, code lost:
        if (r11 <= r9) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012c, code lost:
        if (r13 == null) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0130, code lost:
        if (r11 != r13.f84079b) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0134, code lost:
        if (r13.f84080c != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0136, code lost:
        r17.f84070j.remove(r2);
        r17.f84065c.destroyItem((android.view.ViewGroup) r17, r11, r13.f84078a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0148, code lost:
        if (r2 >= r17.f84070j.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014a, code lost:
        r13 = r17.f84070j.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0153, code lost:
        if (r13 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (r11 != r13.f84079b) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0159, code lost:
        r4 = r4 + r13.f84081d;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0164, code lost:
        if (r2 >= r17.f84070j.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0166, code lost:
        r13 = r17.f84070j.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        r0 = b(r11, r2);
        r2 = r2 + 1;
        r4 = r4 + r0.f84081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017e, code lost:
        if (r2 >= r17.f84070j.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0180, code lost:
        r13 = r17.f84070j.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0189, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x018b, code lost:
        r1 = (((float) getPaddingRight()) / ((float) r11)) + 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0195, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0197, code lost:
        a(r7, r8, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r18) {
        /*
        // Method dump skipped, instructions count: 629
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.b(int):void");
    }

    private void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.L) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.I = motionEvent.getY(i2);
            this.L = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void a(int i2, boolean z2) {
        this.B = false;
        a(i2, z2, false);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.ae == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((c) this.af.get(i3).getLayoutParams()).f84088f;
    }

    private b b(int i2, int i3) {
        b bVar = new b();
        bVar.f84079b = i2;
        bVar.f84078a = this.f84065c.instantiateItem((ViewGroup) this, i2);
        bVar.f84081d = this.f84065c.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.f84070j.size()) {
            this.f84070j.add(bVar);
        } else {
            this.f84070j.add(i3, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        b a2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f84079b == this.f84066d && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public MDVerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(775);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.p = new b(context2, new b.a(f84063i, new b.animation.InterpolatorC2006b()));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f2 = context2.getResources().getDisplayMetrics().density;
        this.G = viewConfiguration.getScaledPagingTouchSlop();
        this.N = (int) (400.0f * f2);
        this.O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new androidx.core.widget.d(context2);
        this.R = new androidx.core.widget.d(context2);
        this.f84068f = (int) (25.0f * f2);
        this.P = (int) (2.0f * f2);
        this.E = (int) (f2 * 16.0f);
        v.a(this, new d());
        if (v.d(this) == 0) {
            v.a((View) this, 1);
        }
        MethodCollector.o(775);
    }

    private void a(int i2, int i3) {
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = 0 - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            b();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i6 = clientHeight / 2;
        float f2 = (float) clientHeight;
        float f3 = (float) i6;
        float a2 = f3 + (a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / f2)) * f3);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a2 / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i4)) / ((f2 * this.f84065c.getPageWidth(this.f84066d)) + ((float) this.r))) + 1.0f) * 100.0f);
        }
        this.p.startScroll(scrollX, scrollY, i4, i5, Math.min(abs, 600));
        v.c(this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager.onMeasure(int, int):void");
    }

    private void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(857);
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c cVar = (c) layoutParams;
        cVar.f84083a |= view instanceof a;
        if (!this.z) {
            super.addView(view, i2, layoutParams);
            MethodCollector.o(857);
        } else if (!cVar.f84083a) {
            cVar.f84086d = true;
            addViewInLayout(view, i2, layoutParams);
            MethodCollector.o(857);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot add pager decor view during layout");
            MethodCollector.o(857);
            throw illegalStateException;
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        b a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f84079b == this.f84066d) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if ((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
                arrayList.add(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i3 != i5) {
            int i6 = this.r;
            a(i3, i5, i6, i6);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        float f2;
        if (i3 <= 0 || this.f84070j.isEmpty()) {
            b c2 = c(this.f84066d);
            if (c2 != null) {
                f2 = Math.min(c2.f84082e, this.w);
            } else {
                f2 = 0.0f;
            }
            int paddingTop = (int) (f2 * ((float) ((i2 - getPaddingTop()) - getPaddingBottom())));
            if (paddingTop != getScrollY()) {
                a(false);
                scrollTo(getScrollX(), paddingTop);
                return;
            }
            return;
        }
        int scrollY = (int) ((((float) getScrollY()) / ((float) (((i3 - getPaddingTop()) - getPaddingBottom()) + i5))) * ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4)));
        scrollTo(getScrollX(), scrollY);
        if (!this.p.isFinished()) {
            this.p.startScroll(0, scrollY, 0, (int) (c(this.f84066d).f84082e * ((float) i2)), this.p.getDuration() - this.p.timePassed());
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        int i4;
        b c2 = c(i2);
        if (c2 != null) {
            i4 = (int) (((float) getClientHeight()) * Math.max(this.v, Math.min(c2.f84082e, this.w)));
        } else {
            i4 = 0;
        }
        if (z2) {
            a(i4, i3);
            if (z3) {
                ViewPager.e eVar = this.W;
                if (eVar != null) {
                    eVar.onPageSelected(i2);
                }
                ViewPager.e eVar2 = this.aa;
                if (eVar2 != null) {
                    eVar2.onPageSelected(i2);
                    return;
                }
                return;
            }
            return;
        }
        if (z3) {
            ViewPager.e eVar3 = this.W;
            if (eVar3 != null) {
                eVar3.onPageSelected(i2);
            }
            ViewPager.e eVar4 = this.aa;
            if (eVar4 != null) {
                eVar4.onPageSelected(i2);
            }
        }
        a(false);
        scrollTo(0, i4);
        d(i4);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        b a2;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = getChildCount();
        int i10 = i4 - i2;
        int i11 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollY = getScrollY();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f84083a) {
                    int i14 = cVar.f84084b & 7;
                    int i15 = cVar.f84084b & 112;
                    if (i14 == 1) {
                        i6 = Math.max((i10 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i7 = paddingLeft;
                        paddingLeft = i6;
                    } else if (i14 == 3) {
                        i7 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i14 != 5) {
                        i7 = paddingLeft;
                    } else {
                        i6 = (i10 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i7 = paddingLeft;
                        paddingLeft = i6;
                    }
                    if (i15 == 16) {
                        i8 = Math.max((i11 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i9 = paddingTop;
                        paddingTop = i8;
                    } else if (i15 == 48) {
                        i9 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i15 != 80) {
                        i9 = paddingTop;
                    } else {
                        i8 = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i9 = paddingTop;
                        paddingTop = i8;
                    }
                    int i16 = paddingTop + scrollY;
                    childAt.layout(paddingLeft, i16, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + i16);
                    i12++;
                    paddingTop = i9;
                    paddingLeft = i7;
                }
            }
        }
        int i17 = (i11 - paddingTop) - paddingBottom;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                c cVar2 = (c) childAt2.getLayoutParams();
                if (!cVar2.f84083a && (a2 = a(childAt2)) != null) {
                    float f2 = (float) i17;
                    int i19 = ((int) (a2.f84082e * f2)) + paddingTop;
                    if (cVar2.f84086d) {
                        cVar2.f84086d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((i10 - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f2 * cVar2.f84085c), 1073741824));
                    }
                    childAt2.layout(paddingLeft, i19, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i19);
                }
            }
        }
        this.t = paddingLeft;
        this.u = i10 - paddingRight;
        this.V = i12;
        if (this.S) {
            z3 = false;
            a(this.f84066d, false, 0, false);
        } else {
            z3 = false;
        }
        this.S = z3;
    }
}
