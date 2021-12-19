package com.bytedance.android.live.liveinteract.cohost.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;

public class PkInviteUserListRefreshLayout extends ViewGroup {
    private static final String q = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] x = {16842766};
    private final Animation A = new Animation() {
        /* class com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.AnonymousClass1 */

        static {
            Covode.recordClassIndex(5534);
        }

        public final void applyTransformation(float f2, Transformation transformation) {
            int i2;
            if (PkInviteUserListRefreshLayout.this.f10424d != PkInviteUserListRefreshLayout.this.f10422b) {
                i2 = PkInviteUserListRefreshLayout.this.f10424d + ((int) (((float) (PkInviteUserListRefreshLayout.this.f10422b - PkInviteUserListRefreshLayout.this.f10424d)) * f2));
            } else {
                i2 = 0;
            }
            int top = i2 - PkInviteUserListRefreshLayout.this.f10421a.getTop();
            int top2 = PkInviteUserListRefreshLayout.this.f10421a.getTop();
            if (top + top2 < 0) {
                top = 0 - top2;
            }
            PkInviteUserListRefreshLayout.this.setTargetOffsetTopAndBottom(top);
        }
    };
    private final Runnable B = new Runnable() {
        /* class com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.AnonymousClass6 */

        static {
            Covode.recordClassIndex(5539);
        }

        public final void run() {
            PkInviteUserListRefreshLayout.this.f10428h = true;
            PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
            int paddingTop = pkInviteUserListRefreshLayout.f10427g + PkInviteUserListRefreshLayout.this.getPaddingTop();
            Animation.AnimationListener animationListener = PkInviteUserListRefreshLayout.this.o;
            pkInviteUserListRefreshLayout.f10424d = paddingTop;
            pkInviteUserListRefreshLayout.f10433m.reset();
            pkInviteUserListRefreshLayout.f10433m.setDuration((long) pkInviteUserListRefreshLayout.f10426f);
            pkInviteUserListRefreshLayout.f10433m.setAnimationListener(animationListener);
            pkInviteUserListRefreshLayout.f10433m.setInterpolator(pkInviteUserListRefreshLayout.f10429i);
            pkInviteUserListRefreshLayout.f10421a.startAnimation(pkInviteUserListRefreshLayout.f10433m);
        }
    };
    private final Runnable C = new Runnable() {
        /* class com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.AnonymousClass7 */

        static {
            Covode.recordClassIndex(5540);
        }

        public final void run() {
            PkInviteUserListRefreshLayout.this.f10428h = true;
            PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
            pkInviteUserListRefreshLayout.a(pkInviteUserListRefreshLayout.f10427g + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.n);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public View f10421a;

    /* renamed from: b  reason: collision with root package name */
    public int f10422b;

    /* renamed from: c  reason: collision with root package name */
    public b f10423c;

    /* renamed from: d  reason: collision with root package name */
    public int f10424d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10425e;

    /* renamed from: f  reason: collision with root package name */
    int f10426f;

    /* renamed from: g  reason: collision with root package name */
    public int f10427g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10428h;

    /* renamed from: i  reason: collision with root package name */
    final DecelerateInterpolator f10429i;

    /* renamed from: j  reason: collision with root package name */
    public int f10430j;

    /* renamed from: k  reason: collision with root package name */
    public c f10431k = c.NORMAL;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10432l;

    /* renamed from: m  reason: collision with root package name */
    final Animation f10433m = new Animation() {
        /* class com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.AnonymousClass2 */

        static {
            Covode.recordClassIndex(5535);
        }

        public final void applyTransformation(float f2, Transformation transformation) {
            int i2;
            if (PkInviteUserListRefreshLayout.this.f10424d != PkInviteUserListRefreshLayout.this.f10430j) {
                i2 = PkInviteUserListRefreshLayout.this.f10424d + ((int) (((float) (PkInviteUserListRefreshLayout.this.f10430j - PkInviteUserListRefreshLayout.this.f10424d)) * f2));
            } else {
                i2 = 0;
            }
            int top = i2 - PkInviteUserListRefreshLayout.this.f10421a.getTop();
            int top2 = PkInviteUserListRefreshLayout.this.f10421a.getTop();
            if (top + top2 < 0) {
                top = 0 - top2;
            }
            PkInviteUserListRefreshLayout.this.setTargetOffsetTopAndBottom(top);
        }
    };
    public final Animation.AnimationListener n = new a() {
        /* class com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.AnonymousClass3 */

        static {
            Covode.recordClassIndex(5536);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.a
        public final void onAnimationEnd(Animation animation) {
            PkInviteUserListRefreshLayout.this.f10427g = 0;
            PkInviteUserListRefreshLayout.this.f10431k = c.NORMAL;
            PkInviteUserListRefreshLayout.this.f10432l = false;
            PkInviteUserListRefreshLayout.this.f10423c.c();
        }
    };
    public final Animation.AnimationListener o = new a() {
        /* class com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.AnonymousClass4 */

        static {
            Covode.recordClassIndex(5537);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.a
        public final void onAnimationEnd(Animation animation) {
            PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
            pkInviteUserListRefreshLayout.f10427g = pkInviteUserListRefreshLayout.f10430j;
            PkInviteUserListRefreshLayout.this.f10431k = c.REFRESHING;
        }
    };
    public final Runnable p = new Runnable() {
        /* class com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.AnonymousClass5 */

        static {
            Covode.recordClassIndex(5538);
        }

        public final void run() {
            PkInviteUserListRefreshLayout.this.f10428h = true;
            PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
            pkInviteUserListRefreshLayout.a(pkInviteUserListRefreshLayout.f10427g + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.n);
        }
    };
    private int r;
    private float s = -1.0f;
    private float t;
    private float u;
    private boolean v;
    private int w = -1;
    private View y;
    private boolean z;

    public interface b {
        static {
            Covode.recordClassIndex(5543);
        }

        void a();

        void b();

        void c();
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
    }

    private boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        return this.f10421a.canScrollVertically(-1);
    }

    private void c() {
        removeCallbacks(this.C);
        postDelayed(this.C, 300);
    }

    static {
        Covode.recordClassIndex(5533);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.C);
        removeCallbacks(this.p);
        removeCallbacks(this.B);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.p);
        removeCallbacks(this.C);
        removeCallbacks(this.B);
    }

    enum c {
        NORMAL,
        LOOSEN,
        REFRESHING;

        static {
            Covode.recordClassIndex(5544);
        }
    }

    private void a() {
        if (this.f10421a == null) {
            if (getChildCount() <= 2 || isInEditMode()) {
                View childAt = getChildAt(1);
                this.f10421a = childAt;
                childAt.setOnTouchListener(new View.OnTouchListener() {
                    /* class com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout.AnonymousClass8 */

                    static {
                        Covode.recordClassIndex(5541);
                    }

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return PkInviteUserListRefreshLayout.this.f10432l;
                    }
                });
                this.f10422b = this.f10421a.getTop() + getPaddingTop();
            } else {
                throw new IllegalStateException("SwipeRefreshLayout can only host two children");
            }
        }
        if (this.s == -1.0f && getParent() != null && ((View) getParent()).getHeight() > 0) {
            this.s = (float) ((int) Math.min(((float) ((View) getParent()).getHeight()) * 0.6f, getResources().getDisplayMetrics().density * 120.0f));
        }
    }

    public void setOnRefreshListener(b bVar) {
        this.f10423c = bVar;
    }

    public void setmIsDisable(boolean z2) {
        this.z = z2;
    }

    class a implements Animation.AnimationListener {
        static {
            Covode.recordClassIndex(5542);
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        private a() {
        }

        /* synthetic */ a(PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout, byte b2) {
            this();
        }
    }

    public void setRefreshing(boolean z2) {
        if (this.f10425e != z2) {
            a();
            this.f10425e = z2;
        }
    }

    private void a(int i2) {
        int top = this.f10421a.getTop();
        float f2 = (float) i2;
        float f3 = this.s;
        if (f2 > f3) {
            i2 = ((int) f3) + (((int) (f2 - f3)) / 2);
        } else if (i2 < 0) {
            i2 = 0;
        }
        setTargetOffsetTopAndBottom(i2 - top);
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        this.f10421a.offsetTopAndBottom(i2);
        this.y.offsetTopAndBottom(i2);
        this.f10427g = this.f10421a.getTop();
        invalidate();
    }

    private void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.w) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.u = motionEvent.getY(i2);
            this.w = motionEvent.getPointerId(i2);
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
        if (this.z) {
            return false;
        }
        a();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10428h && actionMasked == 0) {
            this.f10428h = false;
        }
        if (!isEnabled() || this.f10428h || b()) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.w;
                    if (i2 == -1) {
                        com.bytedance.android.live.core.c.a.a(6, q, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        com.bytedance.android.live.core.c.a.a(6, q, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y2 = motionEvent.getY(findPointerIndex);
                    if (y2 - this.t > ((float) this.r)) {
                        this.u = y2;
                        this.v = true;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        a(motionEvent);
                    }
                }
            }
            this.v = false;
            this.w = -1;
        } else {
            float y3 = motionEvent.getY();
            this.t = y3;
            this.u = y3;
            this.w = motionEvent.getPointerId(0);
            this.v = false;
        }
        return this.v;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.z) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10428h && actionMasked == 0) {
            this.f10428h = false;
        }
        if (!isEnabled() || this.f10428h || b()) {
            return false;
        }
        if (actionMasked == 0) {
            float y2 = motionEvent.getY();
            this.t = y2;
            this.u = y2;
            this.w = motionEvent.getPointerId(0);
            this.v = false;
        } else if (actionMasked == 1) {
            if (this.f10431k == c.LOOSEN) {
                removeCallbacks(this.C);
                this.B.run();
                setRefreshing(true);
                this.f10432l = true;
                b bVar = this.f10423c;
                if (bVar != null) {
                    bVar.b();
                }
            } else {
                c();
            }
            this.v = false;
            this.w = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.w);
            if (findPointerIndex < 0) {
                com.bytedance.android.live.core.c.a.a(6, q, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y3 = motionEvent.getY(findPointerIndex);
            float f2 = y3 - this.t;
            if (!this.v && f2 > ((float) this.r)) {
                this.v = true;
            }
            if (this.v) {
                b bVar2 = this.f10423c;
                if (bVar2 != null) {
                    bVar2.a();
                }
                if (f2 > this.s) {
                    if (this.f10431k == c.NORMAL) {
                        this.f10431k = c.LOOSEN;
                    }
                    a((int) f2);
                } else {
                    if (this.f10431k == c.LOOSEN) {
                        this.f10431k = c.NORMAL;
                    }
                    a((int) f2);
                    if (this.u > y3 && this.f10421a.getTop() == getPaddingTop()) {
                        removeCallbacks(this.C);
                    }
                }
                this.u = y3;
            }
        } else if (actionMasked == 3) {
            c();
            this.v = false;
            this.w = -1;
            return false;
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.u = motionEvent.getY(actionIndex);
            this.w = motionEvent.getPointerId(actionIndex);
        } else if (actionMasked == 6) {
            a(motionEvent);
        }
        return true;
    }

    public PkInviteUserListRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10138);
        this.r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f10426f = a(getResources());
        this.f10429i = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        MethodCollector.o(10138);
    }

    public void onMeasure(int i2, int i3) {
        MethodCollector.i(10145);
        super.onMeasure(i2, i3);
        if (getChildCount() <= 1) {
            IllegalStateException illegalStateException = new IllegalStateException("SwipeRefreshLayout must have the headerview and contentview");
            MethodCollector.o(10145);
            throw illegalStateException;
        } else if (getChildCount() <= 2 || isInEditMode()) {
            if (this.y == null) {
                View childAt = getChildAt(0);
                this.y = childAt;
                measureChild(childAt, i2, i3);
                int measuredHeight = this.y.getMeasuredHeight();
                this.f10430j = measuredHeight;
                this.s = (float) measuredHeight;
            }
            getChildAt(1).measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            MethodCollector.o(10145);
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("SwipeRefreshLayout can only host two children");
            MethodCollector.o(10145);
            throw illegalStateException2;
        }
    }

    public final void a(int i2, Animation.AnimationListener animationListener) {
        this.f10424d = i2;
        this.A.reset();
        this.A.setDuration((long) this.f10426f);
        this.A.setAnimationListener(animationListener);
        this.A.setInterpolator(this.f10429i);
        this.f10421a.startAnimation(this.A);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0 && getChildCount() != 1) {
            View childAt = getChildAt(1);
            int paddingLeft = getPaddingLeft();
            int paddingTop = this.f10427g + getPaddingTop();
            int paddingLeft2 = ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft;
            childAt.layout(paddingLeft, paddingTop, paddingLeft2, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            this.y.layout(paddingLeft, paddingTop - this.f10430j, paddingLeft2, paddingTop);
        }
    }
}
