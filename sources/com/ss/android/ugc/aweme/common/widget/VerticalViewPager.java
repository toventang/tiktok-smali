package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
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
import com.ss.android.ugc.aweme.experiment.co;
import com.ss.android.ugc.aweme.experiment.cv;
import com.ss.android.ugc.aweme.experiment.cw;
import com.ss.android.ugc.aweme.experiment.df;
import com.ss.android.ugc.aweme.experiment.dg;
import com.ss.android.ugc.aweme.experiment.gg;
import com.ss.android.ugc.aweme.feed.helper.k;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VerticalViewPager extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f76527a = {16842931};
    private static final h aC = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final Interpolator f76528b = new Interpolator() {
        /* class com.ss.android.ugc.aweme.common.widget.VerticalViewPager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(47253);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    static Field v;
    private static final Comparator<b> y = new Comparator<b>() {
        /* class com.ss.android.ugc.aweme.common.widget.VerticalViewPager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(47252);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
            return bVar.f76548b - bVar2.f76548b;
        }
    };
    private final b A;
    private final Rect B;
    private int C;
    private Parcelable D;
    private ClassLoader E;
    private Scroller F;
    private boolean G;
    private g H;
    private int I;
    private Drawable J;
    private int K;
    private int L;
    private float M;
    private float N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T;
    private boolean U;
    private boolean V;
    private int W;
    private int aA;
    private ArrayList<View> aB;
    private int aD;
    private int aE;
    private final Runnable aF;
    private int aG;
    private f aH;
    private boolean aI;
    private int aa;
    private int ab;
    private float ac;
    private float ad;
    private float ae;
    private float af;
    private float ag;
    private float ah;
    private int ai;
    private VelocityTracker aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private boolean ao;
    private long ap;
    private androidx.core.widget.d aq;
    private androidx.core.widget.d ar;
    private boolean as;
    private boolean at;
    private boolean au;
    private int av;
    private ViewPager.e aw;
    private e ax;
    private ViewPager.f ay;
    private Method az;

    /* renamed from: c  reason: collision with root package name */
    public PagerAdapter f76529c;

    /* renamed from: d  reason: collision with root package name */
    public int f76530d;

    /* renamed from: e  reason: collision with root package name */
    public List<ViewPager.e> f76531e;

    /* renamed from: f  reason: collision with root package name */
    public int f76532f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f76533g;

    /* renamed from: h  reason: collision with root package name */
    public int f76534h;

    /* renamed from: i  reason: collision with root package name */
    Handler f76535i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f76536j;

    /* renamed from: k  reason: collision with root package name */
    int f76537k;

    /* renamed from: l  reason: collision with root package name */
    int f76538l;

    /* renamed from: m  reason: collision with root package name */
    final h.f.a.a<String> f76539m;
    int n;
    boolean o;
    final h.f.a.a<String> p;
    final h.f.a.a<String> q;
    final h.f.a.a<String> r;
    final h.f.a.a<String> s;
    final h.f.a.a<String> t;
    final h.f.a.a<String> u;
    private boolean w;
    private int x;
    private final ArrayList<b> z;

    interface a {
        static {
            Covode.recordClassIndex(47259);
        }
    }

    public interface e {
        static {
            Covode.recordClassIndex(47263);
        }
    }

    public interface f {
        static {
            Covode.recordClassIndex(47264);
        }

        int a(int i2, int i3, int i4);

        int a(int i2, int i3, int i4, int i5);

        void a();

        boolean a(boolean z);

        boolean b();
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Object f76547a;

        /* renamed from: b  reason: collision with root package name */
        int f76548b;

        /* renamed from: c  reason: collision with root package name */
        boolean f76549c;

        /* renamed from: d  reason: collision with root package name */
        float f76550d;

        /* renamed from: e  reason: collision with root package name */
        float f76551e;

        static {
            Covode.recordClassIndex(47260);
        }

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class h implements Comparator<View> {
        static {
            Covode.recordClassIndex(47266);
        }

        h() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            c cVar = (c) view.getLayoutParams();
            c cVar2 = (c) view2.getLayoutParams();
            if (cVar.f76552a == cVar2.f76552a) {
                return cVar.f76556e - cVar2.f76556e;
            }
            if (cVar.f76552a) {
                return 1;
            }
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.c
    public final boolean a() {
        return this.aI;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.e
    public final boolean b() {
        return this.ao;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.b
    public PagerAdapter getAdapter() {
        return this.f76529c;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.b
    public int getCurrentItem() {
        return this.f76530d;
    }

    public int getExpectedAdapterCount() {
        return this.x;
    }

    public int getOffscreenPageLimit() {
        return this.T;
    }

    public int getPageMargin() {
        return this.I;
    }

    public int getScrollState() {
        return this.aG;
    }

    public final void a(int i2, boolean z2) {
        this.S = false;
        a(i2, z2, false);
    }

    public final void a(int i2) {
        this.S = false;
        a(i2, true, false, 1000);
    }

    private void a(int i2, boolean z2, boolean z3, int i3) {
        PagerAdapter pagerAdapter = this.f76529c;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f76530d != i2 || this.z.size() == 0) {
            boolean z4 = true;
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f76529c.getCount()) {
                i2 = this.f76529c.getCount() - 1;
            }
            int i4 = this.T;
            int i5 = this.f76530d;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.z.size(); i6++) {
                    this.z.get(i6).f76549c = true;
                }
            }
            if (this.f76530d == i2) {
                z4 = false;
            }
            if (this.as) {
                this.f76530d = i2;
                if (z4) {
                    List<ViewPager.e> list = this.f76531e;
                    if (list != null && !list.isEmpty()) {
                        for (ViewPager.e eVar : this.f76531e) {
                            eVar.onPageSelected(i2);
                        }
                    }
                    ViewPager.e eVar2 = this.aw;
                    if (eVar2 != null) {
                        eVar2.onPageSelected(i2);
                    }
                }
                requestLayout();
                return;
            }
            c(i2, false);
            a(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        ViewPager.e eVar;
        List<ViewPager.e> list;
        b b2 = b(i2);
        android.ss.com.vboost.a.a(android.ss.com.vboost.d.TT_FEED_SCROLL, com.ss.android.ugc.aweme.feed.v.b.a());
        int clientHeight = b2 != null ? (int) (((float) getClientHeight()) * Math.max(this.M, Math.min(b2.f76551e, this.N))) : 0;
        if (z3 && (list = this.f76531e) != null) {
            list.isEmpty();
        }
        if (z2) {
            a(clientHeight, i3);
            if (!cv.f89731a || !m()) {
                b(i2, z3);
            } else {
                Message obtain = Message.obtain(getMainHander(), new o(this, i2, z3));
                if (cv.a() && Build.VERSION.SDK_INT >= 22) {
                    obtain.setAsynchronous(true);
                }
                getMainHander().sendMessageAtFrontOfQueue(obtain);
            }
            if (z3 && (eVar = this.aw) != null) {
                eVar.onPageSelected(i2);
                return;
            }
            return;
        }
        if (z3) {
            List<ViewPager.e> list2 = this.f76531e;
            if (list2 != null && !list2.isEmpty()) {
                for (ViewPager.e eVar2 : this.f76531e) {
                    eVar2.onPageSelected(i2);
                }
            }
            ViewPager.e eVar3 = this.aw;
            if (eVar3 != null) {
                eVar3.onPageSelected(i2);
            }
        }
        b(false);
        scrollTo(0, clientHeight);
        c(clientHeight);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.b
    public final void a(ViewPager.e eVar) {
        if (eVar != null) {
            this.f76531e.add(eVar);
        }
    }

    public final void a(boolean z2, ViewPager.f fVar) {
        int i2 = Build.VERSION.SDK_INT;
        boolean z3 = false;
        int i3 = 1;
        if (this.ay == null) {
            z3 = true;
        }
        this.ay = fVar;
        setChildrenDrawingOrderEnabledCompat(true);
        if (z2) {
            i3 = 2;
        }
        this.aA = i3;
        if (z3) {
            f();
        }
    }

    private void a(b bVar, int i2, b bVar2) {
        b bVar3;
        b bVar4;
        int count = this.f76529c.getCount();
        int clientHeight = getClientHeight();
        float f2 = clientHeight > 0 ? ((float) this.I) / ((float) clientHeight) : 0.0f;
        if (bVar2 != null) {
            int i3 = bVar2.f76548b;
            if (i3 < bVar.f76548b) {
                float f3 = bVar2.f76551e + bVar2.f76550d + f2;
                int i4 = i3 + 1;
                int i5 = 0;
                while (i4 <= bVar.f76548b && i5 < this.z.size()) {
                    b bVar5 = this.z.get(i5);
                    while (true) {
                        bVar4 = bVar5;
                        if (i4 > bVar4.f76548b && i5 < this.z.size() - 1) {
                            i5++;
                            bVar5 = this.z.get(i5);
                        }
                    }
                    while (i4 < bVar4.f76548b) {
                        f3 += this.f76529c.getPageWidth(i4) + f2;
                        i4++;
                    }
                    bVar4.f76551e = f3;
                    f3 += bVar4.f76550d + f2;
                    i4++;
                }
            } else if (i3 > bVar.f76548b) {
                int size = this.z.size() - 1;
                float f4 = bVar2.f76551e;
                int i6 = i3 - 1;
                while (i6 >= bVar.f76548b && size >= 0) {
                    b bVar6 = this.z.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i6 < bVar3.f76548b && size > 0) {
                            size--;
                            bVar6 = this.z.get(size);
                        }
                    }
                    while (i6 > bVar3.f76548b) {
                        f4 -= this.f76529c.getPageWidth(i6) + f2;
                        i6--;
                    }
                    f4 -= bVar3.f76550d + f2;
                    bVar3.f76551e = f4;
                    i6--;
                }
            }
        }
        int size2 = this.z.size();
        float f5 = bVar.f76551e;
        int i7 = bVar.f76548b - 1;
        this.M = bVar.f76548b == 0 ? bVar.f76551e : -3.4028235E38f;
        int i8 = count - 1;
        this.N = bVar.f76548b == i8 ? (bVar.f76551e + bVar.f76550d) - 1.0f : Float.MAX_VALUE;
        int i9 = i2 - 1;
        while (i9 >= 0) {
            b bVar7 = this.z.get(i9);
            while (i7 > bVar7.f76548b) {
                f5 -= this.f76529c.getPageWidth(i7) + f2;
                i7--;
            }
            f5 -= bVar7.f76550d + f2;
            bVar7.f76551e = f5;
            if (bVar7.f76548b == 0) {
                this.M = f5;
            }
            i9--;
            i7--;
        }
        float f6 = bVar.f76551e + bVar.f76550d + f2;
        int i10 = bVar.f76548b + 1;
        int i11 = i2 + 1;
        while (i11 < size2) {
            b bVar8 = this.z.get(i11);
            while (i10 < bVar8.f76548b) {
                f6 += this.f76529c.getPageWidth(i10) + f2;
                i10++;
            }
            if (bVar8.f76548b == i8) {
                this.N = (bVar8.f76550d + f6) - 1.0f;
            }
            bVar8.f76551e = f6;
            f6 += bVar8.f76550d + f2;
            i11++;
            i10++;
        }
        this.at = false;
    }

    public final void a(int i2, int i3, int i4) {
        f fVar;
        if (i2 > i3 && (fVar = this.aH) != null) {
            fVar.a();
        }
        a(i2, true, true, i4);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.e
    public final void a(float f2) {
        if (!this.ao) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f76529c != null) {
            try {
                this.ad += f2;
                float scrollY = ((float) getScrollY()) - f2;
                float clientHeight = (float) getClientHeight();
                float f3 = this.M * clientHeight;
                float f4 = this.N * clientHeight;
                b bVar = this.z.get(0);
                ArrayList<b> arrayList = this.z;
                b bVar2 = arrayList.get(arrayList.size() - 1);
                if (bVar.f76548b != 0) {
                    f3 = bVar.f76551e * clientHeight;
                }
                if (bVar2.f76548b != this.f76529c.getCount() - 1) {
                    f4 = bVar2.f76551e * clientHeight;
                }
                if (scrollY < f3) {
                    scrollY = f3;
                } else if (scrollY > f4) {
                    scrollY = f4;
                }
                int i2 = (int) scrollY;
                this.ad += scrollY - ((float) i2);
                scrollTo(getScrollX(), i2);
                c(i2);
                MotionEvent obtain = MotionEvent.obtain(this.ap, SystemClock.uptimeMillis(), 2, 0.0f, this.ad, 0);
                if (this.aj == null) {
                    this.aj = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.aj;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(obtain);
                    obtain.recycle();
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                com.bytedance.c.a.a.a.b.a(e2, "VerticalViewPager");
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ai) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.ad = motionEvent.getY(i2);
            this.ai = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.aj;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean a(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        int i6;
        if ((view instanceof f) || c(i3, i4)) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if ((!co.f89708a || childAt.getVisibility() == 0) && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && (i6 = i3 + scrollX) >= childAt.getLeft() && i6 < childAt.getRight() && a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
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
        public boolean f76552a;

        /* renamed from: b  reason: collision with root package name */
        public int f76553b;

        /* renamed from: c  reason: collision with root package name */
        float f76554c;

        /* renamed from: d  reason: collision with root package name */
        boolean f76555d;

        /* renamed from: e  reason: collision with root package name */
        int f76556e;

        /* renamed from: f  reason: collision with root package name */
        int f76557f;

        static {
            Covode.recordClassIndex(47261);
        }

        public c() {
            super(-1, -1);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f76527a);
            this.f76553b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    class g extends DataSetObserver {
        static {
            Covode.recordClassIndex(47265);
        }

        public final void onInvalidated() {
            VerticalViewPager.this.e();
        }

        public final void onChanged() {
            d.a("PagerObserver onChanged");
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
        c(this.f76530d, false);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        this.f76534h = 0;
        f();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.as = true;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static boolean m() {
        if (!cv.f89733c) {
            return true;
        }
        return com.ss.android.ugc.aweme.db.a.b();
    }

    private void p() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private void r() {
        this.U = false;
        this.V = false;
        VelocityTracker velocityTracker = this.aj;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.aj = null;
        }
    }

    private boolean s() {
        int i2 = this.f76530d;
        if (i2 <= 0) {
            return false;
        }
        a(i2 - 1, true);
        return true;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = androidx.core.d.e.a(new androidx.core.d.f<SavedState>() {
            /* class com.ss.android.ugc.aweme.common.widget.VerticalViewPager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(47258);
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
        int f76544a;

        /* renamed from: b  reason: collision with root package name */
        Parcelable f76545b;

        /* renamed from: c  reason: collision with root package name */
        ClassLoader f76546c;

        static {
            Covode.recordClassIndex(47257);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f76544a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f76544a);
            parcel.writeParcelable(this.f76545b, i2);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f76544a = parcel.readInt();
            this.f76545b = parcel.readParcelable(classLoader);
            this.f76546c = classLoader;
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends androidx.core.h.a {
        static {
            Covode.recordClassIndex(47262);
        }

        private boolean a() {
            if (VerticalViewPager.this.f76529c == null || VerticalViewPager.this.f76529c.getCount() <= 1) {
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
            if (accessibilityEvent.getEventType() == 4096 && VerticalViewPager.this.f76529c != null) {
                a2.a(VerticalViewPager.this.f76529c.getCount());
                a2.b(VerticalViewPager.this.f76530d);
                a2.c(VerticalViewPager.this.f76530d);
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
                verticalViewPager.setCurrentItem(verticalViewPager.f76530d - 1);
                return true;
            } else if (!VerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
                verticalViewPager2.setCurrentItem(verticalViewPager2.f76530d + 1);
                return true;
            }
        }
    }

    private Handler getMainHander() {
        if (this.f76535i == null) {
            this.f76535i = new Handler(Looper.getMainLooper());
        }
        return this.f76535i;
    }

    private boolean o() {
        this.ai = -1;
        r();
        return this.aq.a() | this.ar.a();
    }

    private boolean t() {
        PagerAdapter pagerAdapter = this.f76529c;
        if (pagerAdapter == null || this.f76530d >= pagerAdapter.getCount() - 1) {
            return false;
        }
        a(this.f76530d + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.J;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String g() {
        return "VerticalViewPager draw start for overScrollMode mBottomEdge:" + this.o;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String h() {
        return "VerticalViewPager draw start for overScrollMode mTopEdge:" + this.o;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String i() {
        return "VerticalViewPager draw start for overScrollMode:" + this.n;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String j() {
        return "VerticalViewPager scrollTo:" + this.f76538l + "/" + this.f76537k;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f76544a = this.f76530d;
        PagerAdapter pagerAdapter = this.f76529c;
        if (pagerAdapter != null) {
            savedState.f76545b = pagerAdapter.saveState();
        }
        return savedState;
    }

    static {
        Covode.recordClassIndex(47251);
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            v = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    private void n() {
        if (this.aA != 0) {
            ArrayList<View> arrayList = this.aB;
            if (arrayList == null) {
                this.aB = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.aB.add(getChildAt(i2));
            }
            Collections.sort(this.aB, aC);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.aF);
        removeCallbacks(this.f76536j);
        Handler handler = this.f76535i;
        if (handler != null) {
            handler.removeCallbacks(this.f76536j);
        }
        this.f76534h = 0;
        Scroller scroller = this.F;
        if (scroller != null && !scroller.isFinished()) {
            this.F.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    private b q() {
        float f2;
        float f3;
        int i2;
        int clientHeight = getClientHeight();
        float f4 = 0.0f;
        if (clientHeight > 0) {
            f2 = ((float) getScrollY()) / ((float) clientHeight);
            f3 = ((float) this.I) / ((float) clientHeight);
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        b bVar = null;
        float f5 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.z.size()) {
            b bVar2 = this.z.get(i4);
            if (!z2 && bVar2.f76548b != (i2 = i3 + 1)) {
                bVar2 = this.A;
                bVar2.f76551e = f4 + f5 + f3;
                bVar2.f76548b = i2;
                bVar2.f76550d = this.f76529c.getPageWidth(bVar2.f76548b);
                i4--;
            }
            f4 = bVar2.f76551e;
            float f6 = bVar2.f76550d + f4 + f3;
            if (!z2 && f2 < f4) {
                return bVar;
            }
            if (f2 < f6 || i4 == this.z.size() - 1) {
                return bVar2;
            }
            i3 = bVar2.f76548b;
            f5 = bVar2.f76550d;
            i4++;
            bVar = bVar2;
            z2 = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.G = true;
        if (this.F.isFinished() || !this.F.computeScrollOffset()) {
            b(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.F.getCurrX();
        int currY = this.F.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!c(currY)) {
                this.F.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        v.c(this);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.e
    public final void d() {
        if (this.ao) {
            this.ao = false;
            if (this.f76529c != null) {
                VelocityTracker velocityTracker = this.aj;
                velocityTracker.computeCurrentVelocity(1000, (float) this.al);
                int yVelocity = (int) velocityTracker.getYVelocity(this.ai);
                this.S = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                b q2 = q();
                if (q2 != null) {
                    a(a(q2.f76548b, ((((float) scrollY) / ((float) clientHeight)) - q2.f76551e) / q2.f76550d, yVelocity, (int) (this.ad - this.af)), true, true, yVelocity);
                }
            }
            r();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    private void l() {
        this.f76533g = cw.f89734a;
        if (dg.f89785a) {
            this.aE = df.a();
        }
        this.w = true;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.F = new Scroller(context, f76528b);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.ab = viewConfiguration.getScaledPagingTouchSlop();
        this.ak = (int) (400.0f * f2);
        this.al = viewConfiguration.getScaledMaximumFlingVelocity();
        this.aq = new androidx.core.widget.d(context);
        this.ar = new androidx.core.widget.d(context);
        this.am = (int) (25.0f * f2);
        this.an = (int) (2.0f * f2);
        this.W = (int) (f2 * 16.0f);
        v.a(this, new d());
        if (v.d(this) == 0) {
            v.a((View) this, 1);
        }
        v.a(this, new r() {
            /* class com.ss.android.ugc.aweme.common.widget.VerticalViewPager.AnonymousClass5 */

            /* renamed from: b  reason: collision with root package name */
            private final Rect f76543b = new Rect();

            static {
                Covode.recordClassIndex(47256);
            }

            @Override // androidx.core.h.r
            public final ad a(View view, ad adVar) {
                ad a2 = v.a(view, adVar);
                if (a2.f2507b.b()) {
                    return a2;
                }
                Rect rect = this.f76543b;
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

    /* access modifiers changed from: package-private */
    public final void e() {
        boolean z2;
        int count = this.f76529c.getCount();
        this.x = count;
        if (this.z.size() >= (this.T * 2) + 1 || this.z.size() >= count) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i2 = this.f76530d;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.z.size()) {
            b bVar = this.z.get(i3);
            int itemPosition = this.f76529c.getItemPosition(bVar.f76547a);
            d.a("dataSetChanged newPos = " + itemPosition + " mItems.size() = " + this.z.size());
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.z.remove(i3);
                    i3--;
                    if (!z3) {
                        this.f76529c.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f76529c.destroyItem((ViewGroup) this, bVar.f76548b, bVar.f76547a);
                    if (this.f76530d == bVar.f76548b) {
                        i2 = Math.max(0, Math.min(this.f76530d, count - 1));
                    }
                } else if (bVar.f76548b != itemPosition) {
                    if (bVar.f76548b == this.f76530d) {
                        i2 = itemPosition;
                    }
                    bVar.f76548b = itemPosition;
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.f76529c.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.z, y);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                if (!cVar.f76552a) {
                    cVar.f76554c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.e
    public final boolean c() {
        if (this.U) {
            return false;
        }
        this.ao = true;
        setScrollState(1);
        this.af = 0.0f;
        this.ad = 0.0f;
        VelocityTracker velocityTracker = this.aj;
        if (velocityTracker == null) {
            this.aj = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.aj.addMovement(obtain);
        obtain.recycle();
        this.ap = uptimeMillis;
        return true;
    }

    public void setCanTouch(boolean z2) {
        this.w = z2;
    }

    public void setDisableScroll(boolean z2) {
        this.aI = z2;
    }

    public void setEndScrollDelayTime(int i2) {
        this.f76532f = i2;
    }

    public void setMaxSettleDuration(int i2) {
        this.aD = i2;
    }

    public void setOnAdapterChangeListener(e eVar) {
        this.ax = eVar;
    }

    public void setOnUserSwipeUpListener(f fVar) {
        this.aH = fVar;
    }

    public void setScroller(Scroller scroller) {
        this.F = scroller;
    }

    public void setmCurItem(int i2) {
        this.f76530d = i2;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.R != z2) {
            this.R = z2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i2) {
        this.S = false;
        a(i2, true, true, 1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof c) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.w || !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.Q) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i2) {
        this.S = false;
        a(i2, !this.as, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 <= 0) {
            i2 = 1;
        }
        if (i2 != this.T) {
            this.T = i2;
            f();
        }
    }

    public void setPageMargin(int i2) {
        int i3 = this.I;
        this.I = i2;
        int height = getHeight();
        a(height, height, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i2));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.J) {
            return true;
        }
        return false;
    }

    private boolean a(boolean z2) {
        if (!this.f76533g) {
            return false;
        }
        if (z2) {
            return true;
        }
        int i2 = this.f76534h;
        if (i2 <= 0) {
            return false;
        }
        this.f76534h = i2 - 1;
        return true;
    }

    private static float b(float f2) {
        double d2 = (double) (f2 - 0.5f);
        Double.isNaN(d2);
        return (float) Math.sin((double) ((float) (d2 * 0.4712389167638204d)));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z2;
        this.J = drawable;
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
        for (int i2 = 0; i2 < this.z.size(); i2++) {
            b bVar = this.z.get(i2);
            if (this.f76529c.isViewFromObject(view, bVar.f76547a)) {
                return bVar;
            }
        }
        return null;
    }

    private b b(int i2) {
        for (int i3 = 0; i3 < this.z.size(); i3++) {
            b bVar = this.z.get(i3);
            if (bVar.f76548b == i2) {
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
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f76548b == this.f76530d) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollVertically(int i2) {
        if (this.f76529c == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i2 < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.M))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollY >= ((int) (((float) clientHeight) * this.N))) {
            return false;
        } else {
            return true;
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
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f76548b == this.f76530d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        PagerAdapter pagerAdapter = this.f76529c;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f76545b, savedState.f76546c);
            a(savedState.f76544a, false, true);
            return;
        }
        this.C = savedState.f76544a;
        this.D = savedState.f76545b;
        this.E = savedState.f76546c;
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
            java.lang.reflect.Method r0 = r6.az
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0019
            java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
            java.lang.String r2 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0019 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0019 }
            r1[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0019 }
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0019 }
            r6.az = r0     // Catch:{ NoSuchMethodException -> 0x0019 }
        L_0x0019:
            java.lang.reflect.Method r2 = r6.az     // Catch:{ Exception -> 0x0026 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0026 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0026 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0026 }
            r2.invoke(r6, r1)     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    private boolean c(int i2) {
        if (this.z.size() != 0) {
            b q2 = q();
            int clientHeight = getClientHeight();
            int i3 = this.I;
            int i4 = clientHeight + i3;
            float f2 = (float) i3;
            float f3 = (float) clientHeight;
            int i5 = q2.f76548b;
            float f4 = ((((float) i2) / f3) - q2.f76551e) / (q2.f76550d + (f2 / f3));
            this.au = false;
            a(i5, f4, (int) (((float) i4) * f4));
            if (this.au) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.as) {
            return false;
        } else {
            this.au = false;
            a(0, 0.0f, 0);
            if (this.au) {
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
        if (this.aG != i2) {
            this.aG = i2;
            if (this.ay != null) {
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
            List<ViewPager.e> list = this.f76531e;
            if (!(list == null || list.isEmpty())) {
                for (ViewPager.e eVar : this.f76531e) {
                    eVar.onPageScrollStateChanged(i2);
                }
            }
        }
    }

    public VerticalViewPager(Context context) {
        super(context);
        this.z = new ArrayList<>();
        this.A = new b();
        this.B = new Rect();
        this.C = -1;
        this.D = null;
        this.E = null;
        this.M = -3.4028235E38f;
        this.N = Float.MAX_VALUE;
        this.T = 1;
        this.ai = -1;
        this.as = true;
        this.at = false;
        this.f76531e = new ArrayList();
        this.f76532f = 0;
        this.aD = 600;
        this.f76533g = false;
        this.f76534h = 0;
        this.aE = 100;
        this.f76535i = null;
        this.aF = new Runnable() {
            /* class com.ss.android.ugc.aweme.common.widget.VerticalViewPager.AnonymousClass3 */

            static {
                Covode.recordClassIndex(47254);
            }

            public final void run() {
                VerticalViewPager.this.setScrollState(0);
                if (VerticalViewPager.this.f76532f > 0) {
                    VerticalViewPager verticalViewPager = VerticalViewPager.this;
                    verticalViewPager.postDelayed(verticalViewPager.f76536j, (long) VerticalViewPager.this.f76532f);
                } else if (VerticalViewPager.this.f76533g) {
                    VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
                    verticalViewPager2.f76534h = 1;
                    verticalViewPager2.c(verticalViewPager2.f76530d, true);
                    com.ss.android.ugc.aweme.db.a.a(new Runnable() {
                        /* class com.ss.android.ugc.aweme.common.widget.VerticalViewPager.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(47255);
                        }

                        public final void run() {
                            VerticalViewPager.this.f76534h = 0;
                        }
                    });
                    if (cw.f89735b == 1) {
                        if (!com.ss.android.ugc.aweme.db.a.a(verticalViewPager2.f76536j)) {
                            verticalViewPager2.f76534h = 0;
                            verticalViewPager2.f76536j.run();
                        }
                    } else if (cw.f89735b == 2) {
                        if (verticalViewPager2.f76535i == null) {
                            verticalViewPager2.f76535i = new Handler(Looper.getMainLooper());
                        }
                        verticalViewPager2.f76535i.postAtFrontOfQueue(verticalViewPager2.f76536j);
                    } else {
                        verticalViewPager2.postOnAnimation(verticalViewPager2.f76536j);
                    }
                } else {
                    VerticalViewPager.this.f();
                }
            }
        };
        this.f76536j = new g(this);
        this.aG = 0;
        this.f76537k = -1;
        this.f76538l = -1;
        this.f76539m = new h(this);
        this.p = p.f76572a;
        this.q = q.f76573a;
        this.r = r.f76574a;
        this.s = new s(this);
        this.t = new t(this);
        this.u = new u(this);
        this.aI = false;
        l();
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

    private boolean c(float f2) {
        boolean z2;
        this.ad = f2;
        float scrollY = ((float) getScrollY()) + (this.ad - f2);
        float clientHeight = (float) getClientHeight();
        float f3 = this.M * clientHeight;
        float f4 = this.N * clientHeight;
        boolean z3 = false;
        if (this.z.size() <= 0) {
            return false;
        }
        b bVar = this.z.get(0);
        ArrayList<b> arrayList = this.z;
        boolean z4 = true;
        b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f76548b != 0) {
            f3 = bVar.f76551e * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (bVar2.f76548b != this.f76529c.getCount() - 1) {
            f4 = bVar2.f76551e * clientHeight;
            z4 = false;
        }
        if (scrollY < f3) {
            if (z2) {
                z3 = this.aq.a(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z4) {
                z3 = this.ar.a(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i2 = (int) scrollY;
        this.ac += scrollY - ((float) i2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.d(int):boolean");
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            com.bytedance.c.a.a.a.b.a(e2, "VerticalViewPager");
        }
        int overScrollMode = getOverScrollMode();
        this.n = overScrollMode;
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f76529c) != null && pagerAdapter.getCount() > 1)) {
            if (!this.aq.f2636a.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.M * ((float) height));
                this.aq.a(width, height);
                z2 = false | this.aq.a(canvas);
                canvas.restoreToCount(save);
                this.o = z2;
            }
            if (!this.ar.f2636a.isFinished()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.N + 1.0f)) * ((float) height2));
                this.ar.a(width2, height2);
                z2 |= this.ar.a(canvas);
                canvas.restoreToCount(save2);
                this.o = z2;
            }
            if (z2) {
                v.c(this);
                return;
            }
            return;
        }
        this.aq.f2636a.finish();
        this.ar.f2636a.finish();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        super.onDraw(canvas);
        if (this.I > 0 && this.J != null && this.z.size() > 0 && this.f76529c != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f3 = (float) height;
            float f4 = ((float) this.I) / f3;
            int i2 = 0;
            b bVar = this.z.get(0);
            float f5 = bVar.f76551e;
            int size = this.z.size();
            int i3 = this.z.get(size - 1).f76548b;
            for (int i4 = bVar.f76548b; i4 < i3; i4++) {
                while (i4 > bVar.f76548b && i2 < size) {
                    i2++;
                    bVar = this.z.get(i2);
                }
                if (i4 == bVar.f76548b) {
                    f2 = (bVar.f76551e + bVar.f76550d) * f3;
                    f5 = bVar.f76551e + bVar.f76550d + f4;
                } else {
                    float pageWidth = this.f76529c.getPageWidth(i4);
                    f2 = (f5 + pageWidth) * f3;
                    f5 += pageWidth + f4;
                }
                int i5 = this.I;
                if (((float) i5) + f2 > ((float) scrollY)) {
                    this.J.setBounds(this.K, (int) f2, this.L, (int) (((float) i5) + f2 + 0.5f));
                    this.J.draw(canvas);
                }
                if (f2 > ((float) (scrollY + height))) {
                    return;
                }
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f76529c;
        if (pagerAdapter2 != null) {
            a(pagerAdapter2, (g) null);
            this.f76529c.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.z.size(); i2++) {
                b bVar = this.z.get(i2);
                this.f76529c.destroyItem((ViewGroup) this, bVar.f76548b, bVar.f76547a);
            }
            this.f76529c.finishUpdate((ViewGroup) this);
            this.z.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((c) getChildAt(i3).getLayoutParams()).f76552a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f76530d = 0;
            scrollTo(0, 0);
        }
        this.f76529c = pagerAdapter;
        this.x = 0;
        if (pagerAdapter != null) {
            if (this.H == null) {
                this.H = new g(this, (byte) 0);
            }
            a(this.f76529c, this.H);
            this.S = false;
            boolean z2 = this.as;
            this.as = true;
            this.x = this.f76529c.getCount();
            if (this.C >= 0) {
                this.f76529c.restoreState(this.D, this.E);
                a(this.C, false, true);
                this.C = -1;
                this.D = null;
                this.E = null;
            } else if (!z2) {
                f();
            } else {
                requestLayout();
            }
        }
    }

    private void b(boolean z2) {
        boolean z3;
        if (this.aG == 2) {
            z3 = true;
            setScrollingCacheEnabled(false);
            if (!this.F.isFinished()) {
                this.F.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.F.getCurrX();
                int currY = this.F.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        c(currY);
                    }
                }
            } else if (this.F.getCurrY() != getScrollY()) {
                try {
                    com.ss.android.ugc.aweme.framework.a.a.b(5, "VerticalViewPager", "try fix->".concat(String.valueOf("realY:" + getScrollY() + ",expectY:" + this.F.getCurrY())));
                } catch (Exception e2) {
                    com.bytedance.c.a.a.a.b.a(e2);
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                }
                scrollTo(this.F.getCurrX(), this.F.getCurrY());
            }
        } else {
            z3 = false;
        }
        this.S = false;
        for (int i2 = 0; i2 < this.z.size(); i2++) {
            b bVar = this.z.get(i2);
            if (bVar.f76549c) {
                bVar.f76549c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            v.a(this, this.aF);
        } else {
            this.aF.run();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00db, code lost:
        if (r9 >= ((float) com.ss.android.ugc.aweme.feed.x.z.f95373c[1])) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e8 A[Catch:{ IllegalArgumentException -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0106 A[Catch:{ IllegalArgumentException -> 0x019c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r23) {
        /*
        // Method dump skipped, instructions count: 419
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Exception e2;
        PagerAdapter pagerAdapter;
        boolean z2;
        f fVar;
        int i2;
        int i3;
        float f2;
        if (this.aI) {
            return false;
        }
        try {
            if (this.ao) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (pagerAdapter = this.f76529c) != null) {
                if (pagerAdapter.getCount() != 0) {
                    if (this.aj == null) {
                        this.aj = VelocityTracker.obtain();
                    }
                    this.aj.addMovement(motionEvent);
                    int action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                f fVar2 = this.aH;
                                if (fVar2 != null && fVar2.a(true)) {
                                    return false;
                                }
                                if (!this.U) {
                                    int findPointerIndex = motionEvent.findPointerIndex(this.ai);
                                    if (findPointerIndex == -1) {
                                        z2 = o();
                                    } else {
                                        float y2 = motionEvent.getY(findPointerIndex);
                                        float abs = Math.abs(y2 - this.ad);
                                        float x2 = motionEvent.getX(findPointerIndex);
                                        float abs2 = Math.abs(x2 - this.ac);
                                        if (abs > ((float) this.ab) && abs > abs2) {
                                            this.U = true;
                                            p();
                                            float f3 = this.af;
                                            if (y2 - f3 > 0.0f) {
                                                f2 = f3 + ((float) this.ab);
                                            } else {
                                                f2 = f3 - ((float) this.ab);
                                            }
                                            this.ad = f2;
                                            this.ac = x2;
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            ViewParent parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.U) {
                                    z2 = false | c(motionEvent.getY(motionEvent.findPointerIndex(this.ai)));
                                }
                            } else if (action != 3) {
                                if (action == 5) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    this.ad = motionEvent.getY(actionIndex);
                                    this.ai = motionEvent.getPointerId(actionIndex);
                                } else if (action == 6) {
                                    a(motionEvent);
                                    this.ad = motionEvent.getY(motionEvent.findPointerIndex(this.ai));
                                }
                            } else if (this.U) {
                                a(this.f76530d, true, 0, false);
                                z2 = o();
                            }
                        } else if (this.U) {
                            VelocityTracker velocityTracker = this.aj;
                            velocityTracker.computeCurrentVelocity(1000, (float) this.al);
                            int yVelocity = (int) velocityTracker.getYVelocity(this.ai);
                            this.S = true;
                            int clientHeight = getClientHeight();
                            int scrollY = getScrollY();
                            b q2 = q();
                            if (q2 != null) {
                                float f4 = (float) clientHeight;
                                int i4 = q2.f76548b;
                                int a2 = a(i4, ((((float) scrollY) / f4) - q2.f76551e) / (q2.f76550d + (((float) this.I) / f4)), yVelocity, (int) (motionEvent.getY(motionEvent.findPointerIndex(this.ai)) - this.af));
                                if (k.c() && a2 != (i3 = this.f76530d)) {
                                    a2 = this.aH.a(a2, i3, i4, yVelocity);
                                }
                                f fVar3 = this.aH;
                                if (!(fVar3 == null || !fVar3.b() || a2 == (i2 = this.f76530d))) {
                                    a2 = this.aH.a(a2, i2, yVelocity);
                                }
                                f fVar4 = this.aH;
                                if (fVar4 != null && fVar4.a(false)) {
                                    a2 = i4;
                                }
                                if (a2 > i4 && (fVar = this.aH) != null) {
                                    fVar.a();
                                }
                                a(a2, true, true, yVelocity);
                            }
                            z2 = o();
                        }
                        if (z2) {
                            v.c(this);
                        }
                    } else {
                        this.F.abortAnimation();
                        this.S = false;
                        f();
                        this.ac = motionEvent.getX();
                        this.ae = motionEvent.getX();
                        this.ad = motionEvent.getY();
                        this.af = motionEvent.getY();
                        this.ai = motionEvent.getPointerId(0);
                    }
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e3) {
            e2 = e3;
            com.bytedance.c.a.a.a.b.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            return true;
        } catch (IllegalStateException e4) {
            e2 = e4;
            if (this.f76529c.getCount() != this.x) {
                this.f76529c.notifyDataSetChanged();
            }
            com.bytedance.c.a.a.a.b.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            return true;
        }
    }

    public void scrollTo(int i2, int i3) {
        super.scrollTo(i2, i3);
        this.f76537k = i3;
        this.f76538l = i2;
    }

    private static void a(PagerAdapter pagerAdapter, g gVar) {
        try {
            Field field = v;
            if (field != null) {
                field.set(pagerAdapter, gVar);
            }
        } catch (IllegalAccessException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.aA == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((c) this.aB.get(i3).getLayoutParams()).f76557f;
    }

    private boolean c(int i2, int i3) {
        if (!gg.f90139a) {
            return false;
        }
        float abs = Math.abs(((float) i2) - this.ae);
        float abs2 = Math.abs(((float) i3) - this.af);
        if (abs2 <= ((float) this.ab) || abs2 <= abs) {
            return true;
        }
        return false;
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
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f76548b == this.f76530d && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    private b b(int i2, int i3) {
        b bVar = new b();
        bVar.f76548b = i2;
        bVar.f76547a = this.f76529c.instantiateItem((ViewGroup) this, i2);
        bVar.f76550d = this.f76529c.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.z.size()) {
            this.z.add(bVar);
        } else {
            this.z.add(i3, bVar);
        }
        return bVar;
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

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = new ArrayList<>();
        this.A = new b();
        this.B = new Rect();
        this.C = -1;
        this.D = null;
        this.E = null;
        this.M = -3.4028235E38f;
        this.N = Float.MAX_VALUE;
        this.T = 1;
        this.ai = -1;
        this.as = true;
        this.at = false;
        this.f76531e = new ArrayList();
        this.f76532f = 0;
        this.aD = 600;
        this.f76533g = false;
        this.f76534h = 0;
        this.aE = 100;
        this.f76535i = null;
        this.aF = new Runnable() {
            /* class com.ss.android.ugc.aweme.common.widget.VerticalViewPager.AnonymousClass3 */

            static {
                Covode.recordClassIndex(47254);
            }

            public final void run() {
                VerticalViewPager.this.setScrollState(0);
                if (VerticalViewPager.this.f76532f > 0) {
                    VerticalViewPager verticalViewPager = VerticalViewPager.this;
                    verticalViewPager.postDelayed(verticalViewPager.f76536j, (long) VerticalViewPager.this.f76532f);
                } else if (VerticalViewPager.this.f76533g) {
                    VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
                    verticalViewPager2.f76534h = 1;
                    verticalViewPager2.c(verticalViewPager2.f76530d, true);
                    com.ss.android.ugc.aweme.db.a.a(new Runnable() {
                        /* class com.ss.android.ugc.aweme.common.widget.VerticalViewPager.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(47255);
                        }

                        public final void run() {
                            VerticalViewPager.this.f76534h = 0;
                        }
                    });
                    if (cw.f89735b == 1) {
                        if (!com.ss.android.ugc.aweme.db.a.a(verticalViewPager2.f76536j)) {
                            verticalViewPager2.f76534h = 0;
                            verticalViewPager2.f76536j.run();
                        }
                    } else if (cw.f89735b == 2) {
                        if (verticalViewPager2.f76535i == null) {
                            verticalViewPager2.f76535i = new Handler(Looper.getMainLooper());
                        }
                        verticalViewPager2.f76535i.postAtFrontOfQueue(verticalViewPager2.f76536j);
                    } else {
                        verticalViewPager2.postOnAnimation(verticalViewPager2.f76536j);
                    }
                } else {
                    VerticalViewPager.this.f();
                }
            }
        };
        this.f76536j = new v(this);
        this.aG = 0;
        this.f76537k = -1;
        this.f76538l = -1;
        this.f76539m = new w(this);
        this.p = i.f76563a;
        this.q = j.f76564a;
        this.r = k.f76565a;
        this.s = new l(this);
        this.t = new m(this);
        this.u = new n(this);
        this.aI = false;
        l();
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.onMeasure(int, int):void");
    }

    private void a(int i2, int i3) {
        int scrollY;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.F;
        if (scroller == null || scroller.isFinished()) {
            scrollY = getScrollY();
        } else {
            if (this.G) {
                scrollY = this.F.getCurrY();
            } else {
                scrollY = this.F.getStartY();
            }
            this.F.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollX = getScrollX();
        int i4 = 0 - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            b(false);
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
            abs = (int) (((((float) Math.abs(i4)) / ((f2 * this.f76529c.getPageWidth(this.f76530d)) + ((float) this.I))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, this.aD);
        int i7 = this.aE;
        if (i7 != 100) {
            double d2 = (double) min;
            double d3 = (double) i7;
            Double.isNaN(d3);
            Double.isNaN(d2);
            min = (int) (d2 * (d3 / 100.0d));
        }
        this.G = false;
        this.F.startScroll(scrollX, scrollY, i4, i5, min);
        v.c(this);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, boolean z2) {
        List<ViewPager.e> list;
        if (!(!z2 || (list = this.f76531e) == null || list.isEmpty())) {
            for (ViewPager.e eVar : this.f76531e) {
                eVar.onPageSelected(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a6, code lost:
        if ((r4.f76547a instanceof android.widget.FrameLayout) == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b0, code lost:
        if (((android.widget.FrameLayout) r4.f76547a).isLayoutRequested() == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b2, code lost:
        requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r4.f76548b == r17.f76530d) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r12 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r12 < 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        r13 = r17.z.get(r12);
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
        r1 = r17.f76530d - 1;
        r15 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (r1 < 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r15 < r2) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r1 >= r7) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r13 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r1 != r13.f76548b) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r13.f76549c != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        r17.z.remove(r12);
        r17.f76529c.destroyItem((android.view.ViewGroup) r17, r1, r13.f76547a);
        r12 = r12 - 1;
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r13 = r17.z.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r13 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        if (r1 != r13.f76548b) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r15 = r15 + r13.f76550d;
        r12 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r13 = r17.z.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cd, code lost:
        r15 = r15 + b(r1, r12 + 1).f76550d;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        r13 = r17.z.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        r2 = (2.0f - r4.f76550d) + (((float) getPaddingLeft()) / ((float) r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        if (r4 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0105, code lost:
        r7 = r4.f76550d;
        r2 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010f, code lost:
        if (a(r19) != false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r7 >= 2.0f) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011b, code lost:
        if (r2 >= r17.z.size()) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011d, code lost:
        r13 = r17.z.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0125, code lost:
        if (r11 > 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0127, code lost:
        r1 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0128, code lost:
        r11 = r17.f76530d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012a, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012c, code lost:
        if (r11 >= r6) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0130, code lost:
        if (r7 < r1) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0132, code lost:
        if (r11 <= r9) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0134, code lost:
        if (r13 == null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0138, code lost:
        if (r11 != r13.f76548b) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013c, code lost:
        if (r13.f76549c != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013e, code lost:
        r17.z.remove(r2);
        r17.f76529c.destroyItem((android.view.ViewGroup) r17, r11, r13.f76547a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0150, code lost:
        if (r2 >= r17.z.size()) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0152, code lost:
        r13 = r17.z.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015b, code lost:
        if (r13 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015f, code lost:
        if (r11 != r13.f76548b) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0161, code lost:
        r7 = r7 + r13.f76550d;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016c, code lost:
        if (r2 >= r17.z.size()) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016e, code lost:
        r13 = r17.z.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0177, code lost:
        r0 = b(r11, r2);
        r2 = r2 + 1;
        r7 = r7 + r0.f76550d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0186, code lost:
        if (r2 >= r17.z.size()) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0188, code lost:
        r13 = r17.z.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0191, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0193, code lost:
        r1 = (((float) getPaddingRight()) / ((float) r11)) + 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019d, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x019f, code lost:
        a(r4, r8, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 656
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.c(int, boolean):void");
    }

    private void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c cVar = (c) layoutParams;
        cVar.f76552a |= view instanceof a;
        if (!this.Q) {
            super.addView(view, i2, layoutParams);
        } else if (!cVar.f76552a) {
            cVar.f76555d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
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
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f76548b == this.f76530d) {
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
        if (this.av > 0) {
            int scrollY = getScrollY();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f76552a) {
                    int i7 = cVar.f76553b & 112;
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
        List<ViewPager.e> list = this.f76531e;
        if (list != null && !list.isEmpty()) {
            for (ViewPager.e eVar : this.f76531e) {
                eVar.onPageScrolled(i2, f2, i3);
            }
        }
        ViewPager.e eVar2 = this.aw;
        if (eVar2 != null) {
            eVar2.onPageScrolled(i2, f2, i3);
        }
        if (this.ay != null) {
            int scrollY2 = getScrollY();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((c) childAt2.getLayoutParams()).f76552a) {
                    this.ay.a(childAt2, ((float) (childAt2.getTop() - scrollY2)) / ((float) getClientHeight()));
                }
            }
        }
        this.au = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i3 != i5) {
            int i6 = this.I;
            a(i3, i5, i6, i6);
        }
    }

    private int a(int i2, float f2, int i3, int i4) {
        float f3;
        if (Math.abs(i4) <= this.am || Math.abs(i3) <= this.ak) {
            if (i2 >= this.f76530d) {
                f3 = 0.6f;
            } else {
                f3 = 0.4f;
            }
            i2 = (int) (((float) i2) + f2 + f3);
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.z.size() <= 0) {
            return i2;
        }
        ArrayList<b> arrayList = this.z;
        return Math.max(this.z.get(0).f76548b, Math.min(i2, arrayList.get(arrayList.size() - 1).f76548b));
    }

    private void a(int i2, int i3, int i4, int i5) {
        float f2;
        b b2;
        if (i3 <= 0 || this.z.isEmpty()) {
            b b3 = b(this.f76530d);
            if (b3 != null) {
                f2 = Math.min(b3.f76551e, this.N);
            } else {
                f2 = 0.0f;
            }
            int paddingTop = (int) (f2 * ((float) ((i2 - getPaddingTop()) - getPaddingBottom())));
            if (paddingTop != getScrollY()) {
                b(false);
                scrollTo(getScrollX(), paddingTop);
            }
        } else if (!this.F.isFinished()) {
            int clientHeight = getClientHeight();
            if (x.a()) {
                int finalY = this.F.getFinalY() / i3;
                int i6 = finalY * clientHeight;
                b b4 = b(this.f76530d);
                if (b4 != null) {
                    int i7 = (int) (b4.f76551e * ((float) clientHeight));
                    com.ss.android.ugc.aweme.framework.a.a.b(4, "VerticalViewPager_YCH", "use itemInfo to calculate final y after = " + i7 + " before= " + i6);
                    i6 = i7;
                }
                com.ss.android.ugc.aweme.framework.a.a.b(4, "VerticalViewPager_YCH", "getCurItem = " + getCurrentItem() + "current scroll y = " + getScrollY() + "finalY = " + (getClientHeight() * getCurrentItem()) + "trueCount = " + finalY + "newY = " + i6);
                this.F.setFinalY(i6);
                return;
            }
            com.ss.android.ugc.aweme.framework.a.a.b(4, "VerticalViewPager", "use origin logic");
            this.F.setFinalY(getCurrentItem() * clientHeight);
        } else {
            int scrollY = (int) ((((float) getScrollY()) / ((float) (((i3 - getPaddingTop()) - getPaddingBottom()) + i5))) * ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4)));
            if (this.aG == 0 && (b2 = b(this.f76530d)) != null) {
                scrollY = (int) (b2.f76551e * ((float) getClientHeight()));
            }
            scrollTo(getScrollX(), scrollY);
        }
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
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f76552a) {
                    int i14 = cVar.f76553b & 7;
                    int i15 = cVar.f76553b & 112;
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
                b a2 = a(childAt2);
                if (!cVar2.f76552a && a2 != null) {
                    float f2 = (float) i17;
                    int i19 = ((int) (a2.f76551e * f2)) + paddingTop;
                    if (cVar2.f76555d) {
                        cVar2.f76555d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((i10 - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f2 * cVar2.f76554c), 1073741824));
                    }
                    childAt2.layout(paddingLeft, i19, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i19);
                }
            }
        }
        this.K = paddingLeft;
        this.L = i10 - paddingRight;
        this.av = i12;
        if (this.as) {
            z3 = false;
            a(this.f76530d, false, 0, false);
        } else {
            z3 = false;
        }
        this.as = z3;
    }
}
