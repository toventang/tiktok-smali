package androidx.customview.a;

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

public class a {
    private static final Interpolator v = new Interpolator() {
        /* class androidx.customview.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(911);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f2652a;

    /* renamed from: b  reason: collision with root package name */
    public int f2653b;

    /* renamed from: c  reason: collision with root package name */
    public int f2654c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f2655d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f2656e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f2657f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f2658g;

    /* renamed from: h  reason: collision with root package name */
    public float f2659h;

    /* renamed from: i  reason: collision with root package name */
    public int f2660i;

    /* renamed from: j  reason: collision with root package name */
    public int f2661j;

    /* renamed from: k  reason: collision with root package name */
    public View f2662k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f2663l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f2664m;
    private int[] n;
    private int o;
    private VelocityTracker p;
    private float q;
    private OverScroller r;
    private final AbstractC0038a s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable w = new Runnable() {
        /* class androidx.customview.a.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(912);
        }

        public final void run() {
            a.this.b(0);
        }
    };

    /* renamed from: androidx.customview.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0038a {
        static {
            Covode.recordClassIndex(913);
        }

        public int a(View view) {
            return 0;
        }

        public int a(View view, int i2, int i3) {
            return 0;
        }

        public void a() {
        }

        public void a(int i2) {
        }

        public void a(int i2, int i3) {
        }

        public void a(View view, float f2, float f3) {
        }

        public void a(View view, int i2) {
        }

        public void a(View view, int i2, int i3, int i4, int i5) {
        }

        public int b() {
            return 0;
        }

        public abstract boolean b(View view, int i2);

        public int c(View view, int i2) {
            return 0;
        }
    }

    public final void a(View view, int i2) {
        if (view.getParent() == this.u) {
            this.f2662k = view;
            this.f2654c = i2;
            this.s.a(view, i2);
            b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    }

    public final void a() {
        this.f2654c = -1;
        float[] fArr = this.f2655d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2656e, 0.0f);
            Arrays.fill(this.f2657f, 0.0f);
            Arrays.fill(this.f2658g, 0.0f);
            Arrays.fill(this.f2663l, 0);
            Arrays.fill(this.f2664m, 0);
            Arrays.fill(this.n, 0);
            this.o = 0;
        }
        VelocityTracker velocityTracker = this.p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.p = null;
        }
    }

    public final boolean a(View view, int i2, int i3) {
        this.f2662k = view;
        this.f2654c = -1;
        boolean a2 = a(i2, i3, 0, 0);
        if (!a2 && this.f2652a == 0 && this.f2662k != null) {
            this.f2662k = null;
        }
        return a2;
    }

    public final boolean a(int i2, int i3) {
        if (this.t) {
            return a(i2, i3, (int) this.p.getXVelocity(this.f2654c), (int) this.p.getYVelocity(this.f2654c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private boolean a(int i2, int i3, int i4, int i5) {
        int left = this.f2662k.getLeft();
        int top = this.f2662k.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            b(0);
            return false;
        }
        this.r.startScroll(left, top, i6, i7, a(this.f2662k, i6, i7, i4, i5));
        b(2);
        return true;
    }

    public final boolean a(int i2) {
        return ((1 << i2) & this.o) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d6, code lost:
        if (r3 != r6) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.a.a.a(android.view.MotionEvent):boolean");
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if (!((this.f2663l[i2] & i3) != i3 || (this.f2661j & i3) == 0 || (this.n[i2] & i3) == i3)) {
            int[] iArr = this.f2664m;
            if ((iArr[i2] & i3) != i3) {
                int i4 = this.f2653b;
                if ((abs > ((float) i4) || abs2 > ((float) i4)) && (iArr[i2] & i3) == 0 && abs > ((float) i4)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.a(view) > 0;
        boolean z2 = this.s.b() > 0;
        if (!z) {
            return z2 && Math.abs(f3) > ((float) this.f2653b);
        }
        if (!z2) {
            return Math.abs(f2) > ((float) this.f2653b);
        }
        int i2 = this.f2653b;
        return (f2 * f2) + (f3 * f3) > ((float) (i2 * i2));
    }

    static {
        Covode.recordClassIndex(910);
    }

    private void d() {
        this.p.computeCurrentVelocity(1000, this.q);
        a(a(this.p.getXVelocity(this.f2654c), this.f2659h, this.q), a(this.p.getYVelocity(this.f2654c), this.f2659h, this.q));
    }

    public final void b() {
        a();
        if (this.f2652a == 2) {
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            this.r.abortAnimation();
            int currX2 = this.r.getCurrX();
            int currY2 = this.r.getCurrY();
            this.s.a(this.f2662k, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        b(0);
    }

    public final boolean c() {
        if (this.f2652a == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.f2662k.getLeft();
            int top = currY - this.f2662k.getTop();
            if (left != 0) {
                v.e(this.f2662k, left);
            }
            if (top != 0) {
                v.d(this.f2662k, top);
            }
            if (!(left == 0 && top == 0)) {
                this.s.a(this.f2662k, currX, currY, left, top);
            }
            if (computeScrollOffset) {
                if (currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                    this.r.abortAnimation();
                }
            }
            this.u.post(this.w);
        }
        if (this.f2652a == 2) {
            return true;
        }
        return false;
    }

    private static float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private boolean d(int i2) {
        if (!a(i2)) {
            return false;
        }
        return true;
    }

    private void c(int i2) {
        if (this.f2655d != null && a(i2)) {
            this.f2655d[i2] = 0.0f;
            this.f2656e[i2] = 0.0f;
            this.f2657f[i2] = 0.0f;
            this.f2658g[i2] = 0.0f;
            this.f2663l[i2] = 0;
            this.f2664m[i2] = 0;
            this.n[i2] = 0;
            this.o = ((1 << i2) ^ -1) & this.o;
        }
    }

    private void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (d(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f2657f[pointerId] = x;
                this.f2658g[pointerId] = y;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        this.u.removeCallbacks(this.w);
        if (this.f2652a != i2) {
            this.f2652a = i2;
            this.s.a(i2);
            if (this.f2652a == 0) {
                this.f2662k = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015e, code lost:
        if (r10.f2654c == -1) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0160, code lost:
        d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.a.a.b(android.view.MotionEvent):void");
    }

    private boolean b(View view, int i2) {
        if (view == this.f2662k && this.f2654c == i2) {
            return true;
        }
        if (view == null || !this.s.b(view, i2)) {
            return false;
        }
        this.f2654c = i2;
        a(view, i2);
        return true;
    }

    public final View b(int i2, int i3) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.u.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public static a a(ViewGroup viewGroup, AbstractC0038a aVar) {
        return new a(viewGroup.getContext(), viewGroup, aVar);
    }

    private void a(float f2, float f3) {
        this.t = true;
        this.s.a(this.f2662k, f2, f3);
        this.t = false;
        if (this.f2652a == 1) {
            b(0);
        }
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

    public static a a(ViewGroup viewGroup, float f2, AbstractC0038a aVar) {
        a a2 = a(viewGroup, aVar);
        a2.f2653b = (int) (((float) a2.f2653b) * (1.0f / f2));
        return a2;
    }

    private void b(float f2, float f3, int i2) {
        boolean a2 = a(f2, f3, i2, 1);
        if (a(f3, f2, i2, 4)) {
            a2 |= true;
        }
        if (a(f2, f3, i2, 2)) {
            boolean z = a2 ? 1 : 0;
            char c2 = a2 ? 1 : 0;
            a2 = z | true;
        }
        if (a(f3, f2, i2, 8)) {
            boolean z2 = a2 ? 1 : 0;
            char c3 = a2 ? 1 : 0;
            a2 = z2 | true;
        }
        if (a2) {
            int[] iArr = this.f2664m;
            int i3 = iArr[i2];
            int i4 = a2 ? 1 : 0;
            char c4 = a2 ? 1 : 0;
            iArr[i2] = i3 | i4;
            AbstractC0038a aVar = this.s;
            int i5 = a2 ? 1 : 0;
            int i6 = a2 ? 1 : 0;
            int i7 = a2 ? 1 : 0;
            int i8 = a2 ? 1 : 0;
            aVar.a(i5, i2);
        }
    }

    private a(Context context, ViewGroup viewGroup, AbstractC0038a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.u = viewGroup;
            this.s = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f2660i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f2653b = viewConfiguration.getScaledTouchSlop();
            this.q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f2659h = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private int a(int i2, int i3, int i4) {
        int abs;
        if (i2 == 0) {
            return 0;
        }
        int width = this.u.getWidth();
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

    private void a(float f2, float f3, int i2) {
        float[] fArr = this.f2655d;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2656e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2657f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2658g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2663l;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2664m;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.n;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2655d = fArr2;
            this.f2656e = fArr3;
            this.f2657f = fArr4;
            this.f2658g = fArr5;
            this.f2663l = iArr;
            this.f2664m = iArr2;
            this.n = iArr3;
        }
        float[] fArr9 = this.f2655d;
        this.f2657f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f2656e;
        this.f2658g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f2663l;
        int i5 = (int) f2;
        int i6 = (int) f3;
        if (i5 < this.u.getLeft() + this.f2660i) {
            i3 = 1;
        }
        if (i6 < this.u.getTop() + this.f2660i) {
            i3 |= 4;
        }
        if (i5 > this.u.getRight() - this.f2660i) {
            i3 |= 2;
        }
        if (i6 > this.u.getBottom() - this.f2660i) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.o |= 1 << i2;
    }

    private int a(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int b2 = b(i4, (int) this.f2659h, (int) this.q);
        int b3 = b(i5, (int) this.f2659h, (int) this.q);
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
        return (int) ((((float) a(i2, b2, this.s.a(view))) * f6) + (((float) a(i3, b3, this.s.b())) * f7));
    }
}
