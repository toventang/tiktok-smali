package h.j;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class i {
    static {
        Covode.recordClassIndex(105276);
    }

    public static final c<Double> a(double d2, double d3) {
        return new a(d2, d3);
    }

    public static final c<Float> a(float f2, float f3) {
        return new b(f2, f3);
    }

    public static final void a(boolean z, Number number) {
        l.d(number, "");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }
}
