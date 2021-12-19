package com.ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.zhiliaoapp.musically.R;

public class ScrollableLayout extends LinearLayout {
    protected boolean A;
    protected int B;
    protected int C;
    protected int D;
    protected int E;
    protected boolean F;
    protected int G;
    protected boolean H;
    protected b I;
    protected a J;
    protected boolean K;
    int L;
    private boolean M;

    /* renamed from: a  reason: collision with root package name */
    protected Context f76590a;

    /* renamed from: b  reason: collision with root package name */
    protected Scroller f76591b;

    /* renamed from: c  reason: collision with root package name */
    protected float f76592c;

    /* renamed from: d  reason: collision with root package name */
    protected float f76593d;

    /* renamed from: e  reason: collision with root package name */
    protected float f76594e;

    /* renamed from: f  reason: collision with root package name */
    protected float f76595f;

    /* renamed from: g  reason: collision with root package name */
    protected VelocityTracker f76596g;

    /* renamed from: h  reason: collision with root package name */
    protected int f76597h;

    /* renamed from: i  reason: collision with root package name */
    protected int f76598i;

    /* renamed from: j  reason: collision with root package name */
    protected int f76599j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f76600k;

    /* renamed from: l  reason: collision with root package name */
    protected float f76601l;

    /* renamed from: m  reason: collision with root package name */
    protected float f76602m;
    protected float n;
    protected float o;
    protected float p;
    protected float q;
    protected View r;
    protected ViewPager s;
    protected a t;
    protected int u;
    protected int v;
    protected int w;
    protected boolean x;
    protected boolean y;
    protected int z;

    public interface b {
        static {
            Covode.recordClassIndex(47290);
        }

        void a(float f2, float f3);

        boolean an_();

        void b(int i2, int i3);
    }

    static {
        Covode.recordClassIndex(47288);
    }

    public int getCurScrollY() {
        return this.E;
    }

    public a getHelper() {
        return this.J;
    }

    public int getMaxY() {
        return this.C;
    }

    public int getMinY() {
        return this.B;
    }

    public int getTabsMarginTop() {
        return this.D;
    }

    private boolean b() {
        if (this.E >= this.C) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (this.E != 0) {
            scrollTo(0, 0);
        }
    }

    public enum a {
        UP,
        DOWN;

        static {
            Covode.recordClassIndex(47289);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        View view = this.r;
        if (view != null && !view.isClickable()) {
            this.r.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.s = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public void computeScroll() {
        if (this.f76591b.computeScrollOffset()) {
            int currY = this.f76591b.getCurrY();
            int i2 = 0;
            if (this.t != a.UP) {
                if (this.J.b()) {
                    scrollTo(0, getScrollY() + (currY - this.z));
                    if (this.E <= this.B) {
                        this.f76591b.forceFinished(true);
                        if ((getParent() instanceof SpringLayout) && this.M) {
                            float currVelocity = this.f76591b.getCurrVelocity();
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
            } else if (b()) {
                int finalY = this.f76591b.getFinalY() - currY;
                int duration = this.f76591b.getDuration() - this.f76591b.timePassed();
                a aVar = this.J;
                Scroller scroller = this.f76591b;
                if (scroller != null) {
                    if (this.w >= 14) {
                        i2 = (int) scroller.getCurrVelocity();
                    } else {
                        i2 = finalY / duration;
                    }
                }
                aVar.a(i2, finalY, duration);
                this.f76591b.forceFinished(true);
                return;
            } else {
                scrollTo(0, currY);
            }
            this.z = currY;
        }
    }

    public void setMinY(int i2) {
        this.B = i2;
    }

    public void setOnScrollListener(b bVar) {
        this.I = bVar;
    }

    public void setScrollMinY(int i2) {
        this.G = i2;
    }

    public void setTabsMarginTop(int i2) {
        this.D = i2;
    }

    public void setCanScrollUp(boolean z2) {
        if (this.H != z2) {
            this.H = z2;
            if (z2) {
                this.C = this.u - this.D;
                return;
            }
            if (this.E != 0) {
                scrollTo(0, 0);
            }
            this.C = 0;
        }
    }

    public void setMaxScrollHeight(int i2) {
        int min = Math.min(i2, this.u - this.D);
        this.C = min;
        this.C = Math.max(min, 0);
    }

    public boolean canScrollVertically(int i2) {
        View a2;
        if (i2 < 0) {
            if (getScrollY() > this.B) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || (a2 = this.J.a()) == null) {
            return super.canScrollVertically(i2);
        } else {
            if (a2.canScrollVertically(i2) || getScrollY() < this.C) {
                return true;
            }
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        a aVar;
        int i2;
        try {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int abs = (int) Math.abs(x2 - this.f76592c);
            int abs2 = (int) Math.abs(y2 - this.f76593d);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.A = false;
                this.f76600k = false;
                this.f76601l = motionEvent.getRawX();
                this.f76602m = motionEvent.getRawY();
                this.x = true;
                this.y = true;
                this.f76592c = x2;
                this.f76593d = y2;
                this.f76594e = x2;
                this.f76595f = y2;
                this.v = getScrollY();
                if (((int) y2) + getScrollY() <= this.u) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.F = z2;
                VelocityTracker velocityTracker = this.f76596g;
                if (velocityTracker == null) {
                    this.f76596g = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.f76596g.addMovement(motionEvent);
                this.f76591b.forceFinished(true);
                this.M = false;
            } else if (action == 1) {
                b bVar = this.I;
                if (bVar != null) {
                    bVar.an_();
                }
                if (this.y && abs2 > abs && abs2 > this.f76597h) {
                    this.f76596g.computeCurrentVelocity(1000, (float) this.f76599j);
                    float f2 = -this.f76596g.getYVelocity();
                    if (Math.abs(f2) > ((float) this.f76598i)) {
                        if (f2 > 0.0f) {
                            aVar = a.UP;
                        } else {
                            aVar = a.DOWN;
                        }
                        this.t = aVar;
                        if (aVar != a.UP || !b()) {
                            this.f76591b.fling(0, getScrollY(), 0, (int) f2, 0, 0, -2147483647, Integer.MAX_VALUE);
                            this.M = true;
                            this.f76591b.computeScrollOffset();
                            this.z = getScrollY();
                            invalidate();
                        }
                    }
                    if (this.F || !b()) {
                        int action2 = motionEvent.getAction();
                        motionEvent.setAction(3);
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        motionEvent.setAction(action2);
                        return dispatchTouchEvent;
                    }
                }
            } else if (action != 2) {
                if (action == 3) {
                    b bVar2 = this.I;
                    if (bVar2 != null) {
                        bVar2.an_();
                    }
                    if (this.y && this.F && (abs > (i2 = this.f76597h) || abs2 > i2)) {
                        int action3 = motionEvent.getAction();
                        motionEvent.setAction(3);
                        boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                        motionEvent.setAction(action3);
                        return dispatchTouchEvent2;
                    }
                }
            } else if (!this.A) {
                if (this.f76596g == null) {
                    this.f76596g = VelocityTracker.obtain();
                }
                this.f76596g.addMovement(motionEvent);
                float f3 = this.f76595f - y2;
                b bVar3 = this.I;
                if (bVar3 != null) {
                    bVar3.a(this.f76594e - x2, f3);
                }
                if (this.x) {
                    int i3 = this.f76597h;
                    if (abs > i3 && abs > abs2) {
                        this.x = false;
                        this.y = false;
                    } else if (abs2 > i3 && abs2 > abs) {
                        this.x = false;
                        this.y = true;
                    }
                }
                if (this.y && abs2 > this.f76597h && abs2 > abs && (!b() || this.J.b())) {
                    ViewPager viewPager = this.s;
                    if (viewPager != null) {
                        viewPager.requestDisallowInterceptTouchEvent(true);
                    }
                    scrollBy(0, (int) (f3 + 0.5f));
                }
                this.f76594e = x2;
                this.f76595f = y2;
                this.n = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                this.o = rawY;
                this.p = (float) ((int) (this.n - this.f76601l));
                float f4 = (float) ((int) (rawY - this.f76602m));
                this.q = f4;
                if (Math.abs(f4) <= ((float) this.G) || Math.abs(this.q) * 0.1f <= Math.abs(this.p)) {
                    this.f76600k = true;
                } else {
                    this.f76600k = false;
                }
            }
            super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        return true;
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void scrollBy(int i2, int i3) {
        int scrollY = getScrollY();
        if (scrollY + i3 < this.L) {
            i3 /= 3;
        }
        int i4 = i3 + scrollY;
        int i5 = this.C;
        if (i4 >= i5 || i4 <= (i5 = this.B)) {
            i4 = i5;
        }
        super.scrollBy(i2, i4 - scrollY);
    }

    public void scrollTo(int i2, int i3) {
        int i4 = this.C;
        if (i3 >= i4) {
            i3 = i4;
        } else {
            int i5 = this.B;
            if (i3 <= i5) {
                i3 = i5;
            }
        }
        this.E = i3;
        b bVar = this.I;
        if (bVar != null) {
            bVar.b(i3, i4);
        }
        super.scrollTo(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(1635);
        View childAt = getChildAt(0);
        this.r = childAt;
        if (childAt != null) {
            measureChildWithMargins(childAt, i2, 0, 0, 0);
            this.u = this.r.getMeasuredHeight();
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) + (this.u - this.D), 1073741824));
        if (!this.K) {
            this.C = this.u - this.D;
            this.K = true;
        }
        if (!this.H) {
            this.C = 0;
        }
        MethodCollector.o(1635);
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(1623);
        this.G = 10;
        this.H = true;
        this.f76590a = context;
        this.J = new a();
        this.f76591b = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f76597h = viewConfiguration.getScaledTouchSlop();
        this.f76598i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f76599j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.w = Build.VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ahf});
        this.D = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        MethodCollector.o(1623);
    }
}
