package com.bytedance.lottie.f;

import android.view.Choreographer;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g;

public final class d extends a implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public float f40686a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public long f40687b;

    /* renamed from: c  reason: collision with root package name */
    public float f40688c;

    /* renamed from: d  reason: collision with root package name */
    public float f40689d = -2.14748365E9f;

    /* renamed from: e  reason: collision with root package name */
    public float f40690e = 2.14748365E9f;

    /* renamed from: f  reason: collision with root package name */
    public g f40691f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f40692g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f40693h;

    /* renamed from: i  reason: collision with root package name */
    private int f40694i;

    static {
        Covode.recordClassIndex(24979);
    }

    public final boolean isRunning() {
        return this.f40692g;
    }

    private void l() {
        this.f40686a = -this.f40686a;
    }

    public final void cancel() {
        b();
        c(true);
    }

    public final void g() {
        c(true);
    }

    public final void e() {
        this.f40691f = null;
        this.f40689d = -2.14748365E9f;
        this.f40690e = 2.14748365E9f;
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    public final long getDuration() {
        g gVar = this.f40691f;
        if (gVar == null) {
            return 0;
        }
        return (long) gVar.a();
    }

    public final boolean i() {
        if (this.f40686a < 0.0f) {
            return true;
        }
        return false;
    }

    private void m() {
        if (isRunning()) {
            c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final float d() {
        g gVar = this.f40691f;
        if (gVar == null) {
            return 0.0f;
        }
        return (this.f40688c - gVar.f40713i) / (this.f40691f.f40714j - this.f40691f.f40713i);
    }

    public final float j() {
        g gVar = this.f40691f;
        if (gVar == null) {
            return 0.0f;
        }
        float f2 = this.f40689d;
        if (f2 == -2.14748365E9f) {
            return gVar.f40713i;
        }
        return f2;
    }

    public final float k() {
        g gVar = this.f40691f;
        if (gVar == null) {
            return 0.0f;
        }
        float f2 = this.f40690e;
        if (f2 == 2.14748365E9f) {
            return gVar.f40714j;
        }
        return f2;
    }

    public final void f() {
        float j2;
        this.f40692g = true;
        a(i());
        if (i()) {
            j2 = k();
        } else {
            j2 = j();
        }
        a((int) j2);
        this.f40687b = System.nanoTime();
        this.f40694i = 0;
        m();
    }

    public final float getAnimatedFraction() {
        float j2;
        float k2;
        float j3;
        if (this.f40691f == null) {
            return 0.0f;
        }
        if (i()) {
            j2 = k() - this.f40688c;
            k2 = k();
            j3 = j();
        } else {
            j2 = this.f40688c - j();
            k2 = k();
            j3 = j();
        }
        return j2 / (k2 - j3);
    }

    public final void h() {
        this.f40692g = true;
        m();
        this.f40687b = System.nanoTime();
        if (i() && this.f40688c == j()) {
            this.f40688c = k();
        } else if (!i() && this.f40688c == k()) {
            this.f40688c = j();
        }
    }

    public final void b(int i2) {
        a(i2, (int) this.f40690e);
    }

    public final void c(int i2) {
        a((int) this.f40689d, i2);
    }

    public final void c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f40692g = false;
        }
    }

    public final void a(int i2) {
        float f2 = (float) i2;
        if (this.f40688c != f2) {
            this.f40688c = f.a(f2, j(), k());
            this.f40687b = System.nanoTime();
            c();
        }
    }

    public final void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.f40693h) {
            this.f40693h = false;
            l();
        }
    }

    public final void doFrame(long j2) {
        float abs;
        boolean z;
        float j3;
        m();
        if (this.f40691f != null && isRunning()) {
            long nanoTime = System.nanoTime();
            long j4 = nanoTime - this.f40687b;
            g gVar = this.f40691f;
            if (gVar == null) {
                abs = Float.MAX_VALUE;
            } else {
                abs = (1.0E9f / gVar.f40715k) / Math.abs(this.f40686a);
            }
            float f2 = ((float) j4) / abs;
            float f3 = this.f40688c;
            if (i()) {
                f2 = -f2;
            }
            float f4 = f3 + f2;
            this.f40688c = f4;
            float j5 = j();
            float k2 = k();
            if (f4 < j5 || f4 > k2) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = !z;
            this.f40688c = f.a(this.f40688c, j(), k());
            this.f40687b = nanoTime;
            c();
            if (z2) {
                if (getRepeatCount() == -1 || this.f40694i < getRepeatCount()) {
                    a();
                    this.f40694i++;
                    if (getRepeatMode() == 2) {
                        this.f40693h = !this.f40693h;
                        l();
                    } else {
                        if (i()) {
                            j3 = k();
                        } else {
                            j3 = j();
                        }
                        this.f40688c = j3;
                    }
                    this.f40687b = nanoTime;
                } else {
                    this.f40688c = k();
                    c(true);
                    b(i());
                }
            }
            if (this.f40691f != null) {
                float f5 = this.f40688c;
                float f6 = this.f40689d;
                if (f5 < f6 || f5 > this.f40690e) {
                    a.a("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(f6), Float.valueOf(this.f40690e), Float.valueOf(this.f40688c)});
                }
            }
        }
    }

    public final void a(int i2, int i3) {
        float f2;
        float f3;
        g gVar = this.f40691f;
        if (gVar == null) {
            f2 = -3.4028235E38f;
        } else {
            f2 = gVar.f40713i;
        }
        g gVar2 = this.f40691f;
        if (gVar2 == null) {
            f3 = Float.MAX_VALUE;
        } else {
            f3 = gVar2.f40714j;
        }
        float f4 = (float) i2;
        this.f40689d = f.a(f4, f2, f3);
        float f5 = (float) i3;
        this.f40690e = f.a(f5, f2, f3);
        a((int) f.a(this.f40688c, f4, f5));
    }
}
