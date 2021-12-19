package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget;

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
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import androidx.core.h.j;
import androidx.core.h.m;
import androidx.core.h.n;
import androidx.core.h.q;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;

public class SwipeRefreshLayout extends ViewGroup implements j, n, b {
    private static final int[] G = {16842766};
    private static final String n = SwipeRefreshLayout.class.getSimpleName();
    private static final String o = SwipeRefreshLayout.class.getSimpleName();
    private float A;
    private float B;
    private boolean C;
    private int D;
    private boolean E;
    private final DecelerateInterpolator F;
    private int H;
    private Animation I;
    private Animation J;
    private Animation K;
    private Animation L;
    private Animation M;
    private int N;
    private a O;
    private Animation.AnimationListener P;
    private final Animation Q;
    private final Animation R;

    /* renamed from: a  reason: collision with root package name */
    b f68187a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f68188b;

    /* renamed from: c  reason: collision with root package name */
    int f68189c;

    /* renamed from: d  reason: collision with root package name */
    boolean f68190d;

    /* renamed from: e  reason: collision with root package name */
    a f68191e;

    /* renamed from: f  reason: collision with root package name */
    protected int f68192f;

    /* renamed from: g  reason: collision with root package name */
    float f68193g;

    /* renamed from: h  reason: collision with root package name */
    protected int f68194h;

    /* renamed from: i  reason: collision with root package name */
    int f68195i;

    /* renamed from: j  reason: collision with root package name */
    c f68196j;

    /* renamed from: k  reason: collision with root package name */
    boolean f68197k;

    /* renamed from: l  reason: collision with root package name */
    boolean f68198l;

    /* renamed from: m  reason: collision with root package name */
    d f68199m;
    private View p;
    private int q;
    private float r;
    private boolean s;
    private float t;
    private final q u;
    private final m v;
    private final int[] w;
    private final int[] x;
    private boolean y;
    private int z;

    public interface a {
        static {
            Covode.recordClassIndex(42020);
        }

        boolean a();
    }

    public interface b {
        static {
            Covode.recordClassIndex(42021);
        }

        void a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(42022);
        }
    }

    public void setOnSwipeChangeListener(c cVar) {
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b
    public final boolean a() {
        return this.f68188b;
    }

    public int getProgressCircleDiameter() {
        return this.N;
    }

    public int getProgressViewEndOffset() {
        return this.f68195i;
    }

    public int getProgressViewStartOffset() {
        return this.f68194h;
    }

    /* access modifiers changed from: package-private */
    public final void a(Animation.AnimationListener animationListener) {
        AnonymousClass3 r2 = new Animation() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.AnonymousClass3 */

            static {
                Covode.recordClassIndex(42013);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
            }
        };
        this.J = r2;
        r2.setDuration(150);
        this.f68191e.f68211a = animationListener;
        this.f68191e.clearAnimation();
        this.f68191e.startAnimation(this.J);
    }

    private static boolean c() {
        int i2 = Build.VERSION.SDK_INT;
        return false;
    }

    public int getNestedScrollAxes() {
        return this.u.a();
    }

    public boolean hasNestedScrollingParent() {
        return this.v.a(0);
    }

    @Override // androidx.core.h.j
    public boolean isNestedScrollingEnabled() {
        return this.v.f2548a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // androidx.core.h.j
    public void stopNestedScroll() {
        this.v.b(0);
    }

    private void d() {
        this.K = b(this.f68196j.getAlpha(), 76);
    }

    private void e() {
        this.L = b(this.f68196j.getAlpha(), 255);
    }

    static {
        Covode.recordClassIndex(42010);
    }

    private void f() {
        if (this.p == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.f68191e)) {
                    this.p = childAt;
                    return;
                }
            }
        }
    }

    private boolean g() {
        a aVar = this.O;
        if (aVar != null) {
            return aVar.a();
        }
        int i2 = Build.VERSION.SDK_INT;
        return this.p.canScrollVertically(-1);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f68199m.a();
        this.f68191e.clearAnimation();
        this.f68196j.stop();
        this.f68191e.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f68190d) {
            setAnimationProgress(0.0f);
        } else {
            a(this.f68194h - this.f68189c, true);
        }
        this.f68189c = this.f68191e.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.r = (float) i2;
    }

    public void setDoNotCatchException(boolean z2) {
        this.s = z2;
    }

    public void setOnChildScrollUpCallback(a aVar) {
        this.O = aVar;
    }

    public void setOnRefreshListener(b bVar) {
        this.f68187a = bVar;
    }

    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public void setNestedScrollingEnabled(boolean z2) {
        this.v.a(z2);
    }

    public boolean startNestedScroll(int i2) {
        return this.v.a(i2, 0);
    }

    private void setColorViewAlpha(int i2) {
        this.f68191e.getBackground().setAlpha(i2);
        this.f68196j.setAlpha(i2);
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            b();
        }
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.f68191e.setBackgroundColor(i2);
        this.f68196j.b(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.b.c(getContext(), i2));
    }

    private void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.D) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.D = motionEvent.getPointerId(i2);
        }
    }

    private void d(float f2) {
        float f3 = this.B;
        int i2 = this.q;
        if (f2 - f3 > ((float) i2) && !this.C) {
            this.A = f3 + ((float) i2);
            this.C = true;
            this.f68196j.setAlpha(76);
        }
    }

    @Override // androidx.core.h.n
    public void onStopNestedScroll(View view) {
        this.u.a(0);
        this.y = false;
        float f2 = this.t;
        if (f2 > 0.0f) {
            c(f2);
            this.t = 0.0f;
        }
        stopNestedScroll();
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f2) {
        if (c()) {
            setColorViewAlpha((int) (f2 * 255.0f));
            return;
        }
        this.f68191e.setScaleX(f2);
        this.f68191e.setScaleY(f2);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        c cVar = this.f68196j;
        cVar.f68221b.a(iArr);
        cVar.f68221b.a(0);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = androidx.core.content.b.c(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    private void c(float f2) {
        if (f2 > this.r) {
            a(true, true);
            return;
        }
        this.f68188b = false;
        this.f68196j.b(0.0f);
        AnonymousClass5 r2 = null;
        if (!this.f68190d) {
            r2 = new Animation.AnimationListener() {
                /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(42015);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.f68190d) {
                        SwipeRefreshLayout.this.a((Animation.AnimationListener) null);
                    }
                }
            };
        }
        b(this.f68189c, this.f68199m.a(r2));
        this.f68196j.a(false);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.N = (int) (displayMetrics.density * 56.0f);
            } else {
                this.N = (int) (displayMetrics.density * 40.0f);
            }
            this.f68191e.setImageDrawable(null);
            this.f68196j.a(i2);
            this.f68191e.setImageDrawable(this.f68196j);
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

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.E && actionMasked == 0) {
            this.E = false;
        }
        if (!isEnabled() || this.E || g() || this.f68188b || this.y) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.D;
                    if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                        return false;
                    }
                    d(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        a(motionEvent);
                    }
                }
            }
            this.C = false;
            this.D = -1;
        } else {
            a(this.f68194h - this.f68191e.getTop(), true);
            int pointerId = motionEvent.getPointerId(0);
            this.D = pointerId;
            this.C = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.B = motionEvent.getY(findPointerIndex2);
        }
        return this.C;
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b
    public void setRefreshing(boolean z2) {
        int i2;
        if (!z2 || this.f68188b == z2) {
            a(z2, false);
            return;
        }
        this.f68188b = z2;
        if (!this.f68198l) {
            i2 = this.f68195i + this.f68194h;
        } else {
            i2 = this.f68195i;
        }
        a(i2 - this.f68189c, true);
        this.f68197k = false;
        Animation.AnimationListener animationListener = this.P;
        this.f68191e.setVisibility(0);
        int i3 = Build.VERSION.SDK_INT;
        this.f68196j.setAlpha(255);
        AnonymousClass2 r2 = new Animation() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.AnonymousClass2 */

            static {
                Covode.recordClassIndex(42012);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f2);
            }
        };
        this.I = r2;
        r2.setDuration((long) this.z);
        if (animationListener != null) {
            this.f68191e.f68211a = animationListener;
        }
        this.f68191e.clearAnimation();
        this.f68191e.startAnimation(this.I);
    }

    private void b(float f2) {
        int i2;
        this.f68196j.a(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.r));
        double d2 = (double) min;
        Double.isNaN(d2);
        float max = (Math.max((float) (d2 - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.r;
        if (this.f68198l) {
            i2 = this.f68195i - this.f68194h;
        } else {
            i2 = this.f68195i;
        }
        float f3 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        int i3 = this.f68194h + ((int) ((f3 * min) + (f3 * f4 * 2.0f)));
        if (this.f68191e.getVisibility() != 0) {
            this.f68191e.setVisibility(0);
        }
        if (!this.f68190d) {
            this.f68191e.setScaleX(1.0f);
            this.f68191e.setScaleY(1.0f);
        }
        if (this.f68190d) {
            setAnimationProgress(Math.min(1.0f, f2 / this.r));
        }
        if (f2 < this.r) {
            if (this.f68196j.getAlpha() > 76 && !a(this.K)) {
                d();
            }
        } else if (this.f68196j.getAlpha() < 255 && !a(this.L)) {
            e();
        }
        this.f68196j.b(Math.min(0.8f, max * 0.8f));
        this.f68196j.a(Math.min(1.0f, max));
        this.f68196j.c((((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f);
        a(i3 - this.f68189c, true);
        this.f68199m.c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.E && actionMasked == 0) {
            this.E = false;
        }
        if (!isEnabled() || this.E || g() || this.f68188b || this.y) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.D);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y2 = motionEvent.getY(findPointerIndex);
                    d(y2);
                    if (this.C) {
                        float f2 = (y2 - this.A) * 0.5f;
                        if (f2 > 0.0f) {
                            b(f2);
                        } else {
                            b(0.0f);
                            return false;
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            return false;
                        }
                        this.D = motionEvent.getPointerId(actionIndex);
                    } else if (actionMasked == 6) {
                        a(motionEvent);
                    }
                }
            }
            int findPointerIndex2 = motionEvent.findPointerIndex(this.D);
            if (findPointerIndex2 < 0) {
                return false;
            }
            if (this.C) {
                this.C = false;
                c((motionEvent.getY(findPointerIndex2) - this.A) * 0.5f);
            }
            this.D = -1;
            return false;
        }
        this.D = motionEvent.getPointerId(0);
        this.C = false;
        return true;
    }

    private static boolean a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        int i2 = this.f68192f;
        a((i2 + ((int) (((float) (this.f68194h - i2)) * f2))) - this.f68191e.getTop(), false);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.v.a(f2, f3);
    }

    public final void a(int i2, int i3) {
        this.f68190d = false;
        this.f68194h = i2;
        this.f68195i = i3;
        this.f68198l = true;
        b();
        this.f68188b = false;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.H;
        if (i4 < 0) {
            return i3;
        }
        if (i3 == i2 - 1) {
            return i4;
        }
        if (i3 >= i4) {
            return i3 + 1;
        }
        return i3;
    }

    private void a(int i2, Animation.AnimationListener animationListener) {
        this.f68199m.a(i2, animationListener);
        this.f68192f = i2;
        this.Q.reset();
        this.Q.setDuration(200);
        this.Q.setInterpolator(this.F);
        if (animationListener != null) {
            this.f68191e.f68211a = animationListener;
        }
        this.f68191e.clearAnimation();
        this.f68191e.startAnimation(this.Q);
    }

    private Animation b(final int i2, final int i3) {
        if (this.f68190d && c()) {
            return null;
        }
        AnonymousClass4 r2 = new Animation() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.AnonymousClass4 */

            static {
                Covode.recordClassIndex(42014);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                c cVar = SwipeRefreshLayout.this.f68196j;
                int i2 = i2;
                cVar.setAlpha((int) (((float) i2) + (((float) (i3 - i2)) * f2)));
            }
        };
        r2.setDuration(300);
        this.f68191e.f68211a = null;
        this.f68191e.clearAnimation();
        this.f68191e.startAnimation(r2);
        return r2;
    }

    private void b(int i2, Animation.AnimationListener animationListener) {
        this.f68199m.b(i2, animationListener);
        if (this.f68190d) {
            c(i2, animationListener);
            return;
        }
        this.f68192f = i2;
        this.R.reset();
        this.R.setDuration(200);
        this.R.setInterpolator(this.F);
        if (animationListener != null) {
            this.f68191e.f68211a = animationListener;
        }
        this.f68191e.clearAnimation();
        this.f68191e.startAnimation(this.R);
    }

    private void c(int i2, Animation.AnimationListener animationListener) {
        this.f68192f = i2;
        if (c()) {
            this.f68193g = (float) this.f68196j.getAlpha();
        } else {
            this.f68193g = this.f68191e.getScaleX();
        }
        AnonymousClass8 r2 = new Animation() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.AnonymousClass8 */

            static {
                Covode.recordClassIndex(42018);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.f68193g + ((-SwipeRefreshLayout.this.f68193g) * f2));
                SwipeRefreshLayout.this.a(f2);
            }
        };
        this.M = r2;
        r2.setDuration(150);
        if (animationListener != null) {
            this.f68191e.f68211a = animationListener;
        }
        this.f68191e.clearAnimation();
        this.f68191e.startAnimation(this.M);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(2131);
        this.r = -1.0f;
        this.w = new int[2];
        this.x = new int[2];
        this.D = -1;
        this.H = -1;
        this.P = new Animation.AnimationListener() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(42011);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.f68188b) {
                    SwipeRefreshLayout.this.f68199m.b();
                    SwipeRefreshLayout.this.f68196j.setAlpha(255);
                    SwipeRefreshLayout.this.f68196j.start();
                    if (SwipeRefreshLayout.this.f68197k && SwipeRefreshLayout.this.f68187a != null) {
                        SwipeRefreshLayout.this.f68187a.a();
                    }
                    SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                    swipeRefreshLayout.f68189c = swipeRefreshLayout.f68191e.getTop();
                    return;
                }
                SwipeRefreshLayout.this.b();
            }
        };
        this.Q = new Animation() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.AnonymousClass6 */

            static {
                Covode.recordClassIndex(42016);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                int i2;
                if (!SwipeRefreshLayout.this.f68198l) {
                    i2 = SwipeRefreshLayout.this.f68195i - Math.abs(SwipeRefreshLayout.this.f68194h);
                } else {
                    i2 = SwipeRefreshLayout.this.f68195i;
                }
                SwipeRefreshLayout.this.a((SwipeRefreshLayout.this.f68192f + ((int) (((float) (i2 - SwipeRefreshLayout.this.f68192f)) * f2))) - SwipeRefreshLayout.this.f68191e.getTop(), false);
                SwipeRefreshLayout.this.f68196j.a(1.0f - f2);
            }
        };
        this.R = new Animation() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.AnonymousClass7 */

            static {
                Covode.recordClassIndex(42017);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.a(f2);
            }
        };
        this.f68199m = new d() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout.AnonymousClass9 */

            static {
                Covode.recordClassIndex(42019);
            }
        };
        this.q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.z = a(getResources());
        setWillNotDraw(false);
        this.F = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.N = (int) (displayMetrics.density * 40.0f);
        this.f68191e = new a(getContext());
        c cVar = new c(getContext(), this);
        this.f68196j = cVar;
        cVar.b(-328966);
        this.f68191e.setImageDrawable(this.f68196j);
        this.f68191e.setVisibility(8);
        addView(this.f68191e);
        v.a((ViewGroup) this);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.f68195i = i2;
        this.r = (float) i2;
        this.u = new q();
        this.v = new m(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.N;
        this.f68189c = i3;
        this.f68194h = i3;
        a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        MethodCollector.o(2131);
    }

    private void a(boolean z2, boolean z3) {
        if (this.f68188b != z2) {
            this.f68197k = z3;
            f();
            this.f68188b = z2;
            if (z2) {
                a(this.f68189c, this.P);
            } else {
                a(this.P);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        MethodCollector.i(2170);
        super.onMeasure(i2, i3);
        if (this.p == null) {
            f();
        }
        View view = this.p;
        if (view == null) {
            MethodCollector.o(2170);
            return;
        }
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        } catch (IllegalStateException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            com.bytedance.c.a.a.a.b.a(e2, n);
            if (this.s) {
                MethodCollector.o(2170);
                throw e2;
            }
        }
        this.f68191e.measure(View.MeasureSpec.makeMeasureSpec(this.N, 1073741824), View.MeasureSpec.makeMeasureSpec(this.N, 1073741824));
        this.H = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.f68191e) {
                this.H = i4;
                MethodCollector.o(2170);
                return;
            }
        }
        MethodCollector.o(2170);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z2) {
        this.f68191e.bringToFront();
        v.d(this.f68191e, i2);
        this.f68189c = this.f68191e.getTop();
        if (z2) {
            int i3 = Build.VERSION.SDK_INT;
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.v.a(f2, f3, z2);
    }

    @Override // androidx.core.h.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // androidx.core.h.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.u.a(i2, 0);
        startNestedScroll(i2 & 2);
        this.t = 0.0f;
        this.y = true;
    }

    @Override // androidx.core.h.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if (!isEnabled() || this.E || this.f68188b || (i2 & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.v.a(i2, i3, iArr, iArr2);
    }

    @Override // androidx.core.h.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    @Override // androidx.core.h.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.t;
            if (f2 > 0.0f) {
                float f3 = (float) i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.t = 0.0f;
                } else {
                    this.t = f2 - f3;
                    iArr[1] = i3;
                }
                b(this.t);
            }
        }
        if (this.f68198l && i3 > 0 && this.t == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.f68191e.setVisibility(8);
        }
        int[] iArr2 = this.w;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.v.a(i2, i3, i4, i5, iArr);
    }

    @Override // androidx.core.h.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.x);
        int i6 = i5 + this.x[1];
        if (i6 < 0 && !g()) {
            float abs = this.t + ((float) Math.abs(i6));
            this.t = abs;
            b(abs);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.p == null) {
                f();
            }
            View view = this.p;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                try {
                    view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                    com.bytedance.c.a.a.a.b.a(e2, n);
                    if (this.s) {
                        throw e2;
                    }
                }
                int measuredWidth2 = this.f68191e.getMeasuredWidth();
                int measuredHeight2 = this.f68191e.getMeasuredHeight();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = this.f68189c;
                this.f68191e.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }
}
