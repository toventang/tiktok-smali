package com.bytedance.tux.widget.spring;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.h.k;
import androidx.core.h.m;
import androidx.core.h.o;
import androidx.core.h.q;
import androidx.e.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.w;
import h.z;

public class SpringLayout extends FrameLayout implements k, o {

    /* renamed from: h  reason: collision with root package name */
    public static final c f45670h = new c((byte) 0);
    private float A;
    private androidx.e.a.d B;
    private b C;
    private a D;
    private int E;
    private boolean F;
    private boolean G;

    /* renamed from: a  reason: collision with root package name */
    public boolean f45671a;

    /* renamed from: b  reason: collision with root package name */
    public int f45672b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f45673c;

    /* renamed from: d  reason: collision with root package name */
    public c f45674d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.tux.widget.spring.a.a f45675e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f45676f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f45677g;

    /* renamed from: i  reason: collision with root package name */
    private final q f45678i;

    /* renamed from: j  reason: collision with root package name */
    private final m f45679j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f45680k;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.tux.widget.spring.b.a f45681l;

    /* renamed from: m  reason: collision with root package name */
    private int f45682m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private VelocityTracker t;
    private e u;
    private g v;
    private float w;
    private float x;
    private float y;
    private final androidx.e.a.e z;

    static {
        Covode.recordClassIndex(27794);
    }

    public SpringLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(27797);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public final int getHoverBottomHeight() {
        return this.E;
    }

    public final float getMaxOverScrollDistance() {
        return this.x;
    }

    public final com.bytedance.tux.widget.spring.b.a getNestedHeader() {
        return this.f45681l;
    }

    public final e getOverScrollMode() {
        return this.u;
    }

    public final float getRubberBandCoefficient() {
        return this.y;
    }

    public final g getScrollMode() {
        return this.v;
    }

    public final float getSpringStiffness() {
        return this.A;
    }

    @Override // androidx.core.h.o
    public final boolean a(View view, View view2, int i2, int i3) {
        l.c(view, "");
        l.c(view2, "");
        f.a("onStartNestedScroll", Integer.valueOf(i3), null, null, null, null, null, null, null, Integer.valueOf(getNestedScrollY()), null, null, 126970);
        return (i2 & 2) != 0;
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f45685a;

        static {
            Covode.recordClassIndex(27798);
        }

        @Override // com.bytedance.tux.widget.spring.a
        public final void a() {
            this.f45685a.invoke();
        }

        d(h.f.a.a aVar) {
            this.f45685a = aVar;
        }
    }

    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f45686a;

        static {
            Covode.recordClassIndex(27799);
        }

        @Override // com.bytedance.tux.widget.spring.b
        public final void a() {
            this.f45686a.invoke();
        }

        e(h.f.a.a aVar) {
            this.f45686a = aVar;
        }
    }

    private static void e() {
        throw new IllegalArgumentException("Spring layout just have one child view");
    }

    @Override // androidx.core.h.j
    public void stopNestedScroll() {
        a(0);
    }

    private final void b() {
        this.r = false;
        this.n = 0;
        this.f45682m = 0;
        c();
    }

    private final int getHeaderHeight() {
        com.bytedance.tux.widget.spring.b.a aVar = this.f45681l;
        if (aVar != null) {
            return aVar.getActualHeight();
        }
        return 0;
    }

    public final int getNestedScrollY() {
        return getScrollY() - getHeaderHeight();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t = VelocityTracker.obtain();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.B.b();
    }

    static final class b implements b.AbstractC0041b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SpringLayout f45684a;

        static {
            Covode.recordClassIndex(27796);
        }

        b(SpringLayout springLayout) {
            this.f45684a = springLayout;
        }

        @Override // androidx.e.a.b.AbstractC0041b
        public final void a() {
            SpringLayout springLayout = this.f45684a;
            springLayout.f45672b = springLayout.f45675e.a(this.f45684a.getNestedScrollY());
        }
    }

    private final void c() {
        int i2;
        if (getNestedScrollY() != 0) {
            if (getNestedScrollY() < 0) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            a(i2, true, Float.valueOf(0.0f));
        }
    }

    private final boolean d() {
        if (getScrollY() != 0 || !this.f45677g || getHeaderHeight() <= 0) {
            return false;
        }
        return true;
    }

    private final void a() {
        com.bytedance.tux.widget.spring.b.a aVar;
        com.bytedance.tux.widget.spring.b.a aVar2;
        boolean z2 = false;
        if (getNestedScrollY() < 0) {
            if (!this.f45671a && (aVar = this.f45681l) != null) {
                aVar.b(false);
            }
            z2 = true;
        } else if (this.f45671a && (aVar2 = this.f45681l) != null) {
            aVar2.b(true);
        }
        this.f45671a = z2;
    }

    static final class a implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SpringLayout f45683a;

        static {
            Covode.recordClassIndex(27795);
        }

        a(SpringLayout springLayout) {
            this.f45683a = springLayout;
        }

        @Override // androidx.e.a.b.c
        public final void a() {
            com.bytedance.tux.widget.spring.b.a nestedHeader;
            com.bytedance.tux.widget.spring.b.a nestedHeader2;
            SpringLayout springLayout = this.f45683a;
            springLayout.f45672b = springLayout.f45675e.a(this.f45683a.getNestedScrollY());
            com.bytedance.tux.widget.spring.b.a nestedHeader3 = this.f45683a.getNestedHeader();
            boolean z = true;
            if (nestedHeader3 != null) {
                nestedHeader3.a(this.f45683a.getNestedScrollY(), true);
            }
            c cVar = this.f45683a.f45674d;
            if (cVar != null) {
                cVar.a(this.f45683a.getNestedScrollY(), this.f45683a.f45672b, true);
            }
            SpringLayout springLayout2 = this.f45683a;
            if (springLayout2.getNestedScrollY() >= 0) {
                if (this.f45683a.f45671a && (nestedHeader2 = this.f45683a.getNestedHeader()) != null) {
                    nestedHeader2.b(true);
                }
                z = false;
            } else if (!this.f45683a.f45671a && (nestedHeader = this.f45683a.getNestedHeader()) != null) {
                nestedHeader.b(false);
            }
            springLayout2.f45671a = z;
        }
    }

    private final View getNestedChild() {
        if (getChildCount() == 0) {
            return null;
        }
        if (getChildCount() > 2) {
            e();
        }
        int i2 = 0;
        if (getChildCount() == 2) {
            if (!(getChildAt(0) instanceof com.bytedance.tux.widget.spring.b.a)) {
                e();
            }
            if (getChildAt(1) instanceof com.bytedance.tux.widget.spring.b.a) {
                throw new IllegalArgumentException("Header view must as first child");
            }
        }
        int childCount = getChildCount();
        if (childCount < 0) {
            return null;
        }
        while (true) {
            View childAt = getChildAt(i2);
            if (!(childAt instanceof com.bytedance.tux.widget.spring.b.a) && childAt != null) {
                return childAt;
            }
            if (i2 == childCount) {
                return null;
            }
            i2++;
        }
    }

    public final void setHoverBottomHeight(int i2) {
        this.E = i2;
    }

    public static final class f implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.q f45687a;

        static {
            Covode.recordClassIndex(27800);
        }

        f(h.f.a.q qVar) {
            this.f45687a = qVar;
        }

        @Override // com.bytedance.tux.widget.spring.c
        public final void a(int i2, int i3, boolean z) {
            this.f45687a.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z));
        }
    }

    @Override // androidx.core.h.k
    public final void a(int i2) {
        this.f45679j.b(i2);
    }

    public final void setOnHoverBottomListener(a aVar) {
        l.c(aVar, "");
        this.D = aVar;
    }

    public final void setOnRefreshListener(b bVar) {
        l.c(bVar, "");
        this.C = bVar;
    }

    public final void setOnScrollChangeListener(c cVar) {
        l.c(cVar, "");
        this.f45674d = cVar;
    }

    public final void setOverScrollMode(e eVar) {
        l.c(eVar, "");
        this.u = eVar;
    }

    public final void setRubberBandCoefficient(float f2) {
        this.y = f2;
        this.f45675e.f45689b = f2;
    }

    public final void setScrollMode(g gVar) {
        l.c(gVar, "");
        this.v = gVar;
    }

    public final void setSpringStiffness(float f2) {
        this.A = f2;
        this.z.a(f2);
    }

    public boolean startNestedScroll(int i2) {
        return b(i2, 0);
    }

    @Override // androidx.core.h.n
    public void onStopNestedScroll(View view) {
        l.c(view, "");
        b(view, 0);
    }

    public final void setOnHoverBottomListener(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        this.D = new d(aVar);
    }

    public final void setOnRefreshListener(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        this.C = new e(aVar);
    }

    public final void setOnScrollChangeListener(h.f.a.q<? super Integer, ? super Integer, ? super Boolean, z> qVar) {
        l.c(qVar, "");
        this.f45674d = new f(qVar);
    }

    public final void setHoverAtBottom(boolean z2) {
        if (this.f45676f != z2) {
            this.f45676f = z2;
            int i2 = 1;
            if (z2) {
                if (!this.F) {
                    this.F = true;
                    a aVar = this.D;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            } else if (this.F) {
                this.F = false;
                if (getNestedScrollY() < 0) {
                    i2 = -1;
                }
                a(i2, this.f45676f, Float.valueOf(0.0f));
            }
        }
    }

    public final void setMaxOverScrollDistance(float f2) {
        if (f2 >= 1.0f) {
            this.x = f2;
            this.f45675e.f45688a = f2;
            androidx.e.a.d dVar = this.B;
            if (dVar != null) {
                dVar.b((this.x - 1.0f) + ((float) getHeaderHeight()));
            }
            androidx.e.a.d dVar2 = this.B;
            if (dVar2 != null) {
                dVar2.c((-this.x) + 1.0f);
                return;
            }
            return;
        }
        throw new IllegalStateException("maxOverScrollDistance must >= 1");
    }

    public final void setRefreshing(boolean z2) {
        if (this.f45677g != z2) {
            this.f45677g = z2;
            int i2 = 1;
            if (z2) {
                if (!this.G) {
                    this.G = true;
                    b bVar = this.C;
                    if (bVar != null) {
                        bVar.a();
                    }
                    com.bytedance.tux.widget.spring.b.a aVar = this.f45681l;
                    if (aVar != null) {
                        aVar.a(true);
                    }
                }
            } else if (this.G) {
                this.G = false;
                com.bytedance.tux.widget.spring.b.a aVar2 = this.f45681l;
                if (aVar2 != null) {
                    aVar2.a(false);
                }
                if (getNestedScrollY() < 0) {
                    i2 = -1;
                }
                a(i2, this.f45677g, Float.valueOf(0.0f));
            }
        }
    }

    private final void b(int i2) {
        int i3 = 1;
        if (Math.abs(i2) > 1) {
            int a2 = this.f45675e.a(getNestedScrollY());
            this.f45672b = a2;
            this.f45672b = a2 + i2;
            int headerHeight = getHeaderHeight();
            com.bytedance.tux.widget.spring.a.a aVar = this.f45675e;
            int i4 = this.f45672b;
            int nestedScrollY = getNestedScrollY() + i2;
            if (i2 <= 0) {
                i3 = -1;
            }
            scrollTo(0, headerHeight + aVar.a(i4, nestedScrollY, i3));
            this.f45672b = this.f45675e.a(getNestedScrollY());
            a();
            com.bytedance.tux.widget.spring.b.a aVar2 = this.f45681l;
            if (aVar2 != null) {
                aVar2.a(getNestedScrollY(), false);
            }
            c cVar = this.f45674d;
            if (cVar != null) {
                cVar.a(getNestedScrollY(), this.f45672b, false);
            }
        }
    }

    public final void setNestedHeader(com.bytedance.tux.widget.spring.b.a aVar) {
        int i2;
        int i3;
        this.f45681l = aVar;
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i4 = 0;
            while (true) {
                if (!(getChildAt(i4) instanceof com.bytedance.tux.widget.spring.b.a)) {
                    if (i4 == childCount) {
                        break;
                    }
                    i4++;
                } else {
                    removeViewAt(i4);
                    break;
                }
            }
        }
        if (this.B.t) {
            this.B.b();
            scrollTo(0, 0);
        }
        if (!(aVar instanceof View)) {
            this.f45681l = null;
            setRefreshing(false);
            this.G = false;
            scrollTo(0, 0);
            return;
        }
        com.bytedance.tux.widget.spring.b.a aVar2 = this.f45681l;
        if (aVar2 != null) {
            View view = (View) aVar2;
            com.bytedance.tux.widget.spring.b.a aVar3 = this.f45681l;
            if (aVar3 != null) {
                i2 = aVar3.getActualHeight();
            } else {
                i2 = 0;
            }
            addView(view, 0, new ViewGroup.LayoutParams(-1, i2));
            this.B.b((this.x - 1.0f) + ((float) aVar.getActualHeight()));
            com.bytedance.tux.widget.spring.b.a aVar4 = this.f45681l;
            if (aVar4 != null) {
                i3 = aVar4.getActualHeight();
            } else {
                i3 = 0;
            }
            scrollTo(0, i3);
            com.bytedance.tux.widget.spring.b.a aVar5 = this.f45681l;
            if (aVar5 != null) {
                aVar5.a(this.f45677g);
                return;
            }
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void a(float f2) {
        boolean z2;
        if (this.u == e.ALWAYS || this.u == e.ONLY_TOP) {
            if (this.G || this.F) {
                z2 = true;
            } else {
                z2 = false;
            }
            a(-1, z2, Float.valueOf(f2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015a, code lost:
        if (r0 != 2) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0169, code lost:
        if ((getNestedScrollY() + r4) <= 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017f, code lost:
        if (r0 != 2) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018e, code lost:
        if ((getNestedScrollY() + r4) >= 0) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 449
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.spring.SpringLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
        if (r1 != 2) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if ((getNestedScrollY() + r4) >= 0) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.spring.SpringLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        l.c(motionEvent, "");
        if (this.s) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 0;
        if (actionMasked == 0) {
            this.o = motionEvent.getPointerId(0);
            this.n = h.g.a.a(motionEvent.getY());
            this.f45682m = h.g.a.a(motionEvent.getX());
            if (this.B.t) {
                this.B.b();
            }
            f.a("onTouchEvent", null, null, null, null, null, null, null, null, null, null, null, 131068);
        } else if (actionMasked == 1) {
            b();
            f.a("onTouchEvent", null, null, null, null, null, null, null, null, null, null, null, 131068);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.o);
            if (findPointerIndex < 0) {
                return false;
            }
            int a2 = h.g.a.a(motionEvent.getY(findPointerIndex));
            int i3 = this.n - a2;
            this.n = a2;
            b(i3);
            f.a("onTouchEvent", null, null, Integer.valueOf(i3), null, null, null, null, null, null, null, null, 131052);
        } else if (actionMasked == 3) {
            b();
            f.a("onTouchEvent", null, null, null, null, null, null, null, null, null, null, null, 131068);
        } else if (actionMasked == 5) {
            this.o = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.n = h.g.a.a(motionEvent.getY(motionEvent.getActionIndex()));
            this.f45682m = h.g.a.a(motionEvent.getX(motionEvent.getActionIndex()));
        } else if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.o) {
            if (motionEvent.getActionIndex() == 0) {
                i2 = 1;
            }
            this.o = motionEvent.getPointerId(i2);
            this.n = h.g.a.a(motionEvent.getY(i2));
            this.f45682m = h.g.a.a(motionEvent.getX(i2));
        }
        return this.r;
    }

    private boolean b(int i2, int i3) {
        return this.f45679j.a(i2, i3);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f45679j.a(f2, f3);
    }

    private static boolean a(int i2, int i3) {
        if (((float) Math.abs(i3)) <= 10.0f || Math.abs(i3) <= Math.abs(i2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.h.o
    public final void b(View view, int i2) {
        l.c(view, "");
        this.f45678i.a(i2);
        if (i2 == 0) {
            c();
        }
        a(i2);
        f.a("onStopNestedScroll", Integer.valueOf(i2), null, null, null, null, null, null, null, null, null, null, 131066);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f45679j.a(f2, f3, z2);
    }

    private /* synthetic */ SpringLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.core.h.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        l.c(view, "");
        l.c(view2, "");
        b(view, view2, i2, 0);
    }

    @Override // androidx.core.h.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        l.c(view, "");
        l.c(view2, "");
        return a(view, view2, i2, 0);
    }

    @Override // androidx.core.h.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        l.c(view, "");
        f.a("onNestedFling", null, null, null, null, null, null, null, Float.valueOf(f3), null, null, null, 130046);
        this.w = f3;
        return dispatchNestedPreFling(f2, f3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpringLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        g gVar;
        e eVar;
        l.c(context, "");
        MethodCollector.i(9443);
        this.f45680k = new int[2];
        this.u = e.ALWAYS;
        this.v = g.NONE;
        this.f45675e = new com.bytedance.tux.widget.spring.a.a();
        this.x = 2000.0f;
        this.y = 0.55f;
        androidx.e.a.e eVar2 = new androidx.e.a.e();
        eVar2.b(1.0f);
        eVar2.c(0.0f);
        this.z = eVar2;
        this.A = 100.0f;
        androidx.e.a.d dVar = new androidx.e.a.d(this, androidx.e.a.b.n);
        dVar.a(eVar2);
        androidx.e.a.e eVar3 = dVar.x;
        l.a((Object) eVar3, "");
        eVar3.a(this.A);
        dVar.c((-this.x) + 1.0f);
        dVar.b((this.x - 1.0f) + ((float) getHeaderHeight()));
        dVar.a(new a(this));
        dVar.a(new b(this));
        this.B = dVar;
        this.E = -1;
        if (getChildCount() <= 1) {
            this.f45678i = new q();
            this.f45679j = new m(this);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap6, R.attr.aqa, R.attr.aqn}, 0, 0);
            l.a((Object) obtainStyledAttributes, "");
            if (obtainStyledAttributes.getInt(2, 0) != 1) {
                gVar = g.NONE;
            } else {
                gVar = g.REFRESH;
            }
            this.v = gVar;
            int i3 = obtainStyledAttributes.getInt(1, 3);
            if (i3 == 0) {
                eVar = e.NONE;
            } else if (i3 == 1) {
                eVar = e.ONLY_TOP;
            } else if (i3 != 2) {
                eVar = e.ALWAYS;
            } else {
                eVar = e.ONLY_BOTTOM;
            }
            this.u = eVar;
            this.f45673c = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            MethodCollector.o(9443);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Spring layout just have one child view");
        MethodCollector.o(9443);
        throw illegalArgumentException;
    }

    private final void a(int i2, boolean z2, Float f2) {
        float f3;
        float f4;
        float f5;
        if (this.B.t) {
            this.B.b();
        }
        if (i2 != 0) {
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, this.w);
            }
            z.b bVar = new z.b();
            if (f2 != null) {
                f4 = f2.floatValue();
            } else {
                VelocityTracker velocityTracker2 = this.t;
                if (velocityTracker2 != null) {
                    f3 = velocityTracker2.getYVelocity(this.o);
                } else {
                    f3 = 0.0f;
                }
                bVar.element = f3;
                if (i2 < 0) {
                    if (bVar.element > 0.0f) {
                        f5 = bVar.element;
                    } else {
                        f4 = bVar.element;
                    }
                } else if (bVar.element < 0.0f) {
                    f5 = bVar.element;
                } else {
                    f4 = bVar.element;
                }
                f4 = -f5;
            }
            bVar.element = f4;
            androidx.e.a.d dVar = this.B;
            if (i2 >= 0 || this.v != g.REFRESH || !z2 || (getNestedScrollY() >= (-getHeaderHeight()) && !this.G)) {
                int nestedScrollY = getNestedScrollY();
                int i3 = this.E;
                if (1 <= i3 && nestedScrollY >= i3 && z2) {
                    androidx.e.a.e eVar = dVar.x;
                    l.a((Object) eVar, "");
                    eVar.c((float) this.E);
                    if (!this.F) {
                        setHoverAtBottom(true);
                    }
                } else {
                    androidx.e.a.e eVar2 = dVar.x;
                    l.a((Object) eVar2, "");
                    eVar2.c((float) getHeaderHeight());
                }
            } else {
                androidx.e.a.e eVar3 = dVar.x;
                l.a((Object) eVar3, "");
                eVar3.c(0.0f);
                if (!this.G) {
                    setRefreshing(true);
                }
            }
            dVar.a(bVar.element / 2.0f);
            f.a("startAnimation", null, null, null, null, null, null, null, null, null, Integer.valueOf(getScrollY()), Integer.valueOf(i2), 106494);
            dVar.a();
        }
    }

    @Override // androidx.core.h.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        l.c(view, "");
        f.a("onNestedFling", null, null, null, null, null, null, null, Float.valueOf(f3), null, null, null, 130046);
        return false;
    }

    @Override // androidx.core.h.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        l.c(view, "");
        l.c(iArr, "");
        a(view, i2, i3, iArr, 0);
    }

    @Override // androidx.core.h.o
    public final void b(View view, View view2, int i2, int i3) {
        l.c(view, "");
        l.c(view2, "");
        this.f45678i.a(i2, i3);
        b(2, i3);
        if (!this.f45673c) {
            this.s = true;
        }
        if (i3 == 0 && this.B.t) {
            this.B.b();
        }
        f.a("onNestedScrollAccept", Integer.valueOf(i3), null, null, null, null, null, null, null, null, null, null, 131066);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f45679j.a(i2, i3, i4, i5, iArr);
    }

    @Override // androidx.core.h.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        l.c(view, "");
        a(view, i2, i3, i4, i5, 0, this.f45680k);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int headerHeight = getHeaderHeight();
        com.bytedance.tux.widget.spring.b.a aVar = this.f45681l;
        if (!(aVar instanceof View)) {
            aVar = null;
        }
        View view = (View) aVar;
        if (view != null) {
            view.layout(0, 0, view.getMeasuredWidth(), headerHeight);
        }
        View nestedChild = getNestedChild();
        if (nestedChild != null) {
            nestedChild.layout(0, headerHeight, nestedChild.getMeasuredWidth(), nestedChild.getMeasuredHeight() + headerHeight);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    @Override // androidx.core.h.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r14, int r15, int r16, int[] r17, int r18) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.spring.SpringLayout.a(android.view.View, int, int, int[], int):void");
    }

    @Override // androidx.core.h.o
    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        l.c(view, "");
        a(view, i2, i3, i4, i5, i6, this.f45680k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r16.u == com.bytedance.tux.widget.spring.e.ALWAYS) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.view.View r17, int r18, int r19, int r20, int r21, int r22, int[] r23) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.spring.SpringLayout.a(android.view.View, int, int, int, int, int, int[]):void");
    }
}
