package com.bytedance.android.live.uikit.a;

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
import androidx.core.h.v;
import com.bytedance.android.live.uikit.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;

public class b extends ViewGroup {

    /* renamed from: m  reason: collision with root package name */
    private static final String f12846m = b.class.getSimpleName();
    private static final int[] y = {16842766};
    private Animation A;
    private Animation B;
    private Animation C;
    private Animation D;
    private Animation E;
    private int F;
    private int G;
    private Animation.AnimationListener H = new Animation.AnimationListener() {
        /* class com.bytedance.android.live.uikit.a.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7141);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            if (b.this.f12848b) {
                b.this.f12855i.setAlpha(255);
                b.this.f12855i.start();
                if (b.this.f12857k && b.this.f12847a != null) {
                    b.this.f12847a.a();
                }
            } else {
                b.this.f12855i.stop();
                b.this.f12851e.setVisibility(8);
                b.this.setColorViewAlpha(255);
                if (b.this.f12850d) {
                    b.this.setAnimationProgress(0.0f);
                } else {
                    b bVar = b.this;
                    bVar.a(bVar.f12854h - b.this.f12849c, true);
                }
            }
            b bVar2 = b.this;
            bVar2.f12849c = bVar2.f12851e.getTop();
        }
    };
    private final Animation I = new Animation() {
        /* class com.bytedance.android.live.uikit.a.b.AnonymousClass6 */

        static {
            Covode.recordClassIndex(7146);
        }

        public final void applyTransformation(float f2, Transformation transformation) {
            float f3;
            if (!b.this.f12858l) {
                f3 = b.this.f12856j - ((float) Math.abs(b.this.f12854h));
            } else {
                f3 = b.this.f12856j;
            }
            b.this.a((b.this.f12852f + ((int) (((float) (((int) f3) - b.this.f12852f)) * f2))) - b.this.f12851e.getTop(), false);
        }
    };
    private final Animation J = new Animation() {
        /* class com.bytedance.android.live.uikit.a.b.AnonymousClass7 */

        static {
            Covode.recordClassIndex(7147);
        }

        public final void applyTransformation(float f2, Transformation transformation) {
            b.this.a(f2);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0267b f12847a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12848b;

    /* renamed from: c  reason: collision with root package name */
    public int f12849c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12850d;

    /* renamed from: e  reason: collision with root package name */
    public a f12851e;

    /* renamed from: f  reason: collision with root package name */
    protected int f12852f;

    /* renamed from: g  reason: collision with root package name */
    public float f12853g;

    /* renamed from: h  reason: collision with root package name */
    protected int f12854h;

    /* renamed from: i  reason: collision with root package name */
    public c f12855i;

    /* renamed from: j  reason: collision with root package name */
    public float f12856j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12857k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12858l;
    private View n;
    private a o;
    private int p;
    private float q = -1.0f;
    private int r;
    private boolean s;
    private float t;
    private boolean u;
    private int v = -1;
    private boolean w;
    private final DecelerateInterpolator x;
    private int z = -1;

    public interface a {
        static {
            Covode.recordClassIndex(7149);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.a.b$b  reason: collision with other inner class name */
    public interface AbstractC0267b {
        static {
            Covode.recordClassIndex(7150);
        }

        void a();
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
    }

    public final void a(Animation.AnimationListener animationListener) {
        AnonymousClass3 r2 = new Animation() {
            /* class com.bytedance.android.live.uikit.a.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(7143);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                b.this.setAnimationProgress(1.0f - f2);
            }
        };
        this.B = r2;
        r2.setDuration(150);
        this.f12851e.f12839a = animationListener;
        this.f12851e.clearAnimation();
        this.f12851e.startAnimation(this.B);
    }

    public final void a(int i2, boolean z2) {
        this.f12851e.bringToFront();
        this.f12851e.offsetTopAndBottom(i2);
        this.f12849c = this.f12851e.getTop();
        if (z2) {
            int i3 = Build.VERSION.SDK_INT;
        }
    }

    private static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return false;
    }

    private boolean c() {
        int i2 = Build.VERSION.SDK_INT;
        return this.n.canScrollVertically(-1);
    }

    static {
        Covode.recordClassIndex(7140);
    }

    private void b() {
        if (this.n == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.f12851e)) {
                    this.n = childAt;
                    return;
                }
            }
        }
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.q = (float) i2;
    }

    public void setOnRefreshListener(AbstractC0267b bVar) {
        this.f12847a = bVar;
    }

    public void setStartEndRefreshListener(a aVar) {
        this.o = aVar;
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        c cVar = this.f12855i;
        cVar.f12873c.a(iArr);
        cVar.f12873c.f12896j = 0;
    }

    public void setColorViewAlpha(int i2) {
        this.f12851e.getBackground().setAlpha(i2);
        this.f12855i.setAlpha(i2);
    }

    private void a(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.v) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.v = motionEvent.getPointerId(i2);
        }
    }

    public void setAnimationProgress(float f2) {
        if (a()) {
            setColorViewAlpha((int) (f2 * 255.0f));
            return;
        }
        this.f12851e.setScaleX(f2);
        this.f12851e.setScaleY(f2);
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = resources.getColor(iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setProgressBackgroundColor(int i2) {
        this.f12851e.setBackgroundColor(i2);
        this.f12855i.b(getResources().getColor(i2));
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                int i3 = (int) (displayMetrics.density * 56.0f);
                this.F = i3;
                this.G = i3;
            } else {
                int i4 = (int) (displayMetrics.density * 40.0f);
                this.F = i4;
                this.G = i4;
            }
            this.f12851e.setImageDrawable(null);
            this.f12855i.a(i2);
            this.f12851e.setImageDrawable(this.f12855i);
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

    public void setRefreshing(boolean z2) {
        float f2;
        if (!z2 || this.f12848b == z2) {
            a(z2, false);
            return;
        }
        this.f12848b = z2;
        if (!this.f12858l) {
            f2 = this.f12856j + ((float) this.f12854h);
        } else {
            f2 = this.f12856j;
        }
        a(((int) f2) - this.f12849c, true);
        this.f12857k = false;
        Animation.AnimationListener animationListener = this.H;
        this.f12851e.setVisibility(0);
        int i2 = Build.VERSION.SDK_INT;
        this.f12855i.setAlpha(255);
        AnonymousClass2 r2 = new Animation() {
            /* class com.bytedance.android.live.uikit.a.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(7142);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                b.this.setAnimationProgress(f2);
            }
        };
        this.A = r2;
        r2.setDuration((long) this.r);
        if (animationListener != null) {
            this.f12851e.f12839a = animationListener;
        }
        this.f12851e.clearAnimation();
        this.f12851e.startAnimation(this.A);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.a.b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private static boolean a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.w && actionMasked == 0) {
            this.w = false;
        }
        if (!isEnabled() || this.w || c()) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.v);
                    if (findPointerIndex < 0) {
                        com.bytedance.android.live.core.c.a.a(6, f12846m, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    try {
                        float y2 = (motionEvent.getY(findPointerIndex) - this.t) * 0.5f;
                        if (this.u) {
                            this.f12855i.a(true);
                            float f3 = y2 / this.q;
                            if (f3 < 0.0f) {
                                return false;
                            }
                            float min = Math.min(1.0f, Math.abs(f3));
                            double d2 = (double) min;
                            Double.isNaN(d2);
                            float max = (Math.max((float) (d2 - 0.4d), 0.0f) * 5.0f) / 3.0f;
                            float abs = Math.abs(y2) - this.q;
                            if (this.f12858l) {
                                f2 = this.f12856j - ((float) this.f12854h);
                            } else {
                                f2 = this.f12856j;
                            }
                            double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
                            double pow = Math.pow(max2, 2.0d);
                            Double.isNaN(max2);
                            float f4 = ((float) (max2 - pow)) * 2.0f;
                            int i2 = this.f12854h + ((int) ((f2 * min) + (f2 * f4 * 2.0f)));
                            if (this.f12851e.getVisibility() != 0) {
                                this.f12851e.setVisibility(0);
                            }
                            if (!this.f12850d) {
                                this.f12851e.setScaleX(1.0f);
                                this.f12851e.setScaleY(1.0f);
                            }
                            float f5 = this.q;
                            if (y2 < f5) {
                                if (this.f12850d) {
                                    setAnimationProgress(y2 / f5);
                                }
                                if (this.f12855i.getAlpha() > 76 && !a(this.C)) {
                                    this.C = a(this.f12855i.getAlpha(), 76);
                                }
                                this.f12855i.a(Math.min(0.8f, max * 0.8f));
                                c cVar = this.f12855i;
                                float min2 = Math.min(1.0f, max);
                                c.b bVar = cVar.f12873c;
                                if (min2 != bVar.p) {
                                    bVar.p = min2;
                                    bVar.c();
                                }
                            } else if (this.f12855i.getAlpha() < 255 && !a(this.D)) {
                                this.D = a(this.f12855i.getAlpha(), 255);
                            }
                            this.f12855i.f12873c.c((((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f);
                            a(i2 - this.f12849c, true);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return true;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        this.v = motionEvent.getPointerId(motionEvent.getActionIndex());
                    } else if (actionMasked == 6) {
                        a(motionEvent);
                    }
                }
            }
            int i3 = this.v;
            if (i3 == -1) {
                if (actionMasked == 1) {
                    com.bytedance.android.live.core.c.a.a(6, f12846m, "Got ACTION_UP event but don't have an active pointer id.");
                }
                return false;
            }
            try {
                float y3 = motionEvent.getY(motionEvent.findPointerIndex(i3));
                this.u = false;
                if ((y3 - this.t) * 0.5f > this.q) {
                    a(true, true);
                } else {
                    this.f12848b = false;
                    this.f12855i.a(0.0f);
                    AnonymousClass5 r6 = null;
                    if (!this.f12850d) {
                        r6 = new Animation.AnimationListener() {
                            /* class com.bytedance.android.live.uikit.a.b.AnonymousClass5 */

                            static {
                                Covode.recordClassIndex(7145);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                if (!b.this.f12850d) {
                                    b.this.a((Animation.AnimationListener) null);
                                }
                            }
                        };
                    }
                    int i4 = this.f12849c;
                    if (this.f12850d) {
                        this.f12852f = i4;
                        if (a()) {
                            this.f12853g = (float) this.f12855i.getAlpha();
                        } else {
                            this.f12853g = this.f12851e.getScaleX();
                        }
                        AnonymousClass8 r2 = new Animation() {
                            /* class com.bytedance.android.live.uikit.a.b.AnonymousClass8 */

                            static {
                                Covode.recordClassIndex(7148);
                            }

                            public final void applyTransformation(float f2, Transformation transformation) {
                                b.this.setAnimationProgress(b.this.f12853g + ((-b.this.f12853g) * f2));
                                b.this.a(f2);
                            }
                        };
                        this.E = r2;
                        r2.setDuration(150);
                        if (r6 != null) {
                            this.f12851e.f12839a = r6;
                        }
                        this.f12851e.clearAnimation();
                        this.f12851e.startAnimation(this.E);
                    } else {
                        this.f12852f = i4;
                        this.J.reset();
                        this.J.setDuration(200);
                        this.J.setInterpolator(this.x);
                        if (r6 != null) {
                            this.f12851e.f12839a = r6;
                        }
                        this.f12851e.clearAnimation();
                        this.f12851e.startAnimation(this.J);
                    }
                    this.f12855i.a(false);
                    com.bytedance.android.live.core.c.a.a(3, f12846m, "on touch cancel refresh");
                }
                this.v = -1;
                return false;
            } catch (Exception e3) {
                e3.printStackTrace();
                return true;
            }
        } else {
            this.v = motionEvent.getPointerId(0);
            this.u = false;
        }
        return true;
    }

    public final void a(float f2) {
        int i2 = this.f12852f;
        a((i2 + ((int) (((float) (this.f12854h - i2)) * f2))) - this.f12851e.getTop(), false);
    }

    private static float a(MotionEvent motionEvent, int i2) {
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        if (findPointerIndex < 0) {
            return -1.0f;
        }
        return motionEvent.getY(findPointerIndex);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.z;
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

    private Animation a(final int i2, final int i3) {
        if (this.f12850d && a()) {
            return null;
        }
        AnonymousClass4 r2 = new Animation() {
            /* class com.bytedance.android.live.uikit.a.b.AnonymousClass4 */

            static {
                Covode.recordClassIndex(7144);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                c cVar = b.this.f12855i;
                int i2 = i2;
                cVar.setAlpha((int) (((float) i2) + (((float) (i3 - i2)) * f2)));
            }
        };
        r2.setDuration(300);
        this.f12851e.f12839a = null;
        this.f12851e.clearAnimation();
        this.f12851e.startAnimation(r2);
        return r2;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(12537);
        this.p = ViewConfiguration.get(context).getScaledTouchSlop();
        this.r = a(getResources());
        setWillNotDraw(false);
        this.x = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.F = (int) (displayMetrics.density * 40.0f);
        this.G = (int) (displayMetrics.density * 40.0f);
        this.f12851e = new a(getContext());
        c cVar = new c(getContext(), this);
        this.f12855i = cVar;
        cVar.b(-328966);
        this.f12851e.setImageDrawable(this.f12855i);
        this.f12851e.setVisibility(8);
        addView(this.f12851e);
        v.a((ViewGroup) this);
        float f2 = displayMetrics.density * 64.0f;
        this.f12856j = f2;
        this.q = f2;
        MethodCollector.o(12537);
    }

    private void a(int i2, Animation.AnimationListener animationListener) {
        this.f12852f = i2;
        this.I.reset();
        this.I.setDuration(200);
        this.I.setInterpolator(this.x);
        if (animationListener != null) {
            this.f12851e.f12839a = animationListener;
        }
        this.f12851e.clearAnimation();
        this.f12851e.startAnimation(this.I);
    }

    public void onMeasure(int i2, int i3) {
        MethodCollector.i(12541);
        super.onMeasure(i2, i3);
        if (this.n == null) {
            b();
        }
        View view = this.n;
        if (view == null) {
            MethodCollector.o(12541);
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f12851e.measure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.G, 1073741824));
        if (!this.f12858l && !this.s) {
            this.s = true;
            int i4 = -this.f12851e.getMeasuredHeight();
            this.f12854h = i4;
            this.f12849c = i4;
        }
        this.z = -1;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) == this.f12851e) {
                this.z = i5;
                MethodCollector.o(12541);
                return;
            }
        }
        MethodCollector.o(12541);
    }

    private void a(boolean z2, boolean z3) {
        if (this.f12848b != z2) {
            this.f12857k = z3;
            b();
            this.f12848b = z2;
            if (z2) {
                a(this.f12849c, this.H);
            } else {
                a(this.H);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.n == null) {
                b();
            }
            View view = this.n;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f12851e.getMeasuredWidth();
                int measuredHeight2 = this.f12851e.getMeasuredHeight();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = this.f12849c;
                this.f12851e.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }
}
