package com.lynx.tasm.behavior.ui.swiper;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class c extends ViewGroup {
    private final GestureDetector A;

    /* renamed from: a  reason: collision with root package name */
    int f56336a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f56337b;

    /* renamed from: c  reason: collision with root package name */
    int f56338c;

    /* renamed from: d  reason: collision with root package name */
    public final Scroller f56339d;

    /* renamed from: e  reason: collision with root package name */
    boolean f56340e;

    /* renamed from: f  reason: collision with root package name */
    int f56341f;

    /* renamed from: g  reason: collision with root package name */
    public int f56342g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f56343h;

    /* renamed from: i  reason: collision with root package name */
    public final int f56344i;

    /* renamed from: j  reason: collision with root package name */
    b f56345j;

    /* renamed from: k  reason: collision with root package name */
    a f56346k;

    /* renamed from: l  reason: collision with root package name */
    public final List<d> f56347l;

    /* renamed from: m  reason: collision with root package name */
    int f56348m;
    public boolean n;
    boolean o;
    public boolean p;
    public boolean q;
    boolean r;
    public Boolean s;
    int t;
    boolean u;
    boolean v;
    private int w;
    private int x;
    private float y;
    private AbstractC1264c z;

    public interface b {
        static {
            Covode.recordClassIndex(35168);
        }

        void a(int i2);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.swiper.c$c  reason: collision with other inner class name */
    public interface AbstractC1264c {
        static {
            Covode.recordClassIndex(35169);
        }

        void a(View view);

        void a(View view, int i2);
    }

    static {
        Covode.recordClassIndex(35165);
    }

    /* access modifiers changed from: package-private */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        boolean f56351a;

        static {
            Covode.recordClassIndex(35170);
        }

        /* access modifiers changed from: package-private */
        public void b() {
        }

        /* access modifiers changed from: package-private */
        public void b(float f2, float f3) {
        }

        /* access modifiers changed from: package-private */
        public void c(float f2, float f3) {
        }

        d() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (this.f56351a) {
                this.f56351a = false;
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(float f2, float f3) {
            if (!this.f56351a) {
                this.f56351a = true;
                b(f2, f3);
            }
        }
    }

    public final void requestLayout() {
        super.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public static class a extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f56350a;

        static {
            Covode.recordClassIndex(35167);
        }

        public a() {
            super(-1, -1);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    private int e() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int j() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        if (d()) {
            return getScrollY();
        }
        return getScrollX();
    }

    private List<View> g() {
        int childCount = getChildCount();
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < childCount; i2++) {
            linkedList.add(getChildAt(i2));
        }
        return linkedList;
    }

    private int k() {
        int width;
        int i2;
        if (d()) {
            width = getHeight() - getPaddingBottom();
            i2 = this.f56341f;
        } else {
            width = getWidth() - getPaddingRight();
            i2 = this.f56341f;
        }
        return width - i2;
    }

    private View h() {
        int b2 = b() + (a() / 2);
        int c2 = c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int a2 = a(childAt) - c2;
            int f2 = f(childAt) - c2;
            int i3 = this.f56342g;
            if (i3 > 0) {
                f2 += this.f56341f;
            } else if (i3 < 0) {
                a2 -= this.f56341f;
            }
            if (a2 <= b2 && f2 >= b2) {
                return childAt;
            }
        }
        return getChildAt(0);
    }

    public final int a() {
        int e2;
        int i2 = this.w;
        if (i2 > 0) {
            return i2;
        }
        if (d()) {
            e2 = j();
        } else {
            e2 = e();
        }
        float f2 = this.y;
        if (f2 > 0.0f) {
            return (int) Math.ceil((double) (((float) e2) * f2));
        }
        return e2;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        if (d()) {
            return getPaddingTop() + this.x;
        }
        if (this.q) {
            return ((getPaddingLeft() + this.x) + getWidth()) - a();
        }
        return getPaddingLeft() + this.x;
    }

    private void i() {
        int left;
        int paddingLeft;
        if (this.z != null) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (this.q) {
                    left = (childAt.getLeft() - getScrollX()) + this.x;
                    paddingLeft = getPaddingLeft();
                } else if (d()) {
                    left = (childAt.getTop() - getScrollY()) - this.x;
                    paddingLeft = getPaddingTop();
                } else {
                    left = (childAt.getLeft() - getScrollX()) - this.x;
                    paddingLeft = getPaddingLeft();
                }
                this.z.a(childAt, left - paddingLeft);
            }
        }
    }

    public final void computeScroll() {
        boolean z2;
        b bVar;
        if (this.f56339d.computeScrollOffset()) {
            if (d()) {
                scrollTo(getScrollX(), this.f56339d.getCurrY());
            } else {
                scrollTo(this.f56339d.getCurrX(), getScrollY());
            }
            invalidate();
        } else if (getChildCount() > 0 && !this.n) {
            int i2 = this.f56336a;
            int i3 = ((a) h().getLayoutParams()).f56350a;
            this.f56336a = i3;
            if (!(i2 == i3 || (bVar = this.f56345j) == null)) {
                bVar.a(i3);
            }
            if (this.r) {
                for (d dVar : this.f56347l) {
                    dVar.a();
                }
                if (i2 == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f56337b = z2;
            }
        }
    }

    private void f() {
        int a2;
        int i2;
        int i3;
        int i4;
        int i5;
        int paddingTop;
        int measuredHeight;
        int i6;
        int i7;
        int i8;
        if (this.f56348m > 0 && (a2 = a()) > 0) {
            int c2 = c();
            int i9 = this.f56341f + a2;
            if (i9 > 0) {
                List<View> g2 = g();
                int i10 = c2 / i9;
                int i11 = c2 % i9;
                if (this.q) {
                    if (c2 <= 0 || !this.f56340e) {
                        i4 = (getWidth() + c2) - i11;
                    } else {
                        if (i11 != 0) {
                            i10++;
                        } else {
                            i10 %= this.f56348m;
                        }
                        int width = (getWidth() + c2) - i11;
                        if (i11 == 0) {
                            i8 = this.f56341f;
                        } else {
                            i8 = a2;
                        }
                        i4 = width + i8 + this.f56341f;
                    }
                    int i12 = this.f56348m;
                    i2 = (i12 - i10) % i12;
                    if (i2 < 0) {
                        i2 += i12;
                    }
                    i3 = 0;
                } else {
                    if (c2 >= 0 || !this.f56340e) {
                        i2 = i10 % this.f56348m;
                        i3 = c2 - i11;
                    } else {
                        if (i11 != 0) {
                            i10--;
                        }
                        int i13 = this.f56348m;
                        i2 = ((i10 % i13) + i13) % i13;
                        if (i11 == 0) {
                            i5 = -this.f56341f;
                        } else {
                            i5 = a2;
                        }
                        i3 = ((c2 - i5) - i11) - this.f56341f;
                    }
                    i4 = 0;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                }
                int max = c2 - Math.max(0, k());
                int max2 = c2 + Math.max(0, k());
                while (true) {
                    View c3 = c(i2);
                    g2.remove(c3);
                    if (this.q) {
                        i3 = i4 - a2;
                    } else {
                        i4 = i3 + a2;
                    }
                    if (d()) {
                        i7 = getPaddingLeft();
                        i6 = c3.getMeasuredWidth() + i7;
                        measuredHeight = i4;
                        paddingTop = i3;
                    } else {
                        paddingTop = getPaddingTop();
                        measuredHeight = c3.getMeasuredHeight() + paddingTop;
                        i6 = i4;
                        i7 = i3;
                    }
                    if (!(i7 == c3.getLeft() && paddingTop == c3.getTop() && i6 == c3.getRight() && measuredHeight == c3.getBottom())) {
                        c3.layout(i7, paddingTop, i6, measuredHeight);
                    }
                    i();
                    if (!this.q) {
                        if (i4 >= max2) {
                            break;
                        }
                        i3 = this.f56341f + i4;
                    } else if (i3 <= max) {
                        break;
                    } else {
                        i4 = i3 - this.f56341f;
                    }
                    int i14 = i2 + 1;
                    int i15 = this.f56348m;
                    if (i14 >= i15 && !this.f56340e) {
                        break;
                    }
                    i2 = i14 % i15;
                }
                for (View view : g2) {
                    b(view);
                }
            }
        }
    }

    public c(Context context) {
        this(context, (byte) 0);
    }

    private void b(View view) {
        removeView(view);
        AbstractC1264c cVar = this.z;
        if (cVar != null) {
            cVar.a(view);
        }
        view.getLayoutParams();
    }

    private int f(View view) {
        if (d()) {
            return view.getBottom();
        }
        return view.getRight();
    }

    /* access modifiers changed from: package-private */
    public final int a(View view) {
        if (d()) {
            return view.getTop();
        }
        return view.getLeft();
    }

    public final void a(float f2) {
        this.w = -1;
        this.y = f2;
        a(this.f56346k);
    }

    public final void b(int i2) {
        int i3 = this.x;
        this.x = i2;
        if (d()) {
            scrollBy(0, i3 - i2);
        } else {
            scrollBy(i3 - i2, 0);
        }
    }

    private View c(int i2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((a) childAt.getLayoutParams()).f56350a == i2) {
                return childAt;
            }
        }
        View a2 = this.f56346k.a(i2);
        a aVar = new a();
        aVar.f56350a = i2;
        addViewInLayout(a2, 0, aVar, true);
        c(a2);
        return a2;
    }

    private void c(View view) {
        int makeMeasureSpec;
        int d2;
        if (d()) {
            makeMeasureSpec = e(view);
            d2 = View.MeasureSpec.makeMeasureSpec(a(), 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(a(), 1073741824);
            d2 = d(view);
        }
        view.measure(makeMeasureSpec, d2);
    }

    private int d(View view) {
        a aVar = (a) view.getLayoutParams();
        if (aVar.height >= 0) {
            return View.MeasureSpec.makeMeasureSpec(aVar.height, 1073741824);
        }
        int max = Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (aVar.height == -1) {
            return View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        if (aVar.height == -2) {
            return View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }

    private int e(View view) {
        a aVar = (a) view.getLayoutParams();
        if (aVar.width >= 0) {
            return View.MeasureSpec.makeMeasureSpec(aVar.width, 1073741824);
        }
        int max = Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight());
        if (aVar.width == -1) {
            return View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        if (aVar.width == -2) {
            return View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }

    public final void a(int i2) {
        this.y = -1.0f;
        this.w = i2;
        a(this.f56346k);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.s = null;
            this.n = false;
            if (!this.f56343h && getChildCount() > 0) {
                int b2 = b() + (a() / 2);
                int c2 = c();
                View h2 = h();
                int a2 = (((a(h2) - c2) + f(h2)) - c2) / 2;
                if (d()) {
                    this.f56339d.startScroll(0, c2, 0, a2 - b2, this.f56338c);
                } else {
                    this.f56339d.startScroll(c2, 0, a2 - b2, 0, this.f56338c);
                }
                invalidate();
            }
        }
        if (this.o) {
            return this.A.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void a(a aVar) {
        if (this.f56346k != null) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                b(getChildAt(childCount));
            }
        } else {
            removeAllViews();
        }
        this.f56346k = aVar;
        if (aVar != null) {
            this.f56348m = aVar.a();
            if (d()) {
                setScrollY((-this.x) - getPaddingTop());
            } else {
                setScrollX((-this.x) - getPaddingLeft());
            }
            requestLayout();
        }
    }

    public final void a(AbstractC1264c cVar) {
        if (this.z != null) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.z.a(getChildAt(childCount));
            }
        }
        this.z = cVar;
        i();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(getDefaultSize(0, i2), getDefaultSize(0, i3));
    }

    private c(Context context, byte b2) {
        super(context, null);
        MethodCollector.i(14023);
        this.f56336a = -1;
        this.f56337b = true;
        this.f56338c = 300;
        this.y = 1.0f;
        this.f56347l = new ArrayList();
        this.o = true;
        this.p = false;
        this.q = false;
        this.r = false;
        this.t = 0;
        this.u = false;
        this.v = false;
        this.A = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
            /* class com.lynx.tasm.behavior.ui.swiper.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35166);
            }

            public final boolean onDown(MotionEvent motionEvent) {
                c.this.f56343h = false;
                c.this.f56342g = 0;
                c.this.n = true;
                c.this.p = true;
                return true;
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                float f4;
                boolean onFling = super.onFling(motionEvent, motionEvent2, f2, f3);
                if (f2 >= ((float) (-c.this.f56344i)) && f2 <= ((float) c.this.f56344i)) {
                    return onFling;
                }
                c.this.f56343h = true;
                c.this.f56339d.abortAnimation();
                c cVar = c.this;
                if (cVar.getChildCount() > 0) {
                    if (cVar.d()) {
                        f4 = f3;
                    } else {
                        f4 = f2;
                    }
                    int b2 = cVar.b();
                    int c2 = cVar.c();
                    int i2 = 0;
                    if (f4 < 0.0f) {
                        int childCount = cVar.getChildCount();
                        int i3 = Integer.MAX_VALUE;
                        while (i2 < childCount) {
                            int a2 = cVar.a(cVar.getChildAt(i2)) - c2;
                            if (a2 > b2 && a2 < i3) {
                                i3 = a2;
                            }
                            i2++;
                        }
                        if (i3 != Integer.MAX_VALUE) {
                            if (cVar.d()) {
                                cVar.f56339d.startScroll(0, c2, 0, i3 - b2, cVar.f56338c);
                            } else {
                                cVar.f56339d.startScroll(c2, 0, i3 - b2, 0, cVar.f56338c);
                            }
                        }
                    } else {
                        int childCount2 = cVar.getChildCount();
                        int i4 = Integer.MIN_VALUE;
                        while (i2 < childCount2) {
                            int a3 = cVar.a(cVar.getChildAt(i2)) - c2;
                            if (a3 < b2 && a3 > i4) {
                                i4 = a3;
                            }
                            i2++;
                        }
                        if (i4 != Integer.MIN_VALUE) {
                            if (cVar.d()) {
                                cVar.f56339d.startScroll(0, c2, 0, i4 - b2, cVar.f56338c);
                            } else {
                                cVar.f56339d.startScroll(c2, 0, i4 - b2, 0, cVar.f56338c);
                            }
                        }
                    }
                    cVar.invalidate();
                }
                return super.onFling(motionEvent, motionEvent2, f2, f3);
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                boolean z;
                if (c.this.s == null) {
                    c cVar = c.this;
                    if (Math.abs(f2) > Math.abs(f3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.s = Boolean.valueOf(z);
                }
                if (c.this.s.booleanValue()) {
                    c.this.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (c.this.p) {
                    c.this.p = false;
                    for (d dVar : c.this.f56347l) {
                        dVar.a((float) c.this.getScrollX(), (float) c.this.getScrollY());
                    }
                }
                c cVar2 = c.this;
                cVar2.f56342g = (int) (((float) cVar2.f56342g) + f2);
                if (c.this.d()) {
                    c cVar3 = c.this;
                    double d2 = (double) f3;
                    Double.isNaN(d2);
                    cVar3.scrollBy(0, (int) (d2 + 0.5d));
                } else {
                    c cVar4 = c.this;
                    double d3 = (double) f2;
                    Double.isNaN(d3);
                    cVar4.scrollBy((int) (d3 + 0.5d), 0);
                }
                return super.onScroll(motionEvent, motionEvent2, f2, f3);
            }
        }, new Handler(Looper.getMainLooper()));
        this.f56344i = (int) (getResources().getDisplayMetrics().density * 600.0f);
        this.f56339d = new Scroller(context, new LinearInterpolator());
        MethodCollector.o(14023);
    }

    public final void a(int i2, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6 = i2;
        if (this.f56348m > 0 && getChildCount() > 0) {
            if (i6 < 0) {
                i6 = 0;
            }
            int a2 = a();
            int b2 = b() + (a2 / 2);
            int c2 = c();
            View h2 = h();
            int i7 = ((a) h2.getLayoutParams()).f56350a;
            int i8 = this.f56341f;
            int i9 = (i6 - i7) * (a2 + i8);
            if (this.v && this.f56340e && !this.u) {
                int i10 = this.f56348m;
                if (i7 == i10 - 1 && i6 == 0) {
                    i9 = a2 + i8;
                } else if (i7 == 0 && i6 == i10 - 1) {
                    i9 = -(a2 + i8);
                }
            }
            int a3 = (((a(h2) - c2) + f(h2)) - c2) / 2;
            for (d dVar : this.f56347l) {
                dVar.a((float) getScrollX(), (float) getScrollY());
            }
            if (this.q) {
                Scroller scroller = this.f56339d;
                int i11 = (a3 - b2) - i9;
                if (z2) {
                    i5 = this.f56338c;
                } else {
                    i5 = 0;
                }
                scroller.startScroll(c2, 0, i11, 0, i5);
            } else if (d()) {
                Scroller scroller2 = this.f56339d;
                int i12 = (a3 - b2) + i9;
                if (z2) {
                    i4 = this.f56338c;
                } else {
                    i4 = 0;
                }
                scroller2.startScroll(0, c2, 0, i12, i4);
            } else {
                Scroller scroller3 = this.f56339d;
                int i13 = i9 + (a3 - b2);
                if (z2) {
                    i3 = this.f56338c;
                } else {
                    i3 = 0;
                }
                scroller3.startScroll(c2, 0, i13, 0, i3);
            }
            invalidate();
        }
    }

    public final void scrollTo(int i2, int i3) {
        int i4;
        int a2;
        if (!this.f56340e) {
            if (d()) {
                int i5 = (-getPaddingTop()) - this.x;
                if (i3 < i5) {
                    i3 = i5;
                }
                int a3 = (((this.f56348m - 1) * (a() + this.f56341f)) - getPaddingTop()) - this.x;
                if (i3 > a3) {
                    i3 = a3;
                }
            } else {
                if (this.q) {
                    a2 = getPaddingRight() - this.x;
                    i4 = -((((this.f56348m - 1) * (a() + this.f56341f)) - getPaddingRight()) + this.x);
                } else {
                    i4 = (-getPaddingLeft()) - this.x;
                    a2 = (((this.f56348m - 1) * (a() + this.f56341f)) - getPaddingLeft()) - this.x;
                }
                if (i2 < i4) {
                    i2 = i4;
                }
                if (i2 > a2) {
                    i2 = a2;
                }
            }
        }
        super.scrollTo(i2, i3);
        f();
        for (d dVar : this.f56347l) {
            dVar.c((float) getScrollX(), (float) getScrollY());
        }
        if (!(this.r || this.n || !this.f56339d.isFinished())) {
            for (d dVar2 : this.f56347l) {
                dVar2.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException();
    }

    public final void setPadding(int i2, int i3, int i4, int i5) {
        int paddingLeft = getPaddingLeft();
        super.setPadding(i2, i3, i4, i5);
        if (d()) {
            scrollBy(0, paddingLeft - i2);
        } else {
            scrollBy(paddingLeft - i2, 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            c(getChildAt(childCount));
        }
        f();
    }
}
