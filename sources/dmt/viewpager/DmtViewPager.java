package dmt.viewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.h.ad;
import androidx.core.h.r;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DmtViewPager extends ViewGroup {
    private static final h ak = new h();

    /* renamed from: d  reason: collision with root package name */
    private static final Comparator<b> f157012d = new Comparator<b>() {
        /* class dmt.viewpager.DmtViewPager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(104275);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
            return bVar.f157032b - bVar2.f157032b;
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static final Interpolator f157013e = new Interpolator() {
        /* class dmt.viewpager.DmtViewPager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(104276);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: g  reason: collision with root package name */
    static final int[] f157014g = {16842931};
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E = 1;
    private boolean F;
    private boolean G;
    private int H;
    private int I;
    private int J;
    private float K;
    private float L;
    private float M;
    private float N;
    private int O = -1;
    private VelocityTracker P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private EdgeEffect U;
    private EdgeEffect V;
    private boolean W = true;

    /* renamed from: a  reason: collision with root package name */
    private boolean f157015a = true;
    private boolean aa = false;
    private boolean ab;
    private int ac;
    private List<ViewPager.e> ad;
    private ViewPager.e ae;
    private ViewPager.e af;
    private f ag;
    private int ah;
    private int ai;
    private ArrayList<View> aj;
    private final Runnable al = new Runnable() {
        /* class dmt.viewpager.DmtViewPager.AnonymousClass3 */

        static {
            Covode.recordClassIndex(104277);
        }

        public final void run() {
            DmtViewPager.this.setScrollState(0);
            DmtViewPager.this.d();
        }
    };
    private int am = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f157016b = true;

    /* renamed from: c  reason: collision with root package name */
    private int f157017c;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<b> f157018f = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    PagerAdapter f157019h;

    /* renamed from: i  reason: collision with root package name */
    int f157020i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f157021j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f157022k;

    /* renamed from: l  reason: collision with root package name */
    public List<e> f157023l;

    /* renamed from: m  reason: collision with root package name */
    private final b f157024m = new b();
    private final Rect n = new Rect();
    private int o = -1;
    private Parcelable p = null;
    private ClassLoader q = null;
    private Scroller r;
    private boolean s;
    private g t;
    private int u;
    private Drawable v;
    private int w;
    private int x;
    private float y = -3.4028235E38f;
    private float z = Float.MAX_VALUE;

    public @interface a {
        static {
            Covode.recordClassIndex(104281);
        }
    }

    public interface e {
        static {
            Covode.recordClassIndex(104285);
        }

        void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    public interface f {
        static {
            Covode.recordClassIndex(104286);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Object f157031a;

        /* renamed from: b  reason: collision with root package name */
        int f157032b;

        /* renamed from: c  reason: collision with root package name */
        boolean f157033c;

        /* renamed from: d  reason: collision with root package name */
        float f157034d;

        /* renamed from: e  reason: collision with root package name */
        float f157035e;

        static {
            Covode.recordClassIndex(104282);
        }

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class h implements Comparator<View> {
        static {
            Covode.recordClassIndex(104288);
        }

        h() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            c cVar = (c) view.getLayoutParams();
            c cVar2 = (c) view2.getLayoutParams();
            if (cVar.f157036a == cVar2.f157036a) {
                return cVar.f157040e - cVar2.f157040e;
            }
            if (cVar.f157036a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f157019h;
    }

    public int getCurrentItem() {
        return this.f157020i;
    }

    public int getOffscreenPageLimit() {
        return this.E;
    }

    public int getPageMargin() {
        return this.u;
    }

    private static void a(PagerAdapter pagerAdapter, g gVar) {
        try {
            Method declaredMethod = PagerAdapter.class.getDeclaredMethod("setViewPagerObserver", DataSetObserver.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(pagerAdapter, gVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void a(int i2, boolean z2, boolean z3, int i3) {
        PagerAdapter pagerAdapter = this.f157019h;
        boolean z4 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f157020i != i2 || this.f157018f.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f157019h.getCount()) {
                i2 = this.f157019h.getCount() - 1;
            }
            int i4 = this.E;
            int i5 = this.f157020i;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f157018f.size(); i6++) {
                    this.f157018f.get(i6).f157033c = true;
                }
            }
            boolean z5 = this.f157020i != i2;
            if (this.f157016b || !z2) {
                z4 = true;
            }
            this.f157015a = z4;
            if (this.W) {
                this.f157020i = i2;
                if (z5) {
                    d(i2);
                }
                requestLayout();
                return;
            }
            a(i2);
            a(i2, z2, i3, z5);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        b b2 = b(i2);
        int clientWidth = b2 != null ? (int) (((float) getClientWidth()) * Math.max(this.y, Math.min(b2.f157035e, this.z))) : 0;
        if (z2) {
            a(clientWidth, i3);
            if (z3) {
                d(i2);
                return;
            }
            return;
        }
        if (z3) {
            d(i2);
        }
        a(false);
        scrollTo(clientWidth, 0);
        c(clientWidth);
    }

    public void a(ViewPager.e eVar) {
        if (this.ad == null) {
            this.ad = new ArrayList();
        }
        this.ad.add(eVar);
    }

    private void a(b bVar, int i2, b bVar2) {
        b bVar3;
        b bVar4;
        int count = this.f157019h.getCount();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.u) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            int i3 = bVar2.f157032b;
            if (i3 < bVar.f157032b) {
                float f3 = bVar2.f157035e + bVar2.f157034d + f2;
                int i4 = i3 + 1;
                int i5 = 0;
                while (i4 <= bVar.f157032b && i5 < this.f157018f.size()) {
                    b bVar5 = this.f157018f.get(i5);
                    while (true) {
                        bVar4 = bVar5;
                        if (i4 > bVar4.f157032b && i5 < this.f157018f.size() - 1) {
                            i5++;
                            bVar5 = this.f157018f.get(i5);
                        }
                    }
                    while (i4 < bVar4.f157032b) {
                        f3 += this.f157019h.getPageWidth(i4) + f2;
                        i4++;
                    }
                    bVar4.f157035e = f3;
                    f3 += bVar4.f157034d + f2;
                    i4++;
                }
            } else if (i3 > bVar.f157032b) {
                int size = this.f157018f.size() - 1;
                float f4 = bVar2.f157035e;
                int i6 = i3 - 1;
                while (i6 >= bVar.f157032b && size >= 0) {
                    b bVar6 = this.f157018f.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i6 < bVar3.f157032b && size > 0) {
                            size--;
                            bVar6 = this.f157018f.get(size);
                        }
                    }
                    while (i6 > bVar3.f157032b) {
                        f4 -= this.f157019h.getPageWidth(i6) + f2;
                        i6--;
                    }
                    f4 -= bVar3.f157034d + f2;
                    bVar3.f157035e = f4;
                    i6--;
                }
            }
        }
        int size2 = this.f157018f.size();
        float f5 = bVar.f157035e;
        int i7 = bVar.f157032b - 1;
        this.y = bVar.f157032b == 0 ? bVar.f157035e : -3.4028235E38f;
        int i8 = count - 1;
        this.z = bVar.f157032b == i8 ? (bVar.f157035e + bVar.f157034d) - 1.0f : Float.MAX_VALUE;
        int i9 = i2 - 1;
        while (i9 >= 0) {
            b bVar7 = this.f157018f.get(i9);
            while (i7 > bVar7.f157032b) {
                f5 -= this.f157019h.getPageWidth(i7) + f2;
                i7--;
            }
            f5 -= bVar7.f157034d + f2;
            bVar7.f157035e = f5;
            if (bVar7.f157032b == 0) {
                this.y = f5;
            }
            i9--;
            i7--;
        }
        float f6 = bVar.f157035e + bVar.f157034d + f2;
        int i10 = bVar.f157032b + 1;
        int i11 = i2 + 1;
        while (i11 < size2) {
            b bVar8 = this.f157018f.get(i11);
            while (i10 < bVar8.f157032b) {
                f6 += this.f157019h.getPageWidth(i10) + f2;
                i10++;
            }
            if (bVar8.f157032b == i8) {
                this.z = (bVar8.f157034d + f6) - 1.0f;
            }
            bVar8.f157035e = f6;
            f6 += bVar8.f157034d + f2;
            i11++;
            i10++;
        }
        this.aa = false;
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.f157018f.isEmpty()) {
            b b2 = b(this.f157020i);
            int min = (int) ((b2 != null ? Math.min(b2.f157035e, this.z) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.r.isFinished()) {
            this.r.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
        }
    }

    private void a(boolean z2) {
        boolean z3;
        if (this.am == 2) {
            z3 = true;
            setScrollingCacheEnabled(false);
            if (!this.r.isFinished()) {
                this.r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.r.getCurrX();
                int currY = this.r.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        c(currX);
                    }
                }
            } else if (this.r.getCurrX() != getScrollX()) {
                scrollTo(this.r.getCurrX(), this.r.getCurrY());
            }
        } else {
            z3 = false;
        }
        this.f157021j = false;
        for (int i2 = 0; i2 < this.f157018f.size(); i2++) {
            b bVar = this.f157018f.get(i2);
            if (bVar.f157033c) {
                bVar.f157033c = false;
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

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.K = motionEvent.getX(i2);
            this.O = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.P;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean a(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally(-i2)) {
            return false;
        }
        return true;
    }

    public static class c extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f157036a;

        /* renamed from: b  reason: collision with root package name */
        public int f157037b;

        /* renamed from: c  reason: collision with root package name */
        float f157038c;

        /* renamed from: d  reason: collision with root package name */
        boolean f157039d;

        /* renamed from: e  reason: collision with root package name */
        public int f157040e;

        /* renamed from: f  reason: collision with root package name */
        public int f157041f;

        static {
            Covode.recordClassIndex(104283);
        }

        public c() {
            super(-1, -1);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DmtViewPager.f157014g);
            this.f157037b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends DataSetObserver {
        static {
            Covode.recordClassIndex(104287);
        }

        public final void onChanged() {
            DmtViewPager.this.c();
        }

        public final void onInvalidated() {
            DmtViewPager.this.c();
        }

        g() {
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        a(this.f157020i);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W = true;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class dmt.viewpager.DmtViewPager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(104280);
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
        int f157028a;

        /* renamed from: b  reason: collision with root package name */
        Parcelable f157029b;

        /* renamed from: e  reason: collision with root package name */
        ClassLoader f157030e;

        static {
            Covode.recordClassIndex(104279);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f157028a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f157028a);
            parcel.writeParcelable(this.f157029b, i2);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f157028a = parcel.readInt();
            this.f157029b = parcel.readParcelable(classLoader);
            this.f157030e = classLoader;
        }
    }

    private void g() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void i() {
        this.F = false;
        this.G = false;
        VelocityTracker velocityTracker = this.P;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P = null;
        }
    }

    private boolean j() {
        int i2 = this.f157020i;
        if (i2 <= 0) {
            return false;
        }
        a(i2 - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public class d extends androidx.core.h.a {
        static {
            Covode.recordClassIndex(104284);
        }

        private boolean a() {
            if (DmtViewPager.this.f157019h == null || DmtViewPager.this.f157019h.getCount() <= 1) {
                return false;
            }
            return true;
        }

        d() {
        }

        @Override // androidx.core.h.a
        public final void a(View view, androidx.core.h.a.d dVar) {
            super.a(view, dVar);
            dVar.a((CharSequence) getClass().getName());
            dVar.d(a());
            if (DmtViewPager.this.canScrollHorizontally(1)) {
                dVar.a(4096);
            }
            if (DmtViewPager.this.canScrollHorizontally(-1)) {
                dVar.a(8192);
            }
        }

        @Override // androidx.core.h.a
        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() == 4096 && DmtViewPager.this.f157019h != null) {
                accessibilityEvent.setItemCount(DmtViewPager.this.f157019h.getCount());
                accessibilityEvent.setFromIndex(DmtViewPager.this.f157020i);
                accessibilityEvent.setToIndex(DmtViewPager.this.f157020i);
            }
        }

        @Override // androidx.core.h.a
        public final boolean a(View view, int i2, Bundle bundle) {
            if (super.a(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !DmtViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                DmtViewPager dmtViewPager = DmtViewPager.this;
                dmtViewPager.setCurrentItem(dmtViewPager.f157020i - 1);
                return true;
            } else if (!DmtViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                DmtViewPager dmtViewPager2 = DmtViewPager.this;
                dmtViewPager2.setCurrentItem(dmtViewPager2.f157020i + 1);
                return true;
            }
        }
    }

    private boolean k() {
        PagerAdapter pagerAdapter = this.f157019h;
        if (pagerAdapter == null || this.f157020i >= pagerAdapter.getCount() - 1) {
            return false;
        }
        a(this.f157020i + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.al);
        Scroller scroller = this.r;
        if (scroller != null && !scroller.isFinished()) {
            this.r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f157028a = this.f157020i;
        PagerAdapter pagerAdapter = this.f157019h;
        if (pagerAdapter != null) {
            savedState.f157029b = pagerAdapter.saveState();
        }
        return savedState;
    }

    static {
        Covode.recordClassIndex(104274);
    }

    private void e() {
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

    private boolean f() {
        this.O = -1;
        i();
        this.U.onRelease();
        this.V.onRelease();
        if (this.U.isFinished() || this.V.isFinished()) {
            return true;
        }
        return false;
    }

    private b h() {
        float f2;
        float f3;
        int i2;
        int clientWidth = getClientWidth();
        float f4 = 0.0f;
        if (clientWidth > 0) {
            f2 = ((float) getScrollX()) / ((float) clientWidth);
            f3 = ((float) this.u) / ((float) clientWidth);
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        b bVar = null;
        float f5 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.f157018f.size()) {
            b bVar2 = this.f157018f.get(i4);
            if (!z2 && bVar2.f157032b != (i2 = i3 + 1)) {
                bVar2 = this.f157024m;
                bVar2.f157035e = f4 + f5 + f3;
                bVar2.f157032b = i2;
                bVar2.f157034d = this.f157019h.getPageWidth(bVar2.f157032b);
                i4--;
            }
            f4 = bVar2.f157035e;
            float f6 = bVar2.f157034d + f4 + f3;
            if (!z2 && f2 < f4) {
                return bVar;
            }
            if (f2 < f6 || i4 == this.f157018f.size() - 1) {
                return bVar2;
            }
            i3 = bVar2.f157032b;
            f5 = bVar2.f157034d;
            i4++;
            bVar = bVar2;
            z2 = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.s = true;
        if (this.r.isFinished() || !this.r.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.r.getCurrX();
        int currY = this.r.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!c(currX)) {
                this.r.abortAnimation();
                scrollTo(0, currY);
            }
        }
        v.c(this);
    }

    private void a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.r = new Scroller(context, f157013e);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.J = viewConfiguration.getScaledPagingTouchSlop();
        this.Q = (int) (400.0f * f2);
        this.R = viewConfiguration.getScaledMaximumFlingVelocity();
        this.U = new EdgeEffect(context);
        this.V = new EdgeEffect(context);
        this.S = (int) (25.0f * f2);
        this.T = (int) (2.0f * f2);
        this.H = (int) (f2 * 16.0f);
        v.a(this, new d());
        if (v.d(this) == 0) {
            v.a((View) this, 1);
        }
        v.a(this, new r() {
            /* class dmt.viewpager.DmtViewPager.AnonymousClass4 */

            /* renamed from: b  reason: collision with root package name */
            private final Rect f157027b = new Rect();

            static {
                Covode.recordClassIndex(104278);
            }

            @Override // androidx.core.h.r
            public final ad a(View view, ad adVar) {
                ad a2 = v.a(view, adVar);
                if (a2.f2507b.b()) {
                    return a2;
                }
                Rect rect = this.f157027b;
                rect.left = a2.a();
                rect.top = a2.b();
                rect.right = a2.c();
                rect.bottom = a2.d();
                int childCount = DmtViewPager.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ad b2 = v.b(DmtViewPager.this.getChildAt(i2), a2);
                    rect.left = Math.min(b2.a(), rect.left);
                    rect.top = Math.min(b2.b(), rect.top);
                    rect.right = Math.min(b2.c(), rect.right);
                    rect.bottom = Math.min(b2.d(), rect.bottom);
                }
                return a2.a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    private void b() {
        View view;
        if (getAdapter().getCount() == 3) {
            this.f157018f.size();
            getScrollX();
            getX();
            getChildCount();
            for (int i2 = 0; i2 < this.f157018f.size(); i2++) {
                this.f157018f.get(i2).f157031a.getClass();
                this.f157018f.get(i2);
                if ((this.f157018f.get(i2).f157031a instanceof Fragment) && (view = ((Fragment) this.f157018f.get(i2).f157031a).getView()) != null) {
                    view.getLayoutParams();
                    view.getLeft();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        boolean z2;
        int count = this.f157019h.getCount();
        this.f157017c = count;
        if (this.f157018f.size() >= (this.E * 2) + 1 || this.f157018f.size() >= count) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i2 = this.f157020i;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.f157018f.size()) {
            b bVar = this.f157018f.get(i3);
            int itemPosition = this.f157019h.getItemPosition(bVar.f157031a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f157018f.remove(i3);
                    i3--;
                    if (!z3) {
                        this.f157019h.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f157019h.destroyItem((ViewGroup) this, bVar.f157032b, bVar.f157031a);
                    if (this.f157020i == bVar.f157032b) {
                        i2 = Math.max(0, Math.min(this.f157020i, count - 1));
                    }
                } else if (bVar.f157032b != itemPosition) {
                    if (bVar.f157032b == this.f157020i) {
                        i2 = itemPosition;
                    }
                    bVar.f157032b = itemPosition;
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.f157019h.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f157018f, f157012d);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                if (!cVar.f157036a) {
                    cVar.f157038c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    public void setCanTouchBeforeScrollIdle(boolean z2) {
        this.f157016b = z2;
    }

    public void setDefaultGutterSize(int i2) {
        this.H = i2;
    }

    public void setOnPageChangeListener(ViewPager.e eVar) {
        this.ae = eVar;
    }

    public void setScroller(Scroller scroller) {
        this.r = scroller;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.D != z2) {
            this.D = z2;
        }
    }

    public void b(ViewPager.e eVar) {
        List<ViewPager.e> list = this.ad;
        if (list != null) {
            list.remove(eVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    private static float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
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

    public void setCurrentItem(int i2) {
        this.f157021j = false;
        a(i2, !this.W, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 <= 0) {
            i2 = 1;
        }
        if (i2 != this.E) {
            this.E = i2;
            d();
        }
    }

    public void setPageMargin(int i2) {
        int i3 = this.u;
        this.u = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(androidx.core.content.b.a(getContext(), i2));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.v) {
            return true;
        }
        return false;
    }

    private b b(int i2) {
        for (int i3 = 0; i3 < this.f157018f.size(); i3++) {
            b bVar = this.f157018f.get(i3);
            if (bVar.f157032b == i2) {
                return bVar;
            }
        }
        return null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1 && !this.f157015a) {
            motionEvent.setAction(1);
        }
        if (!this.f157015a) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void removeView(View view) {
        MethodCollector.i(1536);
        if (this.C) {
            removeViewInLayout(view);
            MethodCollector.o(1536);
            return;
        }
        super.removeView(view);
        MethodCollector.o(1536);
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z2;
        this.v = drawable;
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
        for (int i2 = 0; i2 < this.f157018f.size(); i2++) {
            b bVar = this.f157018f.get(i2);
            if (this.f157019h.isViewFromObject(view, bVar.f157031a)) {
                return bVar;
            }
        }
        return null;
    }

    private void d(int i2) {
        ViewPager.e eVar = this.ae;
        if (eVar != null) {
            eVar.onPageSelected(i2);
        }
        List<ViewPager.e> list = this.ad;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ViewPager.e eVar2 = this.ad.get(i3);
                if (eVar2 != null) {
                    eVar2.onPageSelected(i2);
                }
            }
        }
        ViewPager.e eVar3 = this.af;
        if (eVar3 != null) {
            eVar3.onPageSelected(i2);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        b a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f157032b == this.f157020i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.f157019h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.y))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.z))) {
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
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f157032b == this.f157020i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        super.onRestoreInstanceState(savedState.f2667d);
        PagerAdapter pagerAdapter = this.f157019h;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f157029b, savedState.f157030e);
            a(savedState.f157028a, false, true);
            return;
        }
        this.o = savedState.f157028a;
        this.p = savedState.f157029b;
        this.q = savedState.f157030e;
    }

    public DmtViewPager(Context context) {
        super(context);
        MethodCollector.i(1383);
        a();
        MethodCollector.o(1383);
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

    private boolean c(int i2) {
        if (this.f157018f.size() != 0) {
            b h2 = h();
            int clientWidth = getClientWidth();
            int i3 = this.u;
            int i4 = clientWidth + i3;
            float f2 = (float) i3;
            float f3 = (float) clientWidth;
            int i5 = h2.f157032b;
            float f4 = ((((float) i2) / f3) - h2.f157035e) / (h2.f157034d + (f2 / f3));
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
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode == 61) {
                            if (keyEvent.hasNoModifiers()) {
                                z2 = e(2);
                            } else if (keyEvent.hasModifiers(1)) {
                                z2 = e(1);
                            }
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        z2 = k();
                    } else {
                        z2 = e(66);
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    z2 = j();
                } else {
                    z2 = e(17);
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
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
                        i3 = this.ah;
                    } else {
                        i3 = 0;
                    }
                    getChildAt(i4).setLayerType(i3, null);
                }
            }
            if (i2 == 0) {
                this.f157015a = true;
            }
            ViewPager.e eVar = this.ae;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i2);
            }
            List<ViewPager.e> list = this.ad;
            if (list != null) {
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ViewPager.e eVar2 = this.ad.get(i5);
                    if (eVar2 != null) {
                        eVar2.onPageScrollStateChanged(i2);
                    }
                }
            }
            ViewPager.e eVar3 = this.af;
            if (eVar3 != null) {
                eVar3.onPageScrollStateChanged(i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r7 != 2) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e(int r7) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.viewpager.DmtViewPager.e(int):boolean");
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f157019h) != null && pagerAdapter.getCount() > 1)) {
            if (!this.U.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.y * ((float) width));
                this.U.setSize(height, width);
                z2 = false | this.U.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.V.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.z + 1.0f)) * ((float) width2));
                this.V.setSize(height2, width2);
                z2 |= this.V.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z2) {
                v.c(this);
                return;
            }
            return;
        }
        this.U.finish();
        this.V.finish();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        int i2 = 2100;
        MethodCollector.i(2100);
        super.onDraw(canvas);
        if (this.u > 0 && this.v != null && this.f157018f.size() > 0 && this.f157019h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.u) / f3;
            int i3 = 0;
            b bVar = this.f157018f.get(0);
            float f5 = bVar.f157035e;
            int size = this.f157018f.size();
            int i4 = bVar.f157032b;
            int i5 = this.f157018f.get(size - 1).f157032b;
            while (true) {
                if (i4 >= i5) {
                    break;
                }
                while (i4 > bVar.f157032b && i3 < size) {
                    i3++;
                    bVar = this.f157018f.get(i3);
                }
                if (i4 == bVar.f157032b) {
                    f2 = (bVar.f157035e + bVar.f157034d) * f3;
                    f5 = bVar.f157035e + bVar.f157034d + f4;
                } else {
                    float pageWidth = this.f157019h.getPageWidth(i4);
                    f2 = (f5 + pageWidth) * f3;
                    f5 += pageWidth + f4;
                }
                if (((float) this.u) + f2 > ((float) scrollX)) {
                    this.v.setBounds(Math.round(f2), this.w, Math.round(((float) this.u) + f2), this.x);
                    this.v.draw(canvas);
                }
                if (f2 > ((float) (scrollX + width))) {
                    i2 = 2100;
                    break;
                } else {
                    i4++;
                    i2 = 2100;
                }
            }
        }
        MethodCollector.o(i2);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f157019h;
        if (pagerAdapter2 != null) {
            a(pagerAdapter2, (g) null);
            this.f157019h.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.f157018f.size(); i2++) {
                b bVar = this.f157018f.get(i2);
                this.f157019h.destroyItem((ViewGroup) this, bVar.f157032b, bVar.f157031a);
            }
            this.f157019h.finishUpdate((ViewGroup) this);
            this.f157018f.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((c) getChildAt(i3).getLayoutParams()).f157036a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f157020i = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.f157019h;
        this.f157019h = pagerAdapter;
        this.f157017c = 0;
        if (pagerAdapter != null) {
            if (this.t == null) {
                this.t = new g();
            }
            a(this.f157019h, this.t);
            this.f157021j = false;
            boolean z2 = this.W;
            this.W = true;
            this.f157017c = this.f157019h.getCount();
            if (this.o >= 0) {
                this.f157019h.restoreState(this.p, this.q);
                a(this.o, false, true);
                this.o = -1;
                this.p = null;
                this.q = null;
            } else if (!z2) {
                d();
            } else {
                requestLayout();
            }
        }
        List<e> list = this.f157023l;
        if (!(list == null || list.isEmpty())) {
            int size = this.f157023l.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f157023l.get(i4).a(pagerAdapter3, pagerAdapter);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            f();
            return false;
        }
        if (action != 0) {
            if (this.F) {
                return true;
            }
            if (this.G) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.M = x2;
            this.K = x2;
            float y2 = motionEvent.getY();
            this.N = y2;
            this.L = y2;
            this.O = motionEvent.getPointerId(0);
            this.G = false;
            this.s = true;
            this.r.computeScrollOffset();
            if (this.am != 2 || Math.abs(this.r.getFinalX() - this.r.getCurrX()) <= this.T) {
                a(false);
                this.F = false;
            } else {
                this.r.abortAnimation();
                this.f157021j = false;
                d();
                this.F = true;
                g();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.O;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x3 = motionEvent.getX(findPointerIndex);
                float f3 = x3 - this.K;
                float abs = Math.abs(f3);
                float y3 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.N);
                if (f3 != 0.0f) {
                    float f4 = this.K;
                    if ((f4 >= ((float) this.I) || f3 <= 0.0f) && ((f4 <= ((float) (getWidth() - this.I)) || f3 >= 0.0f) && a(this, false, (int) f3, (int) x3, (int) y3))) {
                        this.K = x3;
                        this.L = y3;
                        this.G = true;
                        return false;
                    }
                }
                int i3 = this.J;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.F = true;
                    g();
                    setScrollState(1);
                    if (f3 > 0.0f) {
                        f2 = this.M + ((float) this.J);
                    } else {
                        f2 = this.M - ((float) this.J);
                    }
                    this.K = f2;
                    this.L = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.G = true;
                }
                if (this.F && b(x3)) {
                    v.c(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.P == null) {
            this.P = VelocityTracker.obtain();
        }
        this.P.addMovement(motionEvent);
        return this.F;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean z2;
        float f2;
        float f3;
        if (this.f157022k) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f157019h) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.P == null) {
            this.P = VelocityTracker.obtain();
        }
        this.P.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.F) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.O);
                        if (findPointerIndex == -1) {
                            z2 = f();
                        } else {
                            float x2 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x2 - this.K);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y2 - this.L);
                            if (abs > ((float) this.J) && abs > abs2) {
                                this.F = true;
                                g();
                                float f4 = this.M;
                                if (x2 - f4 > 0.0f) {
                                    f3 = f4 + ((float) this.J);
                                } else {
                                    f3 = f4 - ((float) this.J);
                                }
                                this.K = f3;
                                this.L = y2;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.F) {
                        z2 = false | b(motionEvent.getX(motionEvent.findPointerIndex(this.O)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.K = motionEvent.getX(actionIndex);
                        this.O = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        a(motionEvent);
                        this.K = motionEvent.getX(motionEvent.findPointerIndex(this.O));
                    }
                } else if (this.F) {
                    a(this.f157020i, true, 0, false);
                    z2 = f();
                }
            } else if (this.F) {
                VelocityTracker velocityTracker = this.P;
                velocityTracker.computeCurrentVelocity(1000, (float) this.R);
                int xVelocity = (int) velocityTracker.getXVelocity(this.O);
                this.f157021j = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                b h2 = h();
                float f5 = (float) clientWidth;
                int i2 = h2.f157032b;
                float f6 = ((((float) scrollX) / f5) - h2.f157035e) / (h2.f157034d + (((float) this.u) / f5));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.O)) - this.M)) <= this.S || Math.abs(xVelocity) <= this.Q) {
                    if (i2 >= this.f157020i) {
                        f2 = 0.4f;
                    } else {
                        f2 = 0.6f;
                    }
                    i2 += (int) (f6 + f2);
                } else if (xVelocity <= 0) {
                    i2++;
                }
                if (this.f157018f.size() > 0) {
                    ArrayList<b> arrayList = this.f157018f;
                    i2 = Math.max(this.f157018f.get(0).f157032b, Math.min(i2, arrayList.get(arrayList.size() - 1).f157032b));
                }
                a(i2, true, true, xVelocity);
                z2 = f();
            }
            if (z2) {
                v.c(this);
            }
        } else {
            this.r.abortAnimation();
            this.f157021j = false;
            d();
            float x3 = motionEvent.getX();
            this.M = x3;
            this.K = x3;
            float y3 = motionEvent.getY();
            this.N = y3;
            this.L = y3;
            this.O = motionEvent.getPointerId(0);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r4.f157032b == r17.f157020i) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r18) {
        /*
        // Method dump skipped, instructions count: 657
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.viewpager.DmtViewPager.a(int):void");
    }

    private boolean b(float f2) {
        boolean z2;
        boolean z3;
        this.K = f2;
        float scrollX = ((float) getScrollX()) + (this.K - f2);
        float clientWidth = (float) getClientWidth();
        float f3 = this.y * clientWidth;
        float f4 = this.z * clientWidth;
        boolean z4 = false;
        b bVar = this.f157018f.get(0);
        ArrayList<b> arrayList = this.f157018f;
        b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f157032b != 0) {
            f3 = bVar.f157035e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (bVar2.f157032b != this.f157019h.getCount() - 1) {
            f4 = bVar2.f157035e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f3) {
            if (z2) {
                this.U.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z3) {
                this.V.onPull(Math.abs(scrollX - f4) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        }
        int i2 = (int) scrollX;
        this.K += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        c(i2);
        return z4;
    }

    public void a(int i2, boolean z2) {
        this.f157021j = false;
        a(i2, z2, false);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.ai == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((c) this.aj.get(i3).getLayoutParams()).f157041f;
    }

    private b b(int i2, int i3) {
        b bVar = new b();
        bVar.f157032b = i2;
        bVar.f157031a = this.f157019h.instantiateItem((ViewGroup) this, i2);
        bVar.f157034d = this.f157019h.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.f157018f.size()) {
            this.f157018f.add(bVar);
        } else {
            this.f157018f.add(i3, bVar);
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
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f157032b == this.f157020i && childAt.requestFocus(i2, rect)) {
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

    public DmtViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(1388);
        a();
        MethodCollector.o(1388);
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
        throw new UnsupportedOperationException("Method not decompiled: dmt.viewpager.DmtViewPager.onMeasure(int, int):void");
    }

    private void a(int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.r;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            if (this.s) {
                scrollX = this.r.getCurrX();
            } else {
                scrollX = this.r.getStartX();
            }
            this.r.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollY = getScrollY();
        int i4 = i2 - scrollX;
        int i5 = 0 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            d();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float f2 = (float) clientWidth;
        float f3 = (float) i6;
        float a2 = f3 + (a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / f2)) * f3);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a2 / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i4)) / ((f2 * this.f157019h.getPageWidth(this.f157020i)) + ((float) this.u))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.s = false;
        this.r.startScroll(scrollX, scrollY, i4, i5, min);
        v.c(this);
    }

    private void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
        new Throwable();
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        b a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f157032b == this.f157020i) {
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

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        boolean z2;
        MethodCollector.i(1534);
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c cVar = (c) layoutParams;
        boolean z3 = cVar.f157036a;
        if (view.getClass().getAnnotation(a.class) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        cVar.f157036a = z3 | z2;
        if (!this.C) {
            super.addView(view, i2, layoutParams);
            MethodCollector.o(1534);
        } else if (!cVar.f157036a) {
            cVar.f157039d = true;
            addViewInLayout(view, i2, layoutParams);
            MethodCollector.o(1534);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot add pager decor view during layout");
            MethodCollector.o(1534);
            throw illegalStateException;
        }
    }

    private void a(int i2, float f2, int i3) {
        int i4;
        int i5;
        if (this.ac > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f157036a) {
                    int i7 = cVar.f157037b & 7;
                    if (i7 == 1) {
                        i4 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i5 = paddingLeft;
                        paddingLeft = i4;
                    } else if (i7 == 3) {
                        i5 = childAt.getWidth() + paddingLeft;
                    } else if (i7 != 5) {
                        i5 = paddingLeft;
                    } else {
                        i4 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i5 = paddingLeft;
                        paddingLeft = i4;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = i5;
                }
            }
        }
        b(i2, f2, i3);
        if (this.ag != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((c) childAt2.getLayoutParams()).f157036a) {
                    childAt2.getLeft();
                    getClientWidth();
                }
            }
        }
        this.ab = true;
    }

    private void b(int i2, float f2, int i3) {
        ViewPager.e eVar = this.ae;
        if (eVar != null) {
            eVar.onPageScrolled(i2, f2, i3);
        }
        List<ViewPager.e> list = this.ad;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ViewPager.e eVar2 = this.ad.get(i4);
                if (eVar2 != null) {
                    eVar2.onPageScrolled(i2, f2, i3);
                }
            }
        }
        ViewPager.e eVar3 = this.af;
        if (eVar3 != null) {
            eVar3.onPageScrolled(i2, f2, i3);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.u;
            a(i2, i4, i6, i6);
        }
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
        int scrollX = getScrollX();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f157036a) {
                    int i14 = cVar.f157037b & 7;
                    int i15 = cVar.f157037b & 112;
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
                    int i16 = paddingLeft + scrollX;
                    childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                    i12++;
                    paddingTop = i9;
                    paddingLeft = i7;
                }
            }
        }
        int i17 = (i10 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                c cVar2 = (c) childAt2.getLayoutParams();
                if (!cVar2.f157036a && (a2 = a(childAt2)) != null) {
                    float f2 = (float) i17;
                    int i19 = ((int) (a2.f157035e * f2)) + paddingLeft;
                    if (cVar2.f157039d) {
                        cVar2.f157039d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * cVar2.f157038c), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.w = paddingTop;
        this.x = i11 - paddingBottom;
        this.ac = i12;
        if (this.W) {
            z3 = false;
            a(this.f157020i, false, 0, false);
        } else {
            z3 = false;
        }
        this.W = z3;
    }
}
