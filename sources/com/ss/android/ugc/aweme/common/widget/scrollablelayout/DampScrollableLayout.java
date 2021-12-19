package com.ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.a.b;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.ss.android.ugc.aweme.commercialize.utils.bc;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.zhiliaoapp.musically.R;
import h.p;
import java.util.ArrayList;
import java.util.List;

public class DampScrollableLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final String f76576a = DampScrollableLayout.class.getSimpleName();
    protected int A;
    protected boolean B;
    protected int C;
    protected int D;
    protected int E;
    protected int F;
    protected int G;
    protected boolean H;
    protected int I;
    public bc J;
    protected boolean K;
    public List<ScrollableLayout.b> L;
    protected ScrollableLayout.b M;
    protected a N;
    protected boolean O;
    private boolean P;
    private boolean Q;

    /* renamed from: b  reason: collision with root package name */
    protected Context f76577b;

    /* renamed from: c  reason: collision with root package name */
    protected Scroller f76578c;

    /* renamed from: d  reason: collision with root package name */
    protected float f76579d;

    /* renamed from: e  reason: collision with root package name */
    protected float f76580e;

    /* renamed from: f  reason: collision with root package name */
    protected float f76581f;

    /* renamed from: g  reason: collision with root package name */
    protected float f76582g;

    /* renamed from: h  reason: collision with root package name */
    protected VelocityTracker f76583h;

    /* renamed from: i  reason: collision with root package name */
    protected int f76584i;

    /* renamed from: j  reason: collision with root package name */
    protected int f76585j;

    /* renamed from: k  reason: collision with root package name */
    protected int f76586k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f76587l;

    /* renamed from: m  reason: collision with root package name */
    protected float f76588m;
    protected float n;
    protected float o;
    protected float p;
    protected float q;
    protected float r;
    protected View s;
    protected ViewPager t;
    protected a u;
    protected int v;
    protected int w;
    protected int x;
    protected boolean y;
    protected boolean z;

    public int getCurScrollY() {
        return this.G;
    }

    public a getHelper() {
        return this.N;
    }

    public int getMaxY() {
        return this.D;
    }

    public int getMinY() {
        return this.C;
    }

    public int getTabsMarginTop() {
        return this.F;
    }

    private void c() {
        this.f76578c.forceFinished(true);
    }

    static {
        Covode.recordClassIndex(47286);
    }

    public boolean b() {
        if (this.G >= this.D) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (this.G != 0) {
            scrollTo(0, 0);
        }
    }

    public enum a {
        UP,
        DOWN;

        static {
            Covode.recordClassIndex(47287);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        View view = this.s;
        if (view != null && !view.isClickable()) {
            this.s.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.t = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public void computeScroll() {
        if (this.f76578c.computeScrollOffset()) {
            int currY = this.f76578c.getCurrY();
            if (this.u == a.UP) {
                if (b()) {
                    int finalY = this.f76578c.getFinalY() - currY;
                    int duration = this.f76578c.getDuration() - this.f76578c.timePassed();
                    this.N.a(a(finalY, duration), finalY, duration);
                    c();
                    return;
                }
                scrollTo(0, currY);
            } else if (this.N.b()) {
                scrollTo(0, getScrollY() + (currY - this.A));
                if ((Math.abs(a(this.f76578c.getFinalY() - currY, this.f76578c.getDuration() - this.f76578c.timePassed())) <= 0 || Math.abs(Math.max(this.f76578c.getFinalY(), this.C) - this.G) < 5) && this.G < this.E) {
                    this.f76578c.abortAnimation();
                    Scroller scroller = this.f76578c;
                    int i2 = this.G;
                    scroller.startScroll(0, i2, 0, -i2, Math.abs(i2) * 2);
                    this.u = a.UP;
                    return;
                } else if (this.G <= this.C) {
                    c();
                    if ((getParent() instanceof SpringLayout) && this.Q) {
                        float currVelocity = this.f76578c.getCurrVelocity();
                        if (currVelocity > 0.0f) {
                            currVelocity = -currVelocity;
                        }
                        ((SpringLayout) getParent()).a(currVelocity);
                        return;
                    }
                    return;
                }
            }
            invalidate();
            this.A = currY;
        }
    }

    public void setMinY(int i2) {
        this.C = i2;
    }

    public void setOnScrollListener(ScrollableLayout.b bVar) {
        this.M = bVar;
    }

    public void setScrollMinY(int i2) {
        this.I = i2;
    }

    public void setTabsMarginTop(int i2) {
        this.F = i2;
        this.P = true;
    }

    public void setMaxScrollHeight(int i2) {
        int min = Math.min(i2, this.v - this.F);
        this.D = min;
        this.D = Math.max(min, 0);
    }

    public final void a(float f2) {
        Float valueOf = Float.valueOf(1.0f);
        com.ss.android.ugc.aweme.common.h.a.a(this, new p(valueOf, valueOf), new p(valueOf, Float.valueOf(f2)));
        this.f76578c.abortAnimation();
    }

    public boolean canScrollVertically(int i2) {
        View a2 = this.N.a();
        if (i2 < 0) {
            if (getScrollY() > this.C) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || a2 == null) {
            return super.canScrollVertically(i2);
        } else {
            if (a2.canScrollVertically(i2) || getScrollY() < this.D) {
                return true;
            }
            return false;
        }
    }

    public void setCanScrollUp(boolean z2) {
        if (z2) {
            this.D = this.v - this.F;
        }
        if (this.P || this.K != z2) {
            this.K = z2;
            if (!z2) {
                if (this.G != 0) {
                    scrollTo(0, 0);
                }
                this.D = 0;
            }
            this.P = false;
        }
    }

    public final void a(ScrollableLayout.b bVar) {
        if (bVar != null && !this.L.contains(bVar)) {
            this.L.add(bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016f, code lost:
        if (r4.an_() == false) goto L_0x0171;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 577
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public DampScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int a(int i2, int i3) {
        if (this.f76578c == null || i3 == 0) {
            return 0;
        }
        return i2 / i3;
    }

    public void scrollBy(int i2, int i3) {
        int i4;
        int scrollY = getScrollY();
        if (i3 < 0 && (i4 = scrollY + i3) < this.E) {
            i3 = (int) (((float) i3) * 1.2f * (1.0f - ((1.0f / ((float) this.C)) * ((float) i4))));
        }
        int i5 = i3 + scrollY;
        int i6 = this.D;
        if (i5 >= i6 || i5 <= (i6 = this.C)) {
            i5 = i6;
        }
        super.scrollBy(i2, i5 - scrollY);
    }

    public void scrollTo(int i2, int i3) {
        int i4 = this.D;
        if (i3 >= i4 || i3 <= (i4 = this.C)) {
            i3 = i4;
        }
        this.G = i3;
        ScrollableLayout.b bVar = this.M;
        if (bVar != null && (!(bVar instanceof b) || ((b) bVar).ab_())) {
            this.M.b(i3, this.D);
        }
        for (ScrollableLayout.b bVar2 : this.L) {
            bVar2.b(i3, this.D);
        }
        super.scrollTo(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(8369);
        View childAt = getChildAt(0);
        this.s = childAt;
        if (childAt != null) {
            measureChildWithMargins(childAt, i2, 0, 0, 0);
            this.v = this.s.getMeasuredHeight();
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) + (this.v - this.F), 1073741824));
        if (!this.O) {
            this.D = this.v - this.F;
            this.O = true;
        }
        if (!this.K) {
            this.D = 0;
        }
        MethodCollector.o(8369);
    }

    public DampScrollableLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8367);
        this.I = 10;
        this.K = true;
        this.L = new ArrayList();
        this.O = false;
        this.f76577b = context;
        this.N = new a();
        this.f76578c = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f76584i = viewConfiguration.getScaledTouchSlop();
        this.f76585j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f76586k = viewConfiguration.getScaledMaximumFlingVelocity();
        this.x = Build.VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ahf});
        this.F = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        MethodCollector.o(8367);
    }
}
