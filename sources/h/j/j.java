package h.j;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.i.c;
import h.j.e;
import java.util.NoSuchElementException;

public class j extends i {
    static {
        Covode.recordClassIndex(105277);
    }

    public static final long a(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    public static final float b(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static final int b(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    public static final long b(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static final float c(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static final int c(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    public static final g a(int i2, int i3) {
        if (i3 <= Integer.MIN_VALUE) {
            return g.f158754e;
        }
        return new g(i2, i3 - 1);
    }

    public static final e a(e eVar, int i2) {
        boolean z;
        l.d(eVar, "");
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        h.a(z, Integer.valueOf(i2));
        int i3 = eVar.f158747a;
        int i4 = eVar.f158748b;
        if (eVar.f158749c <= 0) {
            i2 = -i2;
        }
        return e.a.a(i3, i4, i2);
    }

    public static final int a(g gVar, c cVar) {
        l.d(gVar, "");
        l.d(cVar, "");
        try {
            l.d(cVar, "");
            l.d(gVar, "");
            if (gVar.a()) {
                throw new IllegalArgumentException("Cannot get random in empty range: ".concat(String.valueOf(gVar)));
            } else if (gVar.f158748b < Integer.MAX_VALUE) {
                return cVar.nextInt(gVar.f158747a, gVar.f158748b + 1);
            } else {
                if (gVar.f158747a > Integer.MIN_VALUE) {
                    return cVar.nextInt(gVar.f158747a - 1, gVar.f158748b) + 1;
                }
                return cVar.nextInt();
            }
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public static final boolean a(d<Double> dVar, float f2) {
        l.d(dVar, "");
        return dVar.a(Double.valueOf((double) f2));
    }

    public static final int a(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
        } else if (i2 < i3) {
            return i3;
        } else {
            if (i2 > i4) {
                return i4;
            }
            return i2;
        }
    }
}
