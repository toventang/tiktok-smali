package com.ss.android.ugc.aweme.homepage.story.container;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class m {
    private static final Interpolator x = new Interpolator() {
        /* class com.ss.android.ugc.aweme.homepage.story.container.m.AnonymousClass1 */

        static {
            Covode.recordClassIndex(63295);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f99359a;

    /* renamed from: b  reason: collision with root package name */
    public int f99360b;

    /* renamed from: c  reason: collision with root package name */
    public int f99361c = -1;

    /* renamed from: d  reason: collision with root package name */
    float[] f99362d;

    /* renamed from: e  reason: collision with root package name */
    float[] f99363e;

    /* renamed from: f  reason: collision with root package name */
    float[] f99364f;

    /* renamed from: g  reason: collision with root package name */
    float[] f99365g;

    /* renamed from: h  reason: collision with root package name */
    int[] f99366h;

    /* renamed from: i  reason: collision with root package name */
    VelocityTracker f99367i;

    /* renamed from: j  reason: collision with root package name */
    public float f99368j;

    /* renamed from: k  reason: collision with root package name */
    public int f99369k;

    /* renamed from: l  reason: collision with root package name */
    public final int f99370l;

    /* renamed from: m  reason: collision with root package name */
    public int f99371m;
    final a n;
    public View o;
    boolean p;
    private int[] q;
    private int[] r;
    private int[] s;
    private int t;
    private float u;
    private OverScroller v;
    private final ViewGroup w;
    private final Runnable y = new Runnable() {
        /* class com.ss.android.ugc.aweme.homepage.story.container.m.AnonymousClass2 */

        static {
            Covode.recordClassIndex(63296);
        }

        public final void run() {
            m.this.c(0);
        }
    };

    public static abstract class a {
        static {
            Covode.recordClassIndex(63297);
        }

        public void a(int i2) {
        }

        public void a(View view, float f2) {
        }

        public void a(View view, int i2) {
        }

        public boolean a(float f2, float f3, float f4, float f5, int i2, View view) {
            return false;
        }

        public abstract boolean a(View view);

        public int b(View view, int i2) {
            return 0;
        }

        public void b(View view) {
        }

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }
    }

    public final void a(View view, int i2) {
        if (view.getParent() == this.w) {
            this.o = view;
            this.f99361c = i2;
            this.n.b(view);
            c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.w + ")");
    }

    public final boolean a(View view, int i2, int i3) {
        this.o = view;
        this.f99361c = -1;
        boolean a2 = a(i2, i3, 0, 0);
        if (!a2 && this.f99359a == 0 && this.o != null) {
            this.o = null;
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, int i3, int i4, int i5) {
        int left = this.o.getLeft();
        int top = this.o.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.v.abortAnimation();
            c(0);
            return false;
        }
        this.v.startScroll(left, top, i6, i7, a(this.o, i6, i7, i4, i5));
        c(2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.f99362d != null && b(i2)) {
            this.f99362d[i2] = 0.0f;
            this.f99363e[i2] = 0.0f;
            this.f99364f[i2] = 0.0f;
            this.f99365g[i2] = 0.0f;
            this.f99366h[i2] = 0;
            this.q[i2] = 0;
            this.r[i2] = 0;
            this.s[i2] = 0;
            this.t = ((1 << i2) ^ -1) & this.t;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, float f3, int i2) {
        e(i2);
        float[] fArr = this.f99362d;
        this.f99364f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f99363e;
        this.f99365g[i2] = f3;
        fArr2[i2] = f3;
        this.f99366h[i2] = b((int) f2, (int) f3);
        this.t |= 1 << i2;
    }

    /* access modifiers changed from: package-private */
    public final void a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (d(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f99364f[pointerId] = x2;
                this.f99365g[pointerId] = y2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, float f3, float f4, float f5, int i2, View view) {
        float abs = Math.abs(f4);
        Math.abs(f5);
        if (c(abs, abs, i2) && abs > ((float) this.f99360b) && this.n.a(f2, f3, f4, f5, i2, view)) {
            int[] iArr = this.r;
            iArr[i2] = iArr[i2] | 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2) {
        return view != null && this.n.c(view) > 0 && Math.abs(f2) > ((float) this.f99360b);
    }

    static {
        Covode.recordClassIndex(63294);
    }

    private void d() {
        float[] fArr = this.f99362d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f99363e, 0.0f);
            Arrays.fill(this.f99364f, 0.0f);
            Arrays.fill(this.f99365g, 0.0f);
            Arrays.fill(this.f99366h, 0);
            Arrays.fill(this.q, 0);
            Arrays.fill(this.r, 0);
            Arrays.fill(this.s, 0);
            this.t = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f99367i.computeCurrentVelocity(1000, this.u);
        float a2 = a(this.f99367i.getXVelocity(this.f99361c), this.f99368j, this.u);
        a(this.f99367i.getYVelocity(this.f99361c), this.f99368j, this.u);
        a(a2);
    }

    public final boolean b() {
        if (this.f99359a == 2) {
            boolean computeScrollOffset = this.v.computeScrollOffset();
            int currX = this.v.getCurrX();
            int currY = this.v.getCurrY();
            int left = currX - this.o.getLeft();
            int top = currY - this.o.getTop();
            if (left != 0) {
                v.e(this.o, left);
            }
            if (top != 0) {
                v.d(this.o, top);
            }
            if (!(left == 0 && top == 0)) {
                this.n.a(this.o, currX);
            }
            if (computeScrollOffset) {
                if (currX == this.v.getFinalX() && currY == this.v.getFinalY()) {
                    this.v.abortAnimation();
                }
            }
            this.w.post(this.y);
        }
        if (this.f99359a == 2) {
            return true;
        }
        return false;
    }

    public final void a() {
        this.f99361c = -1;
        d();
        VelocityTracker velocityTracker = this.f99367i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f99367i = null;
        }
    }

    private static float b(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: package-private */
    public final boolean d(int i2) {
        if (!b(i2)) {
            return false;
        }
        return true;
    }

    private void e(int i2) {
        float[] fArr = this.f99362d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            int[] iArr4 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f99363e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f99364f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f99365g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr5 = this.f99366h;
                System.arraycopy(iArr5, 0, iArr, 0, iArr5.length);
                int[] iArr6 = this.q;
                System.arraycopy(iArr6, 0, iArr2, 0, iArr6.length);
                int[] iArr7 = this.r;
                System.arraycopy(iArr7, 0, iArr3, 0, iArr7.length);
                int[] iArr8 = this.s;
                System.arraycopy(iArr8, 0, iArr4, 0, iArr8.length);
            }
            this.f99362d = fArr2;
            this.f99363e = fArr3;
            this.f99364f = fArr4;
            this.f99365g = fArr5;
            this.f99366h = iArr;
            this.q = iArr2;
            this.r = iArr3;
            this.s = iArr4;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        this.w.removeCallbacks(this.y);
        if (this.f99359a != i2) {
            this.f99359a = i2;
            this.n.a(i2);
            if (this.f99359a == 0) {
                this.o = null;
            }
        }
    }

    public final boolean b(int i2) {
        if (((1 << i2) & this.t) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        this.p = true;
        this.n.a(this.o, f2);
        this.p = false;
        if (this.f99359a == 1) {
            c(0);
        }
    }

    private int b(int i2, int i3) {
        int i4;
        if (i2 < this.w.getLeft() + this.f99369k) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i3 < this.w.getTop() + this.f99369k) {
            i4 |= 4;
        }
        if (i2 > this.w.getRight() - this.f99369k) {
            i4 |= 2;
        }
        if (i3 > this.w.getBottom() - this.f99369k) {
            return i4 | 8;
        }
        return i4;
    }

    public final View a(int i2, int i3) {
        for (int childCount = this.w.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.w.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(View view, int i2) {
        if (view == this.o && this.f99361c == i2) {
            return true;
        }
        if (view == null) {
            return false;
        }
        this.n.a(view);
        return false;
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

    private boolean c(float f2, float f3, int i2) {
        int[] iArr = this.r;
        if ((iArr[i2] & 1) != 1) {
            int i3 = this.f99360b;
            if ((f2 > ((float) i3) || f3 > ((float) i3)) && (iArr[i2] & 1) == 0) {
                return true;
            }
        }
        return false;
    }

    m(Context context, ViewGroup viewGroup, a aVar) {
        if (aVar != null) {
            this.w = viewGroup;
            this.n = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f99370l = i2;
            this.f99369k = i2;
            this.f99360b = viewConfiguration.getScaledTouchSlop();
            this.u = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f99368j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.v = new OverScroller(context, x);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private int a(int i2, int i3, int i4) {
        int abs;
        if (i2 == 0) {
            return 0;
        }
        int width = this.w.getWidth();
        float f2 = (float) (width / 2);
        float b2 = f2 + (b(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(b2 / ((float) abs2)) * 1000.0f) * 4;
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
            int[] iArr = this.q;
            iArr[i2] = iArr[i2] | a2;
        }
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if (!((this.f99366h[i2] & i3) != i3 || (this.f99371m & i3) == 0 || (this.s[i2] & i3) == i3)) {
            int[] iArr = this.q;
            if ((iArr[i2] & i3) != i3) {
                int i4 = this.f99360b;
                if ((abs > ((float) i4) || abs2 > ((float) i4)) && (iArr[i2] & i3) == 0 && abs > ((float) i4)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int a(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int b2 = b(i4, (int) this.f99368j, (int) this.u);
        int b3 = b(i5, (int) this.f99368j, (int) this.u);
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
        return (int) ((((float) a(i2, b2, this.n.c(view))) * f6) + (((float) a(i3, b3, 0)) * f7));
    }
}
