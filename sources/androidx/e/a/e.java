package androidx.e.a;

import androidx.e.a.b;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    double f2732a;

    /* renamed from: b  reason: collision with root package name */
    double f2733b;

    /* renamed from: c  reason: collision with root package name */
    double f2734c;

    /* renamed from: d  reason: collision with root package name */
    double f2735d;

    /* renamed from: e  reason: collision with root package name */
    double f2736e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2737f;

    /* renamed from: g  reason: collision with root package name */
    private double f2738g;

    /* renamed from: h  reason: collision with root package name */
    private double f2739h;

    /* renamed from: i  reason: collision with root package name */
    private double f2740i;

    /* renamed from: j  reason: collision with root package name */
    private final b.a f2741j;

    static {
        Covode.recordClassIndex(962);
    }

    public e() {
        this.f2732a = Math.sqrt(1500.0d);
        this.f2733b = 0.5d;
        this.f2737f = false;
        this.f2736e = Double.MAX_VALUE;
        this.f2741j = new b.a();
    }

    private void a() {
        if (!this.f2737f) {
            if (this.f2736e != Double.MAX_VALUE) {
                double d2 = this.f2733b;
                if (d2 > 1.0d) {
                    double d3 = this.f2732a;
                    this.f2738g = ((-d2) * d3) + (d3 * Math.sqrt((d2 * d2) - 1.0d));
                    double d4 = this.f2733b;
                    double d5 = this.f2732a;
                    this.f2739h = ((-d4) * d5) - (d5 * Math.sqrt((d4 * d4) - 1.0d));
                } else if (d2 >= 0.0d && d2 < 1.0d) {
                    this.f2740i = this.f2732a * Math.sqrt(1.0d - (d2 * d2));
                }
                this.f2737f = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    public final e c(float f2) {
        this.f2736e = (double) f2;
        return this;
    }

    public final e a(float f2) {
        if (f2 > 0.0f) {
            this.f2732a = Math.sqrt((double) f2);
            this.f2737f = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final e b(float f2) {
        if (f2 >= 0.0f) {
            this.f2733b = (double) f2;
            this.f2737f = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public e(byte b2) {
        this.f2732a = Math.sqrt(1500.0d);
        this.f2733b = 0.5d;
        this.f2737f = false;
        this.f2736e = Double.MAX_VALUE;
        this.f2741j = new b.a();
        this.f2736e = 0.0d;
    }

    /* access modifiers changed from: package-private */
    public final b.a a(double d2, double d3, long j2) {
        double pow;
        double cos;
        a();
        double d4 = (double) j2;
        Double.isNaN(d4);
        double d5 = d4 / 1000.0d;
        double d6 = d2 - this.f2736e;
        double d7 = this.f2733b;
        if (d7 > 1.0d) {
            double d8 = this.f2739h;
            double d9 = this.f2738g;
            double d10 = d6 - (((d8 * d6) - d3) / (d8 - d9));
            double d11 = ((d6 * d8) - d3) / (d8 - d9);
            pow = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f2738g * d5) * d11);
            double d12 = this.f2739h;
            double pow2 = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f2738g;
            cos = pow2 + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f2732a;
            double d15 = d3 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            pow = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double d17 = this.f2732a;
            cos = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (d16 * Math.pow(2.718281828459045d, (-this.f2732a) * d5) * (-d17));
        } else {
            double d18 = this.f2732a;
            double d19 = (1.0d / this.f2740i) * ((d7 * d18 * d6) + d3);
            pow = Math.pow(2.718281828459045d, (-d7) * d18 * d5) * ((Math.cos(this.f2740i * d5) * d6) + (Math.sin(this.f2740i * d5) * d19));
            double d20 = this.f2732a;
            double d21 = this.f2733b;
            double d22 = (-d20) * pow * d21;
            double pow3 = Math.pow(2.718281828459045d, (-d21) * d20 * d5);
            double d23 = this.f2740i;
            double sin = (-d23) * d6 * Math.sin(d23 * d5);
            double d24 = this.f2740i;
            cos = d22 + (pow3 * (sin + (d19 * d24 * Math.cos(d24 * d5))));
        }
        this.f2741j.f2729a = (float) (pow + this.f2736e);
        this.f2741j.f2730b = (float) cos;
        return this.f2741j;
    }
}
