package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
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
import android.widget.Scroller;
import androidx.core.h.ad;
import androidx.core.h.r;
import androidx.core.h.v;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VerticalViewPager extends com.ss.android.ugc.aweme.common.widget.c {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f106335a = {16842931};
    private static final h ak = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final Interpolator f106336b = new Interpolator() {
        /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(67964);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: e  reason: collision with root package name */
    static Field f106337e;

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<c> f106338h = new Comparator<c>() {
        /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(67963);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(c cVar, c cVar2) {
            return cVar.f106355b - cVar2.f106355b;
        }
    };
    private boolean A;
    private boolean B;
    private int C = 1;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private float I;
    private float J;
    private float K;
    private float L;
    private int M = -1;
    private VelocityTracker N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private long T;
    private androidx.core.widget.d U;
    private androidx.core.widget.d V;
    private boolean W = true;
    private boolean aa = false;
    private boolean ab;
    private int ac;
    private List<ViewPager.e> ad = new ArrayList();
    private ViewPager.e ae;
    private f af;
    private ViewPager.f ag;
    private Method ah;
    private int ai;
    private ArrayList<View> aj;
    private final Runnable al = new Runnable() {
        /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.AnonymousClass3 */

        static {
            Covode.recordClassIndex(67965);
        }

        public final void run() {
            VerticalViewPager.this.setScrollState(0);
            VerticalViewPager.this.f();
        }
    };
    private int am = 0;
    private boolean an = false;

    /* renamed from: c  reason: collision with root package name */
    public PagerAdapter f106339c;

    /* renamed from: d  reason: collision with root package name */
    public int f106340d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f106341f = true;

    /* renamed from: g  reason: collision with root package name */
    private int f106342g;

    /* renamed from: i  reason: collision with root package name */
    private final ArrayList<c> f106343i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private final c f106344j = new c();

    /* renamed from: k  reason: collision with root package name */
    private final Rect f106345k = new Rect();

    /* renamed from: l  reason: collision with root package name */
    private int f106346l = -1;

    /* renamed from: m  reason: collision with root package name */
    private Parcelable f106347m = null;
    private ClassLoader n = null;
    private Scroller o;
    private boolean p;
    private g q;
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
            Covode.recordClassIndex(67969);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(67970);
        }
    }

    public interface f {
        static {
            Covode.recordClassIndex(67974);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Object f106354a;

        /* renamed from: b  reason: collision with root package name */
        int f106355b;

        /* renamed from: c  reason: collision with root package name */
        boolean f106356c;

        /* renamed from: d  reason: collision with root package name */
        float f106357d;

        /* renamed from: e  reason: collision with root package name */
        float f106358e;

        static {
            Covode.recordClassIndex(67971);
        }

        c() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class h implements Comparator<View> {
        static {
            Covode.recordClassIndex(67976);
        }

        h() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            d dVar = (d) view.getLayoutParams();
            d dVar2 = (d) view2.getLayoutParams();
            if (dVar.f106359a == dVar2.f106359a) {
                return dVar.f106363e - dVar2.f106363e;
            }
            if (dVar.f106359a) {
                return 1;
            }
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.c
    public final boolean a() {
        return this.an;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.e
    public final boolean b() {
        return this.S;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.b
    public PagerAdapter getAdapter() {
        return this.f106339c;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.b
    public int getCurrentItem() {
        return this.f106340d;
    }

    public int getExpectedAdapterCount() {
        return this.f106342g;
    }

    public int getOffscreenPageLimit() {
        return this.C;
    }

    public int getPageMargin() {
        return this.r;
    }

    private void a(int i2, boolean z2, boolean z3, int i3) {
        PagerAdapter pagerAdapter = this.f106339c;
        boolean z4 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f106340d != i2 || this.f106343i.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f106339c.getCount()) {
                i2 = this.f106339c.getCount() - 1;
            }
            int i4 = this.C;
            int i5 = this.f106340d;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f106343i.size(); i6++) {
                    this.f106343i.get(i6).f106356c = true;
                }
            }
            if (this.f106340d != i2) {
                z4 = true;
            }
            if (this.W) {
                this.f106340d = i2;
                if (z4) {
                    List<ViewPager.e> list = this.ad;
                    if (list != null && !list.isEmpty()) {
                        for (ViewPager.e eVar : this.ad) {
                            eVar.onPageSelected(i2);
                        }
                    }
                    ViewPager.e eVar2 = this.ae;
                    if (eVar2 != null) {
                        eVar2.onPageSelected(i2);
                    }
                }
                requestLayout();
                return;
            }
            a(i2);
            a(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        c b2 = b(i2);
        int clientHeight = b2 != null ? (int) (((float) getClientHeight()) * Math.max(this.v, Math.min(b2.f106358e, this.w))) : 0;
        if (z2) {
            a(clientHeight, i3);
            if (z3) {
                List<ViewPager.e> list = this.ad;
                if (list != null && !list.isEmpty()) {
                    for (ViewPager.e eVar : this.ad) {
                        eVar.onPageSelected(i2);
                    }
                }
                ViewPager.e eVar2 = this.ae;
                if (eVar2 != null) {
                    eVar2.onPageSelected(i2);
                    return;
                }
                return;
            }
            return;
        }
        if (z3) {
            List<ViewPager.e> list2 = this.ad;
            if (list2 != null && !list2.isEmpty()) {
                for (ViewPager.e eVar3 : this.ad) {
                    eVar3.onPageSelected(i2);
                }
            }
            ViewPager.e eVar4 = this.ae;
            if (eVar4 != null) {
                eVar4.onPageSelected(i2);
            }
        }
        a(false);
        scrollTo(0, clientHeight);
        c(clientHeight);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.b
    public final void a(ViewPager.e eVar) {
        if (eVar != null) {
            this.ad.add(eVar);
        }
    }

    private void a(c cVar, int i2, c cVar2) {
        c cVar3;
        c cVar4;
        int count = this.f106339c.getCount();
        int clientHeight = getClientHeight();
        float f2 = clientHeight > 0 ? ((float) this.r) / ((float) clientHeight) : 0.0f;
        if (cVar2 != null) {
            int i3 = cVar2.f106355b;
            if (i3 < cVar.f106355b) {
                float f3 = cVar2.f106358e + cVar2.f106357d + f2;
                int i4 = i3 + 1;
                int i5 = 0;
                while (i4 <= cVar.f106355b && i5 < this.f106343i.size()) {
                    c cVar5 = this.f106343i.get(i5);
                    while (true) {
                        cVar4 = cVar5;
                        if (i4 > cVar4.f106355b && i5 < this.f106343i.size() - 1) {
                            i5++;
                            cVar5 = this.f106343i.get(i5);
                        }
                    }
                    while (i4 < cVar4.f106355b) {
                        f3 += this.f106339c.getPageWidth(i4) + f2;
                        i4++;
                    }
                    cVar4.f106358e = f3;
                    f3 += cVar4.f106357d + f2;
                    i4++;
                }
            } else if (i3 > cVar.f106355b) {
                int size = this.f106343i.size() - 1;
                float f4 = cVar2.f106358e;
                int i6 = i3 - 1;
                while (i6 >= cVar.f106355b && size >= 0) {
                    c cVar6 = this.f106343i.get(size);
                    while (true) {
                        cVar3 = cVar6;
                        if (i6 < cVar3.f106355b && size > 0) {
                            size--;
                            cVar6 = this.f106343i.get(size);
                        }
                    }
                    while (i6 > cVar3.f106355b) {
                        f4 -= this.f106339c.getPageWidth(i6) + f2;
                        i6--;
                    }
                    f4 -= cVar3.f106357d + f2;
                    cVar3.f106358e = f4;
                    i6--;
                }
            }
        }
        int size2 = this.f106343i.size();
        float f5 = cVar.f106358e;
        int i7 = cVar.f106355b - 1;
        this.v = cVar.f106355b == 0 ? cVar.f106358e : -3.4028235E38f;
        int i8 = count - 1;
        this.w = cVar.f106355b == i8 ? (cVar.f106358e + cVar.f106357d) - 1.0f : Float.MAX_VALUE;
        int i9 = i2 - 1;
        while (i9 >= 0) {
            c cVar7 = this.f106343i.get(i9);
            while (i7 > cVar7.f106355b) {
                f5 -= this.f106339c.getPageWidth(i7) + f2;
                i7--;
            }
            f5 -= cVar7.f106357d + f2;
            cVar7.f106358e = f5;
            if (cVar7.f106355b == 0) {
                this.v = f5;
            }
            i9--;
            i7--;
        }
        float f6 = cVar.f106358e + cVar.f106357d + f2;
        int i10 = cVar.f106355b + 1;
        int i11 = i2 + 1;
        while (i11 < size2) {
            c cVar8 = this.f106343i.get(i11);
            while (i10 < cVar8.f106355b) {
                f6 += this.f106339c.getPageWidth(i10) + f2;
                i10++;
            }
            if (cVar8.f106355b == i8) {
                this.w = (cVar8.f106357d + f6) - 1.0f;
            }
            cVar8.f106358e = f6;
            f6 += cVar8.f106357d + f2;
            i11++;
            i10++;
        }
        this.aa = false;
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.f106343i.isEmpty()) {
            c b2 = b(this.f106340d);
            int min = (int) ((b2 != null ? Math.min(b2.f106358e, this.w) : 0.0f) * ((float) ((i2 - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                a(false);
                scrollTo(getScrollX(), min);
            }
        } else if (!this.o.isFinished()) {
            this.o.setFinalY(getCurrentItem() * getClientHeight());
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i3 - getPaddingTop()) - getPaddingBottom()) + i5))) * ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))));
        }
    }

    private void a(boolean z2) {
        boolean z3;
        if (this.am == 2) {
            z3 = true;
            setScrollingCacheEnabled(false);
            if (!this.o.isFinished()) {
                this.o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.o.getCurrX();
                int currY = this.o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        c(currY);
                    }
                }
            }
        } else {
            z3 = false;
        }
        this.B = false;
        for (int i2 = 0; i2 < this.f106343i.size(); i2++) {
            c cVar = this.f106343i.get(i2);
            if (cVar.f106356c) {
                cVar.f106356c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            v.a(this, this.al);
        } else {
            this.al.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.e
    public final void a(float f2) {
        if (!this.S) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f106339c != null) {
            try {
                this.J += f2;
                float scrollY = ((float) getScrollY()) - f2;
                float clientHeight = (float) getClientHeight();
                float f3 = this.v * clientHeight;
                float f4 = this.w * clientHeight;
                c cVar = this.f106343i.get(0);
                ArrayList<c> arrayList = this.f106343i;
                c cVar2 = arrayList.get(arrayList.size() - 1);
                if (cVar.f106355b != 0) {
                    f3 = cVar.f106358e * clientHeight;
                }
                if (cVar2.f106355b != this.f106339c.getCount() - 1) {
                    f4 = cVar2.f106358e * clientHeight;
                }
                if (scrollY < f3) {
                    scrollY = f3;
                } else if (scrollY > f4) {
                    scrollY = f4;
                }
                int i2 = (int) scrollY;
                this.J += scrollY - ((float) i2);
                scrollTo(getScrollX(), i2);
                c(i2);
                MotionEvent obtain = MotionEvent.obtain(this.T, SystemClock.uptimeMillis(), 2, 0.0f, this.J, 0);
                if (this.N == null) {
                    this.N = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.N;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(obtain);
                    obtain.recycle();
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.M) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.J = motionEvent.getY(i2);
            this.M = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.N;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean a(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof b) {
            return false;
        }
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

    public static class d extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f106359a;

        /* renamed from: b  reason: collision with root package name */
        public int f106360b;

        /* renamed from: c  reason: collision with root package name */
        float f106361c;

        /* renamed from: d  reason: collision with root package name */
        boolean f106362d;

        /* renamed from: e  reason: collision with root package name */
        int f106363e;

        /* renamed from: f  reason: collision with root package name */
        int f106364f;

        static {
            Covode.recordClassIndex(67972);
        }

        public d() {
            super(-1, -1);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f106335a);
            this.f106360b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends DataSetObserver {
        static {
            Covode.recordClassIndex(67975);
        }

        public final void onChanged() {
            VerticalViewPager.this.e();
        }

        public final void onInvalidated() {
            VerticalViewPager.this.e();
        }

        private g() {
        }

        /* synthetic */ g(VerticalViewPager verticalViewPager, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        a(this.f106340d);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = true;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private void i() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private void k() {
        this.D = false;
        this.E = false;
        VelocityTracker velocityTracker = this.N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.N = null;
        }
    }

    private boolean l() {
        int i2 = this.f106340d;
        if (i2 <= 0) {
            return false;
        }
        a(i2 - 1, true);
        return true;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = androidx.core.d.e.a(new androidx.core.d.f<SavedState>() {
            /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67968);
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
        int f106351a;

        /* renamed from: b  reason: collision with root package name */
        Parcelable f106352b;

        /* renamed from: c  reason: collision with root package name */
        ClassLoader f106353c;

        static {
            Covode.recordClassIndex(67967);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f106351a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f106351a);
            parcel.writeParcelable(this.f106352b, i2);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f106351a = parcel.readInt();
            this.f106352b = parcel.readParcelable(classLoader);
            this.f106353c = classLoader;
        }
    }

    class e extends androidx.core.h.a {
        static {
            Covode.recordClassIndex(67973);
        }

        private boolean a() {
            if (VerticalViewPager.this.f106339c == null || VerticalViewPager.this.f106339c.getCount() <= 1) {
                return false;
            }
            return true;
        }

        e() {
        }

        @Override // androidx.core.h.a
        public final void a(View view, androidx.core.h.a.d dVar) {
            super.a(view, dVar);
            dVar.a((CharSequence) ViewPager.class.getName());
            dVar.d(a());
            if (VerticalViewPager.this.canScrollVertically(1)) {
                dVar.a(4096);
            }
            if (VerticalViewPager.this.canScrollVertically(-1)) {
                dVar.a(8192);
            }
        }

        @Override // androidx.core.h.a
        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            androidx.core.h.a.f a2 = androidx.core.h.a.f.a();
            a2.a(a());
            if (accessibilityEvent.getEventType() == 4096 && VerticalViewPager.this.f106339c != null) {
                a2.a(VerticalViewPager.this.f106339c.getCount());
                a2.b(VerticalViewPager.this.f106340d);
                a2.c(VerticalViewPager.this.f106340d);
            }
        }

        @Override // androidx.core.h.a
        public final boolean a(View view, int i2, Bundle bundle) {
            if (super.a(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !VerticalViewPager.this.canScrollVertically(-1)) {
                    return false;
                }
                VerticalViewPager verticalViewPager = VerticalViewPager.this;
                verticalViewPager.setCurrentItem(verticalViewPager.f106340d - 1);
                return true;
            } else if (!VerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
                verticalViewPager2.setCurrentItem(verticalViewPager2.f106340d + 1);
                return true;
            }
        }
    }

    private boolean h() {
        this.M = -1;
        k();
        return this.U.a() | this.V.a();
    }

    private boolean m() {
        PagerAdapter pagerAdapter = this.f106339c;
        if (pagerAdapter == null || this.f106340d >= pagerAdapter.getCount() - 1) {
            return false;
        }
        a(this.f106340d + 1, true);
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

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.al);
        Scroller scroller = this.o;
        if (scroller != null && !scroller.isFinished()) {
            this.o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f106351a = this.f106340d;
        PagerAdapter pagerAdapter = this.f106339c;
        if (pagerAdapter != null) {
            savedState.f106352b = pagerAdapter.saveState();
        }
        return savedState;
    }

    static {
        Covode.recordClassIndex(67962);
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f106337e = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    private void g() {
        if (this.ai != 0) {
            ArrayList<View> arrayList = this.aj;
            if (arrayList == null) {
                this.aj = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.aj.add(getChildAt(i2));
            }
            Collections.sort(this.aj, ak);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.e
    public final boolean c() {
        if (this.D) {
            return false;
        }
        this.S = true;
        setScrollState(1);
        this.L = 0.0f;
        this.J = 0.0f;
        VelocityTracker velocityTracker = this.N;
        if (velocityTracker == null) {
            this.N = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.N.addMovement(obtain);
        obtain.recycle();
        this.T = uptimeMillis;
        return true;
    }

    private c j() {
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
        c cVar = null;
        float f5 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.f106343i.size()) {
            c cVar2 = this.f106343i.get(i4);
            if (!z2 && cVar2.f106355b != (i2 = i3 + 1)) {
                cVar2 = this.f106344j;
                cVar2.f106358e = f4 + f5 + f3;
                cVar2.f106355b = i2;
                cVar2.f106357d = this.f106339c.getPageWidth(cVar2.f106355b);
                i4--;
            }
            f4 = cVar2.f106358e;
            float f6 = cVar2.f106357d + f4 + f3;
            if (!z2 && f2 < f4) {
                return cVar;
            }
            if (f2 < f6 || i4 == this.f106343i.size() - 1) {
                return cVar2;
            }
            i3 = cVar2.f106355b;
            f5 = cVar2.f106357d;
            i4++;
            cVar = cVar2;
            z2 = false;
        }
        return cVar;
    }

    public void computeScroll() {
        this.p = true;
        if (this.o.isFinished() || !this.o.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.o.getCurrX();
        int currY = this.o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!c(currY)) {
                this.o.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        v.c(this);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.e
    public final void d() {
        if (this.S) {
            if (this.f106339c != null) {
                VelocityTracker velocityTracker = this.N;
                velocityTracker.computeCurrentVelocity(1000, (float) this.P);
                int yVelocity = (int) velocityTracker.getYVelocity(this.M);
                this.B = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                c j2 = j();
                a(a(j2.f106355b, ((((float) scrollY) / ((float) clientHeight)) - j2.f106358e) / j2.f106357d, yVelocity, (int) (this.J - this.L)), true, true, yVelocity);
            }
            k();
            this.S = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        boolean z2;
        int count = this.f106339c.getCount();
        this.f106342g = count;
        if (this.f106343i.size() >= (this.C * 2) + 1 || this.f106343i.size() >= count) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i2 = this.f106340d;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.f106343i.size()) {
            c cVar = this.f106343i.get(i3);
            int itemPosition = this.f106339c.getItemPosition(cVar.f106354a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f106343i.remove(i3);
                    i3--;
                    if (!z3) {
                        this.f106339c.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f106339c.destroyItem((ViewGroup) this, cVar.f106355b, cVar.f106354a);
                    if (this.f106340d == cVar.f106355b) {
                        i2 = Math.max(0, Math.min(this.f106340d, count - 1));
                    }
                } else if (cVar.f106355b != itemPosition) {
                    if (cVar.f106355b == this.f106340d) {
                        i2 = itemPosition;
                    }
                    cVar.f106355b = itemPosition;
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.f106339c.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f106343i, f106338h);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                d dVar = (d) getChildAt(i4).getLayoutParams();
                if (!dVar.f106359a) {
                    dVar.f106361c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    public void setCanTouch(boolean z2) {
        this.f106341f = z2;
    }

    public void setDisableScroll(boolean z2) {
        this.an = z2;
    }

    public void setOnAdapterChangeListener(f fVar) {
        this.af = fVar;
    }

    public void setScroller(Scroller scroller) {
        this.o = scroller;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.A != z2) {
            this.A = z2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i2) {
        this.B = false;
        a(i2, true, true, 1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f106341f || !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i2) {
        this.B = false;
        a(i2, !this.W, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 <= 0) {
            i2 = 1;
        }
        if (i2 != this.C) {
            this.C = i2;
            f();
        }
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

    private static float b(float f2) {
        double d2 = (double) (f2 - 0.5f);
        Double.isNaN(d2);
        return (float) Math.sin((double) ((float) (d2 * 0.4712389167638204d)));
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

    private c a(View view) {
        for (int i2 = 0; i2 < this.f106343i.size(); i2++) {
            c cVar = this.f106343i.get(i2);
            if (this.f106339c.isViewFromObject(view, cVar.f106354a)) {
                return cVar;
            }
        }
        return null;
    }

    private c b(int i2) {
        for (int i3 = 0; i3 < this.f106343i.size(); i3++) {
            c cVar = this.f106343i.get(i3);
            if (cVar.f106355b == i2) {
                return cVar;
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        c a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f106355b == this.f106340d) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollVertically(int i2) {
        if (this.f106339c == null) {
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

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f106355b == this.f106340d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        PagerAdapter pagerAdapter = this.f106339c;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f106352b, savedState.f106353c);
            a(savedState.f106351a, false, true);
            return;
        }
        this.f106346l = savedState.f106351a;
        this.f106347m = savedState.f106352b;
        this.n = savedState.f106353c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(3:2|3|4)|5|6|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChildrenDrawingOrderEnabledCompat(boolean r7) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 7
            java.lang.reflect.Method r0 = r6.ah
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0019
            java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
            java.lang.String r2 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0019 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0019 }
            r1[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0019 }
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0019 }
            r6.ah = r0     // Catch:{ NoSuchMethodException -> 0x0019 }
        L_0x0019:
            java.lang.reflect.Method r2 = r6.ah     // Catch:{ Exception -> 0x0026 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0026 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0026 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0026 }
            r2.invoke(r6, r1)     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    private boolean c(int i2) {
        if (this.f106343i.size() != 0) {
            c j2 = j();
            int clientHeight = getClientHeight();
            int i3 = this.r;
            int i4 = clientHeight + i3;
            float f2 = (float) i3;
            float f3 = (float) clientHeight;
            int i5 = j2.f106355b;
            float f4 = ((((float) i2) / f3) - j2.f106358e) / (j2.f106357d + (f2 / f3));
            this.ab = false;
            a(i5, f4, (int) (((float) i4) * f4));
            if (this.ab) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.W) {
            return false;
        } else {
            this.ab = false;
            a(0, 0.0f, 0);
            if (this.ab) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    z2 = d(17);
                } else if (keyCode == 22) {
                    z2 = d(66);
                } else if (keyCode == 61) {
                    if (keyEvent.hasNoModifiers()) {
                        z2 = d(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        z2 = d(1);
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

    public void setScrollState(int i2) {
        boolean z2;
        int i3;
        if (this.am != i2) {
            this.am = i2;
            if (this.ag != null) {
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
            List<ViewPager.e> list = this.ad;
            if (!(list == null || list.isEmpty())) {
                for (ViewPager.e eVar : this.ad) {
                    eVar.onPageScrollStateChanged(i2);
                }
            }
        }
    }

    private c b(View view) {
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

    private boolean c(float f2) {
        boolean z2;
        this.J = f2;
        float scrollY = ((float) getScrollY()) + (this.J - f2);
        float clientHeight = (float) getClientHeight();
        float f3 = this.v * clientHeight;
        float f4 = this.w * clientHeight;
        boolean z3 = false;
        if (this.f106343i.size() <= 0) {
            return false;
        }
        c cVar = this.f106343i.get(0);
        ArrayList<c> arrayList = this.f106343i;
        boolean z4 = true;
        c cVar2 = arrayList.get(arrayList.size() - 1);
        if (cVar.f106355b != 0) {
            f3 = cVar.f106358e * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (cVar2.f106355b != this.f106339c.getCount() - 1) {
            f4 = cVar2.f106358e * clientHeight;
            z4 = false;
        }
        if (scrollY < f3) {
            if (z2) {
                z3 = this.U.a(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z4) {
                z3 = this.V.a(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i2 = (int) scrollY;
        this.I += scrollY - ((float) i2);
        scrollTo(getScrollX(), i2);
        c(i2);
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r7 != 2) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d(int r7) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.d(int):boolean");
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f106339c) != null && pagerAdapter.getCount() > 1)) {
            if (!this.U.f2636a.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.v * ((float) height));
                this.U.a(width, height);
                z2 = false | this.U.a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.V.f2636a.isFinished()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.w + 1.0f)) * ((float) height2));
                this.V.a(width2, height2);
                z2 |= this.V.a(canvas);
                canvas.restoreToCount(save2);
            }
            if (z2) {
                v.c(this);
                return;
            }
            return;
        }
        this.U.f2636a.finish();
        this.V.f2636a.finish();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        super.onDraw(canvas);
        if (this.r > 0 && this.s != null && this.f106343i.size() > 0 && this.f106339c != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f3 = (float) height;
            float f4 = ((float) this.r) / f3;
            int i2 = 0;
            c cVar = this.f106343i.get(0);
            float f5 = cVar.f106358e;
            int size = this.f106343i.size();
            int i3 = this.f106343i.get(size - 1).f106355b;
            for (int i4 = cVar.f106355b; i4 < i3; i4++) {
                while (i4 > cVar.f106355b && i2 < size) {
                    i2++;
                    cVar = this.f106343i.get(i2);
                }
                if (i4 == cVar.f106355b) {
                    f2 = (cVar.f106358e + cVar.f106357d) * f3;
                    f5 = cVar.f106358e + cVar.f106357d + f4;
                } else {
                    float pageWidth = this.f106339c.getPageWidth(i4);
                    f2 = (f5 + pageWidth) * f3;
                    f5 += pageWidth + f4;
                }
                int i5 = this.r;
                if (((float) i5) + f2 > ((float) scrollY)) {
                    this.s.setBounds(this.t, (int) f2, this.u, (int) (((float) i5) + f2 + 0.5f));
                    this.s.draw(canvas);
                }
                if (f2 > ((float) (scrollY + height))) {
                    return;
                }
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f106339c;
        if (pagerAdapter2 != null) {
            a(pagerAdapter2, (g) null);
            this.f106339c.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.f106343i.size(); i2++) {
                c cVar = this.f106343i.get(i2);
                this.f106339c.destroyItem((ViewGroup) this, cVar.f106355b, cVar.f106354a);
            }
            this.f106339c.finishUpdate((ViewGroup) this);
            this.f106343i.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((d) getChildAt(i3).getLayoutParams()).f106359a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f106340d = 0;
            scrollTo(0, 0);
        }
        this.f106339c = pagerAdapter;
        this.f106342g = 0;
        if (pagerAdapter != null) {
            if (this.q == null) {
                this.q = new g(this, (byte) 0);
            }
            a(this.f106339c, this.q);
            this.B = false;
            boolean z2 = this.W;
            this.W = true;
            this.f106342g = this.f106339c.getCount();
            if (this.f106346l >= 0) {
                this.f106339c.restoreState(this.f106347m, this.n);
                a(this.f106346l, false, true);
                this.f106346l = -1;
                this.f106347m = null;
                this.n = null;
            } else if (!z2) {
                f();
            } else {
                requestLayout();
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        try {
            if (this.S) {
                return false;
            }
            int action = motionEvent.getAction() & 255;
            if (action != 3) {
                if (action != 1) {
                    if (action != 0) {
                        if (this.D) {
                            return true;
                        }
                        if (this.E) {
                            return false;
                        }
                    }
                    if (action == 0) {
                        this.I = motionEvent.getX();
                        this.K = motionEvent.getX();
                        this.J = motionEvent.getY();
                        this.L = motionEvent.getY();
                        this.M = motionEvent.getPointerId(0);
                        this.E = false;
                        this.p = true;
                        this.o.computeScrollOffset();
                        if (this.am != 2 || Math.abs(this.o.getFinalY() - this.o.getCurrY()) <= this.R) {
                            a(false);
                            this.D = false;
                        } else {
                            this.o.abortAnimation();
                            this.B = false;
                            f();
                            this.D = true;
                            i();
                            setScrollState(1);
                        }
                    } else if (action == 2) {
                        int i2 = this.M;
                        if (i2 != -1) {
                            int findPointerIndex = motionEvent.findPointerIndex(i2);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float f3 = y2 - this.J;
                            float abs = Math.abs(f3);
                            float x2 = motionEvent.getX(findPointerIndex);
                            float abs2 = Math.abs(x2 - this.K);
                            if (f3 != 0.0f) {
                                float f4 = this.J;
                                if (f4 >= ((float) this.G) || f3 <= 0.0f) {
                                    if (f4 <= ((float) (getHeight() - this.G)) || f3 >= 0.0f) {
                                        if (a(this, false, (int) f3, (int) x2, (int) y2)) {
                                            this.I = x2;
                                            this.J = y2;
                                            this.E = true;
                                            return false;
                                        }
                                    }
                                }
                            }
                            int i3 = this.H;
                            if (abs > ((float) i3) && abs * 0.5f > abs2) {
                                this.D = true;
                                i();
                                setScrollState(1);
                                if (f3 > 0.0f) {
                                    f2 = this.L + ((float) this.H);
                                } else {
                                    f2 = this.L - ((float) this.H);
                                }
                                this.J = f2;
                                this.I = x2;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > ((float) i3)) {
                                this.E = true;
                            }
                            if (this.D && c(y2)) {
                                v.c(this);
                            }
                        }
                    } else if (action == 6) {
                        a(motionEvent);
                    }
                    if (this.N == null) {
                        this.N = VelocityTracker.obtain();
                    }
                    this.N.addMovement(motionEvent);
                    return this.D;
                }
            }
            h();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean z2;
        float f2;
        try {
            if (this.S) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (pagerAdapter = this.f106339c) != null) {
                if (pagerAdapter.getCount() != 0) {
                    if (this.N == null) {
                        this.N = VelocityTracker.obtain();
                    }
                    this.N.addMovement(motionEvent);
                    int action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                if (!this.D) {
                                    int findPointerIndex = motionEvent.findPointerIndex(this.M);
                                    if (findPointerIndex == -1) {
                                        z2 = h();
                                    } else {
                                        float y2 = motionEvent.getY(findPointerIndex);
                                        float abs = Math.abs(y2 - this.J);
                                        float x2 = motionEvent.getX(findPointerIndex);
                                        float abs2 = Math.abs(x2 - this.I);
                                        if (abs > ((float) this.H) && abs > abs2) {
                                            this.D = true;
                                            i();
                                            float f3 = this.L;
                                            if (y2 - f3 > 0.0f) {
                                                f2 = f3 + ((float) this.H);
                                            } else {
                                                f2 = f3 - ((float) this.H);
                                            }
                                            this.J = f2;
                                            this.I = x2;
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            ViewParent parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.D) {
                                    z2 = false | c(motionEvent.getY(motionEvent.findPointerIndex(this.M)));
                                }
                            } else if (action != 3) {
                                if (action == 5) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    this.J = motionEvent.getY(actionIndex);
                                    this.M = motionEvent.getPointerId(actionIndex);
                                } else if (action == 6) {
                                    a(motionEvent);
                                    this.J = motionEvent.getY(motionEvent.findPointerIndex(this.M));
                                }
                            } else if (this.D) {
                                a(this.f106340d, true, 0, false);
                                z2 = h();
                            }
                        } else if (this.D) {
                            VelocityTracker velocityTracker = this.N;
                            velocityTracker.computeCurrentVelocity(1000, (float) this.P);
                            int yVelocity = (int) velocityTracker.getYVelocity(this.M);
                            this.B = true;
                            int clientHeight = getClientHeight();
                            int scrollY = getScrollY();
                            c j2 = j();
                            if (j2 != null) {
                                float f4 = (float) clientHeight;
                                a(a(j2.f106355b, ((((float) scrollY) / f4) - j2.f106358e) / (j2.f106357d + (((float) this.r) / f4)), yVelocity, (int) (motionEvent.getY(motionEvent.findPointerIndex(this.M)) - this.L)), true, true, yVelocity);
                            }
                            z2 = h();
                        }
                        if (z2) {
                            v.c(this);
                        }
                    } else {
                        this.o.abortAnimation();
                        this.B = false;
                        f();
                        this.I = motionEvent.getX();
                        this.K = motionEvent.getX();
                        this.J = motionEvent.getY();
                        this.L = motionEvent.getY();
                        this.M = motionEvent.getPointerId(0);
                    }
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (IllegalStateException e3) {
            if (this.f106339c.getCount() != this.f106342g) {
                this.f106339c.notifyDataSetChanged();
            }
            e3.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r7.f106355b == r17.f106340d) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r12 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r12 < 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        r13 = r17.f106343i.get(r12);
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
        r1 = r17.f106340d - 1;
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
        if (r1 != r13.f106355b) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r13.f106356c != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        r17.f106343i.remove(r12);
        r17.f106339c.destroyItem((android.view.ViewGroup) r17, r1, r13.f106354a);
        r12 = r12 - 1;
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r13 = r17.f106343i.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r13 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        if (r1 != r13.f106355b) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r15 = r15 + r13.f106357d;
        r12 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r13 = r17.f106343i.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cd, code lost:
        r15 = r15 + b(r1, r12 + 1).f106357d;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        r13 = r17.f106343i.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        r2 = (2.0f - r7.f106357d) + (((float) getPaddingLeft()) / ((float) r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        if (r7 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0105, code lost:
        r4 = r7.f106357d;
        r2 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010b, code lost:
        if (r4 >= 2.0f) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r2 >= r17.f106343i.size()) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0115, code lost:
        r13 = r17.f106343i.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011d, code lost:
        if (r11 > 0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011f, code lost:
        r1 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0120, code lost:
        r11 = r17.f106340d;
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
        if (r11 != r13.f106355b) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0134, code lost:
        if (r13.f106356c != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0136, code lost:
        r17.f106343i.remove(r2);
        r17.f106339c.destroyItem((android.view.ViewGroup) r17, r11, r13.f106354a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0148, code lost:
        if (r2 >= r17.f106343i.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014a, code lost:
        r13 = r17.f106343i.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0153, code lost:
        if (r13 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (r11 != r13.f106355b) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0159, code lost:
        r4 = r4 + r13.f106357d;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0164, code lost:
        if (r2 >= r17.f106343i.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0166, code lost:
        r13 = r17.f106343i.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        r0 = b(r11, r2);
        r2 = r2 + 1;
        r4 = r4 + r0.f106357d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017e, code lost:
        if (r2 >= r17.f106343i.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0180, code lost:
        r13 = r17.f106343i.get(r2);
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
    private void a(int r18) {
        /*
        // Method dump skipped, instructions count: 629
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.a(int):void");
    }

    private static void a(PagerAdapter pagerAdapter, g gVar) {
        try {
            Field field = f106337e;
            if (field != null) {
                field.set(pagerAdapter, gVar);
            }
        } catch (IllegalAccessException unused) {
        }
    }

    public final void a(int i2, boolean z2) {
        this.B = false;
        a(i2, z2, false);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.ai == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((d) this.aj.get(i3).getLayoutParams()).f106364f;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        c a2;
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
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f106355b == this.f106340d && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    private c b(int i2, int i3) {
        c cVar = new c();
        cVar.f106355b = i2;
        cVar.f106354a = this.f106339c.instantiateItem((ViewGroup) this, i2);
        cVar.f106357d = this.f106339c.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.f106343i.size()) {
            this.f106343i.add(cVar);
        } else {
            this.f106343i.add(i3, cVar);
        }
        return cVar;
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.o = new Scroller(context2, f106336b);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f2 = context2.getResources().getDisplayMetrics().density;
        this.H = viewConfiguration.getScaledPagingTouchSlop();
        this.O = (int) (400.0f * f2);
        this.P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.U = new androidx.core.widget.d(context2);
        this.V = new androidx.core.widget.d(context2);
        this.Q = (int) (25.0f * f2);
        this.R = (int) (2.0f * f2);
        this.F = (int) (f2 * 16.0f);
        v.a(this, new e());
        if (v.d(this) == 0) {
            v.a((View) this, 1);
        }
        v.a(this, new r() {
            /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.AnonymousClass4 */

            /* renamed from: b  reason: collision with root package name */
            private final Rect f106350b = new Rect();

            static {
                Covode.recordClassIndex(67966);
            }

            @Override // androidx.core.h.r
            public final ad a(View view, ad adVar) {
                ad a2 = v.a(view, adVar);
                if (a2.f2507b.b()) {
                    return a2;
                }
                Rect rect = this.f106350b;
                rect.left = a2.a();
                rect.top = a2.b();
                rect.right = a2.c();
                rect.bottom = a2.d();
                int childCount = VerticalViewPager.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ad b2 = v.b(VerticalViewPager.this.getChildAt(i2), a2);
                    rect.left = Math.min(b2.a(), rect.left);
                    rect.top = Math.min(b2.b(), rect.top);
                    rect.right = Math.min(b2.c(), rect.right);
                    rect.bottom = Math.min(b2.d(), rect.bottom);
                }
                return a2.a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager.onMeasure(int, int):void");
    }

    private void a(int i2, int i3) {
        int scrollY;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.o;
        if (scroller == null || scroller.isFinished()) {
            scrollY = getScrollY();
        } else {
            if (this.p) {
                scrollY = this.o.getCurrY();
            } else {
                scrollY = this.o.getStartY();
            }
            this.o.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollX = getScrollX();
        int i4 = 0 - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i6 = clientHeight / 2;
        float f2 = (float) clientHeight;
        float f3 = (float) i6;
        float b2 = f3 + (b(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / f2)) * f3);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(b2 / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i4)) / ((f2 * this.f106339c.getPageWidth(this.f106340d)) + ((float) this.r))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.p = false;
        this.o.startScroll(scrollX, scrollY, i4, i5, min);
        v.c(this);
    }

    private void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        d dVar = (d) layoutParams;
        dVar.f106359a |= view instanceof a;
        if (!this.z) {
            super.addView(view, i2, layoutParams);
        } else if (!dVar.f106359a) {
            dVar.f106362d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        c a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f106355b == this.f106340d) {
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

    private void a(int i2, float f2, int i3) {
        int i4;
        int i5;
        if (this.ac > 0) {
            int scrollY = getScrollY();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.f106359a) {
                    int i7 = dVar.f106360b & 112;
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
        List<ViewPager.e> list = this.ad;
        if (list != null && !list.isEmpty()) {
            for (ViewPager.e eVar : this.ad) {
                eVar.onPageScrolled(i2, f2, i3);
            }
        }
        ViewPager.e eVar2 = this.ae;
        if (eVar2 != null) {
            eVar2.onPageScrolled(i2, f2, i3);
        }
        if (this.ag != null) {
            int scrollY2 = getScrollY();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((d) childAt2.getLayoutParams()).f106359a) {
                    this.ag.a(childAt2, ((float) (childAt2.getTop() - scrollY2)) / ((float) getClientHeight()));
                }
            }
        }
        this.ab = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i3 != i5) {
            int i6 = this.r;
            a(i3, i5, i6, i6);
        }
    }

    private int a(int i2, float f2, int i3, int i4) {
        float f3;
        if (Math.abs(i4) <= this.Q || Math.abs(i3) <= this.O) {
            if (i2 >= this.f106340d) {
                f3 = 0.6f;
            } else {
                f3 = 0.4f;
            }
            i2 = (int) (((float) i2) + f2 + f3);
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f106343i.size() <= 0) {
            return i2;
        }
        ArrayList<c> arrayList = this.f106343i;
        return Math.max(this.f106343i.get(0).f106355b, Math.min(i2, arrayList.get(arrayList.size() - 1).f106355b));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
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
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.f106359a) {
                    int i14 = dVar.f106360b & 7;
                    int i15 = dVar.f106360b & 112;
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
                d dVar2 = (d) childAt2.getLayoutParams();
                c a2 = a(childAt2);
                if (!dVar2.f106359a && a2 != null) {
                    float f2 = (float) i17;
                    int i19 = ((int) (a2.f106358e * f2)) + paddingTop;
                    if (dVar2.f106362d) {
                        dVar2.f106362d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((i10 - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f2 * dVar2.f106361c), 1073741824));
                    }
                    childAt2.layout(paddingLeft, i19, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i19);
                }
            }
        }
        this.t = paddingLeft;
        this.u = i10 - paddingRight;
        this.ac = i12;
        if (this.W) {
            z3 = false;
            a(this.f106340d, false, 0, false);
        } else {
            z3 = false;
        }
        this.W = z3;
    }
}
