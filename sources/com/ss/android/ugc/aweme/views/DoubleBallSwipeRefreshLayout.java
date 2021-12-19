package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.Scroller;
import androidx.core.h.j;
import androidx.core.h.m;
import androidx.core.h.n;
import androidx.core.h.q;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DoubleColorBallAnimationView;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.d;

public class DoubleBallSwipeRefreshLayout extends ViewGroup implements j, n, b {
    private static final int[] H = {16842766};
    private static final String p = DoubleBallSwipeRefreshLayout.class.getSimpleName();
    private int A;
    private float B;
    private float C;
    private boolean D;
    private int E = -1;
    private boolean F;
    private final DecelerateInterpolator G;
    private Animation I;
    private Animation J;
    private Animation K;
    private Animation L;
    private int M;
    private int N;
    private int O;
    private a P;
    private SwipeRefreshLayout.c Q;
    private Animation.AnimationListener R = new Animation.AnimationListener() {
        /* class com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.AnonymousClass1 */

        static {
            Covode.recordClassIndex(94564);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            if (DoubleBallSwipeRefreshLayout.this.f144446b) {
                DoubleBallSwipeRefreshLayout.this.o.b();
                DoubleBallSwipeRefreshLayout.this.f144455k.setAlpha(255);
                if (DoubleBallSwipeRefreshLayout.this.f144457m && DoubleBallSwipeRefreshLayout.this.f144445a != null) {
                    DoubleBallSwipeRefreshLayout.this.f144445a.a();
                    return;
                }
                return;
            }
            DoubleBallSwipeRefreshLayout.this.b();
        }
    };
    private final Animation S = new Animation() {
        /* class com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.AnonymousClass6 */

        static {
            Covode.recordClassIndex(94569);
        }

        public final void applyTransformation(float f2, Transformation transformation) {
            if (!DoubleBallSwipeRefreshLayout.this.n) {
                Math.abs(DoubleBallSwipeRefreshLayout.this.f144453i);
            }
            DoubleBallSwipeRefreshLayout.this.f144455k.a(1.0f - f2);
        }
    };
    private final Animation T = new Animation() {
        /* class com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.AnonymousClass7 */

        static {
            Covode.recordClassIndex(94570);
        }

        public final void applyTransformation(float f2, Transformation transformation) {
        }
    };

    /* renamed from: a  reason: collision with root package name */
    SwipeRefreshLayout.b f144445a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f144446b;

    /* renamed from: c  reason: collision with root package name */
    public float f144447c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    int f144448d;

    /* renamed from: e  reason: collision with root package name */
    boolean f144449e;

    /* renamed from: f  reason: collision with root package name */
    DoubleColorBallAnimationView f144450f;

    /* renamed from: g  reason: collision with root package name */
    protected int f144451g;

    /* renamed from: h  reason: collision with root package name */
    float f144452h;

    /* renamed from: i  reason: collision with root package name */
    protected int f144453i;

    /* renamed from: j  reason: collision with root package name */
    int f144454j;

    /* renamed from: k  reason: collision with root package name */
    n f144455k;

    /* renamed from: l  reason: collision with root package name */
    Animation f144456l;

    /* renamed from: m  reason: collision with root package name */
    boolean f144457m;
    boolean n;
    d o = new d() {
        /* class com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.AnonymousClass9 */

        static {
            Covode.recordClassIndex(94572);
        }
    };
    private View q;
    private int r;
    private boolean s;
    private Scroller t;
    private float u;
    private final q v;
    private final m w;
    private final int[] x = new int[2];
    private final int[] y = new int[2];
    private boolean z;

    public interface a {
        static {
            Covode.recordClassIndex(94573);
        }

        boolean a();
    }

    public void setColorScheme(int... iArr) {
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b
    public final boolean a() {
        return this.f144446b;
    }

    public int getProgressCircleDiameter() {
        return this.M;
    }

    public int getProgressViewEndOffset() {
        return this.f144454j;
    }

    public int getProgressViewStartOffset() {
        return this.f144453i;
    }

    private static boolean c() {
        int i2 = Build.VERSION.SDK_INT;
        return false;
    }

    private void h() {
        int i2 = Build.VERSION.SDK_INT;
    }

    public int getNestedScrollAxes() {
        return this.v.a();
    }

    public boolean hasNestedScrollingParent() {
        return this.w.a(0);
    }

    @Override // androidx.core.h.j
    public boolean isNestedScrollingEnabled() {
        return this.w.f2548a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // androidx.core.h.j
    public void stopNestedScroll() {
        this.w.b(0);
    }

    private void d() {
        this.J = a(this.f144455k.getAlpha(), 76);
    }

    private void e() {
        this.K = a(this.f144455k.getAlpha(), 255);
    }

    static {
        Covode.recordClassIndex(94563);
    }

    private void f() {
        if (this.q == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.f144450f)) {
                    this.q = childAt;
                    return;
                }
            }
        }
    }

    private boolean g() {
        a aVar = this.P;
        if (aVar != null) {
            return aVar.a();
        }
        int i2 = Build.VERSION.SDK_INT;
        return this.q.canScrollVertically(-1);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.o.a();
        this.f144455k.stop();
        setColorViewAlpha(255);
        if (this.f144449e) {
            setAnimationProgress(0.0f);
        } else {
            h();
        }
    }

    public void computeScroll() {
        if (this.t.computeScrollOffset()) {
            scrollTo(this.t.getCurrX(), this.t.getCurrY());
            invalidate();
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.f144447c = (float) i2;
    }

    public void setDoNotCatchException(boolean z2) {
        this.s = z2;
    }

    public void setOnChildScrollUpCallback(a aVar) {
        this.P = aVar;
    }

    public void setOnRefreshListener(SwipeRefreshLayout.b bVar) {
        this.f144445a = bVar;
    }

    public void setOnSwipeChangeListener(SwipeRefreshLayout.c cVar) {
        this.Q = cVar;
    }

    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    private void setColorViewAlpha(int i2) {
        this.f144455k.setAlpha(i2);
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.w.a(z2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.f144455k.b(i2);
    }

    public boolean startNestedScroll(int i2) {
        return this.w.a(i2, 0);
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f2) {
        if (c()) {
            setColorViewAlpha((int) (f2 * 255.0f));
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            b();
        }
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.b.c(getContext(), i2));
    }

    private void c(float f2) {
        float f3 = this.C;
        int i2 = this.r;
        if (f2 - f3 > ((float) i2) && !this.D) {
            this.B = f3 + ((float) i2);
            this.D = true;
            this.f144455k.setAlpha(76);
        }
    }

    @Override // androidx.core.h.n
    public void onStopNestedScroll(View view) {
        this.v.a(0);
        this.z = false;
        float f2 = this.u;
        if (f2 > 0.0f) {
            b(f2);
            this.u = 0.0f;
        }
        stopNestedScroll();
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        n nVar = this.f144455k;
        nVar.f144666b.a(iArr);
        nVar.f144666b.a(0);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = androidx.core.content.b.c(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    private void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.E) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.E = motionEvent.getPointerId(i2);
        }
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.M = (int) (displayMetrics.density * 56.0f);
            } else {
                this.M = (int) (displayMetrics.density * 40.0f);
            }
            this.f144455k.a(i2);
        }
    }

    private static int a(Resources resources) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(17694721);
        if (matchConfig == null) {
            return resources.getInteger(17694721);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(17694721);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(17694721);
        }
    }

    private void b(float f2) {
        if (f2 > this.f144447c) {
            a(true, true);
            return;
        }
        this.f144446b = false;
        this.f144455k.b(0.0f);
        AnonymousClass5 r2 = null;
        if (!this.f144449e) {
            r2 = new Animation.AnimationListener() {
                /* class com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(94568);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!DoubleBallSwipeRefreshLayout.this.f144449e) {
                        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = DoubleBallSwipeRefreshLayout.this;
                        doubleBallSwipeRefreshLayout.f144456l = new Animation() {
                            /* class com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(94566);
                            }

                            public final void applyTransformation(float f2, Transformation transformation) {
                                DoubleBallSwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
                            }
                        };
                        doubleBallSwipeRefreshLayout.f144456l.setDuration(150);
                    }
                }
            };
        }
        b(this.f144448d, this.o.a(r2));
        this.f144455k.a(false);
        if (this.Q == null) {
            this.t.startScroll(0, getScrollY(), 0, -getScrollY(), Math.abs(getScrollY() * 2));
            invalidate();
            this.f144450f.b();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.F && actionMasked == 0) {
            this.F = false;
        }
        if (!isEnabled() || this.F || g() || this.f144446b || this.z) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.E;
                    if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                        return false;
                    }
                    c(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        a(motionEvent);
                    }
                }
            }
            this.D = false;
            this.E = -1;
        } else {
            int pointerId = motionEvent.getPointerId(0);
            this.E = pointerId;
            this.D = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.C = motionEvent.getY(findPointerIndex2);
        }
        return this.D;
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b
    public void setRefreshing(boolean z2) {
        if (!z2 || this.f144446b == z2) {
            a(z2, false);
            return;
        }
        this.f144446b = z2;
        h();
        this.f144457m = false;
        if (this.Q == null) {
            Animation.AnimationListener animationListener = this.R;
            int i2 = Build.VERSION.SDK_INT;
            this.f144455k.setAlpha(255);
            AnonymousClass2 r2 = new Animation() {
                /* class com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(94565);
                }

                public final void applyTransformation(float f2, Transformation transformation) {
                    DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = DoubleBallSwipeRefreshLayout.this;
                    doubleBallSwipeRefreshLayout.scrollTo(0, (int) (doubleBallSwipeRefreshLayout.f144447c * f2));
                }
            };
            this.I = r2;
            r2.setDuration((long) this.A);
            if (animationListener != null) {
                animationListener.onAnimationEnd(this.I);
            }
            this.f144450f.a();
            a(this.t, getScrollY(), (int) (-this.f144447c));
        }
    }

    private void a(float f2) {
        int i2;
        this.f144455k.a(true);
        float f3 = f2 / this.f144447c;
        double min = (double) Math.min(1.0f, Math.abs(f3));
        Double.isNaN(min);
        float max = (Math.max((float) (min - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.f144447c;
        if (this.n) {
            i2 = this.f144454j - this.f144453i;
        } else {
            i2 = this.f144454j;
        }
        float f4 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f4 * 2.0f) / f4) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f5 = ((float) (max2 - pow)) * 2.0f;
        if (this.f144449e) {
            setAnimationProgress(Math.min(1.0f, f2 / this.f144447c));
        }
        if (f2 < this.f144447c) {
            if (this.f144455k.getAlpha() > 76 && !a(this.J)) {
                d();
            }
        } else if (this.f144455k.getAlpha() < 255 && !a(this.K)) {
            e();
        }
        if (this.Q == null) {
            float atan = (float) Math.atan((double) f3);
            scrollTo(0, (int) ((-this.f144447c) * atan));
            this.f144450f.setProgress(Math.max(0.0f, Math.min(1.0f, atan - 0.5f)));
        } else {
            Math.min(f2, this.f144447c);
            Math.min(f3, 1.0f);
        }
        this.f144455k.b(Math.min(0.8f, max * 0.8f));
        this.f144455k.a(Math.min(1.0f, max));
        this.f144455k.c((((max * 0.4f) - 16.0f) + (f5 * 2.0f)) * 0.5f);
        h();
        this.o.c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.F && actionMasked == 0) {
            this.F = false;
        }
        if (!isEnabled() || this.F || g() || this.f144446b || this.z) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.E);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y2 = motionEvent.getY(findPointerIndex);
                    c(y2);
                    if (this.D) {
                        float f2 = (y2 - this.B) * 0.5f;
                        if (f2 > 0.0f) {
                            a(f2);
                        } else {
                            a(0.0f);
                            return false;
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            return false;
                        }
                        this.E = motionEvent.getPointerId(actionIndex);
                    } else if (actionMasked == 6) {
                        a(motionEvent);
                    }
                }
            }
            int findPointerIndex2 = motionEvent.findPointerIndex(this.E);
            if (findPointerIndex2 < 0) {
                return false;
            }
            if (this.D) {
                this.D = false;
                b((motionEvent.getY(findPointerIndex2) - this.B) * 0.5f);
            }
            this.E = -1;
            return false;
        }
        this.E = motionEvent.getPointerId(0);
        this.D = false;
        return true;
    }

    private static boolean a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.w.a(f2, f3);
    }

    private Animation a(final int i2, final int i3) {
        if (this.f144449e && c()) {
            return null;
        }
        AnonymousClass4 r2 = new Animation() {
            /* class com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.AnonymousClass4 */

            static {
                Covode.recordClassIndex(94567);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                n nVar = DoubleBallSwipeRefreshLayout.this.f144455k;
                int i2 = i2;
                nVar.setAlpha((int) (((float) i2) + (((float) (i3 - i2)) * f2)));
            }
        };
        r2.setDuration(300);
        return r2;
    }

    private void b(int i2, Animation.AnimationListener animationListener) {
        this.o.b(i2, animationListener);
        if (this.f144449e) {
            c(i2, animationListener);
            return;
        }
        this.f144451g = i2;
        this.T.reset();
        this.T.setDuration(200);
        this.T.setInterpolator(this.G);
        if (animationListener != null) {
            animationListener.onAnimationEnd(this.S);
        }
    }

    private void c(int i2, Animation.AnimationListener animationListener) {
        this.f144451g = i2;
        if (c()) {
            this.f144452h = (float) this.f144455k.getAlpha();
        }
        AnonymousClass8 r2 = new Animation() {
            /* class com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.AnonymousClass8 */

            static {
                Covode.recordClassIndex(94571);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                DoubleBallSwipeRefreshLayout.this.setAnimationProgress(DoubleBallSwipeRefreshLayout.this.f144452h + ((-DoubleBallSwipeRefreshLayout.this.f144452h) * f2));
            }
        };
        this.L = r2;
        r2.setDuration(150);
        if (animationListener != null) {
            animationListener.onAnimationEnd(this.L);
        }
    }

    public void onMeasure(int i2, int i3) {
        MethodCollector.i(2912);
        super.onMeasure(i2, i3);
        if (this.q == null) {
            f();
        }
        View view = this.q;
        if (view == null) {
            MethodCollector.o(2912);
            return;
        }
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        } catch (IllegalStateException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            com.bytedance.c.a.a.a.b.a(e2, "DoubleBallSwipeRefreshLayout");
            if (this.s) {
                MethodCollector.o(2912);
                throw e2;
            }
        }
        this.f144450f.measure(View.MeasureSpec.makeMeasureSpec(this.O, 1073741824), View.MeasureSpec.makeMeasureSpec(this.O, 1073741824));
        MethodCollector.o(2912);
    }

    public DoubleBallSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2805);
        this.r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.t = new Scroller(context, new AccelerateDecelerateInterpolator());
        this.A = a(getResources());
        setWillNotDraw(false);
        this.G = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.M = (int) (displayMetrics.density * 40.0f);
        this.N = (int) (displayMetrics.density * 56.0f);
        this.O = (int) (displayMetrics.density * 32.0f);
        n nVar = new n(getContext(), this);
        this.f144455k = nVar;
        nVar.b(-328966);
        v.a((ViewGroup) this);
        int i2 = (int) (displayMetrics.density * 56.0f);
        this.f144454j = i2;
        this.f144447c = (float) i2;
        this.v = new q();
        this.w = new m(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.M;
        this.f144448d = i3;
        this.f144453i = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DoubleColorBallAnimationView doubleColorBallAnimationView = new DoubleColorBallAnimationView(getContext());
        this.f144450f = doubleColorBallAnimationView;
        addView(doubleColorBallAnimationView);
        MethodCollector.o(2805);
    }

    private void a(int i2, Animation.AnimationListener animationListener) {
        this.o.a(i2, animationListener);
        this.f144451g = i2;
        this.S.reset();
        this.S.setDuration(200);
        this.S.setInterpolator(this.G);
        if (this.Q == null) {
            this.f144450f.setCycleBias(1);
            this.f144450f.a();
            this.t.startScroll(0, getScrollY(), 0, (-getScrollY()) - this.N, Math.abs(((-getScrollY()) - this.N) * 2));
            invalidate();
        }
        if (animationListener != null) {
            animationListener.onAnimationEnd(this.S);
        }
    }

    private void a(boolean z2, boolean z3) {
        if (this.f144446b != z2) {
            this.f144457m = z3;
            f();
            this.f144446b = z2;
            if (z2) {
                a(this.f144448d, this.R);
            } else if (this.Q == null) {
                this.t.forceFinished(true);
                this.t.startScroll(0, getScrollY(), 0, -getScrollY(), Math.abs(getScrollY() * 2));
                invalidate();
                this.f144450f.b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Scroller scroller, int i2, int i3) {
        scroller.startScroll(0, i2, 0, i3);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.w.a(f2, f3, z2);
    }

    @Override // androidx.core.h.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // androidx.core.h.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.v.a(i2, 0);
        startNestedScroll(i2 & 2);
        this.u = 0.0f;
        this.z = true;
    }

    @Override // androidx.core.h.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if (!isEnabled() || this.F || this.f144446b || (i2 & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.w.a(i2, i3, iArr, iArr2);
    }

    @Override // androidx.core.h.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    @Override // androidx.core.h.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.u;
            if (f2 > 0.0f) {
                float f3 = (float) i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.u = 0.0f;
                } else {
                    this.u = f2 - f3;
                    iArr[1] = i3;
                }
                a(this.u);
            }
        }
        int[] iArr2 = this.x;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.w.a(i2, i3, i4, i5, iArr);
    }

    @Override // androidx.core.h.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.y);
        int i6 = i5 + this.y[1];
        if (i6 < 0 && !g()) {
            float abs = this.u + ((float) Math.abs(i6));
            this.u = abs;
            a(abs);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.q == null) {
                f();
            }
            View view = this.q;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                try {
                    view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                    com.bytedance.c.a.a.a.b.a(e2, "DoubleBallSwipeRefreshLayout");
                    if (this.s) {
                        throw e2;
                    }
                }
                int measuredWidth2 = this.f144450f.getMeasuredWidth();
                int i6 = (measuredWidth - measuredWidth2) / 2;
                this.f144450f.layout(i6, -((this.N + this.f144450f.getMeasuredHeight()) / 2), measuredWidth2 + i6, 0);
            }
        }
    }
}
