package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;

public abstract class a implements View.OnTouchListener {
    private static final int r = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    final C0037a f2608a;

    /* renamed from: b  reason: collision with root package name */
    final View f2609b;

    /* renamed from: c  reason: collision with root package name */
    boolean f2610c;

    /* renamed from: d  reason: collision with root package name */
    boolean f2611d;

    /* renamed from: e  reason: collision with root package name */
    boolean f2612e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2613f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2614g;

    /* renamed from: h  reason: collision with root package name */
    private final Interpolator f2615h = new AccelerateInterpolator();

    /* renamed from: i  reason: collision with root package name */
    private Runnable f2616i;

    /* renamed from: j  reason: collision with root package name */
    private float[] f2617j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    private float[] f2618k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l  reason: collision with root package name */
    private int f2619l;

    /* renamed from: m  reason: collision with root package name */
    private int f2620m;
    private float[] n = {0.0f, 0.0f};
    private float[] o = {0.0f, 0.0f};
    private float[] p = {Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean q;

    static float a(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int a(int i2, int i3) {
        if (i2 > i3) {
            return i3;
        }
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public abstract void a(int i2);

    public abstract boolean b(int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    public static class C0037a {

        /* renamed from: a  reason: collision with root package name */
        public int f2621a;

        /* renamed from: b  reason: collision with root package name */
        public int f2622b;

        /* renamed from: c  reason: collision with root package name */
        float f2623c;

        /* renamed from: d  reason: collision with root package name */
        float f2624d;

        /* renamed from: e  reason: collision with root package name */
        long f2625e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        long f2626f;

        /* renamed from: g  reason: collision with root package name */
        public int f2627g;

        /* renamed from: h  reason: collision with root package name */
        public int f2628h;

        /* renamed from: i  reason: collision with root package name */
        long f2629i = -1;

        /* renamed from: j  reason: collision with root package name */
        float f2630j;

        /* renamed from: k  reason: collision with root package name */
        int f2631k;

        static {
            Covode.recordClassIndex(898);
        }

        C0037a() {
        }

        public final int b() {
            float f2 = this.f2623c;
            return (int) (f2 / Math.abs(f2));
        }

        public final int c() {
            float f2 = this.f2624d;
            return (int) (f2 / Math.abs(f2));
        }

        public final void a() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2631k = a.a((int) (currentAnimationTimeMillis - this.f2625e), this.f2622b);
            this.f2630j = a(currentAnimationTimeMillis);
            this.f2629i = currentAnimationTimeMillis;
        }

        /* access modifiers changed from: package-private */
        public final float a(long j2) {
            long j3 = this.f2625e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f2629i;
            if (j4 < 0 || j2 < j4) {
                return a.a(((float) (j2 - j3)) / ((float) this.f2621a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f2630j;
            return (1.0f - f2) + (f2 * a.a(((float) (j2 - j4)) / ((float) this.f2631k), 0.0f, 1.0f));
        }
    }

    static {
        Covode.recordClassIndex(897);
    }

    private void b() {
        if (this.f2610c) {
            this.f2612e = false;
        } else {
            this.f2608a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        static {
            Covode.recordClassIndex(899);
        }

        public final void run() {
            if (a.this.f2612e) {
                if (a.this.f2610c) {
                    a.this.f2610c = false;
                    C0037a aVar = a.this.f2608a;
                    aVar.f2625e = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f2629i = -1;
                    aVar.f2626f = aVar.f2625e;
                    aVar.f2630j = 0.5f;
                    aVar.f2627g = 0;
                    aVar.f2628h = 0;
                }
                C0037a aVar2 = a.this.f2608a;
                if ((aVar2.f2629i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar2.f2629i + ((long) aVar2.f2631k)) && a.this.a()) {
                    if (a.this.f2611d) {
                        a.this.f2611d = false;
                        a aVar3 = a.this;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        aVar3.f2609b.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f2626f != 0) {
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = aVar2.a(currentAnimationTimeMillis);
                        aVar2.f2626f = currentAnimationTimeMillis;
                        float f2 = ((float) (currentAnimationTimeMillis - aVar2.f2626f)) * ((-4.0f * a2 * a2) + (a2 * 4.0f));
                        aVar2.f2627g = (int) (aVar2.f2623c * f2);
                        aVar2.f2628h = (int) (f2 * aVar2.f2624d);
                        a.this.a(aVar2.f2628h);
                        v.a(a.this.f2609b, this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                a.this.f2612e = false;
            }
        }

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        C0037a aVar = this.f2608a;
        int c2 = aVar.c();
        aVar.b();
        if (c2 == 0 || !b(c2)) {
            return false;
        }
        return true;
    }

    public final a a(boolean z) {
        if (this.f2613f && !z) {
            b();
        }
        this.f2613f = z;
        return this;
    }

    public a(View view) {
        C0037a aVar = new C0037a();
        this.f2608a = aVar;
        this.f2609b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i2 = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i3 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float[] fArr = this.p;
        float f2 = ((float) i2) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.o;
        float f3 = ((float) i3) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f2619l = 1;
        float[] fArr3 = this.f2618k;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f2617j;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.n;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f2620m = r;
        aVar.f2621a = 500;
        aVar.f2622b = 500;
    }

    private float a(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f2619l;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (!this.f2612e || i2 != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 != 3) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    private float a(float f2, float f3, float f4, float f5) {
        float interpolation;
        float a2 = a(f2 * f3, 0.0f, f4);
        float a3 = a(f3 - f5, a2) - a(f5, a2);
        if (a3 < 0.0f) {
            interpolation = -this.f2615h.getInterpolation(-a3);
        } else if (a3 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f2615h.getInterpolation(a3);
        }
        return a(interpolation, -1.0f, 1.0f);
    }

    private float a(int i2, float f2, float f3, float f4) {
        float a2 = a(this.f2617j[i2], f3, this.f2618k[i2], f2);
        if (a2 == 0.0f) {
            return 0.0f;
        }
        float f5 = this.n[i2];
        float f6 = this.o[i2];
        float f7 = this.p[i2];
        float f8 = f5 * f4;
        if (a2 > 0.0f) {
            return a(a2 * f8, f6, f7);
        }
        return -a((-a2) * f8, f6, f7);
    }
}
