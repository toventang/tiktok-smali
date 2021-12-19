package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.ui.k;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.feed.n.l;
import com.ss.android.ugc.aweme.feed.n.m;
import com.ss.android.ugc.aweme.utils.gb;
import java.util.ArrayList;
import java.util.List;

public class SlideSwitchLayout extends HorizontalScrollView {

    /* renamed from: b  reason: collision with root package name */
    public static final int f94141b = i.c(d.a());

    /* renamed from: d  reason: collision with root package name */
    public static final int f94142d = ((int) n.b(d.a(), 8.0f));
    private static final int q = ViewConfiguration.getMaximumFlingVelocity();
    private static final int x = ((int) n.b(d.a(), 500.0f));
    private Runnable A;
    private k B;
    private m C;
    private l D;

    /* renamed from: a  reason: collision with root package name */
    boolean f94143a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f94144c;

    /* renamed from: e  reason: collision with root package name */
    public long f94145e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f94146f;

    /* renamed from: g  reason: collision with root package name */
    public int f94147g;

    /* renamed from: h  reason: collision with root package name */
    public int f94148h;

    /* renamed from: i  reason: collision with root package name */
    boolean f94149i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.n.k f94150j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f94151k;

    /* renamed from: l  reason: collision with root package name */
    private int f94152l;

    /* renamed from: m  reason: collision with root package name */
    private int f94153m;
    private int n;
    private List<a> o;
    private VelocityTracker p;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean y;
    private boolean z;

    public void fling(int i2) {
    }

    public int getCurrentItem() {
        return this.f94148h;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f94159a;

        /* renamed from: b  reason: collision with root package name */
        public String f94160b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f94161c = true;

        static {
            Covode.recordClassIndex(59836);
        }

        public final int hashCode() {
            return this.f94160b.hashCode();
        }

        public a(String str) {
            this.f94160b = str;
            this.f94159a = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.f94160b.equals(((a) obj).f94160b);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        b(this.f94148h);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.p = VelocityTracker.obtain();
    }

    public String getCurrentItemName() {
        if (this.o.isEmpty()) {
            return "";
        }
        return this.o.get(this.f94148h).f94160b;
    }

    static {
        Covode.recordClassIndex(59832);
    }

    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
    }

    public void setCanScroll(boolean z2) {
        this.f94144c = z2;
    }

    public void setOnFeedScrollListener(l lVar) {
        this.D = lVar;
    }

    public void setOnFlingEndListener(k kVar) {
        this.B = kVar;
    }

    public void setOnFlingToIndexListener(m mVar) {
        this.C = mVar;
    }

    public void setOnPageChangeListener(com.ss.android.ugc.aweme.feed.n.k kVar) {
        this.f94150j = kVar;
    }

    public void setOverScrollLeftAction(Runnable runnable) {
        this.A = runnable;
    }

    public void setScrowToChildWhenRequestChildFocus(boolean z2) {
        this.f94151k = z2;
    }

    private void b(int i2) {
        setScrollX(i2 * f94141b);
    }

    private void setCurrentItem(int i2) {
        a(i2, true, "FROM_SLIDE");
    }

    private boolean b(MotionEvent motionEvent) {
        if (!d(motionEvent) || !c(motionEvent)) {
            return false;
        }
        return true;
    }

    private boolean c(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (this.f94151k) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            a();
        }
    }

    public void setCurrentItem(String str) {
        a(str, true, "FROM_SLIDE");
    }

    public final void b(String str) {
        a(str, false, "FROM_SLIDE");
    }

    public void setCanScrollToProfile(boolean z2) {
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            a aVar = this.o.get(i2);
            if (TextUtils.equals(aVar.f94160b, "page_profile")) {
                aVar.f94161c = z2;
                return;
            }
        }
    }

    private boolean d(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        Runnable runnable;
        int findPointerIndex = motionEvent.findPointerIndex(this.r);
        boolean z5 = false;
        if (findPointerIndex == -1) {
            return false;
        }
        int x2 = (int) motionEvent.getX(findPointerIndex);
        int abs = Math.abs(x2 - this.f94152l);
        int i3 = f94141b;
        if (abs <= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = this.f94152l;
        if (x2 - i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            int i5 = this.n - (x2 - i4);
            int i6 = this.f94148h;
            if (i6 <= 0) {
                i2 = i6;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.f94153m;
            if (i6 < i7) {
                i7 = i6 + 1;
            }
            if (i5 < 0 || !a(i2)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i5 <= this.f94153m * i3 && a(i7)) {
                z5 = true;
            }
            if (z3) {
                z2 = z4;
            } else {
                z2 = z5;
            }
            if (!z4 && !this.z && (runnable = this.A) != null) {
                this.z = true;
                runnable.run();
            }
        }
        return z2;
    }

    private boolean a(int i2) {
        if (this.o.isEmpty() || i2 >= this.o.size()) {
            return false;
        }
        return this.o.get(i2).f94161c;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f94144c) {
            return false;
        }
        if (this.f94146f) {
            return true;
        }
        if (this.f94145e != 0 && System.currentTimeMillis() - this.f94145e < 150) {
            return this.f94149i;
        }
        if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
            return false;
        }
        this.f94149i = false;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.s = (int) motionEvent.getX();
            this.t = (int) motionEvent.getY();
            a(motionEvent);
            this.w = true;
        } else if (action == 1) {
            this.f94149i = false;
        } else if (action != 2) {
            this.f94149i = true;
        } else {
            float abs = Math.abs(((float) this.s) - motionEvent.getX());
            float abs2 = Math.abs(((float) this.t) - motionEvent.getY());
            int i2 = f94142d;
            if ((abs > ((float) i2) || abs2 > ((float) i2)) && this.w) {
                if (abs - abs2 >= 0.0f) {
                    this.f94149i = true;
                } else {
                    this.f94149i = false;
                }
                this.w = false;
            }
        }
        return this.f94149i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int i2;
        if (!this.f94144c) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.p == null) {
            this.p = VelocityTracker.obtain();
        }
        this.p.addMovement(motionEvent);
        if (action == 0) {
            return a(motionEvent);
        }
        if (action != 1) {
            if (action == 2) {
                if (this.D != null) {
                    getScrollX();
                }
                return b(motionEvent);
            } else if (action != 3) {
                return false;
            }
        }
        int x2 = (int) motionEvent.getX();
        VelocityTracker velocityTracker = this.p;
        if (x2 <= this.s) {
            z2 = true;
        } else {
            z2 = false;
        }
        velocityTracker.computeCurrentVelocity(1000, (float) q);
        float xVelocity = velocityTracker.getXVelocity(this.r);
        int scrollX = getScrollX();
        int i3 = f94141b;
        int i4 = scrollX % i3;
        if (i4 == 0) {
            k kVar = this.B;
            if (kVar != null && z2) {
                kVar.a();
            }
        } else {
            int scrollX2 = getScrollX() / i3;
            if (Math.abs(xVelocity) >= ((float) x) ? xVelocity >= 0.0f : i4 <= i3 / 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            a(androidx.core.b.a.a(scrollX2 + i2, 0, this.f94153m), true, "FROM_SLIDE");
            VelocityTracker velocityTracker2 = this.p;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
                this.p.recycle();
                this.p = null;
            }
        }
        this.y = false;
        boolean b2 = b(motionEvent);
        this.z = false;
        return b2;
    }

    private boolean a(MotionEvent motionEvent) {
        this.r = motionEvent.getPointerId(0);
        this.f94152l = (int) motionEvent.getX();
        this.n = getScrollX();
        return super.onTouchEvent(motionEvent);
    }

    public final void a(String str) {
        if (gb.a(getContext())) {
            this.o.add(0, new a(str));
        } else {
            this.o.add(new a(str));
        }
        this.f94153m = this.o.size() - 1;
    }

    public void scrollTo(int i2, int i3) {
        super.scrollTo(i2, i3);
    }

    public SlideSwitchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void scrollBy(int i2, int i3) {
        if ((-i2) != f94141b) {
            super.scrollBy(i2, i3);
        }
    }

    private void a(final int i2, final String str) {
        post(new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout.AnonymousClass2 */

            static {
                Covode.recordClassIndex(59834);
            }

            public final void run() {
                SlideSwitchLayout.this.smoothScrollTo(i2 * SlideSwitchLayout.f94141b, 0);
                SlideSwitchLayout.this.f94145e = System.currentTimeMillis();
                SlideSwitchLayout slideSwitchLayout = SlideSwitchLayout.this;
                slideSwitchLayout.f94147g = slideSwitchLayout.f94148h;
                SlideSwitchLayout.this.f94148h = i2;
            }
        });
        this.f94146f = true;
        postDelayed(new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout.AnonymousClass3 */

            static {
                Covode.recordClassIndex(59835);
            }

            public final void run() {
                SlideSwitchLayout.this.f94146f = false;
            }
        }, 150);
    }

    public void requestChildFocus(View view, View view2) {
        if (!(view2 == null || view2.getTag() == null)) {
            Object tag = view2.getTag();
            if ((tag instanceof String) && TextUtils.equals((String) tag, "relation_search_tag")) {
                super.requestChildFocus(view, view2);
                return;
            }
        }
        if (!TextUtils.equals(getCurrentItemName(), "page_feed")) {
            super.requestChildFocus(view, view2);
        }
    }

    private SlideSwitchLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(12878);
        this.f94151k = true;
        this.o = new ArrayList(5);
        this.f94144c = false;
        this.u = true;
        this.v = true;
        this.w = false;
        this.f94146f = false;
        this.f94147g = 0;
        this.f94148h = 0;
        this.y = false;
        this.f94149i = false;
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59833);
            }

            public final boolean onPreDraw() {
                SlideSwitchLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                SlideSwitchLayout slideSwitchLayout = SlideSwitchLayout.this;
                if (slideSwitchLayout.f94143a) {
                    return false;
                }
                slideSwitchLayout.f94143a = true;
                slideSwitchLayout.a();
                return false;
            }
        });
        MethodCollector.o(12878);
    }

    private void a(int i2, boolean z2, String str) {
        if (!z2) {
            int i3 = this.f94148h;
            if (i2 != i3) {
                this.f94147g = i3;
                this.f94148h = i2;
                if (this.f94143a) {
                    b(i2);
                }
            }
        } else if (i2 != this.f94148h || getScrollX() != f94141b * i2) {
            a(i2, str);
        }
    }

    private void a(String str, boolean z2, String str2) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.o.size()) {
                break;
            } else if (TextUtils.equals(str, this.o.get(i3).f94160b)) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        a(i2, z2, str2);
    }
}
