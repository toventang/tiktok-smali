package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

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
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import java.util.Arrays;

public final class c {
    private static float s = 1.0f;
    private static final Interpolator x = new Interpolator() {
        /* class com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(45888);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f74394a;

    /* renamed from: b  reason: collision with root package name */
    public int f74395b;

    /* renamed from: c  reason: collision with root package name */
    public int f74396c = -1;

    /* renamed from: d  reason: collision with root package name */
    float[] f74397d;

    /* renamed from: e  reason: collision with root package name */
    float[] f74398e;

    /* renamed from: f  reason: collision with root package name */
    float[] f74399f;

    /* renamed from: g  reason: collision with root package name */
    float[] f74400g;

    /* renamed from: h  reason: collision with root package name */
    int[] f74401h;

    /* renamed from: i  reason: collision with root package name */
    VelocityTracker f74402i;

    /* renamed from: j  reason: collision with root package name */
    public float f74403j;

    /* renamed from: k  reason: collision with root package name */
    public int f74404k;

    /* renamed from: l  reason: collision with root package name */
    public int f74405l;

    /* renamed from: m  reason: collision with root package name */
    OverScroller f74406m;
    final a n;
    public View o;
    boolean p;
    final ViewGroup q;
    final Runnable r = new Runnable() {
        /* class com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c.AnonymousClass2 */

        static {
            Covode.recordClassIndex(45889);
        }

        public final void run() {
            c.this.b(0);
        }
    };
    private int[] t;
    private int[] u;
    private int v;
    private float w;

    public static abstract class a {
        static {
            Covode.recordClassIndex(45890);
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

        public int b() {
            return 0;
        }

        public void b(int i2) {
        }

        public int c(int i2) {
            return 0;
        }
    }

    public final void a(View view, int i2) {
        if (view.getParent() == this.q) {
            this.o = view;
            this.f74396c = i2;
            b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the AdPopUpWebViewDragHelper's tracked parent view (" + this.q + ")");
    }

    public final boolean a(View view, int i2, int i3) {
        this.o = view;
        this.f74396c = -1;
        boolean a2 = a(i2, i3, 0, 0);
        if (!a2 && this.f74394a == 0 && this.o != null) {
            this.o = null;
        }
        return a2;
    }

    public final boolean a(View view, int i2, int i3, boolean z) {
        float f2;
        if (z) {
            f2 = 0.8f;
        } else {
            f2 = 1.0f;
        }
        s = f2;
        return a(view, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, int i3, int i4, int i5) {
        int left = this.o.getLeft();
        int top = this.o.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0 && !aa.f75538i) {
            this.f74406m.abortAnimation();
            b(0);
            return false;
        }
        this.f74406m.startScroll(left, top, i6, i7, b(i6, i7, i4, i5));
        b(2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (c(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f74399f[pointerId] = x2;
                this.f74400g[pointerId] = y;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.n.b() > 0;
        boolean z2 = this.n.a() > 0;
        if (!z) {
            return z2 && Math.abs(f3) > ((float) this.f74395b);
        }
        if (!z2) {
            return Math.abs(f2) > ((float) this.f74395b);
        }
        int i2 = this.f74395b;
        return (f2 * f2) + (f3 * f3) > ((float) (i2 * i2));
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4) {
        int left = this.o.getLeft();
        int top = this.o.getTop();
        if (i3 != 0) {
            v.e(this.o, this.n.a(this.o) - left);
        }
        if (i4 != 0) {
            i2 = this.n.c(i2);
            v.d(this.o, i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.n.a(i2);
        }
    }

    static {
        Covode.recordClassIndex(45887);
    }

    private void c() {
        float[] fArr = this.f74397d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f74398e, 0.0f);
            Arrays.fill(this.f74399f, 0.0f);
            Arrays.fill(this.f74400g, 0.0f);
            Arrays.fill(this.f74401h, 0);
            Arrays.fill(this.t, 0);
            Arrays.fill(this.u, 0);
            this.v = 0;
        }
    }

    public final void a() {
        this.f74396c = -1;
        c();
        VelocityTracker velocityTracker = this.f74402i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f74402i = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f74402i.computeCurrentVelocity(1000, this.w);
        a(a(this.f74402i.getXVelocity(this.f74396c), this.f74403j, this.w), a(this.f74402i.getYVelocity(this.f74396c), this.f74403j, this.w));
    }

    private static float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private boolean e(int i2) {
        if (((1 << i2) & this.v) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        this.q.removeCallbacks(this.r);
        if (this.f74394a != i2) {
            this.f74394a = i2;
            this.n.b(i2);
            if (this.f74394a == 0) {
                this.o = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c(int i2) {
        if (!e(i2)) {
            return false;
        }
        return true;
    }

    private void d(int i2) {
        float[] fArr = this.f74397d;
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
                float[] fArr6 = this.f74398e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f74399f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f74400g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f74401h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.t;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.u;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f74397d = fArr2;
            this.f74398e = fArr3;
            this.f74399f = fArr4;
            this.f74400g = fArr5;
            this.f74401h = iArr;
            this.t = iArr2;
            this.u = iArr3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.f74397d != null && e(i2)) {
            this.f74397d[i2] = 0.0f;
            this.f74398e[i2] = 0.0f;
            this.f74399f[i2] = 0.0f;
            this.f74400g[i2] = 0.0f;
            this.f74401h[i2] = 0;
            this.t[i2] = 0;
            this.u[i2] = 0;
            this.v = ((1 << i2) ^ -1) & this.v;
        }
    }

    private int b(int i2, int i3) {
        int i4;
        if (i2 < this.q.getLeft() + this.f74404k) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i3 < this.q.getTop() + this.f74404k) {
            i4 |= 4;
        }
        if (i2 > this.q.getRight() - this.f74404k) {
            i4 |= 2;
        }
        if (i3 > this.q.getBottom() - this.f74404k) {
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

    /* access modifiers changed from: package-private */
    public final void a(float f2, float f3) {
        this.p = true;
        this.n.a(this.o, f2, f3);
        this.p = false;
        if (this.f74394a == 1) {
            b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(View view, int i2) {
        if (view == this.o && this.f74396c == i2) {
            return true;
        }
        if (view == null || !this.n.a(view, i2)) {
            return false;
        }
        this.f74396c = i2;
        a(view, i2);
        return true;
    }

    private static int c(int i2, int i3, int i4) {
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

    c(Context context, ViewGroup viewGroup, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.q = viewGroup;
            this.n = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f74404k = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f74395b = viewConfiguration.getScaledTouchSlop();
            this.w = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f74403j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f74406m = new OverScroller(context, x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private int b(int i2, int i3, int i4) {
        int abs;
        if (i2 == 0) {
            return 0;
        }
        int width = this.q.getWidth();
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
    public final void a(float f2, float f3, int i2) {
        d(i2);
        float[] fArr = this.f74397d;
        this.f74399f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f74398e;
        this.f74400g[i2] = f3;
        fArr2[i2] = f3;
        this.f74401h[i2] = b((int) f2, (int) f3);
        this.v |= 1 << i2;
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
            int[] iArr = this.t;
            iArr[i2] = iArr[i2] | a2;
        }
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if (!((this.f74401h[i2] & i3) != i3 || (this.f74405l & i3) == 0 || (this.u[i2] & i3) == i3)) {
            int[] iArr = this.t;
            if ((iArr[i2] & i3) != i3) {
                int i4 = this.f74395b;
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
        int c2 = c(i4, (int) this.f74403j, (int) this.w);
        int c3 = c(i5, (int) this.f74403j, (int) this.w);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(c2);
        int abs4 = Math.abs(c3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (c2 != 0) {
            f2 = (float) abs3;
            f3 = (float) i6;
        } else {
            f2 = (float) abs;
            f3 = (float) i7;
        }
        float f6 = f2 / f3;
        if (c3 != 0) {
            f4 = (float) abs4;
            f5 = (float) i6;
        } else {
            f4 = (float) abs2;
            f5 = (float) i7;
        }
        float f7 = f4 / f5;
        return (int) (((((float) b(i2, c2, this.n.b())) * f6) + (((float) b(i3, c3, this.n.a())) * f7)) * s);
    }
}
