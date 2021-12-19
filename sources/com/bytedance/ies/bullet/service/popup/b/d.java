package com.bytedance.ies.bullet.service.popup.b;

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

public final class d {
    private static final Interpolator w = new com.bytedance.ies.bullet.service.popup.anim.a();

    /* renamed from: a  reason: collision with root package name */
    public int f32925a;

    /* renamed from: b  reason: collision with root package name */
    public int f32926b;

    /* renamed from: c  reason: collision with root package name */
    public int f32927c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f32928d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f32929e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f32930f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f32931g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f32932h;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f32933i;

    /* renamed from: j  reason: collision with root package name */
    public float f32934j;

    /* renamed from: k  reason: collision with root package name */
    public int f32935k;

    /* renamed from: l  reason: collision with root package name */
    public int f32936l;

    /* renamed from: m  reason: collision with root package name */
    public OverScroller f32937m;
    public final a n;
    public View o;
    public boolean p;
    public final ViewGroup q;
    public final Runnable r = new Runnable() {
        /* class com.bytedance.ies.bullet.service.popup.b.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(19656);
        }

        public final void run() {
            d.this.b(0);
        }
    };
    private int[] s;
    private int[] t;
    private int u;
    private float v;

    public static abstract class a {
        static {
            Covode.recordClassIndex(19657);
        }

        public int a() {
            return 0;
        }

        public int a(View view) {
            return 0;
        }

        public void a(int i2) {
        }

        public void a(View view, float f2) {
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
        if (view.getParent() == this.q) {
            this.o = view;
            this.f32927c = i2;
            b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.q + ")");
    }

    public final boolean a(View view, int i2, int i3) {
        this.o = view;
        this.f32927c = -1;
        boolean a2 = a(i2, i3, 0, 0);
        if (!a2 && this.f32925a == 0 && this.o != null) {
            this.o = null;
        }
        return a2;
    }

    public final boolean a(int i2, int i3, int i4, int i5) {
        int left = this.o.getLeft();
        int top = this.o.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f32937m.abortAnimation();
            b(0);
            return false;
        }
        this.f32937m.startScroll(left, top, i6, i7, b(i6, i7, i4, i5));
        b(2);
        return true;
    }

    public final void a(int i2) {
        if (this.f32928d != null && e(i2)) {
            this.f32928d[i2] = 0.0f;
            this.f32929e[i2] = 0.0f;
            this.f32930f[i2] = 0.0f;
            this.f32931g[i2] = 0.0f;
            this.f32932h[i2] = 0;
            this.s[i2] = 0;
            this.t[i2] = 0;
            this.u = ((1 << i2) ^ -1) & this.u;
        }
    }

    public final void a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (c(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f32930f[pointerId] = x;
                this.f32931g[pointerId] = y;
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

    public final boolean a(View view, float f2) {
        return view != null && this.n.a() > 0 && Math.abs(f2) > ((float) this.f32926b);
    }

    static {
        Covode.recordClassIndex(19655);
    }

    private void c() {
        float[] fArr = this.f32928d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f32929e, 0.0f);
            Arrays.fill(this.f32930f, 0.0f);
            Arrays.fill(this.f32931g, 0.0f);
            Arrays.fill(this.f32932h, 0);
            Arrays.fill(this.s, 0);
            Arrays.fill(this.t, 0);
            this.u = 0;
        }
    }

    public final void b() {
        this.f32933i.computeCurrentVelocity(1000, this.v);
        a(this.f32933i.getXVelocity(this.f32927c), this.f32934j, this.v);
        a(a(this.f32933i.getYVelocity(this.f32927c), this.f32934j, this.v));
    }

    public final void a() {
        this.f32927c = -1;
        c();
        VelocityTracker velocityTracker = this.f32933i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f32933i = null;
        }
    }

    private static float b(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private boolean e(int i2) {
        if (((1 << i2) & this.u) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c(int i2) {
        if (!e(i2)) {
            return false;
        }
        return true;
    }

    private void d(int i2) {
        float[] fArr = this.f32928d;
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
                float[] fArr6 = this.f32929e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f32930f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f32931g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f32932h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.s;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.t;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f32928d = fArr2;
            this.f32929e = fArr3;
            this.f32930f = fArr4;
            this.f32931g = fArr5;
            this.f32932h = iArr;
            this.s = iArr2;
            this.t = iArr3;
        }
    }

    public final void a(float f2) {
        this.p = true;
        this.n.a(this.o, f2);
        this.p = false;
        if (this.f32925a == 1) {
            b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        this.q.removeCallbacks(this.r);
        if (this.f32925a != i2) {
            this.f32925a = i2;
            this.n.b(i2);
            if (this.f32925a == 0) {
                this.o = null;
            }
        }
    }

    private int b(int i2, int i3) {
        int i4;
        if (i2 < this.q.getLeft() + this.f32935k) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i3 < this.q.getTop() + this.f32935k) {
            i4 |= 4;
        }
        if (i2 > this.q.getRight() - this.f32935k) {
            i4 |= 2;
        }
        if (i3 > this.q.getBottom() - this.f32935k) {
            return i4 | 8;
        }
        return i4;
    }

    public final View a(int i2, int i3) {
        for (int childCount = this.q.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.q.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean b(View view, int i2) {
        if (view == this.o && this.f32927c == i2) {
            return true;
        }
        if (view == null || !this.n.a(view, i2)) {
            return false;
        }
        this.f32927c = i2;
        a(view, i2);
        return true;
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

    public d(Context context, ViewGroup viewGroup, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.q = viewGroup;
            this.n = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f32935k = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f32926b = viewConfiguration.getScaledTouchSlop();
            this.v = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f32934j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f32937m = new OverScroller(context, w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private int a(int i2, int i3, int i4) {
        int abs;
        if (i2 == 0) {
            return 0;
        }
        int width = this.q.getWidth();
        float f2 = (float) (width / 2);
        float b2 = f2 + (b(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(b2 / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 300);
    }

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
            int[] iArr = this.s;
            iArr[i2] = iArr[i2] | a2;
        }
    }

    public final void a(float f2, float f3, int i2) {
        d(i2);
        float[] fArr = this.f32928d;
        this.f32930f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f32929e;
        this.f32931g[i2] = f3;
        fArr2[i2] = f3;
        this.f32932h[i2] = b((int) f2, (int) f3);
        this.u |= 1 << i2;
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if (!((this.f32932h[i2] & i3) != i3 || (this.f32936l & i3) == 0 || (this.t[i2] & i3) == i3)) {
            int[] iArr = this.s;
            if ((iArr[i2] & i3) != i3) {
                int i4 = this.f32926b;
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
        int b2 = b(i4, (int) this.f32934j, (int) this.v);
        int b3 = b(i5, (int) this.f32934j, (int) this.v);
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
}
