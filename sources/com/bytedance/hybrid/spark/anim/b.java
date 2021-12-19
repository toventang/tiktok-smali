package com.bytedance.hybrid.spark.anim;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class b {
    private static final Interpolator w = new Interpolator() {
        /* class com.bytedance.hybrid.spark.anim.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(18058);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f31088a;

    /* renamed from: b  reason: collision with root package name */
    public int f31089b;

    /* renamed from: c  reason: collision with root package name */
    public int f31090c = -1;

    /* renamed from: d  reason: collision with root package name */
    float[] f31091d;

    /* renamed from: e  reason: collision with root package name */
    float[] f31092e;

    /* renamed from: f  reason: collision with root package name */
    float[] f31093f;

    /* renamed from: g  reason: collision with root package name */
    float[] f31094g;

    /* renamed from: h  reason: collision with root package name */
    int[] f31095h;

    /* renamed from: i  reason: collision with root package name */
    VelocityTracker f31096i;

    /* renamed from: j  reason: collision with root package name */
    public float f31097j;

    /* renamed from: k  reason: collision with root package name */
    public int f31098k;

    /* renamed from: l  reason: collision with root package name */
    public int f31099l;

    /* renamed from: m  reason: collision with root package name */
    OverScroller f31100m;
    final a n;
    public View o;
    final ViewGroup p;
    final Runnable q = new Runnable() {
        /* class com.bytedance.hybrid.spark.anim.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(18059);
        }

        public final void run() {
            b.this.b(0);
        }
    };
    private int[] r;
    private int[] s;
    private int t;
    private float u;
    private boolean v;

    public static abstract class a {
        static {
            Covode.recordClassIndex(18060);
        }

        public int a() {
            return 0;
        }

        public int a(View view) {
            return 0;
        }

        public void a(int i2) {
        }

        public void a(View view, float f2, float f3) {
        }

        public abstract boolean a(View view, int i2);

        public abstract boolean a(View view, MotionEvent motionEvent);

        public void b(int i2) {
        }

        public int c(int i2) {
            return 0;
        }
    }

    public final void a(View view, int i2) {
        if (view.getParent() == this.p) {
            this.o = view;
            this.f31090c = i2;
            b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.p + ")");
    }

    public final boolean a(View view, int i2, int i3) {
        this.o = view;
        this.f31090c = -1;
        boolean a2 = a(i2, i3, 0, 0);
        if (!a2 && this.f31088a == 0 && this.o != null) {
            this.o = null;
        }
        return a2;
    }

    public final boolean a(int i2, int i3) {
        if (this.v) {
            return a(i2, i3, (int) this.f31096i.getXVelocity(this.f31090c), (int) this.f31096i.getYVelocity(this.f31090c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.f31091d != null && e(i2)) {
            this.f31091d[i2] = 0.0f;
            this.f31092e[i2] = 0.0f;
            this.f31093f[i2] = 0.0f;
            this.f31094g[i2] = 0.0f;
            this.f31095h[i2] = 0;
            this.r[i2] = 0;
            this.s[i2] = 0;
            this.t = ((1 << i2) ^ -1) & this.t;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (c(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f31093f[pointerId] = x;
                this.f31094g[pointerId] = y;
            }
        }
    }

    public final boolean a(View view, int i2, int i3, int i4, int i5) {
        int i6;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i4 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i6 = i5 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom() && a(childAt, i2, i3, i7 - childAt.getLeft(), i6 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (view.canScrollHorizontally(-i2) || view.canScrollVertically(-i3)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        return view != null && this.n.a() > 0 && Math.abs(f2) > ((float) this.f31089b);
    }

    static {
        Covode.recordClassIndex(18057);
    }

    private void c() {
        float[] fArr = this.f31091d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f31092e, 0.0f);
            Arrays.fill(this.f31093f, 0.0f);
            Arrays.fill(this.f31094g, 0.0f);
            Arrays.fill(this.f31095h, 0);
            Arrays.fill(this.r, 0);
            Arrays.fill(this.s, 0);
            this.t = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f31096i.computeCurrentVelocity(1000, this.u);
        a(a(this.f31096i.getXVelocity(this.f31090c), this.f31097j, this.u), a(this.f31096i.getYVelocity(this.f31090c), this.f31097j, this.u));
    }

    public final void a() {
        this.f31090c = -1;
        c();
        VelocityTracker velocityTracker = this.f31096i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f31096i = null;
        }
    }

    private static float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private boolean e(int i2) {
        if (((1 << i2) & this.t) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean c(int i2) {
        if (!e(i2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        this.p.removeCallbacks(this.q);
        if (this.f31088a != i2) {
            this.f31088a = i2;
            this.n.b(i2);
            if (this.f31088a == 0) {
                this.o = null;
            }
        }
    }

    private void d(int i2) {
        float[] fArr = this.f31091d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f31092e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f31093f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f31094g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f31095h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.r;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.s;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f31091d = fArr2;
            this.f31092e = fArr3;
            this.f31093f = fArr4;
            this.f31094g = fArr5;
            this.f31095h = iArr;
            this.r = iArr2;
            this.s = iArr3;
        }
    }

    private int c(int i2, int i3) {
        int i4;
        if (i2 < this.p.getLeft() + this.f31098k) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i3 < this.p.getTop() + this.f31098k) {
            i4 |= 4;
        }
        if (i2 > this.p.getRight() - this.f31098k) {
            i4 |= 2;
        }
        if (i3 > this.p.getBottom() - this.f31098k) {
            return i4 | 8;
        }
        return i4;
    }

    public final View b(int i2, int i3) {
        for (int childCount = this.p.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.p.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, float f3) {
        this.v = true;
        this.n.a(this.o, f2, f3);
        this.v = false;
        if (this.f31088a == 1) {
            b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(View view, int i2) {
        if (view == this.o && this.f31090c == i2) {
            return true;
        }
        if (view == null || !this.n.a(view, i2)) {
            return false;
        }
        this.f31090c = i2;
        a(view, i2);
        return true;
    }

    private static int b(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs <= i4) {
            return i2;
        }
        if (i2 > 0) {
            return i4;
        }
        return -i4;
    }

    private static float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs <= f4) {
            return f2;
        }
        if (f2 > 0.0f) {
            return f4;
        }
        return -f4;
    }

    b(Context context, ViewGroup viewGroup, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.p = viewGroup;
            this.n = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f31098k = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f31089b = viewConfiguration.getScaledTouchSlop();
            this.u = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f31097j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f31100m = new OverScroller(context, w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private int a(int i2, int i3, int i4) {
        int abs;
        if (i2 == 0) {
            return 0;
        }
        int width = this.p.getWidth();
        float f2 = (float) (width / 2);
        float a2 = f2 + (a(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a2 / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* access modifiers changed from: package-private */
    public final void b(float f2, float f3, int i2) {
        boolean a2 = a(f2, f3, i2, 1);
        if (a(f3, f2, i2, 4)) {
            a2 |= true;
        }
        if (a(f2, f3, i2, 2)) {
            a2 |= true;
        }
        if (a(f3, f2, i2, 8)) {
            a2 |= true;
        }
        if (a2) {
            int[] iArr = this.r;
            iArr[i2] = iArr[i2] | a2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, float f3, int i2) {
        d(i2);
        float[] fArr = this.f31091d;
        this.f31093f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f31092e;
        this.f31094g[i2] = f3;
        fArr2[i2] = f3;
        this.f31095h[i2] = c((int) f2, (int) f3);
        this.t |= 1 << i2;
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if (!((this.f31095h[i2] & i3) != i3 || (this.f31099l & i3) == 0 || (this.s[i2] & i3) == i3)) {
            int[] iArr = this.r;
            if ((iArr[i2] & i3) != i3) {
                int i4 = this.f31089b;
                if ((abs > ((float) i4) || abs2 > ((float) i4)) && (iArr[i2] & i3) == 0 && abs > ((float) i4)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int b(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int b2 = b(i4, (int) this.f31097j, (int) this.u);
        int b3 = b(i5, (int) this.f31097j, (int) this.u);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(b2);
        int abs4 = Math.abs(b3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (b2 != 0) {
            f2 = (float) abs3;
            f3 = (float) i6;
        } else {
            f2 = (float) abs;
            f3 = (float) i7;
        }
        float f6 = f2 / f3;
        if (b3 != 0) {
            f4 = (float) abs4;
            f5 = (float) i6;
        } else {
            f4 = (float) abs2;
            f5 = (float) i7;
        }
        float f7 = f4 / f5;
        return (int) ((((float) a(i2, b2, 0)) * f6) + (((float) a(i3, b3, this.n.a())) * f7));
    }

    private boolean a(int i2, int i3, int i4, int i5) {
        int left = this.o.getLeft();
        int top = this.o.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f31100m.abortAnimation();
            b(0);
            return false;
        }
        this.f31100m.startScroll(left, top, i6, i7, b(i6, i7, i4, i5));
        b(2);
        return true;
    }
}
