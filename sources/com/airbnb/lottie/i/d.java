package com.airbnb.lottie.i;

import android.view.Choreographer;
import com.a;
import com.airbnb.lottie.e;
import com.airbnb.lottie.g.b;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.j;
import com.bytedance.covode.number.Covode;

public final class d extends a implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public float f5682a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f5683b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f5684c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5685d;

    /* renamed from: e  reason: collision with root package name */
    private long f5686e;

    /* renamed from: f  reason: collision with root package name */
    private int f5687f;

    /* renamed from: g  reason: collision with root package name */
    private float f5688g = -2.14748365E9f;

    /* renamed from: h  reason: collision with root package name */
    private float f5689h = 2.14748365E9f;

    /* renamed from: i  reason: collision with root package name */
    private e f5690i;

    /* renamed from: j  reason: collision with root package name */
    private c f5691j;

    static {
        Covode.recordClassIndex(2385);
    }

    public final boolean isRunning() {
        return this.f5684c;
    }

    private void l() {
        this.f5682a = -this.f5682a;
    }

    public final void cancel() {
        b();
        c(true);
    }

    public final void g() {
        c(true);
    }

    public final void e() {
        this.f5690i = null;
        this.f5688g = -2.14748365E9f;
        this.f5689h = 2.14748365E9f;
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    public final long getDuration() {
        e eVar = this.f5690i;
        if (eVar == null) {
            return 0;
        }
        return (long) eVar.a();
    }

    public final boolean i() {
        if (this.f5682a < 0.0f) {
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
        e eVar = this.f5690i;
        if (eVar == null) {
            return 0.0f;
        }
        return (this.f5683b - eVar.f5338i) / (this.f5690i.f5339j - this.f5690i.f5338i);
    }

    public final float j() {
        e eVar = this.f5690i;
        if (eVar == null) {
            return 0.0f;
        }
        float f2 = this.f5688g;
        if (f2 == -2.14748365E9f) {
            return eVar.f5338i;
        }
        return f2;
    }

    public final float k() {
        e eVar = this.f5690i;
        if (eVar == null) {
            return 0.0f;
        }
        float f2 = this.f5689h;
        if (f2 == 2.14748365E9f) {
            return eVar.f5339j;
        }
        return f2;
    }

    public final void f() {
        float j2;
        this.f5684c = true;
        a(i());
        if (i()) {
            j2 = k();
        } else {
            j2 = j();
        }
        a((int) j2);
        if (d.a.f5625a) {
            this.f5686e = 0;
        } else {
            this.f5686e = System.nanoTime();
        }
        this.f5687f = 0;
        m();
    }

    public final float getAnimatedFraction() {
        float j2;
        float k2;
        float j3;
        if (this.f5690i == null) {
            return 0.0f;
        }
        if (i()) {
            j2 = k() - this.f5683b;
            k2 = k();
            j3 = j();
        } else {
            j2 = this.f5683b - j();
            k2 = k();
            j3 = j();
        }
        return j2 / (k2 - j3);
    }

    public final void h() {
        this.f5684c = true;
        m();
        if (d.a.f5625a) {
            this.f5686e = 0;
        } else {
            this.f5686e = System.nanoTime();
        }
        if (i() && this.f5683b == j()) {
            this.f5683b = k();
        } else if (!i() && this.f5683b == k()) {
            this.f5683b = j();
        }
    }

    public final void b(int i2) {
        a(i2, (int) this.f5689h);
    }

    public final void c(int i2) {
        a((int) this.f5688g, i2);
    }

    public final void c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f5684c = false;
        }
    }

    public final void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.f5685d) {
            this.f5685d = false;
            l();
        }
    }

    public final void a(int i2) {
        float f2 = (float) i2;
        if (this.f5683b != f2) {
            this.f5683b = f.a(f2, j(), k());
            if (d.a.f5625a) {
                this.f5686e = 0;
            } else {
                this.f5686e = System.nanoTime();
            }
            c();
        }
    }

    public final void a(e eVar) {
        boolean z;
        if (this.f5690i == null) {
            z = true;
        } else {
            z = false;
        }
        this.f5690i = eVar;
        if (z) {
            a((int) Math.max(this.f5688g, eVar.f5338i), (int) Math.min(this.f5689h, eVar.f5339j));
        } else {
            a((int) eVar.f5338i, (int) eVar.f5339j);
        }
        a((int) this.f5683b);
        if (!d.a.f5625a) {
            this.f5686e = System.nanoTime();
        }
    }

    public final void doFrame(long j2) {
        long j3;
        long j4;
        float abs;
        boolean z;
        float j5;
        float k2;
        m();
        if (this.f5690i != null && isRunning()) {
            if (d.a.f5625a) {
                long j6 = this.f5686e;
                if (j6 == 0) {
                    j4 = 0;
                } else {
                    j4 = j2 - j6;
                }
                if (d.a.f5627c) {
                    if (this.f5691j == null) {
                        this.f5691j = new c();
                    }
                    c cVar = this.f5691j;
                    if (cVar != null) {
                        float f2 = this.f5690i.f5340k;
                        if (cVar.f5617a != f2) {
                            cVar.f5617a = f2;
                            if (f2 >= 24.0f) {
                                if (!d.e.f5649a) {
                                    cVar.f5619c = 16000000;
                                }
                            } else if (d.e.f5649a) {
                                cVar.f5619c = 48000000;
                            }
                            cVar.f5619c = 32000000;
                        }
                        if (cVar.f5618b <= 0 || j2 - cVar.f5618b >= cVar.f5619c) {
                            cVar.f5618b = j2;
                        } else {
                            return;
                        }
                    }
                }
                j3 = j2;
            } else {
                j3 = System.nanoTime();
                j4 = j3 - this.f5686e;
            }
            e eVar = this.f5690i;
            if (eVar == null) {
                abs = Float.MAX_VALUE;
            } else {
                abs = (1.0E9f / eVar.f5340k) / Math.abs(this.f5682a);
            }
            float f3 = ((float) j4) / abs;
            float f4 = this.f5683b;
            if (i()) {
                f3 = -f3;
            }
            float f5 = f4 + f3;
            this.f5683b = f5;
            float j7 = j();
            float k3 = k();
            if (f5 < j7 || f5 > k3) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = !z;
            this.f5683b = f.a(this.f5683b, j(), k());
            this.f5686e = j3;
            if (b.f5616c) {
                b.f5615b = j2;
            }
            b.b(null);
            c();
            if (z2) {
                if (getRepeatCount() == -1 || this.f5687f < getRepeatCount()) {
                    a();
                    this.f5687f++;
                    if (getRepeatMode() == 2) {
                        this.f5685d = !this.f5685d;
                        l();
                    } else {
                        if (i()) {
                            j5 = k();
                        } else {
                            j5 = j();
                        }
                        this.f5683b = j5;
                    }
                    this.f5686e = j3;
                } else {
                    if (d.a.f5625a) {
                        if (this.f5682a < 0.0f) {
                            k2 = j();
                        } else {
                            k2 = k();
                        }
                        this.f5683b = k2;
                    } else {
                        this.f5683b = k();
                    }
                    c(true);
                    b(i());
                }
            }
            if (this.f5690i != null) {
                float f6 = this.f5683b;
                if (f6 < this.f5688g || f6 > this.f5689h) {
                    j.a.a().a(new IllegalStateException(a.a("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f5688g), Float.valueOf(this.f5689h), Float.valueOf(this.f5683b)})));
                }
            }
        }
    }

    public final void a(int i2, int i3) {
        float f2;
        float f3;
        e eVar = this.f5690i;
        if (eVar == null) {
            f2 = -3.4028235E38f;
        } else {
            f2 = eVar.f5338i;
        }
        e eVar2 = this.f5690i;
        if (eVar2 == null) {
            f3 = Float.MAX_VALUE;
        } else {
            f3 = eVar2.f5339j;
        }
        float f4 = (float) i2;
        this.f5688g = f.a(f4, f2, f3);
        float f5 = (float) i3;
        this.f5689h = f.a(f5, f2, f3);
        a((int) f.a(this.f5683b, f4, f5));
    }
}
